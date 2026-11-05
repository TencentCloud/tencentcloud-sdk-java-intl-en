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

public class DescribeModelListRequest extends AbstractModel {

    /**
    * <p>Model scenario. 0-case-insensitive, 1-standard generation, 2-standard thinking, 3-Agent thinking, 4-multimodal understanding, 5-multimodal QA, 6-rewrite, 7-long-term memory, 8-natural language to SQL, 9-AI optimization, 10-real-time file parsing, 11-file parsing, 12-GraphRAG, 13-OpenClaw, 14-multimodal Embedding, 15-Rerank, 16-text Embedding, 17-Widget, 18-Claw mode, 19-workflow code generation, 20-workflow large model node, 21-dedicated vectorization for workflow node, 22-workflow parameter extraction, 23-workflow large model knowledge q&a, 24-workflow tag extraction, 25-workflow intent recognition, 26-workflow tab, 27-workflow logical judgment, 28-documentation generation QA, 29-knowledge base Schema</p><p>Enumeration values:</p><ul><li>0: case-insensitive</li><li>1: standard generation</li><li>2: standard thinking</li><li>3: Agent thinking</li><li>4: multimodal understanding</li><li>5: multimodal QA</li><li>6: rewrite</li><li>7: long-term memory</li><li>8: natural language to SQL</li><li>9: AI optimization</li><li>10: real-time file parsing</li><li>11: file parsing</li><li>12: GraphRAG</li><li>13: OpenClaw</li><li>14: multimodal Embedding</li><li>15: Rerank</li><li>16: text Embedding</li><li>17: Widget</li><li>18: Claw mode</li><li>19: workflow code generation</li><li>20: workflow large model node</li><li>21: dedicated vectorization for workflow node</li><li>22: workflow parameter extraction</li><li>23: workflow large model knowledge q&a</li><li>24: workflow tag extraction</li><li>25: workflow intent recognition</li><li>26: workflow tab</li><li>27: workflow logical judgment</li><li>28: documentation generation QA</li><li>29: knowledge base Schema</li></ul>
    */
    @SerializedName("ModelScene")
    @Expose
    private Long ModelScene;

