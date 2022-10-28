/*
Construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja,
se a String é igual a ela mesma invertida.
Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
Logo, NÃO é um Palíndromo.
Já se recebemos a ‘string’ "radar" uma vez invertida temos "radar" que são iguais.

Entrada: Consiste numa palavra.

Saída: Para cada String informada, terá uma saída de valor Booleano:
TRUE, caso a palavra seja um palíndromo, ou
FALSE caso a palavra NÃO seja um palíndromo.

 */

import java.util.Scanner;

public class ChecagemPalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean palindromo;
        String palavra = sc.nextLine();

        String invertida = new StringBuffer(palavra).reverse().toString();
        palindromo = palavra.equals(invertida);

        System.out.println ((palindromo) ? "TRUE" : "FALSE");

        }
}