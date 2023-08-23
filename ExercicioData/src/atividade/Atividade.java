/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author mborges
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data = new Data();
        int novoDia, novoMes, novoAno;   
        
        System.out.println("Data: " + data.toString());
        
        System.out.println("Opções: ");
        System.out.println("1) Mudar dia");
        System.out.println("2) Mudar mês");
        System.out.println("3) Mudar ano");
        System.out.println("4) Nova data");
        System.out.println("5) Avançar a data em 1 dia");
        
        Scanner read = new Scanner(System.in);
        int selection = read.nextInt();
        switch(selection) {
            case 1:
                System.out.println("Digite o dia: ");
                novoDia = read.nextInt();
                data.setDia(novoDia);
                System.out.println("Data: " + data.toString());
                
            break;
            case 2: 
                System.out.println("Digite o mês: ");
                novoMes = read.nextInt();
                data.setMes(novoMes);
                System.out.println("Data: " + data.toString());
            break;
            case 3:
                System.out.println("Digite o ano: ");
                novoAno = read.nextInt();
                data.setAno(novoAno);
                System.out.println("Data: " + data.toString());
            break;
            case 4:
                System.out.println("Digite o dia: ");
                novoDia = read.nextInt();
                System.out.println("Digite o mês: ");
                novoMes = read.nextInt();
                System.out.println("Digite o ano: ");
                novoAno = read.nextInt();
                Data novaData = new Data(novoDia, novoMes, novoAno);
                System.out.println("Data: " + novaData.toString());
            break;
            case 5:
                data.proximoDia();
                System.out.println("Data: " + data.toString());
            break;
            
        }   
    }
}
