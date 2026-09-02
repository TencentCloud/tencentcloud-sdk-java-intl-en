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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxACLDstRule extends AbstractModel {

    /**
    * Target IP list
Input parameter limit: each item supports three formats: single IP address (for example, 10.0.0.1), CIDR block (for example, 10.0.0.1/24), and IP range (for example, 10.0.0.1-10.0.2.0).
    */
    @SerializedName("DstIP")
    @Expose
    private String [] DstIP;

    /**
    * List of excluded target IPs
Input parameter limitations: The format is the same as that of DstIP.
    */
    @SerializedName("DstIPExcept")
    @Expose
    private String [] DstIPExcept;

    /**
    * Target port or port range
Input parameter limit: single port, for example, 80; port range, for example, 8000-9000.
    */
    @SerializedName("DstPort")
    @Expose
    private String [] DstPort;

    /**
    * Excluded target port list
Input parameter limitations: The format is the same as that of DstPort.
    */
    @SerializedName("DstPortExcept")
    @Expose
    private String [] DstPortExcept;

    /**
     * Get Target IP list
Input parameter limit: each item supports three formats: single IP address (for example, 10.0.0.1), CIDR block (for example, 10.0.0.1/24), and IP range (for example, 10.0.0.1-10.0.2.0). 
     * @return DstIP Target IP list
Input parameter limit: each item supports three formats: single IP address (for example, 10.0.0.1), CIDR block (for example, 10.0.0.1/24), and IP range (for example, 10.0.0.1-10.0.2.0).
     */
    public String [] getDstIP() {
        return this.DstIP;
    }

    /**
     * Set Target IP list
Input parameter limit: each item supports three formats: single IP address (for example, 10.0.0.1), CIDR block (for example, 10.0.0.1/24), and IP range (for example, 10.0.0.1-10.0.2.0).
     * @param DstIP Target IP list
Input parameter limit: each item supports three formats: single IP address (for example, 10.0.0.1), CIDR block (for example, 10.0.0.1/24), and IP range (for example, 10.0.0.1-10.0.2.0).
     */
    public void setDstIP(String [] DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get List of excluded target IPs
Input parameter limitations: The format is the same as that of DstIP. 
     * @return DstIPExcept List of excluded target IPs
Input parameter limitations: The format is the same as that of DstIP.
     */
    public String [] getDstIPExcept() {
        return this.DstIPExcept;
    }

    /**
     * Set List of excluded target IPs
Input parameter limitations: The format is the same as that of DstIP.
     * @param DstIPExcept List of excluded target IPs
Input parameter limitations: The format is the same as that of DstIP.
     */
    public void setDstIPExcept(String [] DstIPExcept) {
        this.DstIPExcept = DstIPExcept;
    }

    /**
     * Get Target port or port range
Input parameter limit: single port, for example, 80; port range, for example, 8000-9000. 
     * @return DstPort Target port or port range
Input parameter limit: single port, for example, 80; port range, for example, 8000-9000.
     */
    public String [] getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port or port range
Input parameter limit: single port, for example, 80; port range, for example, 8000-9000.
     * @param DstPort Target port or port range
Input parameter limit: single port, for example, 80; port range, for example, 8000-9000.
     */
    public void setDstPort(String [] DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Excluded target port list
Input parameter limitations: The format is the same as that of DstPort. 
     * @return DstPortExcept Excluded target port list
Input parameter limitations: The format is the same as that of DstPort.
     */
    public String [] getDstPortExcept() {
        return this.DstPortExcept;
    }

    /**
     * Set Excluded target port list
Input parameter limitations: The format is the same as that of DstPort.
     * @param DstPortExcept Excluded target port list
Input parameter limitations: The format is the same as that of DstPort.
     */
    public void setDstPortExcept(String [] DstPortExcept) {
        this.DstPortExcept = DstPortExcept;
    }

    public TrafficSandboxACLDstRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxACLDstRule(TrafficSandboxACLDstRule source) {
        if (source.DstIP != null) {
            this.DstIP = new String[source.DstIP.length];
            for (int i = 0; i < source.DstIP.length; i++) {
                this.DstIP[i] = new String(source.DstIP[i]);
            }
        }
        if (source.DstIPExcept != null) {
            this.DstIPExcept = new String[source.DstIPExcept.length];
            for (int i = 0; i < source.DstIPExcept.length; i++) {
                this.DstIPExcept[i] = new String(source.DstIPExcept[i]);
            }
        }
        if (source.DstPort != null) {
            this.DstPort = new String[source.DstPort.length];
            for (int i = 0; i < source.DstPort.length; i++) {
                this.DstPort[i] = new String(source.DstPort[i]);
            }
        }
        if (source.DstPortExcept != null) {
            this.DstPortExcept = new String[source.DstPortExcept.length];
            for (int i = 0; i < source.DstPortExcept.length; i++) {
                this.DstPortExcept[i] = new String(source.DstPortExcept[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DstIP.", this.DstIP);
        this.setParamArraySimple(map, prefix + "DstIPExcept.", this.DstIPExcept);
        this.setParamArraySimple(map, prefix + "DstPort.", this.DstPort);
        this.setParamArraySimple(map, prefix + "DstPortExcept.", this.DstPortExcept);

    }
}

