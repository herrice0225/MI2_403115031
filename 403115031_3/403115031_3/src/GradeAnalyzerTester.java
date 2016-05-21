/*
 * [A]102
 * [TA's Advise]
 * 1. 基本上沒什麼太大問題, 只是會出現一些多餘的宣告, 注意一下.
 * 2. 裡面有一些建議, 雖然不影響程式運作, 但可以參考一下讓你的程式更好!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		// 多餘宣告.
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
			
			// print 123似乎換成印比較有意義的字串會更好喔.
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
