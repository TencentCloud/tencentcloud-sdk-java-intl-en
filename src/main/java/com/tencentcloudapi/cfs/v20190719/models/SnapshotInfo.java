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
    * <P>Snapshot creation time</p>.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * <P>Snapshot name</p>.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>Snapshot ID.</p>.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <P>Snapshot status: creating - creating; available - running; deleting - deleting; rollbacking-new - creating new file system; create-failed - creation failed.</p>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <P>Region name</p>.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>File system ID</p>.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Snapshot size</p><p>unit: MiB</p>.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <P>Retention duration days</p>.
    */
    @SerializedName("AliveDay")
    @Expose
    private Long AliveDay;

    /**
    * <P>Snapshot progress percentage. 1 means 1%. value range: 1-100.</p>.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>Account ID.</p>.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <P>Snapshot deletion time</p>.
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * <P>File system name</p>.
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <P>Snapshot tag.</p>.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Snapshot type. general indicates a snapshot of the general series. turbo indicates a snapshot of the turbo series.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * <P>Snapshot time reflects the data of the corresponding file system at a certain moment.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
     * Get <P>Snapshot creation time</p>. 
     * @return CreationTime <P>Snapshot creation time</p>.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set <P>Snapshot creation time</p>.
     * @param CreationTime <P>Snapshot creation time</p>.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get <P>Snapshot name</p>. 
     * @return SnapshotName <P>Snapshot name</p>.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <P>Snapshot name</p>.
     * @param SnapshotName <P>Snapshot name</p>.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>Snapshot ID.</p>. 
     * @return SnapshotId <p>Snapshot ID.</p>.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>Snapshot ID.</p>.
     * @param SnapshotId <p>Snapshot ID.</p>.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <P>Snapshot status: creating - creating; available - running; deleting - deleting; rollbacking-new - creating new file system; create-failed - creation failed.</p>. 
     * @return Status <P>Snapshot status: creating - creating; available - running; deleting - deleting; rollbacking-new - creating new file system; create-failed - creation failed.</p>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <P>Snapshot status: creating - creating; available - running; deleting - deleting; rollbacking-new - creating new file system; create-failed - creation failed.</p>.
     * @param Status <P>Snapshot status: creating - creating; available - running; deleting - deleting; rollbacking-new - creating new file system; create-failed - creation failed.</p>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <P>Region name</p>. 
     * @return RegionName <P>Region name</p>.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <P>Region name</p>.
     * @param RegionName <P>Region name</p>.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>File system ID</p>. 
     * @return FileSystemId <p>File system ID</p>.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID</p>.
     * @param FileSystemId <p>File system ID</p>.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Snapshot size</p><p>unit: MiB</p>. 
     * @return Size <p>Snapshot size</p><p>unit: MiB</p>.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Snapshot size</p><p>unit: MiB</p>.
     * @param Size <p>Snapshot size</p><p>unit: MiB</p>.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <P>Retention duration days</p>. 
     * @return AliveDay <P>Retention duration days</p>.
     */
    public Long getAliveDay() {
        return this.AliveDay;
    }

    /**
     * Set <P>Retention duration days</p>.
     * @param AliveDay <P>Retention duration days</p>.
     */
    public void setAliveDay(Long AliveDay) {
        this.AliveDay = AliveDay;
    }

    /**
     * Get <P>Snapshot progress percentage. 1 means 1%. value range: 1-100.</p>. 
     * @return Percent <P>Snapshot progress percentage. 1 means 1%. value range: 1-100.</p>.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <P>Snapshot progress percentage. 1 means 1%. value range: 1-100.</p>.
     * @param Percent <P>Snapshot progress percentage. 1 means 1%. value range: 1-100.</p>.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>Account ID.</p>. 
     * @return AppId <p>Account ID.</p>.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account ID.</p>.
     * @param AppId <p>Account ID.</p>.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <P>Snapshot deletion time</p>. 
     * @return DeleteTime <P>Snapshot deletion time</p>.
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <P>Snapshot deletion time</p>.
     * @param DeleteTime <P>Snapshot deletion time</p>.
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <P>File system name</p>. 
     * @return FsName <P>File system name</p>.
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <P>File system name</p>.
     * @param FsName <P>File system name</p>.
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <P>Snapshot tag.</p>. 
     * @return Tags <P>Snapshot tag.</p>.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <P>Snapshot tag.</p>.
     * @param Tags <P>Snapshot tag.</p>.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Snapshot type. general indicates a snapshot of the general series. turbo indicates a snapshot of the turbo series.</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotType <p>Snapshot type. general indicates a snapshot of the general series. turbo indicates a snapshot of the turbo series.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set <p>Snapshot type. general indicates a snapshot of the general series. turbo indicates a snapshot of the turbo series.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotType <p>Snapshot type. general indicates a snapshot of the general series. turbo indicates a snapshot of the turbo series.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get <P>Snapshot time reflects the data of the corresponding file system at a certain moment.</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotTime <P>Snapshot time reflects the data of the corresponding file system at a certain moment.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set <P>Snapshot time reflects the data of the corresponding file system at a certain moment.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotTime <P>Snapshot time reflects the data of the corresponding file system at a certain moment.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
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
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
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
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);

    }
}

