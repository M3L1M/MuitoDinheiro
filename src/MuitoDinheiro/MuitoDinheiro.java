package MuitoDinheiro;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class MuitoDinheiro {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        user.useLocale(Locale.US);
        Calendar c = Calendar.getInstance();
        String primeiroNome,segundoNome;
        double guardar=0;
        int moedaEscolhida=0,moedaConvertida=0,x=1;

        while (x!=0) {
            System.out.print("Primeiro nome: ");
            primeiroNome=user.next();
            System.out.print("Segundo nome: ");
            segundoNome=user.next();
            System.out.println("[ 1 ] - Real\n[ 2 ] - Dolar\n[ 3 ] - Euro\n[ 4 ] - Libra");
            System.out.print("=>");
            moedaEscolhida=user.nextInt();
            switch (moedaEscolhida) {
                case 1:
                    System.out.println("Quantos reais?");
                    System.out.print("R$");
                    guardar = user.nextDouble();
                    break;
                case 2:
                    System.out.println("Quantos Dolares?");
                    System.out.print("US$");
                    guardar = user.nextDouble();
                    break;
                case 3:
                    System.out.println("Quantos Euros?");
                    System.out.print("€");
                    guardar = user.nextDouble();
                    break;
                case 4:
                    System.out.println("Quantas Libras?");
                    System.out.print("£");
                    guardar = user.nextDouble();
                    break;
                default:
                    System.out.println("Valor invalido");

            }
            System.out.println("Você quer converter para qual moeda?");
            System.out.println("[ 1 ] - Real\n[ 2 ] - Dolar\n[ 3 ] - Euro\n[ 4 ] - Libra");
            System.out.print("=>");
            moedaConvertida = user.nextInt();
            System.out.println("====== MUITO DINHEIRO ======");
            System.out.println(primeiroNome+" "+segundoNome);
            System.out.println("Data da operação: "+c.get(Calendar.DAY_OF_MONTH)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
            switch (moedaConvertida) {
                case 1:
                    System.out.print("Valor bruto: ");
                    System.out.printf("R$%.2f\n", converterReal(guardar, moedaEscolhida));
                    System.out.print("Valor com a taxa: ");
                    System.out.printf("R$%.2f\n", converterReal(guardar-(guardar*0.10), moedaEscolhida));
                    break;
                case 2:
                    System.out.print("Valor bruto: ");
                    System.out.printf("US$%.2f\n", converterDolar(guardar, moedaEscolhida));
                    System.out.print("Valor com a taxa: ");
                    System.out.printf("US$%.2f\n", converterDolar(guardar-(guardar*0.10), moedaEscolhida));
                    break;
                case 3:
                    System.out.print("Valor bruto: ");
                    System.out.printf("€%.2f\n", converterEuro(guardar, moedaEscolhida));
                    System.out.print("Valor com a taxa: ");
                    System.out.printf("€%.2f\n", converterEuro(guardar-(guardar*0.10), moedaEscolhida));
                    break;
                case 4:
                    System.out.print("Valor bruto: ");
                    System.out.printf("£%.2f\n", converterLibra(guardar, moedaEscolhida));
                    System.out.print("Valor com a taxa: ");
                    System.out.printf("£%.2f\n", converterLibra(guardar-(guardar*0.10), moedaEscolhida));
                    break;
                default:
                    System.out.println("Valor invalido");
            }
            System.out.println("============================");
            System.out.println("Você quer cadastrar mais um cliente: ");
            System.out.println("[ 0 ] - Não\n[ 1 ] - Sim");
            x=user.nextInt();

        }

    }
    public static double converterReal(double moeda, int escolha){
        double guard=0;
        if (escolha==1){
            System.out.println("Impossivel converter para a mesma moeda");
        }else if(escolha==2){
            guard=moeda/=0.19;
        }else if(escolha==3){
            guard=moeda/=0.15;
        }else if(escolha==4){
            guard=moeda/=0.13;
        }
        return guard;
    }public static double converterDolar(double moeda, int escolha){
        double guard=0;
        if (escolha==1){
            guard=moeda/=5.28;
        }else if(escolha==2){
            System.out.println("Impossivel converter para a mesma moeda");
        }else if(escolha==3){
            guard=moeda/=0.82;
        }else if(escolha==4){
            guard=moeda/=0.71;
        }
        return guard;
    }public static double converterEuro(double moeda, int escolha){
        double guard=0;
        if (escolha==1){
            guard=moeda/=6.46;
        }else if(escolha==2){
            guard=moeda/=1.22;
        }else if(escolha==3){
            System.out.println("Impossivel converter para a mesma moeda");
        }else if(escolha==4){
            guard=moeda/=0.86;
        }
        return guard;
    }public static double converterLibra(double moeda, int escolha){
        double guard=0;
        if (escolha==1){
            guard=moeda/=7.49;
        }else if(escolha==2){
            guard=moeda/=1.42;
        }else if(escolha==3){
            guard=moeda/=1.16;
        }else if(escolha==4){
            System.out.println("Impossivel converter para a mesma moeda");
        }
        return guard;
    }

}