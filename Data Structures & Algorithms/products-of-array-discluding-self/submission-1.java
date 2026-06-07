class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];

        res[0] = 1;
        for (int i = 1; i < length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        System.out.print(Arrays.toString(res));
        System.out.println();

        int[] res2 = new int[length];
        res2[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            res2[i] = res2[i + 1] * nums[i + 1];
        }
        System.out.print(Arrays.toString(res));
        

        int[] finalArr = new int[length];
        for (int i = 0; i < length; i++) {
            finalArr[i] = res[i] * res2[i];
        }

        return finalArr;

    }
}
