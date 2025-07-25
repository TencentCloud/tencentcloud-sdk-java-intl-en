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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewaysRequest extends AbstractModel {

    /**
    * The unified ID of the NAT gateways, such as `nat-123xx454`.
    */
    @SerializedName("NatGatewayIds")
    @Expose
    private String [] NatGatewayIds;

    /**
    * Filters. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter) The ID of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter) The tag key, such as `test-key`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
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
     * Get Filters. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter) The ID of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter) The tag key, such as `test-key`.</li> 
     * @return Filters Filters. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter) The ID of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter) The tag key, such as `test-key`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter) The ID of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter) The tag key, such as `test-key`.</li>
     * @param Filters Filters. `NatGatewayIds` and `Filters` cannot be specified at the same time.
<li>nat-gateway-id - String - (Filter) The ID of the protocol port template instance, such as `nat-123xx454`.</li>
<li>vpc-id - String - (Filter) The unique ID of the VPC, such as `vpc-123xx454`.</li>
<li>nat-gateway-name - String - (Filter) The ID of the protocol port template instance, such as `test_nat`.</li>
<li>tag-key - String - (Filter) The tag key, such as `test-key`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNatGatewaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewaysRequest(DescribeNatGatewaysRequest source) {
        if (source.NatGatewayIds != null) {
            this.NatGatewayIds = new String[source.NatGatewayIds.length];
            for (int i = 0; i < source.NatGatewayIds.length; i++) {
                this.NatGatewayIds[i] = new String(source.NatGatewayIds[i]);
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
        this.setParamArraySimple(map, prefix + "NatGatewayIds.", this.NatGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

