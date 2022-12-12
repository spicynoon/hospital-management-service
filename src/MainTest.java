
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

// NODE GRAPH
class Vertex {
  private String name;
  private LinkedList<Edge> edgeList;

  public Vertex(String name) {
    this.name = name;
    edgeList = new LinkedList<>();
  }

  public String getName() {
    return name;
  }

  public LinkedList<Edge> getEdges() {
    return edgeList;
  }
}

class Edge {
  private int weight;
  private Vertex destVertex;

  public Edge(Vertex dest, int w) {
    this.destVertex = dest;
    this.weight = w;
  }

  public Edge(Vertex dest) {
    this.destVertex = dest;
    this.weight = 1;
  }

  public int getWeight() {
    return weight;
  }

  public Vertex getDestVertex() {
    return destVertex;
  }
}

class Graph {
  private HashSet<Vertex> nodes;

  public Graph() {
    nodes = new HashSet<>();
  }

  public boolean AddEdge(Vertex v1, Vertex v2, int weight) {
    return v1.getEdges().add(new Edge(v2, weight));
  }

  public boolean AddVertex(Vertex v) {
    return nodes.add(v);
  }

  public void printGraph() {
    for (Vertex v : nodes) {
      System.out.print("vertex name: " + v.getName() + ": ");
      for (Edge e : v.getEdges()) {
        System.out.print("destVertex: " + e.getDestVertex().getName() + " weight: " + e.getWeight() + " | ");
      }
      System.out.print("\n");
    }
  }
}

public class MainTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan;

    // Menu pilihan
    do {

      System.out.println("========== YANDIYAN 1217050144 ==========");
      System.out.println("================= MENU ==================");
      System.out.println("1. Collections");
      System.out.println("2. Linked List");
      System.out.println("3. Hash");
      System.out.println("4. Binary Search Tree");
      System.out.println("5. Graph");
      System.out.println("6. Keluar");
      System.out.println("=========================================");
      System.out.print("Pilih menu [1-6]: ");
      pilihan = input.nextInt();

      // Pilihan menu
      switch (pilihan) {
        case 1:
          // kode untuk menu Collections
          List<String> exampleCC = new ArrayList<>();
          boolean run = true;
          Scanner in = new Scanner(System.in);
          ArrayList<String> aList = new ArrayList<String>();
          TreeSet<String> tSet = new TreeSet<String>();

          while (run) {
            System.out.println("==================================================");
            System.out.print("1. Array List\n2. Tree Set\n3. Keluar\napa yang anda plih: ");
            int pilihann = in.nextInt();

            if (pilihann == 1) {
              boolean run2 = true;

              while (run2) {
                System.out.print("1. Menambahkan\n2. Menghapus\n3. Menampilkan\napa yang anda pilih: ");
                int pilihan2 = in.nextInt();

                if (pilihan2 == 1) {
                  System.out.print("berapa jumlah data yang ingin di input: ");
                  int jumlah1 = in.nextInt();

                  for (int i = 1; i <= jumlah1; i++) {
                    System.out.print("Data ke-" + i + " :");
                    aList.add(in.next());
                  }
                } else if (pilihan2 == 2) {
                  System.out.print("masukan index yang ingin di hapus: ");
                  int hapus = in.nextInt();
                  aList.remove(hapus);
                  System.out.println("Data Terbaru: " + aList);
                } else if (pilihan2 == 3) {
                  System.out.println("Data Terbaru: " + aList);
                } else
                  System.out.println("periksa kembali inputan");
                run2 = false;
              }

            } else if (pilihann == 2) {
              boolean run3 = true;

              while (run3) {
                System.out.print("1. Menambahkan\n2. Menghapus\napa yang anda pilih: ");
                int pilihan3 = in.nextInt();

                if (pilihan3 == 1) {
                  System.out.print("berapa jumlah data yang ingin di input: ");
                  int jumlah1 = in.nextInt();

                  for (int i = 1; i <= jumlah1; i++) {
                    System.out.print("Data ke-" + i + " :");
                    tSet.add(in.next());
                  }
                } else
                  System.out.println("periksa kembali inputan");
                run3 = false;
              }
            } else if (pilihan == 3) {
              System.out.println("anda keluar dari program");
              run = false;
            } else
              System.out.println("periksa kembali pilihan");
          }
          // Menu Program Collections
          Collections.sort(null);
          break;
        case 2:
          // kode untuk menu Linked List
          LinkedList<String> exampleLL = new LinkedList<>();
          Stack<String> data = new Stack<>();
          boolean runn = true;

          while (runn) {
            System.out.println("=====================================================");
            System.out.print(
                "1. push\n" +
                    "2. pop\n" +
                    "3. peek\n" +
                    "4. print\n" +
                    "5. close program\n" +
                    "choose: ");
            int choosenCase = input.nextInt();

            switch (choosenCase) {
              case 1:
                System.out.print("jumlah data yang akan dimasukkan kedalam stack: ");
                int jumlahData = input.nextInt();
                System.out.println("======================================================");
                System.out.println("!!! STRING ONLY!!!");

                for (int i = 1; i <= jumlahData; i++) {
                  System.out.print("input data ke-" + i + " : ");
                  data.push(input.next());
                }
                break;
              case 2:
                System.out.println("u will remove the top of stack ");
                System.out.println("======================================================");
                String remove = data.pop();
                System.out.println(remove + " removed");
                break;
              case 3:
                System.out.println("see the top of stack");
                System.out.println("======================================================");
                String seeTop = data.peek();
                System.out.println("top element: " + seeTop);
                break;
              case 4:
                System.out.println("printing stack");
                System.out.println("======================================================");
                System.out.println("Data: " + data);
                break;
              case 5:
                System.out.println("exiting program ..");
                runn = false;
                break;
              default:
                break;
            }
          }
          break;
        case 3:
          // kode untuk menu Hash
          HashMap<String, Integer> exampleHM = new HashMap<>();
          exampleHM.put(null, null);
          exampleHM.get(exampleHM);
          break;
        case 4:
          // kode untuk menu Binary Search Tree
          BT bt = new BT();
          System.out.println("Binary Tree Test");
          char ch;
          do {
            System.out.println("\n OPSI MENU \n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.print("ur choice: ");
            int choice = input.nextInt();
            System.out.println("===============================");
            switch (choice) {
              case 1:
                System.out.print("insert nama mahasiswa: ");
                bt.insert(input.next());
                break;
              case 2:
                System.out.println("search nama mahasiswa: ");
                System.out.println("search result : " + bt.search(input.next()));
                break;
              case 3:
                System.out.println("nodes = " + bt.countNodes());
                break;
              case 4:
                System.out.println("empty status = " + bt.isEmpty());
                break;
              default:
                System.out.println("wrong Entry \n ");
                break;
            }
            System.out.println("===============================");
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = input.next().charAt(0);
          } while (ch == 'Y' || ch == 'y');
          break;
        case 5:
          // kode untuk menu Graph
          Graph ourGraph = new Graph();

          // vertices
          Vertex v0 = new Vertex("0");
          Vertex v1 = new Vertex("1");
          Vertex v2 = new Vertex("2");
          Vertex v3 = new Vertex("3");

          ourGraph.AddVertex(v0);
          ourGraph.AddVertex(v1);
          ourGraph.AddVertex(v2);
          ourGraph.AddVertex(v3);

          // edges
          ourGraph.AddEdge(v0, v1, 2);
          ourGraph.AddEdge(v1, v2, 3);
          ourGraph.AddEdge(v2, v0, 1);
          ourGraph.AddEdge(v2, v3, 1);
          ourGraph.AddEdge(v3, v2, 4);

          ourGraph.printGraph();
          break;
        case 6:
          // kode untuk keluar dari program
          break;
        default:
          System.out.println("Pilihan tidak valid!");
          break;
      }
    } while (pilihan != 6);
  }
}

