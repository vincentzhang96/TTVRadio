package co.phoenixlab.ttvradio;

import co.phoenixlab.ttvradio.config.InternalConfiguration;
import co.phoenixlab.ttvradio.config.UserConfiguration;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TTVRadio extends Application {

    /**
     * The {@link ScheduledExecutorService} for this application
     */
    private static final ScheduledExecutorService EXECUTOR_SERVICE;
    /**
     * Path to the internal configuration JSON file
     */
    private static final String INTERNAL_CONFIG_JAR_PATH = "/co/phoenixlab/ttvradio/internalConfig.json";

    static {
        EXECUTOR_SERVICE = Executors.newScheduledThreadPool(4);
    }

    public static void main(String[] args) {
        launch(args);
    }

    private InternalConfiguration internalConfig;

    private UserConfiguration userConfig;

    @Override
    public void init() {
        try {
            //  Load internal configuration
            //  TODO Read internal config JSON (internal)
            //  Load configuration
            //  TODO Read user config JSON (external)
        } catch (Exception e) {
            //  Initialization has failed, notify the user
            //  Note that the JFX systems have not started and therefore we cannot use any JFX UI
            //  TODO Notify the user of failed initialization
        }
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            //  Load and set up FXML layout and controller
            ResourceBundle resourceBundle = ResourceBundle.getBundle(
                    internalConfig.getFxmlResourceBundleClassName(), userConfig.getLocale());
            URL fxmlUrl = TTVRadio.class.getResource(internalConfig.getFxmlJarPath());
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlUrl, resourceBundle);
            TTVFxmlController controller = fxmlLoader.getController();
            controller.init(this);
            //  Done
        } catch (Exception e) {
            //  Startup has failed, notify the user
            //  This time we can assume that the JFX UI systems are running; we ran into an issue loading app-specific
            //  data (layout, style, etc).
            onFatalStartupError(e);
        }
    }

    @Override
    public void stop() {
        //  Perform shutdown cleanup
        try {
            //  Halt services
            EXECUTOR_SERVICE.shutdownNow();


        } catch (Exception e) {
            //  Log exceptions, but we don't care if we fail

        }
    }

    private void onFatalStartupError(Throwable throwable) {
        //  TODO Notify the user of failed startup
    }
}
