package daos;

import com.sun.jdi.connect.Connector;
import models.CarDTO;

import java.sql.*;
import java.util.List;

import static com.sun.jdi.connect.Connector.*;

public class CarDAO implements IDAO {


    @Override
    public CarDTO findById(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM cars WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                return extractCarFromResultSet(rs);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;


    }

    private CarDTO extractCarFromResultSet(ResultSet rs) throws SQLException {
        CarDTO car = new CarDTO();

        car.setId(rs.getInt("id"));
        car.setMake(rs.getString("make"));
        car.setModel(rs.getString("model"));
        // FIXME
        car.setColor(rs.getString("color"));
        car.setYear(rs.getInt("year"));
        car.setVin(rs.getString("vin"));

        return car;
    }

    @Override
    public List<CarDTO> findAll() {
        return null;
    }



    public CarDTO update(CarDTO dto) {
        return null;
    }

    public CarDTO create(CarDTO dto) {
        return null;
    }

    public void delete(int id) {

    }
}
