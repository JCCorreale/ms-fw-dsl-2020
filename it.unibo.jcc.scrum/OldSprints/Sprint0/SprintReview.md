The model in sprint0.qak represents an initial prototype of an "agent"
capable of suspending and resuming the execution of a plan as
specified by means of appropriate commands. As such, the delivered
artifact can serve as a basis on top on which the PREPARE, ADD FOOD
and CLEAR requirements can be implemented, by also fulfilling the
STOP/REACTIVATE requirements.

There is no explicit support for REACTIVENESS (i.e. the AVOID
requirement in particular). A way to implement it could be
the use of an external ACTOR that reacts to some EVENT of
the agent (s.a. "stepFail"). But this invalidate the
autonomous "nature" of the agent.