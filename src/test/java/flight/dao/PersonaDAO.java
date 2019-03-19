package flight.dao;

import flight.entity.Persona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    public void save() throws SQLException {

        String sql="insert rom persona where rut=? and nombre=?";

        PreparedStatement ps = null;//= connection.......;

        ps.setString(1, rut);
        ps.setString(2, nombre);

        ps.executeQuery(sql);

    }

    public List<Persona> get(String rut , String nombre) throws SQLException {

        String sql="select * from persona where rut=? and nombre=?";

        PreparedStatement ps = null;//connection.......;

        ps.setString(1, rut);
        ps.setString(2, nombre);

        ResultSet rs=ps.executeQuery(sql);

        Persona persona;
        List<Persona> listPersona =new ArrayList<>();
        while (rs.next()){
            persona = new Persona();
            persona.setNombre(rs.getString(1));
            persona.setRut(rs.getString("rut"));


            listPersona.add(persona);
        }


        return listPersona;
    }


    public List <>getPersonaOlder(String edad)


}
