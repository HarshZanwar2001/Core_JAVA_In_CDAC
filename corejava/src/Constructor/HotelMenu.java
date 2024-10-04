package Constructor;

import java.util.ArrayList;
import java.util.Scanner;
class Menu{
	String foodnm;
	String type;
	int price;
	
	public Menu(String foodnm,String type,int price)
	{
		this.foodnm=foodnm;
		this.type=type;
		this.price=price;
	}
	public void displayMenu()
	{
		System.out.println("Dish Name = "+foodnm);
		System.out.println("Dish type = "+type);
		System.out.println("Dish price = "+price);
	}
}
public class HotelMenu {
	ArrayList<Menu> menuList = new ArrayList<>();
	
	
	public void addMenu(String foodnm,String type,int price)
	{
		Menu m = new Menu(foodnm,type,price);
		menuList.add(m);
	}
	
	public void displayMenu()
	{
		for (Menu m:menuList)
		{
			m.displayMenu();
			System.out.println("-------------------------------------");
		}
	}
	
	public static void main(String args[])
	{
		HotelMenu hm = new HotelMenu();
		Scanner sc=new Scanner(System.in);
		hm.addMenu("Dal Bati", "Thali" , 260);
		hm.addMenu("Indori veg", "Thali", 300);
		hm.displayMenu();
		System.out.println("Do you want to add food? (yes/no)");
		String res = sc.nextLine();
		
		
		if(res.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter Food Name = ");
			String fnm=sc.nextLine();
			System.out.println("Enter Food Type Like Thali/Chinese/Chat = ");
			String ftype=sc.nextLine();
			System.out.println("Enter price = ");
			int pri=sc.nextInt();
			hm.addMenu(fnm, ftype, pri);
			System.out.println("Updated List ");
			hm.displayMenu();
			
		}
		sc.close();
		
	}

}

