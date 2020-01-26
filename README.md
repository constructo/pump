Pump is a programming language borrowing ideas from dataflow, flow-based and reactive programming. Its thus an experiment of totally forsaking imperative and sequential execution of programs.

The first goal is to make a virtual machine that operates on directed graphs (as opposed to stack and sequence of instructions) and build upon it.


In Pump you could write:

```
"hello world" => message
message => print
```
or 

```
message => print
"hello world" => message
```

The potential advantages of this approach go beyond funny esoteric source code ordering and range from spreadsheets like ergonomics to distributed computing.

Both will work because Pump code will be compiled to a graph and not to a sequence of instructions.

We are starting with a Java prototype, the plan with this prototype is to refine the VM so it has an algorhytm-like simplicity; therefore easy to implement in any language.


