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

public class DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest extends AbstractModel {

    /**
    * NAT gateway ID.
    */
    @SerializedName("NatGatewayIds")
    @Expose
    private String [] NatGatewayIds;

    /**
    * Filters:
`NatGatewayIds` and `Filters` cannot be specified at the same time.
<li> `nat-gateway-id`: The NAT gateway ID, such as `nat-0yi4hekt`.</li>
<li> `vpc-id`: The VPC ID, such as `vpc-0yi4hekt`.</li>
<li> `public-ip-address`: The EIP, such as `139.199.232.238`.</li>
<li>`public-port`: The public network port.</li>
<li>`private-ip-address`: The private IP, such as `10.0.0.1`.</li>
<li>`private-port`. The private network port.</li>
<li>`description`. The rule description.</li>
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
     * Get NAT gateway ID. 
     * @return NatGatewayIds NAT gateway ID.
     */
    public String [] getNatGatewayIds() {
        return this.NatGatewayIds;
    }

    /**
     * Set NAT gateway ID.
     * @param NatGatewayIds NAT gateway ID.
     */
    public void setNatGatewayIds(String [] NatGatewayIds) {
        this.NatGatewayIds = NatGatewayIds;
    }

    /**
     * Get Filters:
`NatGatewayIds` and `Filters` cannot be specified at the same time.
<li> `nat-gateway-id`: The NAT gateway ID, such as `nat-0yi4hekt`.</li>
<li> `vpc-id`: The VPC ID, such as `vpc-0yi4hekt`.</li>
<li> `public-ip-address`: The EIP, such as `139.199.232.238`.</li>
<li>`public-port`: The public network port.</li>
<li>`private-ip-address`: The private IP, such as `10.0.0.1`.</li>
<li>`private-port`. The private network port.</li>
<li>`description`. The rule description.</li> 
     * @return Filters Filters:
`NatGatewayIds` and `Filters` cannot be specified at the same time.
<li> `nat-gateway-id`: The NAT gateway ID, such as `nat-0yi4hekt`.</li>
<li> `vpc-id`: The VPC ID, such as `vpc-0yi4hekt`.</li>
<li> `public-ip-address`: The EIP, such as `139.199.232.238`.</li>
<li>`public-port`: The public network port.</li>
<li>`private-ip-address`: The private IP, such as `10.0.0.1`.</li>
<li>`private-port`. The private network port.</li>
<li>`description`. The rule description.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters:
`NatGatewayIds` and `Filters` cannot be specified at the same time.
<li> `nat-gateway-id`: The NAT gateway ID, such as `nat-0yi4hekt`.</li>
<li> `vpc-id`: The VPC ID, such as `vpc-0yi4hekt`.</li>
<li> `public-ip-address`: The EIP, such as `139.199.232.238`.</li>
<li>`public-port`: The public network port.</li>
<li>`private-ip-address`: The private IP, such as `10.0.0.1`.</li>
<li>`private-port`. The private network port.</li>
<li>`description`. The rule description.</li>
     * @param Filters Filters:
`NatGatewayIds` and `Filters` cannot be specified at the same time.
<li> `nat-gateway-id`: The NAT gateway ID, such as `nat-0yi4hekt`.</li>
<li> `vpc-id`: The VPC ID, such as `vpc-0yi4hekt`.</li>
<li> `public-ip-address`: The EIP, such as `139.199.232.238`.</li>
<li>`public-port`: The public network port.</li>
<li>`private-ip-address`: The private IP, such as `10.0.0.1`.</li>
<li>`private-port`. The private network port.</li>
<li>`description`. The rule description.</li>
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

    public DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest(DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest source) {
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

