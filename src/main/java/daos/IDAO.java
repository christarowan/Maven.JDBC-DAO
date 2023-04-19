package daos;

import models.CarDTO;

import java.util.List;

public interface IDAO {


    public CarDTO findById(int id);
    public List<CarDTO> findAll();
    public CarDTO update(CarDTO dto);
    public CarDTO create(CarDTO dto);
    public void delete(int id);
}
