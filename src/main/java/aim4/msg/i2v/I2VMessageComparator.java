package aim4.msg.i2v;

import java.util.Comparator;

public class I2VMessageComparator implements Comparator<I2VMessage> {

	public I2VMessageComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(I2VMessage o1, I2VMessage o2) {
		double o1ts = o1.getTimeToBeReceived();
		double o2ts = o2.getTimeToBeReceived();
		if (o1ts > o2ts) {
			return -1;
		} else if (o1ts < o2ts) {
			return 1;
		} else {
			return 0;
		}
	}

}
