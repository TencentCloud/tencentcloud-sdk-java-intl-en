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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelatedListener extends AbstractModel {

    /**
    * Listener ID, format: lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener port.
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * Listener protocol.
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
     * Get Listener ID, format: lst- followed by 8 alphanumeric characters. 
     * @return ListenerId Listener ID, format: lst- followed by 8 alphanumeric characters.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID, format: lst- followed by 8 alphanumeric characters.
     * @param ListenerId Listener ID, format: lst- followed by 8 alphanumeric characters.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener port. 
     * @return ListenerPort Listener port.
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set Listener port.
     * @param ListenerPort Listener port.
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get Listener protocol. 
     * @return ListenerProtocol Listener protocol.
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set Listener protocol.
     * @param ListenerProtocol Listener protocol.
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters. 
     * @return LoadBalancerId CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     * @param LoadBalancerId CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    public RelatedListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelatedListener(RelatedListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.ListenerProtocol != null) {
            this.ListenerProtocol = new String(source.ListenerProtocol);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);

    }
}

