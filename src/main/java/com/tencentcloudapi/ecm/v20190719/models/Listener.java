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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Listener extends AbstractModel {

    /**
    * CLB listener ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Health check information of the listener
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Request scheduling method
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Session persistence time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Listener name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Session type of the listener
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionType")
    @Expose
    private String SessionType;

    /**
    * End port of the port range
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
     * Get CLB listener ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListenerId CLB listener ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListenerId CLB listener ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener protocol
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Listener protocol
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener port.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Listener port.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Health check information of the listener
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheck Health check information of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check information of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HealthCheck Health check information of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Request scheduling method
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Scheduler Request scheduling method
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Request scheduling method
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Scheduler Request scheduling method
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Session persistence time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SessionExpireTime Session persistence time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SessionExpireTime Session persistence time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Listener name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ListenerName Listener name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ListenerName Listener name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Listener creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Listener creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Listener creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Session type of the listener
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SessionType Session type of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionType() {
        return this.SessionType;
    }

    /**
     * Set Session type of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SessionType Session type of the listener
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionType(String SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get End port of the port range
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndPort End port of the port range
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set End port of the port range
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndPort End port of the port range
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    public Listener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Listener(Listener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SessionType != null) {
            this.SessionType = new String(source.SessionType);
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
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);

    }
}

