package samplee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Tictactoe implements ActionListener{
	
	static JButton[][] b;
	static JFrame f1;
	static JPanel f;
	static JTextField l;
	static int player,done,number=1;
	Tictactoe(){
		FormAGrid();
		l.setText("                                               player"+number);
		b[0][0].addActionListener(this);
		b[0][1].addActionListener(this);
		b[0][2].addActionListener(this);
		b[1][0].addActionListener(this);
		b[1][1].addActionListener(this);
		b[1][2].addActionListener(this);
		b[2][0].addActionListener(this);
		b[2][1].addActionListener(this);
		b[2][2].addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tictactoe();
	}
	static void FormAGrid() {
		f=new JPanel();
		b=new JButton[3][3];
		f1=new JFrame();
		l= new JTextField("");
		l.setBounds(0, 0, 300, 30);
		f1.add(l);
		String c="123456789";
		int index=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=new JButton(c.valueOf(index++));
				f.add(b[i][j]);
			}
		}
		f.setLayout(new GridLayout(3,3));
		f.setBounds(0, 30, 300, 270);
		f1.add(f);
		f1.setSize(310,330);
		f1.setLayout(null);
		f1.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand());
		for(int l=0;l<3;l++) {
			for(int m=0;m<3;m++) {
				if(e.getActionCommand()==b[l][m].getText() && !(b[l][m].getBackground()==Color.BLACK || b[l][m].getBackground()==Color.RED)) {
					if(number==1) 
						b[l][m].setBackground(Color.BLACK);
					if(number==2) 
						b[l][m].setBackground(Color.RED);
					if(number==1)
						number=2;
					else
						number=1;
				}
			}
		}
		l.setText("                                         player"+number);
		for(int i=0;i<3;i++) {
			if((b[i][0].getBackground()==b[i][1].getBackground())&&(b[i][1].getBackground()==b[i][2].getBackground())){
				if(b[i][0].getBackground()==Color.BLACK)
					JOptionPane.showMessageDialog(b[0][0], "player 1 won");
				if(b[i][0].getBackground()==Color.RED)
					JOptionPane.showMessageDialog(b[0][0], "player 2 won");
			}
		}
		if((b[0][0].getBackground()==b[1][1].getBackground())&&(b[1][1].getBackground()==b[2][2].getBackground())){
			if(b[0][0].getBackground()==Color.BLACK)
				JOptionPane.showMessageDialog(b[0][0], "player 1 won");
			if(b[0][0].getBackground()==Color.RED)
				JOptionPane.showMessageDialog(b[0][0], "player 2 won");
		}
		if((b[2][0].getBackground()==b[1][1].getBackground())&&(b[1][1].getBackground()==b[0][2].getBackground())){
			if(b[2][0].getBackground()==Color.BLACK)
				JOptionPane.showMessageDialog(b[0][0], "player 1 won");
			if(b[2][0].getBackground()==Color.RED)
				JOptionPane.showMessageDialog(b[0][0], "player 2 won");
		}
		for(int i=0;i<3;i++) {
			if((b[0][i].getBackground()==b[1][i].getBackground())&&(b[1][i].getBackground()==b[2][i].getBackground())){
				if(b[0][i].getBackground()==Color.BLACK)
					JOptionPane.showMessageDialog(b[0][0], "player 1 won");
				if(b[0][i].getBackground()==Color.RED)
					JOptionPane.showMessageDialog(b[0][0], "player 2 won");
			}
		}
	}
}
