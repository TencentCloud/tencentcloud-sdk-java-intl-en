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

public class DescribeUsedIpAddressRequest extends AbstractModel{

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * List of IPs to be queried. The IPs must be within the VPC or subnet. Up to 100 IPs can be queried at a time.
    */
    @SerializedName("IpAddresses")
    @Expose
    private String [] IpAddresses;

    /**
    * The offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet instance ID 
     * @return SubnetId Subnet instance ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID
     * @param SubnetId Subnet instance ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get List of IPs to be queried. The IPs must be within the VPC or subnet. Up to 100 IPs can be queried at a time. 
     * @return IpAddresses List of IPs to be queried. The IPs must be within the VPC or subnet. Up to 100 IPs can be queried at a time.
     */
    public String [] getIpAddresses() {
        return this.IpAddresses;
    }

    /**
     * Set List of IPs to be queried. The IPs must be within the VPC or subnet. Up to 100 IPs can be queried at a time.
     * @param IpAddresses List of IPs to be queried. The IPs must be within the VPC or subnet. Up to 100 IPs can be queried at a time.
     */
    public void setIpAddresses(String [] IpAddresses) {
        this.IpAddresses = IpAddresses;
    }

    /**
     * Get The offset. Default value: 0 
     * @return Offset The offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: 0
     * @param Offset The offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit The number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit The number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUsedIpAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsedIpAddressRequest(DescribeUsedIpAddressRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IpAddresses != null) {
            this.IpAddresses = new String[source.IpAddresses.length];
            for (int i = 0; i < source.IpAddresses.length; i++) {
                this.IpAddresses[i] = new String(source.IpAddresses[i]);
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
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "IpAddresses.", this.IpAddresses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

