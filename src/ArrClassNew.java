public class ArrClassNew {
    public static void main(String[] args) {

      /*  String[] strArr = new String[10]; // одномерный массив
        strArr[4] = "Hei";
        System.out.println(strArr[4]);
*/

        String[] days = {"M", "D", "M"};
        System.out.println(days[2]);

        for (int i =0; i< days.length; i++) {

            System.out.println(i);
        }

        double[] arr1 = new double[4];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random();
            System.out.println(arr1[i]);

        }


    }
}

