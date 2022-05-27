import java.util.Scanner;

public class Input {
    public String enterString(){
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
