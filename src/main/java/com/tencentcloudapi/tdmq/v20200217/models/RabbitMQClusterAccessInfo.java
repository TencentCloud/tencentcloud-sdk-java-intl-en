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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterAccessInfo extends AbstractModel {

    /**
    * <p>Cluster public network access address</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * <p>Public network access URL of the cluster Web console</p>
    */
    @SerializedName("WebConsoleEndpoint")
    @Expose
    private String WebConsoleEndpoint;

    /**
    * <p>Cluster Web console login username</p>
    */
    @SerializedName("WebConsoleUsername")
    @Expose
    private String WebConsoleUsername;

    /**
    * <p>Cluster Web console login password</p>
    */
    @SerializedName("WebConsolePassword")
    @Expose
    private String WebConsolePassword;

    /**
    * <p>Abandoned</p>
    */
    @SerializedName("PublicAccessEndpointStatus")
    @Expose
    private Boolean PublicAccessEndpointStatus;

    /**
    * <p>Deprecated</p>
    */
    @SerializedName("PublicControlConsoleSwitchStatus")
    @Expose
    private Boolean PublicControlConsoleSwitchStatus;

    /**
    * <p>Abandoned</p>
    */
    @SerializedName("VpcControlConsoleSwitchStatus")
    @Expose
    private Boolean VpcControlConsoleSwitchStatus;

    /**
    * <p>VPC access URL of the Web console</p>
    */
    @SerializedName("VpcWebConsoleEndpoint")
    @Expose
    private String VpcWebConsoleEndpoint;

    /**
    * <p>Status of the public network access switch in the Web console</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: ON</li><li>CREATING: CREATING</li><li>DELETING: DELETING</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
    */
    @SerializedName("PublicWebConsoleSwitchStatus")
    @Expose
    private String PublicWebConsoleSwitchStatus;

    /**
    * <p>Web console VPC access switch status</p><p>Enumeration values:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
    */
    @SerializedName("VpcWebConsoleSwitchStatus")
    @Expose
    private String VpcWebConsoleSwitchStatus;

    /**
    * <p>Public network access point switch state</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failure</li><li>DELETE_FAILURE: Deletion failure</li></ul>
    */
    @SerializedName("PublicDataStreamStatus")
    @Expose
    private String PublicDataStreamStatus;

    /**
    * <p>Prometheus info</p>
    */
    @SerializedName("PrometheusEndpointInfo")
    @Expose
    private PrometheusEndpointInfo PrometheusEndpointInfo;

    /**
    * <p>public domain name access point</p>
    */
    @SerializedName("WebConsoleDomainEndpoint")
    @Expose
    private String WebConsoleDomainEndpoint;

    /**
    * <p>VPC information used by the control plane</p>
    */
    @SerializedName("ControlPlaneEndpointInfo")
    @Expose
    private VpcEndpointInfo ControlPlaneEndpointInfo;

    /**
    * <p>TLS encrypted data stream public network access point</p>
    */
    @SerializedName("PublicTlsAccessEndpoint")
    @Expose
    private String PublicTlsAccessEndpoint;

    /**
    * <p>Whether to reuse the public IP address</p>
    */
    @SerializedName("PublicIpReused")
    @Expose
    private Boolean PublicIpReused;

    /**
    * <p>Error information of public network access operations for the Web console</p>
    */
    @SerializedName("PublicWebConsoleErrorMessage")
    @Expose
    private String PublicWebConsoleErrorMessage;

    /**
    * <p>Error information of VPC access operations in the Web console</p>
    */
    @SerializedName("VpcWebConsoleErrorMessage")
    @Expose
    private String VpcWebConsoleErrorMessage;

    /**
    * <p>Error information of public network access point operations</p>
    */
    @SerializedName("PublicDataStreamErrorMessage")
    @Expose
    private String PublicDataStreamErrorMessage;

    /**
    * <p>Public network Stream access point</p>
    */
    @SerializedName("PublicStreamAccessEndpoint")
    @Expose
    private String PublicStreamAccessEndpoint;

    /**
     * Get <p>Cluster public network access address</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicAccessEndpoint <p>Cluster public network access address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set <p>Cluster public network access address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicAccessEndpoint <p>Cluster public network access address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get <p>Public network access URL of the cluster Web console</p> 
     * @return WebConsoleEndpoint <p>Public network access URL of the cluster Web console</p>
     */
    public String getWebConsoleEndpoint() {
        return this.WebConsoleEndpoint;
    }

    /**
     * Set <p>Public network access URL of the cluster Web console</p>
     * @param WebConsoleEndpoint <p>Public network access URL of the cluster Web console</p>
     */
    public void setWebConsoleEndpoint(String WebConsoleEndpoint) {
        this.WebConsoleEndpoint = WebConsoleEndpoint;
    }

    /**
     * Get <p>Cluster Web console login username</p> 
     * @return WebConsoleUsername <p>Cluster Web console login username</p>
     */
    public String getWebConsoleUsername() {
        return this.WebConsoleUsername;
    }

    /**
     * Set <p>Cluster Web console login username</p>
     * @param WebConsoleUsername <p>Cluster Web console login username</p>
     */
    public void setWebConsoleUsername(String WebConsoleUsername) {
        this.WebConsoleUsername = WebConsoleUsername;
    }

    /**
     * Get <p>Cluster Web console login password</p> 
     * @return WebConsolePassword <p>Cluster Web console login password</p>
     */
    public String getWebConsolePassword() {
        return this.WebConsolePassword;
    }

    /**
     * Set <p>Cluster Web console login password</p>
     * @param WebConsolePassword <p>Cluster Web console login password</p>
     */
    public void setWebConsolePassword(String WebConsolePassword) {
        this.WebConsolePassword = WebConsolePassword;
    }

    /**
     * Get <p>Abandoned</p> 
     * @return PublicAccessEndpointStatus <p>Abandoned</p>
     */
    public Boolean getPublicAccessEndpointStatus() {
        return this.PublicAccessEndpointStatus;
    }

    /**
     * Set <p>Abandoned</p>
     * @param PublicAccessEndpointStatus <p>Abandoned</p>
     */
    public void setPublicAccessEndpointStatus(Boolean PublicAccessEndpointStatus) {
        this.PublicAccessEndpointStatus = PublicAccessEndpointStatus;
    }

    /**
     * Get <p>Deprecated</p> 
     * @return PublicControlConsoleSwitchStatus <p>Deprecated</p>
     */
    public Boolean getPublicControlConsoleSwitchStatus() {
        return this.PublicControlConsoleSwitchStatus;
    }

    /**
     * Set <p>Deprecated</p>
     * @param PublicControlConsoleSwitchStatus <p>Deprecated</p>
     */
    public void setPublicControlConsoleSwitchStatus(Boolean PublicControlConsoleSwitchStatus) {
        this.PublicControlConsoleSwitchStatus = PublicControlConsoleSwitchStatus;
    }

    /**
     * Get <p>Abandoned</p> 
     * @return VpcControlConsoleSwitchStatus <p>Abandoned</p>
     */
    public Boolean getVpcControlConsoleSwitchStatus() {
        return this.VpcControlConsoleSwitchStatus;
    }

    /**
     * Set <p>Abandoned</p>
     * @param VpcControlConsoleSwitchStatus <p>Abandoned</p>
     */
    public void setVpcControlConsoleSwitchStatus(Boolean VpcControlConsoleSwitchStatus) {
        this.VpcControlConsoleSwitchStatus = VpcControlConsoleSwitchStatus;
    }

    /**
     * Get <p>VPC access URL of the Web console</p> 
     * @return VpcWebConsoleEndpoint <p>VPC access URL of the Web console</p>
     */
    public String getVpcWebConsoleEndpoint() {
        return this.VpcWebConsoleEndpoint;
    }

    /**
     * Set <p>VPC access URL of the Web console</p>
     * @param VpcWebConsoleEndpoint <p>VPC access URL of the Web console</p>
     */
    public void setVpcWebConsoleEndpoint(String VpcWebConsoleEndpoint) {
        this.VpcWebConsoleEndpoint = VpcWebConsoleEndpoint;
    }

    /**
     * Get <p>Status of the public network access switch in the Web console</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: ON</li><li>CREATING: CREATING</li><li>DELETING: DELETING</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul> 
     * @return PublicWebConsoleSwitchStatus <p>Status of the public network access switch in the Web console</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: ON</li><li>CREATING: CREATING</li><li>DELETING: DELETING</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
     */
    public String getPublicWebConsoleSwitchStatus() {
        return this.PublicWebConsoleSwitchStatus;
    }

    /**
     * Set <p>Status of the public network access switch in the Web console</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: ON</li><li>CREATING: CREATING</li><li>DELETING: DELETING</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
     * @param PublicWebConsoleSwitchStatus <p>Status of the public network access switch in the Web console</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: ON</li><li>CREATING: CREATING</li><li>DELETING: DELETING</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
     */
    public void setPublicWebConsoleSwitchStatus(String PublicWebConsoleSwitchStatus) {
        this.PublicWebConsoleSwitchStatus = PublicWebConsoleSwitchStatus;
    }

    /**
     * Get <p>Web console VPC access switch status</p><p>Enumeration values:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul> 
     * @return VpcWebConsoleSwitchStatus <p>Web console VPC access switch status</p><p>Enumeration values:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
     */
    public String getVpcWebConsoleSwitchStatus() {
        return this.VpcWebConsoleSwitchStatus;
    }

    /**
     * Set <p>Web console VPC access switch status</p><p>Enumeration values:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
     * @param VpcWebConsoleSwitchStatus <p>Web console VPC access switch status</p><p>Enumeration values:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failed</li><li>DELETE_FAILURE: Deletion failed</li></ul>
     */
    public void setVpcWebConsoleSwitchStatus(String VpcWebConsoleSwitchStatus) {
        this.VpcWebConsoleSwitchStatus = VpcWebConsoleSwitchStatus;
    }

    /**
     * Get <p>Public network access point switch state</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failure</li><li>DELETE_FAILURE: Deletion failure</li></ul> 
     * @return PublicDataStreamStatus <p>Public network access point switch state</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failure</li><li>DELETE_FAILURE: Deletion failure</li></ul>
     */
    public String getPublicDataStreamStatus() {
        return this.PublicDataStreamStatus;
    }

    /**
     * Set <p>Public network access point switch state</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failure</li><li>DELETE_FAILURE: Deletion failure</li></ul>
     * @param PublicDataStreamStatus <p>Public network access point switch state</p><p>Enumeration value:</p><ul><li>OFF: Closed</li><li>ON: Enabled</li><li>CREATING: Creating</li><li>DELETING: Deleting</li><li>CREATE_FAILURE: Creation failure</li><li>DELETE_FAILURE: Deletion failure</li></ul>
     */
    public void setPublicDataStreamStatus(String PublicDataStreamStatus) {
        this.PublicDataStreamStatus = PublicDataStreamStatus;
    }

    /**
     * Get <p>Prometheus info</p> 
     * @return PrometheusEndpointInfo <p>Prometheus info</p>
     */
    public PrometheusEndpointInfo getPrometheusEndpointInfo() {
        return this.PrometheusEndpointInfo;
    }

    /**
     * Set <p>Prometheus info</p>
     * @param PrometheusEndpointInfo <p>Prometheus info</p>
     */
    public void setPrometheusEndpointInfo(PrometheusEndpointInfo PrometheusEndpointInfo) {
        this.PrometheusEndpointInfo = PrometheusEndpointInfo;
    }

    /**
     * Get <p>public domain name access point</p> 
     * @return WebConsoleDomainEndpoint <p>public domain name access point</p>
     */
    public String getWebConsoleDomainEndpoint() {
        return this.WebConsoleDomainEndpoint;
    }

    /**
     * Set <p>public domain name access point</p>
     * @param WebConsoleDomainEndpoint <p>public domain name access point</p>
     */
    public void setWebConsoleDomainEndpoint(String WebConsoleDomainEndpoint) {
        this.WebConsoleDomainEndpoint = WebConsoleDomainEndpoint;
    }

    /**
     * Get <p>VPC information used by the control plane</p> 
     * @return ControlPlaneEndpointInfo <p>VPC information used by the control plane</p>
     */
    public VpcEndpointInfo getControlPlaneEndpointInfo() {
        return this.ControlPlaneEndpointInfo;
    }

    /**
     * Set <p>VPC information used by the control plane</p>
     * @param ControlPlaneEndpointInfo <p>VPC information used by the control plane</p>
     */
    public void setControlPlaneEndpointInfo(VpcEndpointInfo ControlPlaneEndpointInfo) {
        this.ControlPlaneEndpointInfo = ControlPlaneEndpointInfo;
    }

    /**
     * Get <p>TLS encrypted data stream public network access point</p> 
     * @return PublicTlsAccessEndpoint <p>TLS encrypted data stream public network access point</p>
     */
    public String getPublicTlsAccessEndpoint() {
        return this.PublicTlsAccessEndpoint;
    }

    /**
     * Set <p>TLS encrypted data stream public network access point</p>
     * @param PublicTlsAccessEndpoint <p>TLS encrypted data stream public network access point</p>
     */
    public void setPublicTlsAccessEndpoint(String PublicTlsAccessEndpoint) {
        this.PublicTlsAccessEndpoint = PublicTlsAccessEndpoint;
    }

    /**
     * Get <p>Whether to reuse the public IP address</p> 
     * @return PublicIpReused <p>Whether to reuse the public IP address</p>
     */
    public Boolean getPublicIpReused() {
        return this.PublicIpReused;
    }

    /**
     * Set <p>Whether to reuse the public IP address</p>
     * @param PublicIpReused <p>Whether to reuse the public IP address</p>
     */
    public void setPublicIpReused(Boolean PublicIpReused) {
        this.PublicIpReused = PublicIpReused;
    }

    /**
     * Get <p>Error information of public network access operations for the Web console</p> 
     * @return PublicWebConsoleErrorMessage <p>Error information of public network access operations for the Web console</p>
     */
    public String getPublicWebConsoleErrorMessage() {
        return this.PublicWebConsoleErrorMessage;
    }

    /**
     * Set <p>Error information of public network access operations for the Web console</p>
     * @param PublicWebConsoleErrorMessage <p>Error information of public network access operations for the Web console</p>
     */
    public void setPublicWebConsoleErrorMessage(String PublicWebConsoleErrorMessage) {
        this.PublicWebConsoleErrorMessage = PublicWebConsoleErrorMessage;
    }

    /**
     * Get <p>Error information of VPC access operations in the Web console</p> 
     * @return VpcWebConsoleErrorMessage <p>Error information of VPC access operations in the Web console</p>
     */
    public String getVpcWebConsoleErrorMessage() {
        return this.VpcWebConsoleErrorMessage;
    }

    /**
     * Set <p>Error information of VPC access operations in the Web console</p>
     * @param VpcWebConsoleErrorMessage <p>Error information of VPC access operations in the Web console</p>
     */
    public void setVpcWebConsoleErrorMessage(String VpcWebConsoleErrorMessage) {
        this.VpcWebConsoleErrorMessage = VpcWebConsoleErrorMessage;
    }

    /**
     * Get <p>Error information of public network access point operations</p> 
     * @return PublicDataStreamErrorMessage <p>Error information of public network access point operations</p>
     */
    public String getPublicDataStreamErrorMessage() {
        return this.PublicDataStreamErrorMessage;
    }

    /**
     * Set <p>Error information of public network access point operations</p>
     * @param PublicDataStreamErrorMessage <p>Error information of public network access point operations</p>
     */
    public void setPublicDataStreamErrorMessage(String PublicDataStreamErrorMessage) {
        this.PublicDataStreamErrorMessage = PublicDataStreamErrorMessage;
    }

    /**
     * Get <p>Public network Stream access point</p> 
     * @return PublicStreamAccessEndpoint <p>Public network Stream access point</p>
     */
    public String getPublicStreamAccessEndpoint() {
        return this.PublicStreamAccessEndpoint;
    }

    /**
     * Set <p>Public network Stream access point</p>
     * @param PublicStreamAccessEndpoint <p>Public network Stream access point</p>
     */
    public void setPublicStreamAccessEndpoint(String PublicStreamAccessEndpoint) {
        this.PublicStreamAccessEndpoint = PublicStreamAccessEndpoint;
    }

    public RabbitMQClusterAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterAccessInfo(RabbitMQClusterAccessInfo source) {
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.WebConsoleEndpoint != null) {
            this.WebConsoleEndpoint = new String(source.WebConsoleEndpoint);
        }
        if (source.WebConsoleUsername != null) {
            this.WebConsoleUsername = new String(source.WebConsoleUsername);
        }
        if (source.WebConsolePassword != null) {
            this.WebConsolePassword = new String(source.WebConsolePassword);
        }
        if (source.PublicAccessEndpointStatus != null) {
            this.PublicAccessEndpointStatus = new Boolean(source.PublicAccessEndpointStatus);
        }
        if (source.PublicControlConsoleSwitchStatus != null) {
            this.PublicControlConsoleSwitchStatus = new Boolean(source.PublicControlConsoleSwitchStatus);
        }
        if (source.VpcControlConsoleSwitchStatus != null) {
            this.VpcControlConsoleSwitchStatus = new Boolean(source.VpcControlConsoleSwitchStatus);
        }
        if (source.VpcWebConsoleEndpoint != null) {
            this.VpcWebConsoleEndpoint = new String(source.VpcWebConsoleEndpoint);
        }
        if (source.PublicWebConsoleSwitchStatus != null) {
            this.PublicWebConsoleSwitchStatus = new String(source.PublicWebConsoleSwitchStatus);
        }
        if (source.VpcWebConsoleSwitchStatus != null) {
            this.VpcWebConsoleSwitchStatus = new String(source.VpcWebConsoleSwitchStatus);
        }
        if (source.PublicDataStreamStatus != null) {
            this.PublicDataStreamStatus = new String(source.PublicDataStreamStatus);
        }
        if (source.PrometheusEndpointInfo != null) {
            this.PrometheusEndpointInfo = new PrometheusEndpointInfo(source.PrometheusEndpointInfo);
        }
        if (source.WebConsoleDomainEndpoint != null) {
            this.WebConsoleDomainEndpoint = new String(source.WebConsoleDomainEndpoint);
        }
        if (source.ControlPlaneEndpointInfo != null) {
            this.ControlPlaneEndpointInfo = new VpcEndpointInfo(source.ControlPlaneEndpointInfo);
        }
        if (source.PublicTlsAccessEndpoint != null) {
            this.PublicTlsAccessEndpoint = new String(source.PublicTlsAccessEndpoint);
        }
        if (source.PublicIpReused != null) {
            this.PublicIpReused = new Boolean(source.PublicIpReused);
        }
        if (source.PublicWebConsoleErrorMessage != null) {
            this.PublicWebConsoleErrorMessage = new String(source.PublicWebConsoleErrorMessage);
        }
        if (source.VpcWebConsoleErrorMessage != null) {
            this.VpcWebConsoleErrorMessage = new String(source.VpcWebConsoleErrorMessage);
        }
        if (source.PublicDataStreamErrorMessage != null) {
            this.PublicDataStreamErrorMessage = new String(source.PublicDataStreamErrorMessage);
        }
        if (source.PublicStreamAccessEndpoint != null) {
            this.PublicStreamAccessEndpoint = new String(source.PublicStreamAccessEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamSimple(map, prefix + "WebConsoleEndpoint", this.WebConsoleEndpoint);
        this.setParamSimple(map, prefix + "WebConsoleUsername", this.WebConsoleUsername);
        this.setParamSimple(map, prefix + "WebConsolePassword", this.WebConsolePassword);
        this.setParamSimple(map, prefix + "PublicAccessEndpointStatus", this.PublicAccessEndpointStatus);
        this.setParamSimple(map, prefix + "PublicControlConsoleSwitchStatus", this.PublicControlConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "VpcControlConsoleSwitchStatus", this.VpcControlConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "VpcWebConsoleEndpoint", this.VpcWebConsoleEndpoint);
        this.setParamSimple(map, prefix + "PublicWebConsoleSwitchStatus", this.PublicWebConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "VpcWebConsoleSwitchStatus", this.VpcWebConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "PublicDataStreamStatus", this.PublicDataStreamStatus);
        this.setParamObj(map, prefix + "PrometheusEndpointInfo.", this.PrometheusEndpointInfo);
        this.setParamSimple(map, prefix + "WebConsoleDomainEndpoint", this.WebConsoleDomainEndpoint);
        this.setParamObj(map, prefix + "ControlPlaneEndpointInfo.", this.ControlPlaneEndpointInfo);
        this.setParamSimple(map, prefix + "PublicTlsAccessEndpoint", this.PublicTlsAccessEndpoint);
        this.setParamSimple(map, prefix + "PublicIpReused", this.PublicIpReused);
        this.setParamSimple(map, prefix + "PublicWebConsoleErrorMessage", this.PublicWebConsoleErrorMessage);
        this.setParamSimple(map, prefix + "VpcWebConsoleErrorMessage", this.VpcWebConsoleErrorMessage);
        this.setParamSimple(map, prefix + "PublicDataStreamErrorMessage", this.PublicDataStreamErrorMessage);
        this.setParamSimple(map, prefix + "PublicStreamAccessEndpoint", this.PublicStreamAccessEndpoint);

    }
}

