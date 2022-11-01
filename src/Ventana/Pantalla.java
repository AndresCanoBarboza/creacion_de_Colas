
/*
Universidad Estatal a Distancia
Cátedra de Ingeniería de Software
ORIENTACIÓN ACADÉMICA
Estructura de datos
Código: 00825 Créditos: 3
Grado académico: Diplomado
Encargado de cátedra: Percy Cañipa Valdez
Estudiante Andrés Cano Barboza
Proyecto 2
SEGUNDO CUATRIMESTRE
2021
*/
package Ventana;

import java.awt.Graphics;
import Logica.*;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {

    classCola cola = new classCola();
    
    public Pantalla() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_lista = new javax.swing.JButton();
        jb_push = new javax.swing.JButton();
        txt_nodo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jp_lista = new javax.swing.JPanel();
        jb_extraer = new javax.swing.JButton();
        jb_ext_elemento = new javax.swing.JButton();
        txt_ext_elemento = new javax.swing.JTextField();
        jb_vacia = new javax.swing.JButton();
        jb_tamano = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_lista.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_lista.setText("Imrimir o reimprimir lista");
        jb_lista.setToolTipText("");
        jb_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listaActionPerformed(evt);
            }
        });

        jb_push.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_push.setText("Agregar Dato");
        jb_push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pushActionPerformed(evt);
            }
        });

        jp_lista.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_listaLayout = new javax.swing.GroupLayout(jp_lista);
        jp_lista.setLayout(jp_listaLayout);
        jp_listaLayout.setHorizontalGroup(
            jp_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1832, Short.MAX_VALUE)
        );
        jp_listaLayout.setVerticalGroup(
            jp_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jp_lista);

        jb_extraer.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_extraer.setText("Extraer Elemento");
        jb_extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_extraerActionPerformed(evt);
            }
        });

        jb_ext_elemento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_ext_elemento.setText("Obtener Elemento Específico");
        jb_ext_elemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ext_elementoActionPerformed(evt);
            }
        });

        jb_vacia.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_vacia.setText("Verificar Existencia");
        jb_vacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_vaciaActionPerformed(evt);
            }
        });

        jb_tamano.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_tamano.setText("Tamaño de lista");
        jb_tamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tamanoActionPerformed(evt);
            }
        });

        jb_eliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_eliminar.setText("Eliminar Lista");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_lista)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nodo)
                            .addComponent(jb_push))
                        .addGap(18, 18, 18)
                        .addComponent(jb_extraer)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ext_elemento)
                            .addComponent(jb_ext_elemento))
                        .addGap(18, 18, 18)
                        .addComponent(jb_vacia)
                        .addGap(18, 18, 18)
                        .addComponent(jb_tamano)
                        .addGap(18, 18, 18)
                        .addComponent(jb_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_salir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1545, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_lista)
                    .addComponent(jb_push)
                    .addComponent(jb_extraer)
                    .addComponent(jb_ext_elemento)
                    .addComponent(jb_vacia)
                    .addComponent(jb_tamano)
                    .addComponent(jb_eliminar)
                    .addComponent(jb_salir))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ext_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    // Botón para agregar datos, uno por uno
   
    private void jb_pushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pushActionPerformed
     
         
        try {
            if(txt_nodo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe digitar un valor en la casilla corespondiente." );
                return; }
            cola.Push(new classNodo(Integer.parseInt(txt_nodo.getText())));
        
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe digitar un número en la casilla correspondiente." );
        }    
            txt_nodo.setText("");
            jp_lista.repaint();
            
    
    }//GEN-LAST:event_jb_pushActionPerformed
    // Botón para agregar los datos agregados con el botón Agregar Dato
    
    private void jb_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listaActionPerformed
       
        if (cola.tamano() != 0) {
        cola.Mostrar(jp_lista.getGraphics());
        }
    }//GEN-LAST:event_jb_listaActionPerformed
    // Extrae el primer elemento de la fila, como una fila cotidiana
    
    private void jb_extraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_extraerActionPerformed
    try {
        if(cola.tamano() == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe haber elementos en la lista");
            return;
        }
    } catch (Exception E) {}   
        
        JOptionPane.showMessageDialog(null, "Se extrajo el elemento: " + cola.Pop());
        jp_lista.repaint();
        
               
    }//GEN-LAST:event_jb_extraerActionPerformed
    // Muestra el elemento deseado según su ubicación de 0 a x
    
    private void jb_ext_elementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ext_elementoActionPerformed
    try {    
        if(Integer.parseInt(txt_ext_elemento.getText()) > cola.tamano()){
           JOptionPane.showMessageDialog(null, "La posición escogida es mayor a la cantidad de elementos."); 
           return; }
    } catch (Exception e) {}       
        
        JOptionPane.showMessageDialog(null, "El elemento seleccionado es: " + cola.Get(Integer.parseInt(txt_ext_elemento.getText())));
        
        
    }//GEN-LAST:event_jb_ext_elementoActionPerformed
    // Confirma con true o false si la lista está vacía
    
    private void jb_vaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_vaciaActionPerformed
        JOptionPane.showMessageDialog(null, "La lista esta vacía: " + cola.Empty());
    }//GEN-LAST:event_jb_vaciaActionPerformed

    // Botón para mostrar tamaño de la lista
    
    private void jb_tamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tamanoActionPerformed
    
        JOptionPane.showMessageDialog(null, "El tamaño de la lista es de: " + cola.tamano() + " elementos");
    }//GEN-LAST:event_jb_tamanoActionPerformed
    // Botón para elimnar la lista entera, cumple a medias
    
    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        cola.Erase();
        jp_lista.repaint();
    }//GEN-LAST:event_jb_eliminarActionPerformed

    //Botón para salir del programa
    
    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_ext_elemento;
    private javax.swing.JButton jb_extraer;
    private javax.swing.JButton jb_lista;
    private javax.swing.JButton jb_push;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_tamano;
    private javax.swing.JButton jb_vacia;
    private javax.swing.JPanel jp_lista;
    private javax.swing.JTextField txt_ext_elemento;
    private javax.swing.JTextField txt_nodo;
    // End of variables declaration//GEN-END:variables

   
}


/*
https://docs.oracle.com/javase/7/docs/api/

https://javadesdecero.es/arrays/bucle-for-each/

https://stackoverflow.com/questions/19152656/if-boolean-condition-in-java

https://www.youtube.com/watch?v=WmVMRweAp7E

https://www.tutorialesprogramacionya.com/kotlinya/detalleconcepto.php?punto=25&codigo=25&inicio=15

https://www.youtube.com/watch?v=-bky2LH-Ghc&t=253s

https://www.youtube.com/watch?v=S9TNae3Qz78

https://es.stackoverflow.com/questions/135973/se-puede-usar-switch-con-objetos-en-java

https://es.stackoverflow.com/questions/71346/c%C3%B3mo-convertir-un-string-en-int-en-java/71352

https://es.stackoverflow.com/questions/1487/guia-definitiva-de-conversi%C3%B3n-de-tipos-en-java

https://www.youtube.com/watch?v=9q758AJ1nck

https://www.youtube.com/watch?v=dpj88NGRhck


*/