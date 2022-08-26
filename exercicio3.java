import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mI, mF;
        int horas = 0, min = 0, segundos = 0, segundosTotais = 0;

        System.out.println("Massa inicial em gramas: ");
        mI = sc.nextFloat();
        mF = mI;

        while (mF >= 0.5) {
            segundos += 50;
            segundosTotais += 50;

            if (segundos > 60) {
                min++;
                segundos -= 60;
            }
            if (min > 60) {
                horas++;
                min -= 60;
            }

            mF = mF/2;
        }

        System.out.println("Massa inicial: " + mI + " | Massa final: " + mF);
        System.out.println("Horas, minutos e segundos: " + horas + ":" + min + ":" + segundos);
        System.out.println("Segundos totais: " + segundosTotais);
    }
}
