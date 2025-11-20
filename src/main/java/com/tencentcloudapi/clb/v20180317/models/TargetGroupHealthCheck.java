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

public class TargetGroupHealthCheck extends AbstractModel {

    /**
    * 
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Boolean HealthSwitch;

    /**
    * 
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 
    */
    @SerializedName("GapTime")
    @Expose
    private Long GapTime;

    /**
    * 
    */
    @SerializedName("GoodLimit")
    @Expose
    private Long GoodLimit;

    /**
    * 
    */
    @SerializedName("BadLimit")
    @Expose
    private Long BadLimit;

    /**
    * 
    */
    @SerializedName("JumboFrame")
    @Expose
    private Boolean JumboFrame;

    /**
    * 
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * 
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * 
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * 
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * 
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * 
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * 
    */
    @SerializedName("ExtendedCode")
    @Expose
    private String ExtendedCode;

    /**
     * Get  
     * @return HealthSwitch 
     */
    public Boolean getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 
     * @param HealthSwitch 
     */
    public void setHealthSwitch(Boolean HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get  
     * @return Protocol 
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 
     * @param Protocol 
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get  
     * @return Port 
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 
     * @param Port 
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get  
     * @return Timeout 
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 
     * @param Timeout 
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get  
     * @return GapTime 
     */
    public Long getGapTime() {
        return this.GapTime;
    }

    /**
     * Set 
     * @param GapTime 
     */
    public void setGapTime(Long GapTime) {
        this.GapTime = GapTime;
    }

    /**
     * Get  
     * @return GoodLimit 
     */
    public Long getGoodLimit() {
        return this.GoodLimit;
    }

    /**
     * Set 
     * @param GoodLimit 
     */
    public void setGoodLimit(Long GoodLimit) {
        this.GoodLimit = GoodLimit;
    }

    /**
     * Get  
     * @return BadLimit 
     */
    public Long getBadLimit() {
        return this.BadLimit;
    }

    /**
     * Set 
     * @param BadLimit 
     */
    public void setBadLimit(Long BadLimit) {
        this.BadLimit = BadLimit;
    }

    /**
     * Get  
     * @return JumboFrame 
     */
    public Boolean getJumboFrame() {
        return this.JumboFrame;
    }

    /**
     * Set 
     * @param JumboFrame 
     */
    public void setJumboFrame(Boolean JumboFrame) {
        this.JumboFrame = JumboFrame;
    }

    /**
     * Get  
     * @return HttpCode 
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set 
     * @param HttpCode 
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get  
     * @return HttpCheckDomain 
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set 
     * @param HttpCheckDomain 
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get  
     * @return HttpCheckPath 
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set 
     * @param HttpCheckPath 
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get  
     * @return HttpCheckMethod 
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * Set 
     * @param HttpCheckMethod 
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * Get  
     * @return ContextType 
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set 
     * @param ContextType 
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get  
     * @return SendContext 
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set 
     * @param SendContext 
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get  
     * @return RecvContext 
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set 
     * @param RecvContext 
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get  
     * @return HttpVersion 
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set 
     * @param HttpVersion 
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get  
     * @return ExtendedCode 
     */
    public String getExtendedCode() {
        return this.ExtendedCode;
    }

    /**
     * Set 
     * @param ExtendedCode 
     */
    public void setExtendedCode(String ExtendedCode) {
        this.ExtendedCode = ExtendedCode;
    }

    public TargetGroupHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupHealthCheck(TargetGroupHealthCheck source) {
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Boolean(source.HealthSwitch);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.GapTime != null) {
            this.GapTime = new Long(source.GapTime);
        }
        if (source.GoodLimit != null) {
            this.GoodLimit = new Long(source.GoodLimit);
        }
        if (source.BadLimit != null) {
            this.BadLimit = new Long(source.BadLimit);
        }
        if (source.JumboFrame != null) {
            this.JumboFrame = new Boolean(source.JumboFrame);
        }
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.HttpCheckDomain != null) {
            this.HttpCheckDomain = new String(source.HttpCheckDomain);
        }
        if (source.HttpCheckPath != null) {
            this.HttpCheckPath = new String(source.HttpCheckPath);
        }
        if (source.HttpCheckMethod != null) {
            this.HttpCheckMethod = new String(source.HttpCheckMethod);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.SendContext != null) {
            this.SendContext = new String(source.SendContext);
        }
        if (source.RecvContext != null) {
            this.RecvContext = new String(source.RecvContext);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
        if (source.ExtendedCode != null) {
            this.ExtendedCode = new String(source.ExtendedCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "GapTime", this.GapTime);
        this.setParamSimple(map, prefix + "GoodLimit", this.GoodLimit);
        this.setParamSimple(map, prefix + "BadLimit", this.BadLimit);
        this.setParamSimple(map, prefix + "JumboFrame", this.JumboFrame);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckMethod", this.HttpCheckMethod);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);
        this.setParamSimple(map, prefix + "ExtendedCode", this.ExtendedCode);

    }
}

