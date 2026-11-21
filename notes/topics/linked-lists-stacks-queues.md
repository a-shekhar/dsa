# Linked lists, stacks and queues

## Linked lists

A singly linked node points to the next node. A doubly linked node also points to the previous one. In a circular list the tail points back to the head; a traversal must stop when it reaches the head again, rather than waiting for null. Access by index or searching costs O(n); insertion immediately after a known node is O(1). Deletion may require the predecessor, whose search can cost O(n). A tail pointer makes append O(1) for a maintained singly linked list.

Maintain invariants: an empty list has no head; a nonempty linear list has a null tail successor; head and tail agree for a one-node list. For a doubly linked list update both directions on every insertion/deletion. For circular lists decide how the empty and one-node cases are represented. Track size if constant-time size queries are required.

### Reversal dry run

For `1 -> 2 -> 3 -> null`, maintain `previous = null` and `current = head`. Save `next = current.next`, point `current.next` at `previous`, then advance both pointers. After one step `1 -> null` is reversed and `current` is 2; after three steps `previous` is the new head 3. Time O(n), auxiliary space O(1). Update the tail if your list stores one. Handle null and one node.

Fast/slow pointers can find a middle node or detect a cycle. For cycle detection, compare pointers after moving slow one step and fast two steps while `fast` and `fast.next` exist. In a linear list fast reaches null; in a cycle the pointers eventually meet. Specify which middle is returned for even lengths.

## Stacks

A stack is last-in-first-out: push, peek and pop at one end. `Deque<Integer> stack = new ArrayDeque<>();` supports `push`, `peek`, `pop`. For brackets, push opening symbols; a closing symbol must match the most recent opening symbol. At the end the stack must be empty. Each symbol is processed once: O(n) time, O(n) worst-case space. Check a closing bracket when the stack is empty.

## Queues and deques

A queue is first-in-first-out. With `Deque<Integer> q = new ArrayDeque<>();`, use `addLast` and `removeFirst`, or `offer` and `poll` with their documented empty behavior. BFS uses a queue to process earlier discoveries first. A deque allows operations at both ends and supports sliding-window extrema with a monotonic deque. `ArrayDeque` disallows null.

## Practice

Implement singly, doubly and circular lists; reverse a list; find a cycle and middle; validate brackets; implement a queue with stacks; find next greater values. Test empty, singleton, duplicate, cycle and boundary conditions. See [linked-list problems](../../problems/linked-lists/README.md).
