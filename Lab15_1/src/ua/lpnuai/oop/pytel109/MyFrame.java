package ua.lpnuai.oop.pytel109;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {

    ArrayList<User> container = new ArrayList<>();
    Serializator serializator = new Serializator();

    Box box0 = Box.createVerticalBox();
    JLabel label0 = new JLabel("Id:");
    JTextField field0 = new JTextField(20);

    Box box1 = Box.createVerticalBox();
    JLabel label1 = new JLabel("Full name:");
    JTextField field1 = new JTextField(20);

    Box box2 = Box.createVerticalBox();
    JLabel label2 = new JLabel("Date of settlement:");
    JTextField field2 = new JTextField(20);


    Box box3 = Box.createVerticalBox();
    JLabel label3 = new JLabel("Date of eviction:");
    JTextField field3 = new JTextField(20);

    Box box4 = Box.createVerticalBox();
    JLabel label4 = new JLabel("Number:");
    JTextField field4 = new JTextField(20);


    Box box5 = Box.createVerticalBox();
    JLabel label5 = new JLabel("Reason:");
    JTextField field5 = new JTextField(20);

    Box butBox = Box.createVerticalBox();
    JButton button = new JButton("Add user");

    Box methods = Box.createVerticalBox();
    JButton showB = new JButton("Show User by id:");
    JTextField idField = new JTextField(20);
    JButton delete = new JButton("remove for id");
    JButton serializeBut = new JButton("Save");
    JButton clear = new JButton("Remuve AlL");

    Box boxId = Box.createVerticalBox();
    JLabel idLabel = new JLabel("Input id:");

    Box log = Box.createHorizontalBox();
    JLabel logLabel = new JLabel("Result:");
    JTextField logField = new JTextField(20);

    JPanel panel = new JPanel();

    Box otherMethods = Box.createHorizontalBox();

    public void clear() {
        field0.setText("");
        field1.setText("");
        field2.setText("");
        field3.setText("");
        field4.setText("");
        field5.setText("");

    }

    //слухач для кнопки
    ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton but = (JButton)e.getSource();
            if(but == button) {
                User user = new User();
                user.setId(container.size());
                user.setName(field1.getText());
                user.setdate_s(field2.getText());
                user.setdate_e(field3.getText());
                user.setnum(field4.getText());
                user.setreason(field5.getText());
                clear();
                container.add(user);
                logField.setText("User added");
            }
            else if(but == serializeBut) {
                try {
                    serializator.serialize(container);
                }catch(Throwable T) {}
                clear();
                logField.setText("Saved");
            }
            else if(but == showB) {
                int id = Integer.parseInt(idField.getText());
                User u = container.get(id);
                if(u == null) {
                    logField.setText("User not found");
                    idField.setText("");
                }
                else {
                    field0.setText(String.valueOf(u.getId()));
                    field1.setText((String) u.getName());
                    field2.setText((String) u.getdate_s());
                    field3.setText((String) u.getdare_e());
                    field4.setText((String) u.getnum());
                    field5.setText((String) u.getreason());
                    idField.setText("");
                }
            }
            else if(but == delete) {
                int id = Integer.parseInt(idField.getText());
                User u = container.get(id);
                if(u == null) {
                    logField.setText("User not found");
                    idField.setText("");
                }
                else {
                    container.remove(u);
                    logField.setText("User had been removed");
                    idField.setText("");
                }
                clear();
            }
            else if(but == clear) {
                container.clear();
                logField.setText("User list is empty");
                clear();
            }
        }
    };

    public MyFrame() {
        setSize(420, 380);
        setResizable(false);
        setTitle("Lab №15");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.


        box1.add(label1);
        box1.add(field1);

        box2.add(label2);
        box2.add(field2);

        box3.add(label3);
        box3.add(field3);

        box4.add(label4);
        box4.add(field4);

        box5.add(label5);
        box5.add(field5);

        button.addActionListener(listener);
        serializeBut.addActionListener(listener);
        showB.addActionListener(listener);
        delete.addActionListener(listener);
        clear.addActionListener(listener);
        butBox.add(button);

        methods.add(showB);
        methods.add(delete);

        log.add(logLabel);
        log.add(logField);

        boxId.add(idLabel);
        boxId.add(idField);

        otherMethods.add(serializeBut);
        otherMethods.add(clear);

        panel.add(box0);
        panel.add(box1);
        panel.add(box2);
        panel.add(box3);
        panel.add(box4);
        panel.add(box5);
        panel.add(butBox);
        panel.add(boxId);
        panel.add(methods);
        panel.add(log);
        panel.add(otherMethods);
        setContentPane(panel);
    }
}