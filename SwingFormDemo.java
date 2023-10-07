import javax.swing.*;
import java.awt.*;

public class SwingFormDemo {
  public SwingFormDemo() {
    JLabel lblfName, lbllName, lblemail, lblpassword1, lblpassword2, lblError;
    JTextArea txtfName, txtlName, txtemail;
    JPasswordField txtpassword1, txtpassword2;
    JCheckBox chkAgree;
    JButton btnRegister;

    JFrame jf = new JFrame("Form Demo");
    jf.setLayout(null);
    jf.setSize(450, 500);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel jl = new JLabel("~~~~~ REGISTER FORM ~~~~~");
    jl.setBounds(125, 20, 250, 10);
    jf.add(jl);

    JLabel jl1 = new JLabel("Create your account. it's free and takes a minute.");
    jl1.setBounds(90, 40, 300, 10);
    jf.add(jl1);

    lblfName = new JLabel("First Name", null, 0);
    lblfName.setBounds(50, 70, 150, 20);
    jf.add(lblfName);

    txtfName = new JTextArea();
    txtfName.setBounds(50, 90, 150, 20);
    jf.add(txtfName);

    lbllName = new JLabel("Last Name", null, 0);
    lbllName.setBounds(210, 70, 150, 20);
    jf.add(lbllName);

    txtlName = new JTextArea();
    txtlName.setBounds(210, 90, 150, 20);
    jf.add(txtlName);

    lblemail = new JLabel("Email", null, 0);
    lblemail.setBounds(50, 130, 150, 20);
    jf.add(lblemail);

    txtemail = new JTextArea();
    txtemail.setBounds(50, 160, 200, 20);
    jf.add(txtemail);

    lblpassword1 = new JLabel("Password", null, 0);
    lblpassword1.setBounds(50, 190, 150, 20);
    jf.add(lblpassword1);

    txtpassword1 = new JPasswordField();
    txtpassword1.setBounds(50, 220, 200, 20);
    txtpassword1.setBorder(null);
    jf.add(txtpassword1);

    lblpassword2 = new JLabel("Conform Password", null, 0);
    lblpassword2.setBounds(50, 250, 150, 20);
    jf.add(lblpassword2);

    txtpassword2 = new JPasswordField();
    txtpassword2.setBounds(50, 270, 200, 20);
    txtpassword2.setBorder(null);
    jf.add(txtpassword2);

    chkAgree = new JCheckBox("I accept the term of use and privecy policy.", null, false);
    chkAgree.setBounds(50, 310, 400, 20);
    chkAgree.setBorder(null);
    jf.add(chkAgree);

    btnRegister = new JButton("Register", null);
    btnRegister.setBounds(100, 350, 150, 40);
    jf.add(btnRegister);

    lblError = new JLabel(null, null, 0);
    lblError.setBounds(50, 410, 400, 20);
    jf.add(lblError);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      SwingFormDemo sfd = new SwingFormDemo();
    });
  }
}
