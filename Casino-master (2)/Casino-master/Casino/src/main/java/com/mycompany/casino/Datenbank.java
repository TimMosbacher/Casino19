/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author motim
 */
public class Datenbank implements DatenSpeicher {

    private ArrayList<Benutzer> benutzer = new ArrayList<Benutzer>();

    Connection con;

    public Datenbank() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casino", "root", "");
        } catch (SQLException ex) {

            System.out.println(ex);
        }
    }

    @Override
    public void loadUsers() throws IOException {
        benutzer.clear();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Benutzer");

            while (rs.next()) {
                benutzer.add(new Benutzer(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            throw new IOException(ex);
        }
    }

    public String calculateHash(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toUpperCase();
    }

    public void addUser(String username, String password) throws IOException {

        try {
            for (Benutzer user : benutzer) {
                if (user.getName().equals(username)) {
                    throw new IOException("User already exists");
                }
            }

            PreparedStatement pstmt = con.prepareStatement("INSERT INTO benutzer (Name, Passwort) VALUES (?, ?)");
            pstmt.setString(1, username);
            pstmt.setString(2, calculateHash(password));
            pstmt.execute();
            benutzer.add(new Benutzer(username, password));
        } catch (SQLException ex) {
            Logger.getLogger(Datenbank.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Datenbank.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Optional<Benutzer> authenticate(String username, String password) {
        try {
            String hash = calculateHash(password);
            for (Benutzer b : benutzer){
                if (b.getPasswort().equals(hash)){
                    return Optional.of(b);
                }
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Datenbank.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }
}
