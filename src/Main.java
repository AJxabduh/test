//Abdul Jabbar Mohamed Sharif
//abduljm1@umbc.edu

public class Main {
    public static void main(String[] args) {
        System.out.println("===========Calling Constructor with 4 arguments=============");
        Mobile nokia1 = new Mobile("Nokia", "Win8", "Lumia", 10000);
        System.out.println(nokia1.toString());

        System.out.println("===========Calling Constructor with 2 arguments=============");
        Mobile nokia2 = new Mobile("Nokia", "Win8");
        System.out.println(nokia2.toString());

        System.out.println("===========Calling Constructor with 4 arguments=============");
        Mobile samsung1 = new Android("Samsung", "Android", "Grand", 30000);
        System.out.println(samsung1.toString());

        System.out.println("===========Calling Constructor with 2 arguments=============");
        Mobile samsung2 = new Android("Samsung", "Android");
        System.out.println(samsung2.toString());

        System.out.println("===========Calling Constructor with 4 arguments=============");
        Mobile blackberry1 = new BlackBerry("BlackBerry", "RIM", "Curve", 20000);
        System.out.println(blackberry1.toString());

        System.out.println("===========Calling Constructor with 2 arguments=============");
        Mobile blackberry2 = new BlackBerry("BlackBerry", "RIM");
        System.out.println(blackberry2.toString());

    }
}



