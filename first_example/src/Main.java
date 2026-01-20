import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

        int value ;
        System.out.println("please enter your first name :") ;
        System.out.flush();
        Scanner input = new Scanner(System.in) ;
        String sz = input.nextLine();
        System.out.println("length = "+sz.length()+"characters") ;
        char letter1 = 'B' ;
        if(Character.isLowerCase(letter1))
            System.out.println("Character is already in lower case");
        else
            System.out.println(Character.toLowerCase(letter1)) ;

        char letter2 = 'r' ;
        if(Character.isUpperCase(letter2))
            System.out.println("character is already in upper case");
        else
            System.out.println(Character.toUpperCase(letter2));

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println("please enter another name:") ;
        String sTwo = input.nextLine();
        System.out.println("length ="+sTwo.length()) ;

        String messageOne = "hello world" ;
        char c1 = messageOne.charAt(0) ;
        char c2 = messageOne.charAt(2) ;
        System.out.println("the first character in "+messageOne+"is "+c1);
        System.out.println("the third character in "+messageOne+"is "+c2);
        System.out.println("the fourth character in "+messageOne+"is "+c2);
        }
    }
