package gui.niecoOmne;
/*
Úloha č.1 (Niečo o mne):
        Vytvorte grafickú aplikáciu prostredníctvom Swing, kde sa predstavíte. Aplikácia, resp. okno bude obsahovať Vašu fotografiu (ak chcete) alebo miesto, kde žijete + odkaz na Váš LinkedIn, príp. Facebook, Instagram, príp. hypertextové odkazy na obľúbené stránky + text o Vás (kde pracujete, odkiaľ pochádzate, skúsenosti s programovaním, koníčky, atď.). V okne bude iba jedno jediné tlačidlo Ok, ktoré zatvorí aplikáciu a vypíše obsah celého textu do konzoly.
        Pomôcky: Trieda, ktorú budeme spúšťať sa bude volať Main a bude umiestnená v balíčku (package) gui.niecoomne
        Budeme používať JFrame, JPanel, JLabel, JButton. Okno bude vycentrované.

        Bonus: Texty, ktoré sa zobrazia v okne môžu byť farebne odlíšené, hint: setForeground(). Môžete urobiť aj klikateľné hypertextové odkazy, hint: https://www.codejava.net/java-se/swing/how-to-create-hyperlink-with-jlabel-in-java-swing

        Namiesto JLabel skúste použiť JTextArea, konkrétny kód môže vyzerať nasledovne:

JTextArea textArea = new JTextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et quam bibendum, ullamcorper nibh at, gravida enim. Donec auctor tortor et elit blandit placerat. Vestibulum aliquet vitae tellus at mattis. Curabitur sagittis tincidunt ipsum, in faucibus ante tempor a. Sed quis diam ut ante posuere pretium. Nam iaculis tincidunt velit vel pharetra. Suspendisse consequat et massa accumsan pharetra. Nullam condimentum vitae nisl quis consequat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos."); // popisok
textArea.setBounds(140,50,300,50); // x, y, sirka, vyska
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
textArea.setEditable(false);
textArea.setOpaque(false);
panel.add(textArea);
Pre väčšie texty je lepšie použiť JTextArea namiesto JLabel
Ukázka hore funguje
Viac na https://stackoverflow.com/questions/6984099/how-to-fit-a-long-string-into-a-jlabel

*/
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Color;
import javax.swing.*;

public class Main {

            public static void main(String[] args) {


                JFrame frame = new JFrame("Niečo o mne"); // vytvorime okno s názvom okna
             //   frame.setVisible(true); //nefunguje, nie je vidieť vôbec nič ani text ani obrázok
                frame.setMinimumSize(new Dimension(1000, 700)); // nastavíme veľkosť okna 1000x700 px (px=obrazových bodov)
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
                frame.setLocationRelativeTo(null); // vycentrovanie okna

                // Nastavenie farby pozadia na svetlo modrú
             //   frame.getContentPane().setBackground(new Color(173, 216, 230));
                frame.getContentPane().setBackground(Color.GREEN);


                // JFrame by mal obsahovat panel, teda container JPanel
                JPanel panel = new JPanel();
                panel.setLayout(null); // layout pre panel bude null, cize prazdny - podporí vytvorenie JTextField

                frame.setContentPane(panel); // my dany panel pridame do frame

                //vytvorenie farebného textu
                JTextPane textPane = new JTextPane();
                textPane.setText("Volám sa Katarína Krajčiová. ");
                textPane.setBounds(400, 50, 500, 40);

                // Vytvorte nový štýl
                Style style = textPane.addStyle("MyStyle", null);
                StyleConstants.setForeground(style, Color.BLUE); // Nastavíme farbu textu na červenú
                StyleConstants.setFontSize(style,18);

                // Aplikujte štýl na text v JTextPane
                StyledDocument doc = textPane.getStyledDocument();
                doc.setCharacterAttributes(0, textPane.getText().length(), style, false);

                textPane.setOpaque(false);
                panel.add(textPane);


    /*            // Vytvorte nový štýl pre šikmé písmo
                Style italicStyle = textPane.addStyle("ItalicStyle", null);
                StyleConstants.setItalic(italicStyle, true);

                // Vytvorte nový štýl pre zmena typu písma (napr. Arial)
                Style fontChangeStyle = textPane.addStyle("FontChangeStyle", null);
                StyleConstants.setFontFamily(fontChangeStyle, "Arial");

                // Vytvorte nový štýl pre zvýraznenie hrubého písma
                Style boldStyle = textPane.addStyle("BoldStyle", null);
                StyleConstants.setBold(boldStyle, true);

                // Vytvorte nový štýl pre podčiarknutie
                Style underlineStyle = textPane.addStyle("UnderlineStyle", null);
                StyleConstants.setUnderline(underlineStyle, true);

                // Kombinujte štýly podľa potreby
                Style combinedStyle = textPane.addStyle("CombinedStyle", null);
                StyleConstants.setItalic(combinedStyle, true);
                StyleConstants.setFontFamily(combinedStyle, "Arial");
                StyleConstants.setBold(combinedStyle, true);
                StyleConstants.setUnderline(combinedStyle, true);

                // Aplikujte štýly na text v JTextPane podľa požiadaviek
                StyledDocument doc = textPane.getStyledDocument();
                doc.setCharacterAttributes(0, textPane.getText().length(), italicStyle, false);
                doc.setCharacterAttributes(13, 5, fontChangeStyle, false); // Zmena typu písma od pozície 13 na 5 znakov
                doc.setCharacterAttributes(29, 9, boldStyle, false); // Zvýraznenie hrubého písma od pozície 29 na 9 znakov
                doc.setCharacterAttributes(40, 15, underlineStyle, false); // Podčiarknutie od pozície 40 na 15 znakov
                doc.setCharacterAttributes(56, 14, combinedStyle, false); // Kombinovaný štýl od pozície 56 na 14 znakov*/


                   JTextArea textArea = new JTextArea
                      ("""
Pochádzam zo Zlatých Moraviec. Mometnálne bývam už 12 rokov v dedinke Podolie pri Novom Meste nad Váhom.
Pracujem v menšej spoločnosti, ktorá vyrába tlakomery, konkrétne na kalibračnom oddelení vrátane plánovania výroby.

Mám manžela a 12ročnú dcéru a spoločne sa venujeme turistike, skalnému lezeniu, zvieratám a domácnosti samozrejme :).

S programovaním nemám doteraz žiadne skúsenosti. Možno v minulosti ako dieťa. 
Keď programovanie preberal starší brat na strednej škole. 
Tak mne a bratovi ukázal ako si kresliť, či vytvárať zvuky. Ale to už si samozrejme nepamätám. 

Tak som sa rozhodla rozšíriť si vedomosti a možnosti aj v tejto oblasti. 




Odkazy:
""");


                // popisok pod vytvoreným textovým fieldom
                textArea.setBounds(400,80,500,310); // x, y, sirka, vyska
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);
                textArea.setOpaque(false);

