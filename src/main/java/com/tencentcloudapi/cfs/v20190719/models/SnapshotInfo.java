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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotInfo extends AbstractModel {

    /**
    * Snapshot creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Snapshot name
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Snapshot ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Snapshot status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Snapshot size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Retention period in days
    */
    @SerializedName("AliveDay")
    @Expose
    private Long AliveDay;

    /**
    * Snapshot progress
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Account ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Snapshot deletion time
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * File system name
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * Snapshot tag
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Snapshot type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
     * Get Snapshot creation time 
     * @return CreationTime Snapshot creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Snapshot creation time
     * @param CreationTime Snapshot creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Snapshot name 
     * @return SnapshotName Snapshot name
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name
     * @param SnapshotName Snapshot name
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Snapshot ID 
     * @return SnapshotId Snapshot ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID
     * @param SnapshotId Snapshot ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Snapshot status 
     * @return Status Snapshot status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Snapshot status
     * @param Status Snapshot status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Snapshot size 
     * @return Size Snapshot size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Snapshot size
     * @param Size Snapshot size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Retention period in days 
     * @return AliveDay Retention period in days
     */
    public Long getAliveDay() {
        return this.AliveDay;
    }

    /**
     * Set Retention period in days
     * @param AliveDay Retention period in days
     */
    public void setAliveDay(Long AliveDay) {
        this.AliveDay = AliveDay;
    }

    /**
     * Get Snapshot progress 
     * @return Percent Snapshot progress
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Snapshot progress
     * @param Percent Snapshot progress
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Account ID 
     * @return AppId Account ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Account ID
     * @param AppId Account ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Snapshot deletion time 
     * @return DeleteTime Snapshot deletion time
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set Snapshot deletion time
     * @param DeleteTime Snapshot deletion time
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get File system name 
     * @return FsName File system name
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set File system name
     * @param FsName File system name
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get Snapshot tag 
     * @return Tags Snapshot tag
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Snapshot tag
     * @param Tags Snapshot tag
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Snapshot type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotType Snapshot type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set Snapshot type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotType Snapshot type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    public SnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotInfo(SnapshotInfo source) {
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.AliveDay != null) {
            this.AliveDay = new Long(source.AliveDay);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.SnapshotType != null) {
            this.SnapshotType = new String(source.SnapshotType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "AliveDay", this.AliveDay);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SnapshotType", this.SnapshotType);

    }
}

