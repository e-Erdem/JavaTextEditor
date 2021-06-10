public class DetailedView extends PlainTextView {
	
	DetailedView(Document Doc)
	{
		super(Doc);
	}
	
	
@Override 
void print() 
{
	Paragraph para = new Paragraph();
	for(int i=0; i<Doc.getparagraphCount(); ++i)
	{
		para = Doc.arraylist.get(i);
		for(int j=0; j<para.getlinecount(); ++j) {
			if(j==0) {
				System.out.println("P"+i+"L"+j+"    " + para.getText(j) );
			}
			else
		System.out.println("P"+i+"L"+j+" "+ para.getText(j));
		}
		System.out.println("");
	}	
	
}
	
	
}
	