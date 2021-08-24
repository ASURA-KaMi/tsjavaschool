package com.tsystems.javaschool.tasks.subsequence;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        boolean isSequence = true;
        if (x == null || y == null)
            throw new IllegalArgumentException();
        int searchPos = 0;
        for (int i = 0; i < x.size(); i++){
            if (!isSequence) break;
            isSequence = false;
            for (int j = searchPos; j < y.size(); j++){
                if (x.get(i).equals(y.get(j))){
                    isSequence = true;
                    searchPos = j + 1;
                    break;
                }
            }
        }
        return isSequence;
    }
}
