class WrongAge extends Exception{
    public WrongAge(String errorMessage){
        super(errorMessage);
    }
}


class Father {
    int fAge;
    Father(int a) throws WrongAge
    {
        if(a<0)
            throw new WrongAge("Age is less than Zero!!");
        fAge = a;
    }
}

class Son extends Father {
    int sAge;
    Son(int f, int s) throws WrongAge
    {
        super(f);
        if(s>=f)
            throw new WrongAge("Son cannot be older than Father");
        sAge = s;
    }
}

public class Main{
    public static void main (String[] args) {
        try{
            Son obj = new Son(-12,40);
        }
        catch(WrongAge e)
        {
            System.out.println(e);
        }
        System.out.println("Finished");
    }
}
