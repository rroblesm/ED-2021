/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0809;

/**
 *
 * @author R
 */
public class Triangulo implements FigGeometrica {

    double lado1, lado2, lado3;
    double base, altura;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        this.altura = -1;
        this.base = -1;
    }

    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;

        this.lado1 = -1;
        this.lado2 = -1;
        this.lado3 = -1;
    }

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        double area = -1;
        if (lado1 != -1 && lado2 != -1 && lado3 != -1) {
            double pHeron = calculaPerimetro() / 2;
            area = ((pHeron) * (pHeron - lado1) * (pHeron - lado2) * (lado3));
            area = Math.sqrt(area);
        } else {
            if (base != -1 && altura != -1) {
                area = (base * altura) / 2;
            }
        }
        return area;
    }

    public double calculaPerimetro() {
        double perimetro = -1;
        if (lado1 != -1 && lado2 != -1 && lado3 != -1) {
            perimetro = lado1 + lado2 + lado3;
        } else {
            if (base != -1 && altura != -1) {
                perimetro = base + altura
                        + Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
                //asumo que es un triangulo rectangulo
            }
        }
        return perimetro;
    }

    public boolean equals(Object obj) {
        boolean answer = false;
        Triangulo otro = (Triangulo) obj;

        if ((this.lado1 == otro.lado1) && (this.lado2 == otro.lado2) && (this.lado3 == otro.lado3)) {
            answer = true;
        } else {
            if (this.base == otro.base && this.altura == otro.altura) {
                answer = true;
            }
        }

        return answer;
    }

    public String toString() {
        String impresion = "";
        if ((this.lado1 != -1) && (this.lado2 != -1) && (this.lado3 != -1)) {
            impresion = impresion + "Este triangulo tiene 3 lados: " + lado1 + "," + lado2 + "," + lado3;

        } else {
            if (this.base != -1 && this.altura != -1) {
                impresion = impresion + "Este triangulo tiene una base: " + base + " y una altura " + altura;
            }
        }

        return impresion;
    }

}
