Pump is a modern take on the dataflow programming paradigm. A Pump program is rendered to a directed graph that determines how the data will be routed through the connected operators; thus Pump totally forsakes both imperativity and sequentiality so that programs behave in a homo-diagramatic way.

Why is it called Pump? its sort of a pun/reference to the PUSH instruction which deals with one single stack/thread of execution while PUMP concurrently routes data through the various flow of a  program in a single tick.

Highlights:
- Null is not a value so there is no such thing as exceptions/errors due to null data. Null is a signal transparent to the programmer and the presence/abscence of data is a semantic part of the hydraulic-like flow mechanics (another reason why its called Pump). Simply put, an expression is not executed if any of its operands is null; yet the mechanisms to handle optional input internally work with the null signal.
- Pump itself is the textual scripting language compiled to a directed graph that PumpVM executes; so that visual dataflow nocode tools could be created for the PumpVM.
- Continuation interrupts allows Pump to create domain specific abstraction layers over asynchronous flows. With this feature a program can be frozen, even serialized/deserialized and resumed when some context data becomes available.
- Embedding/Sandboxing capabilities are part of the design; no tight-coupling to system calls and the ability to restrict execution opens the possibility of online development environments.
- Loose coupling to its core including dependency management so that simulation and testing are seamless.

Roadmap:
- Prototypal Java Pump compiler and PumpVM.
- Language spec (why not first? there is going to be some corner-rounding during the prototype development).
- PumpWeb: abstraction layer on websockets to develop dataflow-based backends.
