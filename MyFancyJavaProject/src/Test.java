public class Test {

    private static Test t = null;
    int year;

    private Test(int year) {
        this.year = year;

    }

    public static Test get_t(int year) {
        if (t == null) {
            t = new Test(year);
        }
        return t;
    }

    public static void main(String[] args) throws Exception {
        Test t = new Test(2022);

        System.out.println("Happy New Year " + t.year + "!");
    }
}
