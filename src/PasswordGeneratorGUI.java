import javax.swing.*;
import java.awt.*;

// render GUI (frontend)
// this class inherits from JFrame class
public class PasswordGeneratorGUI extends JFrame {
    public PasswordGeneratorGUI(){
        // render frame, add title
        super("Password Generator");

        // set size of GUI
        setSize(540, 570);

        // prevent GUI resizing
        setResizable(false);

        // set layout to be null in order to have control over position and size of components
        setLayout(null);

        // terminate program when GUI closes (ends process)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // center the GUI to the screen
        setLocationRelativeTo(null);

        // render GUI components
        addGuiComponents();
    }

    private void addGuiComponents(){
        // create title text
        JLabel titleLabel = new JLabel("Password Generator");

        // increase font size, make it bold
        titleLabel.setFont(new Font("Serif", Font.BOLD, 30));

        // center the text to the screen
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // set x,y coords and height/width values
        titleLabel.setBounds(0, 10, 540, 39);

        // add to GUI
        add(titleLabel);
    }
}
