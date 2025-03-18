package dfs;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class 이진트리순회_DFS {

    static Node root; // 루트 노드를 담은 변수

    // 전위 순회(Preoreder): 루트 -> 왼쪽 -> 오른쪽
    public static void preorderDFS(Node node) {
        if (node == null) return;
        System.out.print(node.data + " "); // 나의 데이터 출력
        preorderDFS(node.lt); // 왼쪽 자식부터 탐색
        preorderDFS(node.rt); // 그다음 오른쪽 자식 탐색
    }

    // 중위 순회(Inoreder): 왼쪽 -> 루트 -> 오른쪽
    public static void inorderDFS(Node node) {
        if (node == null) return;
        inorderDFS(node.lt); // 왼쪽 자식부터 탐색
        System.out.print(node.data + " "); // 나의 데이터 출력
        inorderDFS(node.rt); // 그다음 오른쪽 자식 탐색
    }

    // 후위 순회(Postoreder): 왼쪽 -> 오른쪽 -> 루트
    public static void postorderDFS(Node node) {
        if (node == null) return;
        postorderDFS(node.lt); // 왼쪽 자식부터 탐색
        postorderDFS(node.rt); // 그다음 오른쪽 자식 탐색
        System.out.print(node.data + " "); // 나의 데이터 출력
    }

    public static void main(String[] args) {

        /*
            트리 모양:
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        // 트리 구성
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        System.out.print("전위 순회 결과: ");
        preorderDFS(root);

        System.out.print("\n중위 순회 결과: ");
        inorderDFS(root);

        System.out.print("\n후위 순회 결과: ");
        postorderDFS(root);

    }

}
