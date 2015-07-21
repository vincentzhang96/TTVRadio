package co.phoenixlab.ttvradio.config;

import java.nio.file.Path;

public class InternalConfiguration {

    /**
     * Path to the root FXML file in the JAR
     */
    private String fxmlJarPath;

    /**
     * Fully qualified class name to the root ResourceBundle to use with the root FXML file
     */
    private String fxmlResourceBundleClassName;

    /**
     * A path relative to the application runtime directory to the user configuration file
     */
    private Path relativePathToUserConfig;

    public InternalConfiguration() {

    }

    /**
     * @return {@link #fxmlJarPath}
     */
    public String getFxmlJarPath() {
        return fxmlJarPath;
    }

    /**
     * @return {@link #fxmlResourceBundleClassName}
     */
    public String getFxmlResourceBundleClassName() {
        return fxmlResourceBundleClassName;
    }

    /**
     * @return {@link #relativePathToUserConfig}
     */
    public Path getRelativePathToUserConfig() {
        return relativePathToUserConfig;
    }
}
