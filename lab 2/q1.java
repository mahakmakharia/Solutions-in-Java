import java.io.*;
import java.util.*;
public class q1
{
    public static void main(String[] args) 
    {
        //float a,b,c,d;
        float arr[]=new float[4];
        arr[0] = Float.parseFloat(args[0]);
        arr[1] = Float.parseFloat(args[1]);
        arr[2] = Float.parseFloat(args[2]);
        arr[3] = Float.parseFloat(args[3]); 
        int n=4;
        float temp;
        for(int i=0; i < n-1; i++){  
            for(int j=0; j < (n-i-1); j++){  
                if(Float.compare(arr[j+1], arr[j])>0){  
                //swap elements  
                    temp = arr[j+1];  
                    arr[j+1] = arr[j];  
                    arr[j] = temp;  
                    
                }  
            }  
        }  
         
        for(int i=0;i<n;i++)
            System.out.print(String.format("%.2f", arr[i])+" , ");
        System.out.println();
        
        float sum = 0;
        for(int i=0;i<n;i+=2)
           sum+= Float.sum(arr[i],arr[i+1]);

        System.out.println("sum: "+String.format("%.2f", sum));
        System.out.println();
       
    }
}
