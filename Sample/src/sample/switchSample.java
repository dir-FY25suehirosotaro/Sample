package sample;

import javax.sql.rowset.CachedRowSet;
import javax.swing.DefaultBoundedRangeModel;

public class switchSample {

    public static void main(String[] args) {
        var score = 72;
        
        switch (score / 10 ) {
        case 10 -> System.out.println("◎");
        case 9 , 8 -> System.out.println("〇");
        case 7 , 6 -> System.out.println("△");
        default -> System.out.println("×");
    }

            
        }
        

    }

