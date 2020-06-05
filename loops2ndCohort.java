public class loops2ndCohort {

    public static void main(String[] args) {

        int evenNumber = 0;
        int thirdNumber = 100;

            while (evenNumber < 102) {

                System.out.println(evenNumber);
                evenNumber = evenNumber + 2;    // evenNumber += 2;

            }

            while (thirdNumber > -2) {

                System.out.println(thirdNumber);
                thirdNumber = thirdNumber - 3;  // thirdNumber -= 3;
            }

            for (int i = 1; i <= 100; i = i + 2) {

                System.out.println(i);
            }

            for (int j = 0; j < 101; j++) {

                if ((j % 3 == 0) && (j % 5 == 0)) {

                    System.out.println("Hello World");

                }else if (j % 3 == 0) {

                    System.out.println("Hello");

                }else if  (j % 5 == 0) {

                    System.out.println("World");

                }else {

                    System.out.println(j);


                }
            }


    }
}
