package com.tsystems.javaschool.tasks.pyramid;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minimum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        long count = 0; int columns = 1; int rows = 1;
        int size = inputNumbers.size();

        while (count < size) {
            count += rows;
            ++ rows;
            columns += 2;
        }
        rows -= 1;
        columns -= 2;


        if (size != count || inputNumbers.contains(null))
            throw new CannotBuildPyramidException();


        Collections.sort(inputNumbers);
        Queue<Integer> queue = new LinkedList<>(inputNumbers);
        int[][] matrix = new int[rows][columns];
        int center = columns / 2;
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j)
                matrix[i][j] = 0;
        }

        for (int i = 0; i < rows; i++) {
            int pos = center;
            for (int j = 0; j <= i; j++) {
                matrix[i][pos] = queue.remove();
                pos += 2;
            }
            center --;
        }

        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }


}
