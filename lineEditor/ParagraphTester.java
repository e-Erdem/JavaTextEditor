import java.util.Scanner;


enum Menu {
	M1("(1) Create a new paragraph"),
	M2("(2) Enter a new line"),
	M3("(3) Display a single paragraph by number"),
	M4("(4) Display all the document"),
	M5("(5) Search for a word"),
	M6("(6) Exit");
	
	private final String option;
	
	Menu (String givenoption) 
	{
		option = givenoption;
	}
	
	String getOption() {
		return option;
	}
}

enum SubMenu {
	M7("(1) Plain text print"),
	M8("(2) Formatted text print"),
	M9("(3) Detailed text print"),
	M10("(4) Sorted text print");
	
	private final String suboption;
	
	SubMenu (String givenoption) 
	{
		suboption = givenoption;
	}
	
	String getOption() {
		return suboption;
	}
}

public class ParagraphTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int flag=0;

		Scanner scan = new Scanner(System.in); //Creates object of the Scanner class.
		Document myDocument = new Document();
				
		while(i!=6) {
			
			
			for(Menu m : Menu.values()) {
				System.out.println(m.getOption());
			}
			
			
			
			try {
			i = scan.nextInt();
			scan.nextLine();
			}
			catch(Exception err) {
				System.err.println("Wrong Input. You should type a number");
				scan.nextLine();
				i=0;
				
			}
			
			
			if(i==1)
			{
				Paragraph myParagraph = new Paragraph();
				myDocument.insertParagraph(myParagraph);
				System.out.println("New Paragraph Created !");
			}
			
			
			if(i==2)
			{	
				int j = 0;
				String Line="";
				Paragraph para;
				
				try {
				System.out.println("Please enter the paragraph number: ");	
				j = scan.nextInt();
				scan.nextLine();
				flag=1;
				}
				catch(Exception err) {
					System.err.println("Wrong Input. You should type a number");
					scan.nextLine();
					j=0;
					i=0;
				}
				if(flag==1)
				{
				try {
				para = myDocument.getParagraph(j);
				para.Display();
				System.out.println("Please enter a line ");
				Line = scan.nextLine();
				para.setText(Line);
				flag=0;
				}
				catch(IndexOutOfBoundsException exception) {
				    System.err.println("NO SUCH PARAGRAPH !!!");
				}
				catch(InvalidLine inv) {
					para = myDocument.getParagraph(j);
					while(Line.isEmpty()) {
					System.err.println("Empty line is not accepted !");
					System.out.println("");
					System.out.println("Please enter a line ");
					Line = scan.nextLine();
					}
					para.setText_handle(Line);
					flag=0;
				}
				}
			}
			
