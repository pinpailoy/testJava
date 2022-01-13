
import java.util.*;

public class searchText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter palindrome || reverseList : ");
        String text = sc.next();
        switch (text) {
            case "palindrome":
                selectPalindrome();
                break;
            case "reverseList":
                selectReverseList();
                break;
            default:
                System.out.println("Thanks !");

        }

    }

    public static void selectPalindrome() {
        EasyPalindrome easy = new EasyPalindrome();
        System.out.println("test palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String sc2 = sc.next();
        if (easy.check(sc2)) {
            System.out.println(sc2 + " is a palinDrome ");
        } else {
            System.out.println(sc2 + " is NOT a palinDrome");
        }
    }

    public static void selectReverseList() {
        ReverseList reverseList = new ReverseList();
        System.out.println("Plese insert total number of list:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int total = Integer.parseInt(sc.next());
        List<String> test = new ArrayList<String>();
        for (int i = 0; i < total; i++) {
            System.out.println("Enter text : ");
            String t = sc.next();
            test.add(t);
        }
        System.out.println("Here's all the list before reverse: " + test.toString());
        System.out.println("After reverse " + reverseList.startReverse(test).toString());

    }
}
