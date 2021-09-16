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

public class UDPListener extends AbstractModel{

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerPort")
    @Expose
    private Long RealServerPort;

    /**
    * Type of the origin server bound to listeners
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * Listener protocol: UDP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listener status. Valid values:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: adjusting configuration.
    */
    @SerializedName("ListenerStatus")
    @Expose
    private Long ListenerStatus;

    /**
    * Origin server access policy of listeners
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Status of origin server bound to listener. 0: normal, 1: exceptional IP, 2: exceptional domain name resolution
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * Information of the origin server bound to listeners
    */
    @SerializedName("RealServerSet")
    @Expose
    private BindRealServer [] RealServerSet;

    /**
    * Listener creation time; using UNIX timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Long SessionPersist;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener port 
     * @return Port Listener port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port
     * @param Port Listener port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerPort Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealServerPort() {
        return this.RealServerPort;
    }

    /**
     * Set Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerPort Origin server port, which is only valid for the connections or connection groups of version 1.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerPort(Long RealServerPort) {
        this.RealServerPort = RealServerPort;
    }

    /**
     * Get Type of the origin server bound to listeners 
     * @return RealServerType Type of the origin server bound to listeners
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set Type of the origin server bound to listeners
     * @param RealServerType Type of the origin server bound to listeners
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get Listener protocol: UDP. 
     * @return Protocol Listener protocol: UDP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Listener protocol: UDP.
     * @param Protocol Listener protocol: UDP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listener status. Valid values:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: adjusting configuration. 
     * @return ListenerStatus Listener status. Valid values:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: adjusting configuration.
     */
    public Long getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set Listener status. Valid values:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: adjusting configuration.
     * @param ListenerStatus Listener status. Valid values:
0: running;
1: creating;
2: terminating;
3: adjusting origin server;
4: adjusting configuration.
     */
    public void setListenerStatus(Long ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get Origin server access policy of listeners 
     * @return Scheduler Origin server access policy of listeners
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Origin server access policy of listeners
     * @param Scheduler Origin server access policy of listeners
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Status of origin server bound to listener. 0: normal, 1: exceptional IP, 2: exceptional domain name resolution 
     * @return BindStatus Status of origin server bound to listener. 0: normal, 1: exceptional IP, 2: exceptional domain name resolution
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Status of origin server bound to listener. 0: normal, 1: exceptional IP, 2: exceptional domain name resolution
     * @param BindStatus Status of origin server bound to listener. 0: normal, 1: exceptional IP, 2: exceptional domain name resolution
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Information of the origin server bound to listeners 
     * @return RealServerSet Information of the origin server bound to listeners
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set Information of the origin server bound to listeners
     * @param RealServerSet Information of the origin server bound to listeners
     */
    public void setRealServerSet(BindRealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * Get Listener creation time; using UNIX timestamp. 
     * @return CreateTime Listener creation time; using UNIX timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Listener creation time; using UNIX timestamp.
     * @param CreateTime Listener creation time; using UNIX timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SessionPersist Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SessionPersist Specifies whether to enable session persistence. Values: `0` (disable), `1` (enable)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSessionPersist(Long SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    public UDPListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UDPListener(UDPListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.RealServerPort != null) {
            this.RealServerPort = new Long(source.RealServerPort);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new Long(source.ListenerStatus);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.RealServerSet != null) {
            this.RealServerSet = new BindRealServer[source.RealServerSet.length];
            for (int i = 0; i < source.RealServerSet.length; i++) {
                this.RealServerSet[i] = new BindRealServer(source.RealServerSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Long(source.SessionPersist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RealServerPort", this.RealServerPort);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);

    }
}

