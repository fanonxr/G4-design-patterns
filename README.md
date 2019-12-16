# Design Patterns
This repo covers simple examples of the 14 design patterns from the "Head First Design Pattern" book.
Each design pattern is separated into their own package.

The design patterns:

# Strategy Pattern
Definition: "a behavioral software design pattern that enables selecting an algorithm at runtime. 
Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use."

#### What problem strategy pattern addresses? 
When we have objects that are very similar, but vary in behavior. We need to change the behavior of these objects at runtime.

#### What is the solution ? 
Delegate the implementation of an algorithm to another java interface, this way each object can have its own implementation of an algorithm.
"The strategy pattern is useful for situations where it is necessary to dynamically swap the algorithms 
used in an application. The strategy pattern is intended to provide a means to 
define a family of algorithms, encapsulate each one as an object, 
and make them interchangeable. The strategy pattern lets the algorithms vary independently 
from clients that use them."

#### Advantages
* reusable family of related algorithms, preventing sub-classing or inheritance 
* no need for if - else conditions due to the interface type handling 

#### Disadvantages 
* The strategy interface is shared among all strategies where information is passed
* increased amount of objects created

#### Similar too
* Decorator -> adds functionality at runtime
* State -> changes the type of behavior changes depending on the state

# Observer Pattern
Definition: "The observer pattern defines a 1 to many dependency between objects, so that when 1 object changes state
all of its dependencies are notified and updated automatically."

#### What is the problem the observer address?
 When we need to send out information to objects every time the state of the central subject changes
 * a one to many dependency between objects should be defined without making the objects tightly coupled
 * it should be ensured that when one object changes state an open-ended number of depended objects are updated automatically
 * Possible to have one object notify an open-ended number of other objects
 
 #### What is the solution
 * When there is a change in state, we push out an update to all the objects that are subscribed to the central systems. 
 * Push vs Poll
 
 #### Benefits
 * Subjects/Observables and Observers can be modified independently.
 * Subjects don't know what type of observer it is communicating with 
 
 #### Negatives
 * unnecessary information can be sent out to observers
 * increased execution from observables to observers
 
 #### similar patterns
 * mediator -> sends information between other objects 
 
 # Factory Method
 Definition: "a creational pattern that uses factoryMethod methods to deal with the 
 problem of creating objects without having to specify the exact class of the object that will be created."
 
 #### What problem does Factory method address?
 We need need to create an object at runtime based on a set of conditions without have to hard code that object
 
 #### What is the solution?
 Create a factoryMethod class that is responsible for creating the object depending on the certain conditions
 that are required for each object
 
 #### Benefits 
 * Very flexible, code is more robust, less coupled, and easier to extend
 * The object doesn't need to know how to create itself
 
 #### Negatives 
 
 # Abstract Factory
 Definition: 
