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

public class Instance extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Bound Physical Machine ID
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * Model specifications
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Availability zone code
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image version number
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * Instance status, value range: allocating, running, isolating, isolated, terminating, error.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Operation status: normal, starting, stopping, stopped, rebooting.
    */
    @SerializedName("OperateStatus")
    @Expose
    private String OperateStatus;

    /**
    * VPC ID
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * private IPv4 address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * private IPv6 address
    */
    @SerializedName("PrivateIpV6")
    @Expose
    private String PrivateIpV6;

    /**
    * Public network ID
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * Public IPv4 address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Public IPv6 address
    */
    @SerializedName("PublicIpV6")
    @Expose
    private String PublicIpV6;

    /**
    * Creation time, expressed according to the ISO8601 standard and using the UTC time. The format is YYYY-MM-DDThh:mm:ssZ.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Bound Physical Machine ID 
     * @return MachineId Bound Physical Machine ID
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set Bound Physical Machine ID
     * @param MachineId Bound Physical Machine ID
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get Model specifications 
     * @return InstanceType Model specifications
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model specifications
     * @param InstanceType Model specifications
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Availability zone code 
     * @return Zone Availability zone code
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone code
     * @param Zone Availability zone code
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image version number 
     * @return VersionNumber Image version number
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set Image version number
     * @param VersionNumber Image version number
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get Instance status, value range: allocating, running, isolating, isolated, terminating, error. 
     * @return InstanceStatus Instance status, value range: allocating, running, isolating, isolated, terminating, error.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status, value range: allocating, running, isolating, isolated, terminating, error.
     * @param InstanceStatus Instance status, value range: allocating, running, isolating, isolated, terminating, error.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Operation status: normal, starting, stopping, stopped, rebooting. 
     * @return OperateStatus Operation status: normal, starting, stopping, stopped, rebooting.
     */
    public String getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * Set Operation status: normal, starting, stopping, stopped, rebooting.
     * @param OperateStatus Operation status: normal, starting, stopping, stopped, rebooting.
     */
    public void setOperateStatus(String OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * Get VPC ID 
     * @return PrivateNetworkId VPC ID
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set VPC ID
     * @param PrivateNetworkId VPC ID
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get private IPv4 address 
     * @return PrivateIp private IPv4 address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set private IPv4 address
     * @param PrivateIp private IPv4 address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get private IPv6 address 
     * @return PrivateIpV6 private IPv6 address
     */
    public String getPrivateIpV6() {
        return this.PrivateIpV6;
    }

    /**
     * Set private IPv6 address
     * @param PrivateIpV6 private IPv6 address
     */
    public void setPrivateIpV6(String PrivateIpV6) {
        this.PrivateIpV6 = PrivateIpV6;
    }

    /**
     * Get Public network ID 
     * @return PublicNetworkId Public network ID
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set Public network ID
     * @param PublicNetworkId Public network ID
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get Public IPv4 address 
     * @return PublicIp Public IPv4 address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IPv4 address
     * @param PublicIp Public IPv4 address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Public IPv6 address 
     * @return PublicIpV6 Public IPv6 address
     */
    public String getPublicIpV6() {
        return this.PublicIpV6;
    }

    /**
     * Set Public IPv6 address
     * @param PublicIpV6 Public IPv6 address
     */
    public void setPublicIpV6(String PublicIpV6) {
        this.PublicIpV6 = PublicIpV6;
    }

    /**
     * Get Creation time, expressed according to the ISO8601 standard and using the UTC time. The format is YYYY-MM-DDThh:mm:ssZ. 
     * @return CreatedTime Creation time, expressed according to the ISO8601 standard and using the UTC time. The format is YYYY-MM-DDThh:mm:ssZ.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time, expressed according to the ISO8601 standard and using the UTC time. The format is YYYY-MM-DDThh:mm:ssZ.
     * @param CreatedTime Creation time, expressed according to the ISO8601 standard and using the UTC time. The format is YYYY-MM-DDThh:mm:ssZ.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.OperateStatus != null) {
            this.OperateStatus = new String(source.OperateStatus);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PrivateIpV6 != null) {
            this.PrivateIpV6 = new String(source.PrivateIpV6);
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PublicIpV6 != null) {
            this.PublicIpV6 = new String(source.PublicIpV6);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "OperateStatus", this.OperateStatus);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PrivateIpV6", this.PrivateIpV6);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PublicIpV6", this.PublicIpV6);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

