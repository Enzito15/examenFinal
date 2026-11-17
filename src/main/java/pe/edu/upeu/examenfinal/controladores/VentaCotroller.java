package pe.edu.upeu.examenfinal.controladores;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pe.edu.upeu.examenfinal.Modelo.Ventas;
import pe.edu.upeu.examenfinal.implementaciones.IVentasDaoImpl;
import pe.edu.upeu.examenfinal.interfaces.IVentasDao;

import java.time.LocalDate;

public class VentaCotroller {
    @FXML
    private TableView<Ventas> tableVentas;
    @FXML
    private TableColumn<Ventas, Number> ColNumero;
    @FXML
    private TableColumn<Ventas, Integer> ColId;
    @FXML
    private TableColumn<Ventas, String> ColCliente;
    @FXML
    private TableColumn<Ventas, String> ColProducto;
    @FXML
    private TableColumn<Ventas, Double> Colprecio;
    @FXML
    private TableColumn<Ventas, Double> Colsubtotal;
    @FXML
    private TableColumn<Ventas, Double> Coltotal;
    @FXML
    private TableColumn<Ventas, LocalDate> ColFechaVenta;
    @FXML
    private TableColumn<Ventas, String> ColEstado;

    private final IVentasDao VentasDao = new IVentasDaoImpl();
    private ObservableList<Ventas> listVentas;



}
