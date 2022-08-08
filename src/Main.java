import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String input = scanner.nextLine();
        String[] arr = input.toLowerCase().split("");

        for (int i = 0; i < arr.length; i++) {
            if (treeMap.containsKey(arr[i])) {
                int value = treeMap.get(arr[i]);
                treeMap.remove(arr[i]);
                treeMap.put(arr[i], value + 1);

            } else {
                treeMap.put(arr[i], 1);
            }
        }
        System.out.println("so lan xuat hien la " + treeMap);

    }
}