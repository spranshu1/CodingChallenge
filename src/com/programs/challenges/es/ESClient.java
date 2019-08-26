package com.programs.challenges.es;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.reindex.ReindexPlugin;

public class ESClient {

	private static Client client;

	public static Client getClient() throws UnknownHostException {

		if (client == null) {
			client = TransportClient.builder()
					.addPlugin(ReindexPlugin.class)
					.build()
					.addTransportAddress(
					new InetSocketTransportAddress(InetAddress.getByName(Properties.ES_HOST), Properties.ES_PORT));

		}
		return client;
	}

}
