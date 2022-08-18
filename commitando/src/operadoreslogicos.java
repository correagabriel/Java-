public class operadoreslogicos {
    public static void main(String[] args) {
        int idade = 24;
        boolean paiPresente = true;

            if(idade < 18 && !paiPresente){ //paiPresente == false
                System.out.println("Necessário a presença de um responsavel ");
            }
            else {
                System.out.println("Pode assinar");
            }
    }
    
}
