import java.util.ArrayList;

//The statistic results
class MyCount {
	String name;
	int cnt;

	MyCount() {

	}

	MyCount(String _name, int _cnt) {
		this.name = _name;
		this.cnt = _cnt;
	}
}

public class GradeAnalyzer {

	int cntInput = 0;
	double totalNumber = 0, standardDeviation = 0, average = 0, sDTemp = 0;
	ArrayList<Double> numberScore = new ArrayList<Double>();
	MyCount[] gradeDistribution = new MyCount[11];
	boolean firstTime = true;

	;

	// 其實我覺得這邊不需要使用到static, 想想看為什麼.
	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		return false;
	}

	void addGrade(double aGrade) {
		// Good , +2.
		if (firstTime) {
			gradeDistribution[0] = new MyCount("A+", 0);
			gradeDistribution[1] = new MyCount("A", 0);
			gradeDistribution[2] = new MyCount("A-", 0);
			gradeDistribution[3] = new MyCount("B+", 0);
			gradeDistribution[4] = new MyCount("B", 0);
			gradeDistribution[5] = new MyCount("B-", 0);
			gradeDistribution[6] = new MyCount("C+", 0);
			gradeDistribution[7] = new MyCount("C", 0);
			gradeDistribution[8] = new MyCount("C-", 0);
			gradeDistribution[9] = new MyCount("D", 0);
			gradeDistribution[10] = new MyCount("F", 0);
			firstTime = false;
		}

		if (!isValidGrade(aGrade)) {
			// 之後可以試試看throw Exception.
			return;
		}

		numberScore.add(aGrade); // (100, 80, 60, 40, 20, 0)
		totalNumber = aGrade + totalNumber;
		cntInput++;

		// Nest Structure is good!
		if (aGrade >= 90) {
			if (aGrade >= 98)
				gradeDistribution[0].cnt++;
			else if (aGrade >= 92)
				gradeDistribution[1].cnt++;
			else
				gradeDistribution[2].cnt++;
		} else if (aGrade >= 80) {
			if (aGrade >= 88)
				gradeDistribution[3].cnt++;
			else if (aGrade >= 82)
				gradeDistribution[4].cnt++;
			else
				gradeDistribution[5].cnt++;
		} else if (aGrade >= 70) {
			if (aGrade >= 78)
				gradeDistribution[6].cnt++;
			else if (aGrade >= 72)
				gradeDistribution[7].cnt++;
			else
				gradeDistribution[8].cnt++;
		} else {
			if (aGrade >= 60)
				gradeDistribution[9].cnt++;
			else
				gradeDistribution[10].cnt++;
		}
	}

	void analyzeGrades() { // Statistics
		average = totalNumber / cntInput;
		for (int i = 0; i < numberScore.size(); i++) {
			sDTemp = (numberScore.get(i) - average) * (numberScore.get(i) - average) + sDTemp;
		}

		standardDeviation = Math.round((Math.sqrt(sDTemp / cntInput)));
	}

	public String toString() {
		String rlt = "";
		for (int i = 0; i < gradeDistribution.length; i++) {
			rlt = gradeDistribution[i] + "\n" + rlt;
		}

		return "The grade distribution is:\n\n" + rlt;
	}

}
