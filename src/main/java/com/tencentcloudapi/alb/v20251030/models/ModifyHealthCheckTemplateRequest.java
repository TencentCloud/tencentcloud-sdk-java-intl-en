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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHealthCheckTemplateRequest extends AbstractModel {

    /**
    * <p>Health check template ID. The format is `hct-` followed by alphanumeric characters.</p>
    */
    @SerializedName("HealthCheckTemplateId")
    @Expose
    private String HealthCheckTemplateId;

    /**
    * <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the health check template.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits of the modified health check template meet the requirements.</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Health check status code. Value:</p><ul><li>When the health check protocol is <strong>HTTP/HTTPS</strong>:<ul><li><strong>HTTP_1xx</strong></li><li><strong>HTTP_2xx</strong> (default value)</li><li><strong>HTTP_3xx</strong></li><li><strong>HTTP_4xx</strong></li><li><strong>HTTP_5xx</strong></li></ul></li><li>When the health check protocol is <strong>GRPC/GRPCS</strong>: the default value is <strong>12</strong>, the value range is <strong>0-99</strong>, and the input value can be a numerical value, multiple values, a range, or a combination, for example:<ul><li><strong>"20"</strong></li><li><strong>"0-99"</strong></li></ul></li></ul>
    */
    @SerializedName("HealthCheckCodes")
    @Expose
    private String [] HealthCheckCodes;

    /**
    * <p>Threshold for determining backend service health. After the health check succeeds consecutively for this number of times, the backend service status changes from <strong>unhealthy</strong> to <strong>healthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
    */
    @SerializedName("HealthCheckHealthyThreshold")
    @Expose
    private Long HealthCheckHealthyThreshold;

    /**
    * <p>Health check domain name.<br>Length limit: <strong>1-255</strong> characters.<br>It can contain lowercase letters, digits, dashes (-), and half-width periods (.).</p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
    */
    @SerializedName("HealthCheckHost")
    @Expose
    private String HealthCheckHost;

    /**
    * <p>HTTP version for health check. Valid values:</p><ul><li><strong>HTTP1.1</strong> (default)</li><li><strong>HTTP1.0</strong> <blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote></li></ul>
    */
    @SerializedName("HealthCheckHttpVersion")
    @Expose
    private String HealthCheckHttpVersion;

    /**
    * <p>The interval of health check. Unit: second. Value range: <strong>2</strong>-<strong>300</strong>. Default value: <strong>5</strong>.</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>Health check method. Value: - <strong>GET</strong> - <strong>HEAD</strong> (default value) </p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote>
    */
    @SerializedName("HealthCheckMethod")
    @Expose
    private String HealthCheckMethod;

    /**
    * <p>Forwarding rule path for health check. The length is <strong>1-80</strong> characters. Only letters, digits, characters <code>-/.%?#&amp;=</code>, and extended characters <code>_;~!（)*[]@$^:&#39;,+</code> can be used. The URL must start with a forward slash (/). </p><blockquote><p>The forwarding rule path parameter takes effect only when <strong>HealthCheckProtocol</strong> is <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * <p>Health check access to the backend server port. Value range: <strong>0-65535</strong>. Default value: <strong>0</strong>, which means the backend server port.</p>
    */
    @SerializedName("HealthCheckPort")
    @Expose
    private Long HealthCheckPort;

    /**
    * <p>Health check protocol. Valid values:</p><ul><li><strong>HTTP</strong> (default): Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy.</li><li><strong>HTTPS</strong>: Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy. (Encrypts data and is more secure than HTTP.)</li><li><strong>TCP</strong>: Sends SYN handshake messages to detect whether the server port is alive.</li><li><strong>GRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</li><li><strong>GRPCS</strong>: Sends POST or GET requests to check whether the server application is healthy.</li></ul>
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

    /**
    * <p>Health check template name. It is 1-255 characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
    */
    @SerializedName("HealthCheckTemplateName")
    @Expose
    private String HealthCheckTemplateName;

    /**
    * <p>Health check response timeout, in seconds.<br>Value range: <strong>2</strong>-<strong>60</strong>.<br>Default value: <strong>2</strong>.</p>
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
    * <p>Threshold for determining an unhealthy backend service. After how many consecutive health check failures, the backend service status changes from <strong>healthy</strong> to <strong>unhealthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
    */
    @SerializedName("HealthCheckUnhealthyThreshold")
    @Expose
    private Long HealthCheckUnhealthyThreshold;

    /**
     * Get <p>Health check template ID. The format is `hct-` followed by alphanumeric characters.</p> 
     * @return HealthCheckTemplateId <p>Health check template ID. The format is `hct-` followed by alphanumeric characters.</p>
     */
    public String getHealthCheckTemplateId() {
        return this.HealthCheckTemplateId;
    }

    /**
     * Set <p>Health check template ID. The format is `hct-` followed by alphanumeric characters.</p>
     * @param HealthCheckTemplateId <p>Health check template ID. The format is `hct-` followed by alphanumeric characters.</p>
     */
    public void setHealthCheckTemplateId(String HealthCheckTemplateId) {
        this.HealthCheckTemplateId = HealthCheckTemplateId;
    }

    /**
     * Get <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the health check template.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits of the modified health check template meet the requirements.</li></ul> 
     * @return DryRun <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the health check template.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits of the modified health check template meet the requirements.</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the health check template.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits of the modified health check template meet the requirements.</li></ul>
     * @param DryRun <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the health check template.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits of the modified health check template meet the requirements.</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>Health check status code. Value:</p><ul><li>When the health check protocol is <strong>HTTP/HTTPS</strong>:<ul><li><strong>HTTP_1xx</strong></li><li><strong>HTTP_2xx</strong> (default value)</li><li><strong>HTTP_3xx</strong></li><li><strong>HTTP_4xx</strong></li><li><strong>HTTP_5xx</strong></li></ul></li><li>When the health check protocol is <strong>GRPC/GRPCS</strong>: the default value is <strong>12</strong>, the value range is <strong>0-99</strong>, and the input value can be a numerical value, multiple values, a range, or a combination, for example:<ul><li><strong>"20"</strong></li><li><strong>"0-99"</strong></li></ul></li></ul> 
     * @return HealthCheckCodes <p>Health check status code. Value:</p><ul><li>When the health check protocol is <strong>HTTP/HTTPS</strong>:<ul><li><strong>HTTP_1xx</strong></li><li><strong>HTTP_2xx</strong> (default value)</li><li><strong>HTTP_3xx</strong></li><li><strong>HTTP_4xx</strong></li><li><strong>HTTP_5xx</strong></li></ul></li><li>When the health check protocol is <strong>GRPC/GRPCS</strong>: the default value is <strong>12</strong>, the value range is <strong>0-99</strong>, and the input value can be a numerical value, multiple values, a range, or a combination, for example:<ul><li><strong>"20"</strong></li><li><strong>"0-99"</strong></li></ul></li></ul>
     */
    public String [] getHealthCheckCodes() {
        return this.HealthCheckCodes;
    }

    /**
     * Set <p>Health check status code. Value:</p><ul><li>When the health check protocol is <strong>HTTP/HTTPS</strong>:<ul><li><strong>HTTP_1xx</strong></li><li><strong>HTTP_2xx</strong> (default value)</li><li><strong>HTTP_3xx</strong></li><li><strong>HTTP_4xx</strong></li><li><strong>HTTP_5xx</strong></li></ul></li><li>When the health check protocol is <strong>GRPC/GRPCS</strong>: the default value is <strong>12</strong>, the value range is <strong>0-99</strong>, and the input value can be a numerical value, multiple values, a range, or a combination, for example:<ul><li><strong>"20"</strong></li><li><strong>"0-99"</strong></li></ul></li></ul>
     * @param HealthCheckCodes <p>Health check status code. Value:</p><ul><li>When the health check protocol is <strong>HTTP/HTTPS</strong>:<ul><li><strong>HTTP_1xx</strong></li><li><strong>HTTP_2xx</strong> (default value)</li><li><strong>HTTP_3xx</strong></li><li><strong>HTTP_4xx</strong></li><li><strong>HTTP_5xx</strong></li></ul></li><li>When the health check protocol is <strong>GRPC/GRPCS</strong>: the default value is <strong>12</strong>, the value range is <strong>0-99</strong>, and the input value can be a numerical value, multiple values, a range, or a combination, for example:<ul><li><strong>"20"</strong></li><li><strong>"0-99"</strong></li></ul></li></ul>
     */
    public void setHealthCheckCodes(String [] HealthCheckCodes) {
        this.HealthCheckCodes = HealthCheckCodes;
    }

    /**
     * Get <p>Threshold for determining backend service health. After the health check succeeds consecutively for this number of times, the backend service status changes from <strong>unhealthy</strong> to <strong>healthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p> 
     * @return HealthCheckHealthyThreshold <p>Threshold for determining backend service health. After the health check succeeds consecutively for this number of times, the backend service status changes from <strong>unhealthy</strong> to <strong>healthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
     */
    public Long getHealthCheckHealthyThreshold() {
        return this.HealthCheckHealthyThreshold;
    }

    /**
     * Set <p>Threshold for determining backend service health. After the health check succeeds consecutively for this number of times, the backend service status changes from <strong>unhealthy</strong> to <strong>healthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
     * @param HealthCheckHealthyThreshold <p>Threshold for determining backend service health. After the health check succeeds consecutively for this number of times, the backend service status changes from <strong>unhealthy</strong> to <strong>healthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
     */
    public void setHealthCheckHealthyThreshold(Long HealthCheckHealthyThreshold) {
        this.HealthCheckHealthyThreshold = HealthCheckHealthyThreshold;
    }

    /**
     * Get <p>Health check domain name.<br>Length limit: <strong>1-255</strong> characters.<br>It can contain lowercase letters, digits, dashes (-), and half-width periods (.).</p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote> 
     * @return HealthCheckHost <p>Health check domain name.<br>Length limit: <strong>1-255</strong> characters.<br>It can contain lowercase letters, digits, dashes (-), and half-width periods (.).</p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
     */
    public String getHealthCheckHost() {
        return this.HealthCheckHost;
    }

    /**
     * Set <p>Health check domain name.<br>Length limit: <strong>1-255</strong> characters.<br>It can contain lowercase letters, digits, dashes (-), and half-width periods (.).</p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
     * @param HealthCheckHost <p>Health check domain name.<br>Length limit: <strong>1-255</strong> characters.<br>It can contain lowercase letters, digits, dashes (-), and half-width periods (.).</p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
     */
    public void setHealthCheckHost(String HealthCheckHost) {
        this.HealthCheckHost = HealthCheckHost;
    }

    /**
     * Get <p>HTTP version for health check. Valid values:</p><ul><li><strong>HTTP1.1</strong> (default)</li><li><strong>HTTP1.0</strong> <blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote></li></ul> 
     * @return HealthCheckHttpVersion <p>HTTP version for health check. Valid values:</p><ul><li><strong>HTTP1.1</strong> (default)</li><li><strong>HTTP1.0</strong> <blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote></li></ul>
     */
    public String getHealthCheckHttpVersion() {
        return this.HealthCheckHttpVersion;
    }

    /**
     * Set <p>HTTP version for health check. Valid values:</p><ul><li><strong>HTTP1.1</strong> (default)</li><li><strong>HTTP1.0</strong> <blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote></li></ul>
     * @param HealthCheckHttpVersion <p>HTTP version for health check. Valid values:</p><ul><li><strong>HTTP1.1</strong> (default)</li><li><strong>HTTP1.0</strong> <blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote></li></ul>
     */
    public void setHealthCheckHttpVersion(String HealthCheckHttpVersion) {
        this.HealthCheckHttpVersion = HealthCheckHttpVersion;
    }

    /**
     * Get <p>The interval of health check. Unit: second. Value range: <strong>2</strong>-<strong>300</strong>. Default value: <strong>5</strong>.</p> 
     * @return HealthCheckInterval <p>The interval of health check. Unit: second. Value range: <strong>2</strong>-<strong>300</strong>. Default value: <strong>5</strong>.</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>The interval of health check. Unit: second. Value range: <strong>2</strong>-<strong>300</strong>. Default value: <strong>5</strong>.</p>
     * @param HealthCheckInterval <p>The interval of health check. Unit: second. Value range: <strong>2</strong>-<strong>300</strong>. Default value: <strong>5</strong>.</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>Health check method. Value: - <strong>GET</strong> - <strong>HEAD</strong> (default value) </p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote> 
     * @return HealthCheckMethod <p>Health check method. Value: - <strong>GET</strong> - <strong>HEAD</strong> (default value) </p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote>
     */
    public String getHealthCheckMethod() {
        return this.HealthCheckMethod;
    }

    /**
     * Set <p>Health check method. Value: - <strong>GET</strong> - <strong>HEAD</strong> (default value) </p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote>
     * @param HealthCheckMethod <p>Health check method. Value: - <strong>GET</strong> - <strong>HEAD</strong> (default value) </p><blockquote><p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p></blockquote>
     */
    public void setHealthCheckMethod(String HealthCheckMethod) {
        this.HealthCheckMethod = HealthCheckMethod;
    }

    /**
     * Get <p>Forwarding rule path for health check. The length is <strong>1-80</strong> characters. Only letters, digits, characters <code>-/.%?#&amp;=</code>, and extended characters <code>_;~!（)*[]@$^:&#39;,+</code> can be used. The URL must start with a forward slash (/). </p><blockquote><p>The forwarding rule path parameter takes effect only when <strong>HealthCheckProtocol</strong> is <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote> 
     * @return HealthCheckPath <p>Forwarding rule path for health check. The length is <strong>1-80</strong> characters. Only letters, digits, characters <code>-/.%?#&amp;=</code>, and extended characters <code>_;~!（)*[]@$^:&#39;,+</code> can be used. The URL must start with a forward slash (/). </p><blockquote><p>The forwarding rule path parameter takes effect only when <strong>HealthCheckProtocol</strong> is <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set <p>Forwarding rule path for health check. The length is <strong>1-80</strong> characters. Only letters, digits, characters <code>-/.%?#&amp;=</code>, and extended characters <code>_;~!（)*[]@$^:&#39;,+</code> can be used. The URL must start with a forward slash (/). </p><blockquote><p>The forwarding rule path parameter takes effect only when <strong>HealthCheckProtocol</strong> is <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
     * @param HealthCheckPath <p>Forwarding rule path for health check. The length is <strong>1-80</strong> characters. Only letters, digits, characters <code>-/.%?#&amp;=</code>, and extended characters <code>_;~!（)*[]@$^:&#39;,+</code> can be used. The URL must start with a forward slash (/). </p><blockquote><p>The forwarding rule path parameter takes effect only when <strong>HealthCheckProtocol</strong> is <strong>HTTP/HTTPS/GRPC/GRPCS</strong>.</p></blockquote>
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get <p>Health check access to the backend server port. Value range: <strong>0-65535</strong>. Default value: <strong>0</strong>, which means the backend server port.</p> 
     * @return HealthCheckPort <p>Health check access to the backend server port. Value range: <strong>0-65535</strong>. Default value: <strong>0</strong>, which means the backend server port.</p>
     */
    public Long getHealthCheckPort() {
        return this.HealthCheckPort;
    }

    /**
     * Set <p>Health check access to the backend server port. Value range: <strong>0-65535</strong>. Default value: <strong>0</strong>, which means the backend server port.</p>
     * @param HealthCheckPort <p>Health check access to the backend server port. Value range: <strong>0-65535</strong>. Default value: <strong>0</strong>, which means the backend server port.</p>
     */
    public void setHealthCheckPort(Long HealthCheckPort) {
        this.HealthCheckPort = HealthCheckPort;
    }

    /**
     * Get <p>Health check protocol. Valid values:</p><ul><li><strong>HTTP</strong> (default): Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy.</li><li><strong>HTTPS</strong>: Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy. (Encrypts data and is more secure than HTTP.)</li><li><strong>TCP</strong>: Sends SYN handshake messages to detect whether the server port is alive.</li><li><strong>GRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</li><li><strong>GRPCS</strong>: Sends POST or GET requests to check whether the server application is healthy.</li></ul> 
     * @return HealthCheckProtocol <p>Health check protocol. Valid values:</p><ul><li><strong>HTTP</strong> (default): Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy.</li><li><strong>HTTPS</strong>: Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy. (Encrypts data and is more secure than HTTP.)</li><li><strong>TCP</strong>: Sends SYN handshake messages to detect whether the server port is alive.</li><li><strong>GRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</li><li><strong>GRPCS</strong>: Sends POST or GET requests to check whether the server application is healthy.</li></ul>
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set <p>Health check protocol. Valid values:</p><ul><li><strong>HTTP</strong> (default): Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy.</li><li><strong>HTTPS</strong>: Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy. (Encrypts data and is more secure than HTTP.)</li><li><strong>TCP</strong>: Sends SYN handshake messages to detect whether the server port is alive.</li><li><strong>GRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</li><li><strong>GRPCS</strong>: Sends POST or GET requests to check whether the server application is healthy.</li></ul>
     * @param HealthCheckProtocol <p>Health check protocol. Valid values:</p><ul><li><strong>HTTP</strong> (default): Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy.</li><li><strong>HTTPS</strong>: Sends HEAD or GET requests to simulate browser access requests and check whether the server application is healthy. (Encrypts data and is more secure than HTTP.)</li><li><strong>TCP</strong>: Sends SYN handshake messages to detect whether the server port is alive.</li><li><strong>GRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</li><li><strong>GRPCS</strong>: Sends POST or GET requests to check whether the server application is healthy.</li></ul>
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
    }

    /**
     * Get <p>Health check template name. It is 1-255 characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p> 
     * @return HealthCheckTemplateName <p>Health check template name. It is 1-255 characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
     */
    public String getHealthCheckTemplateName() {
        return this.HealthCheckTemplateName;
    }

    /**
     * Set <p>Health check template name. It is 1-255 characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
     * @param HealthCheckTemplateName <p>Health check template name. It is 1-255 characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
     */
    public void setHealthCheckTemplateName(String HealthCheckTemplateName) {
        this.HealthCheckTemplateName = HealthCheckTemplateName;
    }

    /**
     * Get <p>Health check response timeout, in seconds.<br>Value range: <strong>2</strong>-<strong>60</strong>.<br>Default value: <strong>2</strong>.</p> 
     * @return HealthCheckTimeout <p>Health check response timeout, in seconds.<br>Value range: <strong>2</strong>-<strong>60</strong>.<br>Default value: <strong>2</strong>.</p>
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set <p>Health check response timeout, in seconds.<br>Value range: <strong>2</strong>-<strong>60</strong>.<br>Default value: <strong>2</strong>.</p>
     * @param HealthCheckTimeout <p>Health check response timeout, in seconds.<br>Value range: <strong>2</strong>-<strong>60</strong>.<br>Default value: <strong>2</strong>.</p>
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    /**
     * Get <p>Threshold for determining an unhealthy backend service. After how many consecutive health check failures, the backend service status changes from <strong>healthy</strong> to <strong>unhealthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p> 
     * @return HealthCheckUnhealthyThreshold <p>Threshold for determining an unhealthy backend service. After how many consecutive health check failures, the backend service status changes from <strong>healthy</strong> to <strong>unhealthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
     */
    public Long getHealthCheckUnhealthyThreshold() {
        return this.HealthCheckUnhealthyThreshold;
    }

    /**
     * Set <p>Threshold for determining an unhealthy backend service. After how many consecutive health check failures, the backend service status changes from <strong>healthy</strong> to <strong>unhealthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
     * @param HealthCheckUnhealthyThreshold <p>Threshold for determining an unhealthy backend service. After how many consecutive health check failures, the backend service status changes from <strong>healthy</strong> to <strong>unhealthy</strong>.<br>Value range: <strong>2</strong>-<strong>10</strong>.<br>Default value: <strong>2</strong>.</p>
     */
    public void setHealthCheckUnhealthyThreshold(Long HealthCheckUnhealthyThreshold) {
        this.HealthCheckUnhealthyThreshold = HealthCheckUnhealthyThreshold;
    }

    public ModifyHealthCheckTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHealthCheckTemplateRequest(ModifyHealthCheckTemplateRequest source) {
        if (source.HealthCheckTemplateId != null) {
            this.HealthCheckTemplateId = new String(source.HealthCheckTemplateId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HealthCheckCodes != null) {
            this.HealthCheckCodes = new String[source.HealthCheckCodes.length];
            for (int i = 0; i < source.HealthCheckCodes.length; i++) {
                this.HealthCheckCodes[i] = new String(source.HealthCheckCodes[i]);
            }
        }
        if (source.HealthCheckHealthyThreshold != null) {
            this.HealthCheckHealthyThreshold = new Long(source.HealthCheckHealthyThreshold);
        }
        if (source.HealthCheckHost != null) {
            this.HealthCheckHost = new String(source.HealthCheckHost);
        }
        if (source.HealthCheckHttpVersion != null) {
            this.HealthCheckHttpVersion = new String(source.HealthCheckHttpVersion);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.HealthCheckMethod != null) {
            this.HealthCheckMethod = new String(source.HealthCheckMethod);
        }
        if (source.HealthCheckPath != null) {
            this.HealthCheckPath = new String(source.HealthCheckPath);
        }
        if (source.HealthCheckPort != null) {
            this.HealthCheckPort = new Long(source.HealthCheckPort);
        }
        if (source.HealthCheckProtocol != null) {
            this.HealthCheckProtocol = new String(source.HealthCheckProtocol);
        }
        if (source.HealthCheckTemplateName != null) {
            this.HealthCheckTemplateName = new String(source.HealthCheckTemplateName);
        }
        if (source.HealthCheckTimeout != null) {
            this.HealthCheckTimeout = new Long(source.HealthCheckTimeout);
        }
        if (source.HealthCheckUnhealthyThreshold != null) {
            this.HealthCheckUnhealthyThreshold = new Long(source.HealthCheckUnhealthyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckTemplateId", this.HealthCheckTemplateId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArraySimple(map, prefix + "HealthCheckCodes.", this.HealthCheckCodes);
        this.setParamSimple(map, prefix + "HealthCheckHealthyThreshold", this.HealthCheckHealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckHost", this.HealthCheckHost);
        this.setParamSimple(map, prefix + "HealthCheckHttpVersion", this.HealthCheckHttpVersion);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckPort", this.HealthCheckPort);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);
        this.setParamSimple(map, prefix + "HealthCheckTemplateName", this.HealthCheckTemplateName);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);

    }
}

