package kosta.video;

public class GeneralMember {

	private String id;
	private String name;
	private String addr;
	private Video video;

	public GeneralMember() {
	}

	public GeneralMember(String id, String name, String addr, Video video) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.video = video;
	}

	public void Print() {
		System.out.println("회원의 아이디: " + id);
		System.out.println("회원의 이름: " + name);
		System.out.println("회원의 주소: " + addr);
		System.out.println("회원이 대여한 비디오 번호: " + video.getVideoNo());
		System.out.println("회원이 대여한 비디오 이름: " + video.getVideoName());
		System.out.println("회원이 대여한 비디오 배우: " + video.getVideoPerson());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
