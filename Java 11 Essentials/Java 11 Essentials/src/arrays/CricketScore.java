package arrays;

public class CricketScore {

	public static void main(String[] args) {

		int[] scores = {281, 344, 265, 272, 236, 324, 287};

		double average = 0;
		double sum = 0;
		for( int i = 0; i < scores.length; i++ ) {
			sum = sum + scores[i];
		}

		average = sum / scores.length;

		int averageScoreCount = 0;
		int aboveAverageScoreCount = 0;
		int belowAverageScoreCount = 0;
		for( int score : scores ) {
			if( score > average ) {
				aboveAverageScoreCount++;
			} else if( score < average ) {
				belowAverageScoreCount++;
			} else {
				averageScoreCount++;
			}
		}

		System.out.println("The average score of the team is " + average + " runs");
		System.out.println("No. of matches having a score above average is " + aboveAverageScoreCount);
		System.out.println("No. of matches having a score equal to average is " + averageScoreCount);
		System.out.println("No. of matches having a score below average is " + belowAverageScoreCount);


	}

}
