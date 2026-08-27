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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageStats extends AbstractModel {

    /**
    * <p>Total tokens accumulated within a time period.</p>
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * <p>[tokens family] Total input tokens within a time period.</p>
    */
    @SerializedName("InputTotalToken")
    @Expose
    private Long InputTotalToken;

    /**
    * <p>[tokens family] Total output tokens within a time period.</p>
    */
    @SerializedName("OutputTotalToken")
    @Expose
    private Long OutputTotalToken;

    /**
    * <p>[token family] Cumulative number of tokens read from the cache within a time period (cache hit part)</p>
    */
    @SerializedName("CacheTotalToken")
    @Expose
    private Long CacheTotalToken;

    /**
    * <p>Total online search requests in the [search group]</p>
    */
    @SerializedName("SearchRequestCount")
    @Expose
    private Long SearchRequestCount;

    /**
    * <p>[search family] Total search engine calls</p>
    */
    @SerializedName("SearchCount")
    @Expose
    private Long SearchCount;

    /**
     * Get <p>Total tokens accumulated within a time period.</p> 
     * @return TotalToken <p>Total tokens accumulated within a time period.</p>
     */
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set <p>Total tokens accumulated within a time period.</p>
     * @param TotalToken <p>Total tokens accumulated within a time period.</p>
     */
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get <p>[tokens family] Total input tokens within a time period.</p> 
     * @return InputTotalToken <p>[tokens family] Total input tokens within a time period.</p>
     */
    public Long getInputTotalToken() {
        return this.InputTotalToken;
    }

    /**
     * Set <p>[tokens family] Total input tokens within a time period.</p>
     * @param InputTotalToken <p>[tokens family] Total input tokens within a time period.</p>
     */
    public void setInputTotalToken(Long InputTotalToken) {
        this.InputTotalToken = InputTotalToken;
    }

    /**
     * Get <p>[tokens family] Total output tokens within a time period.</p> 
     * @return OutputTotalToken <p>[tokens family] Total output tokens within a time period.</p>
     */
    public Long getOutputTotalToken() {
        return this.OutputTotalToken;
    }

    /**
     * Set <p>[tokens family] Total output tokens within a time period.</p>
     * @param OutputTotalToken <p>[tokens family] Total output tokens within a time period.</p>
     */
    public void setOutputTotalToken(Long OutputTotalToken) {
        this.OutputTotalToken = OutputTotalToken;
    }

    /**
     * Get <p>[token family] Cumulative number of tokens read from the cache within a time period (cache hit part)</p> 
     * @return CacheTotalToken <p>[token family] Cumulative number of tokens read from the cache within a time period (cache hit part)</p>
     */
    public Long getCacheTotalToken() {
        return this.CacheTotalToken;
    }

    /**
     * Set <p>[token family] Cumulative number of tokens read from the cache within a time period (cache hit part)</p>
     * @param CacheTotalToken <p>[token family] Cumulative number of tokens read from the cache within a time period (cache hit part)</p>
     */
    public void setCacheTotalToken(Long CacheTotalToken) {
        this.CacheTotalToken = CacheTotalToken;
    }

    /**
     * Get <p>Total online search requests in the [search group]</p> 
     * @return SearchRequestCount <p>Total online search requests in the [search group]</p>
     */
    public Long getSearchRequestCount() {
        return this.SearchRequestCount;
    }

    /**
     * Set <p>Total online search requests in the [search group]</p>
     * @param SearchRequestCount <p>Total online search requests in the [search group]</p>
     */
    public void setSearchRequestCount(Long SearchRequestCount) {
        this.SearchRequestCount = SearchRequestCount;
    }

    /**
     * Get <p>[search family] Total search engine calls</p> 
     * @return SearchCount <p>[search family] Total search engine calls</p>
     */
    public Long getSearchCount() {
        return this.SearchCount;
    }

    /**
     * Set <p>[search family] Total search engine calls</p>
     * @param SearchCount <p>[search family] Total search engine calls</p>
     */
    public void setSearchCount(Long SearchCount) {
        this.SearchCount = SearchCount;
    }

    public UsageStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageStats(UsageStats source) {
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.InputTotalToken != null) {
            this.InputTotalToken = new Long(source.InputTotalToken);
        }
        if (source.OutputTotalToken != null) {
            this.OutputTotalToken = new Long(source.OutputTotalToken);
        }
        if (source.CacheTotalToken != null) {
            this.CacheTotalToken = new Long(source.CacheTotalToken);
        }
        if (source.SearchRequestCount != null) {
            this.SearchRequestCount = new Long(source.SearchRequestCount);
        }
        if (source.SearchCount != null) {
            this.SearchCount = new Long(source.SearchCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "InputTotalToken", this.InputTotalToken);
        this.setParamSimple(map, prefix + "OutputTotalToken", this.OutputTotalToken);
        this.setParamSimple(map, prefix + "CacheTotalToken", this.CacheTotalToken);
        this.setParamSimple(map, prefix + "SearchRequestCount", this.SearchRequestCount);
        this.setParamSimple(map, prefix + "SearchCount", this.SearchCount);

    }
}

