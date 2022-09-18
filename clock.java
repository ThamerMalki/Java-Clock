import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class clock {

	JFrame frame = new JFrame("Clock");
	
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	
	String time;
	String day;
	String date;
	
	clock(){
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("MV Boli",Font.PLAIN,60));
		timeLabel.setForeground(Color.BLUE);
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("MV Boli",Font.PLAIN,53));
		dayLabel.setForeground(Color.BLACK);
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("MV Boli",Font.BOLD,37));
		dateLabel.setForeground(Color.BLACK);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(timeLabel);
		frame.add(dayLabel);
		frame.add(dateLabel);
		frame.setTitle("Clock");
		frame.setLayout(new FlowLayout());
		frame.setSize(450,450);
		frame.setVisible(true);
		
		setTime();
	}
	public void setTime() {
		while(true) {
			
			time = timeFormat.format(Calendar.getInstance().getTime());
			day = dayFormat.format(Calendar.getInstance().getTime());
			date = dateFormat.format(Calendar.getInstance().getTime());
			
			timeLabel.setText(time);
			dayLabel.setText(day);
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
