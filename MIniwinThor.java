import java.util.Scanner;

public class MIniwinThor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cdigo;
        double   precdecmpra,precdevnda;
        String dscrcao,estatosdoprduto;
        
        Produto produto=new Produto();


        System.out.println("Digite o codigo do produto:");
         cdigo= sc.nextInt();

         System.out.println("Digite o preço de compra:");
         precdecmpra= sc.nextDouble();

         System.out.println("Digite o preço de venda:");
         precdevnda= sc.nextDouble();

        System.out.println("Como o produto e descrito :");
        dscrcao= sc.nextLine();

        System.out.println("Informe os estados do produto:");
        estatosdoprduto= sc.nextLine();

    }
}
