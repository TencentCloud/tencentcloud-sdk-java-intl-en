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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomizedConfigListRequest extends AbstractModel {

    /**
    * Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * Pagination offset. Default: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page. Default: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the name of configs to query. Fuzzy match is supported.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration ID.
    */
    @SerializedName("UconfigIds")
    @Expose
    private String [] UconfigIds;

    /**
    * The filters are:
<li> loadbalancer-id - String - Required: no - (filter) CLB instance ID, such as "lb-12345678". </li>
<li> vip - String - Required: no - (filter) CLB instance VIP, such as "1.1.1.1" and "2204::22:3". </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs). 
     * @return ConfigType Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
     * @param ConfigType Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Pagination offset. Default: 0. 
     * @return Offset Pagination offset. Default: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default: 0.
     * @param Offset Pagination offset. Default: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page. Default: 20. 
     * @return Limit Number of results per page. Default: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Default: 20.
     * @param Limit Number of results per page. Default: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the name of configs to query. Fuzzy match is supported. 
     * @return ConfigName Specifies the name of configs to query. Fuzzy match is supported.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Specifies the name of configs to query. Fuzzy match is supported.
     * @param ConfigName Specifies the name of configs to query. Fuzzy match is supported.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Configuration ID. 
     * @return UconfigIds Configuration ID.
     */
    public String [] getUconfigIds() {
        return this.UconfigIds;
    }

    /**
     * Set Configuration ID.
     * @param UconfigIds Configuration ID.
     */
    public void setUconfigIds(String [] UconfigIds) {
        this.UconfigIds = UconfigIds;
    }

    /**
     * Get The filters are:
<li> loadbalancer-id - String - Required: no - (filter) CLB instance ID, such as "lb-12345678". </li>
<li> vip - String - Required: no - (filter) CLB instance VIP, such as "1.1.1.1" and "2204::22:3". </li> 
     * @return Filters The filters are:
<li> loadbalancer-id - String - Required: no - (filter) CLB instance ID, such as "lb-12345678". </li>
<li> vip - String - Required: no - (filter) CLB instance VIP, such as "1.1.1.1" and "2204::22:3". </li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The filters are:
<li> loadbalancer-id - String - Required: no - (filter) CLB instance ID, such as "lb-12345678". </li>
<li> vip - String - Required: no - (filter) CLB instance VIP, such as "1.1.1.1" and "2204::22:3". </li>
     * @param Filters The filters are:
<li> loadbalancer-id - String - Required: no - (filter) CLB instance ID, such as "lb-12345678". </li>
<li> vip - String - Required: no - (filter) CLB instance VIP, such as "1.1.1.1" and "2204::22:3". </li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCustomizedConfigListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomizedConfigListRequest(DescribeCustomizedConfigListRequest source) {
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.UconfigIds != null) {
            this.UconfigIds = new String[source.UconfigIds.length];
            for (int i = 0; i < source.UconfigIds.length; i++) {
                this.UconfigIds[i] = new String(source.UconfigIds[i]);
            }
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
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "UconfigIds.", this.UconfigIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

