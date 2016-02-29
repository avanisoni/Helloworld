README:

- Design approach : 

I have taken elevator controller approach to solve this problem. 

There are challenges to keep shared state in controller and ensure that there are no synchronizaton issues with this approach.

I also believe that we could solve this problem using "Message Passing Approach using Akka framework" but I'm not well versed in using Akka framework so decided to go with shared state approach.

- ElevatorSimulator is the main class which uses ThreadPool to start elevators