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
    * Whether to enable the health check.
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Boolean HealthSwitch;

    /**
    * Health check method. among them, only the new version V2 target group type supports this parameter. valid values: TCP | HTTP | HTTPS | PING | CUSTOM. among them:.
<ur><li>When the backend forwarding protocol of the target group is TCP, the health check method supports TCP/HTTP/CUSTOM, with a default value of TCP.</li><li>when the backend forwarding protocol of the target group is UDP, the health check method supports PING/CUSTOM, with a default value of PING.</li><li>when the backend forwarding protocol of the target group is HTTP, the health check method supports HTTP/TCP, with a default value of HTTP.</li><li>when the backend forwarding protocol of the target group is HTTPS, the health check method supports HTTPS/TCP, with a default value of HTTPS.</li><li>when the backend forwarding protocol of the target group is GRPC, the health check method supports GRPC/TCP, with a default value of GRPC.</li></ur>.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Custom check parameters. health check port, defaults to the port of the backend service unless you want to specify a specific port, otherwise leave it blank. (applicable only to TCP/UDP target group).

    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
    */
    @SerializedName("GapTime")
    @Expose
    private Long GapTime;

    /**
    * Health detection threshold. The default is 3 times. Value range: 2-10 times.
    */
    @SerializedName("GoodLimit")
    @Expose
    private Long GoodLimit;

    /**
    * Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
    */
    @SerializedName("BadLimit")
    @Expose
    private Long BadLimit;

    /**
    * Indicates whether jumbo frames are enabled for probe packets of all rss in the target group. enabled by default. this parameter is supported only for GWLB type target groups.
    */
    @SerializedName("JumboFrame")
    @Expose
    private Boolean JumboFrame;

    /**
    * Health check status code (applicable only to HTTP/HTTPS target group and HTTP health check method of TCP target group). value range: 1~31. default: 31. among them: <url> <li>1 means post-detection return value 1xx represents health.</li> <li>2 means return 2xx represents health.</li> <li>4 means return 3xx represents health.</li> <li>8 means return 4xx represents health.</li> <li>16 means return 5xx represents health.</li></url> to have multiple return codes represent health, sum up corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * Health check domain name. among them: <ur><li>applicable only to HTTP/HTTPS target groups and TCP target groups when using HTTP health check method.</li><li>targeting HTTP/HTTPS target groups, this parameter is required when using HTTP health check method.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * Health check path (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * Health check method (applicable only to HTTP/HTTPS forwarding rules and HTTP health checks of TCP listeners). Default: HEAD. Valid values: HEAD and GET.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * Input format of health check. required when health check method is CUSTOM. valid values: HEX or TEXT. among them:<ur><li>TEXT: TEXT format.</li><li>HEX: hexadecimal format. characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number.</li><li>applicable only to TCP/UDP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * CUSTOM check parameters. required when the CheckType value is CUSTOM, represents the content of the request sent by the health check, only ASCII visible characters, maximum length limit 500. applicable only to TCP/UDP target group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * CUSTOM check parameters. required when the CheckType value is CUSTOM. represents the result returned by the health check. only ASCII visible characters are allowed. maximum length limit is 500. (applicable only to TCP/UDP target group).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * HTTP version, where: <ur><li>this field is required if the value of CheckType is HTTP.</li><li>supports configuration options: HTTP/1.0, HTTP/1.1.</li><li>applicable only to TCP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * Health check status code when the protocol is GRPC. (this parameter applies only to target groups with the backend forwarding protocol of GRPC.) default value: 12. valid values: a single numerical value, multiple numerical values, or a range. for example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtendedCode")
    @Expose
    private String ExtendedCode;

    /**
     * Get Whether to enable the health check. 
     * @return HealthSwitch Whether to enable the health check.
     */
    public Boolean getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set Whether to enable the health check.
     * @param HealthSwitch Whether to enable the health check.
     */
    public void setHealthSwitch(Boolean HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get Health check method. among them, only the new version V2 target group type supports this parameter. valid values: TCP | HTTP | HTTPS | PING | CUSTOM. among them:.
<ur><li>When the backend forwarding protocol of the target group is TCP, the health check method supports TCP/HTTP/CUSTOM, with a default value of TCP.</li><li>when the backend forwarding protocol of the target group is UDP, the health check method supports PING/CUSTOM, with a default value of PING.</li><li>when the backend forwarding protocol of the target group is HTTP, the health check method supports HTTP/TCP, with a default value of HTTP.</li><li>when the backend forwarding protocol of the target group is HTTPS, the health check method supports HTTPS/TCP, with a default value of HTTPS.</li><li>when the backend forwarding protocol of the target group is GRPC, the health check method supports GRPC/TCP, with a default value of GRPC.</li></ur>. 
     * @return Protocol Health check method. among them, only the new version V2 target group type supports this parameter. valid values: TCP | HTTP | HTTPS | PING | CUSTOM. among them:.
<ur><li>When the backend forwarding protocol of the target group is TCP, the health check method supports TCP/HTTP/CUSTOM, with a default value of TCP.</li><li>when the backend forwarding protocol of the target group is UDP, the health check method supports PING/CUSTOM, with a default value of PING.</li><li>when the backend forwarding protocol of the target group is HTTP, the health check method supports HTTP/TCP, with a default value of HTTP.</li><li>when the backend forwarding protocol of the target group is HTTPS, the health check method supports HTTPS/TCP, with a default value of HTTPS.</li><li>when the backend forwarding protocol of the target group is GRPC, the health check method supports GRPC/TCP, with a default value of GRPC.</li></ur>.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Health check method. among them, only the new version V2 target group type supports this parameter. valid values: TCP | HTTP | HTTPS | PING | CUSTOM. among them:.
<ur><li>When the backend forwarding protocol of the target group is TCP, the health check method supports TCP/HTTP/CUSTOM, with a default value of TCP.</li><li>when the backend forwarding protocol of the target group is UDP, the health check method supports PING/CUSTOM, with a default value of PING.</li><li>when the backend forwarding protocol of the target group is HTTP, the health check method supports HTTP/TCP, with a default value of HTTP.</li><li>when the backend forwarding protocol of the target group is HTTPS, the health check method supports HTTPS/TCP, with a default value of HTTPS.</li><li>when the backend forwarding protocol of the target group is GRPC, the health check method supports GRPC/TCP, with a default value of GRPC.</li></ur>.
     * @param Protocol Health check method. among them, only the new version V2 target group type supports this parameter. valid values: TCP | HTTP | HTTPS | PING | CUSTOM. among them:.
<ur><li>When the backend forwarding protocol of the target group is TCP, the health check method supports TCP/HTTP/CUSTOM, with a default value of TCP.</li><li>when the backend forwarding protocol of the target group is UDP, the health check method supports PING/CUSTOM, with a default value of PING.</li><li>when the backend forwarding protocol of the target group is HTTP, the health check method supports HTTP/TCP, with a default value of HTTP.</li><li>when the backend forwarding protocol of the target group is HTTPS, the health check method supports HTTPS/TCP, with a default value of HTTPS.</li><li>when the backend forwarding protocol of the target group is GRPC, the health check method supports GRPC/TCP, with a default value of GRPC.</li></ur>.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Custom check parameters. health check port, defaults to the port of the backend service unless you want to specify a specific port, otherwise leave it blank. (applicable only to TCP/UDP target group).
 
     * @return Port Custom check parameters. health check port, defaults to the port of the backend service unless you want to specify a specific port, otherwise leave it blank. (applicable only to TCP/UDP target group).

     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Custom check parameters. health check port, defaults to the port of the backend service unless you want to specify a specific port, otherwise leave it blank. (applicable only to TCP/UDP target group).

     * @param Port Custom check parameters. health check port, defaults to the port of the backend service unless you want to specify a specific port, otherwise leave it blank. (applicable only to TCP/UDP target group).

     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Health check timeout. The default is 2 seconds. Value range: 2-30 seconds. 
     * @return Timeout Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
     * @param Timeout Health check timeout. The default is 2 seconds. Value range: 2-30 seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Detection interval time. The default is 5 seconds. Value range: 2-300 seconds. 
     * @return GapTime Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
     */
    public Long getGapTime() {
        return this.GapTime;
    }

    /**
     * Set Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
     * @param GapTime Detection interval time. The default is 5 seconds. Value range: 2-300 seconds.
     */
    public void setGapTime(Long GapTime) {
        this.GapTime = GapTime;
    }

    /**
     * Get Health detection threshold. The default is 3 times. Value range: 2-10 times. 
     * @return GoodLimit Health detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public Long getGoodLimit() {
        return this.GoodLimit;
    }

    /**
     * Set Health detection threshold. The default is 3 times. Value range: 2-10 times.
     * @param GoodLimit Health detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public void setGoodLimit(Long GoodLimit) {
        this.GoodLimit = GoodLimit;
    }

    /**
     * Get Unhealth detection threshold. The default is 3 times. Value range: 2-10 times. 
     * @return BadLimit Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public Long getBadLimit() {
        return this.BadLimit;
    }

    /**
     * Set Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
     * @param BadLimit Unhealth detection threshold. The default is 3 times. Value range: 2-10 times.
     */
    public void setBadLimit(Long BadLimit) {
        this.BadLimit = BadLimit;
    }

    /**
     * Get Indicates whether jumbo frames are enabled for probe packets of all rss in the target group. enabled by default. this parameter is supported only for GWLB type target groups. 
     * @return JumboFrame Indicates whether jumbo frames are enabled for probe packets of all rss in the target group. enabled by default. this parameter is supported only for GWLB type target groups.
     */
    public Boolean getJumboFrame() {
        return this.JumboFrame;
    }

    /**
     * Set Indicates whether jumbo frames are enabled for probe packets of all rss in the target group. enabled by default. this parameter is supported only for GWLB type target groups.
     * @param JumboFrame Indicates whether jumbo frames are enabled for probe packets of all rss in the target group. enabled by default. this parameter is supported only for GWLB type target groups.
     */
    public void setJumboFrame(Boolean JumboFrame) {
        this.JumboFrame = JumboFrame;
    }

    /**
     * Get Health check status code (applicable only to HTTP/HTTPS target group and HTTP health check method of TCP target group). value range: 1~31. default: 31. among them: <url> <li>1 means post-detection return value 1xx represents health.</li> <li>2 means return 2xx represents health.</li> <li>4 means return 3xx represents health.</li> <li>8 means return 4xx represents health.</li> <li>16 means return 5xx represents health.</li></url> to have multiple return codes represent health, sum up corresponding values.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCode Health check status code (applicable only to HTTP/HTTPS target group and HTTP health check method of TCP target group). value range: 1~31. default: 31. among them: <url> <li>1 means post-detection return value 1xx represents health.</li> <li>2 means return 2xx represents health.</li> <li>4 means return 3xx represents health.</li> <li>8 means return 4xx represents health.</li> <li>16 means return 5xx represents health.</li></url> to have multiple return codes represent health, sum up corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set Health check status code (applicable only to HTTP/HTTPS target group and HTTP health check method of TCP target group). value range: 1~31. default: 31. among them: <url> <li>1 means post-detection return value 1xx represents health.</li> <li>2 means return 2xx represents health.</li> <li>4 means return 3xx represents health.</li> <li>8 means return 4xx represents health.</li> <li>16 means return 5xx represents health.</li></url> to have multiple return codes represent health, sum up corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCode Health check status code (applicable only to HTTP/HTTPS target group and HTTP health check method of TCP target group). value range: 1~31. default: 31. among them: <url> <li>1 means post-detection return value 1xx represents health.</li> <li>2 means return 2xx represents health.</li> <li>4 means return 3xx represents health.</li> <li>8 means return 4xx represents health.</li> <li>16 means return 5xx represents health.</li></url> to have multiple return codes represent health, sum up corresponding values.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get Health check domain name. among them: <ur><li>applicable only to HTTP/HTTPS target groups and TCP target groups when using HTTP health check method.</li><li>targeting HTTP/HTTPS target groups, this parameter is required when using HTTP health check method.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpCheckDomain Health check domain name. among them: <ur><li>applicable only to HTTP/HTTPS target groups and TCP target groups when using HTTP health check method.</li><li>targeting HTTP/HTTPS target groups, this parameter is required when using HTTP health check method.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set Health check domain name. among them: <ur><li>applicable only to HTTP/HTTPS target groups and TCP target groups when using HTTP health check method.</li><li>targeting HTTP/HTTPS target groups, this parameter is required when using HTTP health check method.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpCheckDomain Health check domain name. among them: <ur><li>applicable only to HTTP/HTTPS target groups and TCP target groups when using HTTP health check method.</li><li>targeting HTTP/HTTPS target groups, this parameter is required when using HTTP health check method.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
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
     * Get Input format of health check. required when health check method is CUSTOM. valid values: HEX or TEXT. among them:<ur><li>TEXT: TEXT format.</li><li>HEX: hexadecimal format. characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number.</li><li>applicable only to TCP/UDP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContextType Input format of health check. required when health check method is CUSTOM. valid values: HEX or TEXT. among them:<ur><li>TEXT: TEXT format.</li><li>HEX: hexadecimal format. characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number.</li><li>applicable only to TCP/UDP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set Input format of health check. required when health check method is CUSTOM. valid values: HEX or TEXT. among them:<ur><li>TEXT: TEXT format.</li><li>HEX: hexadecimal format. characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number.</li><li>applicable only to TCP/UDP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContextType Input format of health check. required when health check method is CUSTOM. valid values: HEX or TEXT. among them:<ur><li>TEXT: TEXT format.</li><li>HEX: hexadecimal format. characters of SendContext and RecvContext can only be selected from 0123456789ABCDEF and the length must be an even number.</li><li>applicable only to TCP/UDP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get CUSTOM check parameters. required when the CheckType value is CUSTOM, represents the content of the request sent by the health check, only ASCII visible characters, maximum length limit 500. applicable only to TCP/UDP target group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SendContext CUSTOM check parameters. required when the CheckType value is CUSTOM, represents the content of the request sent by the health check, only ASCII visible characters, maximum length limit 500. applicable only to TCP/UDP target group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set CUSTOM check parameters. required when the CheckType value is CUSTOM, represents the content of the request sent by the health check, only ASCII visible characters, maximum length limit 500. applicable only to TCP/UDP target group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SendContext CUSTOM check parameters. required when the CheckType value is CUSTOM, represents the content of the request sent by the health check, only ASCII visible characters, maximum length limit 500. applicable only to TCP/UDP target group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get CUSTOM check parameters. required when the CheckType value is CUSTOM. represents the result returned by the health check. only ASCII visible characters are allowed. maximum length limit is 500. (applicable only to TCP/UDP target group).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecvContext CUSTOM check parameters. required when the CheckType value is CUSTOM. represents the result returned by the health check. only ASCII visible characters are allowed. maximum length limit is 500. (applicable only to TCP/UDP target group).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set CUSTOM check parameters. required when the CheckType value is CUSTOM. represents the result returned by the health check. only ASCII visible characters are allowed. maximum length limit is 500. (applicable only to TCP/UDP target group).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecvContext CUSTOM check parameters. required when the CheckType value is CUSTOM. represents the result returned by the health check. only ASCII visible characters are allowed. maximum length limit is 500. (applicable only to TCP/UDP target group).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get HTTP version, where: <ur><li>this field is required if the value of CheckType is HTTP.</li><li>supports configuration options: HTTP/1.0, HTTP/1.1.</li><li>applicable only to TCP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpVersion HTTP version, where: <ur><li>this field is required if the value of CheckType is HTTP.</li><li>supports configuration options: HTTP/1.0, HTTP/1.1.</li><li>applicable only to TCP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set HTTP version, where: <ur><li>this field is required if the value of CheckType is HTTP.</li><li>supports configuration options: HTTP/1.0, HTTP/1.1.</li><li>applicable only to TCP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpVersion HTTP version, where: <ur><li>this field is required if the value of CheckType is HTTP.</li><li>supports configuration options: HTTP/1.0, HTTP/1.1.</li><li>applicable only to TCP target group.</li></ur>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get Health check status code when the protocol is GRPC. (this parameter applies only to target groups with the backend forwarding protocol of GRPC.) default value: 12. valid values: a single numerical value, multiple numerical values, or a range. for example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtendedCode Health check status code when the protocol is GRPC. (this parameter applies only to target groups with the backend forwarding protocol of GRPC.) default value: 12. valid values: a single numerical value, multiple numerical values, or a range. for example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtendedCode() {
        return this.ExtendedCode;
    }

    /**
     * Set Health check status code when the protocol is GRPC. (this parameter applies only to target groups with the backend forwarding protocol of GRPC.) default value: 12. valid values: a single numerical value, multiple numerical values, or a range. for example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtendedCode Health check status code when the protocol is GRPC. (this parameter applies only to target groups with the backend forwarding protocol of GRPC.) default value: 12. valid values: a single numerical value, multiple numerical values, or a range. for example, 20, 20,25, or 0-99.
Note: This field may return null, indicating that no valid values can be obtained.
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

