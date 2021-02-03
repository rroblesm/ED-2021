/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0809;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author R
 */
public class Ejercicio9 {

    public static void main(String[] args) throws IOException {

        Scanner lector = new Scanner(System.in);  // Create a Scanner object
        int opcionMainMenu;
        final int MAX = 1000;
        FigGeometrica[] figuras = new FigGeometrica[MAX];
        int contador = 0;
        boolean continuar = true;

        do {

            System.out.println("Menu de Opciones:");
            System.out.println("[1] Definir un arreglo Polimorfico");
            System.out.println("[2] Dar de alta figuras");
            System.out.println("[3] Calcular el area de todas las figuras");
            System.out.println("[4] Imprimir el circulo mas grande");
            System.out.println("[5] Calcular e Imprimir el numero de cuadrados");
            opcionMainMenu = lector.nextInt();

            switch (opcionMainMenu) {
//            case 1:
                //1) Definir un arreglo polimórfico de FigGeométrica.
                //no tiene

//                break;//fin case 1 del menu principal
                case 2:

                    //2) Dar de alta figuras.
                    System.out.println("¿Que figura daras de alta?");
                    System.out.println("[1] Triangulo");
                    System.out.println("[2] Cuadrado");
                    System.out.println("[3] Rectangulo");
                    System.out.println("[4] Circulo");
                    int lectura = lector.nextInt();

                    switch (lectura) {
                        case 1:
                            double base,
                             altura;
                            System.out.println("Ingrese la base: ");
                            base = lector.nextDouble();
                            System.out.println("Ingrese la altura");
                            altura = lector.nextDouble();
                            figuras[contador] = new Triangulo(base, altura);
                            contador++;

                            break;
                        case 2:
                            double lado;
                            System.out.println("Ingrese el lado:");
                            lado = lector.nextDouble();
                            figuras[contador] = new Cuadrado(lado);
                            contador++;

                            break;
                        case 3:
                            double lado1,
                             lado2;
                            System.out.println("Ingrese el lado 1: ");
                            lado1 = lector.nextDouble();
                            System.out.println("Ingrese el lado 2: ");
                            lado2 = lector.nextDouble();
                            figuras[contador] = new Rectangulo(lado1, lado2);
                            contador++;

                            break;
                        case 4:
                            double radio;
                            System.out.println("Ingrese el radio: ");
                            radio = lector.nextDouble();
                            figuras[contador] = new Circulo(radio);
                            contador++;

                            break;
                    }

                    break;//case 2

                case 3:
                    //3) Calcular e imprimir el área de todas las figuras almacenadas.
                    for (int i = 0; i < contador; i++) {
                        System.out.println(figuras[i].calculaArea());
                    }

                    break; //fin case3                
                case 4:
                    //4) Encontrar e imprimir los datos del círculo más grande
                    Circulo circuloMasGrande = new Circulo(-1);

                    for (int i = 0; i < contador; i++) {
                        if (figuras[i] instanceof Circulo) {
                            Circulo circuloAComparar = (Circulo) figuras[i];
                            if (circuloAComparar.getRadio() > circuloMasGrande.getRadio()) {
                                circuloMasGrande = circuloAComparar;
                            }
                        }

                    }
                    System.out.println(circuloMasGrande.getRadio());
                    break; //fin case 4

                case 5:
                    //5) Calcular e imprimir el total de cuadrados.
                    int numeroDeCuadrados = 0;
                    for (int i = 0; i < contador; i++) {
                        if (figuras[i] instanceof Cuadrado) {
                            numeroDeCuadrados++;
                        }

                    }
                    break;

                case 6:
                    //6) Eliminar todos los triángulos equiláteros.
                    int i=0, j=0;
                    
                    while(i<contador){
                        if (figuras[i] instanceof Triangulo) {
                            Triangulo trianguloAEvaluar = (Triangulo) figuras[i];
                            
                            
                            if (trianguloAEvaluar.getLado1() == trianguloAEvaluar.getLado2() && trianguloAEvaluar.getLado1() == trianguloAEvaluar.getLado3()) {
                                  for(j=i; j<contador-1; j++) {
                                              figuras[i]=figuras[i+1];
                                              figuras[contador-1]=null;
                                              contador--;
                                  }//for recorrer
                            }//if equilatero
                            else
                                i++;
                        }//if instancia de Triangulo
                        else
                            i++;
                    }//while contador
                    break;

            }//fin Switch

            System.out.println("¿Quieres continuar?");
            System.out.println("[1] Si");
            System.out.println("[2] No");
            opcionMainMenu = lector.nextInt();
            if (opcionMainMenu == 1) {
                continuar = true;
            } else {
                continuar = false;
            }

        } while (continuar == true);

    }//fin main

}//fin clase
