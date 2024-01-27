package gara.latihan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("LATIHAN HARI KE EMPAT 0.1 ");
        System.out.println();

        // SORTING ARRAY DESC
        int[] angka = {3,2,1,6,5,4,7,8,9};
        System.out.println("Array : " + Arrays.toString(angka));

        Arrays.sort(angka);
        sort(angka);

        System.out.println("Array : " + Arrays.toString(angka));

        // PENJUMLAHAN ARRAY
        int[] angka1 = {1,2,3,4,5} ;
        int[] angka2 = {1,2,3,4,5} ;

        int[] angka3 = new int[angka1.length];

        for (int i = 0 ; i < angka1.length ; i++){
            angka3[i] = angka1[i] + angka2[i] ;
        }

        System.out.println("Array : " + Arrays.toString(angka3));

        // MERGE 2 ARRAY
        int satu = angka1.length;
        int dua = angka2.length;
        int[] angka4 = new int[satu + dua];
        int Temp = 0 ;

        for ( int i : angka1){
            angka4[Temp] = i ;
            Temp++;
        }

        for ( int i : angka2){
            angka4[Temp] = i ;
            Temp++;
        }

        System.out.println("Array : " + Arrays.toString(angka4));
    }

    private static void sort(int[] array){
        int temp ;

        for (int i = 0 ; i < array.length ; i++){
            for (int j = i+1 ; j < array.length ; j++){
                if (array[i] < array[j] ){
                    temp = array[j] ;
                    array[j] = array[i] ;
                    array[i] = temp ;
                }
            }
        }

    }


}
