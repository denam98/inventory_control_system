/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import UtilityClasses.DBConnection;
import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class CreateInvoice extends javax.swing.JFrame {

    Home currHome;
    
    /**
     * Creates new form CreateInvoice
     */
    public CreateInvoice() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        setImg(new File("pics/backW.png"), lab_back);
    }

    CreateInvoice(Home aThis) {
        this();
        currHome = aThis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        lab_itemid = new javax.swing.JLabel();
        txt_cusname = new javax.swing.JTextField();
        txt_item_name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        txt_unitprice = new javax.swing.JTextField();
        lab_unitprice = new javax.swing.JLabel();
        lab_unitprice1 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        lab_unitprice2 = new javax.swing.JLabel();
        txt_stock_qty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lab_unitprice3 = new javax.swing.JLabel();
        lab_unitprice4 = new javax.swing.JLabel();
        lab_unitprice5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lab_unitprice6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lab_cusID = new javax.swing.JLabel();
        lab_unitprice7 = new javax.swing.JLabel();
        lab_unitprice8 = new javax.swing.JLabel();
        lab_unitprice9 = new javax.swing.JLabel();
        txt_payment = new javax.swing.JTextField();
        txt_discount = new javax.swing.JTextField();
        txt_balance = new javax.swing.JTextField();
        txt_invoiceTotal = new javax.swing.JTextField();
        txt_finalTotal = new javax.swing.JTextField();
        lab_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setLayout(null);

        jList2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList2KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        kGradientPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(280, 152, 350, 131);

        lab_itemid.setBackground(new java.awt.Color(204, 204, 204));
        lab_itemid.setForeground(new java.awt.Color(0, 0, 0));
        lab_itemid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        lab_itemid.setOpaque(true);
        kGradientPanel1.add(lab_itemid);
        lab_itemid.setBounds(890, 160, 350, 32);

        txt_cusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cusnameActionPerformed(evt);
            }
        });
        txt_cusname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cusnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cusnameKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txt_cusname);
        txt_cusname.setBounds(280, 120, 350, 32);

        txt_item_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_item_nameActionPerformed(evt);
            }
        });
        txt_item_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_item_nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_item_nameKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txt_item_name);
        txt_item_name.setBounds(280, 160, 350, 32);

        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        kGradientPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(280, 192, 350, 131);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Item Name");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(120, 160, 150, 32);

        txt_unitprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unitpriceActionPerformed(evt);
            }
        });
        txt_unitprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_unitpriceKeyPressed(evt);
            }
        });
        kGradientPanel1.add(txt_unitprice);
        txt_unitprice.setBounds(280, 200, 350, 32);

        lab_unitprice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice.setText("Unit Price");
        kGradientPanel1.add(lab_unitprice);
        lab_unitprice.setBounds(120, 200, 150, 32);

        lab_unitprice1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice1.setText("QTY");
        kGradientPanel1.add(lab_unitprice1);
        lab_unitprice1.setBounds(120, 240, 150, 32);

        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtyKeyPressed(evt);
            }
        });
        kGradientPanel1.add(txt_qty);
        txt_qty.setBounds(280, 240, 350, 32);

        lab_unitprice2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice2.setText("Item ID");
        kGradientPanel1.add(lab_unitprice2);
        lab_unitprice2.setBounds(730, 160, 150, 32);

        txt_stock_qty.setEditable(false);
        kGradientPanel1.add(txt_stock_qty);
        txt_stock_qty.setBounds(890, 200, 350, 32);

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "NAME", "UNIT PRICE", "QTY", "ITEM TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setIntercellSpacing(new java.awt.Dimension(2, 4));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(4);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 300, 1224, 279);

        lab_unitprice3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice3.setText("Invoice Total");
        kGradientPanel1.add(lab_unitprice3);
        lab_unitprice3.setBounds(190, 600, 120, 32);

        lab_unitprice4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice4.setText("Payment");
        kGradientPanel1.add(lab_unitprice4);
        lab_unitprice4.setBounds(190, 680, 120, 32);

        lab_unitprice5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice5.setText("Balance");
        kGradientPanel1.add(lab_unitprice5);
        lab_unitprice5.setBounds(590, 680, 120, 32);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Print Invoice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1);
        jButton1.setBounds(1030, 620, 212, 70);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Create Invoice");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(6, 6, 499, 74);

        lab_unitprice6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice6.setText("Discount");
        kGradientPanel1.add(lab_unitprice6);
        lab_unitprice6.setBounds(590, 600, 120, 32);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Customer Name");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(120, 120, 150, 32);

        lab_cusID.setBackground(new java.awt.Color(204, 204, 204));
        lab_cusID.setForeground(new java.awt.Color(0, 0, 0));
        lab_cusID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        lab_cusID.setOpaque(true);
        kGradientPanel1.add(lab_cusID);
        lab_cusID.setBounds(890, 120, 350, 32);

        lab_unitprice7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice7.setText("Final Total");
        kGradientPanel1.add(lab_unitprice7);
        lab_unitprice7.setBounds(190, 640, 120, 32);

        lab_unitprice8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice8.setText("Stock Qty");
        kGradientPanel1.add(lab_unitprice8);
        lab_unitprice8.setBounds(730, 200, 150, 32);

        lab_unitprice9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lab_unitprice9.setText("Customer ID");
        kGradientPanel1.add(lab_unitprice9);
        lab_unitprice9.setBounds(730, 120, 150, 32);

        txt_payment.setText("0.0");
        txt_payment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_paymentFocusGained(evt);
            }
        });
        txt_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paymentActionPerformed(evt);
            }
        });
        txt_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_paymentKeyPressed(evt);
            }
        });
        kGradientPanel1.add(txt_payment);
        txt_payment.setBounds(320, 680, 189, 32);

        txt_discount.setText("0%");
        txt_discount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_discountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_discountFocusLost(evt);
            }
        });
        txt_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_discountActionPerformed(evt);
            }
        });
        txt_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_discountKeyPressed(evt);
            }
        });
        kGradientPanel1.add(txt_discount);
        txt_discount.setBounds(710, 600, 189, 32);

        txt_balance.setEditable(false);
        txt_balance.setText("0.0");
        kGradientPanel1.add(txt_balance);
        txt_balance.setBounds(710, 680, 189, 32);

        txt_invoiceTotal.setEditable(false);
        txt_invoiceTotal.setText("0.0");
        kGradientPanel1.add(txt_invoiceTotal);
        txt_invoiceTotal.setBounds(320, 600, 189, 32);

        txt_finalTotal.setEditable(false);
        txt_finalTotal.setText("0.0");
        kGradientPanel1.add(txt_finalTotal);
        txt_finalTotal.setBounds(320, 640, 189, 32);

        lab_back.setText("jLabel4");
        lab_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab_backMouseExited(evt);
            }
        });
        kGradientPanel1.add(lab_back);
        lab_back.setBounds(1310, 10, 41, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cusnameActionPerformed
        if (!txt_cusname.getText().trim().equals("")) {
            jList2.grabFocus();
            jList2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_txt_cusnameActionPerformed

    private void txt_cusnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusnameKeyReleased
        try {
            ResultSet search = DBConnection.search("select * from customer where fname like '%"
                    + txt_cusname.getText().toLowerCase().trim() + "%' or lname like '"
                    + txt_cusname.getText().toLowerCase().trim() + "'");
            Vector v = new Vector();
            while (search.next()) {
                if (search.getInt("status") == 1) {
                    v.add(search.getString("fname") + " " + search.getString("lname") + "\t-\t" + search.getString("id"));
                } else {
                    continue;
                }
            }
            jList2.setListData(v);
            jScrollPane3.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txt_cusnameKeyReleased

    private void txt_cusnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jList2.grabFocus();
            jList2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_txt_cusnameKeyPressed

    private void jList2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_cusname.setText(jList2.getSelectedValue().split("\t-\t")[0]);
            lab_cusID.setText(jList2.getSelectedValue().split("\t-\t")[1]);
            jScrollPane3.setVisible(false);
            txt_item_name.grabFocus();
        }
    }//GEN-LAST:event_jList2KeyPressed

    private void txt_item_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_item_nameActionPerformed
        if (!txt_item_name.getText().trim().equals("")) {
            jList1.grabFocus();
            jList1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_txt_item_nameActionPerformed

    private void txt_item_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_item_nameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jScrollPane2.setVisible(true);
            jList1.grabFocus();
            jList1.setSelectedIndex(0);
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            txt_discount.grabFocus();
        }
    }//GEN-LAST:event_txt_item_nameKeyPressed

    private void txt_item_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_item_nameKeyReleased
        try {
            ResultSet search = DBConnection.search("select * from item where name like '%" + txt_item_name.getText().toLowerCase() + "%' and status=1");
            Vector v = new Vector();
            while (search.next()) {
                v.add(search.getString("name") + "\t-\t" + search.getString("id"));
            }
            jList1.setListData(v);
            //jScrollPane2.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txt_item_nameKeyReleased

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_item_name.setText(jList1.getSelectedValue().split("\t-\t")[0]);
            lab_itemid.setText(jList1.getSelectedValue().split("\t-\t")[1]);
            try {
                ResultSet search = DBConnection.search("select qty,selling_price from stock where item_id=" + jList1.getSelectedValue().split("\t-\t")[1] + "");
                if (search.first()) {
                    txt_stock_qty.setText(search.getString("qty"));
                    txt_unitprice.setText(search.getString("selling_price"));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            jScrollPane2.setVisible(false);
            txt_qty.grabFocus();
        }
    }//GEN-LAST:event_jList1KeyPressed

    private void txt_unitpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unitpriceActionPerformed
        if (!txt_unitprice.getText().trim().equals("")) {
            txt_qty.grabFocus();
        }
    }//GEN-LAST:event_txt_unitpriceActionPerformed

    private void txt_unitpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unitpriceKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == '.' && !txt_unitprice.getText().contains("."))
                || evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_unitprice.setEditable(true);
        } else {
            txt_unitprice.setEditable(false);
        }
    }//GEN-LAST:event_txt_unitpriceKeyPressed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector();

        if (checkContents()) {
            if (checkAvailability()) {
                v.add(lab_itemid.getText());
                v.add(txt_item_name.getText());
                v.add(txt_unitprice.getText());
                double qty = Double.valueOf(txt_qty.getText()) + previousQty;
                v.add(String.valueOf(qty));
                String itemTotal = String.valueOf(Double.parseDouble(txt_unitprice.getText()) * qty);
                v.add(itemTotal);
                dtm.addRow(v);
            } else {
                v.add(lab_itemid.getText());
                v.add(txt_item_name.getText());
                v.add(txt_unitprice.getText());
                v.add(txt_qty.getText());
                String itemTotal = String.valueOf(Double.parseDouble(txt_unitprice.getText()) * Double.parseDouble(txt_qty.getText()));
                v.add(itemTotal);
                dtm.addRow(v);
            }
            clearFields();
            calculateInvoiceTotal();
        }
    }//GEN-LAST:event_txt_qtyActionPerformed

    private void txt_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == '.' && !txt_qty.getText().contains("."))
                || evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_qty.setEditable(true);
        } else {
            txt_qty.setEditable(false);
        }
    }//GEN-LAST:event_txt_qtyKeyPressed

    private void txt_discountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == '.' && !txt_discount.getText().contains("."))
                || evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_discount.setEditable(true);
        } else {
            txt_discount.setEditable(false);
        }
    }//GEN-LAST:event_txt_discountKeyPressed

    private void txt_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_discountActionPerformed
        if(txt_discount.getText().equals("")){
            calculateFinalTotal(0);
        } else if (Double.parseDouble(txt_discount.getText()) > 100) {
            JOptionPane.showMessageDialog(rootPane, "Discount amount cannot be grater than 100%");
        } else {
            calculateFinalTotal(Double.parseDouble(txt_discount.getText()));
        }
    }//GEN-LAST:event_txt_discountActionPerformed

    private void txt_discountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_discountFocusGained
        txt_discount.setText("0");
    }//GEN-LAST:event_txt_discountFocusGained

    private void txt_discountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_discountFocusLost
        if (txt_discount.getText().equals("")) {
            txt_discount.setText("0%");
        }
    }//GEN-LAST:event_txt_discountFocusLost

    private void txt_paymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paymentKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == '.' && !txt_payment.getText().contains("."))
                || evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_payment.setEditable(true);
        } else {
            txt_payment.setEditable(false);
        }
    }//GEN-LAST:event_txt_paymentKeyPressed

    private void txt_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paymentActionPerformed
        if (Double.parseDouble(txt_finalTotal.getText()) > Double.parseDouble(txt_payment.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Need more cash!");
        } else {
            txt_balance.setText(String.valueOf(Double.parseDouble(txt_payment.getText()) - Double.parseDouble(txt_finalTotal.getText())));
            jButton1.grabFocus();
        }
    }//GEN-LAST:event_txt_paymentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getRowCount() != 0) {
            int invid = 0;
            int x = 0;
            try {
                DBConnection.iud("insert into invoice(customer_id,date,total,discount,nettotal,payment) values('"
                        + lab_cusID.getText() + "', CURDATE() ,'" + txt_invoiceTotal.getText() + "','"
                        + txt_discount.getText() + "','" + txt_finalTotal.getText() + "','" + txt_payment.getText() + "')");
                ResultSet search = DBConnection.search("select id from invoice");
                if (search.last()) {
                    invid = search.getInt("id");
                }
                
                while (x < jTable1.getRowCount()) {
                    int stockid = 0;
                    ResultSet search1 = DBConnection.search("select id from stock where item_id="+jTable1.getValueAt(x, 0)+"");
                    if(search1.first()){
                        stockid = search1.getInt("id");
                    }
                    DBConnection.iud("insert into invoice_item(invoice_id,stock_id,qty,unitprice,total) values('" + invid + "',"
                            + "'" + stockid + "',"
                            + "'" + Double.parseDouble(jTable1.getValueAt(x, 3).toString()) + "',"
                            + "'" + Double.parseDouble(jTable1.getValueAt(x, 2).toString()) + "',"
                            + "'" + Double.parseDouble(jTable1.getValueAt(x, 4).toString()) + "')");
                    DBConnection.iud("update stock set qty=qty-" + Double.parseDouble(jTable1.getValueAt(x, 3).toString()) + " where id="+stockid+"");
                    x++;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            resetAll();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Add data first to save the GRN!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_paymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_paymentFocusGained
        txt_payment.setText(null);
    }//GEN-LAST:event_txt_paymentFocusGained

    private void lab_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_backMouseExited
        setImg(new File("pics/backW.png"), lab_back);
    }//GEN-LAST:event_lab_backMouseExited

    private void lab_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_backMouseEntered
        setImg(new File("pics/backB.png"), lab_back);
    }//GEN-LAST:event_lab_backMouseEntered

    private void lab_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_backMouseClicked
        this.setVisible(false);
        currHome.setVisible(true);
    }//GEN-LAST:event_lab_backMouseClicked

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
            java.util.logging.Logger.getLogger(CreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JLabel lab_back;
    private javax.swing.JLabel lab_cusID;
    private javax.swing.JLabel lab_itemid;
    private javax.swing.JLabel lab_unitprice;
    private javax.swing.JLabel lab_unitprice1;
    private javax.swing.JLabel lab_unitprice2;
    private javax.swing.JLabel lab_unitprice3;
    private javax.swing.JLabel lab_unitprice4;
    private javax.swing.JLabel lab_unitprice5;
    private javax.swing.JLabel lab_unitprice6;
    private javax.swing.JLabel lab_unitprice7;
    private javax.swing.JLabel lab_unitprice8;
    private javax.swing.JLabel lab_unitprice9;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextField txt_cusname;
    private javax.swing.JTextField txt_discount;
    private javax.swing.JTextField txt_finalTotal;
    private javax.swing.JTextField txt_invoiceTotal;
    private javax.swing.JTextField txt_item_name;
    private javax.swing.JTextField txt_payment;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_stock_qty;
    private javax.swing.JTextField txt_unitprice;
    // End of variables declaration//GEN-END:variables

    boolean contentChecked;

    private boolean checkContents() {
        if (txt_cusname.getText().equals("")) {
            txt_cusname.grabFocus();
            contentChecked = false;
        } else if (txt_item_name.getText().equals("")) {
            txt_item_name.grabFocus();
            contentChecked = false;
        } else if (txt_unitprice.getText().equals("") || txt_unitprice.getText().length() == 0) {
            txt_unitprice.grabFocus();
            contentChecked = false;
        } else if (txt_qty.getText().equals("") || txt_qty.getText().length() == 0) {
            txt_qty.grabFocus();
            contentChecked = false;
        } else if (Double.parseDouble(txt_qty.getText()) > Double.parseDouble(txt_stock_qty.getText())) {
            txt_qty.grabFocus();
            JOptionPane.showMessageDialog(rootPane, "No enough stocks available.");
            contentChecked = false;
        } else {
            contentChecked = true;
        }
        return contentChecked;
    }

    double previousQty;

    private boolean checkAvailability() {
        String itemId = lab_itemid.getText().trim();
        int x = 0;
        boolean availability = false;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        while (x < jTable1.getRowCount()) {
            if (jTable1.getValueAt(x, 0).toString().equals(itemId)) {
                availability = true;
                previousQty = Double.valueOf(jTable1.getValueAt(x, 4).toString());
                dtm.removeRow(x);
                break;
            } else {
                availability = false;
            }
            x++;
        }
        return availability;
    }

    private void clearFields() {
        txt_item_name.setText(null);
        txt_unitprice.setText(null);
        txt_qty.setText(null);
        txt_stock_qty.setText(null);
        lab_itemid.setText(null);
        txt_item_name.grabFocus();
    }

    private void calculateInvoiceTotal() {
        int x = 0;
        double invTotal = 0;
        while (x < jTable1.getRowCount()) {
            invTotal += Double.parseDouble(jTable1.getValueAt(x, 4).toString());
            x++;
        }
        txt_invoiceTotal.setText(String.valueOf(invTotal));
    }

    private void calculateFinalTotal(double dis) {
        double finalVal = Double.parseDouble(txt_invoiceTotal.getText()) * (100 - dis) / 100;
        txt_finalTotal.setText(String.valueOf(finalVal));
        txt_payment.grabFocus();
    }
    
    private void resetAll() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        txt_cusname.setText(null);
        lab_cusID.setText(null);
        clearFields();
        dtm.setRowCount(0);
        txt_invoiceTotal.setText("0.0");
        txt_payment.setText("0.0");
        txt_balance.setText("0.0");
        txt_finalTotal.setText("0.0");
        txt_discount.setText("0%");
        txt_cusname.grabFocus();
    }
    
    private void setImg(File f, JLabel lab){
        try {
            Image img = ImageIO.read(f);
            img = img.getScaledInstance(lab.getWidth(), lab.getHeight(), Image.SCALE_SMOOTH);
            lab.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