                panel.add(textArea);






                JButton btnOk = new JButton("OK");
                btnOk.setBounds(800, 550, 80, 20);

                btnOk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(textArea.getText());
                        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

                    }

                });

                panel.add(btnOk);


                // vloženie obrázka - musí byť v JavaPríklady vloženy
                try {
                    // Načítajte obrázok
                    File imageFile = new File("DSC_0180.jpg");
                    Image image = ImageIO.read(imageFile);

                    // Vytvorte JLabel s načítaným obrázkom
                    JLabel imageLabel = new JLabel(new ImageIcon(image));
                    imageLabel.setBounds(40,40,330,550); // Nastavte polohu a veľkosť obrázka

                    panel.add(imageLabel); // Pridajte JLabel do panelu

                } catch (IOException e) {
                    e.printStackTrace();
                }




             // vloženie odkazov
                JLabel hyperlinkLabel = new JLabel("<html><a href=\"https://www.facebook.com/katarina.tatarkovicova/\">Môj Facebook profil</a></html>");
                hyperlinkLabel.setBounds(400, 400, 150, 20); // Nastavte polohu a veľkosť odkazu

                hyperlinkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Zmení kurzor na ruku pri najazdení myšou

                hyperlinkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.facebook.com/katarina.tatarkovicova/"));
                        } catch (IOException | URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                });

                panel.add(hyperlinkLabel);

                JLabel hyperlinkLabel1 = new JLabel("<html><a href=\"https://www.instagram.com/katkakraj/\">Môj Instagram</a></html>");
                hyperlinkLabel1.setBounds(400, 420, 150, 20); // Nastavte polohu a veľkosť odkazu

                hyperlinkLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Zmení kurzor na ruku pri najazdení myšou

                hyperlinkLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.instagram.com/katkakraj/"));
                        } catch (IOException | URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                });

                panel.add(hyperlinkLabel1);

                JLabel hyperlinkLabel2 = new JLabel("<html><a href=\"https://www.facebook.com/groups/1659705254275979/?ref=bookmarks\">Moja FB skupina</a></html>");
                hyperlinkLabel2.setBounds(400, 440, 150, 20); // Nastavte polohu a veľkosť odkazu

                hyperlinkLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Zmení kurzor na ruku pri najazdení myšou

                hyperlinkLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.facebook.com/groups/1659705254275979/?ref=bookmarks"));
                        } catch (IOException | URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                });

                panel.add(hyperlinkLabel2);

                JLabel hyperlinkLabel3 = new JLabel("<html><a href=\"https://www.linkedin.com/in/katka-krajčiová-679a511b5\">Môj LinkedIn</a></html>");
                hyperlinkLabel3.setBounds(400, 460, 150, 20); // Nastavte polohu a veľkosť odkazu

                hyperlinkLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Zmení kurzor na ruku pri najazdení myšou

                hyperlinkLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/katka-krajčiová-679a511b5"));
                        } catch (IOException | URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                });

                panel.add(hyperlinkLabel3);




                // display it
                frame.pack();
                frame.setVisible(true);


            }
        }

       /* frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // Korektne zatvori celu SWING aplikaciu*/