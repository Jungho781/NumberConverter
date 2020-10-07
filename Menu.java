import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JButton binToDec=new JButton("Bin to Dec");
    JButton binToHex=new JButton("Bin to Hex");
    JButton decToBin=new JButton("Dec to Bin");
    JButton decToHex=new JButton("Dec to Hex");
    JButton hexToBin=new JButton("Hex to Bin");
    JButton hexToDec=new JButton("Hex to Dec");

    private int dec;
    private String bin;
    private String hex;

    public int getDec(){return this.dec;}
    public void setDec(){this.dec=dec;}
    public String getBin(){return this.bin;}
    public void setBin(){this.bin=bin;}
    public String getHex(){return this.hex;}
    public void setHex(){this.hex=hex;}

    public Menu() {
        this.bin=bin;
        this.hex=hex;
        this.dec=dec;
        createUI();

    }

    private void createUI(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.add(binToDec);
        panel.add(binToHex);
        panel.add(decToBin);
        panel.add(decToHex);
        panel.add(hexToBin);
        panel.add(hexToDec);
        frame.pack();

        binToDec.addActionListener(this);
        binToHex.addActionListener(this);
        decToBin.addActionListener(this);
        decToHex.addActionListener(this);
        hexToBin.addActionListener(this);
        hexToDec.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==binToDec){
            String binary= JOptionPane.showInputDialog(null,
                    "Enter a binary: ");
            binary=this.bin;


            JOptionPane.showMessageDialog(null,
                    Binary.convertToDecimal());

        }
        else if(e.getSource()==binToHex){
            String bin= JOptionPane.showInputDialog(null,
                    "Enter a binary:");

            JOptionPane.showMessageDialog(null,
                    Binary.convertToHexadecimal());

        }
        else if(e.getSource()==decToBin){
            String dec= JOptionPane.showInputDialog(null,
                    "Enter a decimal:");
            Integer.parseInt(dec);
            JOptionPane.showMessageDialog(null,
                    Decimal.convertToBinary());

        }
        else if(e.getSource()==decToHex){
            String dec= JOptionPane.showInputDialog(null,
                    "Enter a decimal:");
            Integer.parseInt(dec);
            JOptionPane.showMessageDialog(null,
                    Decimal.convertToHexadecimal());


        }
        else if(e.getSource()==hexToBin){
            String hex= JOptionPane.showInputDialog(null,
                    "Enter a hexadecimal:");
            JOptionPane.showMessageDialog(null,
                    Hexadecimal.convertToBinary());

        }
        else if(e.getSource()==hexToDec){
            String hex= JOptionPane.showInputDialog(null,
                    "Enter a hexadecimal:");
            JOptionPane.showMessageDialog(null,
                    Hexadecimal.convertToDecimal());

        }
    }
}
