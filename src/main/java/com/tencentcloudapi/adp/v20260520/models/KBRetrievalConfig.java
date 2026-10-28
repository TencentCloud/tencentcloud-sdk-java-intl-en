/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBRetrievalConfig extends AbstractModel {

    /**
    * <p>Database search configuration</p>
    */
    @SerializedName("DbRetrievalConfig")
    @Expose
    private DBRetrievalConfig DbRetrievalConfig;

    /**
    * <p>Document retrieval configuration.</p>
    */
    @SerializedName("DocRetrievalConfig")
    @Expose
    private DocRetrievalConfig DocRetrievalConfig;

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Retrieval optional configuration</p>
    */
    @SerializedName("OptionConfig")
    @Expose
    private RetrievalOption OptionConfig;

    /**
    * <p>QA search configuration</p>
    */
    @SerializedName("QaRetrievalConfig")
    @Expose
    private QARetrievalConfig QaRetrievalConfig;

    /**
    * <p>ReRank configuration</p>
    */
    @SerializedName("RerankConfig")
    @Expose
    private RerankConfig RerankConfig;

    /**
    * <p>Search filter configuration</p>
    */
    @SerializedName("SearchFilterConfig")
    @Expose
    private SearchFilterConfig SearchFilterConfig;

    /**
    * <p>Retrieval strategy: 1=hybrid, 2=semantic, 3=keyword, 4=none<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>Hybrid retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>Semantic retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>Keyword retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>No semantic/vector retrieval</td></tr></tbody></table></p>
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * <p>Text2SQL model</p>
    */
    @SerializedName("TextToSqlModel")
    @Expose
    private ModelDetailInfo TextToSqlModel;

    /**
     * Get <p>Database search configuration</p> 
     * @return DbRetrievalConfig <p>Database search configuration</p>
     */
    public DBRetrievalConfig getDbRetrievalConfig() {
        return this.DbRetrievalConfig;
    }

    /**
     * Set <p>Database search configuration</p>
     * @param DbRetrievalConfig <p>Database search configuration</p>
     */
    public void setDbRetrievalConfig(DBRetrievalConfig DbRetrievalConfig) {
        this.DbRetrievalConfig = DbRetrievalConfig;
    }

    /**
     * Get <p>Document retrieval configuration.</p> 
     * @return DocRetrievalConfig <p>Document retrieval configuration.</p>
     */
    public DocRetrievalConfig getDocRetrievalConfig() {
        return this.DocRetrievalConfig;
    }

    /**
     * Set <p>Document retrieval configuration.</p>
     * @param DocRetrievalConfig <p>Document retrieval configuration.</p>
     */
    public void setDocRetrievalConfig(DocRetrievalConfig DocRetrievalConfig) {
        this.DocRetrievalConfig = DocRetrievalConfig;
    }

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Retrieval optional configuration</p> 
     * @return OptionConfig <p>Retrieval optional configuration</p>
     */
    public RetrievalOption getOptionConfig() {
        return this.OptionConfig;
    }

    /**
     * Set <p>Retrieval optional configuration</p>
     * @param OptionConfig <p>Retrieval optional configuration</p>
     */
    public void setOptionConfig(RetrievalOption OptionConfig) {
        this.OptionConfig = OptionConfig;
    }

    /**
     * Get <p>QA search configuration</p> 
     * @return QaRetrievalConfig <p>QA search configuration</p>
     */
    public QARetrievalConfig getQaRetrievalConfig() {
        return this.QaRetrievalConfig;
    }

    /**
     * Set <p>QA search configuration</p>
     * @param QaRetrievalConfig <p>QA search configuration</p>
     */
    public void setQaRetrievalConfig(QARetrievalConfig QaRetrievalConfig) {
        this.QaRetrievalConfig = QaRetrievalConfig;
    }

    /**
     * Get <p>ReRank configuration</p> 
     * @return RerankConfig <p>ReRank configuration</p>
     */
    public RerankConfig getRerankConfig() {
        return this.RerankConfig;
    }

    /**
     * Set <p>ReRank configuration</p>
     * @param RerankConfig <p>ReRank configuration</p>
     */
    public void setRerankConfig(RerankConfig RerankConfig) {
        this.RerankConfig = RerankConfig;
    }

    /**
     * Get <p>Search filter configuration</p> 
     * @return SearchFilterConfig <p>Search filter configuration</p>
     */
    public SearchFilterConfig getSearchFilterConfig() {
        return this.SearchFilterConfig;
    }

    /**
     * Set <p>Search filter configuration</p>
     * @param SearchFilterConfig <p>Search filter configuration</p>
     */
    public void setSearchFilterConfig(SearchFilterConfig SearchFilterConfig) {
        this.SearchFilterConfig = SearchFilterConfig;
    }

    /**
     * Get <p>Retrieval strategy: 1=hybrid, 2=semantic, 3=keyword, 4=none<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>Hybrid retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>Semantic retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>Keyword retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>No semantic/vector retrieval</td></tr></tbody></table></p> 
     * @return StrategyType <p>Retrieval strategy: 1=hybrid, 2=semantic, 3=keyword, 4=none<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>Hybrid retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>Semantic retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>Keyword retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>No semantic/vector retrieval</td></tr></tbody></table></p>
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Retrieval strategy: 1=hybrid, 2=semantic, 3=keyword, 4=none<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>Hybrid retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>Semantic retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>Keyword retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>No semantic/vector retrieval</td></tr></tbody></table></p>
     * @param StrategyType <p>Retrieval strategy: 1=hybrid, 2=semantic, 3=keyword, 4=none<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>Hybrid retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>Semantic retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>Keyword retrieval</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>No semantic/vector retrieval</td></tr></tbody></table></p>
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Text2SQL model</p> 
     * @return TextToSqlModel <p>Text2SQL model</p>
     */
    public ModelDetailInfo getTextToSqlModel() {
        return this.TextToSqlModel;
    }

    /**
     * Set <p>Text2SQL model</p>
     * @param TextToSqlModel <p>Text2SQL model</p>
     */
    public void setTextToSqlModel(ModelDetailInfo TextToSqlModel) {
        this.TextToSqlModel = TextToSqlModel;
    }

    public KBRetrievalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBRetrievalConfig(KBRetrievalConfig source) {
        if (source.DbRetrievalConfig != null) {
            this.DbRetrievalConfig = new DBRetrievalConfig(source.DbRetrievalConfig);
        }
        if (source.DocRetrievalConfig != null) {
            this.DocRetrievalConfig = new DocRetrievalConfig(source.DocRetrievalConfig);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.OptionConfig != null) {
            this.OptionConfig = new RetrievalOption(source.OptionConfig);
        }
        if (source.QaRetrievalConfig != null) {
            this.QaRetrievalConfig = new QARetrievalConfig(source.QaRetrievalConfig);
        }
        if (source.RerankConfig != null) {
            this.RerankConfig = new RerankConfig(source.RerankConfig);
        }
        if (source.SearchFilterConfig != null) {
            this.SearchFilterConfig = new SearchFilterConfig(source.SearchFilterConfig);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.TextToSqlModel != null) {
            this.TextToSqlModel = new ModelDetailInfo(source.TextToSqlModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DbRetrievalConfig.", this.DbRetrievalConfig);
        this.setParamObj(map, prefix + "DocRetrievalConfig.", this.DocRetrievalConfig);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "OptionConfig.", this.OptionConfig);
        this.setParamObj(map, prefix + "QaRetrievalConfig.", this.QaRetrievalConfig);
        this.setParamObj(map, prefix + "RerankConfig.", this.RerankConfig);
        this.setParamObj(map, prefix + "SearchFilterConfig.", this.SearchFilterConfig);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamObj(map, prefix + "TextToSqlModel.", this.TextToSqlModel);

    }
}

