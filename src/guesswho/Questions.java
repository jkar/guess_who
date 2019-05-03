/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesswho;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author yiannis
 */
public class Questions extends javax.swing.JFrame {

    //poianou seira einai
    private static int seira = 1;
    
    static Player p1;
    static Player p2;
    static Image img;
    
    //αν εγινε ηδη μια ερωτηση σ αυτον τον γυρο
    int quesForThisRound = -1;
    /**
     * Creates new form Questions
     */
    public Questions() {
        initComponents();
          
    }
    
    
    public Questions(int s,Player p1, Player p2) {
        initComponents();
        seira = s;
        this.p1 = p1;
        this.p2 = p2;
        setLabelImage(seira);
        try {
        img = ImageIO.read(getClass().getResource("Yellow.png"));
        } catch (Exception ex) {
        System.out.println(ex);
        }
        
        if (seira == 1) {
            jLabel2.setVisible(false);
        } else {
            jLabel1.setVisible(false);
        }
 
        setButton("Tyler.png",Tyler);
        setButton("Joseph.png",Joseph);
        setButton("Nick.png",Nick);
        setButton("Brandon.png",Brandon);
        setButton("Connor.png",Connor);
        setButton("Kyle.png",Kyle);
     
    }
    
    public Questions(int s) {
        initComponents();
        seira = s;
 
        setLabelImage(seira);
        
        if (seira == 1) {
            jLabel2.setVisible(false);
        } else {
            jLabel1.setVisible(false);
        }
        
        if (seira == 1) {
            
            setCard(p1,0,Tyler,"Tyler.png");
            setCard(p1,1,Joseph,"Joseph.png");
            setCard(p1,2,Nick,"Nick.png");
            setCard(p1,3,Brandon,"Brandon.png");
            setCard(p1,4,Connor,"Connor.png");
            setCard(p1,5,Kyle,"Kyle.png");
            
            /**
             if (p1.mauresKartes[0]==1) {
         try {
    Image img1 = ImageIO.read(getClass().getResource("Tyler.png"));
    Tyler.setIcon(new ImageIcon(img1));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Tyler.setIcon(new ImageIcon(img));
            }
            if (p1.mauresKartes[1]==1) {
           try {
    Image img2 = ImageIO.read(getClass().getResource("Joseph.png"));
    Joseph.setIcon(new ImageIcon(img2));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Joseph.setIcon(new ImageIcon(img));
            }
             
            if (p1.mauresKartes[2]==1) {
               try {
    Image img3 = ImageIO.read(getClass().getResource("Nick.png"));
    Nick.setIcon(new ImageIcon(img3));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Nick.setIcon(new ImageIcon(img));
            }
            if (p1.mauresKartes[3]==1) {
                try {
    Image img4 = ImageIO.read(getClass().getResource("Brandon.png"));
    Brandon.setIcon(new ImageIcon(img4));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Brandon.setIcon(new ImageIcon(img));
            }
            if (p1.mauresKartes[4]==1) {
                 try {
    Image img5 = ImageIO.read(getClass().getResource("Connor.png"));
    Connor.setIcon(new ImageIcon(img5));
  } catch (Exception ex) {
    System.out.println(ex);
  }   
            } else {
                Connor.setIcon(new ImageIcon(img));
            }
            if (p1.mauresKartes[5]==1) {
                 try {
    Image img6 = ImageIO.read(getClass().getResource("Kyle.png"));
    Kyle.setIcon(new ImageIcon(img6));
  } catch (Exception ex) {
    System.out.println(ex);
  }     
            } else {
                Kyle.setIcon(new ImageIcon(img));
            }
            */
        } else if (seira == 2) {
            setCard(p2,0,Tyler,"Tyler.png");
            setCard(p2,1,Joseph,"Joseph.png");
            setCard(p2,2,Nick,"Nick.png");
            setCard(p2,3,Brandon,"Brandon.png");
            setCard(p2,4,Connor,"Connor.png");
            setCard(p2,5,Kyle,"Kyle.png");
            /**
            if (p2.mauresKartes[0]==1) {
            try {
    Image img1 = ImageIO.read(getClass().getResource("Tyler.png"));
    Tyler.setIcon(new ImageIcon(img1));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Tyler.setIcon(new ImageIcon(img));
            }
            if (p2.mauresKartes[1]==1) {
           try {
    Image img2 = ImageIO.read(getClass().getResource("Joseph.png"));
    Joseph.setIcon(new ImageIcon(img2));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Joseph.setIcon(new ImageIcon(img));
            }
            if (p2.mauresKartes[2]==1) {
               try {
    Image img3 = ImageIO.read(getClass().getResource("Nick.png"));
    Nick.setIcon(new ImageIcon(img3));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Nick.setIcon(new ImageIcon(img));
            }
            if (p2.mauresKartes[3]==1) {
                try {
    Image img4 = ImageIO.read(getClass().getResource("Brandon.png"));
    Brandon.setIcon(new ImageIcon(img4));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                Brandon.setIcon(new ImageIcon(img));
            }
            if (p2.mauresKartes[4]==1) {
                 try {
    Image img5 = ImageIO.read(getClass().getResource("Connor.png"));
    Connor.setIcon(new ImageIcon(img5));
  } catch (Exception ex) {
    System.out.println(ex);
  }   
            } else {
                Connor.setIcon(new ImageIcon(img));
            }
            if (p2.mauresKartes[5]==1) {
                 try {
    Image img6 = ImageIO.read(getClass().getResource("Kyle.png"));
    Kyle.setIcon(new ImageIcon(img6));
  } catch (Exception ex) {
    System.out.println(ex);
  }   
            } else {
                Kyle.setIcon(new ImageIcon(img));
            }
            */
        }  
    }
    
