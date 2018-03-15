public class SumOfSquareDifference {

    public int sumOfSquareDifference(int firstNumbersOfNaturalNumbers) {

        int sumOfSquares = 0;

        int sum = 0;
        int squareOfSum = 0;

        for (int i = 1; i <= firstNumbersOfNaturalNumbers; i++) {
            sumOfSquares += Math.pow(i, 2);
            sum += i;
        }

        squareOfSum = (int) Math.pow(sum, 2);

        // difference
        int difference = squareOfSum - sumOfSquares;

        return difference;
    }
}
