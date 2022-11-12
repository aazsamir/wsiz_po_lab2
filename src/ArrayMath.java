import java.util.Random;

/**
 * Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
 * Elementy do tablicy mają zostać wylosowane z dowolnego przedziały. Należy zaproponować
 * oddzielną metodę do losowania liczb.
 * <p>
 * Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic. Pierwsza
 * tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.
 * <p>
 * Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
 * posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran. Dla przykładu, dla liczb 10,
 * -2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100. Zastanów się, jak można
 * posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie. Przetestuj je na różnych
 * zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów sortowania, np.
 * sortowania przez wstawianie. Działanie algorytmu omówiono szczegółowo na zajęciach
 * algorytmy i struktury danych.
 */
public class ArrayMath {
    protected int start = 0;
    protected int end = 100;
    protected int count = 10;
    protected int[] array = {};
    protected int[] secondArray = {};

    public ArrayMath setCount(int count) {
        this.count = count;

        return this;
    }

    public ArrayMath setStart(int start) {
        this.start = start;

        return this;
    }

    public ArrayMath setEnd(int end) {
        this.end = end;

        return this;
    }

    public ArrayMath setArray(int[] array) {
        this.array = array;

        return this;
    }

    public ArrayMath setRandomArray() {
        int[] array = this.getRandomArray(this.count);

        this.setArray(array);

        return this;
    }

    private int[] getRandomArray(int count) {
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = this.getRandomNumber();
        }

        return array;
    }

    private int getRandomNumber() {
        Random random = new Random();

        return (random.nextInt(this.end)) + this.start;
    }

    public ArrayMath printArray() {
        System.out.println("===");

        for (int element : this.array) {
            System.out.println(element + ",");
        }

        return this;
    }

    public int sum() {
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        return sum;
    }

    public int avg() {
        return this.sum() / this.array.length;
    }

    public ArrayMath setSecondArray() {
        this.secondArray = this.getRandomArray(this.count + 1);

        return this;
    }

    public void printSeconds() {
        boolean print = true;

        int length = this.array.length;
        if (this.secondArray.length > length) {
            length = this.secondArray.length;
        }

        for (int i = 0; i < length; i++) {
            if (print) {
                if (i < this.array.length) {
                    System.out.println(this.array[i] + ", ");
                }
                if (i < this.secondArray.length) {
                    System.out.println(this.secondArray[i] + ", ");
                }

            }

            print = !print;
        }
    }

    public ArrayMath sort() {
        for (int i = 0; i < this.array.length - 1; i++) {
            for (int ii = 0; ii < this.array.length - i - 1; ii++) {
                if (this.array[ii + 1] < this.array[ii]) {
                    int swap = this.array[ii];
                    this.array[ii] = this.array[ii + 1];
                    this.array[ii + 1] = swap;
                }
            }
        }

        return this;
    }

    public ArrayMath printArrayFactorials() {
        for (var element : this.array) {
            System.out.println(calcFactorial(element) + ", ");
        }

        return this;
    }

    private int calcFactorial(int number) {
        if (number <= 1) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

}
