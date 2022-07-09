package metodostelas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import locadoraveiculo.AlugarVeiculo;
import locadoraveiculo.Carro;
import locadoraveiculo.Cliente;
import locadoraveiculo.Funcionario;
import locadoraveiculo.Moto;
import locadoraveiculo.Pagamento;

public class CarregarTabela {
    
    //carregar tabela com a lista de clientes
    public static void tabelaClienteLista(JTable tabelaClientes, ArrayList<Cliente> listaClientes) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "CPF", 
            "Data de Nascimento", "Email", "Telefone", "CNH", "Data da Primeira CNH"},0);
        
        for(int i = 0; i < listaClientes.size(); i++) {
            Object linha[] = new Object[]{listaClientes.get(i).getNomeCompleto(),
                                            listaClientes.get(i).getCpf(),
                                            listaClientes.get(i).getDataNascimento(),
                                            listaClientes.get(i).getEmail(),
                                            listaClientes.get(i).getTelefone(),
                                            listaClientes.get(i).getCnh(),
                                            listaClientes.get(i).getDataPrimeiroCnh()};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaClientes.setModel(modelo);
        
        tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(0);
        tabelaClientes.getColumnModel().getColumn(5).setPreferredWidth(0);
        tabelaClientes.getColumnModel().getColumn(6).setPreferredWidth(0);
           
    }
    
    //carregar tabela de funcionarios
    public static void tabelaFuncionarioLista(JTable tabelaFuncionarioLista, ArrayList<Funcionario> funcionario) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "CPF", 
            "Data de Nascimento", "Email", "Telefone", "Login", "Senha", "Status"},0);
        

        
        for(int i = 0; i < funcionario.size(); i++) {
            String disponibilidade = "";
            if (funcionario.get(i).getEstaAtivo())   {
                disponibilidade = "Disponível";
            } else {
                disponibilidade = "Indisponível";
            }
            
            Object linha[] = new Object[]{funcionario.get(i).getNomeCompleto(),
                                            funcionario.get(i).getCpf(),
                                            funcionario.get(i).getDataNascimento(),
                                            funcionario.get(i).getEmail(),
                                            funcionario.get(i).getTelefone(),
                                            funcionario.get(i).getLogin(),
                                            funcionario.get(i).getSenhaFuncionario(),
                                            disponibilidade};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaFuncionarioLista.setModel(modelo);
        
        tabelaFuncionarioLista.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(4).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(5).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(6).setPreferredWidth(0);
        tabelaFuncionarioLista.getColumnModel().getColumn(7).setPreferredWidth(0);
           
    }
    
    //carregar tabela com a lista de  motos alugadas
    public static void tabelaAluguelMotoLista(JTable tabelaAlugarMoto, ArrayList<AlugarVeiculo> alugarMoto) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Data de Retirada", "Data de Devolução", 
            "Quantidade de Dias", "Cliente", "Moto"},0);
        
        for(int i = 0; i < alugarMoto.size(); i++) {
            Object linha[] = new Object[]{alugarMoto.get(i).getDataRetirada(),
                                            alugarMoto.get(i).getDataDevolucao(),
                                            alugarMoto.get(i).getQuantidadeDias(),
                                            alugarMoto.get(i).getCliente().getNomeCompleto(),
                                            alugarMoto.get(i).getMoto().getPlaca()};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaAlugarMoto.setModel(modelo);
        
        tabelaAlugarMoto.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaAlugarMoto.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaAlugarMoto.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaAlugarMoto.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaAlugarMoto.getColumnModel().getColumn(4).setPreferredWidth(0);
           
    }
    
    //carregar tabela com a lista de  carros alugados
    public static void tabelaAluguelCarroLista(JTable tabelaAlugarCarro, ArrayList<AlugarVeiculo> alugarCarro) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Data de Retirada", "Data de Devolução", 
            "Quantidade de Dias", "Cliente", "Carro"},0);
        
        for(int i = 0; i < alugarCarro.size(); i++) {
            Object linha[] = new Object[]{alugarCarro.get(i).getDataRetirada(),
                                            alugarCarro.get(i).getDataDevolucao(),
                                            alugarCarro.get(i).getQuantidadeDias(),
                                            alugarCarro.get(i).getCliente().getNomeCompleto(),
                                            alugarCarro.get(i).getMoto().getPlaca()};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaAlugarCarro.setModel(modelo);
        
        tabelaAlugarCarro.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaAlugarCarro.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaAlugarCarro.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaAlugarCarro.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaAlugarCarro.getColumnModel().getColumn(4).setPreferredWidth(0);
           
    }
    
    public static void tabelaMotoLista(JTable tabelaMotoLista, ArrayList<Moto> motos) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Placa", "Marca", 
            "Modelo", "Cor", "Valor Diária", "Cilindradas", "Disponibilidade"},0);
        

        
        for(int i = 0; i < motos.size(); i++) {
            String disponibilidade = "";
            if (motos.get(i).getEstaDisponivel())   {
                disponibilidade = "Disponível";
            } else {
                disponibilidade = "Indisponível";
            }
            
            Object linha[] = new Object[]{motos.get(i).getPlaca(),
                                            motos.get(i).getMarca(),
                                            motos.get(i).getModelo(),
                                            motos.get(i).getCor(),
                                            motos.get(i).getValorDiaria(),
                                            motos.get(i).getQtdCilindradas(),
                                            disponibilidade};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaMotoLista.setModel(modelo);
        
        tabelaMotoLista.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaMotoLista.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaMotoLista.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaMotoLista.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaMotoLista.getColumnModel().getColumn(4).setPreferredWidth(0);
        tabelaMotoLista.getColumnModel().getColumn(5).setPreferredWidth(0);
        tabelaMotoLista.getColumnModel().getColumn(6).setPreferredWidth(0);
           
    }
    
    //carregar tabela com a lista de  carros
    public static void tabelaCarroLista(JTable tabelaCarroLista, ArrayList<Carro> carros) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Placa", "Marca", 
            "Modelo", "Cor", "Valor Diária", "Quantidade de Portas", "Combustível", "Disponibilidade"},0);
        

        
        for(int i = 0; i < carros.size(); i++) {
            String disponibilidade = "";
            if (carros.get(i).getEstaDisponivel())   {
                disponibilidade = "Disponível";
            } else {
                disponibilidade = "Indisponível";
            }
            
            Object linha[] = new Object[]{carros.get(i).getPlaca(),
                                            carros.get(i).getMarca(),
                                            carros.get(i).getModelo(),
                                            carros.get(i).getCor(),
                                            carros.get(i).getValorDiaria(),
                                            carros.get(i).getQtdPortas(),
                                            carros.get(i).getCombustivel(),
                                            disponibilidade};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaCarroLista.setModel(modelo);
        
        tabelaCarroLista.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(4).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(5).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(6).setPreferredWidth(0);
        tabelaCarroLista.getColumnModel().getColumn(7).setPreferredWidth(0);
           
    }
    
    //carregar tabela com a lista de pagamentos
    public static void tabelaPagamentoLista(JTable tabelaPagamentoLista, ArrayList<Pagamento> pagamento) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "Forma de Pagamento", 
            "Seguro", "Desconto", "Valor Total"},0);
        

        
        for(int i = 0; i < pagamento.size(); i++) {
            String seguro = "";
            if (pagamento.get(i).getEstaAssegurado())   {
                seguro = "Contratado";
            } else {
                seguro = "Não contratado";
            }
            
            Object linha[] = new Object[]{pagamento.get(i).getCliente().getNomeCompleto(),
                                            pagamento.get(i).getFormaDePagamento(),
                                            seguro,
                                            pagamento.get(i).getDesconto(),
                                            pagamento.get(i).getValorTotal()};
            
            modelo.addRow(linha);
        }
        
        //tabela recebe modelo
        tabelaPagamentoLista.setModel(modelo);
        
        tabelaPagamentoLista.getColumnModel().getColumn(0).setPreferredWidth(0);
        tabelaPagamentoLista.getColumnModel().getColumn(1).setPreferredWidth(0);
        tabelaPagamentoLista.getColumnModel().getColumn(2).setPreferredWidth(0);
        tabelaPagamentoLista.getColumnModel().getColumn(3).setPreferredWidth(0);
        tabelaPagamentoLista.getColumnModel().getColumn(4).setPreferredWidth(0);
           
    }
            
}
