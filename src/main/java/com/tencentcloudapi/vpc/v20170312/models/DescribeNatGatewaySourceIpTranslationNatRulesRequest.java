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

public class DescribeNatGatewaySourceIpTranslationNatRulesRequest extends AbstractModel{

    /**
    * The unique ID of the NAT Gateway, such as `nat-123xx454`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Filter conditions:
<li> resource-id, the subnet ID (such as `subnet-0yi4hekt`) or CVM ID</li>
<li> public-ip-address, the EIP, such as `139.199.232.238`</li>
<li>description, the rule description</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default is 0.
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
     * Get The unique ID of the NAT Gateway, such as `nat-123xx454`. 
     * @return NatGatewayId The unique ID of the NAT Gateway, such as `nat-123xx454`.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The unique ID of the NAT Gateway, such as `nat-123xx454`.
     * @param NatGatewayId The unique ID of the NAT Gateway, such as `nat-123xx454`.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get Filter conditions:
<li> resource-id, the subnet ID (such as `subnet-0yi4hekt`) or CVM ID</li>
<li> public-ip-address, the EIP, such as `139.199.232.238`</li>
<li>description, the rule description</li> 
     * @return Filters Filter conditions:
<li> resource-id, the subnet ID (such as `subnet-0yi4hekt`) or CVM ID</li>
<li> public-ip-address, the EIP, such as `139.199.232.238`</li>
<li>description, the rule description</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions:
<li> resource-id, the subnet ID (such as `subnet-0yi4hekt`) or CVM ID</li>
<li> public-ip-address, the EIP, such as `139.199.232.238`</li>
<li>description, the rule description</li>
     * @param Filters Filter conditions:
<li> resource-id, the subnet ID (such as `subnet-0yi4hekt`) or CVM ID</li>
<li> public-ip-address, the EIP, such as `139.199.232.238`</li>
<li>description, the rule description</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default is 0. 
     * @return Offset Offset. Default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default is 0.
     * @param Offset Offset. Default is 0.
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

    public DescribeNatGatewaySourceIpTranslationNatRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewaySourceIpTranslationNatRulesRequest(DescribeNatGatewaySourceIpTranslationNatRulesRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
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
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

