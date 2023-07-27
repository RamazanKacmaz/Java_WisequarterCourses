package day29_passByValue;

public class C01_statickBlocks {

    C01_statickBlocks (){
        System.out.println("vsdddddssssssssssssssssssssss");
    }
    static {
        System.out.println("aaaa222222222222222222aa");
    }
    public static void main(String[] args) {

        System.out.println("vfffffffffffffffffffffff");

        C01_statickBlocks obj = new C01_statickBlocks();
        System.out.println("ffffffffffffffffffff");
    }

    static {
        System.out.println("a1111111111111111111111a");
    }
    {
        System.out.println("========================");
    }

}
