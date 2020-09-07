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

public class DisassociateDirectConnectGatewayNatGatewayRequest extends AbstractModel{

    /**
    * The direct connect gateway ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The NAT Gateway ID.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
     * Get The direct connect gateway ID. 
     * @return VpcId The direct connect gateway ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The direct connect gateway ID.
     * @param VpcId The direct connect gateway ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The NAT Gateway ID. 
     * @return NatGatewayId The NAT Gateway ID.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The NAT Gateway ID.
     * @param NatGatewayId The NAT Gateway ID.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API. 
     * @return DirectConnectGatewayId The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
     * @param DirectConnectGatewayId The ID of the VPC instance, which can be obtained from the `VpcId` field in response of the `DescribeVpcs` API.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);

    }
}

