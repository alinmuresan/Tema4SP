
public class Lab4 {
	public static void main (String []args){
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author gheo = new Author ("Radu Pavel Gheo");
		noapteBuna.addAuthor(gheo);
		noapteBuna.add(new Paragraph("Multumesc, ... "));
		Element cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Aici..."));
		Element cap11 = new Section("Subcapitol 1.1");
		cap11.add(new Section("Sub subcapitol 1.1.1"));
		cap11.add(new Paragraph("Primul sub subcapitol"));
		cap11.add(new Section("Sub subcaptiol 1.1.2"));
		cap11.add(new Paragraph("Al doilea sub subcapitol"));
		Element cap12 = new Section("Subcapitol 1.2");
		cap1.add(cap11);
		cap1.add(cap12);
		noapteBuna.add(cap1);
		
		noapteBuna.print();
		
		long startTime = System.currentTimeMillis();
		Section cap4 = new Section ("Photo");
		cap4.add(new Image ("Alin Muresan"));
		Section cap2 = new Section ("Auto show");
		cap2.add(new Image ("My dream BMW"));
		cap2.add(new Image ("My car is a BMW"));
		cap4.print();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
		
		
	}
}
