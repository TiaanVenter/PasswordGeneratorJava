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
        titleLabel.setFont(new Font("Serif", Font.BOLD, 36));

        // center the text to the screen
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // set x,y coords and height/width values
        titleLabel.setBounds(0, 10, 540, 39);

        // add to GUI
        add(titleLabel);

        // create result text area
        JTextArea passwordOutput = new JTextArea();

        // prevent editing the text area
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Serif", Font.BOLD, 30));

        // add scrollability in case output is too big
        JScrollPane passwordOutputPane = new JScrollPane(passwordOutput);
        passwordOutputPane.setBounds(25, 97, 479, 70);

        // set border around text area
        passwordOutputPane.setBorder(BorderFactory.createBevelBorder(0, Color.BLACK, Color.YELLOW));
        add(passwordOutputPane);

        // create password length label
        JLabel passwordLengthLabel = new JLabel("Password Length:");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        add(passwordLengthLabel);

        // create password length input
        JTextArea passwordLengthInputArea = new JTextArea();
        passwordLengthInputArea.setFont(new Font("Dialog", Font.PLAIN, 30));
        passwordLengthInputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordLengthInputArea.setBounds(310, 215, 192, 39);
        add(passwordLengthInputArea);

        // create toggle buttons
        // uppercase letter toggle
        JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
        uppercaseToggle.setFont(new Font("Dialog", Font.PLAIN, 30));
        uppercaseToggle.setBounds(25, 302, 225, 56);
        add(uppercaseToggle);

        // lowercase letter toggle
        JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
        lowercaseToggle.setFont(new Font("Dialog", Font.PLAIN, 30));
        lowercaseToggle.setBounds(282, 302, 225, 56);
        add(lowercaseToggle);

        // numbers toggle
        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setFont(new Font("Dialog", Font.PLAIN, 30));
        numbersToggle.setBounds(25, 373, 225, 56);
        add(numbersToggle);

        // symbols toggle
        JToggleButton symbolsToggle = new JToggleButton("Symbols");
        symbolsToggle.setFont(new Font("Dialog", Font.PLAIN, 30));
        symbolsToggle.setBounds(282, 373, 225, 56);
        add(symbolsToggle);

        // create generate button
        JButton generateButton = new JButton("Generate");
        generateButton.setFont(new Font("Dialog", Font.BOLD, 32));
        generateButton.setBounds(155, 477, 222, 41);
        add(generateButton);
    }
}
