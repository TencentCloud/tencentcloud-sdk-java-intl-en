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

public class RealServerBindSetReq extends AbstractModel{

    /**
    * Origin server ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * Origin server port
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * Origin server IP
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
     * Get Origin server port 
     * @return RealServerPort Origin server port
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set Origin server port
     * @param RealServerPort Origin server port
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get Origin server IP 
     * @return RealServerIP Origin server IP
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set Origin server IP
     * @param RealServerIP Origin server IP
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

    public RealServerBindSetReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealServerBindSetReq(RealServerBindSetReq source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.RealServerIP != null) {
            this.RealServerIP = new String(source.RealServerIP);
        }
        if (source.RealServerWeight != null) {
            this.RealServerWeight = new Long(source.RealServerWeight);
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
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerWeight", this.RealServerWeight);
        this.setParamSimple(map, prefix + "RealServerFailoverRole", this.RealServerFailoverRole);

    }
}

