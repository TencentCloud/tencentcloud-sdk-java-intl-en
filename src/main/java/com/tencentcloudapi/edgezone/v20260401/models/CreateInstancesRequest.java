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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * <p>Availability zone code, such as ap-guangzhou-1.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Model specifications, such as BMS5.MEDIUM8.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Private network instance ID in the format of net-xxx.</p>
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * <p>Public network instance ID, in the format of net-xxx.</p>
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Image ID, for example img-centos-7.9.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Specify the quantity. Default is 1. Maximum is 50.</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>Login password. Either it or SSHKey is required.</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Public key string of the SSH key. Either this parameter or Password must be specified.</p>
    */
    @SerializedName("SSHKey")
    @Expose
    private String SSHKey;

    /**
    * <p>Image version number. Only public images have the concept of version.</p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * <p>Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.</p>
    */
    @SerializedName("EnableIpv6")
    @Expose
    private Boolean EnableIpv6;

    /**
     * Get <p>Availability zone code, such as ap-guangzhou-1.</p> 
     * @return Zone <p>Availability zone code, such as ap-guangzhou-1.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone code, such as ap-guangzhou-1.</p>
     * @param Zone <p>Availability zone code, such as ap-guangzhou-1.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Model specifications, such as BMS5.MEDIUM8.</p> 
     * @return InstanceType <p>Model specifications, such as BMS5.MEDIUM8.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Model specifications, such as BMS5.MEDIUM8.</p>
     * @param InstanceType <p>Model specifications, such as BMS5.MEDIUM8.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Private network instance ID in the format of net-xxx.</p> 
     * @return PrivateNetworkId <p>Private network instance ID in the format of net-xxx.</p>
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set <p>Private network instance ID in the format of net-xxx.</p>
     * @param PrivateNetworkId <p>Private network instance ID in the format of net-xxx.</p>
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get <p>Public network instance ID, in the format of net-xxx.</p> 
     * @return PublicNetworkId <p>Public network instance ID, in the format of net-xxx.</p>
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set <p>Public network instance ID, in the format of net-xxx.</p>
     * @param PublicNetworkId <p>Public network instance ID, in the format of net-xxx.</p>
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Image ID, for example img-centos-7.9.</p> 
     * @return ImageId <p>Image ID, for example img-centos-7.9.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID, for example img-centos-7.9.</p>
     * @param ImageId <p>Image ID, for example img-centos-7.9.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Specify the quantity. Default is 1. Maximum is 50.</p> 
     * @return InstanceCount <p>Specify the quantity. Default is 1. Maximum is 50.</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>Specify the quantity. Default is 1. Maximum is 50.</p>
     * @param InstanceCount <p>Specify the quantity. Default is 1. Maximum is 50.</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>Login password. Either it or SSHKey is required.</p> 
     * @return Password <p>Login password. Either it or SSHKey is required.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Login password. Either it or SSHKey is required.</p>
     * @param Password <p>Login password. Either it or SSHKey is required.</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Public key string of the SSH key. Either this parameter or Password must be specified.</p> 
     * @return SSHKey <p>Public key string of the SSH key. Either this parameter or Password must be specified.</p>
     */
    public String getSSHKey() {
        return this.SSHKey;
    }

    /**
     * Set <p>Public key string of the SSH key. Either this parameter or Password must be specified.</p>
     * @param SSHKey <p>Public key string of the SSH key. Either this parameter or Password must be specified.</p>
     */
    public void setSSHKey(String SSHKey) {
        this.SSHKey = SSHKey;
    }

    /**
     * Get <p>Image version number. Only public images have the concept of version.</p> 
     * @return VersionNumber <p>Image version number. Only public images have the concept of version.</p>
     * @deprecated
     */
    @Deprecated
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>Image version number. Only public images have the concept of version.</p>
     * @param VersionNumber <p>Image version number. Only public images have the concept of version.</p>
     * @deprecated
     */
    @Deprecated
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.</p> 
     * @return EnableIpv6 <p>Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableIpv6() {
        return this.EnableIpv6;
    }

    /**
     * Set <p>Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.</p>
     * @param EnableIpv6 <p>Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.</p>
     * @deprecated
     */
    @Deprecated
    public void setEnableIpv6(Boolean EnableIpv6) {
        this.EnableIpv6 = EnableIpv6;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SSHKey != null) {
            this.SSHKey = new String(source.SSHKey);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.EnableIpv6 != null) {
            this.EnableIpv6 = new Boolean(source.EnableIpv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SSHKey", this.SSHKey);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "EnableIpv6", this.EnableIpv6);

    }
}

