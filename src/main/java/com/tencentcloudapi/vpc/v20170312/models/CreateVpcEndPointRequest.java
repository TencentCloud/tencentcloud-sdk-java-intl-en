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

public class CreateVpcEndPointRequest extends AbstractModel {

    /**
    * VPC instance ID. obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/1108/43663?from_cn_redirect=1).
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance ID. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Endpoint name. limited to 60 characters.
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * Endpoint service ID, which can be obtained through the [DescribeVpcEndPointService](https://www.tencentcloud.comom/document/product/215/54678?from_cn_redirect=1) api.
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * Endpoint VIP. You can apply for a specified IP.
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * Security group ID. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.comom/document/product/215/15808?from_cn_redirect=1).
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Protocol type. supports Ipv4 and Ipv6. default is Ipv4.
    */
    @SerializedName("IpAddressType")
    @Expose
    private String IpAddressType;

    /**
     * Get VPC instance ID. obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/1108/43663?from_cn_redirect=1). 
     * @return VpcId VPC instance ID. obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/1108/43663?from_cn_redirect=1).
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID. obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/1108/43663?from_cn_redirect=1).
     * @param VpcId VPC instance ID. obtain through the API [DescribeVpcs](https://www.tencentcloud.comom/document/product/1108/43663?from_cn_redirect=1).
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet instance ID. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api. 
     * @return SubnetId Subnet instance ID. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
     * @param SubnetId Subnet instance ID. can be obtained through the [DescribeSubnets](https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1) api.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Endpoint name. limited to 60 characters. 
     * @return EndPointName Endpoint name. limited to 60 characters.
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set Endpoint name. limited to 60 characters.
     * @param EndPointName Endpoint name. limited to 60 characters.
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get Endpoint service ID, which can be obtained through the [DescribeVpcEndPointService](https://www.tencentcloud.comom/document/product/215/54678?from_cn_redirect=1) api. 
     * @return EndPointServiceId Endpoint service ID, which can be obtained through the [DescribeVpcEndPointService](https://www.tencentcloud.comom/document/product/215/54678?from_cn_redirect=1) api.
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set Endpoint service ID, which can be obtained through the [DescribeVpcEndPointService](https://www.tencentcloud.comom/document/product/215/54678?from_cn_redirect=1) api.
     * @param EndPointServiceId Endpoint service ID, which can be obtained through the [DescribeVpcEndPointService](https://www.tencentcloud.comom/document/product/215/54678?from_cn_redirect=1) api.
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get Endpoint VIP. You can apply for a specified IP. 
     * @return EndPointVip Endpoint VIP. You can apply for a specified IP.
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set Endpoint VIP. You can apply for a specified IP.
     * @param EndPointVip Endpoint VIP. You can apply for a specified IP.
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get Security group ID. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.comom/document/product/215/15808?from_cn_redirect=1). 
     * @return SecurityGroupId Security group ID. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.comom/document/product/215/15808?from_cn_redirect=1).
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.comom/document/product/215/15808?from_cn_redirect=1).
     * @param SecurityGroupId Security group ID. can be obtained through the API [DescribeSecurityGroups](https://www.tencentcloud.comom/document/product/215/15808?from_cn_redirect=1).
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
     * @param Tags List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Protocol type. supports Ipv4 and Ipv6. default is Ipv4. 
     * @return IpAddressType Protocol type. supports Ipv4 and Ipv6. default is Ipv4.
     */
    public String getIpAddressType() {
        return this.IpAddressType;
    }

    /**
     * Set Protocol type. supports Ipv4 and Ipv6. default is Ipv4.
     * @param IpAddressType Protocol type. supports Ipv4 and Ipv6. default is Ipv4.
     */
    public void setIpAddressType(String IpAddressType) {
        this.IpAddressType = IpAddressType;
    }

    public CreateVpcEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcEndPointRequest(CreateVpcEndPointRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IpAddressType != null) {
            this.IpAddressType = new String(source.IpAddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IpAddressType", this.IpAddressType);

    }
}

