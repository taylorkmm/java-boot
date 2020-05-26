// Import statement:
import java.util.ArrayList;
public class PrimeDirective {
  
  // Add your methods here:
  public ArrayList<Integer> onlyPrimes(int[] numbers){
      ArrayList<Integer> primes = new ArrayList<Integer> ();
      for(int i : numbers) {
        if (isPrime(i)) primes.add(i);
      }
      return primes;
  }

  public boolean isPrime (int number){
    if (number == 2 ) {
      return true;
    } else if (number <2) {
      return false;
    } else {
      for (int i=2; i < number; i++ ) {
      if (number%i == 0) return false;
      }
    }
    return true;

  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers).toString());

  }  

}