class TaskManager {
    Map<Integer, Integer> taskUser;
    Map<Integer, Integer> taskPrior;
    TreeSet<int[]> pq;

    public TaskManager(List<List<Integer>> tasks) {
        taskUser = new HashMap<>();
        taskPrior = new HashMap<>();
        pq = new TreeSet<>((a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            return b[1] - a[1]; 
        });

        for(int i=0; i<tasks.size(); i++){
            int user = tasks.get(i).get(0);
            int task = tasks.get(i).get(1);
            int priority = tasks.get(i).get(2);
            pq.add(new int[]{priority, task});
            taskUser.put(task, user);
            taskPrior.put(task, priority);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        taskUser.put(taskId, userId);
        taskPrior.put(taskId, priority);
        pq.add(new int[]{priority, taskId});
    }
    
    public void edit(int taskId, int newPriority) {
        int oldPriority = taskPrior.get(taskId);
        pq.remove(new int[]{oldPriority, taskId});
        taskPrior.put(taskId, newPriority);
        pq.add(new int[]{newPriority, taskId}); 
    }
    
    public void rmv(int taskId) {
        int priority = taskPrior.get(taskId);
        taskUser.remove(taskId);
        taskPrior.remove(taskId);
        pq.remove(new int[]{priority, taskId});
    }
    
    public int execTop() {
        // int high=-1;
        // int task=-1;
        // for(Map.Entry<Integer,Integer> entry:taskPrior.entrySet()){
        //     int taskId = entry.getKey();
        //     int priority = entry.getValue();
        //         if(priority>high || (priority==high && taskId>task)){
        //         high=priority;
        //         task=taskId;
        //     }
        // }
        // if(task>=0){
        //     int user= taskUser.get(task);
        //     taskUser.remove(task);
        //     taskPrior.remove(task);
        //     return user;
        // }
        // return -1;
        //GIVES TLE^^^^

        if (pq.isEmpty()) return -1;
        int[] top = pq.pollFirst(); 
        int taskId = top[1];
        int userId = taskUser.get(taskId);
        taskUser.remove(taskId);
        taskPrior.remove(taskId);
        return userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */