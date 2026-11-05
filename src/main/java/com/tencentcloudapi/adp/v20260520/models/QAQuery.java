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

public class QAQuery extends AbstractModel {

    /**
    * <p>Query keyword (fuzzy search)</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Query scope (fields that query acts on): 1=question, 2=tag or tag value, 3=answer; multiple selections supported, unavailable by default</p>
    */
    @SerializedName("QueryScopeList")
    @Expose
    private Long [] QueryScopeList;

    /**
     * Get <p>Query keyword (fuzzy search)</p> 
     * @return Query <p>Query keyword (fuzzy search)</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Query keyword (fuzzy search)</p>
     * @param Query <p>Query keyword (fuzzy search)</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Query scope (fields that query acts on): 1=question, 2=tag or tag value, 3=answer; multiple selections supported, unavailable by default</p> 
     * @return QueryScopeList <p>Query scope (fields that query acts on): 1=question, 2=tag or tag value, 3=answer; multiple selections supported, unavailable by default</p>
     */
    public Long [] getQueryScopeList() {
        return this.QueryScopeList;
    }

    /**
     * Set <p>Query scope (fields that query acts on): 1=question, 2=tag or tag value, 3=answer; multiple selections supported, unavailable by default</p>
     * @param QueryScopeList <p>Query scope (fields that query acts on): 1=question, 2=tag or tag value, 3=answer; multiple selections supported, unavailable by default</p>
     */
    public void setQueryScopeList(Long [] QueryScopeList) {
        this.QueryScopeList = QueryScopeList;
    }

    public QAQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAQuery(QAQuery source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.QueryScopeList != null) {
            this.QueryScopeList = new Long[source.QueryScopeList.length];
            for (int i = 0; i < source.QueryScopeList.length; i++) {
                this.QueryScopeList[i] = new Long(source.QueryScopeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "QueryScopeList.", this.QueryScopeList);

    }
}

