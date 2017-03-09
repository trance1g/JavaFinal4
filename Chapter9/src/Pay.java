
public class Pay {

	public double[] employeeRaise(double[] wages){
		for(int i = 0;i < wages.length;i++){
			wages[i] += 2;
		}
		
		return wages;
	}
	
	public double getHighLow(double[] wages){
		double low = wages[0];
		int temp = 0;
		for(int i = 0;i < wages.length;i++){
			if(wages[i] < low){
				temp = i;
			}
			
		}
		double high = wages[0];
		int place = 0;
		for(int i = 0;i < wages.length;i++){
			if(wages[i] > high){
				place = i;
			}
			
		}
		return ;
		
	}
	
}
