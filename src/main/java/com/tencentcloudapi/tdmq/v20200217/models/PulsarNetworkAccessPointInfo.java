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

public class PulsarNetworkAccessPointInfo extends AbstractModel {

    /**
    * VPC ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Access address
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Access point type: 
`0`: Supporting network access point 
`1`: VPC access point 
`2`: Public network access point
    */
    @SerializedName("RouteType")
    @Expose
    private Long RouteType;

    /**
    * 0: local region access. since cross-region disaster recovery is not configured, this type of access point cannot perform cross-region switchover or switch back from remote access.
Local region access. due to the configuration of cross-region disaster recovery, switchover can be performed at any time in a different location. this state is used for the primary cluster access point.
Cross-Region access, completed offsite switchover, this state is used for the access point of the source cluster. the access point in this state is non-deletable.
3: cross-region access can be switched back from remote access at any time. this state is for the access point of the target cluster. the access point in this state is non-deletable.
Cross-Region access. the target cluster has completed offsite switchback and is in the state of waiting for deletion.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * Access point type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessPointsType")
    @Expose
    private String AccessPointsType;

    /**
    * Bandwidth. currently only public network has this value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Class.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy [] SecurityPolicy;

    /**
    * Indicates whether it is a standard access point. valid values: true (standard), false (not standard).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StandardAccessPoint")
    @Expose
    private Boolean StandardAccessPoint;

    /**
    * AZ information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Specifies whether TLS encryption is enabled.
    */
    @SerializedName("Tls")
    @Expose
    private Boolean Tls;

    /**
    * Access point custom domain name.
    */
    @SerializedName("CustomUrl")
    @Expose
    private String CustomUrl;

    /**
     * Get VPC ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID. This field is left empty for supporting network and public network access points.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Access address 
     * @return Endpoint Access address
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set Access address
     * @param Endpoint Access address
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Access point type: 
`0`: Supporting network access point 
`1`: VPC access point 
`2`: Public network access point 
     * @return RouteType Access point type: 
`0`: Supporting network access point 
`1`: VPC access point 
`2`: Public network access point
     */
    public Long getRouteType() {
        return this.RouteType;
    }

