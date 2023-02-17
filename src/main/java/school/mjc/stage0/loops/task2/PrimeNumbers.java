package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2) {
            System.out.println(2);
            int number = 3;
            while (number <= printToInclusive) {
                boolean flag = false;
                int i = 2;
                while (i <= number/2) {
                    if (number % i == 0) {
                        flag = true;
                    }
                    ++i;
                }
                if (!flag) {
                    System.out.println(number);
                }
                number = number + 2;
            }
        }
    }
}
