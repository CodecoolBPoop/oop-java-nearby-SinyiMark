/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nearbyelements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cunamy
 */
public class ArrayNearby {
    int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7, 4},
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 },
        {45, 54, 778, 5234, 45625, 3}
    };
    public List nearby(int x, int y, int range){
        List<List<String>> resultListOList = new ArrayList<List<String>>();
        List<String> oneRowResult = new ArrayList<String>();
        int resultIndex;
        int minI1d;
        int maxI1d;
        for (int i = range * -1; i <= range ; i ++){
            oneRowResult = new ArrayList<String>();
            if ( x + i > multi.length -1  || x + i < 0){
                continue;}
            if (y - range > -1 ){
                minI1d = y - range;
            }else {
                minI1d = 0; 
            }
            if (y + range <= multi[x + i].length - 1 ){
                maxI1d = y + range;
            }else {
                maxI1d = multi[x + i].length - 1; 
            }     
            String itemToAdd = "";
            for (int j = minI1d; j <= maxI1d; j++) {
                if (j == y && x == x + i){
                    oneRowResult.add("#"); 
                }else{                    
                    itemToAdd = itemToAdd.valueOf(multi[x + i][j]);
                    oneRowResult.add(itemToAdd); 
                }
            }
            resultListOList.add(oneRowResult);           
    }
        return resultListOList;       
}
}




