/*
 * [A]102
 * [TA's Advise]
 * 1. �򥻤W�S����Ӥj���D, �u�O�|�X�{�@�Ǧh�l���ŧi, �`�N�@�U.
 * 2. �̭����@�ǫ�ĳ, ���M���v�T�{���B�@, ���i�H�ѦҤ@�U���A���{����n!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		// �h�l�ŧi.
		double tempScore = 0;

		String tempInput = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			tempInput = JOptionPane.showInputDialog(null, "Please insert one score");
			if (tempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(tempInput));
			} catch (Exception e) {
				System.out.println("[System]Please insert valid number");
			}
		}
		if (GA.cntInput < 2) {
			
			// print 123���G�����L������N�q���r��|��n��.
			System.out.print("123");
		
		} else {
			GA.analyzeGrades();
			System.out
					.println("You entered " + GA.cntInput + " valid grades from 0 to 110. Invalid grades are ignored!");
			System.out.println("");
			System.out.println(
					"The average = " + (int) GA.average + " with a standard deviation = " + (int) GA.standardDeviation);
			System.out.println("");
			System.out.println(GA);
		}

	}

}
