package jp.co.diworks.action;

public class Test {

	public static void main(String[] args) {
		Person saito = new Person();
		Robot aibo = new Robot();
		Robot asimo = new Robot();
		Robot papper = new Robot();
		
		saito.name = "斎藤誠";
		saito.age = 31;
		saito.phoneNumber1 = "08012345678";
		saito.phoneNumber2 = 1234567890; //変数の型をintにした状態で「0」から始まる数字だとエラーになる
		saito.address = "東京都多摩市○○町１丁目２番１３号";
		aibo.name = "aibo";
		asimo.name= "asimo";
		papper.name = "papper"; 
		
		System.out.println(saito.name);
		System.out.println(saito.age);
		System.out.println(saito.phoneNumber1);
		System.out.println(saito.address);
		saito.talk();
		saito.walk();
		saito.run();
		aibo.talk();
		asimo.walk();
		papper.run();

	}
	

}
