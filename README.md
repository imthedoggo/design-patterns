# Intro

This project includes my implementations of the following design patterns
*Singleton (eager + lazy instantiation)
*Command

## Singleton (creational pattern)
Ensures a single instance of a class, accessible globally (e.g. a single DB object, shared by different parts of the app).
It helps us to:
*control access to shared resources
*access an object from anywhere in the app, minus the risk of being overridden

Implemetation idea: client calls to getInstance. If the instance is null -> a new instance is created and returned.

## Command (behavioural pattern)
Turns a request into an object, containing all the info. Requests can then be queued or passed into methods.
Using commands minimises code duplication for operations. Request details should be extracted into a command class,
with a single method to trigger all the operation.

Implemetation idea: All commands should implement the same initerface (single execution method without parameters).


###TBD

## Builder (creational pattern)
Constructs complex objects step by step, allowing producing different types of an object, reusing thee construction code.

## Factory method (creational pattern)
Provides an interface for object creation in the super-classs, allowing sub-classes to alter the created object types.
Calls to the factory method replace direct objct construction calls, creating products.# design-patterns
