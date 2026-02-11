package PST;

public class main{
	 
	 
    public static void main(String[] args) {
 
     InformationTechnology1 myObj = new InformationTechnology1();
     myObj.Subject1();
     myObj.Subject2();
     myObj.Subject3();
     myObj.Subject4();
     
     InformationTechnology2 myObj2 = new InformationTechnology2();
     myObj2.Subject5();
     myObj2.Subject6();
     myObj2.Subject7();
     myObj2.Subject8();
 }
   
}

class InformationTechnology1 {
 public void Subject1() {
     System.out.println("IT1: Python");
 }

 public void Subject2() {
     System.out.println("IT1: C programming");
 }

 public void Subject3() {
     System.out.println("IT1: web essentisl");
 }

 public void Subject4() {
     System.out.println("IT1:Cyber Security");
 }
}

class InformationTechnology2 {
 public void Subject5() {
     System.out.println("IT2: DSA"); 
     
 }
 public void Subject6() {
     System.out.println("IT2: OOPS"); 
     
 }
 public void Subject7() {
     System.out.println("IT2: DBMS");
     }
 public void Subject8() {
     System.out.println("IT2: CN"); 
     
 }
}


