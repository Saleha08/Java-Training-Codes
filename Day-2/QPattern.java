public class QPattern {
        public static  void main(String[] args){
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if((i==1 && j<5) || (j==1 && i<5) || (i==4 && j<5) || (j==4 && i<5) || (i==j && j>=3)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }

}
