public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        ArrayMath arrayMath = new ArrayMath();
        arrayMath.setRandomArray();
        int sum = arrayMath.sum();
        int avg = arrayMath.avg();

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

        System.out.println("Task 2");
        arrayMath.setSecondArray().printSeconds();

        System.out.println("Task 3");
        ArrayString arrayString = new ArrayString();
        arrayString.initRandomArray().printUpperCaseArray();
        System.out.println("===");
        System.out.println("Task 4");
        arrayString.printReversedArray();

        System.out.println("Task 5");
        arrayMath.setCount(8).setRandomArray().printArray().sort().printArray();

        System.out.println("Task 6");
        arrayMath.setCount(4).setStart(1).setEnd(8).setRandomArray().printArray().printArrayFactorials();

        System.out.println("Task 7");
        arrayString.setSecondSameAsFirst().AreArraysSame();
    }
}