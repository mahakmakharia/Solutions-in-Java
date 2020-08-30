import java.util.*;
public class q3
{
    public static void main(String[] args) 
    { 
        int salary,merit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        salary=sc.nextInt();
        System.out.println("Enter Merit");
        merit=sc.nextInt();

        if((salary>=500 && salary<=649)||(salary>=600 && salary<=649 && merit<10))
        System.out.println("salary: $"+salary+ ", merit:"+merit +" - Grade C");

        else if((salary>=650 && salary<=799) || (salary>=700 && salary<=799 && merit <20))
        System.out.println("salary: $"+salary+ ", merit:"+merit +" - Grade B");

        else if(salary>=800 && salary<=899)
        System.out.println("salary: $"+salary+ ", merit:"+merit +" - Grade A");
        
 
    }
}
