/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.repository;

import java.util.ArrayList;
import java.util.List;
import ps.project.domain.Seller;


/**
 *
 * @author laptop-02
 */
public class RepositoryCustomer {
    private final List<Seller> sellers;

    public RepositoryCustomer() {
        sellers = new ArrayList<Seller>(){
            {
                add(new Seller(1l, "Pera", "Peric", "pera", "pera1111", "pera@gmail.com"));
                add(new Seller(2l, "Mika", "Mikic", "mika", "mika2222", "mika@gmail.com"));
                add(new Seller(3l, "Laza", "Lazic", "laza", "laza3333", "laza@gmail.com"));
                add(new Seller(4l, "Zika", "Zikic", "zika", "zika4444", "zika@gmail.com"));
            }
        };
    }

   
    
    
}
