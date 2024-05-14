package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Tables {
    public static void main(String[] args){
      try{
        //    Connection con = ConnectionP.getCon();
           /**String query = "INSERT INTO appuser(userRole, name, date_naissance, mobileNumber, email, username, password, adrress) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; */
          /** PreparedStatement pst = con.prepareStatement(query);*/
          //Statement st = con.createStatement();
           //st.executeUpdate("create table medicine (medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
           
          // st.executeUpdate("CREATE TABLE company(idComp INT AUTO_INCREMENT PRIMARY KEY,nom VARCHAR(255),adresse VARCHAR(255),  codeFiscale VARCHAR(255))");
          // JOptionPane.showMessageDialog(null, "Table created Successfully");
           
           
           
           /**  pst.setString(1, "Admin");
            pst.setString(2, "Admin");
            pst.setString(3, "1990-10-04"); // Format de la date au format "année-mois-jour"
            pst.setString(4, "28469777");
            pst.setString(5, "admin@email.com");
            pst.setString(6, "admin");
            pst.setString(7, "admin");
            pst.setString(8, "Tunisia");*/
            
           //pst.executeUpdate();
            
      
         /**   String query = "INSERT INTO company (nom, adresse, codeFiscale) VALUES (?, ?, ? )";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nom);
            pst.setString(2, adresse);
            pst.setString(3, codeFiscale);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Entreprise ajoutée avec succès");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);}
        }*/
 
    Connection con = ConnectionP.getCon();
    Statement st = con.createStatement();
    st.executeUpdate("CREATE TABLE company(idComp INT AUTO_INCREMENT PRIMARY KEY, nom VARCHAR(255), adresse VARCHAR(255), codeFiscale VARCHAR(255))");
    JOptionPane.showMessageDialog(null, "Table créée avec succès");
    
    // Insérer des données dans la table company
    String nom = "Nom de l'entreprise";
    String adresse = "Adresse de l'entreprise";
    String codeFiscale = "Code fiscal de l'entreprise";

    String query = "INSERT INTO company (nom, adresse, codeFiscale) VALUES (?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, nom);
    pst.setString(2, adresse);
    pst.setString(3, codeFiscale);
    pst.executeUpdate();

    JOptionPane.showMessageDialog(null, "Entreprise ajoutée avec succès");
} catch(Exception e) {
    JOptionPane.showMessageDialog(null, e);}
}
}



