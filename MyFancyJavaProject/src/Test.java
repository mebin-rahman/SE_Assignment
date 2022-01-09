public class Test {
    int year;
    String name;

    Test(int year, String name){
        this.year = year;
        this.name = name;
    
    }
    
    public static void main(String[] args) throws Exception {
        Test t = new Test(2022, "X");
        
        System.out.println("Happy New Year "+ t.year + ", " + t.name + "!");
    }
}
