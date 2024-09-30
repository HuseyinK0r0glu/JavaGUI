import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*JFrame frame = new JFrame();
        frame.setSize(200,200);
        JButton btn = new JButton("Buton");
        frame.getContentPane().add(btn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame();
        frame.setSize(200,200);
        JPanel panel = new JPanel();
        JButton btn = new JButton("buton");
        panel.add(btn);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("buton örneği");
        JButton btn = new JButton("gönder");
        btn.setBounds(0,0,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("gönderiliyor ");
            }
        });
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("label örneği");
        JLabel label = new JLabel();
        label.setText("Yazı Kısmı");
        label.setBounds(100,50,200,30);
        frame.add(label);
        JButton btn = new JButton("değiştirme");
        btn.setBounds(0,0,100,100);
        btn.addActionListener(new ActionListener() {
            int c=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("yazı " + c++ +" kere değiştirildi");
            }
        });
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("textfield örneği");
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        l1 = new JLabel("İlk Sayı");
        l1.setBounds(50,50,100,30);
        t1 = new JTextField();
        t1.setBounds(50,80,100,30);
        l2 = new JLabel("İkinci Sayı");
        l2.setBounds(50,110,100,30);
        t2 = new JTextField();
        t2.setBounds(50,140,100,30);
        l3 = new JLabel("Toplam");
        l3.setBounds(50,170,100,30);
        t3 = new JTextField();
        t3.setBounds(50,200,100,30);
        t3.setEditable(false);
        JButton btn = new JButton("TOPLAM");
        btn.setBounds(50,260,100,30);
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a+b;
                String toplam = String.valueOf(c);
                t3.setText(toplam);
            }
        });
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("textarea örneği");
        JLabel l1,l2;
        TextArea area;
        JButton btn;
        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);
        area = new TextArea();
        area.setBounds(20,75,250,200);
        btn = new JButton("hesapla");
        btn.setBounds(100,300,120,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                String words[] = text.split("\\s");
                l1.setText("kelime sayısı:" + words.length);
                l2.setText("karakter sayısı:" + text.length());
            }
        });
        frame.add(l1);
        frame.add(l2);
        frame.add(area);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("passwordfield örneği");
        JLabel l1 = new JLabel("Şifre:");
        l1.setBounds(20,20,100,30);
        JPasswordField ps = new JPasswordField();
        ps.setBounds(20,50,100,30);
        JButton btn = new JButton("Gönder");
        btn.setBounds(20,80,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(ps.getPassword());
                l1.setText("Şİfre:" + password);
                System.out.println(ps.getPassword());

            }
        });
        frame.add(l1);
        frame.add(ps);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("checkbox örneği");
        JCheckBox ch1 = new JCheckBox("KVKK onayı");
        ch1.setBounds(30,30,200,30);
        JCheckBox ch2 = new JCheckBox("Açık Rıza Metni");
        ch2.setBounds(30,60,200,30);
        JButton btn = new JButton("Kontrol");
        btn.setBounds(30,90,200,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ch1.isSelected()){
                    System.out.println(ch1.getText() + " Seçildi");
                }
                if(ch2.isSelected()){
                    System.out.println(ch2.getText() + " Seçildi");
                }
            }
        });
        frame.add(ch1);
        frame.add(ch2);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("checkbox örneği");
        JLabel label = new JLabel("Seçim Yapın ");
        label.setBounds(30,30,200,30);
        JCheckBox ch1 = new JCheckBox("KVKK onayı");
        ch1.setBounds(30,60,200,30);
        JCheckBox ch2 = new JCheckBox("Açık Rıza Metni");
        ch2.setBounds(30,90,200,30);

        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("KVKK onayı " + (e.getStateChange() == 1 ? "seçildi " : "seçilmedi"));
            }
        });

        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Açık Rıza Metni " + (e.getStateChange() == 1 ? "seçildi " : "seçilmedi"));
            }
        });

        frame.add(label);
        frame.add(ch1);
        frame.add(ch2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("radiobutton örneği");
        JRadioButton r1 = new JRadioButton("Kadın" , true);
        r1.setActionCommand("K");
        r1.setBounds(50,50,100,30);
        JRadioButton r2 = new JRadioButton("Erkek");
        r2.setActionCommand("E");
        r2.setBounds(50,100,100,30);
        JRadioButton r3 = new JRadioButton("Belirtmek İstemiyorum");
        r3.setActionCommand("N");
        r3.setBounds(50,150,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JButton btn = new JButton("Gönder");
        btn.setBounds(50,200,100,30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(bg.getSelection().getActionCommand());
            }
        });

        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("combobox örneği");
        String arr[] = {"C","C#","C++","Java"};
        JComboBox combo = new JComboBox(arr);
        combo.setBounds(50,100,50,20);
        JButton btn = new JButton("D");
        btn.setBounds(50,150,50,20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedItem());
            }
        });
        frame.add(combo);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("table örneği");
        String veri [][] = {{"1","MAT","85"},{"2","FEN","50"},{"3","TURKCE","100"}};
        String baslık [] = {"Id","Ders","Not"};
        JTable table = new JTable(veri,baslık);
        JScrollPane sp = new JScrollPane(table);


        frame.add(sp);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("list örneği");
        DefaultListModel<String> list = new DefaultListModel<>();
        list.addElement("C++");
        list.addElement("C#");
        list.addElement("Java");
        list.addElement("Python");
        JList<String> jlist = new JList<>(list);
        jlist.setBounds(100,100,75,75);
        JButton btn = new JButton("B");
        btn.setBounds(100,175,50,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlist.getSelectedIndex() != -1){
                    for( Object item : jlist.getSelectedValuesList()){
                        System.out.println(item);
                    }
                }
            }
        });

        frame.add(jlist);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("optionpane örneği");
        //JOptionPane.showMessageDialog(frame,"Kodlama vakti");
        //JOptionPane.showMessageDialog(frame,"Abone oldun","Abone ol",JOptionPane.WARNING_MESSAGE);
        String str = JOptionPane.showInputDialog(frame,"adınız");
        System.out.println(str);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("scroolbar örneği");
        JLabel lbl = new JLabel();
        lbl.setBounds(100,50,300,30);

        JScrollBar s = new JScrollBar(JScrollBar.VERTICAL,0,10,0,120);
        s.setBounds(100,100,50,100);
        //s.setMaximum(120);
        //s.setMinimum(0);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                String txt = String.valueOf(s.getValue());
                lbl.setText(txt);
            }
        });

        frame.add(lbl);
        frame.add(s);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("menubar örneği");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Ana Menü");
        JMenu submenu = new JMenu("Alt Menü");
        JMenuItem i1 = new JMenuItem("Menu 1");
        JMenuItem i2 = new JMenuItem("Menu 2");
        JMenuItem i3 = new JMenuItem("Menu 3");
        JMenuItem i4 = new JMenuItem("Menu 4");


        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Menu 1'e tıklandı ");
            }
        });

        JMenuItem a1 = new JMenuItem("Alt Menu 1");
        JMenuItem a2 = new JMenuItem("Alt Menu 2");

        submenu.add(a1);
        submenu.add(a2);



        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(submenu);

        mb.add(menu);
        frame.setJMenuBar(mb);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("menubar örneği");
        JPopupMenu pm = new JPopupMenu("menü");
        JMenuItem cut = new JMenuItem("kes");
        JMenuItem copy = new JMenuItem("kopyala");
        JMenuItem paste = new JMenuItem("yapıştır");

        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pm.show(frame,e.getX(),e.getY());
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"kes butonuna tıklandı ");
            }
        });

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("progressbar örneği");
        JProgressBar pb = new JProgressBar(0,2000);
        pb.setBounds(40,40,160,30);
        pb.setValue(0);
        pb.setStringPainted(true);

        frame.add(pb);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        int i = 0;
        while (i<=2000){
            pb.setValue(i);
            i = i+20;
            Thread.sleep(150);
        }*/
        /*JFrame frame = new JFrame("Tabbedpane örneği");
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("İlk Alan");
        p1.add(l1);
        JPanel p2 = new JPanel();
        JLabel l2 = new JLabel("İkinci Alan");
        p2.add(l2);
        JPanel p3 = new JPanel();
        JLabel l3 = new JLabel("Üçüncü Alan");
        p3.add(l3);
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("ilk",p1);
        tp.add("ikinci",p2);
        tp.add("üçüncü",p3);
        frame.add(tp);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("Layout");
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(b1,BorderLayout.NORTH);
        panel.add(b2,BorderLayout.SOUTH);
        panel.add(b3,BorderLayout.EAST);
        panel.add(b4,BorderLayout.WEST);
        panel.add(b5,BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);*/

        /*JFrame frame = new JFrame("GridLayout");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);*/


        /*JFrame frame = new JFrame("GridLayout");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);*/

    }
}