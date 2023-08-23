/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.time.LocalDate;


/**
 *
 * @author mborges
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String dataTexto;
    private LocalDate dataAtual = LocalDate.now();

    public Data() {
        dia = dataAtual.getDayOfMonth();
        mes = dataAtual.getMonthValue();
        ano = dataAtual.getYear();
       
    }
    
    public Data(int dia, int mes, int ano) {
        if(dia < 1 && dia > 31 ){
            System.out.println("Favor digitar um dia válido.");
        } else if (mes < 1 && mes > 12) {
            System.out.println("Favor digitar um mês válido.");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia < 1 && dia > 31) {
            System.out.println("Favor digitar um dia válido.");
        } else {
            this.dia = dia;
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes < 1 && mes > 12) {
            System.out.println("Favor digitar um mês válido.");
        } else {
            this.mes = mes;
        }
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }
    
    public void proximoDia() {
        if(dia == 31) {
            dia = 1;
            mes += 1;
            if(mes > 12) {
                mes = 1;
                ano += 1;
            }
        } else {
            dia += 1;
        }
    }
    
    public String toString() {
        dataTexto = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
        return dataTexto;
    }
}
