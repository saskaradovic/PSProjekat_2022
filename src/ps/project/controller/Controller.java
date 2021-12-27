/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.controller;

import java.util.List;
import javax.swing.JOptionPane;
import ps.project.domain.Automobile;
import ps.project.domain.Customer;
import ps.project.domain.Model;
import ps.project.domain.Seller;
import ps.project.repository.Repository;
import ps.project.repository.RepositorySeller;
import ps.project.repository.db.DbConnectionFactory;
import ps.project.repository.db.impl.RepositoryDbCustomer;
import ps.project.repository.db.impl.RepositoryDbSeller;


/**
 *
 * @author saska
 */
public class Controller {

    private final Repository repositorySeller;
    private final Repository repositoryCustomer;
    private static Controller controller;
    private Seller loggedSeller = new Seller();
    

    private Controller() {

        this.repositorySeller = new RepositoryDbSeller();
        this.repositoryCustomer = new RepositoryDbCustomer();

    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public Seller login(String username, String password) throws Exception {
        List<Seller> users = repositorySeller.getAll();
        for (Seller user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                loggedSeller = user;
                return user;
            }
        }
        throw new Exception("Nepoznat korisnik!");
    }

    public Seller getLoggedSeller() {
        return loggedSeller;
    }

    public int saveCustomer(Customer c) throws Exception {

        //Validacija unetih podataka
        List<Customer> customers = repositoryCustomer.getAll();
        for (Customer customer : customers) {
            if (customer.getEmail().equals(c.getEmail())) {
                JOptionPane.showMessageDialog(null, "Ovaj kupac već postoji u bazi.\n Pokušajte ponovo!", "Greška", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        }
        repositoryCustomer.add(c);
        return 1;

    }

    public List<Customer> getAllCustomers() {
        return repositoryCustomer.getAll();
    }

    public int editCustomer(Customer c) throws Exception {
        //ako postoji u bazi sa takvim idom-izmeni
           List<Customer> customers = repositoryCustomer.getAll();
            for (Customer customer : customers) {
                if(customer.getId()==c.getId()){
                //cuvaj
                repositoryCustomer.edit(c);
                return 1;
                }
            }
             return 0;
    }

  


  

}
