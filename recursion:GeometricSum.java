
import java.util.*;
public class solution {

	public static double findGeometricSum(int k){
		if(k==0){
			return 1;
		}
       return findGeometricSum(k-1)+1/Math.pow(2,k);

	}
}
