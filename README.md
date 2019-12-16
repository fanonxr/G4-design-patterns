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
 Definition: "provides an interface for creating families of related or dependent objects without specifying their concrete classes"
 
 #### What problem does it address?
 * same as factory method, but we need to create a set of objects instead of just one.
 
 #### What is the solution?
 Create an abstract factory class that is responsible for creating a set of objects that are needed together
 
 #### Benefits 
 * Encapsulates the responsibility of creating a set of objects
 * Concrete factory appears only once in the code 
 * easily able to modify the use of the factory
 
 #### negatives
 * adding new objects to create may require the change of the abstract factory class 
 and all of its subclasses.
 
 # adapter Pattern
 Definition: a wrapper pattern that allows the interface of an existing class to be used as another interface.
 lets classes work together that couldn't otherwise because of incompatible interfaces. 
 
 #### Problem adapter addresses
 When there are incompatible interfaces between types of class so we have to bridge/connect them by creating an adapter interface
 
 #### Solution 
 adapter classes converts the interface of one class into a new adapter interface that the clients expect to have
 
 #### Benefits
 * lets a single adpater interface work with many Adaptee classes/interfaces
 * the adapter class can add functionality to the adaptee classes all at once
 
 #### Negatives
 * The adapter refers to the subclass rather than the interface itself
 * referring to the interface would be more flexible
 
 #### similar patterns
 * Decorator -> an example of a wrapper pattern
 * proxy -> a layer of giving access to the object
 
 # Decorator 
 Definition: "Attaches additional responsibilites to an object dynamically at runtime."
 
 #### What problem does decorator address?
 We want to send information to an object without having to rewrite that objects
 functionality when handling that situation. We want to add the behavior to the object but not the entire class of the object.
 
 #### what is the solution
 Wrapping those objects in a decorator class at runtime
 
 #### benefits
 * better way instead of using inheritance
 
 #### negatives
 * Decorator class and the the class that are being wrapped are not identical. 
 * Copious amounts of smaller classes are created. 
 
 # Singleton
  Definition: "Creational design pattern that ensures a class has only one instances and provides global access to it."
  
  #### The problem it address
  We want to create an instance of that class once, and refer to that instance throughout the application
  
  #### solution
  Make the constructor of the class private and return a the value from the getter for that class instance
  
  #### benefits
  * Controlled access to the same instance
  * Avoid dubious amounts of code
  * Singleton can be sub-classed
  
  #### negatives
  * restricts to n amount of objects to be create
  * Restricting object creation is not a good practice
  
  # Command Pattern
  Definition: “Encapsulate a request as an object, thereby
              letting you parameterize clients with different
              requests, queue or log requests, and support
              undo-able operations.”
  
  #### Problem command pattern is addressing
  * Need to issue requests to objects without knowing anything about the operation being requested or the receiver of the request.
  * You want to encapsulate groups of commands that
    control certain functionalities/behaviors together so
    that all of the details about sequence of commands
    are hidden from the client-side by encapsulating
    method invocation. 
  
  #### Solution
  definition. Encapsulate the request as an object in order to hide the behaivor of the request from the client.
  Supports different types of request and undo operations.
  
  #### Benefits
  * Flexible enough to add new commands to be executed
  * Decouples the invoker from the execution method
  * Easy to transport Commands
  
  #### Negatives
  * an large of amount of classes and objects can be created 
  * if implemented incorrectly, simple becomes an Facade implementation
