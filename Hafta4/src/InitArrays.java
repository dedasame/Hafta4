public class InitArrays {

	public static void main(String[] args) {
		// int[] array = new int[10];
		int[] array = {32,27,64,18,95,14,90,70,60,37};
		
		System.out.printf("%s%8s%n","Index","Value");
		
		for(int counter = 0;counter<array.length;counter++) {
			System.out.printf("%5d%8d%n ",counter,array[counter]);
			}
		
		System.out.println("Ters cevrilmis hali");
		
		for(int i=0;i<array.length/2;i++) {
			int tmp;
			tmp=array[i];
			array[i]=array[(array.length-1)-i];
			array[(array.length-1)-i]=tmp;		
		}	
		
		for(int j=0;j<array.length;j++) {
			System.out.printf("%5d%8d%n",j,array[j]);	
		}
		
		
		
	}
}
