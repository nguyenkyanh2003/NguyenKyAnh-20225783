package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc (int id , String title, String category, float cost)
	{
		super(id,title, category, cost);
	}
 public void play()
 {
	 System.out.println("Playing DVD: "+ this.getTitle());
	 System.out.println("DVD Length: " + this.getLength());
 }
 public String toString()
 {
	 return "ID: " +getId() + ". DVD - " +getTitle()+" - " + getCategory() + " - " +getCost();
 }
}
