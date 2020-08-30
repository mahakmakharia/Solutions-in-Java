import java.util.*;
public class q2
{
    public static int[ ] arr = new int[11];
    public static void main(String[] args)
    {
        int choice;
        
        Scanner sc=new Scanner(System.in);

        
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: initialize");
            System.out.println("2: insert");
            System.out.println("3: remove");
            System.out.println("4: display");
            System.out.println("5: quit");

            // read user input
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: initialize();
                break;

                case 2: System.out.println("Enter element");
                        int ele=sc.nextInt();
                        if(insert(ele,arr[0]+1)==1)
                        arr[0]++;
                         
                break;

                case 3: System.out.println("Enter position of the element to be removed");
                        int p=sc.nextInt();
                        remove(p);                   
                break;

                case 4: display();
                break;

                case 5: System.out.println("Terminating program");
                break;

                default: System.out.println("Invalid choice retry");
                
            }
        } while(choice != 5);
    }

    public static void initialize(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements (<=10)");
        arr[0]=sc.nextInt();

        while(arr[0]>10){
            System.out.println("Re-Enter the no of elements (<=10)");
            arr[0]=sc.nextInt();
        }
        System.out.println("Enter element");
        for(int i=1;i<=arr[0];i++){
          
            int el=sc.nextInt();
            if(insert(el,i)==0)
            break;
        }

        int temp;
        for(int i=1;i<=arr[0]-1;i++)
        {
            for(int j=1;j<=arr[0]-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static int insert(int ele, int p){
       if(p>10){
            System.out.println("Array is full");
            return 0;
       }
      
       else{
           arr[p]=ele;
           System.out.println("Element inserted");
           return 1;
       }
    }

    public static void remove(int p){
        if(arr.length==0)
        System.out.println("Array is empty");
        else{
            for(int i=p;i<arr[0];i++)
            arr[i]=arr[i+1];
            arr[0]--;
            System.out.println("Successfully deleted");           
        }
    }

    public static void display(){
        for(int i=1;i<=arr[0];i++){   
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

}