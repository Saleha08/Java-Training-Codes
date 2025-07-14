public class Prime {
    public static void main(String[] args){
        for(int i=21;i<=40;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }

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
}
