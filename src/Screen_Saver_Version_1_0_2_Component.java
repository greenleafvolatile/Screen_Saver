import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class Screen_Saver_Version_1_0_2_Component extends JComponent{

    public static final int PREF_WIDTH = 400;
    public static final int PREF_HEIGHT = 400;

    private int horizontalMove, verticalMove;
    private String message;
    private Point messagePos;
    private Dimension dimension;

    public Screen_Saver_Version_1_0_2_Component(String message, Font font) {
        dimension=new Dimension(PREF_WIDTH, PREF_HEIGHT);
        setFont(font);
        this.message = message;
        messagePos=new Point(0-new Canvas().getFontMetrics(this.getFont()).stringWidth(this.message), 0);
        horizontalMove=1;
        verticalMove=1;
    }

    @Override
    public void paintComponent(Graphics g) {
        //Logger.getGlobal().info(String.format("(%d, %d)", (int)messagePos.getX(), (int)messagePos.getY()));
        Graphics2D g2d=(Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawString(message, (int)messagePos.getX() , (int) messagePos.getY());
    }

    public void setMessage(String message){
        this.message=message;
        repaint();
    }

    public int getMessageHeight() {
        return new Canvas().getFontMetrics(getFont()).stringWidth(message);
    }

    public int getMessageWidth(){
        return new Canvas().getFontMetrics(getFont()).stringWidth(message);
    }

    public void moveMessage() {
        messagePos.move((int) messagePos.getX()+horizontalMove, (int) messagePos.getY()+verticalMove);
        repaint();

    }

    public Dimension getPreferredSize() {
        return dimension;
    }

    public void setDimension(int width, int height){
        dimension=new Dimension(width, height);
    }


    public Point getMessagePos() {
        return messagePos;
    }

    public void setMessagePos(Point point){
        messagePos=point;
    }

    public int getHorizontalMove(){
        return horizontalMove;
    }

    public void setHorizontalMove(int move){
        this.horizontalMove=move;
    }

    public void setVerticalMove(int move){
        this.verticalMove=move;
    }
    public int getVerticalMove(){
        return verticalMove;
    }
}

