package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.println((((number % 100) % 10) * 100 + ((number % 100)/ 10) * 10 + (number / 100)));
    }

//    public static void main(String[] args) {
//        new NumberReverter().revert(984);
//    }
}
