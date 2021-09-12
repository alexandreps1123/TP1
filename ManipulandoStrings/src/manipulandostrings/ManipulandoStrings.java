package manipulandostrings;

import java.util.Scanner;

public class ManipulandoStrings 
{
    
    static void inicializandoStrings1()
    {
        //inicializacao no momento da declaracao
        String str1 = new String();
        String str2 = new String("PROGRAMA");
        char[] caracteres = {'c', 'o', 'm', 'p', 'u', 't', 'a', 'd', 'o', 'r'};
        String str3 = new String(caracteres);
        String str4 = new String(caracteres, 7, 3); //dor
        StringBuffer sBff1 = new StringBuffer();
        StringBuffer sBff2 = new StringBuffer(10);
        StringBuffer sBff3 = new StringBuffer("valor");
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(sBff1.capacity());   //capacidade=16
        System.out.println(sBff2.capacity());   //capacidade=10
        System.out.println(sBff3.capacity());   //capacidade=21
    }
    
    static void inicializandoStrings2()
    {
        //inicializacao por meio da atribuicao
        String str1 = "Programa";
        String str2 = new String();
        str2 = "Programa";
        String str3 = new String();
        String str4 = new String("Computador");
        str3 = str4;
        Character charac1 = 'a';
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(charac1);
    }
    
    static void inicializandoStrings3()
    {
        //inicializacao por meio do teclado
        Scanner entrada = new Scanner(System.in);
        String str1 = new String();
        str1 = entrada.nextLine();
        
        System.out.println(str1);
        
        String str2 = new String();
        StringBuffer sBffr = new StringBuffer();
        str2 = entrada.next();
        
        System.out.println(sBffr);
        System.out.println(sBffr.capacity());
        System.out.println(str2);
        
        sBffr.append(str2);
        
        System.out.println(sBffr);
        System.out.println(sBffr.capacity());
        
        char char1 = entrada.next().charAt(0);
        
        System.out.println(char1);
    }
    
    static void copiandoStrings()
    {
        StringBuffer str1 = new StringBuffer(50);
        StringBuffer str2 = new StringBuffer("Mulher");
        str1 = str2;
        
        String str3 = new String();
        String str4 = new String("maquina");
        str3 = str4;
        
        str1.append(str2);
        System.out.println(str1);
        
        str1.append(str2, 2, 5);
        System.out.println(str1);
        
        str3 = str4.substring(3);
        System.out.println(str3);
        System.out.println(str4); 
        
        str3 = str4.substring(1, 3);
        System.out.println(str3);
        System.out.println(str4);
    }
    
    static void concatenandoStrings()
    {
        String str1 = new String("PARAR");
        String str2 = new String("para");
        String str3 = new String("PARADA");
        String str = new String();
        
        str = str1 + str2 + str3;
        
        System.out.println(str);
        
        str = str1.concat(str2).concat(str3);
        
        System.out.println(str);
                
    }
    
