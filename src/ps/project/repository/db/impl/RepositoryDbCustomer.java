/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.repository.db.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ps.project.domain.Customer;
import ps.project.domain.Seller;
import ps.project.repository.db.DbConnectionFactory;
import ps.project.repository.db.DbRepository;

/**
 *
 * @author saska
 */
public class RepositoryDbCustomer implements DbRepository<Customer> {

    @Override
    public void add(Customer c) throws Exception {
        try {
            String sql = "INSERT INTO Customer(firstname, lastname, address, phonenumber, email, postalcode) VALUES (?,?,?,?,?,?)";
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, c.getFirstName());
            statement.setString(2, c.getLastName());
            statement.setString(3, c.getAddress());
            statement.setString(4, c.getPhoneNumber());
            statement.setString(5, c.getEmail());
            statement.setString(6, c.getPostalCode());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

   

    @Override
    public void delete(Customer param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAll() {
        try {
            String sql = "SELECT * FROM Customer";

            List<Customer> customers = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getLong("id"));
                c.setFirstName(rs.getString("firstname"));
                c.setLastName(rs.getString("lastname"));
                c.setAddress(rs.getString("address"));
                c.setPhoneNumber(rs.getString("phonenumber"));
                c.setEmail(rs.getString("email"));
                c.setPostalCode(rs.getString("postalcode"));
                customers.add(c);
            }
            rs.close();
            statement.close();
            return customers;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void edit(Customer c) throws Exception {
        try {
            String sql = "UDATE Customer c SET(firstname=?, lastname=?, address=?, phonenumber=?, email=?, postalcode=?) WHERE c.id=?";

           
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, c.getFirstName());
            statement.setString(2, c.getLastName());
            statement.setString(3, c.getAddress());
            statement.setString(4, c.getPhoneNumber());
            statement.setString(5, c.getEmail());
            statement.setString(6, c.getPostalCode());
            statement.setString(0, sql);
           
           
            statement.close();
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }

}
