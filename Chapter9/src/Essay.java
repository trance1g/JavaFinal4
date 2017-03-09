
public class Essay extends GradedActivity {
private int grammar;
private int spelling;
private int length;
private int content;
/**
 * @return the grammar
 */
public int getGrammar() {
	return grammar;
}
/**
 * @param grammar the grammar to set
 */
public void setGrammar(int grammar) {
	this.grammar = grammar;
}
/**
 * @return the spelling
 */
public int getSpelling() {
	return spelling;
}
/**
 * @param spelling the spelling to set
 */
public void setSpelling(int spelling) {
	this.spelling = spelling;
}
/**
 * @return the length
 */
public int getLength() {
	return length;
}
/**
 * @param length the length to set
 */
public void setLength(int length) {
	this.length = length;
}
/**
 * @return the content
 */
public int getContent() {
	return content;
}
/**
 * @param content the content to set
 */
public void setContent(int content) {
	this.content = content;
}

public double getTotal(){
	double total = grammar + spelling + length + content;
	return total;
}

}
