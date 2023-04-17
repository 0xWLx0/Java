package project_20;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;

// A Swing program inherits from the top-level container javax.swing.JFrame
public class SwingTest extends JFrame {
   // Declare & construct a JLabel component
   private JLabel jLabel1 = new JLabel("Operation");
   // Declare & construct a JTextField component
   private JTextField jTextField1 = new JTextField(" ");
   // Declare & contruct 3 JButton components

   private JButton jButton0 = new JButton("0");
   private JButton jButton1 = new JButton("1");
   private JButton jButton2 = new JButton("2");
   private JButton jButton3 = new JButton("3");
   private JButton jButton4 = new JButton("4");
   private JButton jButton5 = new JButton("5");
   private JButton jButton6 = new JButton("6");
   private JButton jButton7 = new JButton("7");
   private JButton jButton8 = new JButton("8");
   private JButton jButton9 = new JButton("9");

   // Declare & contruct 2 JPanel components
   private JPanel jPanel1 = new JPanel();
   private JPanel jPanel2 = new JPanel();

   private JPanel jPanel3 = new JPanel();
   private JPanel jPanel4 = new JPanel();
   private JPanel jPanel5 = new JPanel();
   private JPanel jPanel6 = new JPanel();

   // Constructor to setup GUI components and event handlers
   public SwingTest() {


      setLayout(new java.awt.FlowLayout());
      // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
      // the components from left-to-right, and flow to next row from top-to-bottom.

      jPanel1.setLayout(new java.awt.GridLayout());
      add(jPanel1);
      jPanel1.add(jLabel1);
      jPanel1.add(jTextField1);

      jPanel2.setLayout(new java.awt.GridLayout());
      add(jPanel2);

      jPanel3.setLayout(new java.awt.GridLayout());
      add(jPanel3);
      jPanel3.add(jButton0);
      jPanel3.add(jButton1);
      jPanel3.add(jButton2);

      jPanel4.setLayout(new java.awt.GridLayout());
      add(jPanel4);
      jPanel4.add(jButton3);
      jPanel4.add(jButton4);
      jPanel4.add(jButton5);

      jPanel5.setLayout(new java.awt.GridLayout());
      add(jPanel5);
      jPanel5.add(jButton6);
      jPanel5.add(jButton7);
      jPanel5.add(jButton8);

      jPanel6.setLayout(new java.awt.GridLayout());
      add(jPanel6);
      jPanel6.add(jButton9);


      // Exit program if close-window button clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Test"); // "super" JFrame sets title
      setSize(300, 300);
      // "super" JFrame sets initial size
      setVisible(true);
      // "super" Frame shows.

   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an instance
      SwingTest app = new SwingTest();
      // or simply "new AWTCounter();" for an anonymous instance

   }

}
