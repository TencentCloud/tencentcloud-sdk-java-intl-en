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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulEffectModulesRequest extends AbstractModel {

    /**
    * Number of entries on each page. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Paging offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Filter criteria:
<li>Uuid - String array - Uuid string array</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Number of entries on each page. Maximum value: 100. 
     * @return Limit Number of entries on each page. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries on each page. Maximum value: 100.
     * @param Limit Number of entries on each page. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Paging offset 
     * @return Offset Paging offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset
     * @param Offset Paging offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Filter criteria:
<li>Uuid - String array - Uuid string array</li> 
     * @return Filters Filter criteria:
<li>Uuid - String array - Uuid string array</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria:
<li>Uuid - String array - Uuid string array</li>
     * @param Filters Filter criteria:
<li>Uuid - String array - Uuid string array</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVulEffectModulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulEffectModulesRequest(DescribeVulEffectModulesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

