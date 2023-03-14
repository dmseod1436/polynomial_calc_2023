package com.ll;

public class Calc {
    public static int run(String exp) {
        exp = exp.replaceAll("- ", "+ -");
        boolean needToMulti = exp.contains("*");
        boolean needToPlus = !needToMulti;

        String[] bits = exp.split(" \\+ ");
        if (needToPlus) {
            exp = exp.replaceAll("- ", "+ -");

            int sum = 0;
            String[] bits = exp.split(" \\+ ");

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
                int sum = 0;

                for (int i = 0; i < bits.length; i++) {
                    sum += Integer.parseInt(bits[i]);
                }

                return sum;
            }
        else if (needToMulti) {
                String[] bits = exp.split(" \\* ");

                int sum = 1;

                return sum;
                for (int i = 0; i < bits.length; i++) {
                    sum *= Integer.parseInt(bits[i]);
                }

                return sum;
            }

            // throw new RuntimeException("올바른 계산식이 아닙니다.");
            throw new RuntimeException("올바른 계산식이 아닙니다.");
        }
    }
}