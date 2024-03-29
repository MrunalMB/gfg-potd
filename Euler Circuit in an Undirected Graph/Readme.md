# Eulerian Circuit Existence in a Graph

## Problem Statement
Given a graph represented by an adjacency list, determine whether an Eulerian circuit exists in the graph. An Eulerian circuit is a path in a graph that visits every edge exactly once and starts and ends on the same vertex.

## Example 1:

Input: 
v = 4 ,
edges[] = {{0, 1}, 
           {0, 2}, 
           {1, 3}, 
           {2, 3}}<br>
Output: <br>
1<br>
Explanation: corresponding adjacency list will be {{1, 2},{0, 3},{0, 3},{1, 2}} <br>
One of the Eularian circuit  <br>
starting from vertex 0 is as follows: <br>
0->1->3->2->0 <br>

## Example 2:

Input: 
v = 3
edges[] = {{0, 1}, 
         {0, 2}}<br>
Output: <br>
0<br>
Explanation: corresponding adjacency list will be {{1, 2}} <br>
No Eulerian path is found. <br>

## Algorithm:

The code iterates through each ArrayList in the adj list. Each inner ArrayList represents the neighbors of a particular vertex.
For each inner ArrayList, it checks if the size of that ArrayList (the number of adjacent vertices) is odd. If it's odd, it means that there's an odd number of edges incident to that vertex. In an Eulerian circuit, every vertex must have an even degree (number of incident edges), otherwise, it wouldn't be possible to traverse every edge exactly once and return to the starting vertex.
If it finds any vertex with an odd degree, the method immediately returns false, indicating that an Eulerian circuit does not exist.
If no vertex with an odd degree is found, it returns true, indicating that an Eulerian circuit exists (though it does not explicitly check if the graph is connected).
## Approach
The approach is to iterate through each vertex in the graph's adjacency list. For each vertex, check if the number of adjacent vertices (degree of the vertex) is even. If any vertex is found with an odd degree, it indicates that an Eulerian circuit cannot exist because such a circuit requires every vertex to have an even degree.

1. Iterate through each ArrayList in the adjacency list.
2. For each inner ArrayList representing the neighbors of a vertex:
   - Check if the size of the ArrayList (number of adjacent vertices) is odd.
   - If odd, return `false` as an Eulerian circuit cannot exist.
3. If no vertex with an odd degree is found, return `true` indicating the existence of an Eulerian circuit.

## Time Complexity
The time complexity of the solution is O(V), where V is the number of vertices in the graph. This is because the algorithm iterates through each vertex in the adjacency list once, checking its degree. Hence, the time complexity is linear in terms of the number of vertices in the graph.

