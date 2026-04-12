import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList task1 = new ArrayList();
        int[] nums1 = {3, 2, 3};
        System.out.println("1. ArrayList (Majority): " + task1.findMajorityElement(nums1));


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        LinkedList task2 = new LinkedList();
        System.out.println("2. LinkedList (Middle): " + task2.findMiddle(head).val);


        Stack<Integer> s = new Stack<>();
        s.push(5); s.push(1); s.push(9); s.push(3);
        System.out.println("3. Stack (Sorted Top-to-Bottom): " + MyStack.sort(s));


        MyQueueStack task4 = new MyQueueStack();
        task4.push(100);
        task4.push(200);
        System.out.println("4. Queue (Custom Stack Pop): " + task4.pop());


        HashTable task5 = new HashTable();
        System.out.println("5. HashTable (Isomorphic 'egg' & 'add'): " + task5.isIsomorphic("egg", "add"));


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        BST task6 = new BST();
        System.out.println("6. BST (In-order List): " + task6.inorderIterative(root));


        Heap task7 = new Heap();
        int[] nums7 = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.print("7. Heap (Top " + k + " Frequent): ");
        System.out.println(Arrays.toString(task7.topKFrequent(nums7, k)));
    }
}