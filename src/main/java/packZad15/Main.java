package packZad15;

import java.util.Random;

/*
15 Zadanie:
Napisz i określ złożoność metody:
 - Liczącej sumę dwóch liczb sum(a,b)
 - Liczącej sumę pięciu liczb sum(a,b,c,d,e,f)
 - Liczącej potęgę pow(a,b)
 - Liczącej sumę liczb w tablicy
 - Generującą tablicę losowych liczb
 - Generującą dwuwymiarową tablicę losowych liczb
 - Szukającą indeksu wskazanej wartości w posortowanej tablicy
 - Sklejającą dwie tablice typu int[]

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        int potega = pow(2, 4);
        System.out.println(potega);

        System.out.println();
        int[][] tab = getRandomDoubleTab();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        int[] tabIndex = new int[] {0, 1, 2, 2, 3, 4};
        int index = getElementIndexFromTable(02, tabIndex);
        System.out.println(index);
    }

    // Liczącej sumę dwóch liczb sum(a,b)
    // złożoność O(n)
    public static int sum(int a, int b) {
        return (a + b);
    }

    // Liczącej sumę pięciu liczb sum(a,b,c,d,e,f)
    // złożoność O(n)
    public static int sum5(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e);
    }

    // Liczącej potęgę pow(a,b)
    // złożoność O(n*n)
    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b ; i++) {
            result = result * a;
        }
        return result;
    }

    // Liczącej sumę liczb w tablicy
    // złożoność O(n)
    public static int sumOfTable(int[] tab) {
        int result = 0;
        for (int i : tab) {
            result += i;
        }
        return result;
    }

    // Generującą tablicę losowych liczb
    // złożoność O(n)
    public static int[] getRandomTab() {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        int[] tab = new int[length];
        for (int i = 0; i < length; i++) {
            tab[i] = random.nextInt(100);
        }
        return tab;
    }

    // Generującą dwuwymiarową tablicę losowych liczb
    // złożoność O(n*n)
    public static int[][] getRandomDoubleTab() {
        Random random = new Random();
        int lengthY = random.nextInt(10) + 1;
        int lengthX = random.nextInt(10) + 1;
        int[][] tab = new int[lengthY][lengthX];
        for (int i = 0; i < lengthY; i++) {
            for (int j = 0; j < lengthX; j++) {
                tab[i][j] = random.nextInt(20);
            }
        }
        return tab;
    }

    // Szukającą indeksu wskazanej wartości w posortowanej tablicy
    // złożoność O(n)
    public static int getElementIndexFromTable(int value, int[] tab) {
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == value) {
                index = i;
                break; // wtedy mamy pierwsze wystąpienie, lub bez break'a - wtedy ostatnie
            }
        }
        return index;
    }

    // Sklejającą dwie tablice typu int[]
}
