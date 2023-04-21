package App;

import daos.CarDAO;
import models.CarDTO;

public class AppMain {
    public static void main(String[] args) {
        int id = 1;
        CarDAO dao = new CarDAO();
        CarDTO myCar = dao.findById(id);
        System.out.println(myCar.getMake());
        System.out.println(myCar);


    }

}
