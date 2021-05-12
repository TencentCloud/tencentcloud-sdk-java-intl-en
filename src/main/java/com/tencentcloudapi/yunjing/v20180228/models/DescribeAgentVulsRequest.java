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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentVulsRequest extends AbstractModel{

    /**
    * Vulnerability type.
<li>WEB: web application vulnerability</li>
<li>SYSTEM: system component vulnerability</li>
<li>BASELINE: security baseline</li>
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * Agent `UUID`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Number of results to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter.
<li>Status - String - Required: No - Filter by status (UN_OPERATED: to be processed, FIXED: fixed)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Vulnerability type.
<li>WEB: web application vulnerability</li>
<li>SYSTEM: system component vulnerability</li>
<li>BASELINE: security baseline</li> 
     * @return VulType Vulnerability type.
<li>WEB: web application vulnerability</li>
<li>SYSTEM: system component vulnerability</li>
<li>BASELINE: security baseline</li>
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set Vulnerability type.
<li>WEB: web application vulnerability</li>
<li>SYSTEM: system component vulnerability</li>
<li>BASELINE: security baseline</li>
     * @param VulType Vulnerability type.
<li>WEB: web application vulnerability</li>
<li>SYSTEM: system component vulnerability</li>
<li>BASELINE: security baseline</li>
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get Agent `UUID`. 
     * @return Uuid Agent `UUID`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Agent `UUID`.
     * @param Uuid Agent `UUID`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Number of results to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter.
<li>Status - String - Required: No - Filter by status (UN_OPERATED: to be processed, FIXED: fixed) 
     * @return Filters Filter.
<li>Status - String - Required: No - Filter by status (UN_OPERATED: to be processed, FIXED: fixed)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
<li>Status - String - Required: No - Filter by status (UN_OPERATED: to be processed, FIXED: fixed)
     * @param Filters Filter.
<li>Status - String - Required: No - Filter by status (UN_OPERATED: to be processed, FIXED: fixed)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAgentVulsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentVulsRequest(DescribeAgentVulsRequest source) {
        if (source.VulType != null) {
            this.VulType = new String(source.VulType);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

