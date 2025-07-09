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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateECMInstancesRequest extends AbstractModel {

    /**
    * Cluster ID. Edge clusters need to enable public network access before adding ECM nodes.
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Edge module ID
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Instance AZ, number of instances and ISP
    */
    @SerializedName("ZoneInstanceCountISPSet")
    @Expose
    private ECMZoneInstanceCountISP [] ZoneInstanceCountISPSet;

    /**
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Public network bandwidth
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Enhanced service (including CWP and Cloud Monitoring)
    */
    @SerializedName("EnhancedService")
    @Expose
    private ECMEnhancedService EnhancedService;

    /**
    * Custom script
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Instance extension information
    */
    @SerializedName("External")
    @Expose
    private String External;

    /**
    * Security group of the instance
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Cluster ID. Edge clusters need to enable public network access before adding ECM nodes. 
     * @return ClusterID Cluster ID. Edge clusters need to enable public network access before adding ECM nodes.
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID. Edge clusters need to enable public network access before adding ECM nodes.
     * @param ClusterID Cluster ID. Edge clusters need to enable public network access before adding ECM nodes.
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Edge module ID 
     * @return ModuleId Edge module ID
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Edge module ID
     * @param ModuleId Edge module ID
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Instance AZ, number of instances and ISP 
     * @return ZoneInstanceCountISPSet Instance AZ, number of instances and ISP
     */
    public ECMZoneInstanceCountISP [] getZoneInstanceCountISPSet() {
        return this.ZoneInstanceCountISPSet;
    }

    /**
     * Set Instance AZ, number of instances and ISP
     * @param ZoneInstanceCountISPSet Instance AZ, number of instances and ISP
     */
    public void setZoneInstanceCountISPSet(ECMZoneInstanceCountISP [] ZoneInstanceCountISPSet) {
        this.ZoneInstanceCountISPSet = ZoneInstanceCountISPSet;
    }

    /**
     * Get Password 
     * @return Password Password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
     * @param Password Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Public network bandwidth 
     * @return InternetMaxBandwidthOut Public network bandwidth
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network bandwidth
     * @param InternetMaxBandwidthOut Public network bandwidth
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
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
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Enhanced service (including CWP and Cloud Monitoring) 
     * @return EnhancedService Enhanced service (including CWP and Cloud Monitoring)
     */
    public ECMEnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced service (including CWP and Cloud Monitoring)
     * @param EnhancedService Enhanced service (including CWP and Cloud Monitoring)
     */
    public void setEnhancedService(ECMEnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Custom script 
     * @return UserData Custom script
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set Custom script
     * @param UserData Custom script
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Instance extension information 
     * @return External Instance extension information
     */
    public String getExternal() {
        return this.External;
    }

    /**
     * Set Instance extension information
     * @param External Instance extension information
     */
    public void setExternal(String External) {
        this.External = External;
    }

    /**
     * Get Security group of the instance 
     * @return SecurityGroupIds Security group of the instance
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group of the instance
     * @param SecurityGroupIds Security group of the instance
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateECMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateECMInstancesRequest(CreateECMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ZoneInstanceCountISPSet != null) {
            this.ZoneInstanceCountISPSet = new ECMZoneInstanceCountISP[source.ZoneInstanceCountISPSet.length];
            for (int i = 0; i < source.ZoneInstanceCountISPSet.length; i++) {
                this.ZoneInstanceCountISPSet[i] = new ECMZoneInstanceCountISP(source.ZoneInstanceCountISPSet[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new ECMEnhancedService(source.EnhancedService);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.External != null) {
            this.External = new String(source.External);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamArrayObj(map, prefix + "ZoneInstanceCountISPSet.", this.ZoneInstanceCountISPSet);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "External", this.External);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

