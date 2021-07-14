# Intro

This project includes my implementations of the following design patterns
* Singleton (eager + lazy instantiation)
* Command
* Factory

## Singleton (creational pattern)
Ensures a single instance of a class, accessible globally (e.g. a single DB object, shared by different parts of the app).
It helps us to:
* control access to shared resources
* access an object from anywhere in the app, minus the risk of being overridden

Implementation idea: 
* lazy: client calls to getInstance. If the instance is null -> a new instance is created and returned.
* eager: a static instance is created and returned upon a client's call.

## Command (behavioural pattern)
Turns a request into an object, containing all the info. Requests can then be queued or passed into methods.
Using commands minimises code duplication for operations. Request details should be extracted into a command class,
with a single method to trigger all the operation.

Implementation idea: all commands should implement the same interface (single execution method without parameters).

## Factory method (creational pattern)
Provides an interface for object creation (super-class), allowing sub-classes to alter the created object types, by 
calling to the factory method. The factory replaces direct object construction calls, and rather creates a new instance 
of the chosen product (defined by a switch statement), upon demand.

Implementation idea: the generic class is an interface, containing the creation method. Concrete classes override the 
creation method. A factory class defines which concrete class is 'activated'. An object is instantiated using an input 
for the factory to decide which one to build, referencing the generic interface type.

#TBD

## Builder (creational pattern)
Constructs complex objects step by step, allowing producing different types of an object, reusing thee construction code.

## Abstract factory
Creates objects that follow a general pattern