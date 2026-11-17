package pe.edu.upeu.examenfinal.controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
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

    @FXML
    public void initialize() {
        ColNumero.setCellFactory(colum -> new TableCell<>() {
            @Override
            protected void updateItem(Number item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setText(null);
                } else {
                    setText(String.valueOf(getIndex() + 1));
                }
            }

        });

        ColId.setCellValueFactory(cellData -> cellData.getValue().idventaProperty().asObject());
        ColCliente.setCellValueFactory(cellData -> cellData.getValue().ClienteProperty());
        ColProducto.setCellValueFactory(cellData -> cellData.getValue().productoProperty());
        Colprecio.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        Colsubtotal.setCellValueFactory(cellData -> cellData.getValue().subtotalProperty().asObject());
        Coltotal.setCellValueFactory(cellData -> cellData.getValue().totalProperty().asObject());
        ColEstado.setCellValueFactory(cellData -> cellData.getValue().estadoProperty());
        //LLamar al metodo

    }
/*
    private void cargarDatos() {
        listVentas = FXCollections.observableArrayList(IVentasDao.vlistAll());
        tableVentas.setItems(listVentas);

//el list no funciona, corregi y corregi y na, que salado soy :(, sin IA corregir errores es tranca si estas corto de tiempo XD
    }

 */
}
