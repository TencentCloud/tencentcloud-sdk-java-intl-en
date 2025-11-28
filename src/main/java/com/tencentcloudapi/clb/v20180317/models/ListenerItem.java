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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerItem extends AbstractModel {

    /**
    * Listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private RulesItems [] Rules;

    /**
    * Object bound to the layer-4 listener.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Targets")
    @Expose
    private LbRsTargets [] Targets;

    /**
    * End port of a port range for a listener
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
     * Get Listener ID. 
     * @return ListenerId Listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID.
     * @param ListenerId Listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener protocol. 
     * @return Protocol Listener protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol.
     * @param Protocol Listener protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port. 
     * @return Port Listener port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port.
     * @param Port Listener port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Rules Bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RulesItems [] getRules() {
        return this.Rules;
    }

    /**
     * Set Bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Rules Bound rule.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRules(RulesItems [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Object bound to the layer-4 listener.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Targets Object bound to the layer-4 listener.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public LbRsTargets [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Object bound to the layer-4 listener.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Targets Object bound to the layer-4 listener.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargets(LbRsTargets [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get End port of a port range for a listener 
     * @return EndPort End port of a port range for a listener
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set End port of a port range for a listener
     * @param EndPort End port of a port range for a listener
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    public ListenerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerItem(ListenerItem source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Rules != null) {
            this.Rules = new RulesItems[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RulesItems(source.Rules[i]);
            }
        }
        if (source.Targets != null) {
            this.Targets = new LbRsTargets[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new LbRsTargets(source.Targets[i]);
            }
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);

    }
}

