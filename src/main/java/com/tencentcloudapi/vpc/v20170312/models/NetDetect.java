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

public class NetDetect extends AbstractModel {

    /**
    * The ID of a VPC instance, such as `vpc-12345678`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The name of a VPC instance.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * The ID of a subnet instance, such as subnet-12345678.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The name of a subnet instance.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * The ID of a network detection instance, such as netd-12345678.
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
    * The array of detection source IPv4 addresses automatically allocated by the system. The length is 2.
    */
    @SerializedName("DetectSourceIp")
    @Expose
    private String [] DetectSourceIp;

    /**
    * Type of the next hop. Currently supported types are:
VPN: VPN gateway;
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
    * The name of the next-hop gateway.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NextHopName")
    @Expose
    private String NextHopName;

    /**
    * Network detection description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetDetectDescription")
    @Expose
    private String NetDetectDescription;

    /**
    * The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get The ID of a VPC instance, such as `vpc-12345678`. 
     * @return VpcId The ID of a VPC instance, such as `vpc-12345678`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The ID of a VPC instance, such as `vpc-12345678`.
     * @param VpcId The ID of a VPC instance, such as `vpc-12345678`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The name of a VPC instance. 
     * @return VpcName The name of a VPC instance.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set The name of a VPC instance.
     * @param VpcName The name of a VPC instance.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
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
     * Get The name of a subnet instance. 
     * @return SubnetName The name of a subnet instance.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set The name of a subnet instance.
     * @param SubnetName The name of a subnet instance.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get The ID of a network detection instance, such as netd-12345678. 
     * @return NetDetectId The ID of a network detection instance, such as netd-12345678.
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set The ID of a network detection instance, such as netd-12345678.
     * @param NetDetectId The ID of a network detection instance, such as netd-12345678.
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
     * Get The array of detection source IPv4 addresses automatically allocated by the system. The length is 2. 
     * @return DetectSourceIp The array of detection source IPv4 addresses automatically allocated by the system. The length is 2.
     */
    public String [] getDetectSourceIp() {
        return this.DetectSourceIp;
    }

    /**
     * Set The array of detection source IPv4 addresses automatically allocated by the system. The length is 2.
     * @param DetectSourceIp The array of detection source IPv4 addresses automatically allocated by the system. The length is 2.
     */
    public void setDetectSourceIp(String [] DetectSourceIp) {
        this.DetectSourceIp = DetectSourceIp;
    }

    /**
     * Get Type of the next hop. Currently supported types are:
VPN: VPN gateway;
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop. 
     * @return NextHopType Type of the next hop. Currently supported types are:
VPN: VPN gateway;
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
     * Set Type of the next hop. Currently supported types are:
VPN: VPN gateway;
`DIRECTCONNECT`: Direct connect gateway;
`PEERCONNECTION`: Peering connection;
`NAT`: NAT gateway;
`NORMAL_CVM`: CVM instance;
`CCN`: CCN instance;
`NONEXTHOP`: No next hop.
     * @param NextHopType Type of the next hop. Currently supported types are:
VPN: VPN gateway;
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
     * Get The name of the next-hop gateway.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NextHopName The name of the next-hop gateway.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNextHopName() {
        return this.NextHopName;
    }

    /**
     * Set The name of the next-hop gateway.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NextHopName The name of the next-hop gateway.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNextHopName(String NextHopName) {
        this.NextHopName = NextHopName;
    }

    /**
     * Get Network detection description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetDetectDescription Network detection description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetDetectDescription() {
        return this.NetDetectDescription;
    }

    /**
     * Set Network detection description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetDetectDescription Network detection description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetDetectDescription(String NetDetectDescription) {
        this.NetDetectDescription = NetDetectDescription;
    }

    /**
     * Get The creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public NetDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetDetect(NetDetect source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
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
        if (source.DetectSourceIp != null) {
            this.DetectSourceIp = new String[source.DetectSourceIp.length];
            for (int i = 0; i < source.DetectSourceIp.length; i++) {
                this.DetectSourceIp[i] = new String(source.DetectSourceIp[i]);
            }
        }
        if (source.NextHopType != null) {
            this.NextHopType = new String(source.NextHopType);
        }
        if (source.NextHopDestination != null) {
            this.NextHopDestination = new String(source.NextHopDestination);
        }
        if (source.NextHopName != null) {
            this.NextHopName = new String(source.NextHopName);
        }
        if (source.NetDetectDescription != null) {
            this.NetDetectDescription = new String(source.NetDetectDescription);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "NetDetectName", this.NetDetectName);
        this.setParamArraySimple(map, prefix + "DetectDestinationIp.", this.DetectDestinationIp);
        this.setParamArraySimple(map, prefix + "DetectSourceIp.", this.DetectSourceIp);
        this.setParamSimple(map, prefix + "NextHopType", this.NextHopType);
        this.setParamSimple(map, prefix + "NextHopDestination", this.NextHopDestination);
        this.setParamSimple(map, prefix + "NextHopName", this.NextHopName);
        this.setParamSimple(map, prefix + "NetDetectDescription", this.NetDetectDescription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

