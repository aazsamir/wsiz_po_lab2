import java.util.UUID;

/**
 * Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją
 * przykładowymi wartościami. Skorzystaj z pętli for-each, aby wypisać wszystkie wartości
 * tablicy ze wszystkimi literami zamienionymi na wielkie. Skorzystaj z funkcjonalności
 * toUpperCase wartości typu String
 * <p>
 * Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy. Następnie,
 * program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami
 * zapisanymi od końca do początku. Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i",
 * "psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".
 * <p>
 * Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
 * Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod,
 * który porówna obie tablice i odpowie na pytanie, czy są one takie same.
 */
public class ArrayString {
    private final int count = 5;

    private String[] array;

    private String[] secondArray;

    public ArrayString initRandomArray() {
        this.array = new String[this.count];

        for (int i = 0; i < this.count; i++) {
            String string = UUID.randomUUID().toString();
            this.array[i] = string;
        }

        return this;
    }

    public void printArray() {
        for (String element : this.array) {
            System.out.println(element + ",");
        }
    }

    public void printUpperCaseArray() {
        for (String element : this.array) {
            System.out.println(element.toUpperCase());
        }
    }

    public void printReversedArray() {
        for (int i = this.count - 1; i >= 0; i--) {
            String element = this.array[i];
            char[] chars = element.toCharArray();

            String reversed = "";

            for (int ii = chars.length - 1; ii >= 0; ii--) {
                reversed += chars[ii];
            }

            System.out.println(reversed);
        }
    }

    public ArrayString setSecondSameAsFirst() {
        this.secondArray = this.array.clone();

        return this;
    }

    public ArrayString AreArraysSame() {
        boolean same = this.compareArrays();

        if (same) {
            System.out.println("Arrays are same.");
        } else {
            System.out.println("Arrays aren't same.");
        }

        return this;
    }

    private boolean compareArrays() {
        if (this.array.length != this.secondArray.length) {
            return false;
        }

        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i] + " | " + this.secondArray[i]);
            if (this.array[i] != this.secondArray[i]) {
                return false;
            }
        }

        return true;
    }
}