    /**
    * <p>Filter conditions (multiple Filters are combined with AND, and multiple Values within the same Filter are combined with OR)<br>DeveloperName: model author name<br>ProviderName: model provider name<br>ProviderType: model provider type</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Page number. Starts from 0</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page. Default: 20. Maximum: 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Fuzzy search by keyword</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Space ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>Model scenario. 0-case-insensitive, 1-standard generation, 2-standard thinking, 3-Agent thinking, 4-multimodal understanding, 5-multimodal QA, 6-rewrite, 7-long-term memory, 8-natural language to SQL, 9-AI optimization, 10-real-time file parsing, 11-file parsing, 12-GraphRAG, 13-OpenClaw, 14-multimodal Embedding, 15-Rerank, 16-text Embedding, 17-Widget, 18-Claw mode, 19-workflow code generation, 20-workflow large model node, 21-dedicated vectorization for workflow node, 22-workflow parameter extraction, 23-workflow large model knowledge q&a, 24-workflow tag extraction, 25-workflow intent recognition, 26-workflow tab, 27-workflow logical judgment, 28-documentation generation QA, 29-knowledge base Schema</p><p>Enumeration values:</p><ul><li>0: case-insensitive</li><li>1: standard generation</li><li>2: standard thinking</li><li>3: Agent thinking</li><li>4: multimodal understanding</li><li>5: multimodal QA</li><li>6: rewrite</li><li>7: long-term memory</li><li>8: natural language to SQL</li><li>9: AI optimization</li><li>10: real-time file parsing</li><li>11: file parsing</li><li>12: GraphRAG</li><li>13: OpenClaw</li><li>14: multimodal Embedding</li><li>15: Rerank</li><li>16: text Embedding</li><li>17: Widget</li><li>18: Claw mode</li><li>19: workflow code generation</li><li>20: workflow large model node</li><li>21: dedicated vectorization for workflow node</li><li>22: workflow parameter extraction</li><li>23: workflow large model knowledge q&a</li><li>24: workflow tag extraction</li><li>25: workflow intent recognition</li><li>26: workflow tab</li><li>27: workflow logical judgment</li><li>28: documentation generation QA</li><li>29: knowledge base Schema</li></ul> 
     * @return ModelScene <p>Model scenario. 0-case-insensitive, 1-standard generation, 2-standard thinking, 3-Agent thinking, 4-multimodal understanding, 5-multimodal QA, 6-rewrite, 7-long-term memory, 8-natural language to SQL, 9-AI optimization, 10-real-time file parsing, 11-file parsing, 12-GraphRAG, 13-OpenClaw, 14-multimodal Embedding, 15-Rerank, 16-text Embedding, 17-Widget, 18-Claw mode, 19-workflow code generation, 20-workflow large model node, 21-dedicated vectorization for workflow node, 22-workflow parameter extraction, 23-workflow large model knowledge q&a, 24-workflow tag extraction, 25-workflow intent recognition, 26-workflow tab, 27-workflow logical judgment, 28-documentation generation QA, 29-knowledge base Schema</p><p>Enumeration values:</p><ul><li>0: case-insensitive</li><li>1: standard generation</li><li>2: standard thinking</li><li>3: Agent thinking</li><li>4: multimodal understanding</li><li>5: multimodal QA</li><li>6: rewrite</li><li>7: long-term memory</li><li>8: natural language to SQL</li><li>9: AI optimization</li><li>10: real-time file parsing</li><li>11: file parsing</li><li>12: GraphRAG</li><li>13: OpenClaw</li><li>14: multimodal Embedding</li><li>15: Rerank</li><li>16: text Embedding</li><li>17: Widget</li><li>18: Claw mode</li><li>19: workflow code generation</li><li>20: workflow large model node</li><li>21: dedicated vectorization for workflow node</li><li>22: workflow parameter extraction</li><li>23: workflow large model knowledge q&a</li><li>24: workflow tag extraction</li><li>25: workflow intent recognition</li><li>26: workflow tab</li><li>27: workflow logical judgment</li><li>28: documentation generation QA</li><li>29: knowledge base Schema</li></ul>
     */
    public Long getModelScene() {
        return this.ModelScene;
    }

