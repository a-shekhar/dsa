# Graphs

## Representation

A graph has vertices V and edges E; edges can be directed or undirected, weighted or unweighted. An adjacency list stores neighbors in O(V + E) space and supports O(V + E) full traversal. An adjacency matrix uses O(V²) space, provides constant-time edge lookup, and scanning all neighbors costs O(V). Clarify self-loops, duplicate edges and disconnected components. For an undirected adjacency list, insert each edge in both directions.

## BFS and DFS

BFS uses a queue and discovers nodes in layers. For edges `A-B`, `A-C`, `B-D`, starting at A gives distances A=0, B=1, C=1, D=2. Mark nodes visited when enqueuing so the same node is not repeatedly queued; record a parent if you need to reconstruct a path. BFS finds the fewest-edge path in an unweighted graph. DFS uses recursion or an explicit stack and explores one branch before backtracking. Both take O(V + E) time with adjacency lists and O(V) visited space; DFS recursion can use O(V) stack. To cover disconnected graphs, start a traversal from each still-unvisited vertex.

## Ordering and shortest paths

For a directed graph, topological order exists only when it has no directed cycle. Kahn's algorithm queues zero-indegree vertices, removes their outgoing edges, and checks whether all V vertices were processed. O(V + E). DFS can also detect cycles using states for unvisited, active and finished vertices.

Dijkstra uses a min-priority queue for nonnegative weights; with an adjacency list and heap, a common lazy implementation costs O((V + E) log V) for a simple graph. Skip stale queue entries; negative edges invalidate its guarantee. Bellman–Ford relaxes all edges up to V−1 times and can detect a reachable negative cycle with one more pass: O(VE). A reachable negative cycle prevents a finite shortest path to vertices affected by it.

## Connectivity and spanning trees

Disjoint-set union tracks connected components using `find` and `union`. Path compression plus union by rank/size gives amortized O(α(V)) per operation. Kruskal sorts edges by weight and unions endpoints that are not already connected, producing a minimum spanning forest for an undirected graph; it is a spanning tree only if the graph is connected. Sorting costs O(E log E).

Practice grid flood fill, connected components, unweighted shortest path, course dependency ordering, Dijkstra on a small weighted graph and union-find. Test disconnected nodes, cycles, a single vertex, unreachable targets and invalid assumptions about direction.
