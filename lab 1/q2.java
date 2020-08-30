import java.util.*;
public class q2
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        switch(ch){
        case 'a' :
        case 'A':
        System.out.println(ch +"-Action movie fan");
        break;
        case 'c' :
        case 'C':
        System.out.println(ch +"Comedy movie fan");
        break;
        case 'd' :
        case 'D':
        System.out.println(ch +"Drama movie fan");
        break;
       
       default:
          System.out.println("Invalid choice");
       }

    }
}