    /**
     * Set <p>Model scenario. 0-case-insensitive, 1-standard generation, 2-standard thinking, 3-Agent thinking, 4-multimodal understanding, 5-multimodal QA, 6-rewrite, 7-long-term memory, 8-natural language to SQL, 9-AI optimization, 10-real-time file parsing, 11-file parsing, 12-GraphRAG, 13-OpenClaw, 14-multimodal Embedding, 15-Rerank, 16-text Embedding, 17-Widget, 18-Claw mode, 19-workflow code generation, 20-workflow large model node, 21-dedicated vectorization for workflow node, 22-workflow parameter extraction, 23-workflow large model knowledge q&a, 24-workflow tag extraction, 25-workflow intent recognition, 26-workflow tab, 27-workflow logical judgment, 28-documentation generation QA, 29-knowledge base Schema</p><p>Enumeration values:</p><ul><li>0: case-insensitive</li><li>1: standard generation</li><li>2: standard thinking</li><li>3: Agent thinking</li><li>4: multimodal understanding</li><li>5: multimodal QA</li><li>6: rewrite</li><li>7: long-term memory</li><li>8: natural language to SQL</li><li>9: AI optimization</li><li>10: real-time file parsing</li><li>11: file parsing</li><li>12: GraphRAG</li><li>13: OpenClaw</li><li>14: multimodal Embedding</li><li>15: Rerank</li><li>16: text Embedding</li><li>17: Widget</li><li>18: Claw mode</li><li>19: workflow code generation</li><li>20: workflow large model node</li><li>21: dedicated vectorization for workflow node</li><li>22: workflow parameter extraction</li><li>23: workflow large model knowledge q&a</li><li>24: workflow tag extraction</li><li>25: workflow intent recognition</li><li>26: workflow tab</li><li>27: workflow logical judgment</li><li>28: documentation generation QA</li><li>29: knowledge base Schema</li></ul>
     * @param ModelScene <p>Model scenario. 0-case-insensitive, 1-standard generation, 2-standard thinking, 3-Agent thinking, 4-multimodal understanding, 5-multimodal QA, 6-rewrite, 7-long-term memory, 8-natural language to SQL, 9-AI optimization, 10-real-time file parsing, 11-file parsing, 12-GraphRAG, 13-OpenClaw, 14-multimodal Embedding, 15-Rerank, 16-text Embedding, 17-Widget, 18-Claw mode, 19-workflow code generation, 20-workflow large model node, 21-dedicated vectorization for workflow node, 22-workflow parameter extraction, 23-workflow large model knowledge q&a, 24-workflow tag extraction, 25-workflow intent recognition, 26-workflow tab, 27-workflow logical judgment, 28-documentation generation QA, 29-knowledge base Schema</p><p>Enumeration values:</p><ul><li>0: case-insensitive</li><li>1: standard generation</li><li>2: standard thinking</li><li>3: Agent thinking</li><li>4: multimodal understanding</li><li>5: multimodal QA</li><li>6: rewrite</li><li>7: long-term memory</li><li>8: natural language to SQL</li><li>9: AI optimization</li><li>10: real-time file parsing</li><li>11: file parsing</li><li>12: GraphRAG</li><li>13: OpenClaw</li><li>14: multimodal Embedding</li><li>15: Rerank</li><li>16: text Embedding</li><li>17: Widget</li><li>18: Claw mode</li><li>19: workflow code generation</li><li>20: workflow large model node</li><li>21: dedicated vectorization for workflow node</li><li>22: workflow parameter extraction</li><li>23: workflow large model knowledge q&a</li><li>24: workflow tag extraction</li><li>25: workflow intent recognition</li><li>26: workflow tab</li><li>27: workflow logical judgment</li><li>28: documentation generation QA</li><li>29: knowledge base Schema</li></ul>
     */
    public void setModelScene(Long ModelScene) {
        this.ModelScene = ModelScene;
    }

    /**
     * Get <p>Filter conditions (multiple Filters are combined with AND, and multiple Values within the same Filter are combined with OR)<br>DeveloperName: model author name<br>ProviderName: model provider name<br>ProviderType: model provider type</p> 
     * @return FilterList <p>Filter conditions (multiple Filters are combined with AND, and multiple Values within the same Filter are combined with OR)<br>DeveloperName: model author name<br>ProviderName: model provider name<br>ProviderType: model provider type</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Filter conditions (multiple Filters are combined with AND, and multiple Values within the same Filter are combined with OR)<br>DeveloperName: model author name<br>ProviderName: model provider name<br>ProviderType: model provider type</p>
     * @param FilterList <p>Filter conditions (multiple Filters are combined with AND, and multiple Values within the same Filter are combined with OR)<br>DeveloperName: model author name<br>ProviderName: model provider name<br>ProviderType: model provider type</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Page number. Starts from 0</p> 
     * @return PageNumber <p>Page number. Starts from 0</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Starts from 0</p>
     * @param PageNumber <p>Page number. Starts from 0</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page. Default: 20. Maximum: 100</p> 
     * @return PageSize <p>Number of items per page. Default: 20. Maximum: 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page. Default: 20. Maximum: 100</p>
     * @param PageSize <p>Number of items per page. Default: 20. Maximum: 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Fuzzy search by keyword</p> 
     * @return Query <p>Fuzzy search by keyword</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Fuzzy search by keyword</p>
     * @param Query <p>Fuzzy search by keyword</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Space ID</p> 
     * @return SpaceId <p>Space ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID</p>
     * @param SpaceId <p>Space ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public DescribeModelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelListRequest(DescribeModelListRequest source) {
        if (source.ModelScene != null) {
            this.ModelScene = new Long(source.ModelScene);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelScene", this.ModelScene);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

