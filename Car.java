package chapter6;

class CarInfor{
	public String color;
	public int speed ;
	public int level;
	
	public CarInfor(){//������ȫΪ�вι��췽��ʱ������������Ϊ������һ��Ĭ�ϵ��޲ι��췽����
	                  //��ʱһ��Ҫ�Լ�����һ���޲ι��췽������������޲ι��췽��ʱ�����
		
	}
	
	public CarInfor(String color){
		this.color = color;
		
	}
	
	public void gear(int level){
		this.level=level;
		this.speed=10*this.level*this.level;
	}
	public void derive(){
		System.out.println("��������������");
		System.out.println("����һ��С��");
		System.out.println("�ҵ���ɫ��"+color);
		System.out.println("��λ��"+level);
		System.out.println("ʱ�٣�"+speed);
	
	}
}

class CarInfor2{
	public static String yieldAddress = "����";
	public static int life = 15;
	public static void printYieldInfor(){
		System.out.println("����γ����ԣ�"+yieldAddress);
		System.out.println("ʹ�����ޣ�"+life);
	}
}

class ThisCar{
	String name = "����һ�к�ɫ��С��";
	public void sayName(){
		String name = "����һ����ɫ��С��";
		System.out.println(name); //û�м�this����ʾ�ֲ������е�name ��ɫ
		System.out.println(this.name); //����name����ʾȫ�ֱ����е�name ��ɫ
	}
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInfor Thomas = new CarInfor();
		Thomas.color = "��ɫ";
		Thomas.gear(5);
		Thomas.derive();
		System.out.println("=================================");
		CarInfor Thomas2 = new CarInfor("��ɫ");
		Thomas2.gear(10);
		Thomas2.derive();
		System.out.println("=================================");
		System.out.println("�����ķָ���");
		System.out.println("=================================");
		//CarInfor2 ChangChun1 = new CarInfor2();
		CarInfor2.printYieldInfor();
		CarInfor2.life = 20;
		CarInfor2.printYieldInfor();//�෽������ֱ��ʹ������.����������
		System.out.println("=================================");
		System.out.println("�����ķָ���");
		System.out.println("=================================");
		ThisCar A = new ThisCar();
		A.sayName(); 
	}

}
