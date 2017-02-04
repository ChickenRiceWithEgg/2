package chapter6;

class CarInfor{
	public String color;
	public int speed ;
	public int level;
	
	public CarInfor(){//当类中全为有参构造方法时，编译器不会为类设置一个默认的无参构造方法，
	                  //此时一定要自己创建一个无参构造方法，否则调用无参构造方法时会出错
		
	}
	
	public CarInfor(String color){
		this.color = color;
		
	}
	
	public void gear(int level){
		this.level=level;
		this.speed=10*this.level*this.level;
	}
	public void derive(){
		System.out.println("呜呜呜呜呜呜呜");
		System.out.println("我是一列小火车");
		System.out.println("我的颜色是"+color);
		System.out.println("档位："+level);
		System.out.println("时速："+speed);
	
	}
}

class CarInfor2{
	public static String yieldAddress = "长春";
	public static int life = 15;
	public static void printYieldInfor(){
		System.out.println("本款轿车产自："+yieldAddress);
		System.out.println("使用年限："+life);
	}
}

class ThisCar{
	String name = "我是一列红色的小火车";
	public void sayName(){
		String name = "我是一列绿色的小火车";
		System.out.println(name); //没有加this，表示局部变量中的name 绿色
		System.out.println(this.name); //加了name，表示全局变量中的name 红色
	}
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInfor Thomas = new CarInfor();
		Thomas.color = "红色";
		Thomas.gear(5);
		Thomas.derive();
		System.out.println("=================================");
		CarInfor Thomas2 = new CarInfor("紫色");
		Thomas2.gear(10);
		Thomas2.derive();
		System.out.println("=================================");
		System.out.println("华丽的分割线");
		System.out.println("=================================");
		//CarInfor2 ChangChun1 = new CarInfor2();
		CarInfor2.printYieldInfor();
		CarInfor2.life = 20;
		CarInfor2.printYieldInfor();//类方法可以直接使用类型.方法名调用
		System.out.println("=================================");
		System.out.println("华丽的分割线");
		System.out.println("=================================");
		ThisCar A = new ThisCar();
		A.sayName(); 
	}

}
