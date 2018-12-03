import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class BmiWDescrQA extends JFrame
  implements ActionListener
{
  // These are fields (& not local variables in the contructor), 
  // so that we can use them in actionPerformed 
  public static final int GRID_ROW_CT = 5;
  public static final int GRID_COL_CT = 2;  
  public static final int GRID_HOR_GAP = 5;    
  public static final int GRID_VERT_GAP = 5; 
  public static final int GRID_HT = 60;   
  
  private JTextField inputLbs, inputInches, displayBmi, displayBmiEval;
  private JRadioButton adult, child;
  private JButton calcB, resetB;
  
  private final double KILOGRAMSPERPOUND = 0.454;
  private final double METERSPERINCH = 0.0254;
  

  public BmiWDescrQA()
  { 
    super("BMI, >= 20 years old");
              
    // The variables that are not used in actionPerformed are declared as
    // local variables here in the contructor
    
    
    adult = new JRadioButton("Adult", true);
    child = new JRadioButton("Pregnant or child", false);  
    
    ButtonGroup twoButtonGrp = new ButtonGroup();
    twoButtonGrp.add(adult);
    twoButtonGrp.add(child);    
    
    JLabel labelLbs = new JLabel("Weight (lbs):", SwingConstants.RIGHT);
    inputLbs = new JTextField(5);
    JLabel labelInches = new JLabel("Height (inches):", SwingConstants.RIGHT);
    inputInches = new JTextField(5);
    JLabel labelBmi = new JLabel("BMI = ", SwingConstants.RIGHT);
    displayBmi = new JTextField(5);
    displayBmi.setEditable(false); // for display only; not for user input
    
    JLabel labelBmiEval = new JLabel("Evaluation = ", SwingConstants.RIGHT);
    displayBmiEval = new JTextField(5); // BMI evaluation
    displayBmiEval.setEditable(false); // for display only; not for user input
    
    calcB = new JButton("Calculate");
    calcB.addActionListener(this);
    
    resetB = new JButton("Reset");
    resetB.addActionListener(this);
    
    Container c = getContentPane();
    c.setBackground(Color.white);
    
    // FIRST PART OF WINDOW
 
    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(GRID_ROW_CT, GRID_COL_CT, GRID_HOR_GAP, GRID_VERT_GAP)); 
    panel1.add(adult);
    panel1.add(child);
    panel1.add(labelLbs);
    panel1.add(inputLbs);
    panel1.add(labelInches);
    panel1.add(inputInches);
    panel1.add(labelBmi);
    panel1.add(displayBmi);
    panel1.add(labelBmiEval);
    panel1.add(displayBmiEval);
    c.add(panel1, BorderLayout.CENTER);

    // SECOND PART OF WINDOW
    JPanel panel2 = new JPanel();
    panel2.setLayout(new GridLayout(1, 2, 4, 4)); // 1 row by 2 cols, with hor. & vert. gaps of 8
    panel2.add(calcB);
    panel2.add(resetB);
    c.add(panel2, BorderLayout.SOUTH);  
  }

  public void actionPerformed(ActionEvent e)
  {
      Object obj = e.getSource();
      if (obj instanceof JButton)
      {
          JButton b = (JButton)obj;
          if (b == calcB)
          {
            double bmi = 0.0;
            char personType;
            if (adult.isSelected())
              personType = 'A';
            else
              personType = 'C';

            if (personType == 'A')
            {
                int lbs = 0;
                int inches = 0;
                String inputStr = inputLbs.getText();
                if (inputStr.length() > 0)
                    lbs = Integer.parseInt(inputStr);
                
                inputStr = inputInches.getText();
                if (inputStr.length() > 0)
                    inches = Integer.parseInt(inputStr);
                
                if (lbs > 0 && inches > 0)
                    bmi = calculateBmi(lbs, inches);
                    
                DecimalFormat df = new DecimalFormat("00.0");
                displayBmi.setText(df.format(bmi));
            }

            displayBmiEval.setText(bmiDescr(personType, bmi));
          }
          else if (b == resetB)
          {
            displayBmi.setText("");
            displayBmiEval.setText("");
          }
        }
  }
  
  // STEP 1: COPY YOUR calculateBmi METHOD FROM YOUR Proj06EBmiGui AND PASTE HERE

   private double calculateBmi(int lbs, int inches)
  {
      return (double) KILOGRAMSPERPOUND * lbs / Math.pow(METERSPERINCH * inches, 2);
  }

  /* STEP 2: TYPE YOUR bmiDescr METHOD FROM YOUR QUIZ: TYPE AS-IS,
  THEN COMPILE & TRY TO RUN, CORRECTING MISTAKES & VERIFYING ALL CASES
  (BASED ON THE TABLE FROM THE CDC ON THE QUIZ) */
  
  public String bmiDescr(char ageGroup, double bmi)
  {
      if(ageGroup == 'C')
        return "Not available";
      else if(bmi < 18.5)
        return "Underweight";
      else if(bmi <= 24.9)
        return "Healthy Weight";
      else if(bmi <= 29.9)
        return "Overweight";
      else
        return "Obese";
  }
  
  /* STEP 3: WRITE ON YOUR QUIZ PAPER WHY/HOW/WHAT THE MISTAKES WERE
  (IN ENGLISH) */
  
  public static void main(String[] args)
  {
    BmiWDescrQA w = new BmiWDescrQA();
    w.setBounds(300, 300, GRID_ROW_CT * GRID_HT, 200);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

