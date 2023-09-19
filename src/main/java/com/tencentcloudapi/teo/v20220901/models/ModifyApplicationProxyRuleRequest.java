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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationProxyRuleRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The proxy ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * The origin type. Values:
<li>`custom`: Specified origins</li>
<li>`origins`: Origin group</li></li>The original configuration will apply if this field is not specified.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * The access port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-90</li>
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * The protocol. Values:
<li>`TCP`: TCP protocol</li>
<li>`UDP`: UDP protocol</li>The original configuration will apply if this field is not specified.
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Origin server information:
<li>When `OriginType=custom`, it indicates one or more origin servers, such as ["8.8.8.8","9.9.9.9"] or ["test.com"].</li>
<li>When `OriginType=origins`, it indicates an origin group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

The original configuration will apply if this field is not specified.
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Passes the client IP. Values:
<li>`TOA`: Pass the client IP via TOA (available only when `Proto=TCP`).</li>
<li>`PPV1`: Pass the client IP via Proxy Protocol V1 (available only when `Proto=TCP`).</li>
<li>`PPV2`: Pass the client IP via Proxy Protocol V2.</li>
<li>`OFF`: Not pass the client IP.</li>If not specified, this field uses the default value OFF.
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * Whether to enable session persistence. Values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>If it is left empty, the default value `false` is used.
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * Duration for the persistent session. The value takes effect only when `SessionPersist = true`.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * The origin port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-82</li>
    */
    @SerializedName("OriginPort")
    @Expose
    private String OriginPort;

    /**
    * Rule tag. The original configuration will apply if it is not specified.
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The proxy ID. 
     * @return ProxyId The proxy ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set The proxy ID.
     * @param ProxyId The proxy ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get The rule ID. 
     * @return RuleId The rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
     * @param RuleId The rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The origin type. Values:
<li>`custom`: Specified origins</li>
<li>`origins`: Origin group</li></li>The original configuration will apply if this field is not specified. 
     * @return OriginType The origin type. Values:
<li>`custom`: Specified origins</li>
<li>`origins`: Origin group</li></li>The original configuration will apply if this field is not specified.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set The origin type. Values:
<li>`custom`: Specified origins</li>
<li>`origins`: Origin group</li></li>The original configuration will apply if this field is not specified.
     * @param OriginType The origin type. Values:
<li>`custom`: Specified origins</li>
<li>`origins`: Origin group</li></li>The original configuration will apply if this field is not specified.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get The access port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-90</li> 
     * @return Port The access port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-90</li>
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set The access port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-90</li>
     * @param Port The access port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-90</li>
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get The protocol. Values:
<li>`TCP`: TCP protocol</li>
<li>`UDP`: UDP protocol</li>The original configuration will apply if this field is not specified. 
     * @return Proto The protocol. Values:
<li>`TCP`: TCP protocol</li>
<li>`UDP`: UDP protocol</li>The original configuration will apply if this field is not specified.
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set The protocol. Values:
<li>`TCP`: TCP protocol</li>
<li>`UDP`: UDP protocol</li>The original configuration will apply if this field is not specified.
     * @param Proto The protocol. Values:
<li>`TCP`: TCP protocol</li>
<li>`UDP`: UDP protocol</li>The original configuration will apply if this field is not specified.
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Origin server information:
<li>When `OriginType=custom`, it indicates one or more origin servers, such as ["8.8.8.8","9.9.9.9"] or ["test.com"].</li>
<li>When `OriginType=origins`, it indicates an origin group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

The original configuration will apply if this field is not specified. 
     * @return OriginValue Origin server information:
<li>When `OriginType=custom`, it indicates one or more origin servers, such as ["8.8.8.8","9.9.9.9"] or ["test.com"].</li>
<li>When `OriginType=origins`, it indicates an origin group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

The original configuration will apply if this field is not specified.
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Origin server information:
<li>When `OriginType=custom`, it indicates one or more origin servers, such as ["8.8.8.8","9.9.9.9"] or ["test.com"].</li>
<li>When `OriginType=origins`, it indicates an origin group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

The original configuration will apply if this field is not specified.
     * @param OriginValue Origin server information:
<li>When `OriginType=custom`, it indicates one or more origin servers, such as ["8.8.8.8","9.9.9.9"] or ["test.com"].</li>
<li>When `OriginType=origins`, it indicates an origin group ID, such as ["origin-537f5b41-162a-11ed-abaa-525400c5da15"].</li>

The original configuration will apply if this field is not specified.
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Passes the client IP. Values:
<li>`TOA`: Pass the client IP via TOA (available only when `Proto=TCP`).</li>
<li>`PPV1`: Pass the client IP via Proxy Protocol V1 (available only when `Proto=TCP`).</li>
<li>`PPV2`: Pass the client IP via Proxy Protocol V2.</li>
<li>`OFF`: Not pass the client IP.</li>If not specified, this field uses the default value OFF. 
     * @return ForwardClientIp Passes the client IP. Values:
<li>`TOA`: Pass the client IP via TOA (available only when `Proto=TCP`).</li>
<li>`PPV1`: Pass the client IP via Proxy Protocol V1 (available only when `Proto=TCP`).</li>
<li>`PPV2`: Pass the client IP via Proxy Protocol V2.</li>
<li>`OFF`: Not pass the client IP.</li>If not specified, this field uses the default value OFF.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set Passes the client IP. Values:
<li>`TOA`: Pass the client IP via TOA (available only when `Proto=TCP`).</li>
<li>`PPV1`: Pass the client IP via Proxy Protocol V1 (available only when `Proto=TCP`).</li>
<li>`PPV2`: Pass the client IP via Proxy Protocol V2.</li>
<li>`OFF`: Not pass the client IP.</li>If not specified, this field uses the default value OFF.
     * @param ForwardClientIp Passes the client IP. Values:
<li>`TOA`: Pass the client IP via TOA (available only when `Proto=TCP`).</li>
<li>`PPV1`: Pass the client IP via Proxy Protocol V1 (available only when `Proto=TCP`).</li>
<li>`PPV2`: Pass the client IP via Proxy Protocol V2.</li>
<li>`OFF`: Not pass the client IP.</li>If not specified, this field uses the default value OFF.
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get Whether to enable session persistence. Values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>If it is left empty, the default value `false` is used. 
     * @return SessionPersist Whether to enable session persistence. Values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>If it is left empty, the default value `false` is used.
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Whether to enable session persistence. Values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>If it is left empty, the default value `false` is used.
     * @param SessionPersist Whether to enable session persistence. Values:
<li>`true`: Enable</li>
<li>`false`: Disable</li>If it is left empty, the default value `false` is used.
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get Duration for the persistent session. The value takes effect only when `SessionPersist = true`. 
     * @return SessionPersistTime Duration for the persistent session. The value takes effect only when `SessionPersist = true`.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set Duration for the persistent session. The value takes effect only when `SessionPersist = true`.
     * @param SessionPersistTime Duration for the persistent session. The value takes effect only when `SessionPersist = true`.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get The origin port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-82</li> 
     * @return OriginPort The origin port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-82</li>
     */
    public String getOriginPort() {
        return this.OriginPort;
    }

    /**
     * Set The origin port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-82</li>
     * @param OriginPort The origin port, which can be:
<li>A single port, such as 80</li>
<li>A port range, such as 81-82</li>
     */
    public void setOriginPort(String OriginPort) {
        this.OriginPort = OriginPort;
    }

    /**
     * Get Rule tag. The original configuration will apply if it is not specified. 
     * @return RuleTag Rule tag. The original configuration will apply if it is not specified.
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set Rule tag. The original configuration will apply if it is not specified.
     * @param RuleTag Rule tag. The original configuration will apply if it is not specified.
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

