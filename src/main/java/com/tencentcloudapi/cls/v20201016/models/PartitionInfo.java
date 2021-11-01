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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionInfo extends AbstractModel{

    /**
    * Partition ID
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * Partition status. Valid values: `readwrite`, `readonly`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Partition hash start key
    */
    @SerializedName("InclusiveBeginKey")
    @Expose
    private String InclusiveBeginKey;

    /**
    * Partition hash end key
    */
    @SerializedName("ExclusiveEndKey")
    @Expose
    private String ExclusiveEndKey;

    /**
    * Partition creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified of read-only partition
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastWriteTime")
    @Expose
    private String LastWriteTime;

    /**
     * Get Partition ID 
     * @return PartitionId Partition ID
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set Partition ID
     * @param PartitionId Partition ID
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get Partition status. Valid values: `readwrite`, `readonly` 
     * @return Status Partition status. Valid values: `readwrite`, `readonly`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Partition status. Valid values: `readwrite`, `readonly`
     * @param Status Partition status. Valid values: `readwrite`, `readonly`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Partition hash start key 
     * @return InclusiveBeginKey Partition hash start key
     */
    public String getInclusiveBeginKey() {
        return this.InclusiveBeginKey;
    }

    /**
     * Set Partition hash start key
     * @param InclusiveBeginKey Partition hash start key
     */
    public void setInclusiveBeginKey(String InclusiveBeginKey) {
        this.InclusiveBeginKey = InclusiveBeginKey;
    }

    /**
     * Get Partition hash end key 
     * @return ExclusiveEndKey Partition hash end key
     */
    public String getExclusiveEndKey() {
        return this.ExclusiveEndKey;
    }

    /**
     * Set Partition hash end key
     * @param ExclusiveEndKey Partition hash end key
     */
    public void setExclusiveEndKey(String ExclusiveEndKey) {
        this.ExclusiveEndKey = ExclusiveEndKey;
    }

    /**
     * Get Partition creation time 
     * @return CreateTime Partition creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Partition creation time
     * @param CreateTime Partition creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified of read-only partition
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LastWriteTime Last modified of read-only partition
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastWriteTime() {
        return this.LastWriteTime;
    }

    /**
     * Set Last modified of read-only partition
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LastWriteTime Last modified of read-only partition
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastWriteTime(String LastWriteTime) {
        this.LastWriteTime = LastWriteTime;
    }

    public PartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionInfo(PartitionInfo source) {
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InclusiveBeginKey != null) {
            this.InclusiveBeginKey = new String(source.InclusiveBeginKey);
        }
        if (source.ExclusiveEndKey != null) {
            this.ExclusiveEndKey = new String(source.ExclusiveEndKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastWriteTime != null) {
            this.LastWriteTime = new String(source.LastWriteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InclusiveBeginKey", this.InclusiveBeginKey);
        this.setParamSimple(map, prefix + "ExclusiveEndKey", this.ExclusiveEndKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastWriteTime", this.LastWriteTime);

    }
}

