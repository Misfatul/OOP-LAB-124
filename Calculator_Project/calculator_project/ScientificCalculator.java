package calculator_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScientificCalculator implements ActionListener{
    
    JFrame frame;
    JTextField textfield;
    JButton [] numberButtons = new JButton[10];//storing number buttons here
    JButton[] functionButtons = new JButton[8];
    JButton[] scientificButtons = new JButton[12];
    JButton addButton,subButton,mulButton,divButton;//naming the functionButtons
    JButton decButton,equButton,delButton,clrButton;
    JButton pmButton,invButton,sqrtButton,logButton;
    JButton sinButton,cosButton,tanButton,sqButton;
    JButton cbrtButton,cubeButton,expButton,factButton;
    JPanel panel;//to hold all of the separete buttons
    Font myFont = new Font ("Chiki Bubbles",Font.BOLD,20);//using any font i wish to use
    double num1=0,num2=0,result=0;//inputed numbers & the result of the calculation
    char operator;//holds +-*/ to calculate the numbers

    public ScientificCalculator() {
        //codes for the frame
        frame = new JFrame("Scientific Calculator");//initialising the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows us to close out of the program
        frame.setSize(420,550);//setting the size of the calculator
        //frame.setBackground(Color.yellow);
        frame.setLayout(null);
        
        //codes for the text field
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 70);
        textfield.setFont(myFont);
        textfield.setEditable(false);//after this textfield will no longer take any input from the keyboard
        
        //codes for the function buttons
        addButton= new JButton("+");
        subButton= new JButton("-");
        mulButton= new JButton("×");
        divButton= new JButton("÷");
        decButton= new JButton(".");
        equButton= new JButton("=");
        delButton= new JButton("Delete");
        clrButton= new JButton("Clear");
        
        //adding the above buttons to the functionbutton array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        
        //codes for scientific buttons
        pmButton = new JButton("+/-");
        invButton = new JButton("1/x");
        sqrtButton = new JButton("√x");
        sqButton = new JButton("x²");
        cbrtButton = new JButton("∛x");
        cubeButton = new JButton("x³");
        factButton = new JButton("x!");
        expButton = new JButton("Exp");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        logButton = new JButton("log");
        
        //adding the above buttons to scientificButton array
        scientificButtons[0] = pmButton;
        scientificButtons[1] = invButton;
        scientificButtons[2] = sqrtButton;
        scientificButtons[3] = sqButton;
        scientificButtons[4] = cbrtButton;
        scientificButtons[5] = cubeButton;
        scientificButtons[6] = factButton;
        scientificButtons[7] = expButton;
        scientificButtons[8] = sinButton;
        scientificButtons[9] = cosButton;
        scientificButtons[10] = tanButton;
        scientificButtons[11] = logButton;
        
        //setting font,adding action litener 
        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);//not to get the weird outline
        }
        //setting numberbuttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));//instantiating the number buttons
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);//not to get the weird outline
        }
        //setting scientificbuttons
        for (int i = 0; i < 12 ; i++) {
            scientificButtons[i].addActionListener(this);
            scientificButtons[i].setFont(myFont);
            scientificButtons[i].setFocusable(false);//not to get the weird outline
        }
        //creating delete & clear button as extra
        delButton.setBounds(50, 450, 150, 50);
        clrButton.setBounds(200, 450, 150, 50);
        //adding number buttons keyboard panel
        panel = new JPanel();
        panel.setBounds(50, 120, 300, 320);
        panel.setLayout(new GridLayout(7,4,5,5));//hgap10,vgap10
        panel.setBackground(Color.LIGHT_GRAY);
        
        //adding number buttons to the panel
        //1st row
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        //2nd row
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        //3rd row
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        //4th row
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        //scientific buttons
        for (int i = 0; i < 12; i++) {
            panel.add(scientificButtons[i]);
        }
        
        ImageIcon image = new ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\calculator_project\\build\\classes\\calculator_project\\icon.jpg");
        frame.setIconImage(image.getImage());
        
        frame.add(panel);//this will display the keyboard panel
        frame.add(delButton);//this will display delete & clear button
        frame.add(clrButton);
        frame.add(textfield);//text field won't show up untill this command
        frame.setBackground(Color.yellow);
        frame.getContentPane().setBackground(Color.pink);//adding color to the bg
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ScientificCalculator scalc = new ScientificCalculator();//creating an instance
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
//1. "textfield.getText()" retrieves the current text from the text field.
//2. "String.valueOf(i)" converts the integer value 'i' into a string.
//3. ".concat()" is a method that concatenates (joins) two strings together.
//4. "setText()" sets the new text in the text field, which includes the original text and the appended number.
            }
        }
        if (e.getSource() == decButton){
                textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == addButton){
                num1 = Double.parseDouble(textfield.getText());
                operator = '+';
                textfield.setText("");
        }
        if (e.getSource() == subButton){
                num1 = Double.parseDouble(textfield.getText());
                operator = '-';
                textfield.setText("");
        }
        if (e.getSource() == mulButton){
                num1 = Double.parseDouble(textfield.getText());
                operator = '×';
                textfield.setText("");
        }
        if (e.getSource() == divButton){
                num1 = Double.parseDouble(textfield.getText());
                operator = '÷';
                textfield.setText("");
        }
        if (e.getSource() == equButton){
                num2 = Double.parseDouble(textfield.getText());
                switch(operator){
                    case '+':
                        result=num1+num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                    case '×':
                        result=num1*num2;
                        break;
                    case '÷':
                        result=num1/num2;
                        break;    
                }
                textfield.setText(String.valueOf(result));
                num1=result;
        }
        if (e.getSource() == clrButton){
                textfield.setText("");
        }
        if (e.getSource() == delButton){
                String str = textfield.getText();
                textfield.setText("");
                for (int i = 0; i < str.length()-1; i++) {
                    textfield.setText(textfield.getText()+str.charAt(i));
            }
        }
        if (e.getSource() == pmButton) {
			if (num1 == 0) {
				textfield.setText("-" + textfield.getText());
				num1 = 1;
			}
                        else {
				textfield.setText(textfield.getText());
			}
	}
        if (e.getSource() == invButton){
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = 1 / Double.parseDouble(textfield.getText());
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
                        }
	}
        if (e.getSource() == sqrtButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.sqrt(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == sqButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.pow(Double.parseDouble(textfield.getText()), 2);
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == cbrtButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.cbrt(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == cubeButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.pow(Double.parseDouble(textfield.getText()), 3);
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == factButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = fact(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        //here values are taken in radians
        //1rad=57.2958deg
        if (e.getSource() == sinButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
                                result = Math.sin(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == cosButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.cos(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == tanButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.tan(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        if (e.getSource() == logButton) {
			if (textfield.getText().equals("")) {
				textfield.setText("");
			}
                        else {
				result = Math.log10(Double.parseDouble(textfield.getText()));
				textfield.setText("");
				textfield.setText(textfield.getText() + result);
			}
	}
        
    }//this comes with the implementation
    double fact(double num1) {
		int er = 0;
		if (num1 < 0) {
			er = 20;
			return 0;
		}
		double i, s = 1;
		for (i = 2; i <= num1; i += 1.0)
			s *= i;
		return s;
	}
}