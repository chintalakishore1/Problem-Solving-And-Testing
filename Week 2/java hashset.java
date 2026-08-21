import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
import java.util.*;

class Pair {
    String first;
    String second;

    Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair other = (Pair) obj;

        return first.equals(other.first)
            && second.equals(other.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Pair> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String first = sc.next();
            String second = sc.next();

            set.add(new Pair(first, second));

            System.out.println(set.size());
        }

        sc.close();
    }
}
    }
}
