package mess;
import static java.lang.Math.floor;
import javax.swing.JOptionPane;

public class AddNewMember extends javax.swing.JFrame 
{
    int MEMBER_AMOUNT, i=0;
    String[] name = new String[30];
    int[] paid = new int[30];
    int[] meal = new int[30];
    public AddNewMember() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amount_of_mess_member = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name_of_member = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amount_of_paid = new javax.swing.JTextField();
        one = new javax.swing.JLabel();
        amount_of_meal = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        serial = new javax.swing.JTextField();
        mok = new javax.swing.JButton();
        subok = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total_paid = new javax.swing.JTextField();
        total_meal = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SL = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        NAME = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        PAID = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        MEAL = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        DUE = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        DIPOSIT = new javax.swing.JTextArea();
        member_one = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mess Management System");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("How many mess member?");

        amount_of_mess_member.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        amount_of_mess_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_of_mess_memberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Name of member:");

        name_of_member.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        name_of_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_of_memberActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Paid:");

        amount_of_paid.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        one.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        one.setText("How many meal ? had?");

        amount_of_meal.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        Calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Serial No.: ");

        serial.setEditable(false);
        serial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialActionPerformed(evt);
            }
        });

        mok.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mok.setText("OK");
        mok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mokActionPerformed(evt);
            }
        });

        subok.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subok.setText("OK");
        subok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subokActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Total Paid:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Total Meal:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Meal Rate:");

        total_paid.setEditable(false);

        total_meal.setEditable(false);

        rate.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText(" SL No.     Name        Paid     Meal Count    Due       Diposit");

        SL.setEditable(false);
        SL.setColumns(20);
        SL.setRows(5);
        jScrollPane1.setViewportView(SL);

        NAME.setEditable(false);
        NAME.setColumns(20);
        NAME.setRows(5);
        jScrollPane2.setViewportView(NAME);

        PAID.setEditable(false);
        PAID.setColumns(20);
        PAID.setRows(5);
        jScrollPane3.setViewportView(PAID);

        MEAL.setEditable(false);
        MEAL.setColumns(20);
        MEAL.setRows(5);
        jScrollPane4.setViewportView(MEAL);

        DUE.setEditable(false);
        DUE.setColumns(20);
        DUE.setRows(5);
        jScrollPane5.setViewportView(DUE);

        DIPOSIT.setEditable(false);
        DIPOSIT.setColumns(20);
        DIPOSIT.setRows(5);
        jScrollPane6.setViewportView(DIPOSIT);

        member_one.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        member_one.setText("OK");
        member_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_oneActionPerformed(evt);
            }
        });

        CLEAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CLEAR.setText("Clear");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amount_of_mess_member, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(name_of_member)
                                    .addComponent(amount_of_paid)
                                    .addComponent(serial))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mok)
                                    .addComponent(member_one)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CLEAR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Calculate))
                                    .addComponent(amount_of_meal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(total_paid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                                .addComponent(total_meal, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount_of_mess_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mok)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total_meal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(name_of_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(member_one, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount_of_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one)
                            .addComponent(amount_of_meal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subok, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calculate)
                            .addComponent(CLEAR))
                        .addContainerGap(104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amount_of_mess_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_of_mess_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_of_mess_memberActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed

        int total_meal_count, total_pay;

        double meal_rate;
        double [] per_person_cost;
        per_person_cost= new double[30];

	double[] diposit = new double[30];

	double[] due = new double[30];
        
  	total_pay=0;
        total_meal_count=0;
        
        for(i=0; i<MEMBER_AMOUNT; i++)
        {   
            total_pay=total_pay+paid[i];
	    total_meal_count=total_meal_count+meal[i];
        }
        
        
        meal_rate=(double)total_pay/total_meal_count;

        for(i=0; i<MEMBER_AMOUNT; i++)
            per_person_cost[i]=(double)meal_rate*meal[i];

        for(i=0; i<MEMBER_AMOUNT; i++)
        {
            if(per_person_cost[i]>paid[i])
            {
                diposit[i]=0;
                due[i]=(double)(-1)*(paid[i]-per_person_cost[i]);
            }
            else if(per_person_cost[i]<paid[i])
            {
                due[i]=0;
                diposit[i]=(double)paid[i]-per_person_cost[i];
            }
            else
            {
                due[i]=0;
                diposit[i]=0;
            }
        }
        
        total_paid.setText(String.valueOf(total_pay));
        total_meal.setText(String.valueOf(total_meal_count));
        rate.setText(String.valueOf(meal_rate));
        
        SL.setText("");
        NAME.setText("");
        PAID.setText("");
        MEAL.setText("");
        DUE.setText("");
        DIPOSIT.setText("");
        
        for(i = 0; i<MEMBER_AMOUNT; i++)
        {
            SL.setText(SL.getText() + (i+1) + "\n");
            NAME.setText(NAME.getText() + name[i] + "\n");
            PAID.setText(PAID.getText() + paid[i] + "\n");
            MEAL.setText(MEAL.getText() + meal[i] + "\n");
            DUE.setText(DUE.getText() + floor(due[i]) + "\n");
            DIPOSIT.setText(DIPOSIT.getText() + floor(diposit[i]) + "\n");
        }
        
    }//GEN-LAST:event_CalculateActionPerformed

    private void name_of_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_of_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_of_memberActionPerformed

    private void serialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialActionPerformed

    private void mokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mokActionPerformed

        i = 0;
        MEMBER_AMOUNT = Integer.parseInt(amount_of_mess_member.getText());
        serial.setText(String.valueOf(i+1));
        
    }//GEN-LAST:event_mokActionPerformed

    private void subokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subokActionPerformed

        name[i] = name_of_member.getText();
        paid[i] = Integer.parseInt(amount_of_paid.getText());
        meal[i] = Integer.parseInt(amount_of_meal.getText());
        
        if(i+1==MEMBER_AMOUNT)
        {
            JOptionPane.showMessageDialog(null, "Member Limit Reached.");
            serial.setText(null);
        }
        
        else
            serial.setText(String.valueOf(++i + 1));
        
        name_of_member.setText(null);
        amount_of_paid.setText(null);
        amount_of_meal.setText(null);
        
    }//GEN-LAST:event_subokActionPerformed

    private void member_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_oneActionPerformed

        one.setText("How many meal "+name_of_member.getText()+ " had?");
        
        
    }//GEN-LAST:event_member_oneActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed

        amount_of_mess_member.setText(null);
        serial.setText(null);
        name_of_member.setText(null);
        amount_of_paid.setText(null);
        amount_of_meal.setText(null);
        total_paid.setText(null);
        total_meal.setText(null);
        rate.setText(null);
        SL.setText(null);
        NAME.setText(null);
        PAID.setText(null);
        MEAL.setText(null);
        DUE.setText(null);
        DIPOSIT.setText(null);
    }//GEN-LAST:event_CLEARActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> 
        {
            new AddNewMember().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton Calculate;
    private javax.swing.JTextArea DIPOSIT;
    private javax.swing.JTextArea DUE;
    private javax.swing.JTextArea MEAL;
    private javax.swing.JTextArea NAME;
    private javax.swing.JTextArea PAID;
    private javax.swing.JTextArea SL;
    private javax.swing.JTextField amount_of_meal;
    private javax.swing.JTextField amount_of_mess_member;
    private javax.swing.JTextField amount_of_paid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton member_one;
    private javax.swing.JButton mok;
    private javax.swing.JTextField name_of_member;
    private javax.swing.JLabel one;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField serial;
    private javax.swing.JButton subok;
    private javax.swing.JTextField total_meal;
    private javax.swing.JTextField total_paid;
    // End of variables declaration//GEN-END:variables
}
