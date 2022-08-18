public class operadoreslogicos {
    public static void main(String[] args) {
        int idade = 15;
        boolean paiPresente = false;

            if(idade < 18 && paiPresente == false){
                System.out.println("Necessário a presença de um responsavel ");
            }
            else {
                System.out.println("Pode assinar");
            }
    }
    
}
