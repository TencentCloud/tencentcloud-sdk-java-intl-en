/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvData extends AbstractModel {

    /**
    * CVM instance type. It cannot be specified together with `InstanceTypes` or `InstanceTypeOptions`.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * CVM image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * System disk configuration of the instance
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Data disk configuration of the instance
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Information of the VPC configuration. It cannot be specified together with `Zones` and `VirtualPrivateClouds`.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * Public network bandwidth configuration
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * CVM instance display name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance login settings
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Security groups associated with the instance
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Whether to activate CWPP agent and Cloud Monitor. CWPP agent and Cloud Monitor are activated by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * CVM instance billing method <br><li>`POSTPAID_BY_HOUR` (default): Hourly-billed pay-as-you-go <br><li>`SPOTPAID`: Spot instance <br>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Market-related options for instances, such as parameters related to spot instances.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * Types of CVM instances to create (up to 10). The system creates compute nodes of types specified in this list from top to down till the creation is successful. It cannot be specified together with `InstanceType` or `InstanceTypeOptions`. 
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * CVM instance model configuration. It cannot be specified together with `InstanceType` or `InstanceTypes`.
    */
    @SerializedName("InstanceTypeOptions")
    @Expose
    private InstanceTypeOptions InstanceTypeOptions;

    /**
    * List of availability zones. You can create CVM cross AZs in the same region. It cannot be specified together with `VirtualPrivateCloud` or `VirtualPrivateClouds`.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * List of VPCs (creation of CVM instances across VPCs is supported). It cannot be specified together with `VirtualPrivateCloud` or `Zones`.
    */
    @SerializedName("VirtualPrivateClouds")
    @Expose
    private VirtualPrivateCloud [] VirtualPrivateClouds;

    /**
     * Get CVM instance type. It cannot be specified together with `InstanceTypes` or `InstanceTypeOptions`. 
     * @return InstanceType CVM instance type. It cannot be specified together with `InstanceTypes` or `InstanceTypeOptions`.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set CVM instance type. It cannot be specified together with `InstanceTypes` or `InstanceTypeOptions`.
     * @param InstanceType CVM instance type. It cannot be specified together with `InstanceTypes` or `InstanceTypeOptions`.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get CVM image ID 
     * @return ImageId CVM image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set CVM image ID
     * @param ImageId CVM image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get System disk configuration of the instance 
     * @return SystemDisk System disk configuration of the instance
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk configuration of the instance
     * @param SystemDisk System disk configuration of the instance
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk configuration of the instance 
     * @return DataDisks Data disk configuration of the instance
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk configuration of the instance
     * @param DataDisks Data disk configuration of the instance
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Information of the VPC configuration. It cannot be specified together with `Zones` and `VirtualPrivateClouds`. 
     * @return VirtualPrivateCloud Information of the VPC configuration. It cannot be specified together with `Zones` and `VirtualPrivateClouds`.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set Information of the VPC configuration. It cannot be specified together with `Zones` and `VirtualPrivateClouds`.
     * @param VirtualPrivateCloud Information of the VPC configuration. It cannot be specified together with `Zones` and `VirtualPrivateClouds`.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get Public network bandwidth configuration 
     * @return InternetAccessible Public network bandwidth configuration
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public network bandwidth configuration
     * @param InternetAccessible Public network bandwidth configuration
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get CVM instance display name 
     * @return InstanceName CVM instance display name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CVM instance display name
     * @param InstanceName CVM instance display name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance login settings 
     * @return LoginSettings Instance login settings
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Instance login settings
     * @param LoginSettings Instance login settings
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Security groups associated with the instance 
     * @return SecurityGroupIds Security groups associated with the instance
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security groups associated with the instance
     * @param SecurityGroupIds Security groups associated with the instance
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Whether to activate CWPP agent and Cloud Monitor. CWPP agent and Cloud Monitor are activated by default. 
     * @return EnhancedService Whether to activate CWPP agent and Cloud Monitor. CWPP agent and Cloud Monitor are activated by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Whether to activate CWPP agent and Cloud Monitor. CWPP agent and Cloud Monitor are activated by default.
     * @param EnhancedService Whether to activate CWPP agent and Cloud Monitor. CWPP agent and Cloud Monitor are activated by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get CVM instance billing method <br><li>`POSTPAID_BY_HOUR` (default): Hourly-billed pay-as-you-go <br><li>`SPOTPAID`: Spot instance <br> 
     * @return InstanceChargeType CVM instance billing method <br><li>`POSTPAID_BY_HOUR` (default): Hourly-billed pay-as-you-go <br><li>`SPOTPAID`: Spot instance <br>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set CVM instance billing method <br><li>`POSTPAID_BY_HOUR` (default): Hourly-billed pay-as-you-go <br><li>`SPOTPAID`: Spot instance <br>
     * @param InstanceChargeType CVM instance billing method <br><li>`POSTPAID_BY_HOUR` (default): Hourly-billed pay-as-you-go <br><li>`SPOTPAID`: Spot instance <br>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Market-related options for instances, such as parameters related to spot instances. 
     * @return InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set Market-related options for instances, such as parameters related to spot instances.
     * @param InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get Types of CVM instances to create (up to 10). The system creates compute nodes of types specified in this list from top to down till the creation is successful. It cannot be specified together with `InstanceType` or `InstanceTypeOptions`.  
     * @return InstanceTypes Types of CVM instances to create (up to 10). The system creates compute nodes of types specified in this list from top to down till the creation is successful. It cannot be specified together with `InstanceType` or `InstanceTypeOptions`. 
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set Types of CVM instances to create (up to 10). The system creates compute nodes of types specified in this list from top to down till the creation is successful. It cannot be specified together with `InstanceType` or `InstanceTypeOptions`. 
     * @param InstanceTypes Types of CVM instances to create (up to 10). The system creates compute nodes of types specified in this list from top to down till the creation is successful. It cannot be specified together with `InstanceType` or `InstanceTypeOptions`. 
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get CVM instance model configuration. It cannot be specified together with `InstanceType` or `InstanceTypes`. 
     * @return InstanceTypeOptions CVM instance model configuration. It cannot be specified together with `InstanceType` or `InstanceTypes`.
     */
    public InstanceTypeOptions getInstanceTypeOptions() {
        return this.InstanceTypeOptions;
    }

    /**
     * Set CVM instance model configuration. It cannot be specified together with `InstanceType` or `InstanceTypes`.
     * @param InstanceTypeOptions CVM instance model configuration. It cannot be specified together with `InstanceType` or `InstanceTypes`.
     */
    public void setInstanceTypeOptions(InstanceTypeOptions InstanceTypeOptions) {
        this.InstanceTypeOptions = InstanceTypeOptions;
    }

    /**
     * Get List of availability zones. You can create CVM cross AZs in the same region. It cannot be specified together with `VirtualPrivateCloud` or `VirtualPrivateClouds`. 
     * @return Zones List of availability zones. You can create CVM cross AZs in the same region. It cannot be specified together with `VirtualPrivateCloud` or `VirtualPrivateClouds`.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set List of availability zones. You can create CVM cross AZs in the same region. It cannot be specified together with `VirtualPrivateCloud` or `VirtualPrivateClouds`.
     * @param Zones List of availability zones. You can create CVM cross AZs in the same region. It cannot be specified together with `VirtualPrivateCloud` or `VirtualPrivateClouds`.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get List of VPCs (creation of CVM instances across VPCs is supported). It cannot be specified together with `VirtualPrivateCloud` or `Zones`. 
     * @return VirtualPrivateClouds List of VPCs (creation of CVM instances across VPCs is supported). It cannot be specified together with `VirtualPrivateCloud` or `Zones`.
     */
    public VirtualPrivateCloud [] getVirtualPrivateClouds() {
        return this.VirtualPrivateClouds;
    }

    /**
     * Set List of VPCs (creation of CVM instances across VPCs is supported). It cannot be specified together with `VirtualPrivateCloud` or `Zones`.
     * @param VirtualPrivateClouds List of VPCs (creation of CVM instances across VPCs is supported). It cannot be specified together with `VirtualPrivateCloud` or `Zones`.
     */
    public void setVirtualPrivateClouds(VirtualPrivateCloud [] VirtualPrivateClouds) {
        this.VirtualPrivateClouds = VirtualPrivateClouds;
    }

    public EnvData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvData(EnvData source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.InstanceTypeOptions != null) {
            this.InstanceTypeOptions = new InstanceTypeOptions(source.InstanceTypeOptions);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.VirtualPrivateClouds != null) {
            this.VirtualPrivateClouds = new VirtualPrivateCloud[source.VirtualPrivateClouds.length];
            for (int i = 0; i < source.VirtualPrivateClouds.length; i++) {
                this.VirtualPrivateClouds[i] = new VirtualPrivateCloud(source.VirtualPrivateClouds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamObj(map, prefix + "InstanceTypeOptions.", this.InstanceTypeOptions);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "VirtualPrivateClouds.", this.VirtualPrivateClouds);

    }
}

