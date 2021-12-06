module barta.balazs.masodfokuegyenlet {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens barta.balazs.masodfokuegyenlet to javafx.fxml;
    exports barta.balazs.masodfokuegyenlet;
}