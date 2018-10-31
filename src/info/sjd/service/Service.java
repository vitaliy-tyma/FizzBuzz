package info.sjd.service;

public class Service {
//   private int max;
//    public Service(int max) {
//        System.out.println("******************* Service Started *******************");
//    }
    public static void FizzBuzz(int max) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max; i++){

            if (i%3 == 0){
                sb.append("Fizz");
            }
            if (i%5 == 0){
                sb.append("Buzz");
            }

            if (i%3 != 0 && i%5 != 0){
                sb.append(Integer.toString(i));
            }
            System.out.println(sb);
            sb.setLength(0);


        }
    }
}
