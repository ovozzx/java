package practice.mission.problem31;

public class Main {

	public static void main(String[] args) {
		Drinks[] drinks = new Drinks[3];
		drinks[0] = new Drinks("콜라", 2000);
		drinks[1] = new Drinks("사이다", 1000);
		drinks[2] = new Drinks("환타", 1000);
		
		Alchol[] alchols = new Alchol[2];
		alchols[0] = new Alchol("소주", 4000);
		alchols[1] = new Alchol("맥주", 2000);

		Customer[] customers = new Customer[2];
		customers[0] = new Customer("소영", 30, 10000, 0, 0);
		customers[1] = new Customer("정은", 18, 1000, 0, 0);
		
		Bar bar = new Bar(drinks, alchols, customers);
		bar.sellAlchol(5);
	}
}
