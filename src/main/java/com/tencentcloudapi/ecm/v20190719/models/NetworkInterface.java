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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInterface extends AbstractModel {

    /**
    * ENI instance ID, such as `eni-f1xjkw1b`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * ENI name.
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * ENI description.
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * Subnet instance ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Bound security groups.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * Whether it is the primary ENI.
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * MAC address.
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * ENI status:
PENDING: creating
AVAILABLE: available
ATTACHING: binding
DETACHING: unbinding
DELETING: deleting
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Private IP information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIpAddressSet")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddressSet;

    /**
    * Bound CVM object.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Attachment")
    @Expose
    private NetworkInterfaceAttachment Attachment;

    /**
    * AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * List of IPv6 addresses.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6AddressSet")
    @Expose
    private Ipv6Address [] Ipv6AddressSet;

    /**
    * Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * ENI type. Valid values: 0: ENI; 1: EVM ENI.
    */
    @SerializedName("EniType")
    @Expose
    private Long EniType;

    /**
    * ECM region (EcmRegion)
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Type of the resource bound with an ENI. Valid values: `cvm` and `eks`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
     * Get ENI instance ID, such as `eni-f1xjkw1b`. 
     * @return NetworkInterfaceId ENI instance ID, such as `eni-f1xjkw1b`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ENI instance ID, such as `eni-f1xjkw1b`.
     * @param NetworkInterfaceId ENI instance ID, such as `eni-f1xjkw1b`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get ENI name. 
     * @return NetworkInterfaceName ENI name.
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set ENI name.
     * @param NetworkInterfaceName ENI name.
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get ENI description. 
     * @return NetworkInterfaceDescription ENI description.
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set ENI description.
     * @param NetworkInterfaceDescription ENI description.
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get Subnet instance ID. 
     * @return SubnetId Subnet instance ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID.
     * @param SubnetId Subnet instance ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

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
     * Get Bound security groups.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupSet Bound security groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set Bound security groups.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupSet Bound security groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get Whether it is the primary ENI. 
     * @return Primary Whether it is the primary ENI.
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set Whether it is the primary ENI.
     * @param Primary Whether it is the primary ENI.
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get MAC address. 
     * @return MacAddress MAC address.
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set MAC address.
     * @param MacAddress MAC address.
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get ENI status:
PENDING: creating
AVAILABLE: available
ATTACHING: binding
DETACHING: unbinding
DELETING: deleting 
     * @return State ENI status:
PENDING: creating
AVAILABLE: available
ATTACHING: binding
DETACHING: unbinding
DELETING: deleting
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set ENI status:
PENDING: creating
AVAILABLE: available
ATTACHING: binding
DETACHING: unbinding
DELETING: deleting
     * @param State ENI status:
PENDING: creating
AVAILABLE: available
ATTACHING: binding
DETACHING: unbinding
DELETING: deleting
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Private IP information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIpAddressSet Private IP information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddressSet() {
        return this.PrivateIpAddressSet;
    }

    /**
     * Set Private IP information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateIpAddressSet Private IP information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIpAddressSet(PrivateIpAddressSpecification [] PrivateIpAddressSet) {
        this.PrivateIpAddressSet = PrivateIpAddressSet;
    }

    /**
     * Get Bound CVM object.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Attachment Bound CVM object.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public NetworkInterfaceAttachment getAttachment() {
        return this.Attachment;
    }

    /**
     * Set Bound CVM object.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Attachment Bound CVM object.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachment(NetworkInterfaceAttachment Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get AZ. 
     * @return Zone AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ.
     * @param Zone AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get List of IPv6 addresses.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6AddressSet List of IPv6 addresses.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Ipv6Address [] getIpv6AddressSet() {
        return this.Ipv6AddressSet;
    }

    /**
     * Set List of IPv6 addresses.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ipv6AddressSet List of IPv6 addresses.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6AddressSet(Ipv6Address [] Ipv6AddressSet) {
        this.Ipv6AddressSet = Ipv6AddressSet;
    }

    /**
     * Get Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get ENI type. Valid values: 0: ENI; 1: EVM ENI. 
     * @return EniType ENI type. Valid values: 0: ENI; 1: EVM ENI.
     */
    public Long getEniType() {
        return this.EniType;
    }

    /**
     * Set ENI type. Valid values: 0: ENI; 1: EVM ENI.
     * @param EniType ENI type. Valid values: 0: ENI; 1: EVM ENI.
     */
    public void setEniType(Long EniType) {
        this.EniType = EniType;
    }

    /**
     * Get ECM region (EcmRegion) 
     * @return EcmRegion ECM region (EcmRegion)
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region (EcmRegion)
     * @param EcmRegion ECM region (EcmRegion)
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Type of the resource bound with an ENI. Valid values: `cvm` and `eks`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Business Type of the resource bound with an ENI. Valid values: `cvm` and `eks`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Type of the resource bound with an ENI. Valid values: `cvm` and `eks`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Business Type of the resource bound with an ENI. Valid values: `cvm` and `eks`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    public NetworkInterface() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInterface(NetworkInterface source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new String[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new String(source.GroupSet[i]);
            }
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.PrivateIpAddressSet != null) {
            this.PrivateIpAddressSet = new PrivateIpAddressSpecification[source.PrivateIpAddressSet.length];
            for (int i = 0; i < source.PrivateIpAddressSet.length; i++) {
                this.PrivateIpAddressSet[i] = new PrivateIpAddressSpecification(source.PrivateIpAddressSet[i]);
            }
        }
        if (source.Attachment != null) {
            this.Attachment = new NetworkInterfaceAttachment(source.Attachment);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Ipv6AddressSet != null) {
            this.Ipv6AddressSet = new Ipv6Address[source.Ipv6AddressSet.length];
            for (int i = 0; i < source.Ipv6AddressSet.length; i++) {
                this.Ipv6AddressSet[i] = new Ipv6Address(source.Ipv6AddressSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.EniType != null) {
            this.EniType = new Long(source.EniType);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "PrivateIpAddressSet.", this.PrivateIpAddressSet);
        this.setParamObj(map, prefix + "Attachment.", this.Attachment);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Ipv6AddressSet.", this.Ipv6AddressSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "EniType", this.EniType);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "Business", this.Business);

    }
}