    public int getSeira() {
        return seira;
    }
    
    public void setCard(Player p, int i,JButton jb, String im) {
           if (p.mauresKartes[i]==1) {
         try {
    Image img1 = ImageIO.read(getClass().getResource(im));
    jb.setIcon(new ImageIcon(img1));
  } catch (Exception ex) {
    System.out.println(ex);
  }
            } else {
                jb.setIcon(new ImageIcon(img));
            }
    }
    
    public void setLabel(String str,JLabel jl) {
                    try {
    Image img1 = ImageIO.read(getClass().getResource(str));
    jl.setIcon(new ImageIcon(img1));
  } catch (Exception ex) {
    System.out.println(ex);
  }
    }
    
    public void setButton(String str, JButton jb) {
        try {
    Image img2 = ImageIO.read(getClass().getResource(str));
    jb.setIcon(new ImageIcon(img2));
  } catch (Exception ex) {
    System.out.println(ex);
  }
    }
    
    public void clickOnFace(int i, String str, JButton jb) {
         if (seira == 1) {
            if (p1.mauresKartes[i]==1) {
                p1.mauresKartes[i]=0;
                jb.setIcon(new ImageIcon(img));
            } else {
                p1.mauresKartes[i]=1;
                try {
                Image img1 = ImageIO.read(getClass().getResource(str));
                jb.setIcon(new ImageIcon(img1));
                } catch (Exception ex) {
                System.out.println(ex);
                 }
            }
            
        } else if (seira == 2) {
            
            if (p2.mauresKartes[i]==1) {
                p2.mauresKartes[i]=0;
                jb.setIcon(new ImageIcon(img));
            } else {
                p2.mauresKartes[i]=1;
                try {
                Image img1 = ImageIO.read(getClass().getResource(str));
                jb.setIcon(new ImageIcon(img1));
                } catch (Exception ex) {
                System.out.println(ex);
                 }
            }     
        }
    }
    
    
    public void setLabelImage(int s) {
        if (s == 1) {
            int im = 0;
            im = p1.getPlayerToBeFound();
             
           if (im == 0) {
               // try {
   // Image img1 = ImageIO.read(getClass().getResource("Tyler.png"));
   // jLabel5.setIcon(new ImageIcon(img1));
   // System.out.println("got in 1st");
  //} catch (Exception ex) {
  //  System.out.println(ex);
  //}
               setLabel("Tyler.png",jLabel5);
           }
           if (im == 1) {
               setLabel("Joseph.png",jLabel5);
           }
           if (im == 2) {
               setLabel("Nick.png",jLabel5);
           }
           if (im == 3) {
               setLabel("Brandon.png",jLabel5);
           }
           if (im == 4) {
               setLabel("Connor.png",jLabel5);
           }
           if (im == 5) {
               setLabel("Kyle.png",jLabel5);
           }
           
           
        } else if (s == 2) {
            int im = p2.getPlayerToBeFound();
            
            if (im == 0) {
                setLabel("Tyler.png",jLabel5);
            }
            if (im == 1) {
                setLabel("Joseph.png",jLabel5);
            }
            if (im == 2) {
                setLabel("Nick.png",jLabel5);
           }
            if (im == 3) {
                setLabel("Brandon.png",jLabel5);
           }
            if (im == 4) {
                setLabel("Connor.png",jLabel5);
           }
            if (im == 5) {
                setLabel("Kyle.png",jLabel5);
           }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moustacheButton = new javax.swing.JButton();
        wearGlasses = new javax.swing.JButton();
        wearHat = new javax.swing.JButton();
        isItMale = new javax.swing.JButton();
        hasBeards = new javax.swing.JButton();
        isBald = new javax.swing.JButton();
        bigEyeBrows = new javax.swing.JButton();
        eyesColor = new javax.swing.JButton();
        hairColor = new javax.swing.JButton();
        hatColor = new javax.swing.JButton();
        skinColor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tyler = new javax.swing.JButton();
        Joseph = new javax.swing.JButton();
        Nick = new javax.swing.JButton();
        Brandon = new javax.swing.JButton();
        Connor = new javax.swing.JButton();
        Kyle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nextPlayer = new javax.swing.JButton();
        findWho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        moustacheButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        moustacheButton.setText("Does he have moustache?");
        moustacheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moustacheButtonActionPerformed(evt);
            }
        });
        getContentPane().add(moustacheButton);
        moustacheButton.setBounds(610, 260, 235, 23);

        wearGlasses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wearGlasses.setText("Does he/she wear glasses?");
        wearGlasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wearGlassesActionPerformed(evt);
            }
        });
        getContentPane().add(wearGlasses);
        wearGlasses.setBounds(610, 290, 235, 23);

        wearHat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wearHat.setText("Does he/she wear hat?");
        wearHat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wearHatActionPerformed(evt);
            }
        });
        getContentPane().add(wearHat);
        wearHat.setBounds(610, 320, 235, 23);

        isItMale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        isItMale.setText("Is it a male?");
        isItMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isItMaleActionPerformed(evt);
            }
        });
        getContentPane().add(isItMale);
        isItMale.setBounds(610, 350, 235, 23);

        hasBeards.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hasBeards.setText("Does he have beards?");
        hasBeards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasBeardsActionPerformed(evt);
            }
        });
        getContentPane().add(hasBeards);
        hasBeards.setBounds(610, 370, 235, 23);

        isBald.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        isBald.setText("Is he bald?");
        isBald.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBaldActionPerformed(evt);
            }
        });
        getContentPane().add(isBald);
        isBald.setBounds(610, 400, 235, 23);

        bigEyeBrows.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bigEyeBrows.setText("Does he/she have big eyebrows?");
        bigEyeBrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigEyeBrowsActionPerformed(evt);
            }
        });
        getContentPane().add(bigEyeBrows);
        bigEyeBrows.setBounds(610, 430, 235, 23);

        eyesColor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eyesColor.setText("What is the color of the eyes?");
        eyesColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyesColorActionPerformed(evt);
            }
        });
        getContentPane().add(eyesColor);
        eyesColor.setBounds(610, 460, 235, 23);

        hairColor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hairColor.setText("What is the color of the hair?");
        hairColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hairColorActionPerformed(evt);
            }
        });
        getContentPane().add(hairColor);
        hairColor.setBounds(610, 490, 235, 23);

        hatColor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hatColor.setText("What is the color of the hat?");
        hatColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hatColorActionPerformed(evt);
            }
        });
        getContentPane().add(hatColor);
        hatColor.setBounds(610, 530, 235, 23);

        skinColor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        skinColor.setText("What is the color of the skin?");
        skinColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skinColorActionPerformed(evt);
            }
        });
        getContentPane().add(skinColor);
        skinColor.setBounds(610, 560, 235, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Player1 asks a question:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(242, 443, 219, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Player2 asks a question:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(242, 479, 219, 22);

        Tyler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TylerActionPerformed(evt);
            }
        });
        getContentPane().add(Tyler);
        Tyler.setBounds(10, 10, 160, 230);

        Joseph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JosephActionPerformed(evt);
            }
        });
        getContentPane().add(Joseph);
        Joseph.setBounds(180, 10, 140, 230);

        Nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NickActionPerformed(evt);
            }
        });
        getContentPane().add(Nick);
        Nick.setBounds(330, 10, 130, 230);

        Brandon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandonActionPerformed(evt);
            }
        });
        getContentPane().add(Brandon);
        Brandon.setBounds(470, 10, 150, 230);

        Connor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnorActionPerformed(evt);
            }
        });
        getContentPane().add(Connor);
        Connor.setBounds(630, 10, 140, 230);

        Kyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KyleActionPerformed(evt);
            }
        });
        getContentPane().add(Kyle);
        Kyle.setBounds(780, 10, 140, 230);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 356, 0, 0);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Chosen person");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 331, 91, 15);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 370, 180, 220);

        nextPlayer.setText("Next player");
        nextPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPlayerActionPerformed(evt);
            }
        });
        getContentPane().add(nextPlayer);
        nextPlayer.setBounds(190, 590, 130, 23);

        findWho.setText("Find Who");
        findWho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findWhoActionPerformed(evt);
            }
        });
        getContentPane().add(findWho);
        findWho.setBounds(360, 590, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moustacheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moustacheButtonActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound==-1 || quesForThisRound==0) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getHasMoustache()) {
                System.out.println("The wanted person has moustache!");
                JOptionPane.showMessageDialog(null, "The wanted person has moustache!");
                quesForThisRound = 0;
            } else {
                System.out.println("The wanted person hasn't moustache..");
                JOptionPane.showMessageDialog(null, "The wanted person hasn't moustache..");
                quesForThisRound = 0;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getHasMoustache()) {
                System.out.println("The wanted person has moustache!");
                JOptionPane.showMessageDialog(null, "The wanted person has moustache!");
                quesForThisRound = 0;
            } else {
                System.out.println("The wanted person hasn't moustache..");
                JOptionPane.showMessageDialog(null, "The wanted person hasn't moustache..");
                quesForThisRound = 0;
            }   
        } 
        }  else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_moustacheButtonActionPerformed

    private void wearGlassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wearGlassesActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound ==-1 || quesForThisRound ==1) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getWearGlasses()) {
                System.out.println("The wanted person wears glasses!");
                JOptionPane.showMessageDialog(null, "The wanted person wears glasses!");
                quesForThisRound = 1;
            } else {
                System.out.println("The wanted person does not wear glasses..");
                JOptionPane.showMessageDialog(null, "The wanted person does not wear glasses..");
                quesForThisRound = 1;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getWearGlasses()) {
                System.out.println("The wanted person wears glasses!");
                JOptionPane.showMessageDialog(null, "The wanted person wears glasses!");
                quesForThisRound = 1;
            } else {
                System.out.println("The wanted person does not wear glasses..");
                JOptionPane.showMessageDialog(null, "The wanted person does not wear glasses..");
                quesForThisRound = 1;
            }
            
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_wearGlassesActionPerformed

    private void ConnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnorActionPerformed
        // TODO add your handling code here:
        clickOnFace(4,"Connor.png",Connor);
        
    }//GEN-LAST:event_ConnorActionPerformed

    private void TylerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TylerActionPerformed
        // TODO add your handling code here:
        clickOnFace(0,"Tyler.png",Tyler);
        /**
        if (seira == 1) {
            if (p1.mauresKartes[0]==1) {
                p1.mauresKartes[0]=0;
                Tyler.setIcon(new ImageIcon(img));
            } else {
                p1.mauresKartes[0]=1;
                try {
                Image img1 = ImageIO.read(getClass().getResource("Tyler.png"));
                Tyler.setIcon(new ImageIcon(img1));
                } catch (Exception ex) {
                System.out.println(ex);
                 }
            }   
        } else if (seira == 2) {
            
            if (p2.mauresKartes[0]==1) {
                p2.mauresKartes[0]=0;
                Tyler.setIcon(new ImageIcon(img));
            } else {
                p2.mauresKartes[0]=1;
                try {
                Image img1 = ImageIO.read(getClass().getResource("Tyler.png"));
                Tyler.setIcon(new ImageIcon(img1));
                } catch (Exception ex) {
                System.out.println(ex);
                 }
            }     
        } 
        */ 
    }//GEN-LAST:event_TylerActionPerformed

    private void JosephActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JosephActionPerformed
        // TODO add your handling code here:
        clickOnFace(1,"Joseph.png",Joseph);
        
    }//GEN-LAST:event_JosephActionPerformed

    private void nextPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPlayerActionPerformed
        // TODO add your handling code here:
                if (seira==1) {
                seira = 2;
                this.dispose();
                Questions q = new Questions(seira);
                q.setVisible(true);
                q.setResizable(false);
                } else if (seira==2) {
                    seira = 1;
                this.dispose();
                Questions q = new Questions(seira);
                q.setVisible(true);
                q.setResizable(false);
                }
    }//GEN-LAST:event_nextPlayerActionPerformed

    private void NickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NickActionPerformed
        // TODO add your handling code here:
        clickOnFace(2,"Nick.png",Nick);
        
    }//GEN-LAST:event_NickActionPerformed

    private void BrandonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandonActionPerformed
        // TODO add your handling code here:
        clickOnFace(3,"Brandon.png",Brandon);
        
    }//GEN-LAST:event_BrandonActionPerformed

    private void KyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KyleActionPerformed
        // TODO add your handling code here:
        clickOnFace(5,"Kyle.png",Kyle);
        
    }//GEN-LAST:event_KyleActionPerformed

    private void wearHatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wearHatActionPerformed
        // TODO add your handling code here:
         if (quesForThisRound ==-1 || quesForThisRound ==2) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getWearHat()) {
                System.out.println("The wanted person wears hat!");
                JOptionPane.showMessageDialog(null, "The wanted person wears hat!");
                quesForThisRound = 2;
            } else {
                System.out.println("The wanted person does not wear hat..");
                JOptionPane.showMessageDialog(null, "The wanted person does not wear hat..");
                quesForThisRound = 2;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getWearHat()) {
                System.out.println("The wanted person wears hat!");
                JOptionPane.showMessageDialog(null, "The wanted person wears hat!");
                quesForThisRound = 2;
            } else {
                System.out.println("The wanted person does not wear hat..");
                JOptionPane.showMessageDialog(null, "The wanted person does not wear hat..");
                quesForThisRound = 2;
            }
            
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_wearHatActionPerformed

    private void isItMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isItMaleActionPerformed
        // TODO add your handling code here:
         if (quesForThisRound ==-1 || quesForThisRound ==3) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getIfMale()) {
                System.out.println("The wanted person is male!");
                JOptionPane.showMessageDialog(null, "The wanted person is male!");
                quesForThisRound = 3;
            } else {
                System.out.println("The wanted person is not male");
                JOptionPane.showMessageDialog(null, "The wanted person is not male");
                quesForThisRound = 3;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getIfMale()) {
                System.out.println("The wanted person is male!");
                JOptionPane.showMessageDialog(null, "The wanted person is male!");
                quesForThisRound = 3;
            } else {
                System.out.println("The wanted person is not male");
                JOptionPane.showMessageDialog(null, "The wanted person is not male");
                quesForThisRound = 3;
            }
            
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_isItMaleActionPerformed

    private void hasBeardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasBeardsActionPerformed
        // TODO add your handling code here:
         if (quesForThisRound ==-1 || quesForThisRound ==4) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getHasBeard()) {
                System.out.println("The wanted person has beard!");
                JOptionPane.showMessageDialog(null, "The wanted person has beard!");
                quesForThisRound = 4;
            } else {
                System.out.println("The wanted person has not beard..");
                JOptionPane.showMessageDialog(null, "The wanted person has not beard..");
                quesForThisRound = 4;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getHasBeard()) {
                System.out.println("The wanted person has beard!");
                JOptionPane.showMessageDialog(null, "The wanted person has beard!");
                quesForThisRound = 4;
            } else {
                System.out.println("The wanted person has not beard..");
                JOptionPane.showMessageDialog(null, "The wanted person has not beard..");
                quesForThisRound = 4;
            }
            
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_hasBeardsActionPerformed

    private void isBaldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isBaldActionPerformed
        // TODO add your handling code here:
         if (quesForThisRound ==-1 || quesForThisRound ==5) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getIsBald()) {
                System.out.println("The wanted person is bald!");
                JOptionPane.showMessageDialog(null, "The wanted person is bald!");
                quesForThisRound = 5;
            } else {
                System.out.println("The wanted person is not bald..");
                JOptionPane.showMessageDialog(null, "The wanted person is not bald..");
                quesForThisRound = 5;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getIsBald()) {
                System.out.println("The wanted person is bald!");
                JOptionPane.showMessageDialog(null, "The wanted person is bald!");
                quesForThisRound = 5;
            } else {
                System.out.println("The wanted person is not bald..");
                JOptionPane.showMessageDialog(null, "The wanted person is not bald..");
                quesForThisRound = 5;
            }
            
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_isBaldActionPerformed

    private void bigEyeBrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigEyeBrowsActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound ==-1 || quesForThisRound ==6) {
        if (seira == 1) {
            if (p2.persons[p2.getPlayerToBeFound()].getBigEyeBrows()) {
                System.out.println("The wanted person has big eyebrows!");
                JOptionPane.showMessageDialog(null, "The wanted person has big eyebrows!");
                quesForThisRound = 6;
            } else {
                System.out.println("The wanted person has not big eyebrows..");
                JOptionPane.showMessageDialog(null, "The wanted person has not big eyebrows..");
                quesForThisRound = 6;
            }  
        } else if (seira == 2) {
            if (p1.persons[p1.getPlayerToBeFound()].getBigEyeBrows()) {
                System.out.println("The wanted person has big eyebrows!");
                JOptionPane.showMessageDialog(null, "The wanted person has big eyebrows!");
                quesForThisRound = 6;
            } else {
                System.out.println("The wanted person has not big eyebrows..");
                JOptionPane.showMessageDialog(null, "The wanted person has not big eyebrows..");
                quesForThisRound = 6;
            }
            
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_bigEyeBrowsActionPerformed

    private void eyesColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyesColorActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound ==-1 || quesForThisRound ==7) {
        if (seira == 1) {
             String ans =  p2.persons[p2.getPlayerToBeFound()].getEyesColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 7;
              
        } else if (seira == 2) {
            String ans = p1.persons[p1.getPlayerToBeFound()].getEyesColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 7;   
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_eyesColorActionPerformed

    private void hairColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hairColorActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound ==-1 || quesForThisRound ==8) {
        if (seira == 1) {
             String ans =  p2.persons[p2.getPlayerToBeFound()].getHairColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 8;
              
        } else if (seira == 2) {
            String ans = p1.persons[p1.getPlayerToBeFound()].getHairColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 8;   
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_hairColorActionPerformed

    private void hatColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatColorActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound ==-1 || quesForThisRound ==9) {
        if (seira == 1) {
             String ans =  p2.persons[p2.getPlayerToBeFound()].getHatColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 9;
              
        } else if (seira == 2) {
            String ans = p1.persons[p1.getPlayerToBeFound()].getHatColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 9;   
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_hatColorActionPerformed

    private void skinColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skinColorActionPerformed
        // TODO add your handling code here:
        if (quesForThisRound ==-1 || quesForThisRound ==10) {
        if (seira == 1) {
             String ans =  p2.persons[p2.getPlayerToBeFound()].getSkinColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 10;
              
        } else if (seira == 2) {
            String ans = p1.persons[p1.getPlayerToBeFound()].getSkinColor();
                System.out.println(ans);
                JOptionPane.showMessageDialog(null, ans);
                quesForThisRound = 10;   
        }
        } else {
            JOptionPane.showMessageDialog(null, "You ve already asked a question for this round");
        }
    }//GEN-LAST:event_skinColorActionPerformed

    private void findWhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findWhoActionPerformed
        // TODO add your handling code here:
        if (seira==1) {
            this.dispose();
            FindingBoard fb = new FindingBoard(p2,seira);
            fb.setVisible(true);
        } else if (seira==2) {
            this.dispose();
            FindingBoard fb = new FindingBoard(p1,seira);
            fb.setVisible(true);
        }
        
    }//GEN-LAST:event_findWhoActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brandon;
    private javax.swing.JButton Connor;
    private javax.swing.JButton Joseph;
    private javax.swing.JButton Kyle;
    private javax.swing.JButton Nick;
    private javax.swing.JButton Tyler;
    private javax.swing.JButton bigEyeBrows;
    private javax.swing.JButton eyesColor;
    private javax.swing.JButton findWho;
    private javax.swing.JButton hairColor;
    private javax.swing.JButton hasBeards;
    private javax.swing.JButton hatColor;
    private javax.swing.JButton isBald;
    private javax.swing.JButton isItMale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton moustacheButton;
    private javax.swing.JButton nextPlayer;
    private javax.swing.JButton skinColor;
    private javax.swing.JButton wearGlasses;
    private javax.swing.JButton wearHat;
    // End of variables declaration//GEN-END:variables
}
