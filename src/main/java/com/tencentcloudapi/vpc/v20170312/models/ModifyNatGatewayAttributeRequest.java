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

public class ModifyNatGatewayAttributeRequest extends AbstractModel{

    /**
    * The ID of the NAT gateway, such as `nat-df45454`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * The NAT gateway name, such as `test_nat`.
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * The maximum outbound bandwidth of the NAT gateway. Unit: Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Whether to modify the security group bound to the NAT Gateway
    */
    @SerializedName("ModifySecurityGroup")
    @Expose
    private Boolean ModifySecurityGroup;

    /**
    * The final security groups bound to the NAT Gateway, such as `['sg-1n232323', 'sg-o4242424']`. An empty list indicates that all the security groups have been deleted.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get The ID of the NAT gateway, such as `nat-df45454`. 
     * @return NatGatewayId The ID of the NAT gateway, such as `nat-df45454`.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The ID of the NAT gateway, such as `nat-df45454`.
     * @param NatGatewayId The ID of the NAT gateway, such as `nat-df45454`.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get The NAT gateway name, such as `test_nat`. 
     * @return NatGatewayName The NAT gateway name, such as `test_nat`.
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set The NAT gateway name, such as `test_nat`.
     * @param NatGatewayName The NAT gateway name, such as `test_nat`.
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get The maximum outbound bandwidth of the NAT gateway. Unit: Mbps. 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the NAT gateway. Unit: Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth of the NAT gateway. Unit: Mbps.
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the NAT gateway. Unit: Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Whether to modify the security group bound to the NAT Gateway 
     * @return ModifySecurityGroup Whether to modify the security group bound to the NAT Gateway
     */
    public Boolean getModifySecurityGroup() {
        return this.ModifySecurityGroup;
    }

    /**
     * Set Whether to modify the security group bound to the NAT Gateway
     * @param ModifySecurityGroup Whether to modify the security group bound to the NAT Gateway
     */
    public void setModifySecurityGroup(Boolean ModifySecurityGroup) {
        this.ModifySecurityGroup = ModifySecurityGroup;
    }

    /**
     * Get The final security groups bound to the NAT Gateway, such as `['sg-1n232323', 'sg-o4242424']`. An empty list indicates that all the security groups have been deleted. 
     * @return SecurityGroupIds The final security groups bound to the NAT Gateway, such as `['sg-1n232323', 'sg-o4242424']`. An empty list indicates that all the security groups have been deleted.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The final security groups bound to the NAT Gateway, such as `['sg-1n232323', 'sg-o4242424']`. An empty list indicates that all the security groups have been deleted.
     * @param SecurityGroupIds The final security groups bound to the NAT Gateway, such as `['sg-1n232323', 'sg-o4242424']`. An empty list indicates that all the security groups have been deleted.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ModifySecurityGroup", this.ModifySecurityGroup);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

