package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder rsl = new StringBuilder();
        int initialSize = evenElements.size();
        for (int i = 0; i < initialSize; i++) {
            if (i % 2 == 0) {
                rsl.append(evenElements.removeFirst());
            } else {
                evenElements.removeFirst();
            }
        }
        return rsl.toString();
    }

    private String getDescendingElements() {
        StringBuilder rsl = new StringBuilder();
        for (int i = descendingElements.size() - 1; i >= 0; i--) {
            rsl.append(descendingElements.removeLast());
        }
        return rsl.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
