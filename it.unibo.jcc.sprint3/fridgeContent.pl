%
% fridgeContent.pl
%

content(pizza).
content(pizza).
content(salmon).
content(caviar).
content(pasta).
content(pasta).

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