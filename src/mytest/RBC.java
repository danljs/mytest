package mytest;

public class RBC {
	public int AMethod(boolean first, boolean second, boolean third)
    {
        int OptionOne = 1, OptionTwo = 2;
        
//		if (!first)
//        {
//            if (second)
//            {
//                if (third)
//                {
//                    return OptionOne;	// case	1: false true true
//                }
//                else if (!second)
//                {
//                    return OptionTwo;	// case 2: !first && second && !third && !second --- invalid
//                }
//                else
//                {
//                    return OptionOne;	// case 3: false true false
//                }
//            }
//            else
//            {
//                return OptionOne;		// case 4: false false true || false false false
//            }
//        }
//        else if (!third)
//        {
//            if (!second)
//            {
//                return OptionTwo;		// case 5: true false false
//            }
//        }
//        else if (!second)
//        {
//            return OptionTwo;			// case 6: true false true
//        }
//        if (!(third || !second))
//        {
//            return OptionTwo;			// case 7: true true false
//        }
//        return OptionOne;				// case 8: true true true
        
//        int option = OptionOne ;
//        if (first && !(third && second)){
//        	option = OptionTwo;			
//        }else{  
//            option = OptionOne;
//        }
        
        return first && !third || first && !second ? OptionTwo : OptionOne;				
        
    }
}
