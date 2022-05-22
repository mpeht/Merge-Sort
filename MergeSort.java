/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable size of vector
        int num;
        System.out.print("Enter the size of vector:");
        num = sc.nextInt();
        
        int vector[] = new int[num];
        System.out.print("Enter the values for vector fill: ");
        
        for (int i = 0; i < num; i++) {
            vector[i] = sc.nextInt();
        }
        
        MergeS(vector);

    }

    public static void MergeS(int vet[]) {

                if (vet.length >= 2) {

            int[] left = Arrays.copyOfRange(vet, 0,(vet.length / 2));
            int[] right = Arrays.copyOfRange(vet, (vet.length / 2), vet.length);

            MergeS(left);
            MergeS(right);
            Merge(vet, left, right);
        }
                
    }

    public static void Merge(int result[], int esq[], int dir[]) {

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= dir.length || (i1 < esq.length && esq[i1] <= dir[i2])) {
                result[i] = esq[i1];
                i1++;
            } else {
                result[i] = dir[i2];
                i2++;
            }
        }
         System.out.println(Arrays.toString(result));
    }
}
