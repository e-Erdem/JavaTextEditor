import java.util.ArrayList;
import java.util.Collections;

public class SortedView extends PlainTextView{
	
	SortedView(Document Doc)
	{
		super(Doc);
	}
	
@Override 
void print() 
{
	ArrayList<Paragraph> arraylist1 = new ArrayList<Paragraph>();
	for(int i = 0; i< Doc.getSize(); i++)
	{
		arraylist1.add(Doc.getParagraph(i));
	}
	Collections.sort(arraylist1, new ParagraphComparator());
	
	Paragraph para = new Paragraph();
	for(int j=0; j<arraylist1.size(); ++j) {
		para = arraylist1.get(j);
		for(int u=0; u<para.getlinecount(); ++u)
		{
		System.out.println(para.getText(u));
		}
		System.out.println("");
	
}


}

}


