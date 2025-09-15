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
    * specifications type, such as S2.MEDIUM8.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The system disk, which can be up to 1 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskSpecInfo [] SystemDisk;

    /**
    * The list of tags to be bound.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The cloud data disk, which can be up to 15 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpecInfo [] DataDisk;

    /**
    * The local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private DiskSpecInfo [] LocalDataDisk;

    /**
     * Get specifications type, such as S2.MEDIUM8. 
     * @return InstanceType specifications type, such as S2.MEDIUM8.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set specifications type, such as S2.MEDIUM8.
     * @param InstanceType specifications type, such as S2.MEDIUM8.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The system disk, which can be up to 1 PCS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SystemDisk The system disk, which can be up to 1 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpecInfo [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set The system disk, which can be up to 1 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SystemDisk The system disk, which can be up to 1 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemDisk(DiskSpecInfo [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get The list of tags to be bound.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags The list of tags to be bound.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The list of tags to be bound.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags The list of tags to be bound.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The cloud data disk, which can be up to 15 PCS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDisk The cloud data disk, which can be up to 15 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpecInfo [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set The cloud data disk, which can be up to 15 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDisk The cloud data disk, which can be up to 15 PCS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisk(DiskSpecInfo [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get The local data disk.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocalDataDisk The local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpecInfo [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set The local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocalDataDisk The local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocalDataDisk(DiskSpecInfo [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
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

    }
}

