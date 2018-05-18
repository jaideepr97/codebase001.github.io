digits	[0-9]
alphabets [a-zA-Z]
alphanum  [a-zA-Z0-9]
operator  [-\+\*/=><]
underscore _
left_parentheses [(]
right_parentheses [)]
left_braces [{]
right_braces [}]
semicolon	[;]
%%
{digits}+								 								printf("'%s'\t: Number\n",yytext);
("if"|"else"|"void"|"main"|"include"|"int"|"printf"|"stdio.h")		 	printf("'%s'\t: Keyword\n", yytext);
({alphabets}|underscore){alphanum}*      				 				printf("'%s'\t: Identifier\n",yytext);
{operator}   								 							printf("'%s'\t: Operator\n",yytext);
{left_parentheses}  							 						printf("'%s'\t: Left Parentheses\n",yytext);
{right_parentheses}  							 						printf("'%s'\t: Right Parentheses\n",yytext);
{left_braces}  								 							printf("'%s'\t: Left Braces\n",yytext);
{right_braces}  							 							printf("'%s'\t: Right Braces\n",yytext);
{semicolon}  								 							printf("'%s'\t: Semicolon\n",yytext);
.                        						 						{ /* absorb others */ }
%%
int main(){							
	yylex();
	return 0;
}
