public class Rg {

// Atributos

private String numeroRg;
private String nome; 
private String nomePai;
private String nomeMae;
private String dataNascimento;
private String naturalidadeCidade;
private String naturalidadeEstado;
private String orgaoExpedidor;
private String cpf;

//Construtores

Rg(){

}
Rg(String nome ,String numeroRg){
    this.nome = nome;
    this.numeroRg =numeroRg;
}
Rg(String nome , String numeroRg, String cpf){
    this.nome = nome;
    this.numeroRg =numeroRg;
    this.cpf =cpf;
}
Rg(Rg rg){
    this.numeroRg=rg.getNumeroRg();
    this.nome = rg.getNome();
    this.nomePai= rg.getNomePai();
    this.nomeMae = rg.getNomeMae();
    this.dataNascimento = rg.getDataNascimento();
    this.naturalidadeCidade = rg.getNaturalidadeCidade();
    this.naturalidadeEstado = rg.getNaturalidadeEstado();
    this.orgaoExpedidor = rg.getOrgaoExpedidor();
    this.cpf =rg.getCpf();
}
Rg(String nome, String numeroRg,String nomeMae){
    this.nome =nome;
    this.numeroRg = numeroRg;
    this.nomeMae = nomeMae;
}

//GET e SET

public void setNumeroRg(String numeroRg){
    this.numeroRg = numeroRg;
}
public String getNumeroRg(){
    return this.numeroRg;
}
public void setNome(String nome){
    this.nome =Nome;
}
public String getNome(){
    return this.nome;
}
public void setNomePai(String nomePai){
    this.nomePai =nomePai;
}
public String getNomePai(){
    return this.nomePai;
}
public void setNomeMae(String nomeMae){
    this.nomeMae =nomeMae;
}
public String getNomeMae(){
    return this.nomeMae;
}
public void setDataNascimento(String dataNascimento){
    this.dataNascimento =dataNascimento;
}
public String getDataNascimento(){
    return this.dataNascimento;
}
public void setNaturalidadeCidade(String naturalidadeCidade){
    this.naturalidadeCidade =naturalidadeCidade;
}
public String getNaturalidadeCidade(){
    return this.naturalidadeCidade;
}
public void setNaturalidadeEstado(String naturalidadeEstado){
    this.naturalidadeEstado =naturalidadeEstado;
}
public String getNaturalidadeEstado(){
    return this.naturalidadeEstado;
}
public void setOrgaoExpedidor(String orgaoExpedidor){
    this.orgaoExpedidor = orgaoExpedidor;
}
public String getOrgaoExpedidor(){
    return this.orgaoExpedidor;
}
public void setCpf(String cpf ){
    this.cpf =cpf;
}
public String getCpf(){
    return cpf;
}

//metodos 

public boolean ehCpfValido(String cpf){
    if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || CPF.equals("33333333333") ||
            cpf.equals("44444444444") || CPF.equals("55555555555") ||
            cpf.equals("66666666666") || CPF.equals("77777777777") ||
            cpf.equals("88888888888") || CPF.equals("99999999999") ||
            (cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

public boolean ehDatadeNascimentoValida(String dataNascimento){
    String dateFormat = "dd/MM/uuuu";

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
    .ofPattern(dateFormat)
    .withResolverStyle(ResolverStyle.STRICT);
    try {
        LocalDate date = LocalDate.parse(dataNascimento, dateTimeFormatter);
        return true;
    } catch (DateTimeParseException e) {
       return false;
    } 
}

//Para mostrar no main

public String mostraNumeroRg(){
    return numeroRg;
}

public String mostraNome(){
    return nome;
}
public String mostraNomePai(){
    return nomePai;
} 
public String mostraNomeMae(){
    return nomeMae;

}
public String mostraDatadenascimento(){
    return dataNascimento;
}
public String mostraNaturalidadeCidade(){
    return naturalidadeCidade;
}
public String mostraNaturalidadeEsatdo(){
    return naturalidadeEstado;
}
public String mostraOrgaoExpedidor(){
    return orgaoExpedidor;
}
public String mostraCpf(){
    return cpf;
}

}


public class RgTeste{
public static void main(String[] args) {
    Rg i = new Rg();
    i.setNumeroRg("12345678");
    i.setNome("Lucas");
    i.setNomePai("Pai");
    i.setNomeMae("Mae");
    i.setDataNascimento("29082003");   
    i.setNaturalidadeCidade("SJC");
    i.setNaturalidadeEstado("SP");
    i.setOrgaoExpedidor("SP");
    i.setCpf("44444444444");

    
    boolean CpfValido = i.ehCpfValido("44444444");
    boolean dataNascimentoValido =i.ehDatadeNascimentoValido("29082023");
    String nome = i.mostraNome();
    String numerorg =i.mostraNumeroRg();
    String nomePai =i.mostraNomePai();
    String nomeMae =i.mostraNomeMae();
    String dataNascimento = i.mostraDatadenascimento();
    String naturalidadeCidade = i.mostraNaturalidadeCidade();
    String naturalidadeEstado = i.mostraNaturalidadeEsatdo();
    String orgaoExpedidor = i.mostraOrgaoExpedidor();
    String cpf = i.mostraCpf();

    System.out.println(nome);
    System.out.println(numerorg);
    System.out.println(nomePai);
    System.out.println(nomeMae);
    System.out.println(dataNascimento);
    System.out.println(naturalidadeCidade);
    System.out.println(naturalidadeEstado);
    System.out.println(orgaoExpedidor);
    System.out.println(cpf);

    
}
}
