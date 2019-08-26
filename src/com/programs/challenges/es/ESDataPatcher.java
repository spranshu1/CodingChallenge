package com.programs.challenges.es;

import java.net.UnknownHostException;
import java.util.Collections;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.index.reindex.BulkIndexByScrollResponse;
import org.elasticsearch.index.reindex.UpdateByQueryAction;
import org.elasticsearch.index.reindex.UpdateByQueryRequestBuilder;
import org.elasticsearch.script.Script;
import org.elasticsearch.script.ScriptService.ScriptType;

public class ESDataPatcher {
	
	public static void main(String[] args) {
		try {
			patchData();
		} catch (UnknownHostException e) {
			System.err.println("Error while patching data");
			e.printStackTrace();
		}
	}

	private static void patchData() throws UnknownHostException {

		UpdateByQueryRequestBuilder updateByQuery = new UpdateByQueryRequestBuilder(ESClient.getClient(),
				UpdateByQueryAction.INSTANCE);
		
		updateByQuery.source(Properties.ES_INDEX)
		.filter(getQuery())
		.script(new Script(ESScript.query,ScriptType.INLINE, "painless",
						Collections.emptyMap()));
		
		BulkIndexByScrollResponse response = updateByQuery.get();
		
		System.out.println(response.getUpdated());
	}
	
	private static TermQueryBuilder getQuery() {
		
		return QueryBuilders.termQuery(Properties.ES_QUERY_FIELD, Properties.ES_QUERY_VALUE);
	}

}
