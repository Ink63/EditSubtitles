/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.KeyEvent;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.Utils;

/**
 *
 * @author Ink
 */
public class GUIEditSubs extends javax.swing.JFrame {

    private final String[][] FILTERS = {{"*.*", "Все файлы"},
    {"srt", "Файлы субтитров (*.srt)"}};
    private static File openFile;

    private DefaultListModel<String> lModel = new DefaultListModel();

    /**
     * Creates new form MyJFrame
     */
    public GUIEditSubs() {
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

        fileChooser = new javax.swing.JFileChooser();
        winAbout = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnChangePlus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jOpenFilePath = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        edCountStr = new javax.swing.JFormattedTextField();
        edCountSubs = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnChangeMinus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        editMin = new javax.swing.JFormattedTextField();
        editSec = new javax.swing.JFormattedTextField();
        editMs = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuOpenFile = new javax.swing.JMenuItem();
        menuSaveFile = new javax.swing.JMenuItem();
        menuSaveFileAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuCloseFile = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("W:\\Zona Downloads"));
        fileChooser.setDialogTitle("");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Субтитры", "srt"));

        winAbout.setTitle("About..");
        winAbout.setAutoRequestFocus(false);
        winAbout.setMinimumSize(new java.awt.Dimension(465, 185));
        winAbout.setModal(true);
        winAbout.setName(""); // NOI18N
        winAbout.setResizable(false);
        winAbout.setSize(new java.awt.Dimension(465, 220));

        jEditorPane1.setEditable(false);
        jEditorPane1.setBackground(java.awt.SystemColor.control);
        jEditorPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jEditorPane1.setText("This programm load and edit subtitles file. \nYou may change time for view subtitles.");
        jEditorPane1.setAlignmentX(2.0F);
        jEditorPane1.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(jEditorPane1);

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winAboutLayout = new javax.swing.GroupLayout(winAbout.getContentPane());
        winAbout.getContentPane().setLayout(winAboutLayout);
        winAboutLayout.setHorizontalGroup(
            winAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(winAboutLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        winAboutLayout.setVerticalGroup(
            winAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit subtitles");
        setResizable(false);

        jScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane.setToolTipText("");
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBar(null);
        jScrollPane.setName(""); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.setModel(lModel);
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane.setViewportView(jList1);

        btnChangePlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnChangePlus.setText("+");
        btnChangePlus.setEnabled(false);
        btnChangePlus.setPreferredSize(new java.awt.Dimension(105, 35));
        btnChangePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePlusActionPerformed(evt);
            }
        });

        jLabel1.setText("Path to subtitles file");

