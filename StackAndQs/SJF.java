package StackAndQs;

public class SJF {
    // Shortest Job First (SJF) scheduling algorithm
    // This is a simple implementation that assumes jobs are represented by their burst time
    public static void sjfScheduling(int[] burstTimes) {
        int n = burstTimes.length;
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        // Sort burst times in ascending order
        java.util.Arrays.sort(burstTimes);

        // Calculate waiting time
        waitingTime[0] = 0; // first job has no waiting time
        for (int i = 1; i < n; i++) {
            waitingTime[i] = waitingTime[i - 1] + burstTimes[i - 1];
        }

        // Calculate turnaround time
        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = waitingTime[i] + burstTimes[i];
        }

        // Print results
        System.out.println("Job\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + burstTimes[i] + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }
    }

    public static void main(String[] args) {
        int[] burstTimes = {6, 8, 7, 3, 4};
        sjfScheduling(burstTimes);
    }
}