// NODE BINARY SEARCH TREE
class BTNode {
  BTNode left, right;
  String data;

  // Constructor
  public BTNode() {
    left = null;
    right = null;
    data = null;
  }

  public BTNode(String n) {
    left = null;
    right = null;
    data = n;
  }

  // Function to set left n right mode
  public void setLeft(BTNode n) {
    left = n;
  }

  public void setRight(BTNode n) {
    right = n;
  }

  // Function to get left n right mode
  public BTNode getLeft() {
    return left;
  }

  public BTNode getRight() {
    return right;
  }

  public void setData(String d) {
    data = d;
  }

  public String getData() {
    return data;
  }
}

class BT {
  private BTNode root;

  public BT() {
    root = null;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(String data) {
    root = insert(root, data);
  }

  private BTNode insert(BTNode node, String data) {
    if (node == null) {
      node = new BTNode(data);
    } else {
      if (node.getRight() == null) {
        node.right = insert(node.right, data);
      } else {
        node.left = insert(node.left, data);
      }
    }
    return node;
  }

  public int countNodes() {
    return countNodes(root);
  }

  private int countNodes(BTNode r) {
    if (r == null) {
      return 0;
    } else {
      int l = 1;
      l += countNodes(r.getLeft());
      l += countNodes(r.getRight());
      return l;
    }
  }

  public boolean search(String val) {
    return search(root, val);
  }

  public boolean search(BTNode r, String val) {
    if (r.getData() == val)
      return true;
    if (r.getLeft() != null)
      if (search(r.getLeft(), val))
        return true;
    if (r.getRight() != null)
      if (search(r.getRight(), val))
        return true;
    return false;
  }

  public void inorder() {
    inorder(root);
  }

  private void inorder(BTNode r) {
    if (r != null) {
      inorder(r.getLeft());
      System.out.print(r.getData() + " ");
      inorder(r.getRight());
    }
  }

  public void preorder() {
    preorder(root);
  }

  private void preorder(BTNode r) {
    if (r != null) {
      System.out.print(r.getData() + " ");
      preorder(r.getLeft());
      preorder(r.getRight());
    }
  }

  public void postorder() {
    postorder(root);
  }

  private void postorder(BTNode r) {
    if (r != null) {
      postorder(r.getLeft());
      postorder(r.getRight());
      System.out.print(r.getData() + " ");
    }
  }
}
