
import java.util.*;
public class searchText {
	public static void main(String[] args)  {
        EasyPalindrome easy = new EasyPalindrome();
        System.out.println("test palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String sc2 = sc.next();
        if(easy.check(sc2)){
            System.out.println(sc2+" is a palinDrome ");
        }else{ System.out.println(sc2+" is NOT a palinDrome");}
    }
}