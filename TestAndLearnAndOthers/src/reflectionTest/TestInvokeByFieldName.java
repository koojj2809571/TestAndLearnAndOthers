package reflectionTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestInvokeByFieldName {

	public static void main(String[] args) {
		Human h = new Human();
		invokeGetterByFieldName(h);
	}
	
	/**
	 * 需求：根据已知变量名获取其变量值。
	 * 若想直接获取变量值，则该变量必须为静态常量
     * 故本次演示需通过已知变量名字符串获取其get方法
	 */
	private static void invokeGetterByFieldName(Human human){
		//根据该方法传入参数（需要获取变量值的类），通过反射相关方法获取Human对象的类的对象
		Class<Human> humanClass = (Class<Human>) human.getClass();
		//获取该类下所有变量，得到一个Field数组，遍历每一个元素获取其名称，添加到fieldNames中，模拟已知的字段名称
		Field[] fields = humanClass.getDeclaredFields();
		List<String> fieldNames = new ArrayList<>();
		for (Field field : fields) {
			String feldName = field.getName();
			fieldNames.add(feldName);
		}
		//遍历已知的字段名称数组取出每一个字段名字符串，拼接“get”获取方法名
		for (String fieldName : fieldNames) {
			String methodName = "get" + fieldName;
			try {
				//通过反射机制获取字段对应get方法
				//第一个参数：方法名称字符串
				//第二个参数：参数列表；新建Class对象数组，将方法所需参数的类的对象传入该数组，几个参数则该数组几个元素，无参数则传入空数组
				Method m = humanClass.getMethod(methodName, new Class[] {});
				//通过反射调用该方法
				//invoke方法返回Object对象，需要强制转型
				//第一个参数：需要调用犯法所属类对象
				//第二个参数：该方法需要参数；新建Object数组对象，将方法所需 参数传入该数组，几个参数则该数组几个元素，无参数则传入空数组
				int i = (int) m.invoke(human, new Object[]{});
				//打印测试
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}

}

/**
 * 测试类
 */
class Human{
	private int AA1 = 39;
	private int AA2 = 31;
	private int AA3 = 37;
	private int AA4 = 34;
	private int AA5 = 37;
	private int AA6 = 25;
	private int AA7 = 27;
	private int AA8 = 17;
	private int AA9 = 45;
	private int AA10 = 29;
	private int AA11 = 25;
	private int AA12 = 2;
	private int AA13 = 24;
	private int AA14 = 37;
	private int AA15 = 28;
	private int AA16 = 10;
	private int AA17 = 27;
	private int AA18 = 5;
	private int AA19 = 8;
	private int AA20 = 48;
	private int AA21 = 10;
	private int AA22 = 21;
	private int AA23 = 43;
	private int AA24 = 48;

	public int getAA1() {
		return AA1;
	}
	public void setAA1(int aA1) {
		AA1 = aA1;
	}
	public int getAA2() {
		return AA2;
	}
	public void setAA2(int aA2) {
		AA2 = aA2;
	}
	public int getAA3() {
		return AA3;
	}
	public void setAA3(int aA3) {
		AA3 = aA3;
	}
	public int getAA4() {
		return AA4;
	}
	public void setAA4(int aA4) {
		AA4 = aA4;
	}
	public int getAA5() {
		return AA5;
	}
	public void setAA5(int aA5) {
		AA5 = aA5;
	}
	public int getAA6() {
		return AA6;
	}
	public void setAA6(int aA6) {
		AA6 = aA6;
	}
	public int getAA7() {
		return AA7;
	}
	public void setAA7(int aA7) {
		AA7 = aA7;
	}
	public int getAA8() {
		return AA8;
	}
	public void setAA8(int aA8) {
		AA8 = aA8;
	}
	public int getAA9() {
		return AA9;
	}
	public void setAA9(int aA9) {
		AA9 = aA9;
	}
	public int getAA10() {
		return AA10;
	}
	public void setAA10(int aA10) {
		AA10 = aA10;
	}
	public int getAA11() {
		return AA11;
	}
	public void setAA11(int aA11) {
		AA11 = aA11;
	}
	public int getAA12() {
		return AA12;
	}
	public void setAA12(int aA12) {
		AA12 = aA12;
	}
	public int getAA13() {
		return AA13;
	}
	public void setAA13(int aA13) {
		AA13 = aA13;
	}
	public int getAA14() {
		return AA14;
	}
	public void setAA14(int aA14) {
		AA14 = aA14;
	}
	public int getAA15() {
		return AA15;
	}
	public void setAA15(int aA15) {
		AA15 = aA15;
	}
	public int getAA16() {
		return AA16;
	}
	public void setAA16(int aA16) {
		AA16 = aA16;
	}
	public int getAA17() {
		return AA17;
	}
	public void setAA17(int aA17) {
		AA17 = aA17;
	}
	public int getAA18() {
		return AA18;
	}
	public void setAA18(int aA18) {
		AA18 = aA18;
	}
	public int getAA19() {
		return AA19;
	}
	public void setAA19(int aA19) {
		AA19 = aA19;
	}
	public int getAA20() {
		return AA20;
	}
	public void setAA20(int aA20) {
		AA20 = aA20;
	}
	public int getAA21() {
		return AA21;
	}
	public void setAA21(int aA21) {
		AA21 = aA21;
	}
	public int getAA22() {
		return AA22;
	}
	public void setAA22(int aA22) {
		AA22 = aA22;
	}
	public int getAA23() {
		return AA23;
	}
	public void setAA23(int aA23) {
		AA23 = aA23;
	}
	public int getAA24() {
		return AA24;
	}
	public void setAA24(int aA24) {
		AA24 = aA24;
	}
}
