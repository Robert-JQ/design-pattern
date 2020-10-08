package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
       channelList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        channelList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channelList);
    }
}
