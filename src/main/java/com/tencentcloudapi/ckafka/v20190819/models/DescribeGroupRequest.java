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

public class DescribeGroupRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Search keyword
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of results to be returned
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Only supported for GroupState filter criteria. valid values: Empty, Stable. note: this parameter can only be accessed in versions 2.8/3.2.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get The ckafka cluster instance Id. 
     * @return InstanceId The ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id.
     * @param InstanceId The ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Search keyword 
     * @return SearchWord Search keyword
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search keyword
     * @param SearchWord Search keyword
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of results to be returned 
     * @return Limit Maximum number of results to be returned
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results to be returned
     * @param Limit Maximum number of results to be returned
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Only supported for GroupState filter criteria. valid values: Empty, Stable. note: this parameter can only be accessed in versions 2.8/3.2. 
     * @return Filters Only supported for GroupState filter criteria. valid values: Empty, Stable. note: this parameter can only be accessed in versions 2.8/3.2.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Only supported for GroupState filter criteria. valid values: Empty, Stable. note: this parameter can only be accessed in versions 2.8/3.2.
     * @param Filters Only supported for GroupState filter criteria. valid values: Empty, Stable. note: this parameter can only be accessed in versions 2.8/3.2.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupRequest(DescribeGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

