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

public class DescribeNatGatewaysRequest extends AbstractModel{

    /**
    * The unified ID of the NAT gateways, such as `nat-123xx454`.
    */
    @SerializedName("NatGatewayIds")
    @Expose
    private String [] NatGatewayIds;

    /**
    * Filter condition. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter condition) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter condition) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter condition) The name of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter condition) The tag key, such as `test-key`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of values to be returned. The default value is 20. Maximum is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The unified ID of the NAT gateways, such as `nat-123xx454`. 
     * @return NatGatewayIds The unified ID of the NAT gateways, such as `nat-123xx454`.
     */
    public String [] getNatGatewayIds() {
        return this.NatGatewayIds;
    }

    /**
     * Set The unified ID of the NAT gateways, such as `nat-123xx454`.
     * @param NatGatewayIds The unified ID of the NAT gateways, such as `nat-123xx454`.
     */
    public void setNatGatewayIds(String [] NatGatewayIds) {
        this.NatGatewayIds = NatGatewayIds;
    }

    /**
     * Get Filter condition. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter condition) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter condition) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter condition) The name of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter condition) The tag key, such as `test-key`.</li> 
     * @return Filters Filter condition. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter condition) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter condition) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter condition) The name of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter condition) The tag key, such as `test-key`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter condition) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter condition) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter condition) The name of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter condition) The tag key, such as `test-key`.</li>
     * @param Filters Filter condition. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter condition) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter condition) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter condition) The name of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter condition) The tag key, such as `test-key`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of values to be returned. The default value is 20. Maximum is 100. 
     * @return Limit Number of values to be returned. The default value is 20. Maximum is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of values to be returned. The default value is 20. Maximum is 100.
     * @param Limit Number of values to be returned. The default value is 20. Maximum is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NatGatewayIds.", this.NatGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

