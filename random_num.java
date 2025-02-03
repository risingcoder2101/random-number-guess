import java.util.Scanner;

public class random_num {
    public static void guess(int num,int rand){
        Scanner sc = new Scanner(System.in);
        while(num>0){
            if(num==rand){
                System.out.print("you guessed it correctly!!!\n The number is: ");
                System.out.println(rand);
                return;
            }
            else if(num<rand){
                System.out.println("guessed too low!!!\n TRY AGAIN HEHEHEHE");
            }
            else if(num>rand){
                System.out.println("guessed too high!!!\n TRY AGAIN HEHEHEHE");
            }
            System.out.println("Enter number to guess Again or Enter -1 to stop");
                num=sc.nextInt();
        }
        if(num==-1){
            System.out.print("you are a looser!!!\n The number is: ");
            System.out.println(rand);
    }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rand = Math.random()*100;
        rand = (int)rand;
        System.out.println("Guess the number between 0-100");
        int num= sc.nextInt();
        guess(num,(int)rand);
    }
}
