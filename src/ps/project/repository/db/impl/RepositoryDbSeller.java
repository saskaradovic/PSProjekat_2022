package ps.project.repository.db.impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ps.project.domain.Seller;

import ps.project.repository.db.DbConnectionFactory;
import ps.project.repository.db.DbRepository;

/**
 *
 * @author laptop-02
 */
public class RepositoryDbSeller implements DbRepository<Seller> {

    @Override
    public List<Seller> getAll() {
        try {
            String sql = "SELECT * FROM Seller";
          
            List<Seller> sellers = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                Seller s = new Seller();
                s.setId(rs.getLong("id"));
                s.setFirstNname(rs.getString("firstname"));
                s.setLastName(rs.getString("lastname"));
                s.setPassword(rs.getString("password"));
                s.setUserName(rs.getString("username"));
                sellers.add(s);
            }
            rs.close();
            statement.close();
            return sellers;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void add(Seller param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Seller param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Seller param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

 

}
