
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
public class FEFatesPMUGUI extends JApplet implements ActionListener
{
    private FEFatesPMU pmu;
    private int route;
    private int numRoutesOwned;
    private Unit[] picks;
    private Font myFont;
    private BufferedImage cq;
    private BufferedImage br;
    private BufferedImage rv;
    private BufferedImage fates;
    private JPanel myPanel;
    private JButton generate;
    private String[] routes;
    private JComboBox<String> routeBox;
    private String[] numRoutesString;
    private JComboBox<String> numRoutes;
    private JCheckBox annaDLC;
    private JCheckBox royalDLC;
    private JCheckBox ballisticianDLC;
    private JCheckBox witchDLC;
    private JCheckBox vanguardDLC;
    private JCheckBox hiddenTruthsDLC;
    private JCheckBox marthAmiibo;
    private JCheckBox ikeAmiibo;
    private JCheckBox lucinaAmiibo;
    private JCheckBox robinAmiibo;
    private Image offscreen;
    private Graphics buffer;
    public static void main(String[] args){
        JFrame frame = new JFrame("Fire Emblem Fates PMU Generator");
        frame.setSize(500,500);
        final JApplet gui = new FEFatesPMUGUI();
        frame.getContentPane().add(gui);
        frame.setVisible(true);
        gui.init();
        gui.start();
    }
    public void init(){
        pmu = new FEFatesPMU();
        route = 0;
        numRoutesOwned = 1;
        //myFont = new Font("TimesRoman", Font.PLAIN, 12);
        try{
            cq = ImageIO.read(new File("Conquest.bmp"));
            br = ImageIO.read(new File("Birthright.bmp"));
            rv = ImageIO.read(new File("Revelation.bmp"));
            fates = ImageIO.read(new File("Fates.bmp"));
        } catch(IOException e) {}
        offscreen = createImage(500,380);
        buffer = offscreen.getGraphics();
        repaint();
        this.setLayout(new BorderLayout());
        myPanel = new JPanel();
        myPanel.setLayout(new WrapLayout());
        generate = new JButton("Generate");
        generate.addActionListener(this);
        myPanel.add(generate);
        routes = new String[] {"Conquest","Birthright","Revelation","Random"};
        routeBox = new JComboBox<String>(routes);
        routeBox.setSelectedIndex(0);
        routeBox.addActionListener(this);
        myPanel.add(routeBox);
        numRoutesString = new String[] {"1 route owned","2 routes owned","3 routes owned"};
        numRoutes = new JComboBox<String>(numRoutesString);
        numRoutes.setSelectedIndex(0);
        numRoutes.addActionListener(this);
        myPanel.add(numRoutes);
        annaDLC = new JCheckBox("Anna on the Run");
        annaDLC.setSelected(false);
        myPanel.add(annaDLC);
        royalDLC = new JCheckBox("Royal Royale");
        royalDLC.setSelected(false);
        myPanel.add(royalDLC);
        ballisticianDLC = new JCheckBox("Ballistician Blitz");
        ballisticianDLC.setSelected(false);
        myPanel.add(ballisticianDLC);
        witchDLC = new JCheckBox("Witch's Trial");
        witchDLC.setSelected(false);
        myPanel.add(witchDLC);
        vanguardDLC = new JCheckBox("Vanguard Dawn");
        vanguardDLC.setSelected(false);
        myPanel.add(vanguardDLC);
        hiddenTruthsDLC = new JCheckBox("Hidden Truths 1");
        hiddenTruthsDLC.setSelected(false);
        myPanel.add(hiddenTruthsDLC);
        marthAmiibo = new JCheckBox("Marth Amiibo");
        marthAmiibo.setSelected(false);
        myPanel.add(marthAmiibo);
        ikeAmiibo = new JCheckBox("Ike Amiibo");
        ikeAmiibo.setSelected(false);
        myPanel.add(ikeAmiibo);
        lucinaAmiibo = new JCheckBox("Lucina Amiibo");
        lucinaAmiibo.setSelected(false);
        myPanel.add(lucinaAmiibo);
        robinAmiibo = new JCheckBox("Robin Amiibo");
        robinAmiibo.setSelected(false);
        myPanel.add(robinAmiibo);
        this.add(myPanel,BorderLayout.SOUTH);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(generate)){
            if(routeBox.getSelectedIndex() == 3)
                route = (int)(Math.random()*3);
            picks = pmu.generate(route,numRoutesOwned,annaDLC.isSelected(),royalDLC.isSelected(),
            ballisticianDLC.isSelected(),witchDLC.isSelected(),vanguardDLC.isSelected(),
            hiddenTruthsDLC.isSelected(),marthAmiibo.isSelected(),ikeAmiibo.isSelected(),
            lucinaAmiibo.isSelected(),robinAmiibo.isSelected());
            repaint();
        }
        if(ae.getSource().equals(routeBox)){
            route = routeBox.getSelectedIndex();
        }
        if(ae.getSource().equals(numRoutes)){
            numRoutesOwned = routeBox.getSelectedIndex() + 1;
        }
    }
    public void paint(Graphics g){
        if(route == 0){
            buffer.setColor(Color.BLACK);
            buffer.fillRect(0,0,500,500);
            buffer.drawImage(cq,0,0,this);
            buffer.setColor(Color.WHITE);
        }
        else if(route == 1 || route == 2){
            buffer.setColor(Color.WHITE);
            buffer.fillRect(0,0,500,500);
            if(route == 1)
                buffer.drawImage(br,0,0,this);
            else
                buffer.drawImage(rv,0,0,this);
            buffer.setColor(Color.BLACK);
        }
        //buffer.setFont(myFont);
        if(picks == null)
            buffer.drawImage(fates,0,0,this);
        else{
            for(int x = 0; x < picks.length; x++){
                buffer.drawString(picks[x].toString(),8,(x*15)+110);
            }
        }
        g.drawImage(offscreen,0,0,this);
    }
}
