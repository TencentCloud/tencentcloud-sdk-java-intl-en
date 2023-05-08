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

public class CreateRuleRequest extends AbstractModel{

    /**
    * Layer-7 listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name of the forwarding rule
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Path of the forwarding rule
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * The origin server type of the forwarding rule, which supports IP and DOMAIN types.
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy).
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether the health check is enabled for rules. 1: enabled; 0: disabled.
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * Parameters related to origin server health check
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * Protocol types of the forwarding from acceleration connection to origin server, which supports HTTP or HTTPS.
If this field is not passed in, it indicates that the ForwardProtocol of the corresponding listener will be used.
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * The host to which the acceleration connection forwards. If this parameter is not specified, the default host will be used, i.e., the host with which the client initiates HTTP requests.
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
    * Whether to enable SNI. Values: `on` (enable), `off` (disable). For creation of HTTP listener forwarding rules, SNI is disabled by default.
    */
    @SerializedName("ServerNameIndicationSwitch")
    @Expose
    private String ServerNameIndicationSwitch;

    /**
    * Server Name Indication (SNI). This field is required when `ServerNameIndicationSwitch` is `ON`.
    */
    @SerializedName("ServerNameIndication")
    @Expose
    private String ServerNameIndication;

    /**
    * Enables HTTP-to-HTTPS force redirect for a forwarding rule. Enter a hostname and path of the current forwarding rule.
    */
    @SerializedName("ForcedRedirect")
    @Expose
    private String ForcedRedirect;

    /**
     * Get Layer-7 listener ID 
     * @return ListenerId Layer-7 listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Layer-7 listener ID
     * @param ListenerId Layer-7 listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name of the forwarding rule 
     * @return Domain Domain name of the forwarding rule
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule
     * @param Domain Domain name of the forwarding rule
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Path of the forwarding rule 
     * @return Path Path of the forwarding rule
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path of the forwarding rule
     * @param Path Path of the forwarding rule
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get The origin server type of the forwarding rule, which supports IP and DOMAIN types. 
     * @return RealServerType The origin server type of the forwarding rule, which supports IP and DOMAIN types.
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set The origin server type of the forwarding rule, which supports IP and DOMAIN types.
     * @param RealServerType The origin server type of the forwarding rule, which supports IP and DOMAIN types.
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy). 
     * @return Scheduler The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy).
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy).
     * @param Scheduler The strategy used by the listener to access the origin server. Values: `rr` (round-robin), `wrr` (weighted round-robin), `lc` (the least-connections strategy).
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether the health check is enabled for rules. 1: enabled; 0: disabled. 
     * @return HealthCheck Whether the health check is enabled for rules. 1: enabled; 0: disabled.
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether the health check is enabled for rules. 1: enabled; 0: disabled.
     * @param HealthCheck Whether the health check is enabled for rules. 1: enabled; 0: disabled.
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Parameters related to origin server health check 
     * @return CheckParams Parameters related to origin server health check
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * Set Parameters related to origin server health check
     * @param CheckParams Parameters related to origin server health check
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * Get Protocol types of the forwarding from acceleration connection to origin server, which supports HTTP or HTTPS.
If this field is not passed in, it indicates that the ForwardProtocol of the corresponding listener will be used. 
     * @return ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server, which supports HTTP or HTTPS.
If this field is not passed in, it indicates that the ForwardProtocol of the corresponding listener will be used.
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set Protocol types of the forwarding from acceleration connection to origin server, which supports HTTP or HTTPS.
If this field is not passed in, it indicates that the ForwardProtocol of the corresponding listener will be used.
     * @param ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server, which supports HTTP or HTTPS.
If this field is not passed in, it indicates that the ForwardProtocol of the corresponding listener will be used.
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get The host to which the acceleration connection forwards. If this parameter is not specified, the default host will be used, i.e., the host with which the client initiates HTTP requests. 
     * @return ForwardHost The host to which the acceleration connection forwards. If this parameter is not specified, the default host will be used, i.e., the host with which the client initiates HTTP requests.
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * Set The host to which the acceleration connection forwards. If this parameter is not specified, the default host will be used, i.e., the host with which the client initiates HTTP requests.
     * @param ForwardHost The host to which the acceleration connection forwards. If this parameter is not specified, the default host will be used, i.e., the host with which the client initiates HTTP requests.
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * Get Whether to enable SNI. Values: `on` (enable), `off` (disable). For creation of HTTP listener forwarding rules, SNI is disabled by default. 
     * @return ServerNameIndicationSwitch Whether to enable SNI. Values: `on` (enable), `off` (disable). For creation of HTTP listener forwarding rules, SNI is disabled by default.
     */
    public String getServerNameIndicationSwitch() {
        return this.ServerNameIndicationSwitch;
    }

    /**
     * Set Whether to enable SNI. Values: `on` (enable), `off` (disable). For creation of HTTP listener forwarding rules, SNI is disabled by default.
     * @param ServerNameIndicationSwitch Whether to enable SNI. Values: `on` (enable), `off` (disable). For creation of HTTP listener forwarding rules, SNI is disabled by default.
     */
    public void setServerNameIndicationSwitch(String ServerNameIndicationSwitch) {
        this.ServerNameIndicationSwitch = ServerNameIndicationSwitch;
    }

    /**
     * Get Server Name Indication (SNI). This field is required when `ServerNameIndicationSwitch` is `ON`. 
     * @return ServerNameIndication Server Name Indication (SNI). This field is required when `ServerNameIndicationSwitch` is `ON`.
     */
    public String getServerNameIndication() {
        return this.ServerNameIndication;
    }

    /**
     * Set Server Name Indication (SNI). This field is required when `ServerNameIndicationSwitch` is `ON`.
     * @param ServerNameIndication Server Name Indication (SNI). This field is required when `ServerNameIndicationSwitch` is `ON`.
     */
    public void setServerNameIndication(String ServerNameIndication) {
        this.ServerNameIndication = ServerNameIndication;
    }

    /**
     * Get Enables HTTP-to-HTTPS force redirect for a forwarding rule. Enter a hostname and path of the current forwarding rule. 
     * @return ForcedRedirect Enables HTTP-to-HTTPS force redirect for a forwarding rule. Enter a hostname and path of the current forwarding rule.
     */
    public String getForcedRedirect() {
        return this.ForcedRedirect;
    }

    /**
     * Set Enables HTTP-to-HTTPS force redirect for a forwarding rule. Enter a hostname and path of the current forwarding rule.
     * @param ForcedRedirect Enables HTTP-to-HTTPS force redirect for a forwarding rule. Enter a hostname and path of the current forwarding rule.
     */
    public void setForcedRedirect(String ForcedRedirect) {
        this.ForcedRedirect = ForcedRedirect;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
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
        if (source.CheckParams != null) {
            this.CheckParams = new RuleCheckParams(source.CheckParams);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.ForwardHost != null) {
            this.ForwardHost = new String(source.ForwardHost);
        }
        if (source.ServerNameIndicationSwitch != null) {
            this.ServerNameIndicationSwitch = new String(source.ServerNameIndicationSwitch);
        }
        if (source.ServerNameIndication != null) {
            this.ServerNameIndication = new String(source.ServerNameIndication);
        }
        if (source.ForcedRedirect != null) {
            this.ForcedRedirect = new String(source.ForcedRedirect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);
        this.setParamSimple(map, prefix + "ServerNameIndicationSwitch", this.ServerNameIndicationSwitch);
        this.setParamSimple(map, prefix + "ServerNameIndication", this.ServerNameIndication);
        this.setParamSimple(map, prefix + "ForcedRedirect", this.ForcedRedirect);

    }
}

