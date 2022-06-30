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

public class DescribeNatGatewayDirectConnectGatewayRouteRequest extends AbstractModel{

    /**
    * Unique ID of the NAT gateway
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Unique ID of VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Valid range: 0-200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Greater than 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Unique ID of the NAT gateway 
     * @return NatGatewayId Unique ID of the NAT gateway
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set Unique ID of the NAT gateway
     * @param NatGatewayId Unique ID of the NAT gateway
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get Unique ID of VPC 
     * @return VpcId Unique ID of VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of VPC
     * @param VpcId Unique ID of VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Valid range: 0-200 
     * @return Limit Valid range: 0-200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Valid range: 0-200
     * @param Limit Valid range: 0-200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Greater than 0 
     * @return Offset Greater than 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Greater than 0
     * @param Offset Greater than 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNatGatewayDirectConnectGatewayRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayDirectConnectGatewayRouteRequest(DescribeNatGatewayDirectConnectGatewayRouteRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

