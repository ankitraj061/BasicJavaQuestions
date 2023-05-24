class Test {
    public void m1(String s) {
        System.out.println("String arg method");
    }

    public void m1(StringBuffer d) {
        System.out.println("StringBuffer arg method");
    }

    public void m1(String c, String w) {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1("sachin");// String arg method
        t.m1(new StringBuffer("dhoni"));// StringBuffer arg method
        t.m1(null, null);// CE
    }
}
