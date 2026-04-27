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
    * Availability zone code, such as ap-guangzhou-1.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Model specifications, such as BMS5.MEDIUM8.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Private network instance ID in the format of net-xxx.
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * Public network instance ID, in the format of net-xxx.
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * Image ID, for example img-centos-7.9.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Specify the quantity. Default is 1. Maximum is 50.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Image version number. Only public images have the concept of version.
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.
    */
    @SerializedName("EnableIpv6")
    @Expose
    private Boolean EnableIpv6;

    /**
     * Get Availability zone code, such as ap-guangzhou-1. 
     * @return Zone Availability zone code, such as ap-guangzhou-1.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone code, such as ap-guangzhou-1.
     * @param Zone Availability zone code, such as ap-guangzhou-1.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Model specifications, such as BMS5.MEDIUM8. 
     * @return InstanceType Model specifications, such as BMS5.MEDIUM8.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model specifications, such as BMS5.MEDIUM8.
     * @param InstanceType Model specifications, such as BMS5.MEDIUM8.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Private network instance ID in the format of net-xxx. 
     * @return PrivateNetworkId Private network instance ID in the format of net-xxx.
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set Private network instance ID in the format of net-xxx.
     * @param PrivateNetworkId Private network instance ID in the format of net-xxx.
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get Public network instance ID, in the format of net-xxx. 
     * @return PublicNetworkId Public network instance ID, in the format of net-xxx.
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set Public network instance ID, in the format of net-xxx.
     * @param PublicNetworkId Public network instance ID, in the format of net-xxx.
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get Image ID, for example img-centos-7.9. 
     * @return ImageId Image ID, for example img-centos-7.9.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID, for example img-centos-7.9.
     * @param ImageId Image ID, for example img-centos-7.9.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Specify the quantity. Default is 1. Maximum is 50. 
     * @return InstanceCount Specify the quantity. Default is 1. Maximum is 50.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Specify the quantity. Default is 1. Maximum is 50.
     * @param InstanceCount Specify the quantity. Default is 1. Maximum is 50.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Image version number. Only public images have the concept of version. 
     * @return VersionNumber Image version number. Only public images have the concept of version.
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set Image version number. Only public images have the concept of version.
     * @param VersionNumber Image version number. Only public images have the concept of version.
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address. 
     * @return EnableIpv6 Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.
     */
    public Boolean getEnableIpv6() {
        return this.EnableIpv6;
    }

    /**
     * Set Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.
     * @param EnableIpv6 Whether to enable public IPv6, default false. Enabled, the system will allocate an additional IPv6 address after assigning an IPv4 address.
     */
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
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
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
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "EnableIpv6", this.EnableIpv6);

    }
}

