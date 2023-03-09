package GFG;

import java.util.*;

class Node {
    char data;
    Node next;

    Node(char x) {
        data = x;
        next = null;
    }
}

public class findAnagramsInLinkedList {

    public boolean isAna(int A[], int B[]) {
        for (int i = 0; i < 26; i++) {
            if (A[i] != B[i])
                return false;
        }
        return true;
    }

    public ArrayList<Node> findAnagrams(Node head, String s) {
        // code here
        int len = s.length();
        int freq[] = new int[26];
        char S[] = s.toCharArray();
        for (char ch : S) {
            freq[ch - 'a']++;
        }
        int freq1[] = new int[26];
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;
        for (int i = 0; i < len && (ptr2 != null); i++) {
            freq1[ptr2.data - 'a']++;
            prev = ptr2;
            ptr2 = ptr2.next;
        }
        ptr2 = prev;

        ArrayList<Node> res = new ArrayList<>();

        while (ptr2.next != null) {
            boolean ok = isAna(freq1, freq);
            if (ok) {
                Node prev1 = null;

                res.add(ptr1);
                Node temp1 = ptr2;
                ptr2 = (ptr2).next;
                if (temp1 != null)
                    temp1.next = null;
                ptr1 = ptr2;
                for (int i = 0; i < 26; i++)
                    freq1[i] = 0;
                for (int i = 0; i < len && (ptr2 != null); i++) {
                    freq1[(ptr2).data - 'a']++;
                    prev1 = (ptr2);
                    if (ptr2 != null)
                        ptr2 = (ptr2).next;
                }

                (ptr2) = prev1;

            } else {
                freq1[ptr1.data - 'a']--;
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
                freq1[ptr2.data - 'a']++;
            }
        }

        boolean ok = isAna(freq1, freq);
        if (ok) {
            res.add(ptr1);
        }

        return res;

    }
}
