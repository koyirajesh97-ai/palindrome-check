import java.util.Scanner;
// done

public class Palindrome {
    public static void main(String args[]){
    // can refactor later
    // testing
    // moved code around
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        // tested manually
        String str = s.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
            // cleanup later
        }else{
            System.out.println("not palindrome");
        }
        s.close();
    }
}
