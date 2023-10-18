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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualPrivateCloud extends AbstractModel {

    /**
    * VPC ID, such as `vpc-xxx`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of the VPC, such as `subnet-xxx`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Whether it is used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
    */
    @SerializedName("AsVpcGateway")
    @Expose
    private Boolean AsVpcGateway;

    /**
    * Array of VPC subnet IPs. This parameter can be used to create instances or modify the VPC attributes of instances.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Number of the IPv6 addresses to be randomly generated for the ENI.
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
     * Get VPC ID, such as `vpc-xxx`. 
     * @return VpcId VPC ID, such as `vpc-xxx`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, such as `vpc-xxx`.
     * @param VpcId VPC ID, such as `vpc-xxx`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID of the VPC, such as `subnet-xxx`. 
     * @return SubnetId Subnet ID of the VPC, such as `subnet-xxx`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of the VPC, such as `subnet-xxx`.
     * @param SubnetId Subnet ID of the VPC, such as `subnet-xxx`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Whether it is used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE. 
     * @return AsVpcGateway Whether it is used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
     */
    public Boolean getAsVpcGateway() {
        return this.AsVpcGateway;
    }

    /**
     * Set Whether it is used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
     * @param AsVpcGateway Whether it is used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Valid values:
TRUE: yes
FALSE: no

Default value: FALSE.
     */
    public void setAsVpcGateway(Boolean AsVpcGateway) {
        this.AsVpcGateway = AsVpcGateway;
    }

    /**
     * Get Array of VPC subnet IPs. This parameter can be used to create instances or modify the VPC attributes of instances. 
     * @return PrivateIpAddresses Array of VPC subnet IPs. This parameter can be used to create instances or modify the VPC attributes of instances.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Array of VPC subnet IPs. This parameter can be used to create instances or modify the VPC attributes of instances.
     * @param PrivateIpAddresses Array of VPC subnet IPs. This parameter can be used to create instances or modify the VPC attributes of instances.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Number of the IPv6 addresses to be randomly generated for the ENI. 
     * @return Ipv6AddressCount Number of the IPv6 addresses to be randomly generated for the ENI.
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set Number of the IPv6 addresses to be randomly generated for the ENI.
     * @param Ipv6AddressCount Number of the IPv6 addresses to be randomly generated for the ENI.
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    public VirtualPrivateCloud() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualPrivateCloud(VirtualPrivateCloud source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AsVpcGateway != null) {
            this.AsVpcGateway = new Boolean(source.AsVpcGateway);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AsVpcGateway", this.AsVpcGateway);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);

    }
}

