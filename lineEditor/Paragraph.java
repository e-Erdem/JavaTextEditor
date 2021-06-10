import java.util.ArrayList;

public class Paragraph {

	private int lineCount; //#of lines counter.
	ArrayList<String> arraylist;
	
	public Paragraph() {  //default constructor.
		
		arraylist = new ArrayList<String>();
	}
	
	public void LineCounter(int number) //LineCounter Method.
	{
		lineCount = number;
	}
	public int getlinecount()
	{
		return lineCount;
		
	}
	public String setText(String text) throws InvalidLine //Method for a new line entry.
	{
		if(text.isEmpty())
		{
			throw new InvalidLine("EmptyLine");
			
		}
		arraylist.add(text);
		lineCount++;
		return text;	
	}
	
	public String setText_handle(String text)
	{
		
		arraylist.add(text);
		lineCount ++;
		return text;
		
	}
	
	public void Display() //Method for displaying all the data entered.
	{
		for(int i=0; i<lineCount; ++i)
		{
			System.out.println("No:" + i + " " + arraylist.get(i));
		}	
	}
	
	public String getText(int hello) //Method for obtaining a specific line.
	{
		 return arraylist.get(hello);	
	}
	
	public void explorer(String search_word) //Single Line Word Searcher Algorithm (NOT IN USE !!!)
	{
		int flag = 0;
		for(int j=0; j<arraylist.size(); ++j)
		{
			int index = getText(j).indexOf(search_word);
			if((j == (arraylist.size()-1) && index == -1) && (flag==0))
			{
				System.out.println("Entered string is not found on a single line ...");	
			}
			else
				if(index!=-1){
				System.out.println("Line number of the word is " + j);
				flag=1;
				}
		}	
	}
	
	public void multiChecker(String search_word)
	{
		for(int i=0; i<arraylist.size()-1; i++)
		{
		if(arraylist.size() != i+1)
		{	
		if(getText(i+1) != null)
		{
		String firstWord =getText(i+1).substring(0,getText(i+1).indexOf(' ')); 
		String lastWord =getText(i).substring(getText(i).lastIndexOf(" ")+1);
		//String lastWord = getText(i).substring(getText(i).length() - 1);
		String concat = lastWord + " " + firstWord;
		if(concat.equals(search_word))
		{
			System.out.println("Line number of the word is "+i+"&"+(i+1));
			
		}
		}
		
		}
		}
	}
}
	
	
	
	
	

