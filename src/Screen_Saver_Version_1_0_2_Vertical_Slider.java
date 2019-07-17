import javax.swing.*;
import java.awt.*;

public class Screen_Saver_Version_1_0_2_Vertical_Slider extends JFrame {


    private JSlider slider;
    private int min, max, value;

    public Screen_Saver_Version_1_0_2_Vertical_Slider(int min, int max, int value){
        this.max=max;
        this.min=min;
        this.value=value;
        this.initializeUI();

    }

    private void initializeUI(){

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.setPreferredSize(new Dimension(50, Screen_Saver_Version_1_0_2_Component.PREF_HEIGHT));
        slider=new JSlider(JSlider.VERTICAL, min, max, value);
        slider.setInverted(true);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        //slider.setPaintLabels(false);
        panel.add(slider);
        setContentPane(panel);
        pack();
    }

    public JSlider getSlider(){
        return slider;
    }
}
