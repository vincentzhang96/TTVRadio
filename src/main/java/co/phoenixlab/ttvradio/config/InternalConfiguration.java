package co.phoenixlab.ttvradio.config;

import co.phoenixlab.ttvradio.util.validate.Validatable;

import java.nio.file.Path;

import static co.phoenixlab.ttvradio.util.U.isNullOrTrimmedEmpty;

public class InternalConfiguration implements Validatable<InvalidConfigException> {

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

    @Override
    public void validate() throws InvalidConfigException {
        if (isNullOrTrimmedEmpty(fxmlJarPath)) {
            throw new InvalidConfigException("FXML Jar Path cannot be null or empty");
        }
        if (isNullOrTrimmedEmpty(fxmlResourceBundleClassName)) {
            throw new InvalidConfigException("FXML Resource Bundle Class Name cannot be null or empty");
        }
        if (relativePathToUserConfig == null || relativePathToUserConfig.getNameCount() == 0) {
            throw new InvalidConfigException("Relative Path to User Config cannot be null or empty");
        }
    }
}
