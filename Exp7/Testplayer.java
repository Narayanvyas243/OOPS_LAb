public interface playable {
	void  play();
	void pause();
	void stop();
	
}
class MusicPlayer implements playable{
	@Override
	public void play() {
		System.out.println("music is playing ");
	}
	public void pause() {
		System.out.println("music is pause ");
	}
	public void stop() {
		System.out.println("music is stopped ");
	}
}
class TestPlayer{
	public static void main(String [] args) {
		playable p  = new MusicPlayer();
		p.play();
		p.pause();
		p.stop();
	}
}
