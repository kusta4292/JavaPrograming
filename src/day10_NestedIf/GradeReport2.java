package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {
        /*
        90~100: excellent
        80~89: Great
        70~79: Good
        60~69: Passed
        0~59: Failed

         */
        int score = 80;

        if (score >= 0 && score <= 100) {

            if (score >= 90) {// false score<90

                System.out.println("Excellent");

            } else if (score >= 80) { // false score<80

                System.out.println("Great");


            } else if (score >= 70) { // false score<70

                System.out.println("Good");


            } else if (score >= 60) { // false score<60

                System.out.println("Passed");


            } else {

                System.out.println("Failed");


            }


        } else {

            System.out.println("Please enter valid value");
        }

        System.out.println("-------------------------------");

        // solution2: use ternaries ONLY

        String score1 = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                : (score >= 60) ? "Passed" : "Failed" : "Please enter valid value";

        System.out.println("score1 = " + score1);


        System.out.println("--------------------------------------------------------------------------------------");

        // solution3 MIXED WITH TERANRI AND IF STATEMENT

        String result2 ="";

        if (score >= 0 && score <= 100) {

            result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                    : (score >= 60) ? "Passed" : "Failed";

        }else {

            result2 = "Please enter valid value";
        }
        System.out.println("result2 = " + result2);;
    }
}

