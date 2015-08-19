package org.elasticsearch.plugin.example;
import  org.elasticsearch.index.analysis.AnalysisModule;
import  org.elasticsearch.plugins.AbstractPlugin;

public class PhrasePlugin extends AbstractPlugin {

    /* Set the name that will be assigned to this plugin. */
    @Override
    public String name() {
        return "phrase_tokenizer";
    }

    /* Return a description of this plugin. */
    @Override
    public String description() {
        return "my new cool analyzer!!";
    }

    /* This is the function that will register our analyzer with Elasticsearch. */
    public void onModule(AnalysisModule analysisModule) {
        analysisModule.addProcessor(new PhraseBinderProcessor());
    }
}