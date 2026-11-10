import java.awt.Dimension;
import java.awt.Toolkit;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		
		int w=screenSize.width;
		int h=screenSize.height;
		
		Formulaire f=new Formulaire(w/3,h/3,100,50);
		f.setVisible(true);
		

	}

}
