package flight.service;

import flight.dao.PersonaDAO;
import flight.entity.Persona;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightService {

    PersonaDAO personaDAO;


    public List<String> setFlightDataCombobox(String rut, String nombre) throws SQLException {


        personaDAO = new PersonaDAO();

        List<Persona> personList = personaDAO.get(rut, nombre);
        List<String> combobox=new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (Persona persona : personList) {

            sb.append(persona.getNombre());
            sb.append("-");
            sb.append(persona.getRut());
            sb.append("-");
            combobox.add(sb.toString());
        }



        return combobox;
    }



}
