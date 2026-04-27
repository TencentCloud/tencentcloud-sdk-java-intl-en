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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicNetworkInstanceInfo extends AbstractModel {

    /**
    * Public network instance ID
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * Availability zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Public network instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * Bandwidth, Unit: Mbps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Line information
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * Routing mode, enumeration value: STATIC, BGP, OSPF
    */
    @SerializedName("RouteMode")
    @Expose
    private String RouteMode;

    /**
    * Number of Associated Physical Servers
    */
    @SerializedName("ServerCount")
    @Expose
    private Long ServerCount;

    /**
    * Applied Ipv4 quantity
    */
    @SerializedName("Ipv4Count")
    @Expose
    private Long Ipv4Count;

    /**
    * Number of applied Ipv6 addresses
    */
    @SerializedName("Ipv6Count")
    @Expose
    private Long Ipv6Count;

    /**
    * Associated Ipv4 subnet
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv4CidrSet")
    @Expose
    private PublicNetworkSegment [] Ipv4CidrSet;

    /**
    * Associated Ipv6 segment
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6CidrSet")
    @Expose
    private PublicNetworkSegment [] Ipv6CidrSet;

    /**
    * Public network instance creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Public network instance last modified
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get Public network instance ID 
     * @return NetworkInstanceId Public network instance ID
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set Public network instance ID
     * @param NetworkInstanceId Public network instance ID
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get Availability zone ID. 
     * @return ZoneId Availability zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone ID.
     * @param ZoneId Availability zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Public network instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkInstanceName Public network instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set Public network instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkInstanceName Public network instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get Bandwidth, Unit: Mbps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bandwidth Bandwidth, Unit: Mbps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth, Unit: Mbps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bandwidth Bandwidth, Unit: Mbps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Line information 
     * @return Line Line information
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set Line information
     * @param Line Line information
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get Routing mode, enumeration value: STATIC, BGP, OSPF 
     * @return RouteMode Routing mode, enumeration value: STATIC, BGP, OSPF
     */
    public String getRouteMode() {
        return this.RouteMode;
    }

    /**
     * Set Routing mode, enumeration value: STATIC, BGP, OSPF
     * @param RouteMode Routing mode, enumeration value: STATIC, BGP, OSPF
     */
    public void setRouteMode(String RouteMode) {
        this.RouteMode = RouteMode;
    }

    /**
     * Get Number of Associated Physical Servers 
     * @return ServerCount Number of Associated Physical Servers
     */
    public Long getServerCount() {
        return this.ServerCount;
    }

    /**
     * Set Number of Associated Physical Servers
     * @param ServerCount Number of Associated Physical Servers
     */
    public void setServerCount(Long ServerCount) {
        this.ServerCount = ServerCount;
    }

    /**
     * Get Applied Ipv4 quantity 
     * @return Ipv4Count Applied Ipv4 quantity
     */
    public Long getIpv4Count() {
        return this.Ipv4Count;
    }

    /**
     * Set Applied Ipv4 quantity
     * @param Ipv4Count Applied Ipv4 quantity
     */
    public void setIpv4Count(Long Ipv4Count) {
        this.Ipv4Count = Ipv4Count;
    }

    /**
     * Get Number of applied Ipv6 addresses 
     * @return Ipv6Count Number of applied Ipv6 addresses
     */
    public Long getIpv6Count() {
        return this.Ipv6Count;
    }

    /**
     * Set Number of applied Ipv6 addresses
     * @param Ipv6Count Number of applied Ipv6 addresses
     */
    public void setIpv6Count(Long Ipv6Count) {
        this.Ipv6Count = Ipv6Count;
    }

    /**
     * Get Associated Ipv4 subnet
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ipv4CidrSet Associated Ipv4 subnet
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PublicNetworkSegment [] getIpv4CidrSet() {
        return this.Ipv4CidrSet;
    }

    /**
     * Set Associated Ipv4 subnet
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ipv4CidrSet Associated Ipv4 subnet
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv4CidrSet(PublicNetworkSegment [] Ipv4CidrSet) {
        this.Ipv4CidrSet = Ipv4CidrSet;
    }

    /**
     * Get Associated Ipv6 segment
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6CidrSet Associated Ipv6 segment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PublicNetworkSegment [] getIpv6CidrSet() {
        return this.Ipv6CidrSet;
    }

    /**
     * Set Associated Ipv6 segment
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ipv6CidrSet Associated Ipv6 segment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6CidrSet(PublicNetworkSegment [] Ipv6CidrSet) {
        this.Ipv6CidrSet = Ipv6CidrSet;
    }

    /**
     * Get Public network instance creation time 
     * @return CreatedAt Public network instance creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Public network instance creation time
     * @param CreatedAt Public network instance creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Public network instance last modified 
     * @return UpdatedAt Public network instance last modified
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Public network instance last modified
     * @param UpdatedAt Public network instance last modified
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PublicNetworkInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicNetworkInstanceInfo(PublicNetworkInstanceInfo source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.RouteMode != null) {
            this.RouteMode = new String(source.RouteMode);
        }
        if (source.ServerCount != null) {
            this.ServerCount = new Long(source.ServerCount);
        }
        if (source.Ipv4Count != null) {
            this.Ipv4Count = new Long(source.Ipv4Count);
        }
        if (source.Ipv6Count != null) {
            this.Ipv6Count = new Long(source.Ipv6Count);
        }
        if (source.Ipv4CidrSet != null) {
            this.Ipv4CidrSet = new PublicNetworkSegment[source.Ipv4CidrSet.length];
            for (int i = 0; i < source.Ipv4CidrSet.length; i++) {
                this.Ipv4CidrSet[i] = new PublicNetworkSegment(source.Ipv4CidrSet[i]);
            }
        }
        if (source.Ipv6CidrSet != null) {
            this.Ipv6CidrSet = new PublicNetworkSegment[source.Ipv6CidrSet.length];
            for (int i = 0; i < source.Ipv6CidrSet.length; i++) {
                this.Ipv6CidrSet[i] = new PublicNetworkSegment(source.Ipv6CidrSet[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "RouteMode", this.RouteMode);
        this.setParamSimple(map, prefix + "ServerCount", this.ServerCount);
        this.setParamSimple(map, prefix + "Ipv4Count", this.Ipv4Count);
        this.setParamSimple(map, prefix + "Ipv6Count", this.Ipv6Count);
        this.setParamArrayObj(map, prefix + "Ipv4CidrSet.", this.Ipv4CidrSet);
        this.setParamArrayObj(map, prefix + "Ipv6CidrSet.", this.Ipv6CidrSet);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

