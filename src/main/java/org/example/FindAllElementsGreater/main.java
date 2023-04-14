package org.example.FindAllElementsGreater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class main {
    public static void main(String[] args) {
        int[] nums = {10,4,6,3,5};

        System.out.println(findNums(nums));

    }
    public static ArrayList<Integer> findNums (int[] nums){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while(!stack.isEmpty() && nums[i] >= stack.peek()){
                stack.pop();
            }
            stack.push(nums[i]);

        }
        return  new ArrayList<Integer>(stack);
    }

    @Test
    public void GreaterThanRight_Test() {
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(10,6,5)), findNums(new int[]{10,4,6,3,5}));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(11,6,5,3,2,1)), findNums(new int[]{11,6,3,5,3,2,1}));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(9)), findNums(new int[]{9}));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(10,7,5,4)), findNums(new int[]{10,3,2,1,6,7,5,4}));
    }

    public static Stream<Arguments> inputs() {
        return Stream.of(
                arguments(new ArrayList<>(Arrays.asList(10,6,5)), new int[]{10,4,6,3,5}),
                arguments(new ArrayList<>(Arrays.asList(11,6,5,3,2,1)), new int[]{11,6,3,5,3,2,1}),
                arguments(new ArrayList<>(Arrays.asList(9)), new int[]{9}),
                arguments(new ArrayList<>(Arrays.asList(10,7,5,4)), new int[]{10,3,2,1,6,7,5,4})

        );

    }

    @ParameterizedTest
    @MethodSource(value = "inputs")
    public void GreaterThanRightTest(List<Integer> expected, int [] input) {
        Assertions.assertEquals(expected, findNums(input));
    }


}