    /**
     * Set Access point type: 
`0`: Supporting network access point 
`1`: VPC access point 
`2`: Public network access point
     * @param RouteType Access point type: 
`0`: Supporting network access point 
`1`: VPC access point 
`2`: Public network access point
     */
    public void setRouteType(Long RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get 0: local region access. since cross-region disaster recovery is not configured, this type of access point cannot perform cross-region switchover or switch back from remote access.
Local region access. due to the configuration of cross-region disaster recovery, switchover can be performed at any time in a different location. this state is used for the primary cluster access point.
Cross-Region access, completed offsite switchover, this state is used for the access point of the source cluster. the access point in this state is non-deletable.
3: cross-region access can be switched back from remote access at any time. this state is for the access point of the target cluster. the access point in this state is non-deletable.
Cross-Region access. the target cluster has completed offsite switchback and is in the state of waiting for deletion.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperationType 0: local region access. since cross-region disaster recovery is not configured, this type of access point cannot perform cross-region switchover or switch back from remote access.
Local region access. due to the configuration of cross-region disaster recovery, switchover can be performed at any time in a different location. this state is used for the primary cluster access point.
Cross-Region access, completed offsite switchover, this state is used for the access point of the source cluster. the access point in this state is non-deletable.
3: cross-region access can be switched back from remote access at any time. this state is for the access point of the target cluster. the access point in this state is non-deletable.
Cross-Region access. the target cluster has completed offsite switchback and is in the state of waiting for deletion.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 0: local region access. since cross-region disaster recovery is not configured, this type of access point cannot perform cross-region switchover or switch back from remote access.
Local region access. due to the configuration of cross-region disaster recovery, switchover can be performed at any time in a different location. this state is used for the primary cluster access point.
Cross-Region access, completed offsite switchover, this state is used for the access point of the source cluster. the access point in this state is non-deletable.
3: cross-region access can be switched back from remote access at any time. this state is for the access point of the target cluster. the access point in this state is non-deletable.
Cross-Region access. the target cluster has completed offsite switchback and is in the state of waiting for deletion.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperationType 0: local region access. since cross-region disaster recovery is not configured, this type of access point cannot perform cross-region switchover or switch back from remote access.
Local region access. due to the configuration of cross-region disaster recovery, switchover can be performed at any time in a different location. this state is used for the primary cluster access point.
Cross-Region access, completed offsite switchover, this state is used for the access point of the source cluster. the access point in this state is non-deletable.
3: cross-region access can be switched back from remote access at any time. this state is for the access point of the target cluster. the access point in this state is non-deletable.
Cross-Region access. the target cluster has completed offsite switchback and is in the state of waiting for deletion.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Access point type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessPointsType Access point type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessPointsType() {
        return this.AccessPointsType;
    }

    /**
     * Set Access point type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessPointsType Access point type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessPointsType(String AccessPointsType) {
        this.AccessPointsType = AccessPointsType;
    }

    /**
     * Get Bandwidth. currently only public network has this value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bandwidth Bandwidth. currently only public network has this value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth. currently only public network has this value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bandwidth Bandwidth. currently only public network has this value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Class.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityPolicy Class.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecurityPolicy [] getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Class.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityPolicy Class.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityPolicy(SecurityPolicy [] SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get Indicates whether it is a standard access point. valid values: true (standard), false (not standard).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StandardAccessPoint Indicates whether it is a standard access point. valid values: true (standard), false (not standard).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getStandardAccessPoint() {
        return this.StandardAccessPoint;
    }

    /**
     * Set Indicates whether it is a standard access point. valid values: true (standard), false (not standard).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StandardAccessPoint Indicates whether it is a standard access point. valid values: true (standard), false (not standard).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStandardAccessPoint(Boolean StandardAccessPoint) {
        this.StandardAccessPoint = StandardAccessPoint;
    }

    /**
     * Get AZ information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneName AZ information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneName AZ information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Specifies whether TLS encryption is enabled. 
     * @return Tls Specifies whether TLS encryption is enabled.
     */
    public Boolean getTls() {
        return this.Tls;
    }

    /**
     * Set Specifies whether TLS encryption is enabled.
     * @param Tls Specifies whether TLS encryption is enabled.
     */
    public void setTls(Boolean Tls) {
        this.Tls = Tls;
    }

    /**
     * Get Access point custom domain name. 
     * @return CustomUrl Access point custom domain name.
     */
    public String getCustomUrl() {
        return this.CustomUrl;
    }

    /**
     * Set Access point custom domain name.
     * @param CustomUrl Access point custom domain name.
     */
    public void setCustomUrl(String CustomUrl) {
        this.CustomUrl = CustomUrl;
    }

    public PulsarNetworkAccessPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarNetworkAccessPointInfo(PulsarNetworkAccessPointInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteType != null) {
            this.RouteType = new Long(source.RouteType);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.AccessPointsType != null) {
            this.AccessPointsType = new String(source.AccessPointsType);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.SecurityPolicy != null) {
            this.SecurityPolicy = new SecurityPolicy[source.SecurityPolicy.length];
            for (int i = 0; i < source.SecurityPolicy.length; i++) {
                this.SecurityPolicy[i] = new SecurityPolicy(source.SecurityPolicy[i]);
            }
        }
        if (source.StandardAccessPoint != null) {
            this.StandardAccessPoint = new Boolean(source.StandardAccessPoint);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Tls != null) {
            this.Tls = new Boolean(source.Tls);
        }
        if (source.CustomUrl != null) {
            this.CustomUrl = new String(source.CustomUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "AccessPointsType", this.AccessPointsType);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);
        this.setParamSimple(map, prefix + "StandardAccessPoint", this.StandardAccessPoint);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Tls", this.Tls);
        this.setParamSimple(map, prefix + "CustomUrl", this.CustomUrl);

    }
}

