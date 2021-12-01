public class ex1 {
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
  int biggest=0;
  for (int i=0;i<numbers.length;i++){
      if (biggest < numbers[i]){
          biggest=numbers[i];

      }
  }
        System.out.println(biggest);
    }
}
