public class Test {
    int year;

    Test(int year){
        this.year = year;
    
    }
    
    public static void main(String[] args) throws Exception {
        Test t = new Test(2022);
        
        System.out.println("Happy New Year "+ t.year + "!");
    }
}
