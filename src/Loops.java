public class Loops {

    public static void main(String[] args) {

//        boolean hasGoodCredit = false;
//        boolean hasGoodIncome = true;
//        boolean hasCriminalRecord = true;


//        String name = "Java Learning";
////
////        if(name.length()>5)
////            System.out.println("Length is > than 5");
////        else
////            System.out.println("Length < than 5");
////
////        String isLengthmorethanFive =  name.length() > 5?
////                                    "Length is > than 5" : "Length < than 5";
////
////        System.out.println(isLengthmorethanFive);

//        String message = "I am learning Java";
//        for(int count= 1; count <= 5; count++) {
//            System.out.println(message + count);
//        }

//        System.out.println("------------------");
//
//        String option = "Keep going";
//        int counter = 1;
//        while(true){
//            counter++;
//            if(counter < 4)
//                continue;
//            System.out.println(option+"-"+counter);
//            if(counter>5)
//                break;
//        }
//        int number = 10;
//        do{
//            System.out.println("Number is \t"+number);
//        }
//        while (number!=10);

        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("--------------------");

        for(int number:numbers){
            if(number>30)
                break;

            System.out.println(number);
        }


    }
}
