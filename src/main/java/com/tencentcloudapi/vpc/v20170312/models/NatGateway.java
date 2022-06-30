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

public class NatGateway extends AbstractModel{

    /**
    * NAT gateway ID.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT gateway name.
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT gateway creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The status of the NAT gateway.
 `PENDING`: Being created, `DELETING`: Being deleted, `AVAILABLE`: Running, `UPDATING`: Being upgraded,
`FAILED`: Failed.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * The maximum outbound bandwidth of the gateway. Unit: Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * The concurrent connections cap of the gateway.
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
    * The public IP object array of the bound NAT gateway.
    */
    @SerializedName("PublicIpAddressSet")
    @Expose
    private NatGatewayAddress [] PublicIpAddressSet;

    /**
    * The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Service suspended due to account overdue.
    */
    @SerializedName("NetworkState")
    @Expose
    private String NetworkState;

    /**
    * The port forwarding rules of the NAT gateway.
    */
    @SerializedName("DestinationIpPortTranslationNatRuleSet")
    @Expose
    private DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The availability zone in which the NAT gateway is located.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ID of the direct connect gateway bound.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DirectConnectGatewayIds")
    @Expose
    private String [] DirectConnectGatewayIds;

    /**
    * Subnet ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Tag key-value pairs.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * The list of the security groups bound to the NAT Gateway
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroupSet")
    @Expose
    private String [] SecurityGroupSet;

    /**
    * SNAT forwarding rule of the NAT gateway.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceIpTranslationNatRuleSet")
    @Expose
    private SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet;

    /**
    * Whether the NAT gateway is dedicated.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * Bandwidth of the gateway cluster where the dedicated NAT Gateway resides. Unit: Mbps. This field does not exist when the `IsExclusive` field is set to `false`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExclusiveGatewayBandwidth")
    @Expose
    private Long ExclusiveGatewayBandwidth;

    /**
     * Get NAT gateway ID. 
     * @return NatGatewayId NAT gateway ID.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT gateway ID.
     * @param NatGatewayId NAT gateway ID.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get NAT gateway name. 
     * @return NatGatewayName NAT gateway name.
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT gateway name.
     * @param NatGatewayName NAT gateway name.
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get NAT gateway creation time. 
     * @return CreatedTime NAT gateway creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set NAT gateway creation time.
     * @param CreatedTime NAT gateway creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The status of the NAT gateway.
 `PENDING`: Being created, `DELETING`: Being deleted, `AVAILABLE`: Running, `UPDATING`: Being upgraded,
`FAILED`: Failed. 
     * @return State The status of the NAT gateway.
 `PENDING`: Being created, `DELETING`: Being deleted, `AVAILABLE`: Running, `UPDATING`: Being upgraded,
`FAILED`: Failed.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set The status of the NAT gateway.
 `PENDING`: Being created, `DELETING`: Being deleted, `AVAILABLE`: Running, `UPDATING`: Being upgraded,
`FAILED`: Failed.
     * @param State The status of the NAT gateway.
 `PENDING`: Being created, `DELETING`: Being deleted, `AVAILABLE`: Running, `UPDATING`: Being upgraded,
`FAILED`: Failed.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get The maximum outbound bandwidth of the gateway. Unit: Mbps. 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the gateway. Unit: Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth of the gateway. Unit: Mbps.
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the gateway. Unit: Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get The concurrent connections cap of the gateway. 
     * @return MaxConcurrentConnection The concurrent connections cap of the gateway.
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set The concurrent connections cap of the gateway.
     * @param MaxConcurrentConnection The concurrent connections cap of the gateway.
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * Get The public IP object array of the bound NAT gateway. 
     * @return PublicIpAddressSet The public IP object array of the bound NAT gateway.
     */
    public NatGatewayAddress [] getPublicIpAddressSet() {
        return this.PublicIpAddressSet;
    }

