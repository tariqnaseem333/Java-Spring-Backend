package arrays;

public class CricketScore {
	
public static void main(String a[]){
        
        //After implementing, copy the below code in JShell to execute
        int scores[]={281, 344, 265, 272, 236, 324, 287};
        double sum=0,avg=0;
        
        for(int index=0;index<scores.length;index++){
            sum=sum+scores[index];
        }
       
        avg=sum/scores.length;
        
        System.out.println("The average score of the team is "+avg);
        //Complete the code as desired output shown in problem statement
        
        int aboveScore = 0;
        int belowScore = 0;
        int equalScore = 0;
        for(int index=0;index<scores.length;index++){
            if( scores[index] > avg ) {
                aboveScore++;
            }
            else if( scores[index] < avg ) {
                belowScore++;
            }
            else {
                equalScore++;
            }
        }
        
        System.out.println("No. of matches having score above average is " + aboveScore);
        System.out.println("No. of matches having score equal to average is " + equalScore);
        System.out.println("No. of matches having score below average is " + belowScore);
    }

}
