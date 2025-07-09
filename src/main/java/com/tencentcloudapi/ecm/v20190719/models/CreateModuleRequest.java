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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModuleRequest extends AbstractModel {

    /**
    * Module name, such as video live streaming module name. It cannot start with a space or exceed 60 characters.
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
    * Default bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
    */
    @SerializedName("DefaultBandWidth")
    @Expose
    private Long DefaultBandWidth;

    /**
    * Default image ID, such as `img-qsdf3ff2`.
    */
    @SerializedName("DefaultImageId")
    @Expose
    private String DefaultImageId;

    /**
    * Model ID.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Default system disk size in GB. It is 50 GB by default and cannot exceed the system disk size range. For more information, see `DescribeConfig`.
    */
    @SerializedName("DefaultSystemDiskSize")
    @Expose
    private Long DefaultSystemDiskSize;

    /**
    * Default data disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
    * Whether to disable IP direct access. Valid values:
true: yes
false: no
    */
    @SerializedName("CloseIpDirect")
    @Expose
    private Boolean CloseIpDirect;

    /**
    * List of tags.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * List of default module security groups
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * Default inbound bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
    */
    @SerializedName("DefaultBandWidthIn")
    @Expose
    private Long DefaultBandWidthIn;

    /**
    * Whether to prohibit public IP assignment
    */
    @SerializedName("DisableWanIp")
    @Expose
    private Boolean DisableWanIp;

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
     * Get Module name, such as video live streaming module name. It cannot start with a space or exceed 60 characters. 
     * @return ModuleName Module name, such as video live streaming module name. It cannot start with a space or exceed 60 characters.
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set Module name, such as video live streaming module name. It cannot start with a space or exceed 60 characters.
     * @param ModuleName Module name, such as video live streaming module name. It cannot start with a space or exceed 60 characters.
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * Get Default bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`. 
     * @return DefaultBandWidth Default bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
     */
    public Long getDefaultBandWidth() {
        return this.DefaultBandWidth;
    }

    /**
     * Set Default bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
     * @param DefaultBandWidth Default bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
     */
    public void setDefaultBandWidth(Long DefaultBandWidth) {
        this.DefaultBandWidth = DefaultBandWidth;
    }

    /**
     * Get Default image ID, such as `img-qsdf3ff2`. 
     * @return DefaultImageId Default image ID, such as `img-qsdf3ff2`.
     */
    public String getDefaultImageId() {
        return this.DefaultImageId;
    }

    /**
     * Set Default image ID, such as `img-qsdf3ff2`.
     * @param DefaultImageId Default image ID, such as `img-qsdf3ff2`.
     */
    public void setDefaultImageId(String DefaultImageId) {
        this.DefaultImageId = DefaultImageId;
    }

    /**
     * Get Model ID. 
     * @return InstanceType Model ID.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model ID.
     * @param InstanceType Model ID.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Default system disk size in GB. It is 50 GB by default and cannot exceed the system disk size range. For more information, see `DescribeConfig`. 
     * @return DefaultSystemDiskSize Default system disk size in GB. It is 50 GB by default and cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     */
    public Long getDefaultSystemDiskSize() {
        return this.DefaultSystemDiskSize;
    }

    /**
     * Set Default system disk size in GB. It is 50 GB by default and cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     * @param DefaultSystemDiskSize Default system disk size in GB. It is 50 GB by default and cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     */
    public void setDefaultSystemDiskSize(Long DefaultSystemDiskSize) {
        this.DefaultSystemDiskSize = DefaultSystemDiskSize;
    }

    /**
     * Get Default data disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`. 
     * @return DefaultDataDiskSize Default data disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     */
    public Long getDefaultDataDiskSize() {
        return this.DefaultDataDiskSize;
    }

    /**
     * Set Default data disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     * @param DefaultDataDiskSize Default data disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     */
    public void setDefaultDataDiskSize(Long DefaultDataDiskSize) {
        this.DefaultDataDiskSize = DefaultDataDiskSize;
    }

    /**
     * Get Whether to disable IP direct access. Valid values:
true: yes
false: no 
     * @return CloseIpDirect Whether to disable IP direct access. Valid values:
true: yes
false: no
     */
    public Boolean getCloseIpDirect() {
        return this.CloseIpDirect;
    }

    /**
     * Set Whether to disable IP direct access. Valid values:
true: yes
false: no
     * @param CloseIpDirect Whether to disable IP direct access. Valid values:
true: yes
false: no
     */
    public void setCloseIpDirect(Boolean CloseIpDirect) {
        this.CloseIpDirect = CloseIpDirect;
    }

    /**
     * Get List of tags. 
     * @return TagSpecification List of tags.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set List of tags.
     * @param TagSpecification List of tags.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get List of default module security groups 
     * @return SecurityGroups List of default module security groups
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set List of default module security groups
     * @param SecurityGroups List of default module security groups
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get Default inbound bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`. 
     * @return DefaultBandWidthIn Default inbound bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
     */
    public Long getDefaultBandWidthIn() {
        return this.DefaultBandWidthIn;
    }

    /**
     * Set Default inbound bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
     * @param DefaultBandWidthIn Default inbound bandwidth in Mbps. It cannot exceed the bandwidth range. For more information, see `DescribeConfig`.
     */
    public void setDefaultBandWidthIn(Long DefaultBandWidthIn) {
        this.DefaultBandWidthIn = DefaultBandWidthIn;
    }

    /**
     * Get Whether to prohibit public IP assignment 
     * @return DisableWanIp Whether to prohibit public IP assignment
     */
    public Boolean getDisableWanIp() {
        return this.DisableWanIp;
    }

    /**
     * Set Whether to prohibit public IP assignment
     * @param DisableWanIp Whether to prohibit public IP assignment
     */
    public void setDisableWanIp(Boolean DisableWanIp) {
        this.DisableWanIp = DisableWanIp;
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

    public CreateModuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModuleRequest(CreateModuleRequest source) {
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
        if (source.DefaultBandWidth != null) {
            this.DefaultBandWidth = new Long(source.DefaultBandWidth);
        }
        if (source.DefaultImageId != null) {
            this.DefaultImageId = new String(source.DefaultImageId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DefaultSystemDiskSize != null) {
            this.DefaultSystemDiskSize = new Long(source.DefaultSystemDiskSize);
        }
        if (source.DefaultDataDiskSize != null) {
            this.DefaultDataDiskSize = new Long(source.DefaultDataDiskSize);
        }
        if (source.CloseIpDirect != null) {
            this.CloseIpDirect = new Boolean(source.CloseIpDirect);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.DefaultBandWidthIn != null) {
            this.DefaultBandWidthIn = new Long(source.DefaultBandWidthIn);
        }
        if (source.DisableWanIp != null) {
            this.DisableWanIp = new Boolean(source.DisableWanIp);
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
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);
        this.setParamSimple(map, prefix + "DefaultBandWidth", this.DefaultBandWidth);
        this.setParamSimple(map, prefix + "DefaultImageId", this.DefaultImageId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DefaultSystemDiskSize", this.DefaultSystemDiskSize);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);
        this.setParamSimple(map, prefix + "CloseIpDirect", this.CloseIpDirect);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "DefaultBandWidthIn", this.DefaultBandWidthIn);
        this.setParamSimple(map, prefix + "DisableWanIp", this.DisableWanIp);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

