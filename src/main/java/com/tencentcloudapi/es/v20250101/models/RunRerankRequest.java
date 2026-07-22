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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunRerankRequest extends AbstractModel {

    /**
    * Model name, selectable model list: bge-reranker-large, bge-reranker-v2-m3.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Query text.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * List of candidate docs to sort.
    */
    @SerializedName("Documents")
    @Expose
    private String [] Documents;

    /**
    * Number of top documents returned in sorting order. If not specified, return all candidate docs. If the specified top_n value is larger than the number of input candidate docs, return all docs.
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * Whether to return the original document for each sorting result inside the result list. Default value: False.
    */
    @SerializedName("ReturnDocuments")
    @Expose
    private Boolean ReturnDocuments;

    /**
     * Get Model name, selectable model list: bge-reranker-large, bge-reranker-v2-m3. 
     * @return ModelName Model name, selectable model list: bge-reranker-large, bge-reranker-v2-m3.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name, selectable model list: bge-reranker-large, bge-reranker-v2-m3.
     * @param ModelName Model name, selectable model list: bge-reranker-large, bge-reranker-v2-m3.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Query text. 
     * @return Query Query text.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query text.
     * @param Query Query text.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get List of candidate docs to sort. 
     * @return Documents List of candidate docs to sort.
     */
    public String [] getDocuments() {
        return this.Documents;
    }

    /**
     * Set List of candidate docs to sort.
     * @param Documents List of candidate docs to sort.
     */
    public void setDocuments(String [] Documents) {
        this.Documents = Documents;
    }

    /**
     * Get Number of top documents returned in sorting order. If not specified, return all candidate docs. If the specified top_n value is larger than the number of input candidate docs, return all docs. 
     * @return TopN Number of top documents returned in sorting order. If not specified, return all candidate docs. If the specified top_n value is larger than the number of input candidate docs, return all docs.
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set Number of top documents returned in sorting order. If not specified, return all candidate docs. If the specified top_n value is larger than the number of input candidate docs, return all docs.
     * @param TopN Number of top documents returned in sorting order. If not specified, return all candidate docs. If the specified top_n value is larger than the number of input candidate docs, return all docs.
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get Whether to return the original document for each sorting result inside the result list. Default value: False. 
     * @return ReturnDocuments Whether to return the original document for each sorting result inside the result list. Default value: False.
     */
    public Boolean getReturnDocuments() {
        return this.ReturnDocuments;
    }

    /**
     * Set Whether to return the original document for each sorting result inside the result list. Default value: False.
     * @param ReturnDocuments Whether to return the original document for each sorting result inside the result list. Default value: False.
     */
    public void setReturnDocuments(Boolean ReturnDocuments) {
        this.ReturnDocuments = ReturnDocuments;
    }

    public RunRerankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerankRequest(RunRerankRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Documents != null) {
            this.Documents = new String[source.Documents.length];
            for (int i = 0; i < source.Documents.length; i++) {
                this.Documents[i] = new String(source.Documents[i]);
            }
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.ReturnDocuments != null) {
            this.ReturnDocuments = new Boolean(source.ReturnDocuments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Documents.", this.Documents);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "ReturnDocuments", this.ReturnDocuments);

    }
}

