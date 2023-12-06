/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

import java.util.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.Queue;

/**
 *
 * @author jhnyx
 */
class SinglyLinkedListNode {

    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DataHandler {

    private SinglyLinkedListNode head;
    private int size; // Variable to track the size of the linked list

    public DataHandler() {
        this.head = null;
        this.size = 0;
    }

    private int[] array;
    public Stack<Integer> stack;
    public Queue<Integer> queue;

    public DataHandler(int[] array, Stack<Integer> stack, Queue<Integer> queue) {
        this.array = array;
        this.stack = stack;
        this.queue = queue;
        this.head = null; // Initialize the head of the linked list
    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    /* Start of Array Operations */
    //Traverse operation
    public String traverse() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString();
    }

    //Insertion operation
    public String insertion(int index, int value) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int[] originalArray = Arrays.copyOf(array, array.length);
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;

        return "Original array: " + Arrays.toString(originalArray) + "\n\nNew array after inserting " + value + " at index " + index + ": " + Arrays.toString(newArray);
    }

    //Deletion operation
    public String deletion(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int[] originalArray = Arrays.copyOf(array, array.length);
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        array = newArray;

        return "Original array: " + Arrays.toString(originalArray) + "\n\nNew array after deleting element at index " + index + ": " + Arrays.toString(array);
    }

