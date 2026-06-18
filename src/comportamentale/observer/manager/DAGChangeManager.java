package comportamentale.observer.manager;

import comportamentale.observer.observer.Observer;
import comportamentale.observer.subject.Subject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DAGChangeManager implements ChangeManager {

    private final List<Subject> subjects;
    private final List<Observer> observers;
    private final List<Subject> dependencyParents;
    private final List<Subject> dependencyChildren;

    public DAGChangeManager() {
        this.subjects = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.dependencyParents = new ArrayList<>();
        this.dependencyChildren = new ArrayList<>();
    }

    @Override
    public void register(Subject subject, Observer observer) {
        subjects.add(subject);
        observers.add(observer);
    }

    @Override
    public void unregister(Subject subject, Observer observer) {
        subjects.remove(subject);
        observers.remove(observer);
    }

    @Override
    public void notifyObserversByChangeManager(Subject changedSubject) {
        List<Subject> orderedSubjects = getTopologicalOrder(changedSubject);
        for (Subject subject : orderedSubjects) {
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i) == subject) {
                    observers.get(i).update(subject);
                }
            }
        }
    }

    public void addDependency(Subject parent, Subject dependent) {
        dependencyParents.add(parent);
        dependencyChildren.add(dependent);
    }

    private List<Subject> getTopologicalOrder(Subject changedSubject) {
        List<Subject> impacted = collectImpactedNodes(changedSubject);
        int[] indegree = new int[impacted.size()];

        for (int i = 0; i < dependencyParents.size(); i++) {
            Subject parent = dependencyParents.get(i);
            Subject child = dependencyChildren.get(i);
            int parentIndex = indexOfSubject(impacted, parent);
            int childIndex = indexOfSubject(impacted, child);
            if (parentIndex != -1 && childIndex != -1) {
                indegree[childIndex]++;
            }
        }

        Queue<Subject> queue = new ArrayDeque<>();
        for (int i = 0; i < impacted.size(); i++) {
            if (indegree[i] == 0) {
                queue.add(impacted.get(i));
            }
        }

        List<Subject> ordered = new ArrayList<>();
        while (!queue.isEmpty()) {
            Subject current = queue.poll();
            ordered.add(current);

            for (int i = 0; i < dependencyParents.size(); i++) {
                if (dependencyParents.get(i) == current) {
                    Subject child = dependencyChildren.get(i);
                    int childIndex = indexOfSubject(impacted, child);
                    if (childIndex != -1) {
                        indegree[childIndex]--;
                        if (indegree[childIndex] == 0) {
                            queue.add(child);
                        }
                    }
                }
            }
        }

        if (ordered.size() != impacted.size()) {
            throw new IllegalStateException("Cycle detected in DAGChangeManager dependencies");
        }

        return ordered;
    }

    private List<Subject> collectImpactedNodes(Subject root) {
        List<Subject> visited = new ArrayList<>();
        Queue<Subject> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Subject current = queue.poll();
            if (indexOfSubject(visited, current) == -1) {
                visited.add(current);
                for (int i = 0; i < dependencyParents.size(); i++) {
                    if (dependencyParents.get(i) == current) {
                        queue.add(dependencyChildren.get(i));
                    }
                }
            }
        }
        return visited;
    }

    private int indexOfSubject(List<Subject> list, Subject target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

}
