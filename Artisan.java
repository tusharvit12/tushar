import java.util.Scanner;

public class Artisan {
	
	public static void main(String[] args) {
				
		System.out.println("Welcome! Please pick your style:\n");
		System.out.println("1. Dyed Fabric:");
		System.out.println("2. Handloom Fabric");
		System.out.println("3. Printed Fabric");
		
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		switch(a) {
			case 1:  
				break;
			case 2: Shop s=new Shop();
					Cloth c=s.purchase();  
					c.clothBought();
				break;
			default:
				break;
		}
			
		Cloth c=new Cloth();
	}
}

class Plantation{
	
	Plantation buy() {
		Plantation p=new Plantation();
		return p;
	}
	
}
class Yarn extends Plantation{
	Weaver produce() {
		Weaver w= new Weaver();
		return w;
	}
}

class Handloom{
	Weaver produce() {
		System.out.println("Pick your Handloom Fabric type:");
		System.out.println("1. Ikat \n");
		System.out.println("2. Khadi \n");
		System.out.println("3. Handblock \n");
		System.out.println("4. Silk \n");
		System.out.println("5. Linen \n");
			
		Scanner sc=new Scanner(System.in);
		int b= sc.nextInt();
		
		Weaver w=null;
		switch(b) {
			case 1:  w=new Weaver();
					//w.weaving();		
			break;
			case 2: w=new Weaver();
			w.weaving();
				break;
			case 3: w=new Weaver();
			w.weaving();
				break;
			case 4:	w=new Weaver();
			w.weaving();
				break;
			case 5:	w=new Weaver();
			w.weaving();
				break;
			default:	System.out.println("Cannot Produce selected type of Fabric at this moment. Please Visit us Later!");
				break;
		}
		return w;
	}
}
	
class Weaver extends Handloom{
	Fabric weaving(){
		
		Fabric f=new Fabric();
		System.out.println("\n"+"Your Fabric is weaved with love by our skilled Artisan");
		return f;
	}
}

class Fabric extends Weaver{
	Cloth type() {
				
		
		Cloth c=new Cloth();
		return c;
	}
}

class Cloth{
	
	void clothBought() {
		System.out.println("Congratulations for buying handmade clothing from us :)");
	}
}

class Shop{
	
	Cloth purchase() {		
		Handloom h=new Handloom();
		Weaver w=h.produce();
		Fabric f=w.weaving();
		Cloth c=f.type();
		return c;
	}
}





//public class ProduecsARelationshipTest {
//
//	public static void main(String[] args) {
//
//		Applicant applicant = new Applicant();
//		Form form = new Form();
//		Application application = applicant.apply(form);
//
//		BankAdmin admin = new BankAdmin();
//		BankAccount baObj = admin.processApplication(application);
//
//
//		GirCow cow = new GirCow();
//		Milk m2 = cow.milkACow();
//		Curd c = m2.coagulate();
//		Butter b = c.churn();
//		ClarifiedButter cf = b.boil();
//
//		cf.healthyFood();
//
//		Curd c2 = new GirCow().milkACow().coagulate();
//		Butter b2 = new GirCow().milkACow().coagulate().churn();
//		ClarifiedButter cf2 = new GirCow().milkACow().coagulate().churn().boil();
//
//		Dairy dairy = new Dairy();
//		ClarifiedButter cf3 = dairy.purchase();
//		ClarifiedButter cf4 = dairy.purchase();
//		ClarifiedButter cf5 = dairy.purchase();
//		ClarifiedButter cf6 = dairy.purchase();
//
//	}
//}

//
//class Mammal
//{
//
//}

//class Cow extends Mammal //isA
//{
//	Horn left = new Horn(); //hasA
//	Horn right = new Horn(); //hasA
//	Hump hump = new Hump(); //hasA
//}
//class GirCow extends Cow //isA
//{
//	Milk milkACow() {
//		Milk m = new Milk();
//		return m;
//	}
//}
//
//class Milk
//{
//	Curd coagulate() {
//		Curd curd = new Curd();
//		return curd;
//	}
//}
//class Curd
//{
//	Butter churn() {
//		Butter butter = new Butter();
//		return butter;
//	}
//}
//
//class Butter
//{
//	ClarifiedButter boil() {
//		ClarifiedButter cf = new ClarifiedButter();
//		return cf;
//	}
//}
//
//class ClarifiedButter
//{
//	void healthyFood() {
//		System.out.println("Clarified Butter is the best for the total health....");
//	}
//}
//class Dairy
//{
//		ClarifiedButter purchase() {

//			GirCow cow = new GirCow();
//			Milk m2 = cow.milkACow();
//			Curd c = m2.coagulate();
//			Butter b = c.churn();
//			ClarifiedButter cf = b.boil();
//			return cf;
//		}
//}
//
//class Application { }
//class Form{ }
//class Applicant
//{
//	Application apply(Form f) {
//
//		Application app = new Application();
//		return app;
//	}
//}