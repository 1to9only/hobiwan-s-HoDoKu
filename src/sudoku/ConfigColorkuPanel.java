/*
 * Copyright (C) 2008-12  Bernhard Hobiger
 *
 * This file is part of HoDoKu.
 *
 * HoDoKu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HoDoKu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with HoDoKu. If not, see <http://www.gnu.org/licenses/>.
 */
package sudoku;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.UIManager;

/**
 *
 * @author hobiwan
 */
public class ConfigColorkuPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;

    private JButton[] buttons = null;
    private Color[] colors = null;
    private MainFrame mainFrame;

    /** Creates new form ConfigColorkuPanel
     * @param mainFrame 
     */
    public ConfigColorkuPanel(Component mainFrame) {
        initComponents();

        buttons = new JButton[]{
            invalidButton, deviationButton,
            v1Button, v2Button, v3Button,
            v4Button, v5Button, v6Button,
            v7Button, v8Button, v9Button
        };
        this.mainFrame = (MainFrame) mainFrame;

        initAll(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        invalidLabel = new javax.swing.JLabel();
        deviationLabel = new javax.swing.JLabel();
        invalidButton = new javax.swing.JButton();
        deviationButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        v1Button = new javax.swing.JButton();
        v2Button = new javax.swing.JButton();
        v3Button = new javax.swing.JButton();
        v4Button = new javax.swing.JButton();
        v5Button = new javax.swing.JButton();
        v6Button = new javax.swing.JButton();
        v7Button = new javax.swing.JButton();
        v8Button = new javax.swing.JButton();
        v9Button = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("intl/ConfigColorkuPanel"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ConfigColorkuPanel.jPanel1.text"))); // NOI18N

        invalidLabel.setText(bundle.getString("ConfigColorkuPanel.invalidLabel.text")); // NOI18N

        deviationLabel.setText(bundle.getString("ConfigColorkuPanel.deviationLabel.text")); // NOI18N

        invalidButton.setText("..."); // NOI18N
        invalidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invalidButtonActionPerformed(evt);
            }
        });

        deviationButton.setText("..."); // NOI18N
        deviationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviationButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("jPanel2.txt"))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        v1Button.setText(bundle.getString("ConfigColorkuPanel.v1Button.text")); // NOI18N
        v1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel2.add(v1Button, gridBagConstraints);

        v2Button.setText(bundle.getString("ConfigColorkuPanel.v2Button.text")); // NOI18N
        v2Button.setActionCommand(bundle.getString("ConfigColorkuPanel.v2Button.actionCommand")); // NOI18N
        v2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel2.add(v2Button, gridBagConstraints);

        v3Button.setText(bundle.getString("ConfigColorkuPanel.v3Button.text")); // NOI18N
        v3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel2.add(v3Button, gridBagConstraints);

        v4Button.setText(bundle.getString("ConfigColorkuPanel.v4Button.text")); // NOI18N
        v4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v4ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel2.add(v4Button, gridBagConstraints);

        v5Button.setText(bundle.getString("ConfigColorkuPanel.v5Button.text")); // NOI18N
        v5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v5ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(v5Button, gridBagConstraints);

        v6Button.setText(bundle.getString("ConfigColorkuPanel.v6Button.text")); // NOI18N
        v6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v6ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(v6Button, gridBagConstraints);

        v7Button.setText(bundle.getString("ConfigColorkuPanel.v7Button.text")); // NOI18N
        v7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v7ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel2.add(v7Button, gridBagConstraints);

        v8Button.setText(bundle.getString("ConfigColorkuPanel.v8Button.text")); // NOI18N
        v8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v8ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(v8Button, gridBagConstraints);

        v9Button.setText(bundle.getString("ConfigColorkuPanel.v9Button.text")); // NOI18N
        v9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v9ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(v9Button, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalidLabel)
                            .addComponent(deviationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deviationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invalidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidLabel)
                    .addComponent(invalidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deviationLabel)
                    .addComponent(deviationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resetButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/ConfigColorkuPanel").getString("ConfigColorkuPanel.resetButton.mnemonic").charAt(0));
        resetButton.setText(bundle.getString("ConfigColorkuPanel.resetButton.text")); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        initAll(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void invalidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invalidButtonActionPerformed
        chooseColor(0);
    }//GEN-LAST:event_invalidButtonActionPerformed

    private void deviationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviationButtonActionPerformed
        chooseColor(1);
    }//GEN-LAST:event_deviationButtonActionPerformed

    private void v1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ButtonActionPerformed
        chooseColor(2);
    }//GEN-LAST:event_v1ButtonActionPerformed

    private void v2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ButtonActionPerformed
        chooseColor(3);
    }//GEN-LAST:event_v2ButtonActionPerformed

    private void v4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v4ButtonActionPerformed
        chooseColor(5);
    }//GEN-LAST:event_v4ButtonActionPerformed

    private void v5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v5ButtonActionPerformed
        chooseColor(6);
    }//GEN-LAST:event_v5ButtonActionPerformed

    private void v3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ButtonActionPerformed
        chooseColor(4);
    }//GEN-LAST:event_v3ButtonActionPerformed

    private void v6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v6ButtonActionPerformed
        chooseColor(7);
    }//GEN-LAST:event_v6ButtonActionPerformed

    private void v7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v7ButtonActionPerformed
        chooseColor(8);
    }//GEN-LAST:event_v7ButtonActionPerformed

    private void v8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v8ButtonActionPerformed
        chooseColor(9);
    }//GEN-LAST:event_v8ButtonActionPerformed

    private void v9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v9ButtonActionPerformed
        chooseColor(10);
    }//GEN-LAST:event_v9ButtonActionPerformed

    
    private void chooseColor(int index) {
        Color init = colors[index];
        Color color = JColorChooser.showDialog(this, java.util.ResourceBundle.getBundle("intl/ConfigColorPanel").getString("ConfigColorPanel.choose_color"), init);
        if (color != null) {
            colors[index] = color;
            initButton(buttons[index], color, index > 1 ? true : false);
        }
    }

    public void okPressed() {
        boolean changed = false;
        Color[] old = Options.getInstance().getColorKuColors();
        for (int i = 0; i < old.length; i++) {
            if (! old[i].equals(colors[i + 2])) {
                changed = true;
            }
        }
        Options.getInstance().setColorKuInvalidColor(colors[0]);
        Options.getInstance().setColorKuDeviationColor(colors[1]);
        Options.getInstance().getColorKuColors()[0] = colors[2];
        Options.getInstance().getColorKuColors()[1] = colors[3];
        Options.getInstance().getColorKuColors()[2] = colors[4];
        Options.getInstance().getColorKuColors()[3] = colors[5];
        Options.getInstance().getColorKuColors()[4] = colors[6];
        Options.getInstance().getColorKuColors()[5] = colors[7];
        Options.getInstance().getColorKuColors()[6] = colors[8];
        Options.getInstance().getColorKuColors()[7] = colors[9];
        Options.getInstance().getColorKuColors()[8] = colors[10];
        
        if (changed) {
            mainFrame.getSudokuPanel().resetColorKuImages();
            mainFrame.repaint();
        }
    }
    
    private void initAll(boolean setDefault) {
        if (colors == null) {
            colors = new Color[buttons.length];
        }
        if (setDefault) {
            colors[0] = Options.COLORKU_INVALID_COLOR;
            colors[1] = Options.COLORKU_DEVIATION_COLOR;
            colors[2] = Options.COLORKU_COLORS[0];
            colors[3] = Options.COLORKU_COLORS[1];
            colors[4] = Options.COLORKU_COLORS[2];
            colors[5] = Options.COLORKU_COLORS[3];
            colors[6] = Options.COLORKU_COLORS[4];
            colors[7] = Options.COLORKU_COLORS[5];
            colors[8] = Options.COLORKU_COLORS[6];
            colors[9] = Options.COLORKU_COLORS[7];
            colors[10] = Options.COLORKU_COLORS[8];
        } else {
            colors[0] = Options.getInstance().getColorKuInvalidColor();
            colors[1] = Options.getInstance().getColorKuDeviationColor();
            colors[2] = Options.getInstance().getColorKuColor(1);
            colors[3] = Options.getInstance().getColorKuColor(2);
            colors[4] = Options.getInstance().getColorKuColor(3);
            colors[5] = Options.getInstance().getColorKuColor(4);
            colors[6] = Options.getInstance().getColorKuColor(5);
            colors[7] = Options.getInstance().getColorKuColor(6);
            colors[8] = Options.getInstance().getColorKuColor(7);
            colors[9] = Options.getInstance().getColorKuColor(8);
            colors[10] = Options.getInstance().getColorKuColor(9);
        }

        initButton(buttons[0], colors[0], false);
        initButton(buttons[1], colors[1], false);
        for (int i = 2; i < buttons.length; i++) {
            initButton(buttons[i], colors[i], true);
        }
    }

    private void initButton(JButton button, Color color, boolean cand) {
        int size = 10;
        if (cand) {
            size = 30;
        }
        //button.setText(" ");
        Image img = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();
        g.setColor(color);
        g.fillRect(0, 0, img.getWidth(null) - 1, img.getHeight(null) - 1);
        button.setIcon(new ImageIcon(img));
        if (UIManager.getLookAndFeel().getName().equals("CDE/Motif")) {
            button.setBackground(color);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deviationButton;
    private javax.swing.JLabel deviationLabel;
    private javax.swing.JButton invalidButton;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton v1Button;
    private javax.swing.JButton v2Button;
    private javax.swing.JButton v3Button;
    private javax.swing.JButton v4Button;
    private javax.swing.JButton v5Button;
    private javax.swing.JButton v6Button;
    private javax.swing.JButton v7Button;
    private javax.swing.JButton v8Button;
    private javax.swing.JButton v9Button;
    // End of variables declaration//GEN-END:variables
}
