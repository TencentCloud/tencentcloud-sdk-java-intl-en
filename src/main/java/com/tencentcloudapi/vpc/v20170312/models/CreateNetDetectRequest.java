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

public class CreateNetDetectRequest extends AbstractModel{

    /**
    * The `ID` of a `VPC` instance, such as `vpc-12345678`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The ID of a subnet instance, such as subnet-12345678.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The name of a network detection instance. The maximum length is 60 characters.
    */
    @SerializedName("NetDetectName")
    @Expose
    private String NetDetectName;

    /**
    * The array of detection destination IPv4 addresses, which contains at most two IP addresses.
    */
    @SerializedName("DetectDestinationIp")
    @Expose
    private String [] DetectDestinationIp;

    /**
    * Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: direct connect gateway;
`PEERCONNECTION`: peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: normal CVM;
`CCN`: CCN gateway.
    */
    @SerializedName("NextHopType")
    @Expose
    private String NextHopType;

    /**
    * Next-hop destination gateway. Its value is determined by `NextHopType`.
If `NextHopType` is set to `VPN`, the parameter value is the VPN gateway ID, such as `vpngw-12345678`.
If `NextHopType` is set to `DIRECTCONNECT`, the parameter value is the direct connect gateway ID, such as `dcg-12345678`.
If `NextHopType` is set to `PEERCONNECTION`, the parameter value is the peering connection ID, such as `pcx-12345678`.
If `NextHopType` is set to `NAT`, the parameter value is the NAT gateway ID, such as `nat-12345678`.
If `NextHopType` is set to `NORMAL_CVM`, the parameter value is the IPv4 address of the CVM instance, such as `10.0.0.12`.
If `NextHopType` is set to `CCN`, the parameter value is the CCN ID, such as `ccn-12345678`.
    */
    @SerializedName("NextHopDestination")
    @Expose
    private String NextHopDestination;

    /**
    * Network detection description.
    */
    @SerializedName("NetDetectDescription")
    @Expose
    private String NetDetectDescription;

    /**
     * Get The `ID` of a `VPC` instance, such as `vpc-12345678`. 
     * @return VpcId The `ID` of a `VPC` instance, such as `vpc-12345678`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of a `VPC` instance, such as `vpc-12345678`.
     * @param VpcId The `ID` of a `VPC` instance, such as `vpc-12345678`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The ID of a subnet instance, such as subnet-12345678. 
     * @return SubnetId The ID of a subnet instance, such as subnet-12345678.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The ID of a subnet instance, such as subnet-12345678.
     * @param SubnetId The ID of a subnet instance, such as subnet-12345678.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The name of a network detection instance. The maximum length is 60 characters. 
     * @return NetDetectName The name of a network detection instance. The maximum length is 60 characters.
     */
    public String getNetDetectName() {
        return this.NetDetectName;
    }

    /**
     * Set The name of a network detection instance. The maximum length is 60 characters.
     * @param NetDetectName The name of a network detection instance. The maximum length is 60 characters.
     */
    public void setNetDetectName(String NetDetectName) {
        this.NetDetectName = NetDetectName;
    }

    /**
     * Get The array of detection destination IPv4 addresses, which contains at most two IP addresses. 
     * @return DetectDestinationIp The array of detection destination IPv4 addresses, which contains at most two IP addresses.
     */
    public String [] getDetectDestinationIp() {
        return this.DetectDestinationIp;
    }

    /**
     * Set The array of detection destination IPv4 addresses, which contains at most two IP addresses.
     * @param DetectDestinationIp The array of detection destination IPv4 addresses, which contains at most two IP addresses.
     */
    public void setDetectDestinationIp(String [] DetectDestinationIp) {
        this.DetectDestinationIp = DetectDestinationIp;
    }

    /**
     * Get Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: direct connect gateway;
`PEERCONNECTION`: peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: normal CVM;
`CCN`: CCN gateway. 
     * @return NextHopType Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: direct connect gateway;
`PEERCONNECTION`: peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: normal CVM;
`CCN`: CCN gateway.
     */
    public String getNextHopType() {
        return this.NextHopType;
    }

    /**
     * Set Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: direct connect gateway;
`PEERCONNECTION`: peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: normal CVM;
`CCN`: CCN gateway.
     * @param NextHopType Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: direct connect gateway;
`PEERCONNECTION`: peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: normal CVM;
`CCN`: CCN gateway.
     */
    public void setNextHopType(String NextHopType) {
        this.NextHopType = NextHopType;
    }

