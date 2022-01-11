public class Test {

    private static Test t = null;
    int year;
    String name;

    private Test(int year, String name) {
        this.year = year;
        this.name = name;

    }

    public static Test get_t(int year, String name) {
        if (t == null) {
            t = new Test(year, name);
        }
        return t;
    }

    public static void main(String[] args) throws Exception {

        Test t = new Test(2022, "X");

        System.out.println("Happy New Year " + t.year + ", " + t.name + "!");

    }
}
