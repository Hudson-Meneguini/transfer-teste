import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******* QUER SABER QUAL SEU IMC ? *********");
        System.out.println("Qual sua altura ?");
        Double altura = sc.nextDouble();


        System.out.println("Qual seu peso");
        Double peso = sc.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso normal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if (imc > 25.0 && imc <= 29.9){
            System.out.println("Você está acima do peso");
        }  else if ( imc > 30.0 && imc <= 34.9){
            System.out.println("Você está com Obsevidade Peso 1");
        } else if (imc > 35.0 && imc <=39.9) {
            System.out.println("Você com obesidade Peso 2");
        } else if (imc > 40){
            System.out.println("Voce está com obesidade peso 3");
        }
        System.out.println("Obrigado, cuide da sua saude");



    }
}
