package br.com.mentoria.kafka.Dto;

public class UsuarioDto {
    private String email;
    private String senha;

    public UsuarioDto(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
