public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        } int result = 0;
        int divisor = 30;
        while(divisor >2){
            if((first % divisor == 0) && (second % divisor == 0)){
                result = divisor;
                break;
            }
            divisor-- ;
        } return result;
    }
}
