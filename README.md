Instructions for Creating your First SOAP WebService 

1. Create a dynamic web application in eclipse with the name WebService

2. Under the Java Resources folder, create a package named “helloservice.endpoint”

3. In that package create a class named Hello

4. Copy the below text to the file and save it
package helloservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Hello {
    private String message = new String("Hello, ");

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
5. Save your project and compile


6. Run the following command from your project directory command line “wsgen -classpath build/classes/ -wsdl -r WebContent/WEB-INF/wsdl -s src -d build/classes/ helloservice.endpoint.Hello” to generate the web service using wsgen tool

7. Refresh your project in eclipse

8. You will see that you will get the web service directory and classes there

9. Also you will notice that there is a WSDL directory created under WEB-INF with the wsdl and the xsd

10. Compile the code again in eclipse

11. Export the code to a war file with the same name as the project

12. Run glass fish

13. Deploy the war file to class fish

Creating the client Side
1. Create a java project in eclipse with empty source call it WebServiceClient

2. Flip to the command line and go to the source directory of your and type
D:\College\WebServiceClient\src>wsimport -s . http://localhost:8080/WebService/H
elloService?wsdl

3. Go back to your eclipse and refresh the project

4. Create a class for the client with the code 
import helloservice.endpoint.Hello;
import helloservice.endpoint.HelloService;


public class Client 
{
	public static void main(String[] args)
	{
	 
		HelloService service = new HelloService();
		Hello greeting = service.getHelloPort();
		System.out.println("------->>  Call Started");
		System.out.println(greeting.sayHello("Lovely people"));
		System.out.println("------->>  Call Ended");
	}
}

5. Compile and run







14. Type the following in your browser http://localhost:8080/WebService/HelloService?wsdl this will get you the wsdl if everything is ok
