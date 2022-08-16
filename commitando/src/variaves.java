public class variaves {
    public static void main(String[] args) {
        byte idade = 123;
            System.out.println(idade);

        short ano = 2022;
            System.out.println(ano);

        int cep = 2107033;
            System.out.println(cep);
                                        //se comecar com 0 tanto o long como o int altere-o para string para não dar conflito
        long cpf = 123675904909L;
            System.out.println("Seu CPF: " + cpf);

        float pi = 3.14F;
            System.out.println(pi);         //tanto co long como o float você deverá colocar o F ou o L no final do numero  

        double salario = 1900.22;
            System.out.println(salario);

    } 
}
