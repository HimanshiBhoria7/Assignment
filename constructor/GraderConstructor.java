package com.constructor;

public class GraderConstructor {
	int score;
	String grade;
	GraderConstructor(int num1,int num2){
		score = (num1 + num2)/2;
		System.out.println("Percentage is : "+score);
	}
	
	void letterGrade() {
		if(score > 0 && score < 100) {
			if(score >=90 && score < 100) {
				grade = "O";
				System.out.println(grade);
			}
			else if(score >= 80 && score <= 75) {
				grade = "A";
				System.out.println(grade);
			}
			else if(score >= 60 && score < 74) {
				grade = "B";
				System.out.println(grade);
			}
			else if(score >= 50 && score < 59) {
				grade = "C";
				System.out.println(grade);
			}
			else if(score >= 35 && score < 49) {
				grade = "D";
				System.out.println(grade);
			}
		}
		else{
			grade = "E";
			System.out.println(grade);
		}
	}
}
