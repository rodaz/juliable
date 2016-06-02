package ru.diit;

import com.sun.javafx.scene.control.skin.resources.ControlResources;
import javafx.application.Platform;
import javafx.beans.NamedArg;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

/**
 * Created by oit on 02.06.2016.
 */
public class PassTextInputDialog extends Dialog<String> {

    private final GridPane grid;
    private final Label label;
    private final PasswordField textField;
    private final String defaultValue;

    public PassTextInputDialog() {
        this("");
    }

    public PassTextInputDialog(@NamedArg("defaultValue") String defaultValue) {
        final DialogPane dialogPane = getDialogPane();
        this.textField = new PasswordField();
        this.textField.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(textField, Priority.ALWAYS);
        GridPane.setFillWidth(textField, true);
        label = createContentL(dialogPane.getContentText());
        label.setPrefWidth(Region.USE_COMPUTED_SIZE);
        label.textProperty().bind(dialogPane.contentTextProperty());
        this.defaultValue = defaultValue;
        this.grid = new GridPane();
        this.grid.setHgap(10);
        this.grid.setMaxWidth(Double.MAX_VALUE);
        this.grid.setAlignment(Pos.CENTER_LEFT);
        dialogPane.contentTextProperty().addListener(o -> updateGrid());
        setTitle(ControlResources.getString("Dialog.confirm.title"));
        dialogPane.setHeaderText(ControlResources.getString("Dialog.confirm.header"));
        dialogPane.getStyleClass().add("text-input-dialog");
        dialogPane.getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        updateGrid();
        setResultConverter((dialogButton) -> {
            ButtonBar.ButtonData data = dialogButton == null ? null : dialogButton.getButtonData();
            return data == ButtonBar.ButtonData.OK_DONE ? textField.getText() : null;
        });
    }

    private Label createContentL(String text) {
        Label label = new Label(text);
        label.setMaxWidth(Double.MAX_VALUE);
        label.setMaxHeight(Double.MAX_VALUE);
        label.getStyleClass().add("content");
        label.setWrapText(true);
        label.setPrefWidth(360);
        return label;
    }

    public final PasswordField getEditor() {
        return textField;
    }

    public final String getDefaultValue() {
        return defaultValue;
    }

    private void updateGrid() {
        grid.getChildren().clear();
        grid.add(label, 0, 0);
        grid.add(textField, 1, 0);
        getDialogPane().setContent(grid);
        Platform.runLater(() -> textField.requestFocus());
    }
}
