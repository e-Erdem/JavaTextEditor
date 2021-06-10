
public class PlainTextView {
	
	public Document Doc;
	
	public PlainTextView(Document Doc) {
		
		this.Doc = Doc;
	}
	
	void print() {
		
		Paragraph para = new Paragraph();
		for(int i=0; i<Doc.getparagraphCount(); ++i)
		{
			para = Doc.arraylist.get(i);
			for(int j=0; j<para.getlinecount(); ++j) {
			System.out.println( para.getText(j));
			}
		}	
		
	}

}
