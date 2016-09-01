import java.util.*;
public class Formula {
	
	String college[]= {"Deogiri", "MIT", "IIT", "Vivekanand", "COEP","JNEC", "Holy Cross", "Cambriger","Manipal","St. Lawrence","Icon","SBOA", "Sarda Mandir" };
	int b[] = {70,140,180,50,160,120,49,130,129,160,57,110,102};
	int a=0 ,z, k[];
	
	Formula(int t){
		//Arrays.sort(b);	
		//for (int i =0; i<b.length; i++){System.out.println(b[i]);}
		for (int i =0; i<b.length; i++){
			 z = t - b[i];
			 if (z < 0){ z = z * (-1);};
			 
			 if (z<30){
				 System.out.println("CutOff is "+b[i]+" for "+college[i]);
			 }
			
		
		}
	}
}		
		
		
		
		
	/*for (int i =0; i<b.length; i++){
		
		if(b[i] < t){
			
			System.out.println("CutOff is "+b[i]+" for "+college[i]);
			a++;
			if(a>3){break;}
			//c[j]=i;
			//j++;
		}	
		
		
	}
	
		
	if(a==0){
		System.out.println("not eliglible");			
	}*/

