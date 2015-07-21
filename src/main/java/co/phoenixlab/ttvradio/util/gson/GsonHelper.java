package co.phoenixlab.ttvradio.util.gson;

import co.phoenixlab.ttvradio.util.gson.adapters.PathAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;

public class GsonHelper {

    private static final GsonBuilder DEFAULT_BUILDER;

    static {
        DEFAULT_BUILDER = new GsonBuilder().
                serializeNulls().
                registerTypeAdapter(Path.class, new PathAdapter());
    }

    private GsonHelper() {
    }

    public static Gson pretty() {
        return DEFAULT_BUILDER.
                setPrettyPrinting().
                create();
    }

    public static Gson standard() {
        return DEFAULT_BUILDER.
                create();
    }


}
