package leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


/**
 /**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 用哈希表（字典）存放数组值以及对应的下标。
 * 遍历数组，当发现 target - nums[i] 在哈希表中，说明找到了目标值。
 */
class Test0001 {

    @Test
    void test() {

        int target = 16;
        int[] array = new int[] {2,7,11,15,1};

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            int num = target - array[i];
            if (map.containsKey(num)){
                int[] result = new int[]{map.get(num),i};
                System.out.println(result[0] + "-" + result[1]);
                break;
            }
            map.put(array[i],i);
        }
        System.out.println(map);
    }

}