    //Search operation
    public String search(int value) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                indices.add(i + 1);
            }
        }
        if (!indices.isEmpty()) {
            String result = "Found element " + value + " at positions " + indices.toString();
            return result;
        } else {
            return "Element not found";
        }
    }

    //Update Operation
    public String update(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int[] originalArray = Arrays.copyOf(array, array.length);
        array[index] = value;

        return "Original array: " + Arrays.toString(originalArray) + "\n\nNew array after " + value + " element at index " + index + " to: " + Arrays.toString(array);
    }

 /* End of Array Operations */

 /* Start of Stack Operations */
    // Display the stack
    public String display() {
        if (stack.isEmpty()) {
            return "Stack is empty!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Stack: [");
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
                if (i < stack.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    // Push operation
    public String push(int value) {
        stack.push(value);
        StringBuilder sb = new StringBuilder();
        sb.append("Pushed ").append(value).append(" into Stack: [");
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
            if (i < stack.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Pop operation
    public String pop() {
        if (stack.isEmpty()) {
            return "Stack underflow!";
        } else {
            int popped = stack.pop();
            StringBuilder sb = new StringBuilder();
            sb.append("Popped ").append(popped).append(" from Stack: [");
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
                if (i < stack.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    // Peek operation
    public String peek() {
        if (stack.isEmpty()) {
            return "Stack is empty!";
        } else {
            int top = stack.peek();
            return "Top element of Stack: " + top;
        }
    }

 /* End of Stack Operations */
    
 /* Start of Queue Operations */
    // Display the queue
    public String displayQueue() {
        if (queue.isEmpty()) {
            return "Queue is empty!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Queue: [");
            for (int i = 0; i < queue.size(); i++) {
                sb.append(queue.peek());
                queue.offer(queue.poll());
                if (i < queue.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    // Enqueue operation
    public static Queue<Integer> enqueue(Queue<Integer> queue, int value) {
        Queue<Integer> newQueue = new LinkedList<>(queue);
        newQueue.offer(value);

        StringBuilder sb = new StringBuilder();
        sb.append("Enqueued ").append(value).append(" into Queue: [");
        for (int i = 0; i < newQueue.size(); i++) {
            sb.append(newQueue.peek());
            newQueue.offer(newQueue.poll());
            if (i < newQueue.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        System.out.println(sb.toString());
        return newQueue;
    }

    // Dequeue operation
    public String dequeue() {
        if (queue.isEmpty()) {
            return "Queue underflow!";
        } else {
            int dequeued = queue.poll();
            StringBuilder sb = new StringBuilder();
            sb.append("Dequeued ").append(dequeued).append(" from Queue: [");
            for (int i = 0; i < queue.size(); i++) {
                sb.append(queue.peek());
                queue.offer(queue.poll());
                if (i < queue.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    // Peek operation
    public String peekQueue() {
        if (queue.isEmpty()) {
            return "Queue is empty!";
        } else {
            int front = queue.peek();
            return "Front element of Queue: " + front;
        }
    }

 /* End of Queue Operations */

 /* Start of Singly Linked List Operations */
    // Display operation
    public String displayLL(boolean showOriginal) {
        if (head == null) {
            return "Linked list is empty!";
        }
        StringBuilder sb = new StringBuilder();
        SinglyLinkedListNode current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }

        if (showOriginal) {
            return "Original linked list: " + sb.toString();
        } else {
            return "Updated linked list: " + sb.toString();
        }
    }

    // Insertion operation
    public void insertLL(int index, int value) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            SinglyLinkedListNode current = head;
            int count = 0;
            while (current != null && count < index - 1) {
                current = current.next;
                count++;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++; // Increase the size of the linked list
    }

    // Method to get the size of the linked list
    public int size() {
        return size;
    }

    // Deletion operation
    public String deleteLL(int index) {
        if (head == null) {
            return "Linked list is empty!";
        }

        String originalList = displayLL(true); // Store the original list
        String updatedList; // Declare the variable to store the updated list

        if (index == 0) {
            head = head.next;
            updatedList = displayLL(false); // Get the updated list
        } else {
            SinglyLinkedListNode current = head;
            SinglyLinkedListNode prev = null;
            int count = 0;
            while (current != null && count < index) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current == null) {
                return "Invalid index!";
            }
            prev.next = current.next;
            updatedList = displayLL(false); // Get the updated list
        }

        return originalList + "\n\n" + updatedList;
    }

    // Search operation
    public boolean searchLL(int data) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

 /* End of Singly Linked List Operations */
    
 /* Start of Graph Operations */   
    // Graph operations
    // Breadth-first search
    public String breadthFirstSearch(int[][] graph, int startVertex) {
        int numVertices = graph.length;
        boolean[] visited = new boolean[numVertices]; // Array to track visited vertices
        StringBuilder result = new StringBuilder(); // String builder to store the result

        // Create a queue for BFS
        Queue<Integer> bfsQueue = new LinkedList<>();

        // Mark the start vertex as visited and enqueue it
        visited[startVertex] = true;
        bfsQueue.add(startVertex);

        while (!bfsQueue.isEmpty()) {
            // Dequeue a vertex from the queue and append it to the result
            int currentVertex = bfsQueue.poll();
            result.append(currentVertex).append(" ");

            // Get the neighbors of the current vertex
            for (int neighbor = 0; neighbor < numVertices; neighbor++) {
                if (graph[currentVertex][neighbor] != 0 && !visited[neighbor]) {
                    // Mark the neighbor as visited and enqueue it
                    visited[neighbor] = true;
                    bfsQueue.add(neighbor);
                }
            }
        }

        return result.toString();
    }
    
    // Depth-first search
    public String depthFirstSearch(int[][] graph, int startVertex) {
    int numVertices = graph.length;
    boolean[] visited = new boolean[numVertices]; // Array to track visited vertices
    StringBuilder result = new StringBuilder(); // String builder to store the result

    // Create a stack for DFS
    Stack<Integer> dfsStack = new Stack<>();

    // Mark the start vertex as visited and push it to the stack
    visited[startVertex] = true;
    dfsStack.push(startVertex);

    while (!dfsStack.isEmpty()) {
        // Pop a vertex from the stack and append it to the result
        int currentVertex = dfsStack.pop();
        result.append(currentVertex).append(" ");

        // Get the neighbors of the current vertex
        for (int neighbor = 0; neighbor < numVertices; neighbor++) {
            if (graph[currentVertex][neighbor] != 0 && !visited[neighbor]) {
                // Mark the neighbor as visited and push it to the stack
                visited[neighbor] = true;
                dfsStack.push(neighbor);
            }
        }
    }

    return result.toString();
}
 /* End of Graph Operations */   
    
/* Start of Tree Operations */

// Pre-order traversal
public String preOrderTraversal(int[] tree, int root) {
    StringBuilder result = new StringBuilder();
    preOrder(tree, root, result);
    return result.toString();
}

private void preOrder(int[] tree, int node, StringBuilder result) {
    if (node < tree.length) {
        result.append(tree[node]).append(" "); // Process the current node
        preOrder(tree, 2 * node + 1, result); // Traverse the left subtree
        preOrder(tree, 2 * node + 2, result); // Traverse the right subtree
    }
}

// In-order traversal
public String inOrderTraversal(int[] tree, int root) {
    StringBuilder result = new StringBuilder();
    inOrder(tree, root, result);
    return result.toString();
}

private void inOrder(int[] tree, int node, StringBuilder result) {
    if (node < tree.length) {
        inOrder(tree, 2 * node + 1, result); // Traverse the left subtree
        result.append(tree[node]).append(" "); // Process the current node
        inOrder(tree, 2 * node + 2, result); // Traverse the right subtree
    }
}

// Post-order traversal
public String postOrderTraversal(int[] tree, int root) {
    StringBuilder result = new StringBuilder();
    postOrder(tree, root, result);
    return result.toString();
}

private void postOrder(int[] tree, int node, StringBuilder result) {
    if (node < tree.length) {
        postOrder(tree, 2 * node + 1, result); // Traverse the left subtree
        postOrder(tree, 2 * node + 2, result); // Traverse the right subtree
        result.append(tree[node]).append(" "); // Process the current node
    }
}

/* End of Tree Operations */

/* Start of SortAlgo Operations */
// Counting Sort
public String countingSort(int[] array) {
    // Find the maximum element in the array
    int max = findMax(array);

    // Create a count array to store the count of each element
    int[] count = new int[max + 1];

    // Calculate the count of each element
    for (int i = 0; i < array.length; i++) {
        count[array[i]]++;
    }

    // Modify the count array to store the cumulative count
    for (int i = 1; i < count.length; i++) {
        count[i] += count[i - 1];
    }

    // Create a sorted array based on the count array
    int[] sortedArray = new int[array.length];
    for (int i = array.length - 1; i >= 0; i--) {
        sortedArray[count[array[i]] - 1] = array[i];
        count[array[i]]--;
    }

    // Convert the sorted array to a string representation
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < sortedArray.length; i++) {
        result.append(sortedArray[i]).append(" ");
    }

    return result.toString();
}

// Helper method to find the maximum element in the array
private int findMax(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

/* End of SortAlgo Operations */

/* Start of SearchAlgo Operations */
// Binary search algorithm to search for a target element in a sorted array
public int binarySearch(int[] array, int target) {
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (array[mid] == target) {
            return mid; // Element found at index mid
        } else if (array[mid] < target) {
            low = mid + 1; // Search in the right half
        } else {
            high = mid - 1; // Search in the left half
        }
    }

    return -1; // Element not found
}


/* End of SearchAlgo Operations */


}
