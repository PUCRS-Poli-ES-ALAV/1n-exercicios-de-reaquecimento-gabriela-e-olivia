public class exercicio {

    //Multiplicação de dois números naturais, através de somas sucessivas
    public int multiplicacao(int a, int b){
        if(a == 0) return 0;
        return b + multiplicacao(a - 1,b);
    }

    //Soma de dois números naturais, através de incrementos sucessivos
    public int incrementoSucessivo(int a, int b){
        if(b == 0) return 0;
        return incrementoSucessivo(a + 1, b - 1);
    }


    //Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
    public double calculo(int a){
        if(a == 1) return 1.0;
        return 1.0 / a + calculo(a - 1);
    }

    //Inversão de uma string
    public String inverter(String a){
        if(a.isEmpty()) return "";
        return inverter(a.substring(1)) + a.charAt(0);
    }


    /*
    Gerador da sequência dada por:
    F(1) = 1
    F(2) = 2
    F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
     */
    public int fibonatti(int n){
        if(n == 0) return 0;
        return fibonatti(n - 1) + fibonatti(n - 2);
    }


    /*
    Gerador de Sequência de Ackerman:
    A(m, n) = n + 1, se m = 0
    A(m, n) = A(m − 1, 1), se m != 0 e n = 0
    A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
     */
    public int sequenciaAckerman()

    //A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.

    //Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx)

    /*
    Dado um número n, gere todas as possíveis combinações com as n primeiras letras do alfabeto.
    Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA
     */
    
    /*
    Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
    fibg(f0, f1, 0) = f0
    fibg(f0, f1, 1) = f1
    fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1.
     */

    public static void main(String[] args){

    }

}
