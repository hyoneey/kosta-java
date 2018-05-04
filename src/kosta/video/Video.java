package kosta.video;

public class Video {

	private int videoNo;
	private String videoName;
	private String videoPerson;

	public Video() {
	}

	public Video(int videoNo, String videoName, String videoPerson) {
		super();
		this.videoNo = videoNo;
		this.videoName = videoName;
		this.videoPerson = videoPerson;
	}

	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoPerson() {
		return videoPerson;
	}

	public void setVideoPerson(String videoPerson) {
		this.videoPerson = videoPerson;
	}

}
