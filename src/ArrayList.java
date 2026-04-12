public class ArrayList {
    public int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candid = null;

        for (int num : nums) {
            if (count == 0) {
                candid = num;
            }
            count += (num == candid) ? 1 : -1;
        }
        return candid;
    }
}