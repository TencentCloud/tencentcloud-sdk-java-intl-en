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

public class AssistantCidr extends AbstractModel {

    /**
    * The `ID` of a `VPC` instance, such as `vpc-6v2ht8q5`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The secondary CIDR, such as `172.16.0.0/16`.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * The secondary CIDR block type. 0: common secondary CIDR block. 1: container secondary CIDR block. Default: 0.
    */
    @SerializedName("AssistantType")
    @Expose
    private Long AssistantType;

    /**
    * Subnets divided by the secondary CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetSet")
    @Expose
    private Subnet [] SubnetSet;

    /**
     * Get The `ID` of a `VPC` instance, such as `vpc-6v2ht8q5`. 
     * @return VpcId The `ID` of a `VPC` instance, such as `vpc-6v2ht8q5`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of a `VPC` instance, such as `vpc-6v2ht8q5`.
     * @param VpcId The `ID` of a `VPC` instance, such as `vpc-6v2ht8q5`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The secondary CIDR, such as `172.16.0.0/16`. 
     * @return CidrBlock The secondary CIDR, such as `172.16.0.0/16`.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The secondary CIDR, such as `172.16.0.0/16`.
     * @param CidrBlock The secondary CIDR, such as `172.16.0.0/16`.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get The secondary CIDR block type. 0: common secondary CIDR block. 1: container secondary CIDR block. Default: 0. 
     * @return AssistantType The secondary CIDR block type. 0: common secondary CIDR block. 1: container secondary CIDR block. Default: 0.
     */
    public Long getAssistantType() {
        return this.AssistantType;
    }

    /**
     * Set The secondary CIDR block type. 0: common secondary CIDR block. 1: container secondary CIDR block. Default: 0.
     * @param AssistantType The secondary CIDR block type. 0: common secondary CIDR block. 1: container secondary CIDR block. Default: 0.
     */
    public void setAssistantType(Long AssistantType) {
        this.AssistantType = AssistantType;
    }

    /**
     * Get Subnets divided by the secondary CIDR.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetSet Subnets divided by the secondary CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Subnet [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set Subnets divided by the secondary CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetSet Subnets divided by the secondary CIDR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetSet(Subnet [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    public AssistantCidr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssistantCidr(AssistantCidr source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.AssistantType != null) {
            this.AssistantType = new Long(source.AssistantType);
        }
        if (source.SubnetSet != null) {
            this.SubnetSet = new Subnet[source.SubnetSet.length];
            for (int i = 0; i < source.SubnetSet.length; i++) {
                this.SubnetSet[i] = new Subnet(source.SubnetSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "AssistantType", this.AssistantType);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);

    }
}

