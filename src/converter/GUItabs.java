/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author rlumh
 */
public class GUItabs extends javax.swing.JFrame {

    /**
     * Creates new form GUItabs
     */
    public GUItabs() {
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

        panes = new javax.swing.JTabbedPane();
        weigthTab = new javax.swing.JPanel();
        SMC = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        inputFieldWeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        convertButtonWeight = new javax.swing.JButton();
        toFieldWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lengthTab = new javax.swing.JPanel();
        SMC1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fromLength = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        toLength = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        convertButtonLength = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        inputFieldLength = new javax.swing.JTextField();
        toFieldLength = new javax.swing.JTextField();
        volumeTab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SMC2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SMC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SMC.setText("Simple Unit Converter");

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "giga (Gg)", "mega (Mg) / ton", "kilo (kg)", "hecto (hg)", "deca (dag)", "gram (g)", "deci (dg)", "centi (cg)", "milli (mg)", "micro (μg)", "nano (ng)", "pico/micro micro (pg)" }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("to");

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "giga (Gg)", "mega (Mg) / ton", "kilo (kg)", "hecto (hg)", "deca (dag)", "gram (g)", "deci (dg)", "centi (cg)", "milli (mg)", "micro (μg)", "nano (ng)", "pico/micro micro (pg)" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Weight");

        inputFieldWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldWeightActionPerformed(evt);
            }
        });
        inputFieldWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputFieldWeightKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Output:");

        convertButtonWeight.setText("Convert");
        convertButtonWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonWeightActionPerformed(evt);
            }
        });

        toFieldWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFieldWeightActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Input:");

        javax.swing.GroupLayout weigthTabLayout = new javax.swing.GroupLayout(weigthTab);
        weigthTab.setLayout(weigthTabLayout);
        weigthTabLayout.setHorizontalGroup(
            weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weigthTabLayout.createSequentialGroup()
                .addGroup(weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(weigthTabLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(weigthTabLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(toFieldWeight)))
                    .addGroup(weigthTabLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(convertButtonWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(SMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(weigthTabLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(inputFieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        weigthTabLayout.setVerticalGroup(
            weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weigthTabLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(SMC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(convertButtonWeight)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(toFieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(weigthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(weigthTabLayout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addComponent(inputFieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        panes.addTab("Weight", weigthTab);

        SMC1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SMC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SMC1.setText("Simple Unit Converter");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Length");

        fromLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "giga (Gm)", "mega (Mm)", "kilo (km)", "hecto (hm)", "deca (dam)", "meter (m)", "deci (dm)", "centi (cm)", "milli (mm)", "micro (μm)", "nano (nm)", "pico/micro micro (pm)" }));
        fromLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromLengthActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("to");

        toLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "giga (Gm)", "mega (Mm)", "kilo (km)", "hecto (hm)", "deca (dam)", "meter (m)", "deci (dm)", "centi (cm)", "milli (mm)", "micro (μm)", "nano (nm)", "pico/micro micro (pm)" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Input:");

        convertButtonLength.setText("Convert");
        convertButtonLength.setAutoscrolls(true);
        convertButtonLength.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        convertButtonLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonLengthActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Output:");

        inputFieldLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldLengthActionPerformed(evt);
            }
        });
        inputFieldLength.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputFieldLengthKeyTyped(evt);
            }
        });

        toFieldLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFieldLengthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lengthTabLayout = new javax.swing.GroupLayout(lengthTab);
        lengthTab.setLayout(lengthTabLayout);
        lengthTabLayout.setHorizontalGroup(
            lengthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lengthTabLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(lengthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFieldLength, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lengthTabLayout.createSequentialGroup()
                        .addComponent(convertButtonLength, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(lengthTabLayout.createSequentialGroup()
                        .addComponent(fromLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(toLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toFieldLength))
                .addGap(31, 31, 31))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lengthTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SMC1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        lengthTabLayout.setVerticalGroup(
            lengthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lengthTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SMC1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(lengthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(convertButtonLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        panes.addTab("Length", lengthTab);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Weight");

        SMC2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SMC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SMC2.setText("Simple Unit Converter");

        javax.swing.GroupLayout volumeTabLayout = new javax.swing.GroupLayout(volumeTab);
        volumeTab.setLayout(volumeTabLayout);
        volumeTabLayout.setHorizontalGroup(
            volumeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, volumeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(volumeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SMC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        volumeTabLayout.setVerticalGroup(
            volumeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volumeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SMC2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(497, 497, 497))
        );

        panes.addTab("Volume", volumeTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panes, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panes, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void inputFieldWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFieldWeightKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_inputFieldWeightKeyTyped

    private void convertButtonWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonWeightActionPerformed
        WeightCalculator weightCalc = new WeightCalculator();
        String from = this.from.getSelectedItem().toString();
        String to = this.to.getSelectedItem().toString();
        String inputField = this.inputFieldWeight.getText();
        if(inputField.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please input a number to convert");
        }
        double input = Double.parseDouble(inputField);

        double output = weightCalc.handleInput(from, to, input);

        toFieldWeight.setText(Double.toString(output));

    }//GEN-LAST:event_convertButtonWeightActionPerformed

    private void toFieldWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFieldWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toFieldWeightActionPerformed

    private void inputFieldWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldWeightActionPerformed

    private void fromLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromLengthActionPerformed

    private void convertButtonLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonLengthActionPerformed
        LengthCalculator lc = new LengthCalculator();
        String from = this.fromLength.getSelectedItem().toString();
        String to = this.toLength.getSelectedItem().toString();
        String inputField = this.inputFieldLength.getText();
        if(inputField.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please input a number to convert");
        }
        double input = Double.parseDouble(inputField);

        double output = lc.handleInput(from, to, input);

        toFieldLength.setText(Double.toString(output));
    }//GEN-LAST:event_convertButtonLengthActionPerformed

    private void inputFieldLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldLengthActionPerformed

    private void inputFieldLengthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFieldLengthKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldLengthKeyTyped

    private void toFieldLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFieldLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toFieldLengthActionPerformed

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
            java.util.logging.Logger.getLogger(GUItabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUItabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUItabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUItabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUItabs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SMC;
    private javax.swing.JLabel SMC1;
    private javax.swing.JLabel SMC2;
    private javax.swing.JButton convertButtonLength;
    private javax.swing.JButton convertButtonWeight;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JComboBox<String> fromLength;
    private javax.swing.JTextField inputFieldLength;
    private javax.swing.JTextField inputFieldWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel lengthTab;
    private javax.swing.JTabbedPane panes;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JTextField toFieldLength;
    private javax.swing.JTextField toFieldWeight;
    private javax.swing.JComboBox<String> toLength;
    private javax.swing.JPanel volumeTab;
    private javax.swing.JPanel weigthTab;
    // End of variables declaration//GEN-END:variables
}
