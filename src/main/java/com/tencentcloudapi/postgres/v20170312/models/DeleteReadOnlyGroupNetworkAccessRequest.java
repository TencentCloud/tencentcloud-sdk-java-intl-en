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

public class DeleteReadOnlyGroupNetworkAccessRequest extends AbstractModel {

    /**
    * ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/api/409/52599?from_cn_redirect=1).
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Unified VPC ID. If you want to delete the classic network, set the parameter to `0`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. If you want to delete the classic network, set the parameter to `0`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Target VIP.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/api/409/52599?from_cn_redirect=1). 
     * @return ReadOnlyGroupId ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/api/409/52599?from_cn_redirect=1).
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/api/409/52599?from_cn_redirect=1).
     * @param ReadOnlyGroupId ROGroupId specifies the read-only group ID in the format of pgrogrp-4t9c6g7k. it can be obtained through the DescribeReadOnlyGroups api (https://www.tencentcloud.com/document/api/409/52599?from_cn_redirect=1).
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Unified VPC ID. If you want to delete the classic network, set the parameter to `0`. 
     * @return VpcId Unified VPC ID. If you want to delete the classic network, set the parameter to `0`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unified VPC ID. If you want to delete the classic network, set the parameter to `0`.
     * @param VpcId Unified VPC ID. If you want to delete the classic network, set the parameter to `0`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. If you want to delete the classic network, set the parameter to `0`. 
     * @return SubnetId Subnet ID. If you want to delete the classic network, set the parameter to `0`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. If you want to delete the classic network, set the parameter to `0`.
     * @param SubnetId Subnet ID. If you want to delete the classic network, set the parameter to `0`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Target VIP. 
     * @return Vip Target VIP.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Target VIP.
     * @param Vip Target VIP.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DeleteReadOnlyGroupNetworkAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReadOnlyGroupNetworkAccessRequest(DeleteReadOnlyGroupNetworkAccessRequest source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
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
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

