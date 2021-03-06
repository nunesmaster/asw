package wwwordz.shared;

public class Configs extends Object {

	Configs() {
	}

	public static final long PLAY_STAGE_DURATION = 30000L;
	public static final long RANKING_STAGE_DURATION = 5000L;
	public static final long REPORT_STAGE_DURATION = 5000L;
	public static final long JOIN_STAGE_DURATION = 5000L;

	public static long getJoinStageDuration() {
		return JOIN_STAGE_DURATION;
	}

	public static long getPlayStageDuration() {
		return PLAY_STAGE_DURATION;
	}

	public static long getRankingStageDuration() {
		return RANKING_STAGE_DURATION;
	}

	public static long getReportStageDuration() {
		return REPORT_STAGE_DURATION;
	}
}
