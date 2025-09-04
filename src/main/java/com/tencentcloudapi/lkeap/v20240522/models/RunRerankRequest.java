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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunRerankRequest extends AbstractModel {

    /**
    * Query content.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Document list, up to 20 documents.
    */
    @SerializedName("Docs")
    @Expose
    private String [] Docs;

    /**
    * Model name. Default: lke-reranker-base.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get Query content. 
     * @return Query Query content.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query content.
     * @param Query Query content.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Document list, up to 20 documents. 
     * @return Docs Document list, up to 20 documents.
     */
    public String [] getDocs() {
        return this.Docs;
    }

    /**
     * Set Document list, up to 20 documents.
     * @param Docs Document list, up to 20 documents.
     */
    public void setDocs(String [] Docs) {
        this.Docs = Docs;
    }

    /**
     * Get Model name. Default: lke-reranker-base. 
     * @return Model Model name. Default: lke-reranker-base.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Model name. Default: lke-reranker-base.
     * @param Model Model name. Default: lke-reranker-base.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public RunRerankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerankRequest(RunRerankRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Docs != null) {
            this.Docs = new String[source.Docs.length];
            for (int i = 0; i < source.Docs.length; i++) {
                this.Docs[i] = new String(source.Docs[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Docs.", this.Docs);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

