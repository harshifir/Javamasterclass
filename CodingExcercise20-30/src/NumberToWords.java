public class NumberToWords {

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int newNumber;
        int storeNumber = reverse(number);
        int count = 0;
        while(storeNumber > 0){
            newNumber = storeNumber % 10;
            switch(newNumber){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            storeNumber /= 10;
            count ++;
            }
            while(count < getDigitCount(number)){
                System.out.println("Zero");
                count ++;
            }
        }

        public static int reverse(int number){
            int reverseNumber =0;
            while( number != 0){
                int lastNumber = number % 10;
                reverseNumber = (reverseNumber * 10);
                reverseNumber += lastNumber;
                number /= 10;
            }
            return reverseNumber;
        }

        public static int getDigitCount(int number){
            if(number < 0){
                return -1;
            } else if(number == 0){
                return 1;
            } else {
                int digit = 0;
                int count = 0;
                while (number > 0) {
                    digit = number % 10;
                    number /= 10;
                    count++;
                }
                return count;
            }
        }

    }

