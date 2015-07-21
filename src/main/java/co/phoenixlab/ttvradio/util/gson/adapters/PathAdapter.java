package co.phoenixlab.ttvradio.util.gson.adapters;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * JSON adapter for {@link Path paths}. Uses {@link Path#normalize() normalized} String representations of the Path
 */
public class PathAdapter implements JsonSerializer<Path>, JsonDeserializer<Path> {

    public Path deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return Paths.get(json.getAsString());
    }

    public JsonElement serialize(Path src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.normalize().toString());
    }
}
