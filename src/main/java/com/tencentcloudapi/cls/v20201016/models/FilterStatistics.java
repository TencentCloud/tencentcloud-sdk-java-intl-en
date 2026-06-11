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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterStatistics extends AbstractModel {

    /**
    * <p>Number of raw logs</p>
    */
    @SerializedName("OriginalCount")
    @Expose
    private Long OriginalCount;

    /**
    * <p>Number of filtered logs</p>
    */
    @SerializedName("FilteredCount")
    @Expose
    private Long FilteredCount;

    /**
    * <p>Filtered results</p>
    */
    @SerializedName("FilteredResult")
    @Expose
    private String [] FilteredResult;

    /**
     * Get <p>Number of raw logs</p> 
     * @return OriginalCount <p>Number of raw logs</p>
     */
    public Long getOriginalCount() {
        return this.OriginalCount;
    }

    /**
     * Set <p>Number of raw logs</p>
     * @param OriginalCount <p>Number of raw logs</p>
     */
    public void setOriginalCount(Long OriginalCount) {
        this.OriginalCount = OriginalCount;
    }

    /**
     * Get <p>Number of filtered logs</p> 
     * @return FilteredCount <p>Number of filtered logs</p>
     */
    public Long getFilteredCount() {
        return this.FilteredCount;
    }

    /**
     * Set <p>Number of filtered logs</p>
     * @param FilteredCount <p>Number of filtered logs</p>
     */
    public void setFilteredCount(Long FilteredCount) {
        this.FilteredCount = FilteredCount;
    }

    /**
     * Get <p>Filtered results</p> 
     * @return FilteredResult <p>Filtered results</p>
     */
    public String [] getFilteredResult() {
        return this.FilteredResult;
    }

    /**
     * Set <p>Filtered results</p>
     * @param FilteredResult <p>Filtered results</p>
     */
    public void setFilteredResult(String [] FilteredResult) {
        this.FilteredResult = FilteredResult;
    }

    public FilterStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterStatistics(FilterStatistics source) {
        if (source.OriginalCount != null) {
            this.OriginalCount = new Long(source.OriginalCount);
        }
        if (source.FilteredCount != null) {
            this.FilteredCount = new Long(source.FilteredCount);
        }
        if (source.FilteredResult != null) {
            this.FilteredResult = new String[source.FilteredResult.length];
            for (int i = 0; i < source.FilteredResult.length; i++) {
                this.FilteredResult[i] = new String(source.FilteredResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalCount", this.OriginalCount);
        this.setParamSimple(map, prefix + "FilteredCount", this.FilteredCount);
        this.setParamArraySimple(map, prefix + "FilteredResult.", this.FilteredResult);

    }
}

