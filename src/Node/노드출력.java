package Node;

public class 노드출력 {
    public static void main(String[] args) {
        일반노드출력();
        }
    public static void 일반노드출력(){
        System.out.println("=========일반 노드 START =========");
        // 노드 생성
        노드구현 node1 = new 노드구현(1);
        노드구현 node2 = new 노드구현(2);
        노드구현 node3 = new 노드구현(3);

        // 연결
        node1.next = node2;
        node2.next = node3;

        // 순회 출력
        노드구현 current = node1;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println("=========일반 노드 END =========");
    }

}
