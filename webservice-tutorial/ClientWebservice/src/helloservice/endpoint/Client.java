package helloservice.endpoint;

import helloservice.endpoint.Hello;
import helloservice.endpoint.HelloService;

public class Client {

	public static void main(String[] args) {
		HelloService service = new HelloService();
		Hello greeting =service.getHelloPort();
		System.out.println("Call webservice");
		System.out.println(greeting.sayHello("Brick"));
		System.out.println("End Service");

	}

}
