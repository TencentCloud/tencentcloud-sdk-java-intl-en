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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTopicsRequest extends AbstractModel {

    /**
    * Keyword for query
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Query offset, which defaults to `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Keyword for query 
     * @return SearchWord Keyword for query
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Keyword for query
     * @param SearchWord Keyword for query
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Query offset, which defaults to `0`. 
     * @return Offset Query offset, which defaults to `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query offset, which defaults to `0`.
     * @param Offset Query offset, which defaults to `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`. 
     * @return Limit Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
     * @param Limit Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDatahubTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTopicsRequest(DescribeDatahubTopicsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

