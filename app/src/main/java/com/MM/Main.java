package com.MM;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(
            "Finish 345 Presentation",
            "Complete code review and prepare presentation.",
            "5/2/23",
            "High"
        );

        TaskSerializer serializer = new TaskSerializer();
        try {
            serializer.serialize(task, "task.json");
        } catch (IOException e) {
            System.err.println("Error: Failed to serialize task to JSON.");
            e.printStackTrace();
        }
    }
}