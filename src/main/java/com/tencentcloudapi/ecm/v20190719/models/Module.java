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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Module extends AbstractModel {

    /**
    * Module ID.
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Module name.
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
    * Module status. Valid values:
NORMAL: normal.
DELETING: deleting 
DELETEFAILED: failed to delete.
    */
    @SerializedName("ModuleState")
    @Expose
    private String ModuleState;

    /**
    * Default system disk size.
    */
    @SerializedName("DefaultSystemDiskSize")
    @Expose
    private Long DefaultSystemDiskSize;

    /**
    * Default data disk size.
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
    * Default model.
    */
    @SerializedName("InstanceTypeConfig")
    @Expose
    private InstanceTypeConfig InstanceTypeConfig;

    /**
    * Default image.
    */
    @SerializedName("DefaultImage")
    @Expose
    private Image DefaultImage;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Default outbound bandwidth.
    */
    @SerializedName("DefaultBandwidth")
    @Expose
    private Long DefaultBandwidth;

    /**
    * Tag set.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Whether to disable IP direct access.
    */
    @SerializedName("CloseIpDirect")
    @Expose
    private Long CloseIpDirect;

    /**
    * List of default security group IDs.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Default inbound bandwidth.
    */
    @SerializedName("DefaultBandwidthIn")
    @Expose
    private Long DefaultBandwidthIn;

    /**
    * Custom script data
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * System disk information.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Data disk information.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
     * Get Module ID. 
     * @return ModuleId Module ID.
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Module ID.
     * @param ModuleId Module ID.
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Module name. 
     * @return ModuleName Module name.
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set Module name.
     * @param ModuleName Module name.
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * Get Module status. Valid values:
NORMAL: normal.
DELETING: deleting 
DELETEFAILED: failed to delete. 
     * @return ModuleState Module status. Valid values:
NORMAL: normal.
DELETING: deleting 
DELETEFAILED: failed to delete.
     */
    public String getModuleState() {
        return this.ModuleState;
    }

    /**
     * Set Module status. Valid values:
NORMAL: normal.
DELETING: deleting 
DELETEFAILED: failed to delete.
     * @param ModuleState Module status. Valid values:
NORMAL: normal.
DELETING: deleting 
DELETEFAILED: failed to delete.
     */
    public void setModuleState(String ModuleState) {
        this.ModuleState = ModuleState;
    }

    /**
     * Get Default system disk size. 
     * @return DefaultSystemDiskSize Default system disk size.
     */
    public Long getDefaultSystemDiskSize() {
        return this.DefaultSystemDiskSize;
    }

    /**
     * Set Default system disk size.
     * @param DefaultSystemDiskSize Default system disk size.
     */
    public void setDefaultSystemDiskSize(Long DefaultSystemDiskSize) {
        this.DefaultSystemDiskSize = DefaultSystemDiskSize;
    }

    /**
     * Get Default data disk size. 
     * @return DefaultDataDiskSize Default data disk size.
     */
    public Long getDefaultDataDiskSize() {
        return this.DefaultDataDiskSize;
    }

    /**
     * Set Default data disk size.
     * @param DefaultDataDiskSize Default data disk size.
     */
    public void setDefaultDataDiskSize(Long DefaultDataDiskSize) {
        this.DefaultDataDiskSize = DefaultDataDiskSize;
    }

    /**
     * Get Default model. 
     * @return InstanceTypeConfig Default model.
     */
    public InstanceTypeConfig getInstanceTypeConfig() {
        return this.InstanceTypeConfig;
    }

    /**
     * Set Default model.
     * @param InstanceTypeConfig Default model.
     */
    public void setInstanceTypeConfig(InstanceTypeConfig InstanceTypeConfig) {
        this.InstanceTypeConfig = InstanceTypeConfig;
    }

    /**
     * Get Default image. 
     * @return DefaultImage Default image.
     */
    public Image getDefaultImage() {
        return this.DefaultImage;
    }

    /**
     * Set Default image.
     * @param DefaultImage Default image.
     */
    public void setDefaultImage(Image DefaultImage) {
        this.DefaultImage = DefaultImage;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Default outbound bandwidth. 
     * @return DefaultBandwidth Default outbound bandwidth.
     */
    public Long getDefaultBandwidth() {
        return this.DefaultBandwidth;
    }

    /**
     * Set Default outbound bandwidth.
     * @param DefaultBandwidth Default outbound bandwidth.
     */
    public void setDefaultBandwidth(Long DefaultBandwidth) {
        this.DefaultBandwidth = DefaultBandwidth;
    }

    /**
     * Get Tag set.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag set.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag set.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag set.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Whether to disable IP direct access. 
     * @return CloseIpDirect Whether to disable IP direct access.
     */
    public Long getCloseIpDirect() {
        return this.CloseIpDirect;
    }

    /**
     * Set Whether to disable IP direct access.
     * @param CloseIpDirect Whether to disable IP direct access.
     */
    public void setCloseIpDirect(Long CloseIpDirect) {
        this.CloseIpDirect = CloseIpDirect;
    }

    /**
     * Get List of default security group IDs. 
     * @return SecurityGroupIds List of default security group IDs.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set List of default security group IDs.
     * @param SecurityGroupIds List of default security group IDs.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Default inbound bandwidth. 
     * @return DefaultBandwidthIn Default inbound bandwidth.
     */
    public Long getDefaultBandwidthIn() {
        return this.DefaultBandwidthIn;
    }

    /**
     * Set Default inbound bandwidth.
     * @param DefaultBandwidthIn Default inbound bandwidth.
     */
    public void setDefaultBandwidthIn(Long DefaultBandwidthIn) {
        this.DefaultBandwidthIn = DefaultBandwidthIn;
    }

    /**
     * Get Custom script data 
     * @return UserData Custom script data
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set Custom script data
     * @param UserData Custom script data
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get System disk information. 
     * @return SystemDisk System disk information.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk information.
     * @param SystemDisk System disk information.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk information. 
     * @return DataDisks Data disk information.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk information.
     * @param DataDisks Data disk information.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public Module() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Module(Module source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
        if (source.ModuleState != null) {
            this.ModuleState = new String(source.ModuleState);
        }
        if (source.DefaultSystemDiskSize != null) {
            this.DefaultSystemDiskSize = new Long(source.DefaultSystemDiskSize);
        }
        if (source.DefaultDataDiskSize != null) {
            this.DefaultDataDiskSize = new Long(source.DefaultDataDiskSize);
        }
        if (source.InstanceTypeConfig != null) {
            this.InstanceTypeConfig = new InstanceTypeConfig(source.InstanceTypeConfig);
        }
        if (source.DefaultImage != null) {
            this.DefaultImage = new Image(source.DefaultImage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DefaultBandwidth != null) {
            this.DefaultBandwidth = new Long(source.DefaultBandwidth);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.CloseIpDirect != null) {
            this.CloseIpDirect = new Long(source.CloseIpDirect);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.DefaultBandwidthIn != null) {
            this.DefaultBandwidthIn = new Long(source.DefaultBandwidthIn);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);
        this.setParamSimple(map, prefix + "ModuleState", this.ModuleState);
        this.setParamSimple(map, prefix + "DefaultSystemDiskSize", this.DefaultSystemDiskSize);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);
        this.setParamObj(map, prefix + "InstanceTypeConfig.", this.InstanceTypeConfig);
        this.setParamObj(map, prefix + "DefaultImage.", this.DefaultImage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DefaultBandwidth", this.DefaultBandwidth);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "CloseIpDirect", this.CloseIpDirect);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DefaultBandwidthIn", this.DefaultBandwidthIn);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

