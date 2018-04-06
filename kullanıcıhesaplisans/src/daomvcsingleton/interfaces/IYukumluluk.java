package daomvcsingleton.interfaces;

import javafx.collections.ObservableList;

//Crud Create Update Delete...
public interface IYukumluluk<HerhangibirEntity> {
    public boolean create(HerhangibirEntity create);
    public boolean delete(Object key);
    public boolean updateUser(HerhangibirEntity update,Object key);
    public boolean updateAdmin(HerhangibirEntity update,Object key);
    public HerhangibirEntity read(Object key);
    public ObservableList<HerhangibirEntity> readAll();


}
