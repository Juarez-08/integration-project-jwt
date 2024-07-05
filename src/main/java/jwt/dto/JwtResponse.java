package jwt.dto;

public class JwtResponse {
    private final String jwtToken;

    /**
     * Constructor de JwtResponse que inicializa el token JWT.
     *
     * @param jwtToken El token JWT a encapsular en esta respuesta.
     */
    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    /**
     * Obtiene el token JWT.
     *
     * @return El token JWT encapsulado en esta respuesta.
     */
    public String getJwtToken() {
        return jwtToken;
    }
}
