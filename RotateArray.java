Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Gaurav-K-Raj 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


1
00Gaurav-K-Raj/myrepository-git
 Code Issues 0 Pull requests 0 Projects 0 Wiki Security Insights Settings
myrepository-git
/
RotateArray.java
 
import java.util.Scanner;
 public class RotateArray
{
    private void rotate(int arr[],int d,int n){
     
        int finalArr[]=new int[n];
        int j=0;
        for(int i=d;i<arr.length;i++){
            finalArr[j]=arr[i];
            j++;
        }
        for(int i=0;i<d;i++){
             finalArr[j]=arr[i];
             j++;
        }
         System.out.println("Here is the resultant array");
         for(int i=0;i<finalArr.length;i++){
           System.out.print(finalArr[i]);
        }
    }
	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++){
		   arr[i]=sc.nextInt(); 
		}
		System.out.println("Enter the no of element to roatate which must be less than or equal array's length");
        int d=sc.nextInt();
        
        if(d>n){
            throw new ArithmeticException("you can not put the val > the length of array");
        }
        new RotateArray().rotate(arr,d,n);
    }
}
