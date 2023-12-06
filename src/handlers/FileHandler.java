/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import java.io.*;
import java.util.*;

/**
 *
 * @author jhnyx
 *
 * This class handles file operations for arrays, stacks, queues, and linked
 * lists. It provides methods to save and load input values from files. The file
 * format for input values is a plain text file with one value per line. The
 * file is stored in the "data" folder in the project directory.
 */
public class FileHandler {

    private static final String FILE_FOLDER = "data/";
    private static final String ARRAY_INPUT_VALUES_FILE = "arrayInputValues.txt";
    private static final String STACK_INPUT_VALUES_FILE = "stackInputValues.txt";
    private static final String QUEUE_INPUT_VALUES_FILE = "queueInputValues.txt";
    private static final String LINKED_LIST_INPUT_VALUES_FILE = "linkedListInputValues.txt";
    private static final String BINARY_SEARCH_INPUT_VALUES_FILE = "binarySearchInputValues.txt";



    /* Start of Array */
    public static void saveArrayInputValues(int[] inputValues) {
        try {
            File folder = new File(FILE_FOLDER);
            folder.mkdir();

            try (FileWriter writer = new FileWriter(FILE_FOLDER + ARRAY_INPUT_VALUES_FILE)) {
                for (int i = 0; i < inputValues.length; i++) {
                    writer.write(inputValues[i] + "\n");
                }
            }
            System.out.println("Array input values saved to file.");
        } catch (IOException e) {
        }
    }

    public static int[] loadArrayInputValues() {
        int[] inputValues = new int[6]; // default values
        try {
            try (FileReader reader = new FileReader(FILE_FOLDER + ARRAY_INPUT_VALUES_FILE)) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                for (int i = 0; i < inputValues.length; i++) {
                    inputValues[i] = Integer.parseInt(bufferedReader.readLine());
                }
            }
        } catch (IOException e) {
        } catch (NumberFormatException e) {
            System.out.println("Invalid input value found in file.");
        }
        return inputValues;
    }

    /* End of Array */

 /* Start of Stack */
    public static void saveStackInputValues(Stack<Integer> inputValues) {
        try {
            File folder = new File(FILE_FOLDER);
            folder.mkdir();

            try (FileWriter writer = new FileWriter(FILE_FOLDER + STACK_INPUT_VALUES_FILE)) {
                while (!inputValues.isEmpty()) {
                    writer.write(inputValues.pop() + "\n");
                }
            }
            System.out.println("Stack input values saved to file.");
        } catch (IOException e) {
        }
    }

    public static Stack<Integer> loadStackInputValues() {
        Stack<Integer> inputValues = new Stack<>();
        try {
            try (FileReader reader = new FileReader(FILE_FOLDER + STACK_INPUT_VALUES_FILE)) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    inputValues.push(Integer.parseInt(line));
                }
            }
            Collections.reverse(inputValues); // reverse the order of elements
        } catch (IOException e) {
            System.out.println("Error reading stack input values from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid stack input value found in file: " + e.getMessage());
        }
        return inputValues;
    }

    /* End of Stack */
 /* Start of Queue */
    public static void saveQueueInputValues(Queue<Integer> inputValues) {
        try {
            File folder = new File(FILE_FOLDER);
            folder.mkdir();

            try (FileWriter writer = new FileWriter(FILE_FOLDER + QUEUE_INPUT_VALUES_FILE)) {
                for (int value : inputValues) {
                    writer.write(value + "\n");
                }
            }
            System.out.println("Queue input values saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving queue input values to file: " + e.getMessage());
        }
    }

    public static Queue<Integer> loadQueueInputValues() {
        Queue<Integer> inputValues = new LinkedList<>();
        try {
            File folder = new File(FILE_FOLDER);
            folder.mkdir();

            File file = new File(FILE_FOLDER + QUEUE_INPUT_VALUES_FILE);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Queue input values file created.");
            }

            try (FileReader reader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    inputValues.add(Integer.parseInt(line));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading queue input values from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid queue input value found in file: " + e.getMessage());
        }
        return inputValues;
    }

    /* End of Queue */

 /* Start of LinkedLists */
    public static void saveLinkedListInputValues(LinkedList<Integer> inputValues) {
        try {
            File folder = new File(FILE_FOLDER);
            folder.mkdir();

            try (FileWriter writer = new FileWriter(FILE_FOLDER + LINKED_LIST_INPUT_VALUES_FILE)) {
                for (int value : inputValues) {
                    writer.write(value + "\n");
                }
            }
            System.out.println("Linked list input values saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving linked list input values to file: " + e.getMessage());
        }
    }

    public static LinkedList<Integer> loadLinkedListInputValues() {
        LinkedList<Integer> inputValues = new LinkedList<>();
        try {
            File folder = new File(FILE_FOLDER);
            folder.mkdir();

            File file = new File(FILE_FOLDER + LINKED_LIST_INPUT_VALUES_FILE);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Linked list input values file created.");
                inputValues.add(0); // Add default value of 0
                return inputValues; // Return the list with the default value
            }

            try (FileReader reader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    inputValues.add(Integer.parseInt(line));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading linked list input values from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid linked list input value found in file: " + e.getMessage());
        }
        return inputValues;
    }

    /* End of LinkedLists */
    
    /* Start of Binary Search */
public static void saveBinarySearchInputValues(int[] inputValues) {
    try {
        File folder = new File(FILE_FOLDER);
        folder.mkdir();

        try (FileWriter writer = new FileWriter(FILE_FOLDER + BINARY_SEARCH_INPUT_VALUES_FILE)) {
            for (int i = 0; i < inputValues.length; i++) {
                writer.write(inputValues[i] + "\n");
            }
        }
        System.out.println("Binary search input values saved to file.");
    } catch (IOException e) {
        System.out.println("Error saving binary search input values to file: " + e.getMessage());
    }
}

public static int[] loadBinarySearchInputValues() {
    int[] inputValues = new int[6]; // default values
    try {
        try (FileReader reader = new FileReader(FILE_FOLDER + BINARY_SEARCH_INPUT_VALUES_FILE)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = Integer.parseInt(bufferedReader.readLine());
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading binary search input values from file: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Invalid binary search input value found in file: " + e.getMessage());
    }
    return inputValues;
}
/* End of Binary Search */

}
