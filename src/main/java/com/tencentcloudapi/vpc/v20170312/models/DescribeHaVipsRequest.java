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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHaVipsRequest extends AbstractModel{

    /**
    * The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.
    */
    @SerializedName("HaVipIds")
    @Expose
    private String [] HaVipIds;

    /**
    * Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>havip-id - String - The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.</li>
<li>havip-name - String - `HAVIP` name.</li>
<li>vpc-id - String - The `ID` of the VPC where `HAVIP` is located.</li>
<li>subnet-id - String - The `ID` of the subnet where `HAVIP` is located.</li>
<li>address-ip - String - The `EIP` to which `HAVIP` is bound.</li>
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
<li>havip-id - String - The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.</li>
<li>havip-name - String - `HAVIP` name.</li>
<li>vpc-id - String - The `ID` of the VPC where `HAVIP` is located.</li>
<li>subnet-id - String - The `ID` of the subnet where `HAVIP` is located.</li>
<li>address-ip - String - The `EIP` to which `HAVIP` is bound.</li> 
     * @return Filters Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>havip-id - String - The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.</li>
<li>havip-name - String - `HAVIP` name.</li>
<li>vpc-id - String - The `ID` of the VPC where `HAVIP` is located.</li>
<li>subnet-id - String - The `ID` of the subnet where `HAVIP` is located.</li>
<li>address-ip - String - The `EIP` to which `HAVIP` is bound.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>havip-id - String - The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.</li>
<li>havip-name - String - `HAVIP` name.</li>
<li>vpc-id - String - The `ID` of the VPC where `HAVIP` is located.</li>
<li>subnet-id - String - The `ID` of the subnet where `HAVIP` is located.</li>
<li>address-ip - String - The `EIP` to which `HAVIP` is bound.</li>
     * @param Filters Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>havip-id - String - The unique `ID` of the `HAVIP`, such as `havip-9o233uri`.</li>
<li>havip-name - String - `HAVIP` name.</li>
<li>vpc-id - String - The `ID` of the VPC where `HAVIP` is located.</li>
<li>subnet-id - String - The `ID` of the subnet where `HAVIP` is located.</li>
<li>address-ip - String - The `EIP` to which `HAVIP` is bound.</li>
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

