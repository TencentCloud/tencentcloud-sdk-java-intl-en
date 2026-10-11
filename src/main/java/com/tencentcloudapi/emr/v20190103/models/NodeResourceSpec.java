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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeResourceSpec extends AbstractModel {

    /**
    * <p>Specifications type, such as S2.MEDIUM8.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>System disk. The number of system disks does not exceed 1.</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskSpecInfo [] SystemDisk;

    /**
    * <p>List of tags to be bound.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Cloud data disk. The total number of cloud data disks does not exceed 15.</p>
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpecInfo [] DataDisk;

    /**
    * <p>Local data disk.</p>
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private DiskSpecInfo [] LocalDataDisk;

    /**
    * <p>Node configuration information. Currently provided only for the Terraform platform to validate parameters.</p>
    */
    @SerializedName("SoftwareConfig")
    @Expose
    private ServiceDeploy [] SoftwareConfig;

    /**
    * <p>Custom hostname.</p>
    */
    @SerializedName("CustomNodeName")
    @Expose
    private String CustomNodeName;

    /**
     * Get <p>Specifications type, such as S2.MEDIUM8.</p> 
     * @return InstanceType <p>Specifications type, such as S2.MEDIUM8.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Specifications type, such as S2.MEDIUM8.</p>
     * @param InstanceType <p>Specifications type, such as S2.MEDIUM8.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>System disk. The number of system disks does not exceed 1.</p> 
     * @return SystemDisk <p>System disk. The number of system disks does not exceed 1.</p>
     */
    public DiskSpecInfo [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>System disk. The number of system disks does not exceed 1.</p>
     * @param SystemDisk <p>System disk. The number of system disks does not exceed 1.</p>
     */
    public void setSystemDisk(DiskSpecInfo [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>List of tags to be bound.</p> 
     * @return Tags <p>List of tags to be bound.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of tags to be bound.</p>
     * @param Tags <p>List of tags to be bound.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Cloud data disk. The total number of cloud data disks does not exceed 15.</p> 
     * @return DataDisk <p>Cloud data disk. The total number of cloud data disks does not exceed 15.</p>
     */
    public DiskSpecInfo [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>Cloud data disk. The total number of cloud data disks does not exceed 15.</p>
     * @param DataDisk <p>Cloud data disk. The total number of cloud data disks does not exceed 15.</p>
     */
    public void setDataDisk(DiskSpecInfo [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get <p>Local data disk.</p> 
     * @return LocalDataDisk <p>Local data disk.</p>
     */
    public DiskSpecInfo [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set <p>Local data disk.</p>
     * @param LocalDataDisk <p>Local data disk.</p>
     */
    public void setLocalDataDisk(DiskSpecInfo [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
    }

    /**
     * Get <p>Node configuration information. Currently provided only for the Terraform platform to validate parameters.</p> 
     * @return SoftwareConfig <p>Node configuration information. Currently provided only for the Terraform platform to validate parameters.</p>
     */
    public ServiceDeploy [] getSoftwareConfig() {
        return this.SoftwareConfig;
    }

    /**
     * Set <p>Node configuration information. Currently provided only for the Terraform platform to validate parameters.</p>
     * @param SoftwareConfig <p>Node configuration information. Currently provided only for the Terraform platform to validate parameters.</p>
     */
    public void setSoftwareConfig(ServiceDeploy [] SoftwareConfig) {
        this.SoftwareConfig = SoftwareConfig;
    }

    /**
     * Get <p>Custom hostname.</p> 
     * @return CustomNodeName <p>Custom hostname.</p>
     */
    public String getCustomNodeName() {
        return this.CustomNodeName;
    }

    /**
     * Set <p>Custom hostname.</p>
     * @param CustomNodeName <p>Custom hostname.</p>
     */
    public void setCustomNodeName(String CustomNodeName) {
        this.CustomNodeName = CustomNodeName;
    }

    public NodeResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeResourceSpec(NodeResourceSpec source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskSpecInfo[source.SystemDisk.length];
            for (int i = 0; i < source.SystemDisk.length; i++) {
                this.SystemDisk[i] = new DiskSpecInfo(source.SystemDisk[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpecInfo[source.DataDisk.length];
            for (int i = 0; i < source.DataDisk.length; i++) {
                this.DataDisk[i] = new DiskSpecInfo(source.DataDisk[i]);
            }
        }
        if (source.LocalDataDisk != null) {
            this.LocalDataDisk = new DiskSpecInfo[source.LocalDataDisk.length];
            for (int i = 0; i < source.LocalDataDisk.length; i++) {
                this.LocalDataDisk[i] = new DiskSpecInfo(source.LocalDataDisk[i]);
            }
        }
        if (source.SoftwareConfig != null) {
            this.SoftwareConfig = new ServiceDeploy[source.SoftwareConfig.length];
            for (int i = 0; i < source.SoftwareConfig.length; i++) {
                this.SoftwareConfig[i] = new ServiceDeploy(source.SoftwareConfig[i]);
            }
        }
        if (source.CustomNodeName != null) {
            this.CustomNodeName = new String(source.CustomNodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamArrayObj(map, prefix + "LocalDataDisk.", this.LocalDataDisk);
        this.setParamArrayObj(map, prefix + "SoftwareConfig.", this.SoftwareConfig);
        this.setParamSimple(map, prefix + "CustomNodeName", this.CustomNodeName);

    }
}

