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
    * CKafka cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the bandwidth after upgrade. measurement unit: mb.
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Specifies the disk after upgrade, in gb.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Disk type, such as CLOUD_PREMIUM.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Number of partitions.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Number of Topics
    */
    @SerializedName("Topic")
    @Expose
    private Long Topic;

    /**
    * Instance type, such as sp_ckafka_profession.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Configuration change portal.
    */
    @SerializedName("ModifyEntry")
    @Expose
    private String ModifyEntry;

    /**
     * Get CKafka cluster instance ID. 
     * @return InstanceId CKafka cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CKafka cluster instance ID.
     * @param InstanceId CKafka cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the bandwidth after upgrade. measurement unit: mb. 
     * @return BandWidth Specifies the bandwidth after upgrade. measurement unit: mb.
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Specifies the bandwidth after upgrade. measurement unit: mb.
     * @param BandWidth Specifies the bandwidth after upgrade. measurement unit: mb.
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Specifies the disk after upgrade, in gb. 
     * @return DiskSize Specifies the disk after upgrade, in gb.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the disk after upgrade, in gb.
     * @param DiskSize Specifies the disk after upgrade, in gb.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk type, such as CLOUD_PREMIUM. 
     * @return DiskType Disk type, such as CLOUD_PREMIUM.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type, such as CLOUD_PREMIUM.
     * @param DiskType Disk type, such as CLOUD_PREMIUM.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Number of partitions. 
     * @return Partition Number of partitions.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Number of partitions.
     * @param Partition Number of partitions.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Number of Topics 
     * @return Topic Number of Topics
     */
    public Long getTopic() {
        return this.Topic;
    }

    /**
     * Set Number of Topics
     * @param Topic Number of Topics
     */
    public void setTopic(Long Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Instance type, such as sp_ckafka_profession. 
     * @return Type Instance type, such as sp_ckafka_profession.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type, such as sp_ckafka_profession.
     * @param Type Instance type, such as sp_ckafka_profession.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Configuration change portal. 
     * @return ModifyEntry Configuration change portal.
     */
    public String getModifyEntry() {
        return this.ModifyEntry;
    }

    /**
     * Set Configuration change portal.
     * @param ModifyEntry Configuration change portal.
     */
    public void setModifyEntry(String ModifyEntry) {
        this.ModifyEntry = ModifyEntry;
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

    }
}

