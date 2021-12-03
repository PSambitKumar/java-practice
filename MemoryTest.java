class MemoryTest{
    MemoryTest i;
    public static void main(final String args[]) {
        final Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        for (int i = 0; i < 100000; i++) {
            final MemoryTest ob = new MemoryTest();
        }
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
    }
}