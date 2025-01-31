package binarySearch

import java.util.TreeMap

class TimeBasedKeyValueStore {
    private val map = HashMap<String, TreeMap<Int, String>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.computeIfAbsent(key) { TreeMap() }[timestamp] = value
    }

    fun get(key: String, timestamp: Int): String {
        if (!map.containsKey(key)){
            return ""
        }
        return map[key]!!.floorEntry(timestamp).value ?: ""
    }
}