class evalu{
	public static double eval(final String str) {
	 return new Object() {
	 int pos = -1, ch;
	 private void nextChar() {
	     ch = (++pos < str.length()) ? str.charAt(pos) : -1;
	 }
	 private boolean eat(int charToEat) {
	     while (ch == ' ') nextChar();
		 if (ch == charToEat) {
		     nextChar();
		     return true;
		 }
	     return false;
	 }

	 private double parse() {
	     nextChar();
	     double x = parseExpression();
	     if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
		 return x;
	 }

	 private double parseExpression() {
	     double x = parseTerm();
	     for (;;) {
		 if (eat('+')) x += parseTerm(); // addition
		 else if (eat('-')) x -= parseTerm(); // subtraction
		 else return x;
	     }
	 }

	 double parseTerm() {
	     double x = parseAnother();
	     for (;;) {
		 if (eat('*')) x *= parseAnother(); // multiplication
		 else if (eat('/')) x /= parseAnother(); // division
		 else return x;
	     }
	 }

	 double parseAnother() {
	     double x = parseFactor();
	     for (;;) {
		 if (eat('^')) x = Math.pow(x, parseFactor());
		 else if(eat('!')) x = fac((long)x);
		 else return x;
	     }
	 }

	 private double fac(long k){
	     if(k ==0)return 1;
		 long mul = 1;
	     for(long l=1;l<=k;l++)mul*=l;
		 return mul;
	 }

	 double parseFactor() {
	     if (eat('+')) return parseFactor(); // unary plus
	     if (eat('-')) return -parseFactor(); // unary minus

	     double x;
	     int startPos = this.pos;
	     if (eat('(')) { // parentheses
		 x = parseExpression();
		 eat(')');
	     }
	     else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
		 while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
		 x = Double.parseDouble(str.substring(startPos, this.pos));
	     }
	     else if (ch >= 'a' && ch <= 'z') { // functions
		 while (ch >= 'a' && ch <= 'z') nextChar();
		 String func = str.substring(startPos, this.pos);
		 x = parseFactor();
		 if (func.equals("sqrt")) x = Math.sqrt(x);
		 else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
		 else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
		 else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
		 else if (func.equals("asin")) x=Math.asin(x);
		 else if (func.equals("acos")) x=Math.acos(x);
		 else if (func.equals("atan")) x=Math.atan(x);
		 else if (func.equals("sinh")) x=Math.sinh(x);
		 else if (func.equals("cosh")) x=Math.cosh(x);
		 else if (func.equals("tanh")) x=Math.tanh(x);
		 else if(func.equals("logten"))x= Math.log(x)/Math.log(10);
		 else if(func.equals("log")) x= Math.log(x);
		 else throw new RuntimeException("Unknown function: " + func);
	     }
	     else {
		 throw new RuntimeException("Unexpected: " + (char)ch);
	     }
	     return x;
	 }
	 }.parse();
 }}
