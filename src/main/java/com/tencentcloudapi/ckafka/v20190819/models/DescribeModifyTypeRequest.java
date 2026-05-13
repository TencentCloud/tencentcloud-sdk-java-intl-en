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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModifyTypeRequest extends AbstractModel {

    /**
    * <p>ckafka cluster instance Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Bandwidth after upgrade, unit mb</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>Disk capacity after upgrade, in GB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Disk type, such as CLOUD_PREMIUM</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Number of partitions</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>topic count</p>
    */
    @SerializedName("Topic")
    @Expose
    private Long Topic;

    /**
    * <p>Instance type such as sp_ckafka_profession</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Resize portal</p>
    */
    @SerializedName("ModifyEntry")
    @Expose
    private String ModifyEntry;

    /**
    * <p>Whether to modify AZ  false: Not modify AZ  true: Modify AZ  Default false</p>
    */
    @SerializedName("ModifyZone")
    @Expose
    private Boolean ModifyZone;

    /**
     * Get <p>ckafka cluster instance Id</p> 
     * @return InstanceId <p>ckafka cluster instance Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id</p>
     * @param InstanceId <p>ckafka cluster instance Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Bandwidth after upgrade, unit mb</p> 
     * @return BandWidth <p>Bandwidth after upgrade, unit mb</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>Bandwidth after upgrade, unit mb</p>
     * @param BandWidth <p>Bandwidth after upgrade, unit mb</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>Disk capacity after upgrade, in GB</p> 
     * @return DiskSize <p>Disk capacity after upgrade, in GB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Disk capacity after upgrade, in GB</p>
     * @param DiskSize <p>Disk capacity after upgrade, in GB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Disk type, such as CLOUD_PREMIUM</p> 
     * @return DiskType <p>Disk type, such as CLOUD_PREMIUM</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Disk type, such as CLOUD_PREMIUM</p>
     * @param DiskType <p>Disk type, such as CLOUD_PREMIUM</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Number of partitions</p> 
     * @return Partition <p>Number of partitions</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>Number of partitions</p>
     * @param Partition <p>Number of partitions</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>topic count</p> 
     * @return Topic <p>topic count</p>
     */
    public Long getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>topic count</p>
     * @param Topic <p>topic count</p>
     */
    public void setTopic(Long Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Instance type such as sp_ckafka_profession</p> 
     * @return Type <p>Instance type such as sp_ckafka_profession</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Instance type such as sp_ckafka_profession</p>
     * @param Type <p>Instance type such as sp_ckafka_profession</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Resize portal</p> 
     * @return ModifyEntry <p>Resize portal</p>
     */
    public String getModifyEntry() {
        return this.ModifyEntry;
    }

    /**
     * Set <p>Resize portal</p>
     * @param ModifyEntry <p>Resize portal</p>
     */
    public void setModifyEntry(String ModifyEntry) {
        this.ModifyEntry = ModifyEntry;
    }

    /**
     * Get <p>Whether to modify AZ  false: Not modify AZ  true: Modify AZ  Default false</p> 
     * @return ModifyZone <p>Whether to modify AZ  false: Not modify AZ  true: Modify AZ  Default false</p>
     */
    public Boolean getModifyZone() {
        return this.ModifyZone;
    }

    /**
     * Set <p>Whether to modify AZ  false: Not modify AZ  true: Modify AZ  Default false</p>
     * @param ModifyZone <p>Whether to modify AZ  false: Not modify AZ  true: Modify AZ  Default false</p>
     */
    public void setModifyZone(Boolean ModifyZone) {
        this.ModifyZone = ModifyZone;
    }

    public DescribeModifyTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModifyTypeRequest(DescribeModifyTypeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Topic != null) {
            this.Topic = new Long(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ModifyEntry != null) {
            this.ModifyEntry = new String(source.ModifyEntry);
        }
        if (source.ModifyZone != null) {
            this.ModifyZone = new Boolean(source.ModifyZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ModifyEntry", this.ModifyEntry);
        this.setParamSimple(map, prefix + "ModifyZone", this.ModifyZone);

    }
}

