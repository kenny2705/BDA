package interfaces;

import DTO.Perfil;

/**
 * Interfaz para las operaciones de acceso a datos relacionadas con el perfil.
 * 
 * @author jorge
 */
public interface IPerfilDAO {

    /**
     * Registra un nuevo perfil en la base de datos.
     * 
     * @param perfil El perfil a registrar.
     * @return true si el registro fue exitoso, false en caso contrario.
     */
    public boolean registrar(Perfil perfil);
}
