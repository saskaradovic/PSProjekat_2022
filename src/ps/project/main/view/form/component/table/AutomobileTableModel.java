/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.main.view.form.component.table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ps.project.domain.Automobile;

/**
 *
 * @author saska
 */
public class AutomobileTableModel extends AbstractTableModel{
    private String [] columnNames={"Id","Model", "Zapremina motora", "Snaga motora", "Cena sa PDV-om", "Cena bez PDV-a", "Karoserija", "Gorivo", "Valuta"};
    private final List<Automobile> automobiles;

    public AutomobileTableModel(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    @Override
    public String getColumnName(int column) {
        if(column>columnNames.length) return "n/a";
        return columnNames[column];
    }
    

    @Override
    public int getRowCount() {
        if(automobiles==null) return 0;
        return automobiles.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Automobile automobile = automobiles.get(rowIndex);
        
        switch(columnIndex){
            case 0: return automobile.getAutomobileId();
            case 1: return automobile.getModelId();
            case 2: return automobile.getCubicCapacity();
            case 3: return automobile.getEnginePower();
            case 4: return automobile.getPriceWithWat();
            case 5: return automobile.getPriceWithoutWat();
            case 6: return automobile.getVechileType();
            case 7: return automobile.getFuel();
            case 8: return automobile.getCurrency();
            
            default: return "n/a";
        }
    }
    
    
}
