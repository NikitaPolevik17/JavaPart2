package HomeWork2;

public class NumberHolder {
    private int firstInt;
    private float firstFloat;

    public static void main(String[] args) {
        NumberHolder aNumberHolder = new NumberHolder();
        aNumberHolder.firstInt = 5;
        aNumberHolder.firstFloat = 10f;

        System.out.println(aNumberHolder.firstInt);
        System.out.println(aNumberHolder.firstFloat);
    }
}