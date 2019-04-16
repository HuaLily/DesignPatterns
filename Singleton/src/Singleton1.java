public class Singleton1 {
    private static Singleton1 singleton1 ;

    private Singleton1(){
        System.out.println("i am Singleton1");
    }; //私有的构造函数，防止外部new

    public static Singleton1 getInsatance(){   //开放的唯一获取实例的口
        if( singleton1 == null){ singleton1 = new Singleton1();}
        return singleton1;
    }
}
