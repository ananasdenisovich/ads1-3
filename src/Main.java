import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Check(n));
    }
    public static String Check(int n){
        String answer = null;
        if (n <= 0 || n % 2 == 0){
            answer = "Composite";
        } else {
            answer = "Prime";
        }
        for (int i = 2; i <= (n+1)/2; i++){
            if (n % i == 0){
                answer = "Composite";
            }
        }
        return answer;
    }
}