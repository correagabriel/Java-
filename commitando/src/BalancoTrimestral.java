import javax.sound.sampled.SourceDataLine;

public class BalancoTrimestral {
    public static void main(String[] args) {  //LEMBRAR DO MAIN ANIMAL
       
    double gastoJaneiro = 11000D;
    double gastoFevereiro = 22000D;
    double gastoMarco = 15000D;
    double gastostotal;
    double balanco;

    gastostotal = gastoFevereiro + gastoJaneiro + gastoMarco;
    balanco = gastostotal / 3;

    System.out.println("Seu gasto total foi de = " + gastostotal);
    System.out.println("O balanço trimestal foi de = " + balanco);
    }

}
