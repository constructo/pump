Pump is a modern take on the dataflow programming paradigm. A Pump program is rendered to a directed graph that determines how the data will be routed through the connected operators; thus Pump totally forsakes both imperativity and sequentiality thus enabling a more intuitive and friendlier type of programming. 

Highlights:
- Pump itself is the textual scripting language compiled to a directed graph that PumpVM executes; so that visual dataflow nocode tools could be created for the PumpVM.
- Continuation interrupts allows Pump to create domain specific abstraction layers over asynchronous flows. 
- Sandboxing capabilities are part of the design; no tight-coupling to system calls and the ability to restrict execution opens the possibility of online development environments.

Roadmap:
- Prototypal Java Pump compiler and PumpVM.
- Language spec (why not first? there is going to be some corner-rounding during the prototype development.
- PumpWeb: abstraction layer on websockets to develop dataflow-based backends.
