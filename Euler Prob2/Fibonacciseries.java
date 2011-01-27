public class SumOfEvenNumbersOfFibonacciSeriesFrom{

    int First_Number;
    int Second_Number;

  public SumOfEvenNumbersOfFibonacciSeriesFrom(int First_Number, int Second_Number){

      this.First_Number = First_Number;
      this.Second_Number = Second_Number;

    }

    public int sumOfEvenNumbersOfFibonacciSeriesTill(int fibonacciTermsTill){

        int sumOfEvenNumberOfFibonacciSeries = 0;

        if(First_Number%2 == 0){
            sumOfEvenNumbersOfFibonacciSeries=sumOfEvenNumbersOfFibonacciSeries+First_Number;
        }

        int Temp;

        while(Second_Number <= fibonacciTermsTill){

            if(Second_Number%2 == 0){
               sumOfEvenNumbersOfFibonacciSeries=sumOfEvenNumbersOfFibonacciSeries+Second_Number;
            }

            Temp = First_Number;
            First_Number = Second_Number;
            Second_Number += Temp;
        }

        return sumOfEvenNumbersOfFibonacciSeries;

    }
}
