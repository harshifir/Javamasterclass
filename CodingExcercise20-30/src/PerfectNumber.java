public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if(number <1){
            return false;
        } int sum =0;
        int divisor = 1;
        while(divisor < number){
            if(number % divisor == 0){
                sum += divisor;
            }
            divisor ++;
        }if(sum == number){
            return true;
        } return false;
    }
}
