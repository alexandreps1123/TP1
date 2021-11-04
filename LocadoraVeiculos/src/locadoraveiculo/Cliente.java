package locadoraveiculo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{
    //atributos
    private String cnh;
    private Date dataPrimeiroCnh;
    
    //construtores
    public Cliente(String nomeCompleto, String cpf, Date dataNascimento, 
            String email, String telefone, String cnh, Date dataPrimeiroCnh) {
        super(nomeCompleto, cpf, dataNascimento, email, telefone);
        this.cnh = cnh;
        this.dataPrimeiroCnh = dataPrimeiroCnh;
    }
    
    //metodo cadastrar cliente
    public static Cliente cadastrarCliente(String nomeCompletoCliente, String cpfCliente,
            String dataNascimentoCliente, String emailCliente, String telefoneCliente,
            String cnhCliente, String dataPrimeiroCnhCliente)  {
             
        Date dataNascimento = dataFormatada(dataNascimentoCliente);   
        Date dataPrimeiroCnh = dataFormatada(dataPrimeiroCnhCliente);
        
        Cliente cliente = new Cliente(nomeCompletoCliente, cpfCliente, dataNascimento, 
                emailCliente, telefoneCliente, cnhCliente, dataPrimeiroCnh);
        
        return cliente;
        
    }
    
    //metodo editar cliente
    public static void editarCliente(Cliente cliente, String nomeCompletoCliente, String cpfCliente,
            String dataNascimentoCliente, String emailCliente, String telefoneCliente,
            String cnhCliente, String dataPrimeiroCnhCliente)   {
             
        Date dataNascimento = dataFormatada(dataNascimentoCliente);   
        Date dataPrimeiroCnh = dataFormatada(dataPrimeiroCnhCliente);
        
        cliente.setNomeCompleto(nomeCompletoCliente);
        cliente.setCpf(cpfCliente);
        cliente.setDataNascimento(dataNascimento);
        cliente.setEmail(emailCliente);
        cliente.setTelefone(telefoneCliente);
        cliente.setCnh(cnhCliente);
        cliente.setDataPrimeiroCnh(dataPrimeiroCnh);
                
    }
    
    public static Date dataFormatada(String data) {
        
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = data;
        Date dataFormatada = new Date();
        try {
            dataFormatada = formatoData.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return dataFormatada;
        
    }
    
    //metodos especiais
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getDataPrimeiroCnh() {
        return dataPrimeiroCnh;
    }

    public void setDataPrimeiroCnh(Date dataPrimeiroCnh) {
        this.dataPrimeiroCnh = dataPrimeiroCnh;
    }
    
}