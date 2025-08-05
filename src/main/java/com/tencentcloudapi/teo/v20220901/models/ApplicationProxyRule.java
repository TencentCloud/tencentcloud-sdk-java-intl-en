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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProxyRule extends AbstractModel {

    /**
    * Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
Note: Up to 20 ports can be input for each rule.
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * Origin server type. Valid values:
<li>custom: manually added;</li>
<li>loadbalancer: cloud load balancer;</li>
<li>origins: origin server group.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server information.
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is loadbalancer, it indicates a cloud load balancer, such as ["lb-xdffsfasdfs"];</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Passing the client IP address. Valid values:
<li>TOA: passing via TOA, available only when Proto = TCP;</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Default value: OFF.
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>Default value: false.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * Duration for session persistence. the value takes effect only when SessionPersist is true.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Origin server port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
    */
    @SerializedName("OriginPort")
    @Expose
    private String OriginPort;

    /**
    * Tag of the rule.
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
     * Get Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li> 
     * @return Proto Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
     * @param Proto Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
Note: Up to 20 ports can be input for each rule. 
     * @return Port Port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
Note: Up to 20 ports can be input for each rule.
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set Port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
Note: Up to 20 ports can be input for each rule.
     * @param Port Port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
Note: Up to 20 ports can be input for each rule.
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get Origin server type. Valid values:
<li>custom: manually added;</li>
<li>loadbalancer: cloud load balancer;</li>
<li>origins: origin server group.</li> 
     * @return OriginType Origin server type. Valid values:
<li>custom: manually added;</li>
<li>loadbalancer: cloud load balancer;</li>
<li>origins: origin server group.</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
<li>custom: manually added;</li>
<li>loadbalancer: cloud load balancer;</li>
<li>origins: origin server group.</li>
     * @param OriginType Origin server type. Valid values:
<li>custom: manually added;</li>
<li>loadbalancer: cloud load balancer;</li>
<li>origins: origin server group.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server information.
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is loadbalancer, it indicates a cloud load balancer, such as ["lb-xdffsfasdfs"];</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li> 
     * @return OriginValue Origin server information.
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is loadbalancer, it indicates a cloud load balancer, such as ["lb-xdffsfasdfs"];</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Origin server information.
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is loadbalancer, it indicates a cloud load balancer, such as ["lb-xdffsfasdfs"];</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>
     * @param OriginValue Origin server information.
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is loadbalancer, it indicates a cloud load balancer, such as ["lb-xdffsfasdfs"];</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Rule ID. 
     * @return RuleId Rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID.
     * @param RuleId Rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li> 
     * @return Status Status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
     * @param Status Status. Valid values:
<li>online: enabled;</li>
<li>offline: disabled;</li>
<li>progress: deploying;</li>
<li>stopping: disabling;</li>
<li>fail: deployment or disabling failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Passing the client IP address. Valid values:
<li>TOA: passing via TOA, available only when Proto = TCP;</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Default value: OFF. 
     * @return ForwardClientIp Passing the client IP address. Valid values:
<li>TOA: passing via TOA, available only when Proto = TCP;</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Default value: OFF.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set Passing the client IP address. Valid values:
<li>TOA: passing via TOA, available only when Proto = TCP;</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Default value: OFF.
     * @param ForwardClientIp Passing the client IP address. Valid values:
<li>TOA: passing via TOA, available only when Proto = TCP;</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Default value: OFF.
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>Default value: false. 
     * @return SessionPersist Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>Default value: false.
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>Default value: false.
     * @param SessionPersist Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>Default value: false.
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Duration for session persistence. the value takes effect only when SessionPersist is true. 
     * @return SessionPersistTime Duration for session persistence. the value takes effect only when SessionPersist is true.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Duration for session persistence. the value takes effect only when SessionPersist is true.
     * @param SessionPersistTime Duration for session persistence. the value takes effect only when SessionPersist is true.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Origin server port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li> 
     * @return OriginPort Origin server port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
     */
    public String getOriginPort() {
        return this.OriginPort;
    }

    /**
     * Set Origin server port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
     * @param OriginPort Origin server port. Supported formats:
<li>A single port, such as 80.</li>
<li>A port range, such as 81-82, indicating two ports 81 and 82.</li>
     */
    public void setOriginPort(String OriginPort) {
        this.OriginPort = OriginPort;
    }

    /**
     * Get Tag of the rule. 
     * @return RuleTag Tag of the rule.
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set Tag of the rule.
     * @param RuleTag Tag of the rule.
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    public ApplicationProxyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationProxyRule(ApplicationProxyRule source) {
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.Port != null) {
            this.Port = new String[source.Port.length];
            for (int i = 0; i < source.Port.length; i++) {
                this.Port[i] = new String(source.Port[i]);
            }
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.OriginValue != null) {
            this.OriginValue = new String[source.OriginValue.length];
            for (int i = 0; i < source.OriginValue.length; i++) {
                this.OriginValue[i] = new String(source.OriginValue[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.OriginPort != null) {
            this.OriginPort = new String(source.OriginPort);
        }
        if (source.RuleTag != null) {
            this.RuleTag = new String(source.RuleTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "OriginPort", this.OriginPort);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);

    }
}

