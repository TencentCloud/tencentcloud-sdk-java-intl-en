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

public class HealthCheck extends AbstractModel {

    /**
    * Whether to enable health check. 1: enable; 0: disable.
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceIpType")
    @Expose
    private Long SourceIpType;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtendedCode")
    @Expose
    private String ExtendedCode;

    /**
     * Get Whether to enable health check. 1: enable; 0: disable. 
     * @return HealthSwitch Whether to enable health check. 1: enable; 0: disable.
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set Whether to enable health check. 1: enable; 0: disable.
     * @param HealthSwitch Whether to enable health check. 1: enable; 0: disable.
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeOut Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeOut Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntervalTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntervalTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthNum Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthNum Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnHealthNum Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnHealthNum Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnHealthNum(Long UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCode Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCode Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckPath Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckPath Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckDomain Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckDomain Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckMethod Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckMethod Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckPort Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckPort Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContextType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContextType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SendContext Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param SendContext Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecvContext Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecvContext Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpVersion Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpVersion Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceIpType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSourceIpType() {
        return this.SourceIpType;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceIpType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceIpType(Long SourceIpType) {
        this.SourceIpType = SourceIpType;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtendedCode Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtendedCode() {
        return this.ExtendedCode;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtendedCode Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtendedCode(String ExtendedCode) {
        this.ExtendedCode = ExtendedCode;
    }

    public HealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheck(HealthCheck source) {
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
        if (source.UnHealthNum != null) {
            this.UnHealthNum = new Long(source.UnHealthNum);
        }
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.HttpCheckPath != null) {
            this.HttpCheckPath = new String(source.HttpCheckPath);
        }
        if (source.HttpCheckDomain != null) {
            this.HttpCheckDomain = new String(source.HttpCheckDomain);
        }
        if (source.HttpCheckMethod != null) {
            this.HttpCheckMethod = new String(source.HttpCheckMethod);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new Long(source.CheckPort);
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
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
        if (source.SourceIpType != null) {
            this.SourceIpType = new Long(source.SourceIpType);
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
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnHealthNum", this.UnHealthNum);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckMethod", this.HttpCheckMethod);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);
        this.setParamSimple(map, prefix + "SourceIpType", this.SourceIpType);
        this.setParamSimple(map, prefix + "ExtendedCode", this.ExtendedCode);

    }
}

