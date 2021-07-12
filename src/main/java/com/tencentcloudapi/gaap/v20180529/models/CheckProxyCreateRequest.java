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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckProxyCreateRequest extends AbstractModel{

    /**
    * Access (acceleration) region of the connection. The value can be obtained via the DescribeAccessRegionsByDestRegion API.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * Origin server region of the connection. The value can be obtained via the DescribeDestRegions API.
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * Connection bandwidth cap. Unit: Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * Connection group ID that needs to be entered when a connection is created in a connection group
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * IP version. Valid values: `IPv4` (default), `IPv6`.
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
     * Get Access (acceleration) region of the connection. The value can be obtained via the DescribeAccessRegionsByDestRegion API. 
     * @return AccessRegion Access (acceleration) region of the connection. The value can be obtained via the DescribeAccessRegionsByDestRegion API.
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set Access (acceleration) region of the connection. The value can be obtained via the DescribeAccessRegionsByDestRegion API.
     * @param AccessRegion Access (acceleration) region of the connection. The value can be obtained via the DescribeAccessRegionsByDestRegion API.
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get Origin server region of the connection. The value can be obtained via the DescribeDestRegions API. 
     * @return RealServerRegion Origin server region of the connection. The value can be obtained via the DescribeDestRegions API.
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set Origin server region of the connection. The value can be obtained via the DescribeDestRegions API.
     * @param RealServerRegion Origin server region of the connection. The value can be obtained via the DescribeDestRegions API.
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get Connection bandwidth cap. Unit: Mbps. 
     * @return Bandwidth Connection bandwidth cap. Unit: Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection bandwidth cap. Unit: Mbps.
     * @param Bandwidth Connection bandwidth cap. Unit: Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections. 
     * @return Concurrent Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
     * @param Concurrent Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get Connection group ID that needs to be entered when a connection is created in a connection group 
     * @return GroupId Connection group ID that needs to be entered when a connection is created in a connection group
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID that needs to be entered when a connection is created in a connection group
     * @param GroupId Connection group ID that needs to be entered when a connection is created in a connection group
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get IP version. Valid values: `IPv4` (default), `IPv6`. 
     * @return IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP version. Valid values: `IPv4` (default), `IPv6`.
     * @param IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    public CheckProxyCreateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckProxyCreateRequest(CheckProxyCreateRequest source) {
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);

    }
}

