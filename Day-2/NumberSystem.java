/*
 * NumberSystem.java
 *
 * This program contains a collection of methods to check various
 * number properties such as:
 * - Palindrome
 * - Armstrong
 * - Perfect
 * - Spy
 * - Strong
 * - Niven
 * - Automorphic
 * - Magic
 * - Kaprekar
 * - Duck
 * - Emirp
 * - Adam
 * - Disarium
 * - Health Check (Abundant/Deficient)
 *
 * Each method checks whether a given number satisfies a particular
 * mathematical property and returns a boolean result (or a print message).
 * The main method demonstrates each of these checks with sample numbers.
 */

public class NumberSystem {
    public static void main(String[] args){

      System.out.println(isPalindrome(1221));
      System.out.println(isArmstrong(153));
      System.out.println(isPerfect(28));
      System.out.println(isSpy(1124));
      System.out.println(isStrong(145));
      System.out.println(isNiven(18));
      System.out.println(isAutomorphic(76));
      System.out.println(isMagic(19));
      System.out.println(isKaprekar(9));
      System.out.println(isDuck(0421));
      System.out.println(isEmirp(13));
      System.out.println(isAdam(12));
      System.out.println(isDisarium(89));
      checkHealth(12);

    }
    public static boolean isPalindrome(int num){
        int temp=num;
        int reverse=0;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        if(reverse==num){
            return  true;
        }
        else{
            return false;
        }
    }
    public static boolean isArmstrong(int num){
        int temp=num;
        int temp2=num;
        int len=0;
        while(temp>0){
            len++;
            temp/=10;

        }
        int result=0;
        while(temp2>0){
            int digit=temp2%10;
            result+=Math.pow(digit,len);
            temp2/=10;
        }
        if(result==num){
            return true;
        }
        return false;
    }
    public static boolean isPerfect(int num){
        int i=1;
        int sum=0;
        while(i<num){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    public static boolean isSpy(int num){
        int sum=0;
        int product=1;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }
        if(sum==product){
            return true;
        }
        return false;
    }
    public static boolean isStrong(int num){
        int temp=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
        }
        if(sum==temp){
            return true;
        }
        return false;
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static boolean isNiven(int num){
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        if(num%sum==0){
            return true;
        }
        return false;
    }
    public static boolean isAutomorphic(int num){
        int square=num*num;
        int len=0;
        int temp=num;
        while(temp>0){
            len++;
            temp/=10;
        }
        double d=Math.pow(10,len);
        if(square%d==num){
            return true;
        }
        return false;

    }
    public static boolean isMagic(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        if(sum==1){
            return true;
        }
        else if(sum>=10){
            return isMagic(sum);

        }
        return false;

    }
    public static boolean isKaprekar(int num){
        double square=num*num;
        int temp=num;
        int len=0;
        int sum=0;
        while(temp>0){
            len++;
            temp/=10;
        }
        while(square>0){
            double digit=square%(Math.pow(10,len));
            sum+=digit;
            square/=(Math.pow(10,len));
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    public static boolean isDuck(int num){
        int temp=num;
        while(temp>0){
            if(temp%10==0){
                return true;
            }
            temp/=10;
        }
        return false;
    }

    public static boolean isEmirp(int num){
        int temp=num;
        int reverse=0;
        while(temp>0){
            reverse=reverse*10+(temp%10);
            temp/=10;
        }
        if(checkPrime(num) && checkPrime(reverse)){
            return true;
        }
        return false;
    }
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }

        if(n%2==0){
            return false;
        }
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAdam(int num){
      int square=num*num;
      int reverse=reverse(num);
      int squareReverse=reverse*reverse;
      if(reverse(square)==squareReverse){
          return true;
      }
      return false;
    }
    public static int reverse(int num){
        int temp=num;
        int reverse=0;
        while(temp>0){
            reverse=reverse*10+(temp%10);
            temp/=10;
        }
        return reverse;
    }

    public static boolean isDisarium(int num){
        int reverse=reverse(num);
        int sum=0;
        int count=1;
        while(reverse>0){
            int digit=reverse%10;
            sum=sum+(int)(Math.pow(digit,count));
            count++;
            reverse/=10;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    public static void checkHealth(int num){
        int i=1;
        int sum=0;
        while(i<num){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum>num){
            System.out.println("Healthy");
        }
        else{
            System.out.println("Deficient");
        }
    }



}
