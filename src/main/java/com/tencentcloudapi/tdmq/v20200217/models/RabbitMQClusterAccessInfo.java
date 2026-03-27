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
    * Cluster Public Network Access Address
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * Cluster Console Access Address
    */
    @SerializedName("WebConsoleEndpoint")
    @Expose
    private String WebConsoleEndpoint;

    /**
    * Cluster Console Login Username
    */
    @SerializedName("WebConsoleUsername")
    @Expose
    private String WebConsoleUsername;

    /**
    * Cluster Console Login Password
    */
    @SerializedName("WebConsolePassword")
    @Expose
    private String WebConsolePassword;

    /**
    * Deprecated
    */
    @SerializedName("PublicAccessEndpointStatus")
    @Expose
    private Boolean PublicAccessEndpointStatus;

    /**
    * Deprecated
    */
    @SerializedName("PublicControlConsoleSwitchStatus")
    @Expose
    private Boolean PublicControlConsoleSwitchStatus;

    /**
    * Deprecated
    */
    @SerializedName("VpcControlConsoleSwitchStatus")
    @Expose
    private Boolean VpcControlConsoleSwitchStatus;

    /**
    * Vpc management console access address, example value: http://1.1.1.1:15672
    */
    @SerializedName("VpcWebConsoleEndpoint")
    @Expose
    private String VpcWebConsoleEndpoint;

    /**
    * Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
    */
    @SerializedName("PublicWebConsoleSwitchStatus")
    @Expose
    private String PublicWebConsoleSwitchStatus;

    /**
    * Vpc console switch state. example value.
OFF/ON/CREATING/DELETING
    */
    @SerializedName("VpcWebConsoleSwitchStatus")
    @Expose
    private String VpcWebConsoleSwitchStatus;

    /**
    * Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
    */
    @SerializedName("PublicDataStreamStatus")
    @Expose
    private String PublicDataStreamStatus;

    /**
    * Prometheus information.
    */
    @SerializedName("PrometheusEndpointInfo")
    @Expose
    private PrometheusEndpointInfo PrometheusEndpointInfo;

    /**
    * Public domain name access point.
    */
    @SerializedName("WebConsoleDomainEndpoint")
    @Expose
    private String WebConsoleDomainEndpoint;

    /**
    * VPC information used by the control plane.
    */
    @SerializedName("ControlPlaneEndpointInfo")
    @Expose
    private VpcEndpointInfo ControlPlaneEndpointInfo;

    /**
    * Encrypted TLS data stream public network access point.
    */
    @SerializedName("PublicTlsAccessEndpoint")
    @Expose
    private String PublicTlsAccessEndpoint;

    /**
    * Specifies whether to reuse the public IP address.
    */
    @SerializedName("PublicIpReused")
    @Expose
    private Boolean PublicIpReused;

    /**
     * Get Cluster Public Network Access Address 
     * @return PublicAccessEndpoint Cluster Public Network Access Address
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set Cluster Public Network Access Address
     * @param PublicAccessEndpoint Cluster Public Network Access Address
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get Cluster Console Access Address 
     * @return WebConsoleEndpoint Cluster Console Access Address
     */
    public String getWebConsoleEndpoint() {
        return this.WebConsoleEndpoint;
    }

    /**
     * Set Cluster Console Access Address
     * @param WebConsoleEndpoint Cluster Console Access Address
     */
    public void setWebConsoleEndpoint(String WebConsoleEndpoint) {
        this.WebConsoleEndpoint = WebConsoleEndpoint;
    }

    /**
     * Get Cluster Console Login Username 
     * @return WebConsoleUsername Cluster Console Login Username
     */
    public String getWebConsoleUsername() {
        return this.WebConsoleUsername;
    }

    /**
     * Set Cluster Console Login Username
     * @param WebConsoleUsername Cluster Console Login Username
     */
    public void setWebConsoleUsername(String WebConsoleUsername) {
        this.WebConsoleUsername = WebConsoleUsername;
    }

    /**
     * Get Cluster Console Login Password 
     * @return WebConsolePassword Cluster Console Login Password
     */
    public String getWebConsolePassword() {
        return this.WebConsolePassword;
    }

    /**
     * Set Cluster Console Login Password
     * @param WebConsolePassword Cluster Console Login Password
     */
    public void setWebConsolePassword(String WebConsolePassword) {
        this.WebConsolePassword = WebConsolePassword;
    }

    /**
     * Get Deprecated 
     * @return PublicAccessEndpointStatus Deprecated
     */
    public Boolean getPublicAccessEndpointStatus() {
        return this.PublicAccessEndpointStatus;
    }

    /**
     * Set Deprecated
     * @param PublicAccessEndpointStatus Deprecated
     */
    public void setPublicAccessEndpointStatus(Boolean PublicAccessEndpointStatus) {
        this.PublicAccessEndpointStatus = PublicAccessEndpointStatus;
    }

    /**
     * Get Deprecated 
     * @return PublicControlConsoleSwitchStatus Deprecated
     */
    public Boolean getPublicControlConsoleSwitchStatus() {
        return this.PublicControlConsoleSwitchStatus;
    }

    /**
     * Set Deprecated
     * @param PublicControlConsoleSwitchStatus Deprecated
     */
    public void setPublicControlConsoleSwitchStatus(Boolean PublicControlConsoleSwitchStatus) {
        this.PublicControlConsoleSwitchStatus = PublicControlConsoleSwitchStatus;
    }

    /**
     * Get Deprecated 
     * @return VpcControlConsoleSwitchStatus Deprecated
     */
    public Boolean getVpcControlConsoleSwitchStatus() {
        return this.VpcControlConsoleSwitchStatus;
    }

    /**
     * Set Deprecated
     * @param VpcControlConsoleSwitchStatus Deprecated
     */
    public void setVpcControlConsoleSwitchStatus(Boolean VpcControlConsoleSwitchStatus) {
        this.VpcControlConsoleSwitchStatus = VpcControlConsoleSwitchStatus;
    }

    /**
     * Get Vpc management console access address, example value: http://1.1.1.1:15672 
     * @return VpcWebConsoleEndpoint Vpc management console access address, example value: http://1.1.1.1:15672
     */
    public String getVpcWebConsoleEndpoint() {
        return this.VpcWebConsoleEndpoint;
    }

    /**
     * Set Vpc management console access address, example value: http://1.1.1.1:15672
     * @param VpcWebConsoleEndpoint Vpc management console access address, example value: http://1.1.1.1:15672
     */
    public void setVpcWebConsoleEndpoint(String VpcWebConsoleEndpoint) {
        this.VpcWebConsoleEndpoint = VpcWebConsoleEndpoint;
    }

    /**
     * Get Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING. 
     * @return PublicWebConsoleSwitchStatus Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
     */
    public String getPublicWebConsoleSwitchStatus() {
        return this.PublicWebConsoleSwitchStatus;
    }

    /**
     * Set Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
     * @param PublicWebConsoleSwitchStatus Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
     */
    public void setPublicWebConsoleSwitchStatus(String PublicWebConsoleSwitchStatus) {
        this.PublicWebConsoleSwitchStatus = PublicWebConsoleSwitchStatus;
    }

    /**
     * Get Vpc console switch state. example value.
OFF/ON/CREATING/DELETING 
     * @return VpcWebConsoleSwitchStatus Vpc console switch state. example value.
OFF/ON/CREATING/DELETING
     */
    public String getVpcWebConsoleSwitchStatus() {
        return this.VpcWebConsoleSwitchStatus;
    }

    /**
     * Set Vpc console switch state. example value.
OFF/ON/CREATING/DELETING
     * @param VpcWebConsoleSwitchStatus Vpc console switch state. example value.
OFF/ON/CREATING/DELETING
     */
    public void setVpcWebConsoleSwitchStatus(String VpcWebConsoleSwitchStatus) {
        this.VpcWebConsoleSwitchStatus = VpcWebConsoleSwitchStatus;
    }

    /**
     * Get Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING. 
     * @return PublicDataStreamStatus Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
     */
    public String getPublicDataStreamStatus() {
        return this.PublicDataStreamStatus;
    }

    /**
     * Set Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
     * @param PublicDataStreamStatus Status of the public network access point in the console. Valid values: OFF, ON, CREATING, and DELETING.
     */
    public void setPublicDataStreamStatus(String PublicDataStreamStatus) {
        this.PublicDataStreamStatus = PublicDataStreamStatus;
    }

    /**
     * Get Prometheus information. 
     * @return PrometheusEndpointInfo Prometheus information.
     */
    public PrometheusEndpointInfo getPrometheusEndpointInfo() {
        return this.PrometheusEndpointInfo;
    }

    /**
     * Set Prometheus information.
     * @param PrometheusEndpointInfo Prometheus information.
     */
    public void setPrometheusEndpointInfo(PrometheusEndpointInfo PrometheusEndpointInfo) {
        this.PrometheusEndpointInfo = PrometheusEndpointInfo;
    }

    /**
     * Get Public domain name access point. 
     * @return WebConsoleDomainEndpoint Public domain name access point.
     */
    public String getWebConsoleDomainEndpoint() {
        return this.WebConsoleDomainEndpoint;
    }

    /**
     * Set Public domain name access point.
     * @param WebConsoleDomainEndpoint Public domain name access point.
     */
    public void setWebConsoleDomainEndpoint(String WebConsoleDomainEndpoint) {
        this.WebConsoleDomainEndpoint = WebConsoleDomainEndpoint;
    }

    /**
     * Get VPC information used by the control plane. 
     * @return ControlPlaneEndpointInfo VPC information used by the control plane.
     */
    public VpcEndpointInfo getControlPlaneEndpointInfo() {
        return this.ControlPlaneEndpointInfo;
    }

    /**
     * Set VPC information used by the control plane.
     * @param ControlPlaneEndpointInfo VPC information used by the control plane.
     */
    public void setControlPlaneEndpointInfo(VpcEndpointInfo ControlPlaneEndpointInfo) {
        this.ControlPlaneEndpointInfo = ControlPlaneEndpointInfo;
    }

    /**
     * Get Encrypted TLS data stream public network access point. 
     * @return PublicTlsAccessEndpoint Encrypted TLS data stream public network access point.
     */
    public String getPublicTlsAccessEndpoint() {
        return this.PublicTlsAccessEndpoint;
    }

    /**
     * Set Encrypted TLS data stream public network access point.
     * @param PublicTlsAccessEndpoint Encrypted TLS data stream public network access point.
     */
    public void setPublicTlsAccessEndpoint(String PublicTlsAccessEndpoint) {
        this.PublicTlsAccessEndpoint = PublicTlsAccessEndpoint;
    }

    /**
     * Get Specifies whether to reuse the public IP address. 
     * @return PublicIpReused Specifies whether to reuse the public IP address.
     */
    public Boolean getPublicIpReused() {
        return this.PublicIpReused;
    }

    /**
     * Set Specifies whether to reuse the public IP address.
     * @param PublicIpReused Specifies whether to reuse the public IP address.
     */
    public void setPublicIpReused(Boolean PublicIpReused) {
        this.PublicIpReused = PublicIpReused;
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

    }
}

