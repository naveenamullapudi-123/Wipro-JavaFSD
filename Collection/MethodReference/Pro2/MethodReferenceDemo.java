public class MethodReferenceDemo {

    public static void main(String[] args) {

        // Static Method Reference
        DigitCountInterface dci = DigitUtil::digitCount;

        int num = 123456;
        int result = dci.countDigits(num);

        System.out.println("Number of digits in " + num + " = " + result);
    }
}