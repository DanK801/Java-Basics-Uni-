package ex1_3;

import java.awt.*;
import javax.swing.*;

public class Ball extends JPanel implements Runnable//extend Jpanel so Ball is-a JPanel and inherits all behaviours
{
	public final int PANEL_WIDTH = 800;
	public final int PANEL_HEIGHT = 800;
        private int x, y, xMovement, yMovement,ballSize;
        private DrawingPanel drawPanel; //Inner Class
        int progRun = 1;


	public Ball()
        {	super(new BorderLayout());   //invoke super class Jpanel constructor
        x = PANEL_HEIGHT/2;
        y = PANEL_WIDTH/2;
        xMovement = 3;
        yMovement = 2;
        ballSize = 20;
        drawPanel = new DrawingPanel();
        add(drawPanel, BorderLayout.CENTER);
        Thread t = new Thread(this);
        t.start();
    }
        /*Implementing thread to control movement of ball.
        Each thread loops when reaches panel.getWidth or panel.getHeight
        */
        @Override
        public void run(){
            //How to check if program is running
            while(true){
                x += xMovement;
                y+= yMovement;
                if(x <=0 || x+ballSize >= drawPanel.getWidth()) xMovement = -xMovement;
                if(y <=0 || y+ballSize >= drawPanel.getWidth()) yMovement = -yMovement;
                try{
                    Thread.sleep(10);
                }
                
                catch(InterruptedException e){
                    
                }
                drawPanel.repaint();
            }
}               
        
        private class DrawingPanel extends JPanel{
            public DrawingPanel(){
                setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
                setBackground(Color.WHITE);
            }
            
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.fillOval(x, y, ballSize, ballSize);
            }
        }
        
	public static void main(String[] args){
        Ball myPanel = new Ball();	
 	JFrame frame = new JFrame("Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(myPanel);
	frame.pack();
	Toolkit tk = Toolkit.getDefaultToolkit();	
        Dimension d = tk.getScreenSize();
        frame.setLocation(new Point((d.width/2)-(frame.getWidth()/2),(d.height/2)-(frame.getHeight()/2)));	
        frame.setVisible(true);
}
}

