import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            deque.addLast(value);
            set.add(value);

            if (deque.size() == m) {

                maxUnique = Math.max(maxUnique, set.size());

                int first = deque.removeFirst();

                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }

        System.out.println(maxUnique);

        sc.close();
    }
}
