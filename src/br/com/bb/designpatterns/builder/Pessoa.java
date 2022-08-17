package br.com.bb.designpatterns.builder;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private String dataNascimento;

    private Pessoa(String nome, String sobreNome, String documento, String email, String apelido, String dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public static class PessoaBuilderInterno {

        private String nome;
        private String sobreNome;
        private String documento;
        private String email;
        private String apelido;
        private String dataNascimento;

        public PessoaBuilderInterno(){

        }

        public PessoaBuilderInterno nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilderInterno sobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
            return this;
        }

        public PessoaBuilderInterno documento(String documento) {
            this.documento = documento;
            return this;
        }

        public PessoaBuilderInterno email(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilderInterno apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilderInterno dataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(
                    this.nome,
                    this.sobreNome,
                    this.documento,
                    this.email,
                    this.apelido,
                    this.dataNascimento
            );
        }
    }
}
