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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationProxyRuleRequest extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Proxy ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Protocol. Valid values: `TCP` and `UDP`.
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Port. Valid values:
`80`: Port 80
`81-90`: Port range 81-90
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * Origin server type. Valid values:
`custom`: Specified origins
`origins`: An origin group
`load_balancing`: A load balancer
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server information.
When `OriginType=custom`, this field value indicates multiple origin servers in either of the following formats:
IP:Port
Domain name: Port
When `OriginType=origins`, it indicates the origin group ID.
 
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA.
`PPV1`: Pass the client IP via Proxy Protocol V1.
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * Specifies whether to enable session persistence
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Proxy ID 
     * @return ProxyId Proxy ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Proxy ID
     * @param ProxyId Proxy ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Protocol. Valid values: `TCP` and `UDP`. 
     * @return Proto Protocol. Valid values: `TCP` and `UDP`.
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Protocol. Valid values: `TCP` and `UDP`.
     * @param Proto Protocol. Valid values: `TCP` and `UDP`.
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Port. Valid values:
`80`: Port 80
`81-90`: Port range 81-90 
     * @return Port Port. Valid values:
`80`: Port 80
`81-90`: Port range 81-90
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set Port. Valid values:
`80`: Port 80
`81-90`: Port range 81-90
     * @param Port Port. Valid values:
`80`: Port 80
`81-90`: Port range 81-90
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get Origin server type. Valid values:
`custom`: Specified origins
`origins`: An origin group
`load_balancing`: A load balancer 
     * @return OriginType Origin server type. Valid values:
`custom`: Specified origins
`origins`: An origin group
`load_balancing`: A load balancer
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
`custom`: Specified origins
`origins`: An origin group
`load_balancing`: A load balancer
     * @param OriginType Origin server type. Valid values:
`custom`: Specified origins
`origins`: An origin group
`load_balancing`: A load balancer
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server information.
When `OriginType=custom`, this field value indicates multiple origin servers in either of the following formats:
IP:Port
Domain name: Port
When `OriginType=origins`, it indicates the origin group ID.
  
     * @return OriginValue Origin server information.
When `OriginType=custom`, this field value indicates multiple origin servers in either of the following formats:
IP:Port
Domain name: Port
When `OriginType=origins`, it indicates the origin group ID.
 
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Origin server information.
When `OriginType=custom`, this field value indicates multiple origin servers in either of the following formats:
IP:Port
Domain name: Port
When `OriginType=origins`, it indicates the origin group ID.
 
     * @param OriginValue Origin server information.
When `OriginType=custom`, this field value indicates multiple origin servers in either of the following formats:
IP:Port
Domain name: Port
When `OriginType=origins`, it indicates the origin group ID.
 
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA.
`PPV1`: Pass the client IP via Proxy Protocol V1.
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP. 
     * @return ForwardClientIp Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA.
`PPV1`: Pass the client IP via Proxy Protocol V1.
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA.
`PPV1`: Pass the client IP via Proxy Protocol V1.
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
     * @param ForwardClientIp Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA.
`PPV1`: Pass the client IP via Proxy Protocol V1.
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2.
`OFF`: Do not pass the client IP.
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get Specifies whether to enable session persistence 
     * @return SessionPersist Specifies whether to enable session persistence
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set Specifies whether to enable session persistence
     * @param SessionPersist Specifies whether to enable session persistence
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
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
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);

    }
}

