package Problems;

import java.util.*;

public class GenerateSubset {
    public static void Generate(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        Generate(nums, index + 1, current, result);
        current.add(nums[index]);
        Generate(nums, index + 1, current, result);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        Generate(nums, 0, new ArrayList<>(), result);

        for (List<Integer> cha: result) {
            System.out.println(cha);
        }

    }
}
