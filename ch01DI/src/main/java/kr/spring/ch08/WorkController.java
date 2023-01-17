package kr.spring.ch08;

public class WorkController {
	private long periodTime;
	private EmailSender email;
	
	public long getPeriodTime() {
		return periodTime;
	}
	public EmailSender getEmail() {
		return email;
	}
	
	
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}
	public void setEmail(EmailSender email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "WorkController [periodTime=" + periodTime + ", email=" + email + "]";
	}

	
	
	
	
}
