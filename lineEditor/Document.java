import java.util.ArrayList;

public class Document {
	
	private int paragraphCount; //# of paragraph counter.
	ArrayList<Paragraph> arraylist;
	
public Document() {  //default constructor.
		
		arraylist = new ArrayList<Paragraph>();
		paragraphCount=0;
	}

public int getSize()
{
	return arraylist.size();

}

public int getparagraphCount()
{
	return paragraphCount;
}

public Paragraph insertParagraph(Paragraph para)
{	   arraylist.add(paragraphCount, para);
	   paragraphCount++;  
	   return para;
}

public Paragraph getParagraph(int number)
{
	return arraylist.get(number);
	
}

}
