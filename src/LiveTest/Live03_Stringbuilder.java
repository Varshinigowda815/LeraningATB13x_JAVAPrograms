package LiveTest;

public class Live03_Stringbuilder {
    public static void main(String[] args) {
        int iterations = 100_000;

        // 1. String concatenation using +
        long start1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str = str + i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time with String (+): " + (end1 - start1) + " ms");

        // 2. Using StringBuilder
        long start2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end2 - start2) + " ms");

        // 3. Using StringBuffer
        long start3 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (end3 - start3) + " ms");

    }
}
