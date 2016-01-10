package cn.cdl.clazz;

interface HasBatteries{}
interface WaterProof{}
interface Shoots{}

class Toy{
	/*Toy() {
		System.out.println("Toy++++++++++++++++++++++++++++++++++++++++");
	}*/
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Shoots,WaterProof{
	FancyToy() {
		super(1);
	}
}
public class ToyTest {

	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("cn.cdl.clazz.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printInfo(clazz);
		Class<?>[] cc = clazz.getInterfaces();
		for(Class<?> c:cc){
			printInfo(c);
		}
		Class<?> superClazz = clazz.getSuperclass();
		printInfo(superClazz);
		try {
			superClazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void printInfo(Class<?> clazz){
		System.out.println("���ȫ�޶�����"+clazz.getName());
		System.out.println("��ļ�����"+clazz.getSimpleName());
		System.out.println("�ǲ��ǽӿڣ�"+clazz.isInterface());
		System.out.println("---------------------------------------");
	}

}
