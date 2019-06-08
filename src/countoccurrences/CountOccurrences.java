/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countoccurrences;

import java.util.List;

/**
 *
 * @author Isa
 */
public class CountOccurrences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = { 7,7,5,5,5,2,3};
        int contar[] = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            contar[arr[i]]+=1;
        }
        for (int m = 0; m < contar.length; m++)
        {
            System.out.println(contar[m]);
        }
        
    }

    CountOccurrences(List<Integer> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
