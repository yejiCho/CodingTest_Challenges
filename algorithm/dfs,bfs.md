# dfs,bfs

## dfs

깊이 우선 탐색(Depth First Search)
정점의 자식들을 먼저 탐색하는 방식

```
한 노드의 자식을 타고 끝까지 순회 한 후 ,
다시 돌아와서 다른 형제들의 자식을 타고 내려가며 순회함
```

```python
graph = dict()

graph['A'] = ['B', 'C']
graph['B'] = ['A', 'D']
graph['C'] = ['A', 'G', 'H', 'I']
graph['D'] = ['B', 'E', 'F']
graph['E'] = ['D']
graph['F'] = ['D']
graph['G'] = ['C']
graph['H'] = ['C']
graph['I'] = ['C', 'J']
graph['J'] = ['I']
```

- dfs 구현

```
자료구조 스택과 큐를 활용함
need_visit 스택과 visited큐, 두개의 자료구조를 생성

bfs자료구조는 두 개의 큐를 활용하는데 반해,
dfs는 스택과 큐를 활용한다는 차이가 있음
```

```python

def dfs(graph, start_node):
    visited, need_visit = list(), list()
    need_visit.append(start_node)

    while need_visit:
        node = need_visit.pop()
        if node not in visited:
            visited.append(node)
            need_visit.extend(graph[node])
    return visited

dfs(graph,'A')
```

![dfs](https://github.com/yejiCho/Programmers_Challenges/blob/master/image/dfs.png)

## bfs

너비 우선 탐색(breadth first search):
정점들과 같은 레벨에 있는 노드들 (형제 노드들)을 먼저 탐색

```python

def bfs(graph, start_node):
    visited,need_visit = list(),list()

    need_visit.append(start_node)

    while need_visit:
        node = need_visit.pop(0)
        if node not in visited:
            visited.append(node)
            need_visit.extend(graph[node])

    return visited

bfs(graph, 'A')

```
![bfs](https://github.com/yejiCho/Programmers_Challenges/blob/master/image/bfs.png)

- [dfs,bfs](https://www.fun-coding.org/Chapter18-bfs-live.html)