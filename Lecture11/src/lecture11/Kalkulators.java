/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11;

/**
 *
 * @author Davis
 */
public class Kalkulators extends javax.swing.JPanel {

    /**
     * Creates new form Kalkulators
     */
    public Kalkulators() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        lauks1 = new javax.swing.JLabel();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        result_lauks = new javax.swing.JLabel();
        equals = new javax.swing.JButton();
        resultLauks = new javax.swing.JLabel();
        reiz = new javax.swing.JButton();
        dalit = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        lauks1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lauks1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        resultLabel.setText("Rezultats:");

        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        reiz.setText("*");
        reiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reizActionPerformed(evt);
            }
        });

        dalit.setText("/");
        dalit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalitActionPerformed(evt);
            }
        });

        clear.setText("Nodzest");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(seven)
                                .addComponent(four)
                                .addComponent(one)
                                .addComponent(plus))
                            .addComponent(reiz))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(three)
                            .addComponent(nine)
                            .addComponent(six)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dalit)
                                    .addComponent(minus)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lauks1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(result_lauks)
                        .addGap(18, 18, 18)
                        .addComponent(resultLauks)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lauks1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one)
                            .addComponent(three))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(four)
                            .addComponent(six))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seven)
                            .addComponent(nine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reiz))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(two)
                        .addGap(28, 28, 28)
                        .addComponent(five)
                        .addGap(22, 22, 22)
                        .addComponent(eight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zero)
                            .addComponent(minus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equals)
                            .addComponent(dalit))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLabel)
                    .addComponent(result_lauks)
                    .addComponent(resultLauks))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    String virkne = "", skaitlaVirkne = "";
    char symbol;
    int skaitlis1, skaitlis2, result = 0;
    boolean pirmais = true, otrsSimbols = false;

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed

        lauks1.setText(virkne + "1");
        virkne += '1';
        skaitlaVirkne += '1';
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        lauks1.setText(virkne + "2");
        virkne += '2';
        skaitlaVirkne += '2';
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        lauks1.setText(virkne + "3");
        virkne += '3';
        skaitlaVirkne += '3';
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        lauks1.setText(virkne + "4");
        virkne += '4';
        skaitlaVirkne += '4';
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        lauks1.setText(virkne + "5");
        virkne += '5';
        skaitlaVirkne += '5';
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        lauks1.setText(virkne + "6");
        virkne += '6';
        skaitlaVirkne += '6';
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        lauks1.setText(virkne + "7");
        virkne += '7';
        skaitlaVirkne += '7';
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        lauks1.setText(virkne + "8");
        virkne += '8';
        skaitlaVirkne += '8';
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        lauks1.setText(virkne + "9");
        virkne += '9';
        skaitlaVirkne += '9';
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        lauks1.setText(virkne + "0");
        virkne += '0';
        skaitlaVirkne += '0';
    }//GEN-LAST:event_zeroActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        lauks1.setText(virkne + "+");
        randomDarbibas();
        symbol = '+';
        virkne += "+";
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        
        lauks1.setText(virkne + "-");
        randomDarbibas();
        symbol = '-';
        virkne += "-";
    }//GEN-LAST:event_minusActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed

        vienads();
    }//GEN-LAST:event_equalsActionPerformed

    private void reizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reizActionPerformed
        
        lauks1.setText(virkne + "*"); 
        randomDarbibas();
        symbol = '*';
        virkne += "*";
    }//GEN-LAST:event_reizActionPerformed

    private void dalitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalitActionPerformed
        
        lauks1.setText(virkne + "/");
        randomDarbibas();
        virkne += "/";
        symbol = '/';
    }//GEN-LAST:event_dalitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        result = 0;
        skaitlaVirkne = "";
        virkne = "";
        
        lauks1.setText(virkne);
        resultLauks.setText("");
    }//GEN-LAST:event_clearActionPerformed

    public void vienads() {

        skaitlis2 = Integer.parseInt(skaitlaVirkne);
        skaitlis1 = result;
        Apreikini apr = new Apreikini();

        result = apr.Equals(skaitlis1, skaitlis2, symbol, result);

        resultLauks.setText(result + "");

        skaitlaVirkne = "";
        otrsSimbols = false;
    }
    
    public void randomDarbibas(){
        if (otrsSimbols) { 
            vienads();
        } else {
            if (pirmais) {
                skaitlis1 = Integer.parseInt(skaitlaVirkne); 
                pirmais = false;
                result = skaitlis1;
            } else {
                skaitlis1 = result;
            }
        }

        otrsSimbols = true;
        skaitlaVirkne = "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton dalit;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel lauks1;
    private javax.swing.JButton minus;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton reiz;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel resultLauks;
    private javax.swing.JLabel result_lauks;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}