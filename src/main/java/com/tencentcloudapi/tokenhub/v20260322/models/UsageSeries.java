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

public class UsageSeries extends AbstractModel {

    /**
    * <p>Amount of total tokens used within a time period in JSON string form, for example, <code>&quot;[12,null,15]&quot;</code>.</p>
    */
    @SerializedName("TotalToken")
    @Expose
    private String TotalToken;

    /**
    * <p>Amount of input tokens used within a time period in JSON string form, for example, <code>&quot;[7,null,9]&quot;</code>.</p>
    */
    @SerializedName("InputTotalToken")
    @Expose
    private String InputTotalToken;

    /**
    * <p>Amount of output tokens used within a time period in JSON string form, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
    */
    @SerializedName("OutputTotalToken")
    @Expose
    private String OutputTotalToken;

    /**
    * <p>Read cache token count usage of the tokens family in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
    */
    @SerializedName("CacheTotalToken")
    @Expose
    private String CacheTotalToken;

    /**
    * <p>Usage of search requests in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
    */
    @SerializedName("SearchRequestCount")
    @Expose
    private String SearchRequestCount;

    /**
    * <p>Usage of search engine call count in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
    */
    @SerializedName("SearchCount")
    @Expose
    private String SearchCount;

    /**
     * Get <p>Amount of total tokens used within a time period in JSON string form, for example, <code>&quot;[12,null,15]&quot;</code>.</p> 
     * @return TotalToken <p>Amount of total tokens used within a time period in JSON string form, for example, <code>&quot;[12,null,15]&quot;</code>.</p>
     */
    public String getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set <p>Amount of total tokens used within a time period in JSON string form, for example, <code>&quot;[12,null,15]&quot;</code>.</p>
     * @param TotalToken <p>Amount of total tokens used within a time period in JSON string form, for example, <code>&quot;[12,null,15]&quot;</code>.</p>
     */
    public void setTotalToken(String TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get <p>Amount of input tokens used within a time period in JSON string form, for example, <code>&quot;[7,null,9]&quot;</code>.</p> 
     * @return InputTotalToken <p>Amount of input tokens used within a time period in JSON string form, for example, <code>&quot;[7,null,9]&quot;</code>.</p>
     */
    public String getInputTotalToken() {
        return this.InputTotalToken;
    }

    /**
     * Set <p>Amount of input tokens used within a time period in JSON string form, for example, <code>&quot;[7,null,9]&quot;</code>.</p>
     * @param InputTotalToken <p>Amount of input tokens used within a time period in JSON string form, for example, <code>&quot;[7,null,9]&quot;</code>.</p>
     */
    public void setInputTotalToken(String InputTotalToken) {
        this.InputTotalToken = InputTotalToken;
    }

    /**
     * Get <p>Amount of output tokens used within a time period in JSON string form, for example, <code>&quot;[5,null,6]&quot;</code>.</p> 
     * @return OutputTotalToken <p>Amount of output tokens used within a time period in JSON string form, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public String getOutputTotalToken() {
        return this.OutputTotalToken;
    }

    /**
     * Set <p>Amount of output tokens used within a time period in JSON string form, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     * @param OutputTotalToken <p>Amount of output tokens used within a time period in JSON string form, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public void setOutputTotalToken(String OutputTotalToken) {
        this.OutputTotalToken = OutputTotalToken;
    }

    /**
     * Get <p>Read cache token count usage of the tokens family in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p> 
     * @return CacheTotalToken <p>Read cache token count usage of the tokens family in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public String getCacheTotalToken() {
        return this.CacheTotalToken;
    }

    /**
     * Set <p>Read cache token count usage of the tokens family in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     * @param CacheTotalToken <p>Read cache token count usage of the tokens family in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public void setCacheTotalToken(String CacheTotalToken) {
        this.CacheTotalToken = CacheTotalToken;
    }

    /**
     * Get <p>Usage of search requests in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p> 
     * @return SearchRequestCount <p>Usage of search requests in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public String getSearchRequestCount() {
        return this.SearchRequestCount;
    }

    /**
     * Set <p>Usage of search requests in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     * @param SearchRequestCount <p>Usage of search requests in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public void setSearchRequestCount(String SearchRequestCount) {
        this.SearchRequestCount = SearchRequestCount;
    }

    /**
     * Get <p>Usage of search engine call count in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p> 
     * @return SearchCount <p>Usage of search engine call count in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public String getSearchCount() {
        return this.SearchCount;
    }

    /**
     * Set <p>Usage of search engine call count in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     * @param SearchCount <p>Usage of search engine call count in JSON string form within a time period, for example, <code>&quot;[5,null,6]&quot;</code>.</p>
     */
    public void setSearchCount(String SearchCount) {
        this.SearchCount = SearchCount;
    }

    public UsageSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageSeries(UsageSeries source) {
        if (source.TotalToken != null) {
            this.TotalToken = new String(source.TotalToken);
        }
        if (source.InputTotalToken != null) {
            this.InputTotalToken = new String(source.InputTotalToken);
        }
        if (source.OutputTotalToken != null) {
            this.OutputTotalToken = new String(source.OutputTotalToken);
        }
        if (source.CacheTotalToken != null) {
            this.CacheTotalToken = new String(source.CacheTotalToken);
        }
        if (source.SearchRequestCount != null) {
            this.SearchRequestCount = new String(source.SearchRequestCount);
        }
        if (source.SearchCount != null) {
            this.SearchCount = new String(source.SearchCount);
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

