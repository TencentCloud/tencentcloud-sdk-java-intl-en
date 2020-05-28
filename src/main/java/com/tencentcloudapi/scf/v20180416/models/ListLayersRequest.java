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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLayersRequest extends AbstractModel{

    /**
    * Compatible runtimes
    */
    @SerializedName("CompatibleRuntime")
    @Expose
    private String CompatibleRuntime;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Query key, which fuzzily matches the name
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Compatible runtimes 
     * @return CompatibleRuntime Compatible runtimes
     */
    public String getCompatibleRuntime() {
        return this.CompatibleRuntime;
    }

    /**
     * Set Compatible runtimes
     * @param CompatibleRuntime Compatible runtimes
     */
    public void setCompatibleRuntime(String CompatibleRuntime) {
        this.CompatibleRuntime = CompatibleRuntime;
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
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Query key, which fuzzily matches the name 
     * @return SearchKey Query key, which fuzzily matches the name
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Query key, which fuzzily matches the name
     * @param SearchKey Query key, which fuzzily matches the name
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompatibleRuntime", this.CompatibleRuntime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

