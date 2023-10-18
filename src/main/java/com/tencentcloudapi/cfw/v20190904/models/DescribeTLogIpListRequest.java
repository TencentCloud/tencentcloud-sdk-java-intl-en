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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTLogIpListRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Type. 1: alert; 2: block
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * Number of top results returned
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * Search criteria
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Type. 1: alert; 2: block 
     * @return QueryType Type. 1: alert; 2: block
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set Type. 1: alert; 2: block
     * @param QueryType Type. 1: alert; 2: block
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get Number of top results returned 
     * @return Top Number of top results returned
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set Number of top results returned
     * @param Top Number of top results returned
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get Search criteria 
     * @return SearchValue Search criteria
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Search criteria
     * @param SearchValue Search criteria
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public DescribeTLogIpListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTLogIpListRequest(DescribeTLogIpListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

