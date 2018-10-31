public class Paragraph implements Element{
	private String paragraph;
	AlignStrategy a=new AlignRight();
	public Paragraph(String paragraph){
		this.paragraph = paragraph;
	}
	public String getParagraph() {
		return paragraph;
	}
	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}
	
	@Override
	public void add(Element e) {
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getChild(int index) {
		a.printAligned(paragraph);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void print(){
		a.printAligned(paragraph);
	}
	
	public void setAlignStrategy(AlignStrategy align) {
		a=align;
	}
}