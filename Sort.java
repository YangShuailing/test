import java.*;

public class Sort{
	public static void main(String[] args){
	int arrsize = 10;
	Random random = new Random(arrsize);
	double[] sort = new double[arrsize];
	 for(int i=0;i<arrsize;i++){
		 sort[i] =(int) (random.nextDouble()*100);
		  System.out.println(sort[i]);
	 }
	 double[] bulleSort=bulleSort(double[] sort);
	}

		public bulleSort(double[] sort){
			int temp =0;
			for(int i=0;i<arrsize-1;i++){
				for(int j=0;j<arrsize-i;j++){
					if(sort[j]>sort[j+1]){
						temp = sort[j];
						sort[j]=sort[j+1];
						sort[j+1]=temp;
						
					}
				}
			}
			 for(int i=0;i<arrsize;i++){
				sort[i] =(int) (random.nextDouble()*100);
				System.out.println(sort[i]);
			}
	
	
}                                              