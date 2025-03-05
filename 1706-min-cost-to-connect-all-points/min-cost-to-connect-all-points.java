class Solution {

    class DSU {
        int[][] parent;
        int[][] rank;
        int n;

        public DSU(int n) {
            this.n = n;
            this.parent = new int[n][n];
            this.rank = new int[n][n];
            for (int node = 0; node < n; node++) {
                this.parent[node][node] = node;
                this.rank[node][node] = 1;
            }
        }

        public int find(int node) {
            if (parent[node][node] == node) {
                return node;
            }

            int parentLevelComponent = find(parent[node][node]);
            // Path compression
            parent[node][node] = parentLevelComponent;
            return parentLevelComponent;
        }

        public void union(int node1, int node2) {
            int parentOfNode1 = find(node1);
            int parentOfNode2 = find(node2);
             
            if (parentOfNode1 == parentOfNode2) return;

            if (rank[parentOfNode1][parentOfNode1] > rank[parentOfNode2][parentOfNode2]) {
                 parent[parentOfNode2][parentOfNode2] = parentOfNode1;
                 rank[parentOfNode2][parentOfNode2] += rank[parentOfNode1][parentOfNode1];
            } else {
                parent[parentOfNode1][parentOfNode1] = parentOfNode2;
                rank[parentOfNode1][parentOfNode1] += rank[parentOfNode2][parentOfNode2];
            }


        }
    }

    class Edge {
        int source;
        int destination;
        int weight;

        public Edge (int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<Edge> edges = new ArrayList<>();

        for (int point1 = 0; point1 < n; point1++) {
            for (int point2 = point1 + 1; point2 < n; point2++) {
                int xDiff = Math.abs(points[point1][0] - points[point2][0]);
                int yDiff = Math.abs(points[point1][1] - points[point2][1]);
                int currDistance = xDiff + yDiff;
                edges.add(new Edge(point1, point2, currDistance));
            }
        }

        Collections.sort(edges, (obj1, obj2) -> {
            return Integer.compare(obj1.weight, obj2.weight);
        });

        DSU dsu = new DSU(n);
        int remainingEdges = n - 1;
        int mstCost = 0;


        for (Edge edge: edges) {
            // System.out.println(edge.weight);

            int parentOfA = dsu.find(edge.source);
            int parentOfB = dsu.find(edge.destination);

            if (parentOfA == parentOfB) continue;
            // System.out.println("Adding: " + edge.source + " --> " + edge.destination);
            mstCost += edge.weight;
            dsu.union(edge.source, edge.destination);
            remainingEdges--;
            if (remainingEdges == 0)    break;

        }

        return mstCost;
    }
}