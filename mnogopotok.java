public class mnogopotok {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        massiv first = new massiv();
        first.run();
        System.out.println("Perviy metod: " + (System.currentTimeMillis() - a));
Potok second = new Potok();
second.run();
    }
}



