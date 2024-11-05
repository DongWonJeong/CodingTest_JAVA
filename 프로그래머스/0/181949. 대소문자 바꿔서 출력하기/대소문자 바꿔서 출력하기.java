import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        
        for(int i = 0; i < a.length(); i++){
            char input = a.charAt(i);
            
            if(Character.isUpperCase(input)){
                output = output + Character.toLowerCase(input);
            } else {
                output = output + Character.toUpperCase(input);
            }
        }
        System.out.println(output);
    }
}