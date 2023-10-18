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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProxyRule extends AbstractModel {

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
`origins`: Origin group
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server information:
When `OriginType=custom`, it indicates one or more origin servers. Example:
OriginValue=["8.8.8.8:80","9.9.9.9:80"]
OriginValue=["test.com:80"]

When `OriginType=origins`, it indicates an origin group ID. Example:
OriginValue=["origin-xxx"]
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * Rule ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA
`PPV1`: Pass the client IP via Proxy Protocol V1
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2
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
`origins`: Origin group 
     * @return OriginType Origin server type. Valid values:
`custom`: Specified origins
`origins`: Origin group
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
`custom`: Specified origins
`origins`: Origin group
     * @param OriginType Origin server type. Valid values:
`custom`: Specified origins
`origins`: Origin group
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server information:
When `OriginType=custom`, it indicates one or more origin servers. Example:
OriginValue=["8.8.8.8:80","9.9.9.9:80"]
OriginValue=["test.com:80"]

When `OriginType=origins`, it indicates an origin group ID. Example:
OriginValue=["origin-xxx"] 
     * @return OriginValue Origin server information:
When `OriginType=custom`, it indicates one or more origin servers. Example:
OriginValue=["8.8.8.8:80","9.9.9.9:80"]
OriginValue=["test.com:80"]

When `OriginType=origins`, it indicates an origin group ID. Example:
OriginValue=["origin-xxx"]
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set Origin server information:
When `OriginType=custom`, it indicates one or more origin servers. Example:
OriginValue=["8.8.8.8:80","9.9.9.9:80"]
OriginValue=["test.com:80"]

When `OriginType=origins`, it indicates an origin group ID. Example:
OriginValue=["origin-xxx"]
     * @param OriginValue Origin server information:
When `OriginType=custom`, it indicates one or more origin servers. Example:
OriginValue=["8.8.8.8:80","9.9.9.9:80"]
OriginValue=["test.com:80"]

When `OriginType=origins`, it indicates an origin group ID. Example:
OriginValue=["origin-xxx"]
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get Rule ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleId Rule ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleId Rule ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed 
     * @return Status Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
     * @param Status Status:
`online`: Enable
`offline`: Disable
`progress`: Deploying
`stopping`: Disabling
`fail`: Deployment/Disabling failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA
`PPV1`: Pass the client IP via Proxy Protocol V1
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP. 
     * @return ForwardClientIp Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA
`PPV1`: Pass the client IP via Proxy Protocol V1
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA
`PPV1`: Pass the client IP via Proxy Protocol V1
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
     * @param ForwardClientIp Passes the client IP. When `Proto=TCP`, valid values:
`TOA`: Pass the client IP via TOA
`PPV1`: Pass the client IP via Proxy Protocol V1
`PPV2`: Pass the client IP via Proxy Protocol V2
`OFF`: Do not pass the client IP.
When `Proto=UDP`, valid values:
`PPV2`: Pass the client IP via Proxy Protocol V2
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

    }
}

