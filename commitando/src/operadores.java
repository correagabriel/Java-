import java.sql.Date;
import java.util.zip.DataFormatException;

public class operadores {
    public static void main(String[] args) {
        
        String nome = " Shirlei ";
        String mail = "shirleifuntec@gmai.com";
        int idade = 35;
        double peso = 68.5;
        char sexo = 'F';
        boolean doadorOrgao = false;
        Date dtNasc = new Date(15/11/1967);

        System.out.println("Nome : " + nome);
        System.out.println("E-mail : " + mail);
        System.out.println("Idade : " + idade);
        System.out.println("Peso : " + peso);
        System.out.println("Sexo : " + sexo);
        System.out.println("Doador de Orgãos : " + doadorOrgao);
        System.out.println("Data de Nascimento : " + dtNasc );
    }
}
