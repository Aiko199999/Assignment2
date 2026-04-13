public class ArrayList {
    public int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candid = null;

        for (int num : nums) {
            if (count == 0) {
                candid = num;
            }

            if (num == candid) {
                count += 1;
            } else {
                count -= 1;
            }

        }
        return candid;
    }
}