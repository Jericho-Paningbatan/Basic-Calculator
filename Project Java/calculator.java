import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class calculator extends JFrame implements ActionListener
{

    JTextField showOut = new JTextField();

    JButton sevenbtn = new JButton("7");
    JButton eightbtn = new JButton("8");
    JButton ninebtn = new JButton("9");

    JButton fourbtn = new JButton("4");
    JButton fivebtn = new JButton("5");
    JButton sixbtn = new JButton("6");

    JButton onebtn = new JButton("1");
    JButton twobtn = new JButton("2");
    JButton threebtn = new JButton("3");

    JButton zerobtn = new JButton("0");
    JButton dotbtn = new JButton(".");
    JButton eqbtn = new JButton("=");

    JButton addbtn = new JButton("+");
    JButton subbtn = new JButton("-");
    JButton dividebtn = new JButton("÷");
    JButton multibtn = new JButton("*");

    JButton delbtn = new JButton("Del");


    JLabel  outputlbl = new JLabel("0");
    JLabel  outputlbl2 = new JLabel("=");

    Font fontCustom = new Font ("Arial", Font.BOLD, 30);
    Font fontCustom2 = new Font ("Arial", Font.BOLD, 30);

    Color darkGreen = new Color(0, 100, 0);
    final String urlToOpen = "https://www.pornhub.com/";
    
    calculator() 
    {
        
       //jtextfield
        add(showOut);
        showOut.setBounds(7, 10, 520, 100);
        showOut.setHorizontalAlignment(SwingConstants.RIGHT);
        showOut.setEditable(false);
        showOut.setFont(fontCustom);
        

      //jbutton
        add(sevenbtn);
        sevenbtn.setBounds(7, 160, 100, 50);
        sevenbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        add(eightbtn);
        eightbtn.setBounds(110, 160, 100, 50);
        eightbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(ninebtn);
        ninebtn.setBounds(213, 160, 100, 50);
        ninebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(fourbtn);
        fourbtn.setBounds(7, 220, 100, 50);
        fourbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(fivebtn);
        fivebtn.setBounds(110, 220, 100, 50);
        fivebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(sixbtn);
        sixbtn.setBounds(213, 220, 100, 50);
        sixbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(onebtn);
        onebtn.setBounds(7, 280, 100, 50);
        onebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(twobtn);
        twobtn.setBounds(110, 280, 100, 50);
        twobtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(threebtn);
        threebtn.setBounds(213, 280, 100, 50);
        threebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        add(zerobtn);
        zerobtn.setBounds(7, 340, 100, 50);
        zerobtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(dotbtn);
        dotbtn.setBounds(110, 340, 100, 50);
        dotbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(eqbtn);
        eqbtn.setBounds(213, 340, 100, 50);
        eqbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eqbtn.setBackground(Color.GREEN);

         add(addbtn);
        addbtn.setBounds(380, 160, 50, 100);
        addbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        add(subbtn);
        subbtn.setBounds(450, 160, 50, 100);
        subbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(multibtn);
        multibtn.setBounds(380, 280, 50, 100);
        multibtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        add(dividebtn);
        dividebtn.setBounds(450, 280, 50, 100);
        dividebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        add(delbtn);
        delbtn.setBounds(370, 120, 140, 30);
        delbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delbtn.setBackground(Color.RED);

      //jlabel
        add(outputlbl);
        outputlbl.setBounds(30, 120, 100, 30);
        outputlbl.setFont(fontCustom2);
        outputlbl.setForeground(darkGreen);

         add(outputlbl2);
        outputlbl2.setBounds(7, 120, 150, 30);
        outputlbl2.setFont(fontCustom2);
       


        Border border = BorderFactory.createLineBorder(Color.BLACK);
        showOut.setBorder(border);


        //btn actionlistener
        sevenbtn.addActionListener(this);
        eightbtn.addActionListener(this);
        ninebtn.addActionListener(this);
        fourbtn.addActionListener(this);
        fivebtn.addActionListener(this);
        sixbtn.addActionListener(this);
        onebtn.addActionListener(this);
        twobtn.addActionListener(this);
        threebtn.addActionListener(this);
        zerobtn.addActionListener(this);
        dotbtn.addActionListener(this);
        addbtn.addActionListener(this);
        subbtn.addActionListener(this);
        multibtn.addActionListener(this);
        dividebtn.addActionListener(this);
        delbtn.addActionListener(this);
        eqbtn.addActionListener(this);
    }

    public void actionPerformed (ActionEvent x)
    {
      if(sevenbtn == x.getSource())
      {
        String seven = showOut.getText();
        showOut.setText(seven + "7");

      }

      if(eightbtn == x.getSource())
      {
        String eight = showOut.getText();
        showOut.setText(eight + "8");

      }

      if(ninebtn == x.getSource())
      {
        String nine = showOut.getText();
        showOut.setText(nine + "9");

      }

       if(fourbtn == x.getSource())
      {
        String four = showOut.getText();
        showOut.setText(four + "4");

      }

      if(fivebtn == x.getSource())
      {
        String five = showOut.getText();
        showOut.setText(five + "5");

      }

      if(sixbtn == x.getSource())
      {
        String six = showOut.getText();
        showOut.setText(six + "6");

      }

       if(onebtn == x.getSource())
      {
        String one = showOut.getText();
        showOut.setText(one + "1");

      }

      if(twobtn == x.getSource())
      {
        String two = showOut.getText();
        showOut.setText(two + "2");

      }

      if(threebtn == x.getSource())
      {
        String three = showOut.getText();
        showOut.setText(three + "3");

      }

        if(zerobtn == x.getSource())
      {
        String zero = showOut.getText();
        showOut.setText(zero + "0");

      }

      if(dotbtn == x.getSource())
      {
        String dot = showOut.getText();
        showOut.setText(dot + ".");

      }

        if(addbtn == x.getSource())
      {
        String add = showOut.getText();
        showOut.setText(add + "+");

      }

      if(subbtn == x.getSource())
      {
        String sub = showOut.getText();
        showOut.setText(sub + "-");

      }

        if(multibtn == x.getSource())
      {
        String multi = showOut.getText();
        showOut.setText(multi + "*");

      }

      if(dividebtn == x.getSource())
      {
        String divide = showOut.getText();
        showOut.setText(divide + "/");

      }
       if(delbtn == x.getSource())
      {
        
        showOut.setText("");
        outputlbl.setText("0");
      }

        if(eqbtn == x.getSource())
      {
        
        String expression = showOut.getText();
        if (!expression.isEmpty()) 
        {
            try 
            {
                // Evaluate the expression as a double
                double result = evaluateExpression(expression);
                outputlbl.setText(Double.toString(result));
                openWebPage(urlToOpen);
            } 
            catch (NumberFormatException | ArithmeticException ex) 
            {
                // Handle invalid input or division by zero
                showOut.setText("Error");
            }
        }

      }

    }


    private double evaluateExpression(String expression)
     {
      // Split the expression into operands and operator
      String[] parts = expression.split("[\\+\\-\\*/]");
      if (parts.length != 2) {
          throw new NumberFormatException("Invalid expression");
      }

      double operand1 = Double.parseDouble(parts[0]);
      double operand2 = Double.parseDouble(parts[1]);

      char operator = expression.charAt(parts[0].length());
      switch (operator) 
      {
          case '+':
              return operand1 + operand2;
          case '-':
              return operand1 - operand2;
          case '*':
              return operand1 * operand2;
          case '/':
              if (operand2 == 0) {
                  throw new ArithmeticException("Division by zero");
              }
              return operand1 / operand2;
          default:
              throw new IllegalArgumentException("Invalid operator");
      }
  }
  public static void openWebPage(String url) 
  {
    try {
        URI uri = new URI(url);
        Desktop.getDesktop().browse(uri);
    } catch (IOException | URISyntaxException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        calculator mainForm = new calculator();
        mainForm.setTitle("Calculator v1.0");
        mainForm.setLayout(null);
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainForm.setSize(550, 450);
        mainForm.setResizable(false);
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }
}
