package com.MM;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//new commit just for report screenshots
public class TaskSerializer {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public void serialize(Task task, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            GSON.toJson(task, writer);
        }
    }
}