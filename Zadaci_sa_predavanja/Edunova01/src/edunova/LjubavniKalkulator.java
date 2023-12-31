/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JTextField;
/**
 *
 * @author AMD
 */
public class LjubavniKalkulator extends javax.swing.JFrame {
    
   public static String kalkulator(JTextField name1, JTextField name2) {
     
     boolean dev = true;

		//String name1 =  "Marta" ;

		//String name2 = "Manuel";

       
      		String name = name1.getText().trim().toLowerCase() + name2.getText().trim().toLowerCase(); // name1name2

		int[] initialArray = new int[name.length()];

		int count;
		char letter;

		for (int i = 0; i < name.length(); i++) {

			letter = name.charAt(i);
			count = 0;
			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == letter) {
					count++;
				}

			}
			initialArray[i] = count;
			//System.out.print(name.charAt(i) + " ");
		}
		
     	int x= ljubav(initialArray);
        
        return Integer.toString(x);
        
        

}
    
    
    private static int ljubav(int[] initialArray) {

		if (initialArray.length < 3) {
			String s = "";
			for (int i : initialArray) {
				s += i;
			}
			if (Integer.parseInt(s) < 100) {
				return Integer.parseInt(s);
			}
		}


		
		int[] newArray =  new int[initialArray.length % 2 == 0 ? initialArray.length / 2 : initialArray.length / 2 + 1];
		
		
		
		for(int i=0, j=initialArray.length-1; i<=j; i++, j--) {
			newArray[i] += (i != j ? initialArray[i] + initialArray[j] : initialArray[i]);
		
			

		}
		
		System.out.println(Arrays.toString(separateDoubleDigits(newArray)));
		return ljubav(separateDoubleDigits(newArray));

	}
    
    
    public static int[] separateDoubleDigits(int[] initialArray) {
		int count = 0;	//velicina novog niza sa odvojenim znamenkama
		
		for (int number : initialArray) {
			if(isDoubleDigit(number)) {
				count += countDigits(number);
			}else {
				count++;
			}
				
		}
		
		int[] separatedArray = new int[count];	//niz sa odvojenim znamenkama
		int index = 0;
		
		for(int number : initialArray) {
			if (isDoubleDigit(number)) {
				int[] digits = getSingleDigits(number);
				for(int digit : digits) {
					separatedArray[index] = digit;
					index++;
				}
			}else {
				separatedArray[index] = number;
				index++;
			}
		}
		
		return separatedArray;
	}
    
    public static boolean isDoubleDigit(int number) {
		return number >= 10 && number <=99;
	}
    
    public static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}
    
    
    public static int[] getSingleDigits (int number){
		int numberOfDigits = countDigits(number);
		int[] digits = new int[numberOfDigits];
		int index = numberOfDigits -1;
		
		while(number > 0) {
			digits[index] = number % 10;
			number /= 10;
			index--;
		}
		return digits;
	}
    
    /**
     * Creates new form LjubavniKalkulator
     */
    public LjubavniKalkulator() {
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

        jLabel1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name 1 ");

        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name 2");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblResult.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnCalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalculate)
                .addGap(41, 41, 41)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
       
    }//GEN-LAST:event_txtName1ActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
       lblResult.setText(kalkulator(txtName1, txtName2));
    }//GEN-LAST:event_btnCalculateActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    // End of variables declaration//GEN-END:variables
}
