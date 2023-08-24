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

public class ModifyNetDetectRequest extends AbstractModel{

    /**
    * The ID of a network detection instance, such as `netd-12345678`.
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

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
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop.
    */
    @SerializedName("NextHopType")
    @Expose
    private String NextHopType;

    /**
    * ID of the next-hop gateway.
If NextHopType is set to VPN, the value of this parameter is the VPN gateway ID, such as vpngw-12345678.
`NextHopType` = `DIRECTCONNECT`: Direct connect gateway ID, such as `dcg-12345678`.
`NextHopType` = `PEERCONNECTION`: Peering connection ID, such as `pcx-12345678`.
`NextHopType` = `NAT`: NAT gateway ID, such as `nat-12345678`.
If NextHopType is set to NORMAL_CVM, the value of this parameter is the IPv4 address of the CVM, such as 10.0.0.12.
`NextHopType` = `CCN`: CCN instance ID, such as `ccn-12345678`.
`NextHopType` = `NONEXTHOP`: No next hop.
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
     * Get The ID of a network detection instance, such as `netd-12345678`. 
     * @return NetDetectId The ID of a network detection instance, such as `netd-12345678`.
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set The ID of a network detection instance, such as `netd-12345678`.
     * @param NetDetectId The ID of a network detection instance, such as `netd-12345678`.
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
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
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop. 
     * @return NextHopType Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop.
     */
    public String getNextHopType() {
        return this.NextHopType;
    }

    /**
     * Set Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop.
     * @param NextHopType Type of the next hop. Valid values:
`VPN`: VPN gateway;
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop.
     */
    public void setNextHopType(String NextHopType) {
        this.NextHopType = NextHopType;
    }

    /**
     * Get ID of the next-hop gateway.
If NextHopType is set to VPN, the value of this parameter is the VPN gateway ID, such as vpngw-12345678.
`NextHopType` = `DIRECTCONNECT`: Direct connect gateway ID, such as `dcg-12345678`.
`NextHopType` = `PEERCONNECTION`: Peering connection ID, such as `pcx-12345678`.
`NextHopType` = `NAT`: NAT gateway ID, such as `nat-12345678`.
If NextHopType is set to NORMAL_CVM, the value of this parameter is the IPv4 address of the CVM, such as 10.0.0.12.
`NextHopType` = `CCN`: CCN instance ID, such as `ccn-12345678`.
`NextHopType` = `NONEXTHOP`: No next hop. 
     * @return NextHopDestination ID of the next-hop gateway.
If NextHopType is set to VPN, the value of this parameter is the VPN gateway ID, such as vpngw-12345678.
`NextHopType` = `DIRECTCONNECT`: Direct connect gateway ID, such as `dcg-12345678`.
`NextHopType` = `PEERCONNECTION`: Peering connection ID, such as `pcx-12345678`.
`NextHopType` = `NAT`: NAT gateway ID, such as `nat-12345678`.
If NextHopType is set to NORMAL_CVM, the value of this parameter is the IPv4 address of the CVM, such as 10.0.0.12.
`NextHopType` = `CCN`: CCN instance ID, such as `ccn-12345678`.
`NextHopType` = `NONEXTHOP`: No next hop.
     */
    public String getNextHopDestination() {
        return this.NextHopDestination;
    }

    /**
     * Set ID of the next-hop gateway.
If NextHopType is set to VPN, the value of this parameter is the VPN gateway ID, such as vpngw-12345678.
`NextHopType` = `DIRECTCONNECT`: Direct connect gateway ID, such as `dcg-12345678`.
`NextHopType` = `PEERCONNECTION`: Peering connection ID, such as `pcx-12345678`.
`NextHopType` = `NAT`: NAT gateway ID, such as `nat-12345678`.
If NextHopType is set to NORMAL_CVM, the value of this parameter is the IPv4 address of the CVM, such as 10.0.0.12.
`NextHopType` = `CCN`: CCN instance ID, such as `ccn-12345678`.
`NextHopType` = `NONEXTHOP`: No next hop.
     * @param NextHopDestination ID of the next-hop gateway.
If NextHopType is set to VPN, the value of this parameter is the VPN gateway ID, such as vpngw-12345678.
`NextHopType` = `DIRECTCONNECT`: Direct connect gateway ID, such as `dcg-12345678`.
`NextHopType` = `PEERCONNECTION`: Peering connection ID, such as `pcx-12345678`.
`NextHopType` = `NAT`: NAT gateway ID, such as `nat-12345678`.
If NextHopType is set to NORMAL_CVM, the value of this parameter is the IPv4 address of the CVM, such as 10.0.0.12.
`NextHopType` = `CCN`: CCN instance ID, such as `ccn-12345678`.
`NextHopType` = `NONEXTHOP`: No next hop.
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

    public ModifyNetDetectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetDetectRequest(ModifyNetDetectRequest source) {
        if (source.NetDetectId != null) {
            this.NetDetectId = new String(source.NetDetectId);
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
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "NetDetectName", this.NetDetectName);
        this.setParamArraySimple(map, prefix + "DetectDestinationIp.", this.DetectDestinationIp);
        this.setParamSimple(map, prefix + "NextHopType", this.NextHopType);
        this.setParamSimple(map, prefix + "NextHopDestination", this.NextHopDestination);
        this.setParamSimple(map, prefix + "NetDetectDescription", this.NetDetectDescription);

    }
}

