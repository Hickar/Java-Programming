package Ex3;

import java.util.StringTokenizer;

public class Shirt {
	private final String article, model, color, size;

	public Shirt(String data) {
		StringTokenizer tokenizer = new StringTokenizer(data, ",");
		article = tokenizer.nextToken();
		model = tokenizer.nextToken();
		color = tokenizer.nextToken();
		size = tokenizer.nextToken();
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Article: ").append(article).append("\n")
				.append("Model: ").append(model).append("\n")
				.append("Color: ").append(color).append("\n")
				.append("Size: ").append(size).append("\n");
		return result.toString();
	}
}
