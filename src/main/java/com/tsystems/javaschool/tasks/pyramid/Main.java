package com.tsystems.javaschool.tasks.pyramid;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PyramidBuilder pb = new PyramidBuilder();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        pb.buildPyramid(input);
    }
}