    static void comparandoStrings()
    {
        String str1 = new String("chaleira");
        String str2 = new String("chaleira");
        Character char1 = 'a';
        Character char2 = 'a';
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.regionMatches(0, str2, 0, 8));
        System.out.println(str1.regionMatches(false, 0, str2, 0, 8));
        System.out.println(str1.startsWith(str2));
        System.out.println(str1.startsWith(str2, 0));
        System.out.println(str1.endsWith(str2));
        System.out.println(char1.equals(char2));
        
    }
    
    static void numeroCaracteresStrings()
    {
        String str1 = new String("Tamanho");
        StringBuffer strBffr1 = new StringBuffer("Aquem");
        
        System.out.println(str1.length());
        System.out.println(strBffr1.length());
        System.out.println(strBffr1.capacity());
    }
    
    static void posicaoStringDentroOutraString()
    {
        String str1 = new String("Aaaacommmmmaaaoda");
        String str2 = new String("aaa");
        char char1= 'a';
        
        System.out.println(str1.indexOf(char1));
        System.out.println(str1.indexOf(str2));
        System.out.println(str1.indexOf(str2, 1));
        System.out.println(str1.lastIndexOf(str2));
        System.out.println(str1.lastIndexOf(str2, 1));
    }
    
    static void apagandoInserindoCaracteresString()
    {
        StringBuffer strBffr1 = new StringBuffer("Buffer");
        String str1 = new String("-insert-");
        
        System.out.println(strBffr1.deleteCharAt(5));
        System.out.println(strBffr1.delete(1, 4));
        System.out.println(strBffr1.insert(1, str1));
    }
    
    static void alterandoCaracteresString()
    {
        String str1 = new String(" aaazaaa ");
        String str2 = new String("aaa");
        String str3 = new String("-new string-");
        StringBuffer strBffr1 = new StringBuffer("string buffer");
        char char1 = 'z';
        char char2 = 'y';
        
        System.out.println(str1.replace(char1, char2));
        System.out.println(str1.replace(str2, str3));
        System.out.println(str1.replaceAll(str3, str2));
        System.out.println(str1.split("z")[0]);
        System.out.println(str1.split("z")[1]);
        System.out.println(str1.trim());    //remove espacos do comeco e fim da string
        System.out.println(strBffr1.replace(6, 7, str3));
        
        strBffr1.setCharAt(0, char1);
        System.out.println(strBffr1);
        System.out.println(strBffr1.reverse());
        
        char1 = str1.charAt(1);
        System.out.println(char1);
        
        char1 = strBffr1.charAt(0);
        System.out.println(char1);
        
        char[] char3 = str1.toCharArray();
        System.out.println(char3);
        
        
    }
    
    static void caractereASCII()
    {
        char char1 = 'a';
        int numero1 = 100;
        
        System.out.println((int)char1);
        System.out.println((char)numero1);
    }
    
    static void descobrindoCaractereSucessorAntecessor()
    {
        String str1 = new String("computador");
        int posicao;
        char char1 = 'd';
        posicao = str1.indexOf(char1);
        
        System.out.println(posicao);
        System.out.println(str1.charAt(posicao + 1));
        System.out.println(str1.charAt(posicao - 1));
    }
    
    static void convertendoMaiusculoMinusculo()
    {
        String str1 = new String("computador");
        char char1 = 'd';
        
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(Character.toUpperCase(char1));
        System.out.println(Character.toLowerCase(char1));
    }
    
    static void convertendoValorNumericoEmCaractere()
    {
        System.out.println(String.valueOf(100));
        System.out.println(Character.forDigit(15, 16));   
    }
    
    static void convertendoCaracteresEmValorNumerico()
    {
        String str1 = new String("5");
        char char1 = '5';
        
        System.out.println(Integer.parseInt(str1));
        System.out.println(Long.parseLong(str1));
        System.out.println(Float.parseFloat(str1));
        System.out.println(Double.parseDouble(str1));
        System.out.println(Character.digit(char1, 10));
    }
    
    static void verificandoCarateres()
    {
        char char1 = '1';
        
        System.out.println(Character.isUpperCase(char1));
        System.out.println(Character.isLowerCase(char1));
        System.out.println(Character.isLetter(char1));
        System.out.println(Character.isDigit(char1));
        System.out.println(Character.isLetterOrDigit(char1));
    }

    public static void main(String[] args) 
    {
        
        //inicializandoStrings1();
        //inicializandoStrings2();
        //inicializandoStrings3();
        //copiandoStrings();
        //concatenandoStrings();
        //comparandoStrings();
        //numeroCaracteresStrings();
        //posicaoStringDentroOutraString();
        //apagandoInserindoCaracteresString();
        //alterandoCaracteresString();
        //caractereASCII();
        //descobrindoCaractereSucessorAntecessor();
        //convertendoMaiusculoMinusculo();
        //convertendoValorNumericoEmCaractere();
        //convertendoCaracteresEmValorNumerico();
        //verificandoCarateres();
        
    }
    
}
