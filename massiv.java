import java.util.Arrays;
public class massiv  implements Runnable {
    @Override
    public void run() {
        float[] myArray = new float[1000000];

            for (int i = 1; i < myArray.length; i++) {
                myArray[i] = 1;

                myArray[i] = (float) (myArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
