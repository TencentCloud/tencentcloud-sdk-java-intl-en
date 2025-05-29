/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filters extends AbstractModel {

    /**
    * Retrieve user question or answer.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Incorrect retrieval type.

    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
     * Get Retrieve user question or answer. 
     * @return Query Retrieve user question or answer.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Retrieve user question or answer.
     * @param Query Retrieve user question or answer.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Incorrect retrieval type.
 
     * @return Reasons Incorrect retrieval type.

     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set Incorrect retrieval type.

     * @param Reasons Incorrect retrieval type.

     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    public Filters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filters(Filters source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);

    }
}