        jOpenFilePath.setEditable(false);
        jOpenFilePath.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jOpenFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jOpenFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.BorderLayout());

        edCountStr.setEditable(false);
        edCountStr.setColumns(2);
        edCountStr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("mm"))));
        edCountStr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edCountStr.setText("00");
        edCountStr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edCountStr.setPreferredSize(null);

        edCountSubs.setEditable(false);
        edCountSubs.setColumns(2);
        edCountSubs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edCountSubs.setText("00");
        edCountSubs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edCountSubs.setMaximumSize(null);
        edCountSubs.setMinimumSize(null);
        edCountSubs.setName(""); // NOI18N
        edCountSubs.setPreferredSize(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Subs");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Strings");
        jLabel6.setPreferredSize(new java.awt.Dimension(21, 20));

        btnChangeMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnChangeMinus.setText("-");
        btnChangeMinus.setEnabled(false);
        btnChangeMinus.setPreferredSize(new java.awt.Dimension(105, 35));
        btnChangeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeMinuschangeTimes(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Min");
        jPanel3.add(jLabel2);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sec");
        jPanel3.add(jLabel5);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ms");
        jPanel3.add(jLabel4);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        editMin.setColumns(2);
        editMin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        editMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editMin.setText("00");
        editMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editMinKeyPressed(evt);
            }
        });
        jPanel4.add(editMin);

        editSec.setColumns(2);
        editSec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        editSec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editSec.setText("01");
        editSec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editSec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editSecKeyPressed(evt);
            }
        });
        jPanel4.add(editSec);

        editMs.setColumns(4);
        editMs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        editMs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editMs.setText("0");
        editMs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editMs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editMsKeyPressed(evt);
            }
        });
        jPanel4.add(editMs);

        jMenu1.setText("File");

        menuOpenFile.setText("Open File");
        menuOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenFileActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenFile);

        menuSaveFile.setText("Save File");
        menuSaveFile.setEnabled(false);
        menuSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionSaveFile(evt);
            }
        });
        jMenu1.add(menuSaveFile);

        menuSaveFileAs.setText("Save File As..");
        menuSaveFileAs.setEnabled(false);
        menuSaveFileAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsFile(evt);
            }
        });
        jMenu1.add(menuSaveFileAs);
        jMenu1.add(jSeparator1);

        menuCloseFile.setText("Close File");
        menuCloseFile.setEnabled(false);
        menuCloseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCloseFileActionPerformed(evt);
            }
        });
        jMenu1.add(menuCloseFile);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Service");
        jMenu3.setEnabled(false);

        jMenuItem7.setText("Check Order");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu2.setLabel("Help");

        jMenuItem4.setLabel("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChangePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChangeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edCountStr, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edCountSubs, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edCountStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edCountSubs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnChangeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCloseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseFileActionPerformed
        // TODO add your handling code here:
        lModel.clear();
        openFile = null;
        jOpenFilePath.setText("File not open");
        menuOpenFile.setEnabled(true);
        menuSaveFileAs.setEnabled(false);
        menuSaveFile.setEnabled(false);
        menuCloseFile.setEnabled(false);
        btnChangePlus.setEnabled(false);
        btnChangeMinus.setEnabled(false);
        edCountStr.setText("00");
        edCountSubs.setText("00");

    }//GEN-LAST:event_menuCloseFileActionPerformed

    private void menuOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenFileActionPerformed
        // TODO add your handling code here:
        loadFile();
        menuSaveFileAs.setEnabled(true);
        menuOpenFile.setEnabled(false);
        menuCloseFile.setEnabled(true);
        btnChangePlus.setEnabled(true);
        btnChangeMinus.setEnabled(true);

    }//GEN-LAST:event_menuOpenFileActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        //labelCount.setText("Show about");
        menuSaveFile.setEnabled(true);
        winAbout.setLocationRelativeTo(null);
        winAbout.setVisible(true);
        //jDialog1.setEnabled(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        winAbout.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void saveAsFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsFile
        // TODO add your handling code here:
        saveFileAs();
    }//GEN-LAST:event_saveAsFile

    private void actionSaveFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionSaveFile
        // TODO add your handling code here:
        saveFile(openFile);
    }//GEN-LAST:event_actionSaveFile

    private void editMsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editMsKeyPressed
        // TODO add your handling code here:
                checkNumFormat(evt);
    }//GEN-LAST:event_editMsKeyPressed

    private void editSecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editSecKeyPressed
        // TODO add your handling code here:
                checkNumFormat(evt);
    }//GEN-LAST:event_editSecKeyPressed

    private void editMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editMinKeyPressed
        // TODO add your handling code here:

        checkNumFormat(evt);

    }//GEN-LAST:event_editMinKeyPressed

    private void btnChangeMinuschangeTimes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMinuschangeTimes
        // TODO add your handling code here:
        changeTime(editMin.getText(), editSec.getText(), editMs.getText(),-1);
        menuSaveFile.setEnabled(true);
    }//GEN-LAST:event_btnChangeMinuschangeTimes

    private void btnChangePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePlusActionPerformed
        // TODO add your handling code here:
        changeTime(editMin.getText(), editSec.getText(), editMs.getText(),1);
        menuSaveFile.setEnabled(true);
    }//GEN-LAST:event_btnChangePlusActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEditSubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEditSubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEditSubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEditSubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIEditSubs myJFrame = new GUIEditSubs();
                myJFrame.setLocationRelativeTo(null);
                myJFrame.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeMinus;
    private javax.swing.JButton btnChangePlus;
    private javax.swing.JFormattedTextField edCountStr;
    private javax.swing.JFormattedTextField edCountSubs;
    private javax.swing.JFormattedTextField editMin;
    private javax.swing.JFormattedTextField editMs;
    private javax.swing.JFormattedTextField editSec;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextField jOpenFilePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuCloseFile;
    private javax.swing.JMenuItem menuOpenFile;
    private javax.swing.JMenuItem menuSaveFile;
    private javax.swing.JMenuItem menuSaveFileAs;
    private javax.swing.JDialog winAbout;
    // End of variables declaration//GEN-END:variables

    
    private void checkNumFormat(java.awt.event.KeyEvent evt) {
        int k = evt.getKeyCode();                                    
        if (k<48 || k>58) {                                    
            evt.setKeyCode(KeyEvent.VK_BACK_SPACE);
            JOptionPane.showMessageDialog(this, "Enter number 0..60");
        }               
    }
    
    // Загрузка файла субтитров
    private boolean loadFile() {
        int countSubs = 0;
        int index = 0;
        List<Integer> lostInd = new ArrayList<>();
        fileChooser.setDialogTitle("Choose subtitles file");

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                // read all lines from file                
                List<String> lines = Files.readAllLines(file.toPath(), Charset.forName("windows-1251"));
                // add string from file to listModel

                if (lines.size() != 0) {
                    lModel.clear();
                    for (String s : lines) {
                        if (!s.isEmpty()) {
                            lModel.addElement(s);
                            if (s.indexOf(Utils.SEP3) > 0) {
                                countSubs++;
                                
                                // check number subs
                                String s1 = lModel.get(lModel.getSize() - 1);                               
                                if (s1.length() < 10 && Utils.isDigits(s1)) {
                                    int ind = Integer.parseInt(s); // get index
                                    if (index + 1 != ind) {
                                        lostInd.add(index + 1); // write lost index
                                    }
                                    index = ind;
                                }
                            }
                        }
                    }

                    if (countSubs > 0) {
                        openFile = file;
                        jOpenFilePath.setText(file.getName());

                        edCountStr.setText(String.valueOf(lModel.getSize()));
                        edCountSubs.setText(String.valueOf(countSubs));
                        // create list of lost index
                        StringBuffer numsLostSub = new StringBuffer("");
                        for (int x : lostInd) {
                            numsLostSub.append(String.valueOf(x) + " ");
                        }
                        JOptionPane.showMessageDialog(this, countSubs + " was found and " + lostInd.size() + " index lost "
                                + numsLostSub.toString());

                        return true;
                    } else {
                        JOptionPane.showMessageDialog(this, "No found subs. Choose another file!");
                        return false;
                    }

                }
            } catch (IOException e) {
                Logger.getLogger(GUIEditSubs.class.getName()).log(Level.SEVERE, null, e);
                return false;
            }

        }
        return false;
    }

    private void saveFileAs() {

        fileChooser.setDialogTitle("Save file as..");
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (saveFile(file) > 0) {
                openFile = file;
            }
            jOpenFilePath.setText(file.getName());

        }
    }

    private int saveFile(File file) {

        List<String> list = new ArrayList();
        list.add(lModel.get(0));
        for (int i = 1; i < lModel.getSize(); i++) {
            String s = lModel.get(i);
            if (s.length() < 5 && Utils.isDigits(s)) {
                list.add(System.lineSeparator() + lModel.get(i));
            } else {
                list.add(lModel.get(i));
            }
        }
        try {
            if (!file.isDirectory()) {

                //if (file.exists()) {
                //    //Files.delete(file.toPath());
                //    JOptionPane.showMessageDialog(this,"File exists!");
                //    //file.setWritable(true);
                //    Files.write(openFile.toPath(), list);
                // }
                //else    
                Files.write(file.toPath(), list, Charset.forName("windows-1251"));
                menuSaveFile.setEnabled(false);
                JOptionPane.showMessageDialog(this, file.getName() + ": The subtitles file was saved!");
                return 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error. File is not saved!");
            return -1;
        }
        return -1;
    }

    private void changeTime(String sMin, String sSec, String sMs, int direction) {
        //int i=jList1.getSelectedIndex() - (jList1.getSelectedIndex() % 3);
        int i = 0;

        long time1;
        long time2;
        long changeTime;
        String sTime1;
        String sTime2;
        int countChange = 0;

        String numSub = lModel.get(i);
        try {
            // -------- get change time
            int min1 = Integer.parseInt(sMin);
            int sec1 = Integer.parseInt(sSec);
            int ms1 = Integer.parseInt(sMs);
            changeTime = Utils.getTime(0, min1, sec1, ms1);
            //jDebug1.setText("Change time "+changeTime);

            for (int j = 1; j < lModel.getSize(); j++) {

                String sTime = lModel.get(j);
                // ------------  get time from string of list
                //int num = Integer.parseInt(numSub);                

                if (sTime.indexOf(Utils.SEP3) > 0) {

                    String[] ss = sTime.split(Utils.SEP3);
                    if (ss[0].length() == 12 && ss[1].length() == 12) {
                        time1 = Utils.getTime(ss[0]);
                        //jDebug2.setText(""+time1);
                        time1 += changeTime*direction;
                        if (time1<0) time1=0;
                        time2 = Utils.getTime(ss[1]);
                        //jDebug3.setText(""+time2);
                        time2 += changeTime*direction;
                        if (time2<0) time2=0;
                        sTime1 = Utils.getTime(time1);
                        sTime2 = Utils.getTime(time2);
                        //jDebug4.setText(sTime1);            
                        //jDebug5.setText(sTime2);
                        // edit string at list
                        lModel.setElementAt(sTime1 + Utils.SEP3 + sTime2, j);
                        countChange++;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, countChange + " subtitles was changed!");
            //jList1.updateUI();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
