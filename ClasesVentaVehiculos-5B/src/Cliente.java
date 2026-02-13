
public class Cliente {

    private String rs;
    private String rfc;
    private String email;

    public Cliente(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }

    @Override
    public String toString() {
        String Cadena;
        Cadena = "Rason Social: " + this.rs + "\n"
                + "Rfc: " + this.rfc + "\n"
                + "Email: " + this.email + "\n";
        return Cadena;
    }
}
