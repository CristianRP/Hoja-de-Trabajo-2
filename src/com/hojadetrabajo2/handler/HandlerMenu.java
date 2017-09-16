/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hojadetrabajo2.handler;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class HandlerMenu {
    public HandlerMenu() {
        
    }
    
    public void showMenu() {
        Scanner s = new Scanner(System.in);
        int op;
        do {
            print("-- Lab 2 ---");
            print("1). Leer un arreglo desde el teclado");
            print("2.) Escribir un arreglo(1er al ultimo)");
            print("3.) Mostrar el arreglo al reves (del ultimo al 1ero)");
            print("4.) Mostrar el valor de la posicion central");
            print("5.) Recorrer arreglo de los extremos al centro");
            op = s.nextInt();
            if (op == 1) {
                readArray();
            } else if (op == 2) {
                writeArray();
            } else if (op == 3) {
                writeReverseArray();
            } else if (op == 4) {
                print("Ingresa el indice del arreglo");
                delCentroHaciaAfuera(s.nextInt());
            } else if (op == 5) {
                extremosAlCentro();
            } else if (op == 6) {
                sumaDeElementos();
            }
        } while (op != 0);
    }
    
    private void print(String message) {
        System.out.println(message);
    }
    
    private void readArray() {
        Scanner s = new Scanner(System.in);
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            print(String.format(
                    "Ingresa un valor alfanumerico en la posicion %1d",i));
            strings[i] = s.nextLine();
        }
    }
    
    private void writeArray() {
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Num " + Math.random();
        }
        for (int i = 0; i < strings.length; i++) {
            print(String.format("Posicion %1d, Valor: %2s", 
                    i, strings[i]));
        }
    }
    
    private void writeReverseArray() {
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Num " + Math.random();
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            print(String.format("Posicion %1d, Valor: %2s", 
                    i, strings[i]));
        }
    }
    
    private void delCentroHaciaAfuera(int index) {
        String[] strings = new String[index];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Num " + (int) (Math.random() * 10) + 1;
        }
        if (strings.length % 2 == 0) {
            print(String.format("Posicion %1d, Valor: %2s", 
                    (strings.length / 2) , strings[(strings.length / 2)]));
            print(String.format("Posicion %1d, Valor: %2s", 
                    (strings.length / 2) + 1, strings[(strings.length / 2) + 1]));
        } else {
            print(String.format("Posicion %1d, Valor: %2s", 
                    (int)((strings.length) / 2)+1, strings[(int)((strings.length) / 2)+1]));
        }
    }
    
    private void extremosAlCentro() {
        
    }
    
    private void sumaDeElementos() {
        int[] strings = new int[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = (int) (Math.random() * 10) + 1;
            print(String.format("Posicion %1d, Valor: %2s", 
                    i, strings[i]));
        }
        int suma;
        suma = 0;
        for (int i = 0; i < strings.length; i++) {
            suma += strings[i];
        }
        print(String.format("La suma de los elementos del array es %1d", suma));
    }
    
    
    
}
