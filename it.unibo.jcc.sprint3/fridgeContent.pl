%
% fridgeContent.pl
%

content(pizza).
content(salmon).
content(caviar).
content(pasta).

count(P,Count) :-
        findall(1,P,L),
        length(L,Count).

showFridgeContent :- 
	output("FRIDGE CONTENT ---------- "),
	showContents,
	output("--------------------------").
		
showContents:- 
 	content( FOOD ),
 	output( content( FOOD ) ),
	fail.
showContents.

output( M ) :- stdout <- println( M ).