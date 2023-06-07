public class Main1 {
    public static void main(String[]args){
      
        int numbers [] =new int[] {1,2,3,4,5,6};
        int smallest = numbers[0];
        int largest = numbers[0];
        for(int i=0;i<=5;i++){
            if(numbers[i]>numbers[0]){
                largest = numbers[i];
            }
            else if(numbers[i]<numbers[0]){
                smallest = numbers[i];
            }
        }
        System.out.println("largest number is :" + largest);
           System.out.println("smallest number is :" + smallest);
        
    }

}
