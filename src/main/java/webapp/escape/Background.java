package webapp.escape;
/*
30	Black
31	Red
32	Green
33	Yellow
34	Blue
35	Magenta
36	Cyan
37	White
 */

public enum Background {
	
	BLACK(40),
	RED (41),
	GREEN (42),
	YELLOW (43),
	BLUE(44),
    MAGENTA(45),
	CYAN(46),
	WHITE(47);
	
	final int value;
	
	private Background(int value){
		this.value = value;
	}
	
	
	
	
}
