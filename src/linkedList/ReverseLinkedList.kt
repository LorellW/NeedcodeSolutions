package linkedList

class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        var currentNode = head
        var previuos: ListNode? = null
        while (currentNode != null){
            val tempNode = currentNode.next
            currentNode.next = previuos
            previuos = currentNode
            currentNode = tempNode
        }
        return previuos
    }
}