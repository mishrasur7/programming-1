import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of candidates: ");
		int noOfCandidates = Integer.parseInt(input.nextLine());

		String[] candidates = new String[noOfCandidates];
		int[] votes = new int[noOfCandidates];

		for (int i = 0; i < candidates.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			candidates[i] = input.nextLine();
			System.out.print("Enter votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		int maxVote = votes[0];
		for (int i = 0; i < votes.length; i++) {
			if (maxVote < votes[i]) {
				maxVote = votes[i];
			}
		}

		int maxVoteOccurance = 0;
		for (int i = 0; i < votes.length; i++) {
			if (maxVote == votes[i]) {
				maxVoteOccurance++;
			}
		}

		if (maxVoteOccurance == 1) {
			for (int i = 0; i < votes.length; i++) {
				if (maxVote == votes[i] && maxVoteOccurance == 1) {
					System.out.println();
					System.out.println("The winner is " + candidates[i] + " with " + maxVote + " votes!");
				}

			}
		} else {
			System.out.println("The election is a tie between the following candidates: ");
			for (int i = 0; i < votes.length; i++) {

				if (maxVote == votes[i]) {
					System.out.println(candidates[i] + " (" + maxVote + " votes)");
				}
			}
		}
		
		input.close();

	}

}
