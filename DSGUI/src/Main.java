import javax.swing.*;
import java.awt.EventQueue;
public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(()->{
			MainWindow mw = new MainWindow();
			mw.setVisible(true);
			
		});
		EventQueue.invokeLater(()->{
			OrderWindow mw = new OrderWindow();
			mw.setVisible(true);
		});
	}

}
