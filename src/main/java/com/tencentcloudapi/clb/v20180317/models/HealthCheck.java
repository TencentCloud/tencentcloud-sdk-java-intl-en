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
    * Health check response timeout period in seconds (applicable only to layer-4 listeners). Value range: 2-60. Default value: 2. This parameter should be less than the check interval.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * Health check probing interval period. It defaults to `5`. For IPv4 CLB instances, the range is 2-300. For IPv6 CLB instances, the range is 5-300. Unit: second
Note: For some IPv4 CLB instances created long ago, the range is 5-300.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Health threshold. Default value: 3, indicating that if a forward is found healthy three consecutive times, it is considered to be normal. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * Unhealthy threshold. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
    * Health check status code (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: 1-31. Default value: 31.
`1`: Returns code 1xx for healthy status. `2`: Returns code 2xx for healthy status. `4`: Returns code 3xx for healthy status. `8`: Returns code 4xx for healthy status. `16`: Returns code 5xx for healthy status. If you want multiple return codes to represent healthy, sum up the corresponding values. 
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * Health check path (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * Health check domain name. It's applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners. It's required for HTTP health check of TCP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: HEAD, GET. Default value: HEAD.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the input format of the health check. Value range: HEX, TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * Health check protocol. Values: `TCP`, `HTTP`, `HTTPS`, `GRPC`, `PING`, and `CUSTOM`. UDP listeners support `PING`/`CUSTOM`. TCP listener support `TCP`/`HTTP`/`CUSTOM`. TCP_SSL and QUIC listeners support `TCP`/`HTTP`. HTTP rules support `HTTP`/`GRPC. HTTPS rules support `HTTP`/`HTTPS`/`GRPC`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * HTTP version. HTTP version of the backend service. Values: `HTTP/1.0`, HTTP/1.1`. It is only applicable to TCP listeners, and is required when `CheckType`=`HTTP`. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * Specifies the type of health check source IP. `0` (default): CLB VIP. `1`: 100.64 IP range.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceIpType")
    @Expose
    private Long SourceIpType;

    /**
    * GRPC health check status code, which is only applicable to rules with GRPC as the backend forwarding protocol. It can be a single number (such as `20`), multiple numbers (such as `20,25`) or a range (such as `0-99`). The default value is `12`.
Note: This field may return `null`, indicating that no valid values can be obtained.
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
     * Get Health check response timeout period in seconds (applicable only to layer-4 listeners). Value range: 2-60. Default value: 2. This parameter should be less than the check interval.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeOut Health check response timeout period in seconds (applicable only to layer-4 listeners). Value range: 2-60. Default value: 2. This parameter should be less than the check interval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Health check response timeout period in seconds (applicable only to layer-4 listeners). Value range: 2-60. Default value: 2. This parameter should be less than the check interval.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeOut Health check response timeout period in seconds (applicable only to layer-4 listeners). Value range: 2-60. Default value: 2. This parameter should be less than the check interval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get Health check probing interval period. It defaults to `5`. For IPv4 CLB instances, the range is 2-300. For IPv6 CLB instances, the range is 5-300. Unit: second
Note: For some IPv4 CLB instances created long ago, the range is 5-300.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntervalTime Health check probing interval period. It defaults to `5`. For IPv4 CLB instances, the range is 2-300. For IPv6 CLB instances, the range is 5-300. Unit: second
Note: For some IPv4 CLB instances created long ago, the range is 5-300.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Health check probing interval period. It defaults to `5`. For IPv4 CLB instances, the range is 2-300. For IPv6 CLB instances, the range is 5-300. Unit: second
Note: For some IPv4 CLB instances created long ago, the range is 5-300.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntervalTime Health check probing interval period. It defaults to `5`. For IPv4 CLB instances, the range is 2-300. For IPv6 CLB instances, the range is 5-300. Unit: second
Note: For some IPv4 CLB instances created long ago, the range is 5-300.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Health threshold. Default value: 3, indicating that if a forward is found healthy three consecutive times, it is considered to be normal. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthNum Health threshold. Default value: 3, indicating that if a forward is found healthy three consecutive times, it is considered to be normal. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set Health threshold. Default value: 3, indicating that if a forward is found healthy three consecutive times, it is considered to be normal. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthNum Health threshold. Default value: 3, indicating that if a forward is found healthy three consecutive times, it is considered to be normal. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get Unhealthy threshold. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnHealthNum Unhealthy threshold. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set Unhealthy threshold. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnHealthNum Unhealthy threshold. Default value: 3, indicating that if a forward is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnHealthNum(Long UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    /**
     * Get Health check status code (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: 1-31. Default value: 31.
`1`: Returns code 1xx for healthy status. `2`: Returns code 2xx for healthy status. `4`: Returns code 3xx for healthy status. `8`: Returns code 4xx for healthy status. `16`: Returns code 5xx for healthy status. If you want multiple return codes to represent healthy, sum up the corresponding values. 
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return HttpCode Health check status code (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: 1-31. Default value: 31.
`1`: Returns code 1xx for healthy status. `2`: Returns code 2xx for healthy status. `4`: Returns code 3xx for healthy status. `8`: Returns code 4xx for healthy status. `16`: Returns code 5xx for healthy status. If you want multiple return codes to represent healthy, sum up the corresponding values. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set Health check status code (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: 1-31. Default value: 31.
`1`: Returns code 1xx for healthy status. `2`: Returns code 2xx for healthy status. `4`: Returns code 3xx for healthy status. `8`: Returns code 4xx for healthy status. `16`: Returns code 5xx for healthy status. If you want multiple return codes to represent healthy, sum up the corresponding values. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param HttpCode Health check status code (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: 1-31. Default value: 31.
`1`: Returns code 1xx for healthy status. `2`: Returns code 2xx for healthy status. `4`: Returns code 3xx for healthy status. `8`: Returns code 4xx for healthy status. `16`: Returns code 5xx for healthy status. If you want multiple return codes to represent healthy, sum up the corresponding values. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get Health check path (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckPath Health check path (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set Health check path (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckPath Health check path (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get Health check domain name. It's applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners. It's required for HTTP health check of TCP listeners.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckDomain Health check domain name. It's applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners. It's required for HTTP health check of TCP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set Health check domain name. It's applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners. It's required for HTTP health check of TCP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckDomain Health check domain name. It's applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners. It's required for HTTP health check of TCP listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: HEAD, GET. Default value: HEAD.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckMethod Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: HEAD, GET. Default value: HEAD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * Set Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: HEAD, GET. Default value: HEAD.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckMethod Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Value range: HEAD, GET. Default value: HEAD.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * Get Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckPort Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckPort Health check port (a custom check parameter), which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the input format of the health check. Value range: HEX, TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContextType Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the input format of the health check. Value range: HEX, TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the input format of the health check. Value range: HEX, TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContextType Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the input format of the health check. Value range: HEX, TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SendContext Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SendContext Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecvContext Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecvContext Health check protocol (a custom check parameter), which is required if the value of CheckType is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get Health check protocol. Values: `TCP`, `HTTP`, `HTTPS`, `GRPC`, `PING`, and `CUSTOM`. UDP listeners support `PING`/`CUSTOM`. TCP listener support `TCP`/`HTTP`/`CUSTOM`. TCP_SSL and QUIC listeners support `TCP`/`HTTP`. HTTP rules support `HTTP`/`GRPC. HTTPS rules support `HTTP`/`HTTPS`/`GRPC`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckType Health check protocol. Values: `TCP`, `HTTP`, `HTTPS`, `GRPC`, `PING`, and `CUSTOM`. UDP listeners support `PING`/`CUSTOM`. TCP listener support `TCP`/`HTTP`/`CUSTOM`. TCP_SSL and QUIC listeners support `TCP`/`HTTP`. HTTP rules support `HTTP`/`GRPC. HTTPS rules support `HTTP`/`HTTPS`/`GRPC`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Health check protocol. Values: `TCP`, `HTTP`, `HTTPS`, `GRPC`, `PING`, and `CUSTOM`. UDP listeners support `PING`/`CUSTOM`. TCP listener support `TCP`/`HTTP`/`CUSTOM`. TCP_SSL and QUIC listeners support `TCP`/`HTTP`. HTTP rules support `HTTP`/`GRPC. HTTPS rules support `HTTP`/`HTTPS`/`GRPC`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckType Health check protocol. Values: `TCP`, `HTTP`, `HTTPS`, `GRPC`, `PING`, and `CUSTOM`. UDP listeners support `PING`/`CUSTOM`. TCP listener support `TCP`/`HTTP`/`CUSTOM`. TCP_SSL and QUIC listeners support `TCP`/`HTTP`. HTTP rules support `HTTP`/`GRPC. HTTPS rules support `HTTP`/`HTTPS`/`GRPC`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get HTTP version. HTTP version of the backend service. Values: `HTTP/1.0`, HTTP/1.1`. It is only applicable to TCP listeners, and is required when `CheckType`=`HTTP`. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpVersion HTTP version. HTTP version of the backend service. Values: `HTTP/1.0`, HTTP/1.1`. It is only applicable to TCP listeners, and is required when `CheckType`=`HTTP`. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set HTTP version. HTTP version of the backend service. Values: `HTTP/1.0`, HTTP/1.1`. It is only applicable to TCP listeners, and is required when `CheckType`=`HTTP`. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpVersion HTTP version. HTTP version of the backend service. Values: `HTTP/1.0`, HTTP/1.1`. It is only applicable to TCP listeners, and is required when `CheckType`=`HTTP`. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get Specifies the type of health check source IP. `0` (default): CLB VIP. `1`: 100.64 IP range.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceIpType Specifies the type of health check source IP. `0` (default): CLB VIP. `1`: 100.64 IP range.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSourceIpType() {
        return this.SourceIpType;
    }

    /**
     * Set Specifies the type of health check source IP. `0` (default): CLB VIP. `1`: 100.64 IP range.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceIpType Specifies the type of health check source IP. `0` (default): CLB VIP. `1`: 100.64 IP range.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceIpType(Long SourceIpType) {
        this.SourceIpType = SourceIpType;
    }

    /**
     * Get GRPC health check status code, which is only applicable to rules with GRPC as the backend forwarding protocol. It can be a single number (such as `20`), multiple numbers (such as `20,25`) or a range (such as `0-99`). The default value is `12`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtendedCode GRPC health check status code, which is only applicable to rules with GRPC as the backend forwarding protocol. It can be a single number (such as `20`), multiple numbers (such as `20,25`) or a range (such as `0-99`). The default value is `12`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getExtendedCode() {
        return this.ExtendedCode;
    }

    /**
     * Set GRPC health check status code, which is only applicable to rules with GRPC as the backend forwarding protocol. It can be a single number (such as `20`), multiple numbers (such as `20,25`) or a range (such as `0-99`). The default value is `12`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExtendedCode GRPC health check status code, which is only applicable to rules with GRPC as the backend forwarding protocol. It can be a single number (such as `20`), multiple numbers (such as `20,25`) or a range (such as `0-99`). The default value is `12`.
Note: This field may return `null`, indicating that no valid values can be obtained.
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

