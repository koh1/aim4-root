package aim4.msg.v2i;

import java.util.Comparator;

public class V2IMessageComparator implements Comparator<V2IMessage> {

	public V2IMessageComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(V2IMessage o1, V2IMessage o2) {
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
