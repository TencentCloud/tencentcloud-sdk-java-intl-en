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

public class DescribeDirectConnectGatewaysRequest extends AbstractModel{

    /**
    * The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.
    */
    @SerializedName("DirectConnectGatewayIds")
    @Expose
    private String [] DirectConnectGatewayIds;

    /**
    * Filter condition. `DirectConnectGatewayIds` and `Filters` cannot be specified at the same time..
<li>direct-connect-gateway-id - String - The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.</li>
<li>direct-connect-gateway-name - String - The name of the direct connect gateway. The default is fuzzy query.</li>
<li>direct-connect-gateway-ip - String - The `IP` of the direct connect gateway.</li>
<li>gateway-type - String - The gateway type. Valid values: `NORMAL` (Standard type), `NAT` (NAT type).</li>
<li>network-type- String - The network type. Valid values: `VPC` (VPC type), `CCN` (CCN type).</li>
<li>ccn-id - String - The `ID` of the CCN where the direct connect gateway resides.</li>
<li>vpc-id - String - The `ID` of the VPC where the direct connect gateway resides.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The returned quantity.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`. 
     * @return DirectConnectGatewayIds The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.
     */
    public String [] getDirectConnectGatewayIds() {
        return this.DirectConnectGatewayIds;
    }

    /**
     * Set The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.
     * @param DirectConnectGatewayIds The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.
     */
    public void setDirectConnectGatewayIds(String [] DirectConnectGatewayIds) {
        this.DirectConnectGatewayIds = DirectConnectGatewayIds;
    }

    /**
     * Get Filter condition. `DirectConnectGatewayIds` and `Filters` cannot be specified at the same time..
<li>direct-connect-gateway-id - String - The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.</li>
<li>direct-connect-gateway-name - String - The name of the direct connect gateway. The default is fuzzy query.</li>
<li>direct-connect-gateway-ip - String - The `IP` of the direct connect gateway.</li>
<li>gateway-type - String - The gateway type. Valid values: `NORMAL` (Standard type), `NAT` (NAT type).</li>
<li>network-type- String - The network type. Valid values: `VPC` (VPC type), `CCN` (CCN type).</li>
<li>ccn-id - String - The `ID` of the CCN where the direct connect gateway resides.</li>
<li>vpc-id - String - The `ID` of the VPC where the direct connect gateway resides.</li> 
     * @return Filters Filter condition. `DirectConnectGatewayIds` and `Filters` cannot be specified at the same time..
<li>direct-connect-gateway-id - String - The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.</li>
<li>direct-connect-gateway-name - String - The name of the direct connect gateway. The default is fuzzy query.</li>
<li>direct-connect-gateway-ip - String - The `IP` of the direct connect gateway.</li>
<li>gateway-type - String - The gateway type. Valid values: `NORMAL` (Standard type), `NAT` (NAT type).</li>
<li>network-type- String - The network type. Valid values: `VPC` (VPC type), `CCN` (CCN type).</li>
<li>ccn-id - String - The `ID` of the CCN where the direct connect gateway resides.</li>
<li>vpc-id - String - The `ID` of the VPC where the direct connect gateway resides.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `DirectConnectGatewayIds` and `Filters` cannot be specified at the same time..
<li>direct-connect-gateway-id - String - The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.</li>
<li>direct-connect-gateway-name - String - The name of the direct connect gateway. The default is fuzzy query.</li>
<li>direct-connect-gateway-ip - String - The `IP` of the direct connect gateway.</li>
<li>gateway-type - String - The gateway type. Valid values: `NORMAL` (Standard type), `NAT` (NAT type).</li>
<li>network-type- String - The network type. Valid values: `VPC` (VPC type), `CCN` (CCN type).</li>
<li>ccn-id - String - The `ID` of the CCN where the direct connect gateway resides.</li>
<li>vpc-id - String - The `ID` of the VPC where the direct connect gateway resides.</li>
     * @param Filters Filter condition. `DirectConnectGatewayIds` and `Filters` cannot be specified at the same time..
<li>direct-connect-gateway-id - String - The unique `ID` of the direct connect gateway, such as `dcg-9o233uri`.</li>
<li>direct-connect-gateway-name - String - The name of the direct connect gateway. The default is fuzzy query.</li>
<li>direct-connect-gateway-ip - String - The `IP` of the direct connect gateway.</li>
<li>gateway-type - String - The gateway type. Valid values: `NORMAL` (Standard type), `NAT` (NAT type).</li>
<li>network-type- String - The network type. Valid values: `VPC` (VPC type), `CCN` (CCN type).</li>
<li>ccn-id - String - The `ID` of the CCN where the direct connect gateway resides.</li>
<li>vpc-id - String - The `ID` of the VPC where the direct connect gateway resides.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The offset. 
     * @return Offset The offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset.
     * @param Offset The offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The returned quantity. 
     * @return Limit The returned quantity.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The returned quantity.
     * @param Limit The returned quantity.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DirectConnectGatewayIds.", this.DirectConnectGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

