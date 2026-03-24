import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Bem vindo ao Sistema ===");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua febre: ");
        double febre = leitor.nextDouble();

        if( febre < 35.4 ){
            System.out.println("Você esta com hipotermia.");
        } else if(febre <= 37.4){
            System.out.println("Sua temperatura é normal.");
        } else{
            System.out.println("Você está com febre!");
        }
        


        leitor.close();
    }
}
