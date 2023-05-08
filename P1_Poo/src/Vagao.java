public class Vagao {
    

private int identificador; 
private String descricao;
private double capacidadeCarga;
private static int proxident = 1;

public Vagao(String descricao, double capacidadeCarga) {
this.identificador = proxident;
this.descricao = descricao;
this.capacidadeCarga = capacidadeCarga;
proxident = proxident + 1;
}

// Questão 1
public Vagao(){
    this.capacidadeCarga = 5000;
    this.descricao = "";
    this.identificador = proxident;
    Vagao.proxident += 1;  
}

// QUESTAO 2
//o atributo proxIdent é utilizado para definiçao do identificador da classe vagao e é incrementado a cada vagao criado.  
public static int getProxIdent(){
    return proxident;
}


public int getIdentificador() { 
    return identificador; 
}

public String getDescricao() { 
    return descricao; 
} 

public double getCapacidadeCarga() { 
    return capacidadeCarga;
}

//public void setTrem(int id) { this.trem = id; }

public String tostring() {

return "Trem:" +
"descricao= " +  descricao + ", "+
"capacidadeCarga=" + capacidadeCarga + ", "+
"Identificadores =" + identificador;
    }
}





