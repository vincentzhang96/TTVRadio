package co.phoenixlab.ttvradio.util.jfx;

import javafx.application.Platform;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

public class JFXThreadHelper {

    public static boolean isJFXThread() {
        return Platform.isFxApplicationThread();
    }

    public static void runOnJFXThread(final Runnable runnable) {
        Platform.runLater(runnable);
    }

    public static <T> void runOnJFXThread(final Consumer<T> consumer, final T t) {
        Platform.runLater(() -> consumer.accept(t));
    }

    public static void runOnJFXThread(final LongConsumer consumer, final long l) {
        Platform.runLater(() -> consumer.accept(l));
    }

    public static void runOnJFXThread(final DoubleConsumer consumer, final double d) {
        Platform.runLater(() -> consumer.accept(d));
    }

    public static <T, U> void runOnJFXThread(final BiConsumer<T, U> consumer, final T t, final U u) {
        Platform.runLater(() -> consumer.accept(t, u));
    }

}
