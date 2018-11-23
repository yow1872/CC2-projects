
package odd.even;
import java.util.ArrayList;

public class OddEven {

    public static void main(String[] args) {
      int a[]={3,9,15,20,65,23,18,4,2,14,21};
         
         System.out.println("Elements:{");
         for(int l=0;l<a.length-1;l++){
             System.out.print(a[l]+", ");
         }
         System.out.println(a[a.length-1]+"}");
         
         
        System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println(a[i]);  
}  
}  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
System.out.println(a[i]);  
}  
}  
}} 
    