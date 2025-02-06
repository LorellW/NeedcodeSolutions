package linkedList

class MergeTwoSortedLinkedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val head = ListNode(0)
        var node:ListNode? = head
        var current1 = list1
        var current2 = list2
        while (current1 != null && current2 != null) {
            node?.next = if (current1.value < current2.value){
                current1 = current1.next
                current1
            }else{
                current2 = current2.next
                current2
            }
            node = node?.next
        }

        node?.next = current1 ?: current2
        return head
    }
}