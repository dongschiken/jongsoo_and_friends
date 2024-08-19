package sweaD5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution1248_공통조상 {
	static Node[] nodes;
	static int subtreeSize = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int V = sc.nextInt(); // 정점 개수
			int E = sc.nextInt(); // 간선 개수
			int A = sc.nextInt();
			int B = sc.nextInt();

			nodes = new Node[V + 1];
			for (int i = 1; i <= V; i++)
				nodes[i] = new Node(i);

			// 트리 입력
			for (int i = 0; i < E; i++)
				nodes[sc.nextInt()].addNode(nodes[sc.nextInt()]);

			Node commonParents = findCommon(nodes[A], nodes[B]);
			
			subtreeSize = 0;
			countSize(commonParents);
			
			System.out.println("#" + t + " " + commonParents.value + " "+ subtreeSize);

		}

	}

	private static Node findCommon(Node A, Node B) {
		Set<Node> parents = new HashSet<>();

		while (A != null) {
			parents.add(A);
			A = A.parent;
		}

		while (B != null) {
			if (parents.contains(B)) {
				return B;
			}
			B = B.parent;
		}
		return null;

	}

	private static void countSize(Node node) {
		if (node == null) {
			return;
		}
		
		subtreeSize++;
		countSize(node.left);
		countSize(node.right);
	}

}

// class Node {
//	int value;
//	Node parent;
//	Node right;
//	Node left;
//
//	Node(int value) {
//		this.value = value;
//		this.parent = null;
//		this.right = null;
//		this.left = null;
//	}
//
//	void addChild(Node child) {
//		child.parent = this;
//		if (this.left == null) {
//			this.left = child;
//		} else {
//			this.right = child;
//		}
//	}
//}