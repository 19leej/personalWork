package strings;

public class Essay {
	private String name;
	private String text;

	public Essay() {
		name = " ";
		text = " ";
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setText(String newText) {
		text = newText;
	}

	public String lastName() {
		String lastname = name.substring(name.indexOf(" ") + 1, name.length());
		return lastname.toUpperCase();
	}

	public int charFirst() {
		String first = name.substring(0, name.indexOf(" "));
		return first.length();
	}

	public boolean charX() {
		return name.contains("X");
	}

	public int length() {
		int counter = 0;
		int word = 1;
		if (text.length() == 0) {
			word = 0;
		} else {
			for (counter = 0; counter < text.length(); counter++) {
				if (text.charAt(counter) == ' ') {
					word++;
				}
			}
		}
		return word;
	}

}
