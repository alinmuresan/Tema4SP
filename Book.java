import java.util.ArrayList;
import java.util.List;

public class Book implements Element{
	private String title;
	private List<Author> authors = new ArrayList<Author>();
	private List<Element> chapters = new ArrayList<Element>();

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
//
//	public List<Author> getAuthors() {
//		return authors;
//	}
//
//	public void setAuthors(List<Author> authors) {
//		this.authors = authors;
//	}
//
//	public List<Chapter> getChapters() {
//		return chapters;
//	}
//
//	public void setChapters(List<Chapter> chapters) {
//		this.chapters = chapters;
//	}
//
	public void addAuthor(Author author) {
		authors.add(author);
	}
//
//	public int createChapter(String title) {
//		Chapter chapter = new Chapter(title);
//		chapters.add(chapter);
//		return chapters.indexOf(chapter);
//	}
//
//	public Chapter getChapter(int index) {
//		return chapters.get(index);
//	}
//	
//	
//	
//	public void print(){
//		System.out.println("BOOK " + title);
//		System.out.println("AUTHORS");
//		for (int i = 0; i<authors.size(); i++){
//			System.out.println(authors.get(i).getName());
//		}
//		
//		System.out.println("CHAPERS");
//		for (int i = 0; i<chapters.size(); i++){
//			System.out.println(chapters.get(i).getChapterTitle());
//		}
//	}

	@Override
	public void add(Element e) {
		chapters.add(e);
		
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println(title);
		for (Element elem : chapters){
			elem.print();
		}
		
	}

}
