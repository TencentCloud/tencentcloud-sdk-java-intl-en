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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHaVipsRequest extends AbstractModel {

    /**
    * The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.
    */
    @SerializedName("HaVipIds")
    @Expose
    private String [] HaVipIds;

    /**
    * Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
li>havip-id - String - The unique ID of the HAVIP, such as `havip-9o233uri`.</li>
<li>havip-name - String - HAVIP name.</li>
<li>vpc-id - String - VPC ID of the HAVIP.</li>
<li>subnet-id - String - Subnet ID of the HAVIP.</li>
<li>vip - String - Virtual IP address of the HAVIP.</li>
<li>address-ip - String - Bound EIP.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The returned quantity
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The unique `ID` of the `HAVIP`, such as `havip-9o233uri`. 
     * @return HaVipIds The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.
     */
    public String [] getHaVipIds() {
        return this.HaVipIds;
    }

    /**
     * Set The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.
     * @param HaVipIds The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.
     */
    public void setHaVipIds(String [] HaVipIds) {
        this.HaVipIds = HaVipIds;
    }

    /**
     * Get Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
li>havip-id - String - The unique ID of the HAVIP, such as `havip-9o233uri`.</li>
<li>havip-name - String - HAVIP name.</li>
<li>vpc-id - String - VPC ID of the HAVIP.</li>
<li>subnet-id - String - Subnet ID of the HAVIP.</li>
<li>vip - String - Virtual IP address of the HAVIP.</li>
<li>address-ip - String - Bound EIP.</li> 
     * @return Filters Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
li>havip-id - String - The unique ID of the HAVIP, such as `havip-9o233uri`.</li>
<li>havip-name - String - HAVIP name.</li>
<li>vpc-id - String - VPC ID of the HAVIP.</li>
<li>subnet-id - String - Subnet ID of the HAVIP.</li>
<li>vip - String - Virtual IP address of the HAVIP.</li>
<li>address-ip - String - Bound EIP.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
li>havip-id - String - The unique ID of the HAVIP, such as `havip-9o233uri`.</li>
<li>havip-name - String - HAVIP name.</li>
<li>vpc-id - String - VPC ID of the HAVIP.</li>
<li>subnet-id - String - Subnet ID of the HAVIP.</li>
<li>vip - String - Virtual IP address of the HAVIP.</li>
<li>address-ip - String - Bound EIP.</li>
     * @param Filters Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
li>havip-id - String - The unique ID of the HAVIP, such as `havip-9o233uri`.</li>
<li>havip-name - String - HAVIP name.</li>
<li>vpc-id - String - VPC ID of the HAVIP.</li>
<li>subnet-id - String - Subnet ID of the HAVIP.</li>
<li>vip - String - Virtual IP address of the HAVIP.</li>
<li>address-ip - String - Bound EIP.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get The returned quantity 
     * @return Limit The returned quantity
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The returned quantity
     * @param Limit The returned quantity
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeHaVipsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHaVipsRequest(DescribeHaVipsRequest source) {
        if (source.HaVipIds != null) {
            this.HaVipIds = new String[source.HaVipIds.length];
            for (int i = 0; i < source.HaVipIds.length; i++) {
                this.HaVipIds[i] = new String(source.HaVipIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "HaVipIds.", this.HaVipIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

