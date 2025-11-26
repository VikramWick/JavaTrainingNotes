Thread is a light weight process (instruction ready to work)

Threads execute concurrently or parallely

Thread lifecycle is new-> ready-> execute -> wait/terminate

Stopping a thread in wait state and switching to another thread happens in context switching.

The Context switching in java are sleep, wait, notify or any I/O, notify all 

In java threads are created in two ways extending a thread super class, implementing runnable interface if there is a return type then go for callable interface.

subscribe and feature in java

In a thread we have to override run method, A thread begins if the run method starts

If thread access data or access a method then data and method should be synchronized. We can't use arrayList bur we can use vectors inj threads.

If there is no context Switching by default it adopts round robbin technique.

In java the priority is from 0 to 10 it is not considered during execution.

When one thread calls another thread there is a possibility 

Question:
Write a program for Sorting algorithms
