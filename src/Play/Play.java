package Play;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play play = new Play();
		play.init();
	}

	public void init() {
		JFrame frame = new JFrame();
		frame.setTitle("哈哈哈");
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel("做我女朋友吧");
		frame.add(label1);
		label1.setBounds(150, 50, 300, 80);
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("宋体", 0, 30));
		
		JButton button1 = new JButton("好");
		frame.add(button1);
		button1.setBounds(120, 250, 80, 30);
		button1.setFont(new Font("宋体", 0, 20));
		button1.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame j = new JFrame();
				j.setTitle("嘿嘿");
				j.setSize(300, 300);
				j.setLocationRelativeTo(null);
				j.setResizable(false);
				j.setVisible(true);
				j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				j.setLayout(null);
				
				ImageIcon image00 = new ImageIcon("D:\\微软俱乐部\\timg.jpg");
				image00.setImage(image00.getImage().getScaledInstance(300, 280,Image.SCALE_DEFAULT ));
				JLabel image1 = new JLabel(image00);
				j.add(image1);
				image1.setBounds(0, 0, 300, 280);
			}
			
		});
	
		JButton button2 = new JButton("不好");
		frame.add(button2);
		button2.setBounds(300, 250, 80, 30);
		button2.setFont(new Font("宋体", 0, 20));
		button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Random rd = new Random();
                button2.setLocation(rd.nextInt(450), rd.nextInt(350));
            }
        });
	}
}
