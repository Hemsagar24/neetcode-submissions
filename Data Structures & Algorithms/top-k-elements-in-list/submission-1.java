class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    // Step 1: Count frequencies
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Min Heap ordered by frequency
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(
        (a, b) -> a[1] - b[1]  // compare by frequency
    );

    // Step 3: Push and maintain size k
    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
        if (minHeap.size() > k) {
            minHeap.poll();  // remove least frequent
        }
    }

    // Step 4: Build result from heap
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = minHeap.poll()[0];  // extract number, not frequency
    }

    return result;
}
}
