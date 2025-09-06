import java.util.Scanner;
public class studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of SUBJECTS:");
        int n = sc.nextInt();
        int totalmarks = 0;
        int i;
        for(i=1; i<=n; i++){
            System.out.println("Enter marks for subject "+ i + "(out of 100):");
            int marks=sc.nextInt();
            if (marks < 0 || marks > 100){
                System.out.println("Invalid marks ...Please enter between 0 and 100.");
                i--;
                continue;
            }
            totalmarks+= marks;
        }
        double avgper = (double) totalmarks / n;
        char grade;
        if (avgper >=90){
            grade ='A';
        }
        else if (avgper>=75){
            grade ='B';
        }
        else if (avgper>=0){
            grade ='C';
        }
        else if (avgper>=35){
            grade ='D';
        }
        else{
            grade ='F';
        }
        System.out.println("\n--- STUDENT RESULT---");
        System.out.println("Total Marks: "+ totalmarks+ " out of " + (n * 100) );
        System.out.println("Average Percentage : " + avgper + "%");
        System.out.println("Grade:" + grade);
        sc.close();
    }
}