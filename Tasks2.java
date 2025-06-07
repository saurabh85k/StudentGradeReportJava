import java.util.Arrays;
import java.util.Scanner;
public class Tasks2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("HOW MANY STUDENTS REQUIRED TO REPORT GRADE SYSTEM");
        int n=sc.nextInt();
        int[] marks=new int[n];
        String[] name=new String[n];
        sc.nextLine();

            for(int i=0; i<n; i++){
                System.out.print("Enter the name of Student " + (i+1) + ": ");
                name[i]=sc.nextLine();

                System.out.print("Enter marks of " + name[i] + ": ");
                marks[i]=sc.nextInt();
                sc.nextLine();
            }
           // System.out.println(Arrays.toString(marks));

        int total=0;
        double average=0;
        for(int i=0; i<n; i++){
            total +=marks[i];
        }
        average=total/n;
        int[] ans=marks.clone();
        Arrays.sort(ans);
        int max=ans[n-1];
        int min=ans[0];
       
            System.out.println("\n--- Student Grade Report ---");

        for(int i=0; i<n; i++){
            System.out.println(name[i] + " Scored: " + marks[i]);
        }

        System.out.println("AVERAGE MARKS : " + average);
        System.out.println("HIGHEST MARKS : " + max);
        System.out.println("LOWEST MARKS : " + min);
    }
}