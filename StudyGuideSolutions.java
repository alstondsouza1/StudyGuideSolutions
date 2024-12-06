import java.util.*;

public class StudyGuideSolutions {

    // find the difference between the largest and smallest integer in an array
    public static int diffLargestSmallestInArray(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    // find the difference between the largest and smallest integer in an ArrayList
    public static int diffLargestSmallestInArrayList(ArrayList<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        return max - min;
    }

    // find the difference between the largest and smallest integer in a HashSet
    public static int diffLargestSmallestInHashSet(HashSet<Integer> set) {
        int min = Collections.min(set);
        int max = Collections.max(set);
        return max - min;
    }

    // find the difference between the largest and smallest integer in the values of a HashMap
    public static int diffLargestSmallestInHashMap(HashMap<String, Integer> map) {
        Collection<Integer> values = map.values();
        int min = Collections.min(values);
        int max = Collections.max(values);
        return max - min;
    }

    // find the longest word starting with a specific letter in an array
    public static String longestWordInArray(String[] arr, char letter) {
        String longest = "";
        for (String word : arr) {
            if (word.charAt(0) == letter && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // find the longest word starting with a specific letter in an ArrayList
    public static String longestWordInArrayList(ArrayList<String> list, char letter) {
        String longest = "";
        for (String word : list) {
            if (word.charAt(0) == letter && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // count words longer than n characters and shorter than m characters in an array
    public static int countWordsInArray(String[] arr, int n, int m) {
        int count = 0;
        for (String word : arr) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }

    // count words longer than n characters and shorter than m characters in a HashSet
    public static int countWordsInHashSet(HashSet<String> set, int n, int m) {
        int count = 0;
        for (String word : set) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }
}
