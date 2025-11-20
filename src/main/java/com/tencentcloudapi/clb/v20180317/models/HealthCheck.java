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
    * Whether to enable health check. 1: Enable; 0: Disable.

It is enabled by default.
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * Health check response timeout, in seconds. Value range: 2–60. Default value: 2. The response timeout should be less than the check interval.
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * Health check interval, in seconds. Default value: 5. Value range: 2–300 for IPv4 CLB instances and 5–300 for IPv6 CLB instances.
Note: The value range is 5–300 for some IPv4 CLB instances of early versions.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Healthy threshold. Default: 3, indicating that if a forwarding is found healthy three consecutive times, it is considered to be normal. Value range: 2-10. Unit: times.
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * Unhealthy threshold. Default: 3, indicating that if a forwarding is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10. Unit: times.
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
    * Health check status code. (This parameter applies only to HTTP/HTTPS forwarding rules and the HTTP health check method of TCP listeners.) Value range: 1–31. Default value: 31.
1: return 1xx after the check (healthy); 2: return 2xx after the check (healthy); 4: return 3xx after the check (healthy); 8: return 4xx after the check (healthy); 16: return 5xx after the check (healthy). If you expect that multiple codes represent a healthy real server, set the value to the sum of the corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Health check domain name, which will be contained in a Host header field of the HTTP protocol. (This parameter applies only to HTTP/HTTPS listeners and the HTTP health check method of TCP listeners. For TCP listeners, this parameter is required if the HTTP health check method is used.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Default: HEAD. Valid values: HEAD and GET.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * A custom check parameter, representing the health check port, which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the input format of the health check. Valid values: HEX and TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * Protocol used for health checks. Valid values: TCP (for TCP listeners, TCP_SSL listeners, and QUIC listeners), HTTP (for TCP listeners, TCP_SSL listeners, QUIC listeners, HTTP rules, and HTTPS rules), HTTPS (for HTTPS rules), GRPC (for HTTP rules and HTTPS rules), PING (for UDP listeners), and CUSTOM (for UDP listeners and TCP listeners). The default value is HTTP for HTTP listeners, TCP for TCP, TCP_SSL, and QUIC listeners, and PING for UDP listeners. For HTTPS listeners, the protocol is the same as the backend forwarding protocol.
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * HTTP version. This field indicates the HTTP version of real servers and is required if the value of CheckType is HTTP. Valid values: HTTP/1.0 and HTTP/1.1. (This field applies only to TCP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * Source IP address type for health checks. 0: use the LB VIP as the source IP address; 1: use an IP address in the 100.64 range as the source IP address.
    */
    @SerializedName("SourceIpType")
    @Expose
    private Long SourceIpType;

    /**
    * Health check status code when the protocol is GRPC. (This parameter applies only to rules with the backend forwarding protocol of GRPC.) Default value: 12. You can enter a single numerical value, multiple numerical values, or a range. For example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtendedCode")
    @Expose
    private String ExtendedCode;

    /**
     * Get Whether to enable health check. 1: Enable; 0: Disable.

It is enabled by default. 
     * @return HealthSwitch Whether to enable health check. 1: Enable; 0: Disable.

It is enabled by default.
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set Whether to enable health check. 1: Enable; 0: Disable.

It is enabled by default.
     * @param HealthSwitch Whether to enable health check. 1: Enable; 0: Disable.

It is enabled by default.
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get Health check response timeout, in seconds. Value range: 2–60. Default value: 2. The response timeout should be less than the check interval. 
     * @return TimeOut Health check response timeout, in seconds. Value range: 2–60. Default value: 2. The response timeout should be less than the check interval.
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set Health check response timeout, in seconds. Value range: 2–60. Default value: 2. The response timeout should be less than the check interval.
     * @param TimeOut Health check response timeout, in seconds. Value range: 2–60. Default value: 2. The response timeout should be less than the check interval.
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get Health check interval, in seconds. Default value: 5. Value range: 2–300 for IPv4 CLB instances and 5–300 for IPv6 CLB instances.
Note: The value range is 5–300 for some IPv4 CLB instances of early versions. 
     * @return IntervalTime Health check interval, in seconds. Default value: 5. Value range: 2–300 for IPv4 CLB instances and 5–300 for IPv6 CLB instances.
Note: The value range is 5–300 for some IPv4 CLB instances of early versions.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Health check interval, in seconds. Default value: 5. Value range: 2–300 for IPv4 CLB instances and 5–300 for IPv6 CLB instances.
Note: The value range is 5–300 for some IPv4 CLB instances of early versions.
     * @param IntervalTime Health check interval, in seconds. Default value: 5. Value range: 2–300 for IPv4 CLB instances and 5–300 for IPv6 CLB instances.
Note: The value range is 5–300 for some IPv4 CLB instances of early versions.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Healthy threshold. Default: 3, indicating that if a forwarding is found healthy three consecutive times, it is considered to be normal. Value range: 2-10. Unit: times. 
     * @return HealthNum Healthy threshold. Default: 3, indicating that if a forwarding is found healthy three consecutive times, it is considered to be normal. Value range: 2-10. Unit: times.
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set Healthy threshold. Default: 3, indicating that if a forwarding is found healthy three consecutive times, it is considered to be normal. Value range: 2-10. Unit: times.
     * @param HealthNum Healthy threshold. Default: 3, indicating that if a forwarding is found healthy three consecutive times, it is considered to be normal. Value range: 2-10. Unit: times.
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get Unhealthy threshold. Default: 3, indicating that if a forwarding is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10. Unit: times. 
     * @return UnHealthNum Unhealthy threshold. Default: 3, indicating that if a forwarding is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10. Unit: times.
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set Unhealthy threshold. Default: 3, indicating that if a forwarding is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10. Unit: times.
     * @param UnHealthNum Unhealthy threshold. Default: 3, indicating that if a forwarding is found unhealthy three consecutive times, it is considered to be exceptional. Value range: 2-10. Unit: times.
     */
    public void setUnHealthNum(Long UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    /**
     * Get Health check status code. (This parameter applies only to HTTP/HTTPS forwarding rules and the HTTP health check method of TCP listeners.) Value range: 1–31. Default value: 31.
1: return 1xx after the check (healthy); 2: return 2xx after the check (healthy); 4: return 3xx after the check (healthy); 8: return 4xx after the check (healthy); 16: return 5xx after the check (healthy). If you expect that multiple codes represent a healthy real server, set the value to the sum of the corresponding values.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCode Health check status code. (This parameter applies only to HTTP/HTTPS forwarding rules and the HTTP health check method of TCP listeners.) Value range: 1–31. Default value: 31.
1: return 1xx after the check (healthy); 2: return 2xx after the check (healthy); 4: return 3xx after the check (healthy); 8: return 4xx after the check (healthy); 16: return 5xx after the check (healthy). If you expect that multiple codes represent a healthy real server, set the value to the sum of the corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set Health check status code. (This parameter applies only to HTTP/HTTPS forwarding rules and the HTTP health check method of TCP listeners.) Value range: 1–31. Default value: 31.
1: return 1xx after the check (healthy); 2: return 2xx after the check (healthy); 4: return 3xx after the check (healthy); 8: return 4xx after the check (healthy); 16: return 5xx after the check (healthy). If you expect that multiple codes represent a healthy real server, set the value to the sum of the corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCode Health check status code. (This parameter applies only to HTTP/HTTPS forwarding rules and the HTTP health check method of TCP listeners.) Value range: 1–31. Default value: 31.
1: return 1xx after the check (healthy); 2: return 2xx after the check (healthy); 4: return 3xx after the check (healthy); 8: return 4xx after the check (healthy); 16: return 5xx after the check (healthy). If you expect that multiple codes represent a healthy real server, set the value to the sum of the corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Health check domain name, which will be contained in a Host header field of the HTTP protocol. (This parameter applies only to HTTP/HTTPS listeners and the HTTP health check method of TCP listeners. For TCP listeners, this parameter is required if the HTTP health check method is used.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckDomain Health check domain name, which will be contained in a Host header field of the HTTP protocol. (This parameter applies only to HTTP/HTTPS listeners and the HTTP health check method of TCP listeners. For TCP listeners, this parameter is required if the HTTP health check method is used.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set Health check domain name, which will be contained in a Host header field of the HTTP protocol. (This parameter applies only to HTTP/HTTPS listeners and the HTTP health check method of TCP listeners. For TCP listeners, this parameter is required if the HTTP health check method is used.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckDomain Health check domain name, which will be contained in a Host header field of the HTTP protocol. (This parameter applies only to HTTP/HTTPS listeners and the HTTP health check method of TCP listeners. For TCP listeners, this parameter is required if the HTTP health check method is used.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Default: HEAD. Valid values: HEAD and GET.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckMethod Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Default: HEAD. Valid values: HEAD and GET.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * Set Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Default: HEAD. Valid values: HEAD and GET.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckMethod Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Default: HEAD. Valid values: HEAD and GET.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * Get A custom check parameter, representing the health check port, which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckPort A custom check parameter, representing the health check port, which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set A custom check parameter, representing the health check port, which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckPort A custom check parameter, representing the health check port, which is the port of the real server by default. Unless you want to specify a port, it is recommended to leave it empty. (Applicable only to TCP/UDP listeners)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the input format of the health check. Valid values: HEX and TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContextType A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the input format of the health check. Valid values: HEX and TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the input format of the health check. Valid values: HEX and TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContextType A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the input format of the health check. Valid values: HEX and TEXT. If the value is HEX, the characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SendContext A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SendContext A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the content of the request sent by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecvContext A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecvContext A custom check parameter, which is required if the value of CheckType (health check protocol) is CUSTOM. This parameter represents the result returned by the health check. Only ASCII visible characters are allowed, and the maximum length is 500. (Applicable only to TCP/UDP listeners.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get Protocol used for health checks. Valid values: TCP (for TCP listeners, TCP_SSL listeners, and QUIC listeners), HTTP (for TCP listeners, TCP_SSL listeners, QUIC listeners, HTTP rules, and HTTPS rules), HTTPS (for HTTPS rules), GRPC (for HTTP rules and HTTPS rules), PING (for UDP listeners), and CUSTOM (for UDP listeners and TCP listeners). The default value is HTTP for HTTP listeners, TCP for TCP, TCP_SSL, and QUIC listeners, and PING for UDP listeners. For HTTPS listeners, the protocol is the same as the backend forwarding protocol. 
     * @return CheckType Protocol used for health checks. Valid values: TCP (for TCP listeners, TCP_SSL listeners, and QUIC listeners), HTTP (for TCP listeners, TCP_SSL listeners, QUIC listeners, HTTP rules, and HTTPS rules), HTTPS (for HTTPS rules), GRPC (for HTTP rules and HTTPS rules), PING (for UDP listeners), and CUSTOM (for UDP listeners and TCP listeners). The default value is HTTP for HTTP listeners, TCP for TCP, TCP_SSL, and QUIC listeners, and PING for UDP listeners. For HTTPS listeners, the protocol is the same as the backend forwarding protocol.
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Protocol used for health checks. Valid values: TCP (for TCP listeners, TCP_SSL listeners, and QUIC listeners), HTTP (for TCP listeners, TCP_SSL listeners, QUIC listeners, HTTP rules, and HTTPS rules), HTTPS (for HTTPS rules), GRPC (for HTTP rules and HTTPS rules), PING (for UDP listeners), and CUSTOM (for UDP listeners and TCP listeners). The default value is HTTP for HTTP listeners, TCP for TCP, TCP_SSL, and QUIC listeners, and PING for UDP listeners. For HTTPS listeners, the protocol is the same as the backend forwarding protocol.
     * @param CheckType Protocol used for health checks. Valid values: TCP (for TCP listeners, TCP_SSL listeners, and QUIC listeners), HTTP (for TCP listeners, TCP_SSL listeners, QUIC listeners, HTTP rules, and HTTPS rules), HTTPS (for HTTPS rules), GRPC (for HTTP rules and HTTPS rules), PING (for UDP listeners), and CUSTOM (for UDP listeners and TCP listeners). The default value is HTTP for HTTP listeners, TCP for TCP, TCP_SSL, and QUIC listeners, and PING for UDP listeners. For HTTPS listeners, the protocol is the same as the backend forwarding protocol.
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get HTTP version. This field indicates the HTTP version of real servers and is required if the value of CheckType is HTTP. Valid values: HTTP/1.0 and HTTP/1.1. (This field applies only to TCP listeners.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpVersion HTTP version. This field indicates the HTTP version of real servers and is required if the value of CheckType is HTTP. Valid values: HTTP/1.0 and HTTP/1.1. (This field applies only to TCP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set HTTP version. This field indicates the HTTP version of real servers and is required if the value of CheckType is HTTP. Valid values: HTTP/1.0 and HTTP/1.1. (This field applies only to TCP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpVersion HTTP version. This field indicates the HTTP version of real servers and is required if the value of CheckType is HTTP. Valid values: HTTP/1.0 and HTTP/1.1. (This field applies only to TCP listeners.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get Source IP address type for health checks. 0: use the LB VIP as the source IP address; 1: use an IP address in the 100.64 range as the source IP address. 
     * @return SourceIpType Source IP address type for health checks. 0: use the LB VIP as the source IP address; 1: use an IP address in the 100.64 range as the source IP address.
     */
    public Long getSourceIpType() {
        return this.SourceIpType;
    }

    /**
     * Set Source IP address type for health checks. 0: use the LB VIP as the source IP address; 1: use an IP address in the 100.64 range as the source IP address.
     * @param SourceIpType Source IP address type for health checks. 0: use the LB VIP as the source IP address; 1: use an IP address in the 100.64 range as the source IP address.
     */
    public void setSourceIpType(Long SourceIpType) {
        this.SourceIpType = SourceIpType;
    }

    /**
     * Get Health check status code when the protocol is GRPC. (This parameter applies only to rules with the backend forwarding protocol of GRPC.) Default value: 12. You can enter a single numerical value, multiple numerical values, or a range. For example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtendedCode Health check status code when the protocol is GRPC. (This parameter applies only to rules with the backend forwarding protocol of GRPC.) Default value: 12. You can enter a single numerical value, multiple numerical values, or a range. For example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtendedCode() {
        return this.ExtendedCode;
    }

    /**
     * Set Health check status code when the protocol is GRPC. (This parameter applies only to rules with the backend forwarding protocol of GRPC.) Default value: 12. You can enter a single numerical value, multiple numerical values, or a range. For example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtendedCode Health check status code when the protocol is GRPC. (This parameter applies only to rules with the backend forwarding protocol of GRPC.) Default value: 12. You can enter a single numerical value, multiple numerical values, or a range. For example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
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

