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

public class ClassicalListener extends AbstractModel {

    /**
    * <p>CLB listener ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>CLB listener port</p>
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * <p>listener backend forwarding port</p>
    */
    @SerializedName("InstancePort")
    @Expose
    private Long InstancePort;

    /**
    * <p>Listener name</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>Listener protocol type</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Session persistence time</p>
    */
    @SerializedName("SessionExpire")
    @Expose
    private Long SessionExpire;

    /**
    * <p>Whether health check is enabled: 1 (enabled), 0 (disabled)</p>
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * <p>Response timeout</p><p>Unit: second</p>
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * <p>Check interval</p><p>Unit: seconds</p>
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * <p>Health threshold</p>
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * <p>Unhealthy threshold</p>
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * <p>Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.</p>
    */
    @SerializedName("HttpHash")
    @Expose
    private String HttpHash;

    /**
    * <p>Health check return code of HTTP and HTTPS listeners for public network CLB. For details, see the explanation of this field in listener creation API.</p>
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * <p>Health check path of HTTP and HTTPS listeners for public network CLB</p>
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * <p>Authentication method of the HTTPS listener for public network CLB</p>
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * <p>Server certificate ID of the HTTPS listener for the public network CLB</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>Client certificate ID of the HTTPS listener for public network CLB</p>
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * <p>Listener status. 0 indicates creating in progress, 1 indicates running.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>CLB listener ID</p> 
     * @return ListenerId <p>CLB listener ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>CLB listener ID</p>
     * @param ListenerId <p>CLB listener ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>CLB listener port</p> 
     * @return ListenerPort <p>CLB listener port</p>
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set <p>CLB listener port</p>
     * @param ListenerPort <p>CLB listener port</p>
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get <p>listener backend forwarding port</p> 
     * @return InstancePort <p>listener backend forwarding port</p>
     */
    public Long getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set <p>listener backend forwarding port</p>
     * @param InstancePort <p>listener backend forwarding port</p>
     */
    public void setInstancePort(Long InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * Get <p>Listener name</p> 
     * @return ListenerName <p>Listener name</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>Listener name</p>
     * @param ListenerName <p>Listener name</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>Listener protocol type</p> 
     * @return Protocol <p>Listener protocol type</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Listener protocol type</p>
     * @param Protocol <p>Listener protocol type</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Session persistence time</p> 
     * @return SessionExpire <p>Session persistence time</p>
     */
    public Long getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * Set <p>Session persistence time</p>
     * @param SessionExpire <p>Session persistence time</p>
     */
    public void setSessionExpire(Long SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * Get <p>Whether health check is enabled: 1 (enabled), 0 (disabled)</p> 
     * @return HealthSwitch <p>Whether health check is enabled: 1 (enabled), 0 (disabled)</p>
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set <p>Whether health check is enabled: 1 (enabled), 0 (disabled)</p>
     * @param HealthSwitch <p>Whether health check is enabled: 1 (enabled), 0 (disabled)</p>
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get <p>Response timeout</p><p>Unit: second</p> 
     * @return TimeOut <p>Response timeout</p><p>Unit: second</p>
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set <p>Response timeout</p><p>Unit: second</p>
     * @param TimeOut <p>Response timeout</p><p>Unit: second</p>
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get <p>Check interval</p><p>Unit: seconds</p> 
     * @return IntervalTime <p>Check interval</p><p>Unit: seconds</p>
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set <p>Check interval</p><p>Unit: seconds</p>
     * @param IntervalTime <p>Check interval</p><p>Unit: seconds</p>
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get <p>Health threshold</p> 
     * @return HealthNum <p>Health threshold</p>
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set <p>Health threshold</p>
     * @param HealthNum <p>Health threshold</p>
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get <p>Unhealthy threshold</p> 
     * @return UnhealthNum <p>Unhealthy threshold</p>
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set <p>Unhealthy threshold</p>
     * @param UnhealthNum <p>Unhealthy threshold</p>
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get <p>Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.</p> 
     * @return HttpHash <p>Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.</p>
     */
    public String getHttpHash() {
        return this.HttpHash;
    }

    /**
     * Set <p>Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.</p>
     * @param HttpHash <p>Request balancing method for listeners of the classic public network CLB. An empty string or wrr indicates weighted round robin. ip_hash indicates consistent hashing based on the accessed source IP address. least_conn indicates least connections.</p>
     */
    public void setHttpHash(String HttpHash) {
        this.HttpHash = HttpHash;
    }

    /**
     * Get <p>Health check return code of HTTP and HTTPS listeners for public network CLB. For details, see the explanation of this field in listener creation API.</p> 
     * @return HttpCode <p>Health check return code of HTTP and HTTPS listeners for public network CLB. For details, see the explanation of this field in listener creation API.</p>
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set <p>Health check return code of HTTP and HTTPS listeners for public network CLB. For details, see the explanation of this field in listener creation API.</p>
     * @param HttpCode <p>Health check return code of HTTP and HTTPS listeners for public network CLB. For details, see the explanation of this field in listener creation API.</p>
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get <p>Health check path of HTTP and HTTPS listeners for public network CLB</p> 
     * @return HttpCheckPath <p>Health check path of HTTP and HTTPS listeners for public network CLB</p>
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set <p>Health check path of HTTP and HTTPS listeners for public network CLB</p>
     * @param HttpCheckPath <p>Health check path of HTTP and HTTPS listeners for public network CLB</p>
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get <p>Authentication method of the HTTPS listener for public network CLB</p> 
     * @return SSLMode <p>Authentication method of the HTTPS listener for public network CLB</p>
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set <p>Authentication method of the HTTPS listener for public network CLB</p>
     * @param SSLMode <p>Authentication method of the HTTPS listener for public network CLB</p>
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get <p>Server certificate ID of the HTTPS listener for the public network CLB</p> 
     * @return CertId <p>Server certificate ID of the HTTPS listener for the public network CLB</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>Server certificate ID of the HTTPS listener for the public network CLB</p>
     * @param CertId <p>Server certificate ID of the HTTPS listener for the public network CLB</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>Client certificate ID of the HTTPS listener for public network CLB</p> 
     * @return CertCaId <p>Client certificate ID of the HTTPS listener for public network CLB</p>
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set <p>Client certificate ID of the HTTPS listener for public network CLB</p>
     * @param CertCaId <p>Client certificate ID of the HTTPS listener for public network CLB</p>
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get <p>Listener status. 0 indicates creating in progress, 1 indicates running.</p> 
     * @return Status <p>Listener status. 0 indicates creating in progress, 1 indicates running.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Listener status. 0 indicates creating in progress, 1 indicates running.</p>
     * @param Status <p>Listener status. 0 indicates creating in progress, 1 indicates running.</p>
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
        if (source.UnhealthNum != null) {
            this.UnhealthNum = new Long(source.UnhealthNum);
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
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamSimple(map, prefix + "HttpHash", this.HttpHash);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

