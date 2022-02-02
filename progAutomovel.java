package Exerc6;

import java.util.Scanner;

public class progAutomovel {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos automoveis? ");
        int N = sc.nextInt();
        sc.nextLine();
        Automóvel[] automóvels = new Automóvel[N];
        for(int i=0; i<N; i++){
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Custo: ");
            double custo = sc.nextDouble();
            sc.nextLine();
            Automóvel a = new Automóvel(marca, modelo, custo);
            automóvels[i]=a;
        }
        System.out.println("Quantas motas");
        int M = sc.nextInt();
        sc.nextLine();
        Mota[] motas = new Mota[M];
        for(int i=0; i<M; i++){

            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Custo: ");
            double custo = sc.nextDouble();
            sc.nextLine();
            Mota m = new Mota(marca, modelo, custo);
            motas[i]=m;
        }
        double custoTotalAutomoveis=0;
        double custoTotalMotas=0;

        double custoMinimoA = 99999999;
        int apAutMin=-1;
        for(int i=0; i<N; i++) {
            custoTotalAutomoveis += automóvels[i].getCusto();

            if(automóvels[i].getCusto() < custoMinimoA) {
                custoMinimoA = automóvels[i].getCusto();
                apAutMin=i;
            }
        }
        double custoMinimoM = 99999999;
        int apMotMin=-1;
        for(int i=0; i<M; i++) {
            custoTotalMotas += motas[i].getCusto();
            apMotMin=i;
        }
        System.out.println("Custo do combustivel por veiculo?");
        double combustivel = sc.nextInt();
        sc.nextLine();

        double custoTotalCombustivel = combustivel *(N+M);

        double custoTotal = custoTotalAutomoveis + custoTotalMotas + custoTotalCombustivel;

        System.out.println("Automovel com custo minimo: ");
        System.out.println("Marca: " + automóvels[apAutMin].Marca);
        System.out.println("Modelo: " + automóvels[apAutMin].Modelo);

        System.out.println("Mota com custo minimo: ");
        System.out.println("Marca: " + motas[apAutMin].Marca);
        System.out.println("Modelo: " + motas[apAutMin].Modelo);

        double total=custoTotalMotas + custoTotalAutomoveis + custoTotalCombustivel;

        System.out.println("Custo total com os veículos: " +  total);
    }
}
