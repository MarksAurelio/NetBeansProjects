
import java.time.Year;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author marksaurelio
 */
public class Vetor02 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano para verificar o número de dias dos meses: ");
        int anoDigitado = scanner.nextInt();
   
    String mes[] = {"Jan","Fev","Mar","Abr","Mai",
        "Jun","Jul","Ago","Set","Out","Nov","Dez"};
    int totalDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    boolean anoBissexto = Year.of(anoDigitado).isLeap();
    
        if (anoBissexto) {
            System.out.println("O ano digitado (" + anoDigitado + ") é bissexto! ");
        } else {
            System.out.println("O ano digitado (" + anoDigitado + ") não é bissexto! ");
        }
    for (int c=0; c<mes.length; c++){
        System.out.println("O mês de " + mes[c] + " tem " + totalDias[c] +
                " dias ao todo");
        }
    
    scanner.close();
    
    }
}
