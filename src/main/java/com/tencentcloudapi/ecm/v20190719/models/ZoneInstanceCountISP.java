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

public class ZoneInstanceCountISP extends AbstractModel {

    /**
    * The AZ in which to create an instance.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of instances to be created in the current AZ.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * ISP name. Valid values:
CTCC: China Telecom
CUCC: China Unicom
CMCC: China Mobile
If there are multiple ISP names, you need to separate them by semicolons, such as `CMCC;CUCC;CTCC`. To use multiple ISPs, contact Tencent Cloud customer service for assistance.
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * ID of the specified VPC. You must specify both `SubnetId` and `VpcId` or neither
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the specified subnet. You must specify both `SubnetId` and `VpcId` or neither
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Private IP of the specified primary ENI. You must specify both `SubnetId` and `VpcId` at the same time. The number of IP addresses must be the same as `InstanceCount`. You can get the private IP of the secondary ENI of a multi-IP server through DHCP in the same subnet.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Number of the IPv6 addresses to be randomly generated for the ENI, which cannot be greater than 1.
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
     * Get The AZ in which to create an instance. 
     * @return Zone The AZ in which to create an instance.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The AZ in which to create an instance.
     * @param Zone The AZ in which to create an instance.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Number of instances to be created in the current AZ. 
     * @return InstanceCount Number of instances to be created in the current AZ.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances to be created in the current AZ.
     * @param InstanceCount Number of instances to be created in the current AZ.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get ISP name. Valid values:
CTCC: China Telecom
CUCC: China Unicom
CMCC: China Mobile
If there are multiple ISP names, you need to separate them by semicolons, such as `CMCC;CUCC;CTCC`. To use multiple ISPs, contact Tencent Cloud customer service for assistance. 
     * @return ISP ISP name. Valid values:
CTCC: China Telecom
CUCC: China Unicom
CMCC: China Mobile
If there are multiple ISP names, you need to separate them by semicolons, such as `CMCC;CUCC;CTCC`. To use multiple ISPs, contact Tencent Cloud customer service for assistance.
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set ISP name. Valid values:
CTCC: China Telecom
CUCC: China Unicom
CMCC: China Mobile
If there are multiple ISP names, you need to separate them by semicolons, such as `CMCC;CUCC;CTCC`. To use multiple ISPs, contact Tencent Cloud customer service for assistance.
     * @param ISP ISP name. Valid values:
CTCC: China Telecom
CUCC: China Unicom
CMCC: China Mobile
If there are multiple ISP names, you need to separate them by semicolons, such as `CMCC;CUCC;CTCC`. To use multiple ISPs, contact Tencent Cloud customer service for assistance.
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get ID of the specified VPC. You must specify both `SubnetId` and `VpcId` or neither 
     * @return VpcId ID of the specified VPC. You must specify both `SubnetId` and `VpcId` or neither
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the specified VPC. You must specify both `SubnetId` and `VpcId` or neither
     * @param VpcId ID of the specified VPC. You must specify both `SubnetId` and `VpcId` or neither
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the specified subnet. You must specify both `SubnetId` and `VpcId` or neither 
     * @return SubnetId ID of the specified subnet. You must specify both `SubnetId` and `VpcId` or neither
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the specified subnet. You must specify both `SubnetId` and `VpcId` or neither
     * @param SubnetId ID of the specified subnet. You must specify both `SubnetId` and `VpcId` or neither
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Private IP of the specified primary ENI. You must specify both `SubnetId` and `VpcId` at the same time. The number of IP addresses must be the same as `InstanceCount`. You can get the private IP of the secondary ENI of a multi-IP server through DHCP in the same subnet. 
     * @return PrivateIpAddresses Private IP of the specified primary ENI. You must specify both `SubnetId` and `VpcId` at the same time. The number of IP addresses must be the same as `InstanceCount`. You can get the private IP of the secondary ENI of a multi-IP server through DHCP in the same subnet.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Private IP of the specified primary ENI. You must specify both `SubnetId` and `VpcId` at the same time. The number of IP addresses must be the same as `InstanceCount`. You can get the private IP of the secondary ENI of a multi-IP server through DHCP in the same subnet.
     * @param PrivateIpAddresses Private IP of the specified primary ENI. You must specify both `SubnetId` and `VpcId` at the same time. The number of IP addresses must be the same as `InstanceCount`. You can get the private IP of the secondary ENI of a multi-IP server through DHCP in the same subnet.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Number of the IPv6 addresses to be randomly generated for the ENI, which cannot be greater than 1. 
     * @return Ipv6AddressCount Number of the IPv6 addresses to be randomly generated for the ENI, which cannot be greater than 1.
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set Number of the IPv6 addresses to be randomly generated for the ENI, which cannot be greater than 1.
     * @param Ipv6AddressCount Number of the IPv6 addresses to be randomly generated for the ENI, which cannot be greater than 1.
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    public ZoneInstanceCountISP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInstanceCountISP(ZoneInstanceCountISP source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);

    }
}

