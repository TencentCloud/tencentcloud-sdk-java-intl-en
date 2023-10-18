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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsSearchLogs extends AbstractModel {

    /**
    * Cursor for more search results
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Whether all search results have been returned
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * Log content information
    */
    @SerializedName("Results")
    @Expose
    private ClsLogObject [] Results;

    /**
     * Get Cursor for more search results 
     * @return Context Cursor for more search results
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Cursor for more search results
     * @param Context Cursor for more search results
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Whether all search results have been returned 
     * @return Listover Whether all search results have been returned
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set Whether all search results have been returned
     * @param Listover Whether all search results have been returned
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
    }

    /**
     * Get Log content information 
     * @return Results Log content information
     */
    public ClsLogObject [] getResults() {
        return this.Results;
    }

    /**
     * Set Log content information
     * @param Results Log content information
     */
    public void setResults(ClsLogObject [] Results) {
        this.Results = Results;
    }

    public ClsSearchLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsSearchLogs(ClsSearchLogs source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Listover != null) {
            this.Listover = new Boolean(source.Listover);
        }
        if (source.Results != null) {
            this.Results = new ClsLogObject[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new ClsLogObject(source.Results[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);

    }
}