    /**
     * Get Next-hop destination gateway. Its value is determined by `NextHopType`.
If `NextHopType` is set to `VPN`, the parameter value is the VPN gateway ID, such as `vpngw-12345678`.
If `NextHopType` is set to `DIRECTCONNECT`, the parameter value is the direct connect gateway ID, such as `dcg-12345678`.
If `NextHopType` is set to `PEERCONNECTION`, the parameter value is the peering connection ID, such as `pcx-12345678`.
If `NextHopType` is set to `NAT`, the parameter value is the NAT gateway ID, such as `nat-12345678`.
If `NextHopType` is set to `NORMAL_CVM`, the parameter value is the IPv4 address of the CVM instance, such as `10.0.0.12`.
If `NextHopType` is set to `CCN`, the parameter value is the CCN ID, such as `ccn-12345678`. 
     * @return NextHopDestination Next-hop destination gateway. Its value is determined by `NextHopType`.
If `NextHopType` is set to `VPN`, the parameter value is the VPN gateway ID, such as `vpngw-12345678`.
If `NextHopType` is set to `DIRECTCONNECT`, the parameter value is the direct connect gateway ID, such as `dcg-12345678`.
If `NextHopType` is set to `PEERCONNECTION`, the parameter value is the peering connection ID, such as `pcx-12345678`.
If `NextHopType` is set to `NAT`, the parameter value is the NAT gateway ID, such as `nat-12345678`.
If `NextHopType` is set to `NORMAL_CVM`, the parameter value is the IPv4 address of the CVM instance, such as `10.0.0.12`.
If `NextHopType` is set to `CCN`, the parameter value is the CCN ID, such as `ccn-12345678`.
     */
    public String getNextHopDestination() {
        return this.NextHopDestination;
    }

    /**
     * Set Next-hop destination gateway. Its value is determined by `NextHopType`.
If `NextHopType` is set to `VPN`, the parameter value is the VPN gateway ID, such as `vpngw-12345678`.
If `NextHopType` is set to `DIRECTCONNECT`, the parameter value is the direct connect gateway ID, such as `dcg-12345678`.
If `NextHopType` is set to `PEERCONNECTION`, the parameter value is the peering connection ID, such as `pcx-12345678`.
If `NextHopType` is set to `NAT`, the parameter value is the NAT gateway ID, such as `nat-12345678`.
If `NextHopType` is set to `NORMAL_CVM`, the parameter value is the IPv4 address of the CVM instance, such as `10.0.0.12`.
If `NextHopType` is set to `CCN`, the parameter value is the CCN ID, such as `ccn-12345678`.
     * @param NextHopDestination Next-hop destination gateway. Its value is determined by `NextHopType`.
If `NextHopType` is set to `VPN`, the parameter value is the VPN gateway ID, such as `vpngw-12345678`.
If `NextHopType` is set to `DIRECTCONNECT`, the parameter value is the direct connect gateway ID, such as `dcg-12345678`.
If `NextHopType` is set to `PEERCONNECTION`, the parameter value is the peering connection ID, such as `pcx-12345678`.
If `NextHopType` is set to `NAT`, the parameter value is the NAT gateway ID, such as `nat-12345678`.
If `NextHopType` is set to `NORMAL_CVM`, the parameter value is the IPv4 address of the CVM instance, such as `10.0.0.12`.
If `NextHopType` is set to `CCN`, the parameter value is the CCN ID, such as `ccn-12345678`.
     */
    public void setNextHopDestination(String NextHopDestination) {
        this.NextHopDestination = NextHopDestination;
    }

    /**
     * Get Network detection description. 
     * @return NetDetectDescription Network detection description.
     */
    public String getNetDetectDescription() {
        return this.NetDetectDescription;
    }

    /**
     * Set Network detection description.
     * @param NetDetectDescription Network detection description.
     */
    public void setNetDetectDescription(String NetDetectDescription) {
        this.NetDetectDescription = NetDetectDescription;
    }

    public CreateNetDetectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetDetectRequest(CreateNetDetectRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetDetectName != null) {
            this.NetDetectName = new String(source.NetDetectName);
        }
        if (source.DetectDestinationIp != null) {
            this.DetectDestinationIp = new String[source.DetectDestinationIp.length];
            for (int i = 0; i < source.DetectDestinationIp.length; i++) {
                this.DetectDestinationIp[i] = new String(source.DetectDestinationIp[i]);
            }
        }
        if (source.NextHopType != null) {
            this.NextHopType = new String(source.NextHopType);
        }
        if (source.NextHopDestination != null) {
            this.NextHopDestination = new String(source.NextHopDestination);
        }
        if (source.NetDetectDescription != null) {
            this.NetDetectDescription = new String(source.NetDetectDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetDetectName", this.NetDetectName);
        this.setParamArraySimple(map, prefix + "DetectDestinationIp.", this.DetectDestinationIp);
        this.setParamSimple(map, prefix + "NextHopType", this.NextHopType);
        this.setParamSimple(map, prefix + "NextHopDestination", this.NextHopDestination);
        this.setParamSimple(map, prefix + "NetDetectDescription", this.NetDetectDescription);

    }
}