    /**
     * Set The public IP object array of the bound NAT gateway.
     * @param PublicIpAddressSet The public IP object array of the bound NAT gateway.
     */
    public void setPublicIpAddressSet(NatGatewayAddress [] PublicIpAddressSet) {
        this.PublicIpAddressSet = PublicIpAddressSet;
    }

    /**
     * Get The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Service suspended due to account overdue. 
     * @return NetworkState The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Service suspended due to account overdue.
     */
    public String getNetworkState() {
        return this.NetworkState;
    }

    /**
     * Set The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Service suspended due to account overdue.
     * @param NetworkState The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Service suspended due to account overdue.
     */
    public void setNetworkState(String NetworkState) {
        this.NetworkState = NetworkState;
    }

    /**
     * Get The port forwarding rules of the NAT gateway. 
     * @return DestinationIpPortTranslationNatRuleSet The port forwarding rules of the NAT gateway.
     */
    public DestinationIpPortTranslationNatRule [] getDestinationIpPortTranslationNatRuleSet() {
        return this.DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * Set The port forwarding rules of the NAT gateway.
     * @param DestinationIpPortTranslationNatRuleSet The port forwarding rules of the NAT gateway.
     */
    public void setDestinationIpPortTranslationNatRuleSet(DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet) {
        this.DestinationIpPortTranslationNatRuleSet = DestinationIpPortTranslationNatRuleSet;
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
     * Get The availability zone in which the NAT gateway is located. 
     * @return Zone The availability zone in which the NAT gateway is located.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone in which the NAT gateway is located.
     * @param Zone The availability zone in which the NAT gateway is located.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ID of the direct connect gateway bound.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DirectConnectGatewayIds ID of the direct connect gateway bound.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getDirectConnectGatewayIds() {
        return this.DirectConnectGatewayIds;
    }

    /**
     * Set ID of the direct connect gateway bound.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DirectConnectGatewayIds ID of the direct connect gateway bound.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDirectConnectGatewayIds(String [] DirectConnectGatewayIds) {
        this.DirectConnectGatewayIds = DirectConnectGatewayIds;
    }

    /**
     * Get Subnet ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Tag key-value pairs. 
     * @return TagSet Tag key-value pairs.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs.
     * @param TagSet Tag key-value pairs.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get The list of the security groups bound to the NAT Gateway
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SecurityGroupSet The list of the security groups bound to the NAT Gateway
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroupSet() {
        return this.SecurityGroupSet;
    }

    /**
     * Set The list of the security groups bound to the NAT Gateway
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SecurityGroupSet The list of the security groups bound to the NAT Gateway
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecurityGroupSet(String [] SecurityGroupSet) {
        this.SecurityGroupSet = SecurityGroupSet;
    }

    /**
     * Get SNAT forwarding rule of the NAT gateway.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SourceIpTranslationNatRuleSet SNAT forwarding rule of the NAT gateway.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public SourceIpTranslationNatRule [] getSourceIpTranslationNatRuleSet() {
        return this.SourceIpTranslationNatRuleSet;
    }

    /**
     * Set SNAT forwarding rule of the NAT gateway.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SourceIpTranslationNatRuleSet SNAT forwarding rule of the NAT gateway.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSourceIpTranslationNatRuleSet(SourceIpTranslationNatRule [] SourceIpTranslationNatRuleSet) {
        this.SourceIpTranslationNatRuleSet = SourceIpTranslationNatRuleSet;
    }

    /**
     * Get Whether the NAT gateway is dedicated.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IsExclusive Whether the NAT gateway is dedicated.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set Whether the NAT gateway is dedicated.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IsExclusive Whether the NAT gateway is dedicated.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get Bandwidth of the gateway cluster where the dedicated NAT Gateway resides. Unit: Mbps. This field does not exist when the `IsExclusive` field is set to `false`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExclusiveGatewayBandwidth Bandwidth of the gateway cluster where the dedicated NAT Gateway resides. Unit: Mbps. This field does not exist when the `IsExclusive` field is set to `false`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getExclusiveGatewayBandwidth() {
        return this.ExclusiveGatewayBandwidth;
    }

    /**
     * Set Bandwidth of the gateway cluster where the dedicated NAT Gateway resides. Unit: Mbps. This field does not exist when the `IsExclusive` field is set to `false`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExclusiveGatewayBandwidth Bandwidth of the gateway cluster where the dedicated NAT Gateway resides. Unit: Mbps. This field does not exist when the `IsExclusive` field is set to `false`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExclusiveGatewayBandwidth(Long ExclusiveGatewayBandwidth) {
        this.ExclusiveGatewayBandwidth = ExclusiveGatewayBandwidth;
    }

    public NatGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGateway(NatGateway source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.MaxConcurrentConnection != null) {
            this.MaxConcurrentConnection = new Long(source.MaxConcurrentConnection);
        }
        if (source.PublicIpAddressSet != null) {
            this.PublicIpAddressSet = new NatGatewayAddress[source.PublicIpAddressSet.length];
            for (int i = 0; i < source.PublicIpAddressSet.length; i++) {
                this.PublicIpAddressSet[i] = new NatGatewayAddress(source.PublicIpAddressSet[i]);
            }
        }
        if (source.NetworkState != null) {
            this.NetworkState = new String(source.NetworkState);
        }
        if (source.DestinationIpPortTranslationNatRuleSet != null) {
            this.DestinationIpPortTranslationNatRuleSet = new DestinationIpPortTranslationNatRule[source.DestinationIpPortTranslationNatRuleSet.length];
            for (int i = 0; i < source.DestinationIpPortTranslationNatRuleSet.length; i++) {
                this.DestinationIpPortTranslationNatRuleSet[i] = new DestinationIpPortTranslationNatRule(source.DestinationIpPortTranslationNatRuleSet[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DirectConnectGatewayIds != null) {
            this.DirectConnectGatewayIds = new String[source.DirectConnectGatewayIds.length];
            for (int i = 0; i < source.DirectConnectGatewayIds.length; i++) {
                this.DirectConnectGatewayIds[i] = new String(source.DirectConnectGatewayIds[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.SecurityGroupSet != null) {
            this.SecurityGroupSet = new String[source.SecurityGroupSet.length];
            for (int i = 0; i < source.SecurityGroupSet.length; i++) {
                this.SecurityGroupSet[i] = new String(source.SecurityGroupSet[i]);
            }
        }
        if (source.SourceIpTranslationNatRuleSet != null) {
            this.SourceIpTranslationNatRuleSet = new SourceIpTranslationNatRule[source.SourceIpTranslationNatRuleSet.length];
            for (int i = 0; i < source.SourceIpTranslationNatRuleSet.length; i++) {
                this.SourceIpTranslationNatRuleSet[i] = new SourceIpTranslationNatRule(source.SourceIpTranslationNatRuleSet[i]);
            }
        }
        if (source.IsExclusive != null) {
            this.IsExclusive = new Boolean(source.IsExclusive);
        }
        if (source.ExclusiveGatewayBandwidth != null) {
            this.ExclusiveGatewayBandwidth = new Long(source.ExclusiveGatewayBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamArrayObj(map, prefix + "PublicIpAddressSet.", this.PublicIpAddressSet);
        this.setParamSimple(map, prefix + "NetworkState", this.NetworkState);
        this.setParamArrayObj(map, prefix + "DestinationIpPortTranslationNatRuleSet.", this.DestinationIpPortTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "DirectConnectGatewayIds.", this.DirectConnectGatewayIds);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "SecurityGroupSet.", this.SecurityGroupSet);
        this.setParamArrayObj(map, prefix + "SourceIpTranslationNatRuleSet.", this.SourceIpTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "ExclusiveGatewayBandwidth", this.ExclusiveGatewayBandwidth);

    }
}

