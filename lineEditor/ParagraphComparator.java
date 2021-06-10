import java.util.*;


public class ParagraphComparator implements Comparator<Paragraph>{
	
	@Override
	public int compare(Paragraph o1, Paragraph o2) {
		
		int hello =	o1.getlinecount() - o2.getlinecount();
		if(hello != 0)
		{
			return hello;
			
		}
		else {
			for(int i=0; i<o1.getlinecount(); i++)
			{
			int hello2 = o1.getText(i).compareTo(o2.getText(i));
			if(hello2 != 0)
			{
				return hello2;
			}
			}
			return 0;
		}
		
	}

}
