import java.util.Arrays;
class Potok {
    final int SIZE = 1000000;
final int HALF_SIZE = SIZE/2;

    public void run() {
float[] arr = new float[SIZE];
float[] arr1 = new float[HALF_SIZE];
float[] arr2 = new float[HALF_SIZE];
Arrays.fill(arr, 1);
long a = System.currentTimeMillis();
System.arraycopy(arr, 0, arr1, 0, HALF_SIZE);
System.arraycopy(arr, HALF_SIZE, arr2, 0, HALF_SIZE);
Thread first = new Thread (new Mat(arr1, 0));
Thread second = new Thread (new Mat(arr2, HALF_SIZE));
first.start();
second.start();
try {
    first.join();
    second.join();
} catch (InterruptedException e) {
    e.printStackTrace();
}
System.arraycopy(arr1, 0, arr, 0, HALF_SIZE);
System.arraycopy(arr2, 0, arr, HALF_SIZE, HALF_SIZE);
        System.out.println("Vtoroi metod: " + (System.currentTimeMillis() - a));
    }
}
class Mat implements Runnable {
    private float[] array;
    private int beat;

    Mat(float[] array, int beat) {
this.array = array;
this.beat = beat;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++)
            array[i] = (float)(array[i] * Math.sin(0.2f + (i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2)));

    }
}

