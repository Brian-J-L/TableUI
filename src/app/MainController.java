package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



public class MainController implements Initializable {
    ObservableList<UserPerson>h= FXCollections.observableArrayList(new ArrayList<UserPerson>());
    @FXML
    private TableView g;
    @FXML
    private TextField name,lastname;

    @FXML
    private TableColumn<UserPerson,String> tv_FirstName, tv_LastName;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        tv_LastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tv_FirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        g.setItems(h);
    }
    public void add(){
        h.add(new UserPerson(name.getText(),lastname.getText()));
    }
}
