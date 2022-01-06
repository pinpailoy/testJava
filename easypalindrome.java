
import java.util.*;

 class EasyPalindrome {

    public boolean check(String sc2){
        StringBuilder reverse = new StringBuilder();
        String before = sc2.replaceAll("\\s+","");
        char[] beforeChar = before.toCharArray();
        for(int i=beforeChar.length-1;i>=0;i--){
            reverse.append(beforeChar[i]); 
        }
        return ((reverse.toString()).equals(before));
    }
    }
