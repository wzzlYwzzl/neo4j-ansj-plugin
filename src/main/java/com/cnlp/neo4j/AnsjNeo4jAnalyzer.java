package com.cnlp.neo4j;

import org.apache.lucene.analysis.Analyzer;
import org.ansj.lucene7.AnsjAnalyzer;
import org.neo4j.graphdb.index.fulltext.AnalyzerProvider;
import org.neo4j.helpers.Service;

@Service.Implementation(AnalyzerProvider.class)
public class AnsjNeo4jAnalyzer extends AnalyzerProvider{

	    public AnsjNeo4jAnalyzer() {
	        super("AnsjNeo4jAnalyzer");
	    }

	    @Override
	    public Analyzer createAnalyzer() {
	        return new AnsjAnalyzer(AnsjAnalyzer.TYPE.index_ansj);
	    }

	    @Override
	    public String description() {
	        return "The Ansj Analyzer";
	    }
}
