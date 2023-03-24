import java.util.Scanner;

public class java {
        public static void main(String[] args) {
            Scanner entrada;
            entrada = new Scanner(System.in);
            String descrição;
            int quantidade;
            float preco,total;
            System.out.println ("Qual o nome do produto --> ");
            descrição= entrada.next();
            System.out.println(" ");
            System.out.println ("Qual a quantidade do produto --> ");
            quantidade= entrada.nextInt();
            System.out.println(" ");
            System.out.println ("Qual o preço unitário--> ");
            preco= entrada.nextFloat();
            System.out.println(" ");
            total = (quantidade*preco);

            if (quantidade<=5) {

                System.out.println("Total que seria pago--> " +"R$"+ total );
                System.out.println(" ");
                System.out.println("Desconto é de 2%-->" +"R$"+ ((total*2)/100) );
                System.out.println(" ");
                System.out.println("O preço que será pago com desconto--> " +"R$"+(total - ((total*2)/100)));

            }else if (quantidade>5 && quantidade <=10) {
                System.out.println("Total que seria pago--> " +"R$ "+ total );
                System.out.println(" ");
                System.out.println("Desconto é de 3%--> " +"R$"+ ((total*3)/100) );
                System.out.println(" ");
                System.out.println("O preço que será pago com desconto--> " +"R$"+(total - ((total*3)/100)));
            }
            else {
                System.out.println("Total que seria pago--> " +"R$ "+ total );
                System.out.println(" ");
                System.out.println("Desconto é de 5%--> " +"R$"+ ((total*3)/100) );
                System.out.println(" ");
                System.out.println("O preço que será pago com desconto--> " +"R$ "+(total - ((total*5)/100)));
            }

        }
}