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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancingRequest extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Ignore query string parameter
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Specifies whether the `Host` parameter supports fuzzy match
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter 
     * @return Limit Pagination parameter
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter
     * @param Limit Pagination parameter
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Ignore query string parameter 
     * @return Host Ignore query string parameter
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Ignore query string parameter
     * @param Host Ignore query string parameter
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Specifies whether the `Host` parameter supports fuzzy match 
     * @return Fuzzy Specifies whether the `Host` parameter supports fuzzy match
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set Specifies whether the `Host` parameter supports fuzzy match
     * @param Fuzzy Specifies whether the `Host` parameter supports fuzzy match
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public DescribeLoadBalancingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancingRequest(DescribeLoadBalancingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new Boolean(source.Fuzzy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

