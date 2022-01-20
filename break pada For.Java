class BreakPadaFor {
    public static void main(String[] args) {
        int a = 3, b = 2, c = 1, bil;
        System.out.println("Bil-A | Bil-B | Bil-C");
        System.out.println("---------------------------");
        for (bil = 1; bil <= 10; ++bil) {
            a += b;
            b += c;
            c += 2;
            System.out.println(a + "\t" + "|" + b + "\t" + "|" + c);
            if (c == 8)
                break;
        }
    }
}
