package oasis;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

class Login{
	private String ids;
	private String password;
	public Login(){
		ids="Vaidehi";
		password="1234vd";
				
	}
	
	void log(String id1,String pass1) {
		
		if(id1.equals(ids) && pass1.equals(password)) {
			System.out.println("Login Succesfull!!!");
		}
		else {
			System.out.println("Invalid Credentials...");
			System.exit(0);
		}
	}
	void updt(String id2,String pass2) {
		ids=id2;
		password=pass2;
		System.out.println("Password Changed Succefully!!!");
		
	}
	void answ(String a,String b, String c, String d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	void time() {
		Timer timer =new Timer();
		TimerTask task=new TimerTask() {
			public void run() {
				
					System.out.println("time up...");
//					System.out.println("next quetion...");
					timer.cancel();					
				}
			
		};

		
		timer.schedule(task, 2*60*1000);
		
	}
	public int cout =0;
	void MCQ(int i) {
		Scanner sc=new Scanner(System.in);
		

		String a,b,c,d,e;
		
		
				switch (i){
		
			case 1:
				

				System.out.println("1.)Which statement is true about Java?");
				a="a:Java is a sequence-dependent programming language";
				b="b:Java is a code dependent programming language";
				c="c:Java is a platform-dependent programming language";
				d="d:Java is a platform-independent programming language";
				
				answ(a,b,c,d);
				e=sc.next();

				System.out.println(e.equals("d")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 2:
				 

				System.out.println("2.)Which component is used to compile, debug and execute the java programs?");
				a="a:JRE";
				b="b:JIT";
				c="c:JDK";
				d="d:JVM";
				
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("c")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 3:
				

				System.out.println("3.)Which one of the following is not a Java feature?");
				a="a:Object-oriented";
				b="b:Use of pointers";
				c="c:Portable";
				d="d:Dynamic and Extensible";
				
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("b")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 4: 
				

				System.out.println("4.)Which of these cannot be used for a variable name in Java?");
				a="a:identifier & keyword";
				b="b:identifier";
				c="c:keyword";
				d="d:none of the mentioned";
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("c")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
				
			case 5:
				

				System.out.println("5.)What is the extension of java code files?");
				a="a:.js";
				b="b:.txt";
				c="c:.class";
				d="d:.java";
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("d")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 6:
				

				System.out.println("6.)Which environment variable is used to set the java path?");
				a="a:MAVEN_Path";
				b="b:JavaPATH";
				c="c:JAVA";
				d="d:JAVA_HOME";
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("d")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 7:
				

				System.out.println("7.)Which of the following is not an OOPS concept in Java?");
				a="a:polymorphism";
				b="b:Inheritance";
				c="c:Compilation";
				d="d:Encapsulation";
				answ(a,b,c,d);
				e=sc.next();
				
				System.out.println(e.equals("c")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 8:
				

				System.out.println("8.)What is not the use of \"this\" keyword in Java?");
				
				a="a:Referring to the instance variable when a local variable has the same name";
				b="b:Passing itself to the method of the same class";
				c="c:Passing itself to another method";
				d="d:Calling another constructor in constructor chaining";
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("b")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 9:
				

				System.out.println("9.)Which of the following is a type of polymorphism in Java Programming?");
				
				a="a:Multiple polymorphism";
				b="b:Compile time polymorphism";
				c="c:Multilevel polymorphism";
				d="d:Execution time polymorphism";
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("b")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
			case 10:
				

				System.out.println("10.)Which exception is thrown when java is out of memory?");
				a="a:MemoryError";
				b="b:OutOfMemoryError";
				c="c:MemoryOutOfBoundsException";
				d="d:MemoryFullException";
				answ(a,b,c,d);
				e=sc.next();
				System.out.println(e.equals("b")?"Correct answer"+cout++:"Incorect answer");
				
				break;
				
				default:
					System.out.println("wrong value entered");
					break;
			
		}
				
		
	}
	void logout() {
		System.out.println("You Scored "+cout+" marks in the quiz");
		System.out.println("Logout Successfull!!!!");
		System.exit(0);
	}
			
		
		
	}

	
	
	
public class task4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Login lo=new Login();
		
		System.out.println("Enter your id:");
		String id=sc.nextLine();
		
		System.out.println("enter your password:");
		String pass=sc.nextLine();
		
		lo.log(id, pass);
		
		System.out.println("would You like to change your id and password");
		System.out.println("Press Y for 'yes' and N for 'No'");
		String cng=sc.nextLine();
		
		if(cng.equals("Y")) {
			
			System.out.println("Enter Your updated id:");
			id=sc.nextLine();
			
			System.out.println("Enter your updated password:");
			pass=sc.nextLine();
			
			lo.updt(id, pass);
			
		}
		
		System.out.println("Get Ready for the quiz....");	
		System.out.println("You will qet 2 minute to attemp the quiz");
		System.out.println("There will be 10 question in the quiz ");
		System.out.println("Press \"q\" when you are ready");
		String spc=sc.next();
		if(spc.equals("q")) {
			
			lo.time();
			
			for(int i=1;i<=10;i++) {
				
				lo.MCQ(i);
				

		}
		}
		System.out.println("Your quiz ended...");
		System.out.println("Enter \"L\" to view score and logout ");
		String l=sc.next();
		if(l.equals("L")) {
			
			lo.logout();
		}
		
	}
}