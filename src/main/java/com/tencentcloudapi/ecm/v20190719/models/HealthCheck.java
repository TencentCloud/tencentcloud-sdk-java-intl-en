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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheck extends AbstractModel {

    /**
    * Whether to enable health check. Valid values: 1: enable; 0: disable
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * Health check response timeout period in seconds. Value range: 2–60. Default value: 2. The value of this parameter should be smaller than the check interval.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * Health check interval in seconds. Value range: 5–300. Default value: 5.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Health threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found healthy three consecutive times, it will be considered normal.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * Unhealthy threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it will be considered exceptional.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnHealthyNum")
    @Expose
    private Long UnHealthyNum;

    /**
    * Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, we recommend you leave it empty.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the input format of the health check. Valid values: HEX, TEXT. If the value is `HEX`, the characters of `SendContext` and `RecvContext` can only be selected from `0123456789ABCDEF`, and the length must be an even number.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the content of the request sent by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the result returned by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * Health check protocol (a custom check parameter). Valid values: TCP, CUSTOM (applicable only to UDP listeners. If custom health check is used, this parameter will be required).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
     * Get Whether to enable health check. Valid values: 1: enable; 0: disable
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HealthSwitch Whether to enable health check. Valid values: 1: enable; 0: disable
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set Whether to enable health check. Valid values: 1: enable; 0: disable
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HealthSwitch Whether to enable health check. Valid values: 1: enable; 0: disable
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get Health check response timeout period in seconds. Value range: 2–60. Default value: 2. The value of this parameter should be smaller than the check interval.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TimeOut Health check response timeout period in seconds. Value range: 2–60. Default value: 2. The value of this parameter should be smaller than the check interval.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Health check response timeout period in seconds. Value range: 2–60. Default value: 2. The value of this parameter should be smaller than the check interval.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TimeOut Health check response timeout period in seconds. Value range: 2–60. Default value: 2. The value of this parameter should be smaller than the check interval.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get Health check interval in seconds. Value range: 5–300. Default value: 5.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IntervalTime Health check interval in seconds. Value range: 5–300. Default value: 5.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Health check interval in seconds. Value range: 5–300. Default value: 5.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IntervalTime Health check interval in seconds. Value range: 5–300. Default value: 5.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Health threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found healthy three consecutive times, it will be considered normal.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HealthNum Health threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found healthy three consecutive times, it will be considered normal.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set Health threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found healthy three consecutive times, it will be considered normal.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HealthNum Health threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found healthy three consecutive times, it will be considered normal.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get Unhealthy threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it will be considered exceptional.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UnHealthyNum Unhealthy threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it will be considered exceptional.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnHealthyNum() {
        return this.UnHealthyNum;
    }

    /**
     * Set Unhealthy threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it will be considered exceptional.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UnHealthyNum Unhealthy threshold. Value range: 2–10. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it will be considered exceptional.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUnHealthyNum(Long UnHealthyNum) {
        this.UnHealthyNum = UnHealthyNum;
    }

    /**
     * Get Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, we recommend you leave it empty.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CheckPort Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, we recommend you leave it empty.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, we recommend you leave it empty.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CheckPort Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, we recommend you leave it empty.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the input format of the health check. Valid values: HEX, TEXT. If the value is `HEX`, the characters of `SendContext` and `RecvContext` can only be selected from `0123456789ABCDEF`, and the length must be an even number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContextType Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the input format of the health check. Valid values: HEX, TEXT. If the value is `HEX`, the characters of `SendContext` and `RecvContext` can only be selected from `0123456789ABCDEF`, and the length must be an even number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the input format of the health check. Valid values: HEX, TEXT. If the value is `HEX`, the characters of `SendContext` and `RecvContext` can only be selected from `0123456789ABCDEF`, and the length must be an even number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContextType Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the input format of the health check. Valid values: HEX, TEXT. If the value is `HEX`, the characters of `SendContext` and `RecvContext` can only be selected from `0123456789ABCDEF`, and the length must be an even number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the content of the request sent by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SendContext Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the content of the request sent by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the content of the request sent by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SendContext Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the content of the request sent by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the result returned by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RecvContext Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the result returned by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the result returned by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RecvContext Health check protocol (a custom check parameter), which is required if the value of `CheckType` is `CUSTOM`. This parameter represents the result returned by the health check. It can contain up to 500 visible ASCII characters.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get Health check protocol (a custom check parameter). Valid values: TCP, CUSTOM (applicable only to UDP listeners. If custom health check is used, this parameter will be required).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CheckType Health check protocol (a custom check parameter). Valid values: TCP, CUSTOM (applicable only to UDP listeners. If custom health check is used, this parameter will be required).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Health check protocol (a custom check parameter). Valid values: TCP, CUSTOM (applicable only to UDP listeners. If custom health check is used, this parameter will be required).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CheckType Health check protocol (a custom check parameter). Valid values: TCP, CUSTOM (applicable only to UDP listeners. If custom health check is used, this parameter will be required).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
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
        if (source.UnHealthyNum != null) {
            this.UnHealthyNum = new Long(source.UnHealthyNum);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnHealthyNum", this.UnHealthyNum);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);

    }
}

