import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        final  int  senha=2002;
        int informado;
        Scanner leitor = new Scanner(System.in);
        informado = leitor.nextInt();
        while(informado !=senha){
            System.out.println("Senha Invalida : " + informado+" senha: "+senha);
            informado =leitor.nextInt();

        }
        leitor.close();
        System.out.println("Acesso Permitido");


    }
}