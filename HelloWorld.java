package javalab.basic;


// source code(.java) = complier(.class) > JVM 실행 
public class HelloWorld { // 클래스 파스칼 표기법

	public static void main(String[] args) {
		//String = 클래스, 대문자로 시작함
		
		System.out.print("Hello World!!!");
		
		String version = System.getProperty("java.version");
		//get+Property = 함수, 카멜 표기법 소+대
		//System = 클래스, 대문자로 시작함
		System.out.print("Java Version" + version);
		
	}

}
