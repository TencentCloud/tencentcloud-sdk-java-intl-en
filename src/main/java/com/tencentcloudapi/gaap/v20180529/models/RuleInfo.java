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

public class RuleInfo extends AbstractModel{

    /**
    * Rule information
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Listener information
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Rule domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Origin server type
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * Forwarding policy of the origin server
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether health check is enabled. 1: enabled, 0: disabled
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * Rule status. 0: running, 1: creating, 2: terminating, 3: binding/unbinding origin server, 4: updating configuration
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * Health check parameters
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * Bound origin server information
    */
    @SerializedName("RealServerSet")
    @Expose
    private BindRealServer [] RealServerSet;

    /**
    * Origin server service status. 0: exceptional, 1: normal
If health check is not enabled, this status will always be normal.
As long as one origin server is exceptional, this status will be exceptional. Please view `RealServerSet` for the status of specific origin servers.
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * The `host` carried in the request forwarded from the connection to the origin server. `default` indicates directly forwarding the received 'host'.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
     * Get Rule information 
     * @return RuleId Rule information
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule information
     * @param RuleId Rule information
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Listener information 
     * @return ListenerId Listener information
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener information
     * @param ListenerId Listener information
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Rule domain name 
     * @return Domain Rule domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Rule domain name
     * @param Domain Rule domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Rule path 
     * @return Path Rule path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Rule path
     * @param Path Rule path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Origin server type 
     * @return RealServerType Origin server type
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set Origin server type
     * @param RealServerType Origin server type
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get Forwarding policy of the origin server 
     * @return Scheduler Forwarding policy of the origin server
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Forwarding policy of the origin server
     * @param Scheduler Forwarding policy of the origin server
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether health check is enabled. 1: enabled, 0: disabled 
     * @return HealthCheck Whether health check is enabled. 1: enabled, 0: disabled
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether health check is enabled. 1: enabled, 0: disabled
     * @param HealthCheck Whether health check is enabled. 1: enabled, 0: disabled
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Rule status. 0: running, 1: creating, 2: terminating, 3: binding/unbinding origin server, 4: updating configuration 
     * @return RuleStatus Rule status. 0: running, 1: creating, 2: terminating, 3: binding/unbinding origin server, 4: updating configuration
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Rule status. 0: running, 1: creating, 2: terminating, 3: binding/unbinding origin server, 4: updating configuration
     * @param RuleStatus Rule status. 0: running, 1: creating, 2: terminating, 3: binding/unbinding origin server, 4: updating configuration
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Health check parameters 
     * @return CheckParams Health check parameters
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * Set Health check parameters
     * @param CheckParams Health check parameters
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * Get Bound origin server information 
     * @return RealServerSet Bound origin server information
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set Bound origin server information
     * @param RealServerSet Bound origin server information
     */
    public void setRealServerSet(BindRealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * Get Origin server service status. 0: exceptional, 1: normal
If health check is not enabled, this status will always be normal.
As long as one origin server is exceptional, this status will be exceptional. Please view `RealServerSet` for the status of specific origin servers. 
     * @return BindStatus Origin server service status. 0: exceptional, 1: normal
If health check is not enabled, this status will always be normal.
As long as one origin server is exceptional, this status will be exceptional. Please view `RealServerSet` for the status of specific origin servers.
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Origin server service status. 0: exceptional, 1: normal
If health check is not enabled, this status will always be normal.
As long as one origin server is exceptional, this status will be exceptional. Please view `RealServerSet` for the status of specific origin servers.
     * @param BindStatus Origin server service status. 0: exceptional, 1: normal
If health check is not enabled, this status will always be normal.
As long as one origin server is exceptional, this status will be exceptional. Please view `RealServerSet` for the status of specific origin servers.
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get The `host` carried in the request forwarded from the connection to the origin server. `default` indicates directly forwarding the received 'host'.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForwardHost The `host` carried in the request forwarded from the connection to the origin server. `default` indicates directly forwarding the received 'host'.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * Set The `host` carried in the request forwarded from the connection to the origin server. `default` indicates directly forwarding the received 'host'.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForwardHost The `host` carried in the request forwarded from the connection to the origin server. `default` indicates directly forwarding the received 'host'.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    public RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfo(RuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.CheckParams != null) {
            this.CheckParams = new RuleCheckParams(source.CheckParams);
        }
        if (source.RealServerSet != null) {
            this.RealServerSet = new BindRealServer[source.RealServerSet.length];
            for (int i = 0; i < source.RealServerSet.length; i++) {
                this.RealServerSet[i] = new BindRealServer(source.RealServerSet[i]);
            }
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.ForwardHost != null) {
            this.ForwardHost = new String(source.ForwardHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);

    }
}

