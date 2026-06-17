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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassicalListener extends AbstractModel {

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * CLB listener port
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * Listener backend forwarding port
    */
    @SerializedName("InstancePort")
    @Expose
    private Long InstancePort;

    /**
    * listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener protocol type
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Session hold time
    */
    @SerializedName("SessionExpire")
    @Expose
    private Long SessionExpire;

    /**
    * Whether health check is enabled. 1: Enabled; 0: Disabled
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * Response timeout duration
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * check interval
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * health threshold
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * unhealthy threshold
    */
    @SerializedName("AbnormalNum")
    @Expose
    private Long AbnormalNum;

    /**
    * Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.
    */
    @SerializedName("HttpHash")
    @Expose
    private String HttpHash;

    /**
    * Health check return code for HTTP and HTTPS listeners of a public network Classic CLB instance. For more information, refer to the explanation of this field in the listener creation API.
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * Health check path for HTTP and HTTPS listeners of a public network Classic CLB instance
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * Authentication method for an HTTPS listener of a public network Classic CLB instance
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * Server certificate ID for an HTTPS listener of a public network Classic CLB instance
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Client certificate ID for an HTTPS listener of a public network Classic CLB instance
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * Listener status. 0: Creating; 1: Running
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get CLB listener ID 
     * @return ListenerId CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
     * @param ListenerId CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get CLB listener port 
     * @return ListenerPort CLB listener port
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set CLB listener port
     * @param ListenerPort CLB listener port
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get Listener backend forwarding port 
     * @return InstancePort Listener backend forwarding port
     */
    public Long getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set Listener backend forwarding port
     * @param InstancePort Listener backend forwarding port
     */
    public void setInstancePort(Long InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * Get listener name 
     * @return ListenerName listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set listener name
     * @param ListenerName listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener protocol type 
     * @return Protocol Listener protocol type
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol type
     * @param Protocol Listener protocol type
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Session hold time 
     * @return SessionExpire Session hold time
     */
    public Long getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * Set Session hold time
     * @param SessionExpire Session hold time
     */
    public void setSessionExpire(Long SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * Get Whether health check is enabled. 1: Enabled; 0: Disabled 
     * @return HealthSwitch Whether health check is enabled. 1: Enabled; 0: Disabled
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set Whether health check is enabled. 1: Enabled; 0: Disabled
     * @param HealthSwitch Whether health check is enabled. 1: Enabled; 0: Disabled
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get Response timeout duration 
     * @return TimeOut Response timeout duration
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Response timeout duration
     * @param TimeOut Response timeout duration
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get check interval 
     * @return IntervalTime check interval
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set check interval
     * @param IntervalTime check interval
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get health threshold 
     * @return HealthNum health threshold
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set health threshold
     * @param HealthNum health threshold
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get unhealthy threshold 
     * @return AbnormalNum unhealthy threshold
     */
    public Long getAbnormalNum() {
        return this.AbnormalNum;
    }

    /**
     * Set unhealthy threshold
     * @param AbnormalNum unhealthy threshold
     */
    public void setAbnormalNum(Long AbnormalNum) {
        this.AbnormalNum = AbnormalNum;
    }

    /**
     * Get Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections. 
     * @return HttpHash Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.
     */
    public String getHttpHash() {
        return this.HttpHash;
    }

    /**
     * Set Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.
     * @param HttpHash Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.
     */
    public void setHttpHash(String HttpHash) {
        this.HttpHash = HttpHash;
    }

    /**
     * Get Health check return code for HTTP and HTTPS listeners of a public network Classic CLB instance. For more information, refer to the explanation of this field in the listener creation API. 
     * @return HttpCode Health check return code for HTTP and HTTPS listeners of a public network Classic CLB instance. For more information, refer to the explanation of this field in the listener creation API.
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set Health check return code for HTTP and HTTPS listeners of a public network Classic CLB instance. For more information, refer to the explanation of this field in the listener creation API.
     * @param HttpCode Health check return code for HTTP and HTTPS listeners of a public network Classic CLB instance. For more information, refer to the explanation of this field in the listener creation API.
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get Health check path for HTTP and HTTPS listeners of a public network Classic CLB instance 
     * @return HttpCheckPath Health check path for HTTP and HTTPS listeners of a public network Classic CLB instance
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set Health check path for HTTP and HTTPS listeners of a public network Classic CLB instance
     * @param HttpCheckPath Health check path for HTTP and HTTPS listeners of a public network Classic CLB instance
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get Authentication method for an HTTPS listener of a public network Classic CLB instance 
     * @return SSLMode Authentication method for an HTTPS listener of a public network Classic CLB instance
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set Authentication method for an HTTPS listener of a public network Classic CLB instance
     * @param SSLMode Authentication method for an HTTPS listener of a public network Classic CLB instance
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get Server certificate ID for an HTTPS listener of a public network Classic CLB instance 
     * @return CertId Server certificate ID for an HTTPS listener of a public network Classic CLB instance
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID for an HTTPS listener of a public network Classic CLB instance
     * @param CertId Server certificate ID for an HTTPS listener of a public network Classic CLB instance
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Client certificate ID for an HTTPS listener of a public network Classic CLB instance 
     * @return CertCaId Client certificate ID for an HTTPS listener of a public network Classic CLB instance
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set Client certificate ID for an HTTPS listener of a public network Classic CLB instance
     * @param CertCaId Client certificate ID for an HTTPS listener of a public network Classic CLB instance
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get Listener status. 0: Creating; 1: Running 
     * @return Status Listener status. 0: Creating; 1: Running
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Listener status. 0: Creating; 1: Running
     * @param Status Listener status. 0: Creating; 1: Running
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ClassicalListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassicalListener(ClassicalListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.InstancePort != null) {
            this.InstancePort = new Long(source.InstancePort);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SessionExpire != null) {
            this.SessionExpire = new Long(source.SessionExpire);
        }
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Long(source.HealthSwitch);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.HealthNum != null) {
            this.HealthNum = new Long(source.HealthNum);
        }
        if (source.AbnormalNum != null) {
            this.AbnormalNum = new Long(source.AbnormalNum);
        }
        if (source.HttpHash != null) {
            this.HttpHash = new String(source.HttpHash);
        }
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.HttpCheckPath != null) {
            this.HttpCheckPath = new String(source.HttpCheckPath);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "InstancePort", this.InstancePort);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SessionExpire", this.SessionExpire);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "AbnormalNum", this.AbnormalNum);
        this.setParamSimple(map, prefix + "HttpHash", this.HttpHash);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

