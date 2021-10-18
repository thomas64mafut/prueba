package autores.modelos;

import javax.swing.*;

public class ModeloComboCargos extends DefaultComboBoxModel {
    public ModeloComboCargos() {
        for (Cargo cargo : Cargo.values()) {
            this.addElement(cargo);
        }

    }
    public Cargo obtenerCargo() {
        return (Cargo)this.getSelectedItem();
    }
}