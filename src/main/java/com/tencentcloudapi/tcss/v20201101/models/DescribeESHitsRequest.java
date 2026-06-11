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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeESHitsRequest extends AbstractModel {

    /**
    * ES query condition in JSON
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Log Type List
    */
    @SerializedName("LogTypes")
    @Expose
    private String [] LogTypes;

    /**
     * Get ES query condition in JSON 
     * @return Query ES query condition in JSON
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set ES query condition in JSON
     * @param Query ES query condition in JSON
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. Maximum value: `100`. 
     * @return Limit Number of results to be returned. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Maximum value: `100`.
     * @param Limit Number of results to be returned. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log Type List 
     * @return LogTypes Log Type List
     */
    public String [] getLogTypes() {
        return this.LogTypes;
    }

    /**
     * Set Log Type List
     * @param LogTypes Log Type List
     */
    public void setLogTypes(String [] LogTypes) {
        this.LogTypes = LogTypes;
    }

    public DescribeESHitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeESHitsRequest(DescribeESHitsRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LogTypes != null) {
            this.LogTypes = new String[source.LogTypes.length];
            for (int i = 0; i < source.LogTypes.length; i++) {
                this.LogTypes[i] = new String(source.LogTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "LogTypes.", this.LogTypes);

    }
}

