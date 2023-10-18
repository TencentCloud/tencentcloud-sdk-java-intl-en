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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindRealServer extends AbstractModel {

    /**
    * Origin server ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * Origin server IP or domain name
    */
    @SerializedName("RealServerIP")
    @Expose
    private String RealServerIP;

    /**
    * Origin server weight
    */
    @SerializedName("RealServerWeight")
    @Expose
    private Long RealServerWeight;

    /**
    * Origin server health check status. Valid values:
0: normal;
1: exceptional.
If health check is not enabled, this status will always be normal.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerStatus")
    @Expose
    private Long RealServerStatus;

    /**
    * Origin server port number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * If the origin server is a domain name, the domain name will be resolved to one or multiple IPs. This field indicates the exceptional IP list.
    */
    @SerializedName("DownIPList")
    @Expose
    private String [] DownIPList;

    /**
    * Role of the origin server. Values: `master` (primary origin server); `slave` (secondary origin server). This parameter only takes effect when origin failover is enabled for the listener.
    */
    @SerializedName("RealServerFailoverRole")
    @Expose
    private String RealServerFailoverRole;

    /**
     * Get Origin server ID 
     * @return RealServerId Origin server ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set Origin server ID
     * @param RealServerId Origin server ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get Origin server IP or domain name 
     * @return RealServerIP Origin server IP or domain name
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set Origin server IP or domain name
     * @param RealServerIP Origin server IP or domain name
     */
    public void setRealServerIP(String RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * Get Origin server weight 
     * @return RealServerWeight Origin server weight
     */
    public Long getRealServerWeight() {
        return this.RealServerWeight;
    }

    /**
     * Set Origin server weight
     * @param RealServerWeight Origin server weight
     */
    public void setRealServerWeight(Long RealServerWeight) {
        this.RealServerWeight = RealServerWeight;
    }

    /**
     * Get Origin server health check status. Valid values:
0: normal;
1: exceptional.
If health check is not enabled, this status will always be normal.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RealServerStatus Origin server health check status. Valid values:
0: normal;
1: exceptional.
If health check is not enabled, this status will always be normal.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealServerStatus() {
        return this.RealServerStatus;
    }

    /**
     * Set Origin server health check status. Valid values:
0: normal;
1: exceptional.
If health check is not enabled, this status will always be normal.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RealServerStatus Origin server health check status. Valid values:
0: normal;
1: exceptional.
If health check is not enabled, this status will always be normal.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerStatus(Long RealServerStatus) {
        this.RealServerStatus = RealServerStatus;
    }

    /**
     * Get Origin server port number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerPort Origin server port number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set Origin server port number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerPort Origin server port number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get If the origin server is a domain name, the domain name will be resolved to one or multiple IPs. This field indicates the exceptional IP list. 
     * @return DownIPList If the origin server is a domain name, the domain name will be resolved to one or multiple IPs. This field indicates the exceptional IP list.
     */
    public String [] getDownIPList() {
        return this.DownIPList;
    }

    /**
     * Set If the origin server is a domain name, the domain name will be resolved to one or multiple IPs. This field indicates the exceptional IP list.
     * @param DownIPList If the origin server is a domain name, the domain name will be resolved to one or multiple IPs. This field indicates the exceptional IP list.
     */
    public void setDownIPList(String [] DownIPList) {
        this.DownIPList = DownIPList;
    }

    /**
     * Get Role of the origin server. Values: `master` (primary origin server); `slave` (secondary origin server). This parameter only takes effect when origin failover is enabled for the listener. 
     * @return RealServerFailoverRole Role of the origin server. Values: `master` (primary origin server); `slave` (secondary origin server). This parameter only takes effect when origin failover is enabled for the listener.
     */
    public String getRealServerFailoverRole() {
        return this.RealServerFailoverRole;
    }

    /**
     * Set Role of the origin server. Values: `master` (primary origin server); `slave` (secondary origin server). This parameter only takes effect when origin failover is enabled for the listener.
     * @param RealServerFailoverRole Role of the origin server. Values: `master` (primary origin server); `slave` (secondary origin server). This parameter only takes effect when origin failover is enabled for the listener.
     */
    public void setRealServerFailoverRole(String RealServerFailoverRole) {
        this.RealServerFailoverRole = RealServerFailoverRole;
    }

    public BindRealServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindRealServer(BindRealServer source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.RealServerIP != null) {
            this.RealServerIP = new String(source.RealServerIP);
        }
        if (source.RealServerWeight != null) {
            this.RealServerWeight = new Long(source.RealServerWeight);
        }
        if (source.RealServerStatus != null) {
            this.RealServerStatus = new Long(source.RealServerStatus);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.DownIPList != null) {
            this.DownIPList = new String[source.DownIPList.length];
            for (int i = 0; i < source.DownIPList.length; i++) {
                this.DownIPList[i] = new String(source.DownIPList[i]);
            }
        }
        if (source.RealServerFailoverRole != null) {
            this.RealServerFailoverRole = new String(source.RealServerFailoverRole);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerWeight", this.RealServerWeight);
        this.setParamSimple(map, prefix + "RealServerStatus", this.RealServerStatus);
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamArraySimple(map, prefix + "DownIPList.", this.DownIPList);
        this.setParamSimple(map, prefix + "RealServerFailoverRole", this.RealServerFailoverRole);

    }
}

