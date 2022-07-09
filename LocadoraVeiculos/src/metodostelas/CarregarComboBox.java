package metodostelas;

import java.util.ArrayList;
import javax.swing.JComboBox;
import locadoraveiculo.AlugarVeiculo;
import locadoraveiculo.Carro;
import locadoraveiculo.Cliente;
import locadoraveiculo.Moto;
import telas.AlugarCarro;
import telas.AlugarMoto;

public class CarregarComboBox {
    
    public static void carregarClientes(JComboBox clientes, ArrayList<Cliente> listaClientes)    {
        
        //remover os itens da combobox
        clientes.removeAllItems();
        
        //primeiro item
        clientes.addItem("Selecione um cliente");
        
        //carregar lista
        for(int i = 0; i < listaClientes.size(); i++){
            clientes.addItem(listaClientes.get(i).getNomeCompleto());
        }
        
    }
    
    public static void carregarMotos(JComboBox motos, ArrayList<Moto> listaMotos)   {
        
        //remover os itens da combobox
        motos.removeAllItems();
        
        //primeiro item
        motos.addItem("Selecione uma moto");
        
        //carregar lista
        for(int i = 0; i < listaMotos.size(); i++){
            motos.addItem(listaMotos.get(i).getPlaca());
        }
    }
    
    public static void carregarCarros(JComboBox carros, ArrayList<Carro> listaCarros) {
        
        //remover os itens da combobox
        carros.removeAllItems();
        
        //primeiro item
        carros.addItem("Selecione um cliente");
        
        //carregar lista
        for(int i = 0; i < listaCarros.size(); i++){
            carros.addItem(listaCarros.get(i).getPlaca());
        }
        
    }
    
    public static void carregarAluguel(JComboBox aluguel, ArrayList<AlugarVeiculo> listaVeiculo) {
        
        //remover os itens da combobox
        aluguel.removeAllItems();
        
        //primeiro item
        aluguel.addItem("Selecione um aluguel cadastrado");
        
        //carregar lista
        for(int i = 0; i < listaVeiculo.size(); i++){
            aluguel.addItem(listaVeiculo.get(i).getCliente().getNomeCompleto());
        }
        
        for(int i = 0; i < listaVeiculo.size(); i++){
            aluguel.addItem(listaVeiculo.get(i).getCliente().getNomeCompleto());
        }
        
    }
    
}
