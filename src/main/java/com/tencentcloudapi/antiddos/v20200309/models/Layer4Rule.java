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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Layer4Rule extends AbstractModel {

    /**
    * Real server port. Value range: 1–65535.
    */
    @SerializedName("BackendPort")
    @Expose
    private Long BackendPort;

    /**
    * Forwarding port. Value range: 1–65535.
    */
    @SerializedName("FrontendPort")
    @Expose
    private Long FrontendPort;

    /**
    * Forwarding rule. Valid values:
TCP
UDP
]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * List of real servers
    */
    @SerializedName("RealServers")
    @Expose
    private SourceServer [] RealServers;

    /**
    * Information of the Anti-DDoS instance
    */
    @SerializedName("InstanceDetails")
    @Expose
    private InstanceRelation [] InstanceDetails;

    /**
    * Information of the Anti-DDoS instance configured
    */
    @SerializedName("InstanceDetailRule")
    @Expose
    private RuleInstanceRelation [] InstanceDetailRule;

    /**
     * Get Real server port. Value range: 1–65535. 
     * @return BackendPort Real server port. Value range: 1–65535.
     */
    public Long getBackendPort() {
        return this.BackendPort;
    }

    /**
     * Set Real server port. Value range: 1–65535.
     * @param BackendPort Real server port. Value range: 1–65535.
     */
    public void setBackendPort(Long BackendPort) {
        this.BackendPort = BackendPort;
    }

    /**
     * Get Forwarding port. Value range: 1–65535. 
     * @return FrontendPort Forwarding port. Value range: 1–65535.
     */
    public Long getFrontendPort() {
        return this.FrontendPort;
    }

    /**
     * Set Forwarding port. Value range: 1–65535.
     * @param FrontendPort Forwarding port. Value range: 1–65535.
     */
    public void setFrontendPort(Long FrontendPort) {
        this.FrontendPort = FrontendPort;
    }

    /**
     * Get Forwarding rule. Valid values:
TCP
UDP
] 
     * @return Protocol Forwarding rule. Valid values:
TCP
UDP
]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding rule. Valid values:
TCP
UDP
]
     * @param Protocol Forwarding rule. Valid values:
TCP
UDP
]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get List of real servers 
     * @return RealServers List of real servers
     */
    public SourceServer [] getRealServers() {
        return this.RealServers;
    }

    /**
     * Set List of real servers
     * @param RealServers List of real servers
     */
    public void setRealServers(SourceServer [] RealServers) {
        this.RealServers = RealServers;
    }

    /**
     * Get Information of the Anti-DDoS instance 
     * @return InstanceDetails Information of the Anti-DDoS instance
     */
    public InstanceRelation [] getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set Information of the Anti-DDoS instance
     * @param InstanceDetails Information of the Anti-DDoS instance
     */
    public void setInstanceDetails(InstanceRelation [] InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    /**
     * Get Information of the Anti-DDoS instance configured 
     * @return InstanceDetailRule Information of the Anti-DDoS instance configured
     */
    public RuleInstanceRelation [] getInstanceDetailRule() {
        return this.InstanceDetailRule;
    }

    /**
     * Set Information of the Anti-DDoS instance configured
     * @param InstanceDetailRule Information of the Anti-DDoS instance configured
     */
    public void setInstanceDetailRule(RuleInstanceRelation [] InstanceDetailRule) {
        this.InstanceDetailRule = InstanceDetailRule;
    }

    public Layer4Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Layer4Rule(Layer4Rule source) {
        if (source.BackendPort != null) {
            this.BackendPort = new Long(source.BackendPort);
        }
        if (source.FrontendPort != null) {
            this.FrontendPort = new Long(source.FrontendPort);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RealServers != null) {
            this.RealServers = new SourceServer[source.RealServers.length];
            for (int i = 0; i < source.RealServers.length; i++) {
                this.RealServers[i] = new SourceServer(source.RealServers[i]);
            }
        }
        if (source.InstanceDetails != null) {
            this.InstanceDetails = new InstanceRelation[source.InstanceDetails.length];
            for (int i = 0; i < source.InstanceDetails.length; i++) {
                this.InstanceDetails[i] = new InstanceRelation(source.InstanceDetails[i]);
            }
        }
        if (source.InstanceDetailRule != null) {
            this.InstanceDetailRule = new RuleInstanceRelation[source.InstanceDetailRule.length];
            for (int i = 0; i < source.InstanceDetailRule.length; i++) {
                this.InstanceDetailRule[i] = new RuleInstanceRelation(source.InstanceDetailRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackendPort", this.BackendPort);
        this.setParamSimple(map, prefix + "FrontendPort", this.FrontendPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "RealServers.", this.RealServers);
        this.setParamArrayObj(map, prefix + "InstanceDetails.", this.InstanceDetails);
        this.setParamArrayObj(map, prefix + "InstanceDetailRule.", this.InstanceDetailRule);

    }
}

