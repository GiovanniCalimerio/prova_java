import java.util.Scanner;
public class exercicio01semvetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        int ma, me;
        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        ma = n1;
        me = n1;
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        if (n2 > ma) {
            ma = n2;
        }
        if (n2 < me) {
            me = n2;
        }
        System.out.println("Digite o 3º número: ");
        n3 = sc.nextInt();
        if (n3 > ma) {
            ma = n3;
        }
        if (n3 < me) {
            me = n3;
        }
        System.out.println("Digite o 4º número: ");
        n4 = sc.nextInt();
        if (n4 > ma) {
            ma = n4;
        }
        if (n4 < me) {
            me = n4;
        }
        System.out.println("Digite o 5º número: ");
        n5 = sc.nextInt();
        if (n5 > ma) {
            ma = n5;
        }
        if (n5 < me) {
            me = n5;
        }
        System.out.println("Maior número: " + ma);
        System.out.println("Menor número: " + me);
    }
}
