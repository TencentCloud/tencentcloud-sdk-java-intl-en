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

public class ModifyApplicationProxyRuleRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Proxy ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Origin server type. Valid values:
<li>`custom`: Manually added;</li>
<li>origins: origin server group.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Port. Supported formats:
<li>80: port 80;</li>
<li>81-90: ports 81 to 90.</li>
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>Leave it blank to keep the original value.
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Details of the origin server:
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

If not specified, the original value is retained.
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Pass the client IP address. Valid values:
<li>TOA: TOA (selectable only when Proto = TCP);</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Leave it blank to keep the original value.
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>If not specified, false.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * Duration for session persistence, in seconds. The value takes effect only when SessionPersist is true.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * Origin server port. Supported formats:
<li>Single port: 80;</li>
<li>Port range: 81-90, ports 81 to 90.</li>
    */
    @SerializedName("OriginPort")
    @Expose
    private String OriginPort;

    /**
    * Rule tag. If not specified, the original value is retained.
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Proxy ID. 
     * @return ProxyId Proxy ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Proxy ID.
     * @param ProxyId Proxy ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
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
     * Get Origin server type. Valid values:
<li>`custom`: Manually added;</li>
<li>origins: origin server group.</li> 
     * @return OriginType Origin server type. Valid values:
<li>`custom`: Manually added;</li>
<li>origins: origin server group.</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
<li>`custom`: Manually added;</li>
<li>origins: origin server group.</li>
     * @param OriginType Origin server type. Valid values:
<li>`custom`: Manually added;</li>
<li>origins: origin server group.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Port. Supported formats:
<li>80: port 80;</li>
<li>81-90: ports 81 to 90.</li> 
     * @return Port Port. Supported formats:
<li>80: port 80;</li>
<li>81-90: ports 81 to 90.</li>
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set Port. Supported formats:
<li>80: port 80;</li>
<li>81-90: ports 81 to 90.</li>
     * @param Port Port. Supported formats:
<li>80: port 80;</li>
<li>81-90: ports 81 to 90.</li>
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>Leave it blank to keep the original value. 
     * @return Proto Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>Leave it blank to keep the original value.
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>Leave it blank to keep the original value.
     * @param Proto Protocol. Valid values:
<li>TCP: TCP protocol;</li>
<li>UDP: UDP protocol.</li>Leave it blank to keep the original value.
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Details of the origin server:
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

If not specified, the original value is retained. 
     * @return OriginValue Details of the origin server:
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

If not specified, the original value is retained.
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Details of the origin server:
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

If not specified, the original value is retained.
     * @param OriginValue Details of the origin server:
<li>When OriginType is custom, it indicates one or more origin servers, such as `["8.8.8.8","9.9.9.9"]` or `OriginValue=["test.com"]`;</li>
<li>When OriginType is origins, it requires one and only one element, indicating the origin server group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

If not specified, the original value is retained.
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Pass the client IP address. Valid values:
<li>TOA: TOA (selectable only when Proto = TCP);</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Leave it blank to keep the original value. 
     * @return ForwardClientIp Pass the client IP address. Valid values:
<li>TOA: TOA (selectable only when Proto = TCP);</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Leave it blank to keep the original value.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set Pass the client IP address. Valid values:
<li>TOA: TOA (selectable only when Proto = TCP);</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Leave it blank to keep the original value.
     * @param ForwardClientIp Pass the client IP address. Valid values:
<li>TOA: TOA (selectable only when Proto = TCP);</li>
<li>PPV1: passing via Proxy Protocol V1, available only when Proto = TCP;</li>
<li>PPV2: passing via Proxy Protocol V2;</li>
<li>OFF: no passing.</li>Leave it blank to keep the original value.
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>If not specified, false. 
     * @return SessionPersist Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>If not specified, false.
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>If not specified, false.
     * @param SessionPersist Whether to enable session persistence. Valid values:
<li>true: Enable;</li>
<li>false: Disable.</li>If not specified, false.
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Duration for session persistence, in seconds. The value takes effect only when SessionPersist is true. 
     * @return SessionPersistTime Duration for session persistence, in seconds. The value takes effect only when SessionPersist is true.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Duration for session persistence, in seconds. The value takes effect only when SessionPersist is true.
     * @param SessionPersistTime Duration for session persistence, in seconds. The value takes effect only when SessionPersist is true.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get Origin server port. Supported formats:
<li>Single port: 80;</li>
<li>Port range: 81-90, ports 81 to 90.</li> 
     * @return OriginPort Origin server port. Supported formats:
<li>Single port: 80;</li>
<li>Port range: 81-90, ports 81 to 90.</li>
     */
    public String getOriginPort() {
        return this.OriginPort;
    }

    /**
     * Set Origin server port. Supported formats:
<li>Single port: 80;</li>
<li>Port range: 81-90, ports 81 to 90.</li>
     * @param OriginPort Origin server port. Supported formats:
<li>Single port: 80;</li>
<li>Port range: 81-90, ports 81 to 90.</li>
     */
    public void setOriginPort(String OriginPort) {
        this.OriginPort = OriginPort;
    }

    /**
     * Get Rule tag. If not specified, the original value is retained. 
     * @return RuleTag Rule tag. If not specified, the original value is retained.
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set Rule tag. If not specified, the original value is retained.
     * @param RuleTag Rule tag. If not specified, the original value is retained.
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    public ModifyApplicationProxyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationProxyRuleRequest(ModifyApplicationProxyRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Port != null) {
            this.Port = new String[source.Port.length];
            for (int i = 0; i < source.Port.length; i++) {
                this.Port[i] = new String(source.Port[i]);
            }
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.OriginValue != null) {
            this.OriginValue = new String[source.OriginValue.length];
            for (int i = 0; i < source.OriginValue.length; i++) {
                this.OriginValue[i] = new String(source.OriginValue[i]);
            }
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "OriginPort", this.OriginPort);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);

    }
}

