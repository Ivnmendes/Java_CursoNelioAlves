package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Post {
	private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private String title;
	private String content;
	private int likes;
	private ArrayList<Comment> comments = new ArrayList<>();
	
	public Post(){
	}
	public Post(String title, String content) {
		this.moment = LocalDateTime.now();
		this.title = title;
		this.content = content;
		this.likes = 0;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void addComment(Comment comment) {
		comments.add(comment);	
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);	
	}
	public void addLike() {
		this.likes += 1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(content + "\n");
		sb.append("likes: ");
		sb.append(likes + "\n");
		sb.append(moment.format(FORMATTER) + "\n");
		sb.append(comments.size());
		sb.append(" Comentarios: \n");
		for(Comment comment : comments) {
			sb.append(comment.getText() + "\n");
		}
		
		return sb.toString();
	}
	
	
}
