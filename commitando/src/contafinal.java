public class contafinal {
    public static void main(String[] args) {
        String banco = "Santander";
        String nome = "Punpun Punayama";
        double saldoinicial = 1500D;
        double saldofinal;
        double Retirada = 50D;

        saldofinal = saldoinicial - Retirada;

        System.out.println("Olá " + nome);
        System.out.println("Você possui conta no banco " + banco);

            if(nome.equals("Punpun Punayam")&& banco == "Santander"); {
                System.out.println(" Conta Verificada ");
            }

        if(saldoinicial >= 0 ) {
            System.out.println("Saldo atual = " + saldoinicial);
            System.out.println("Você pode retirar = " + saldofinal);
        }
        else {
            System.out.println(" Você não pode retirar esta quantia :/  ");
            System.out.println("Saldo Atual " + saldoinicial);
        }
        
        
    }
}
