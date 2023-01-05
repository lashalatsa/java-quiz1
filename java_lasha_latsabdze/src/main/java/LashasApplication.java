import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LashasApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        PieChart pieChart = new PieChart();
        pieChart.setTranslateX(100);
        pieChart.setTranslateY(200);

        pieChart.setData(getData());


        Group root = new Group();
        root.getChildren().add(pieChart);


        Scene scene = new Scene(root,300,600,Color.GREEN);

        stage.setScene(scene);
        stage.setTitle("Lasha's App");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private ObservableList<PieChart.Data> getData(){
        ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList(
                new PieChart.Data("Paris", 100),
                new PieChart.Data("Berlin",130),
                new PieChart.Data("London", 250)
        );
        return observableList;
    }
}