package maxminapp;

public class MinMaxApp {
    public static void main(String[] args) {
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();

        Integer[] intArray = {3, 5, 7, 2, 8};
        String[] strArray = {"apple", "orange", "banana", "pear"};
        Character[] charArray = {'a', 'z', 'm', 'x'};
        Float[] floatArray = {3.4f, 1.2f, 5.6f, 7.8f};

        System.out.println("Integer Array: Min = " + intMinMax.min(intArray) + ", Max = " + intMinMax.max(intArray));
        System.out.println("String Array: Min = " + strMinMax.min(strArray) + ", Max = " + strMinMax.max(strArray));
        System.out.println("Character Array: Min = " + charMinMax.min(charArray) + ", Max = " + charMinMax.max(charArray));
        System.out.println("Float Array: Min = " + floatMinMax.min(floatArray) + ", Max = " + floatMinMax.max(floatArray));
    }
}
