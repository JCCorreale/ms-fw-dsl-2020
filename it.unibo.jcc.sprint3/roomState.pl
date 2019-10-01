%
% fridgeContent.pl
%

at(butler, home).

at(dishes, pantry).
%% fridge content updated at startup and by observing fridge resurce
%% at(frige, pizza). %% even multiple items!

listContentsAt(Location, ListOut) :- 
	findall(Item, at(Item, Location), List),
	delete(butler, List, ListOut).

count(P,Count) :-
        findall(1,P,L),
        length(L,Count).

showContent :- 
	output("ROOM CONTENT ---------- "),
	showContents,
	output("--------------------------").
		
showContents:- 
 	at( ITEM, LOCATION ),
 	output( at( ITEM, LOCATION ) ),
	fail.
showContents.

output( M ) :- stdout <- println( M ).