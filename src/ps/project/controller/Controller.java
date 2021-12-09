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

    public void saveCustomer(Customer c) throws Exception {
        //Customer ima random zadati id koji ne prosledjujem u bazu
        if (!(c.getId().toString().isEmpty()) && !(c.getFirstName().isEmpty()) && !(c.getLastName().isEmpty()) && !(c.getAddress().isEmpty())
                && !(c.getPhoneNumber().isEmpty()) && !(c.getEmail().isEmpty()) && !(c.getPostalCode().isEmpty())) {
            List<Customer> customers= repositoryCustomer.getAll();
            for (Customer customer : customers) {
                if(customer.getEmail().equals(c.getEmail())){
                    JOptionPane.showMessageDialog(null, "Ovaj kupac već postoji u bazi", "Greška!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            repositoryCustomer.add(c);
        }else{
            throw new Exception("Unos odbijen!");
        }

    }

    public List<Customer> getAllCustomers() {
        return repositoryCustomer.getAll();
    }

}
