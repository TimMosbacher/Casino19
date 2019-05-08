/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.io.IOException;
import java.util.Optional;

/**
 *
 * @author motim
 */
public interface DatenSpeicher {

    Optional<Benutzer> authenticate(String username, String password);

    void loadUsers() throws IOException;
    
}
