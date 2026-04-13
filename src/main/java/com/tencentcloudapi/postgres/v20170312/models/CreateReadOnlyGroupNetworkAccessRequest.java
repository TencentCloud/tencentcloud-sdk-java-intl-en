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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReadOnlyGroupNetworkAccessRequest extends AbstractModel {

    /**
    * ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/product/409/39725?lang=en).
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Unified VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Whether to manually assign the VIP. Valid values: `true` (manually assign), `false` (automatically assign).
    */
    @SerializedName("IsAssignVip")
    @Expose
    private Boolean IsAssignVip;

    /**
    * Target VIP address. when this parameter is not specified and IsAssignVip is true, the system automatically assigns a VIP by default.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/product/409/39725?lang=en). 
     * @return ReadOnlyGroupId ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/product/409/39725?lang=en).
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/product/409/39725?lang=en).
     * @param ReadOnlyGroupId ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/product/409/39725?lang=en).
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Unified VPC ID. 
     * @return VpcId Unified VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unified VPC ID.
     * @param VpcId Unified VPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Whether to manually assign the VIP. Valid values: `true` (manually assign), `false` (automatically assign). 
     * @return IsAssignVip Whether to manually assign the VIP. Valid values: `true` (manually assign), `false` (automatically assign).
     */
    public Boolean getIsAssignVip() {
        return this.IsAssignVip;
    }

    /**
     * Set Whether to manually assign the VIP. Valid values: `true` (manually assign), `false` (automatically assign).
     * @param IsAssignVip Whether to manually assign the VIP. Valid values: `true` (manually assign), `false` (automatically assign).
     */
    public void setIsAssignVip(Boolean IsAssignVip) {
        this.IsAssignVip = IsAssignVip;
    }

    /**
     * Get Target VIP address. when this parameter is not specified and IsAssignVip is true, the system automatically assigns a VIP by default. 
     * @return Vip Target VIP address. when this parameter is not specified and IsAssignVip is true, the system automatically assigns a VIP by default.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Target VIP address. when this parameter is not specified and IsAssignVip is true, the system automatically assigns a VIP by default.
     * @param Vip Target VIP address. when this parameter is not specified and IsAssignVip is true, the system automatically assigns a VIP by default.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public CreateReadOnlyGroupNetworkAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyGroupNetworkAccessRequest(CreateReadOnlyGroupNetworkAccessRequest source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IsAssignVip != null) {
            this.IsAssignVip = new Boolean(source.IsAssignVip);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "IsAssignVip", this.IsAssignVip);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

