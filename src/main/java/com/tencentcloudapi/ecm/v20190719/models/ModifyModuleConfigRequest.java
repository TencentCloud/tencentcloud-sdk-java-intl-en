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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleConfigRequest extends AbstractModel{

    /**
    * Module ID.
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Model ID.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Default data disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
    * Default system disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
    */
    @SerializedName("DefaultSystemDiskSize")
    @Expose
    private Long DefaultSystemDiskSize;

    /**
    * System disk
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Data disk
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
     * Get Default system disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`. 
     * @return DefaultSystemDiskSize Default system disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     */
    public Long getDefaultSystemDiskSize() {
        return this.DefaultSystemDiskSize;
    }

    /**
     * Set Default system disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     * @param DefaultSystemDiskSize Default system disk size in GB. It cannot exceed the system disk size range. For more information, see `DescribeConfig`.
     */
    public void setDefaultSystemDiskSize(Long DefaultSystemDiskSize) {
        this.DefaultSystemDiskSize = DefaultSystemDiskSize;
    }

    /**
     * Get System disk 
     * @return SystemDisk System disk
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk
     * @param SystemDisk System disk
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk 
     * @return DataDisks Data disk
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk
     * @param DataDisks Data disk
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public ModifyModuleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleConfigRequest(ModifyModuleConfigRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DefaultDataDiskSize != null) {
            this.DefaultDataDiskSize = new Long(source.DefaultDataDiskSize);
        }
        if (source.DefaultSystemDiskSize != null) {
            this.DefaultSystemDiskSize = new Long(source.DefaultSystemDiskSize);
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
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);
        this.setParamSimple(map, prefix + "DefaultSystemDiskSize", this.DefaultSystemDiskSize);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

