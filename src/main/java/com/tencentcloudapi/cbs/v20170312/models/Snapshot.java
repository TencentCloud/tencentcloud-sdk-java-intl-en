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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot extends AbstractModel {

    /**
    * Location of the snapshot.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Specifies whether the snapshot is for cross-region replication. value range:.
<ul>
<li>true: indicates a snapshot for cross-region replication.</li>.
<li>false: snapshot of the local region.</li>.
</ul>
    */
    @SerializedName("CopyFromRemote")
    @Expose
    private Boolean CopyFromRemote;

    /**
    * Snapshot status. valid values:.
<ul>
<Li>NORMAL: specifies the scaling group is normal.</li>.
<Li>CREATING: creating</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
<Li>COPYING_FROM_REMOTE: cross geo-replication in progress.</li>.
<Li>CHECKING_COPIED: copying check in progress.</li>.
<Li>TORECYCLE: to be recycled.</li>.
</ul>
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * Whether it is a permanent snapshot. valid values:.
<ul>
<li>true: permanent snapshot.</li>.
<li>false: non-permanent snapshot.</li>.
</ul>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * Snapshot name, the user-defined snapshot alias. Call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * The expiration time of the snapshot. If the snapshot is permanently retained, this field is blank.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * The progress percentage for snapshot creation. This field is always 100 after the snapshot is created successfully.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * List of images associated with snapshot.
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * Number of snapshots currently shared
    */
    @SerializedName("ShareReference")
    @Expose
    private Long ShareReference;

    /**
    * Specifies the SNAPSHOT type. valid values: `PRIVATE_SNAPSHOT` (PRIVATE SNAPSHOT) or `SHARED_SNAPSHOT` (SHARED SNAPSHOT).
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * Specifies the disk capacity of the CBS for creating this snapshot, in GiB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * ID of the cloud disk used to create this snapshot.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Destination region of the snapshot currently under cross region replication. if not, return `[]`.
    */
    @SerializedName("CopyingToRegions")
    @Expose
    private String [] CopyingToRegions;

    /**
    * Indicates whether the snapshot is created for an encrypted disk. valid values:.
<ul>
<li>true: specifies the snapshot is created by encrypted disks.</li>.
<li>false: snapshot created for non-encrypted disk.</li>.
</ul>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * Creation time of the snapshot.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of images associated with snapshot.
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * Specifies the cloud disk type of the CBS for creating this snapshot. valid values:.
<ul>
<Li>SYSTEM_DISK: system disk</li>.
<Li>DATA_DISK: specifies the data disk.</li>.
</ul>

    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Snapshot ID.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * The time when the snapshot sharing starts
    */
    @SerializedName("TimeStartShare")
    @Expose
    private String TimeStartShare;

    /**
    * List of tags associated with the snapshot.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Location of the snapshot. 
     * @return Placement Location of the snapshot.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the snapshot.
     * @param Placement Location of the snapshot.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Specifies whether the snapshot is for cross-region replication. value range:.
<ul>
<li>true: indicates a snapshot for cross-region replication.</li>.
<li>false: snapshot of the local region.</li>.
</ul> 
     * @return CopyFromRemote Specifies whether the snapshot is for cross-region replication. value range:.
<ul>
<li>true: indicates a snapshot for cross-region replication.</li>.
<li>false: snapshot of the local region.</li>.
</ul>
     */
    public Boolean getCopyFromRemote() {
        return this.CopyFromRemote;
    }

    /**
     * Set Specifies whether the snapshot is for cross-region replication. value range:.
<ul>
<li>true: indicates a snapshot for cross-region replication.</li>.
<li>false: snapshot of the local region.</li>.
</ul>
     * @param CopyFromRemote Specifies whether the snapshot is for cross-region replication. value range:.
<ul>
<li>true: indicates a snapshot for cross-region replication.</li>.
<li>false: snapshot of the local region.</li>.
</ul>
     */
    public void setCopyFromRemote(Boolean CopyFromRemote) {
        this.CopyFromRemote = CopyFromRemote;
    }

    /**
     * Get Snapshot status. valid values:.
<ul>
<Li>NORMAL: specifies the scaling group is normal.</li>.
<Li>CREATING: creating</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
<Li>COPYING_FROM_REMOTE: cross geo-replication in progress.</li>.
<Li>CHECKING_COPIED: copying check in progress.</li>.
<Li>TORECYCLE: to be recycled.</li>.
</ul> 
     * @return SnapshotState Snapshot status. valid values:.
<ul>
<Li>NORMAL: specifies the scaling group is normal.</li>.
<Li>CREATING: creating</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
<Li>COPYING_FROM_REMOTE: cross geo-replication in progress.</li>.
<Li>CHECKING_COPIED: copying check in progress.</li>.
<Li>TORECYCLE: to be recycled.</li>.
</ul>
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set Snapshot status. valid values:.
<ul>
<Li>NORMAL: specifies the scaling group is normal.</li>.
<Li>CREATING: creating</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
<Li>COPYING_FROM_REMOTE: cross geo-replication in progress.</li>.
<Li>CHECKING_COPIED: copying check in progress.</li>.
<Li>TORECYCLE: to be recycled.</li>.
</ul>
     * @param SnapshotState Snapshot status. valid values:.
<ul>
<Li>NORMAL: specifies the scaling group is normal.</li>.
<Li>CREATING: creating</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
<Li>COPYING_FROM_REMOTE: cross geo-replication in progress.</li>.
<Li>CHECKING_COPIED: copying check in progress.</li>.
<Li>TORECYCLE: to be recycled.</li>.
</ul>
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get Whether it is a permanent snapshot. valid values:.
<ul>
<li>true: permanent snapshot.</li>.
<li>false: non-permanent snapshot.</li>.
</ul> 
     * @return IsPermanent Whether it is a permanent snapshot. valid values:.
<ul>
<li>true: permanent snapshot.</li>.
<li>false: non-permanent snapshot.</li>.
</ul>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Whether it is a permanent snapshot. valid values:.
<ul>
<li>true: permanent snapshot.</li>.
<li>false: non-permanent snapshot.</li>.
</ul>
     * @param IsPermanent Whether it is a permanent snapshot. valid values:.
<ul>
<li>true: permanent snapshot.</li>.
<li>false: non-permanent snapshot.</li>.
</ul>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get Snapshot name, the user-defined snapshot alias. Call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field. 
     * @return SnapshotName Snapshot name, the user-defined snapshot alias. Call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name, the user-defined snapshot alias. Call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
     * @param SnapshotName Snapshot name, the user-defined snapshot alias. Call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get The expiration time of the snapshot. If the snapshot is permanently retained, this field is blank. 
     * @return DeadlineTime The expiration time of the snapshot. If the snapshot is permanently retained, this field is blank.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set The expiration time of the snapshot. If the snapshot is permanently retained, this field is blank.
     * @param DeadlineTime The expiration time of the snapshot. If the snapshot is permanently retained, this field is blank.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get The progress percentage for snapshot creation. This field is always 100 after the snapshot is created successfully. 
     * @return Percent The progress percentage for snapshot creation. This field is always 100 after the snapshot is created successfully.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set The progress percentage for snapshot creation. This field is always 100 after the snapshot is created successfully.
     * @param Percent The progress percentage for snapshot creation. This field is always 100 after the snapshot is created successfully.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get List of images associated with snapshot. 
     * @return Images List of images associated with snapshot.
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set List of images associated with snapshot.
     * @param Images List of images associated with snapshot.
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get Number of snapshots currently shared 
     * @return ShareReference Number of snapshots currently shared
     */
    public Long getShareReference() {
        return this.ShareReference;
    }

    /**
     * Set Number of snapshots currently shared
     * @param ShareReference Number of snapshots currently shared
     */
    public void setShareReference(Long ShareReference) {
        this.ShareReference = ShareReference;
    }

    /**
     * Get Specifies the SNAPSHOT type. valid values: `PRIVATE_SNAPSHOT` (PRIVATE SNAPSHOT) or `SHARED_SNAPSHOT` (SHARED SNAPSHOT). 
     * @return SnapshotType Specifies the SNAPSHOT type. valid values: `PRIVATE_SNAPSHOT` (PRIVATE SNAPSHOT) or `SHARED_SNAPSHOT` (SHARED SNAPSHOT).
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set Specifies the SNAPSHOT type. valid values: `PRIVATE_SNAPSHOT` (PRIVATE SNAPSHOT) or `SHARED_SNAPSHOT` (SHARED SNAPSHOT).
     * @param SnapshotType Specifies the SNAPSHOT type. valid values: `PRIVATE_SNAPSHOT` (PRIVATE SNAPSHOT) or `SHARED_SNAPSHOT` (SHARED SNAPSHOT).
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get Specifies the disk capacity of the CBS for creating this snapshot, in GiB. 
     * @return DiskSize Specifies the disk capacity of the CBS for creating this snapshot, in GiB.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the disk capacity of the CBS for creating this snapshot, in GiB.
     * @param DiskSize Specifies the disk capacity of the CBS for creating this snapshot, in GiB.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get ID of the cloud disk used to create this snapshot. 
     * @return DiskId ID of the cloud disk used to create this snapshot.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the cloud disk used to create this snapshot.
     * @param DiskId ID of the cloud disk used to create this snapshot.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Destination region of the snapshot currently under cross region replication. if not, return `[]`. 
     * @return CopyingToRegions Destination region of the snapshot currently under cross region replication. if not, return `[]`.
     */
    public String [] getCopyingToRegions() {
        return this.CopyingToRegions;
    }

    /**
     * Set Destination region of the snapshot currently under cross region replication. if not, return `[]`.
     * @param CopyingToRegions Destination region of the snapshot currently under cross region replication. if not, return `[]`.
     */
    public void setCopyingToRegions(String [] CopyingToRegions) {
        this.CopyingToRegions = CopyingToRegions;
    }

    /**
     * Get Indicates whether the snapshot is created for an encrypted disk. valid values:.
<ul>
<li>true: specifies the snapshot is created by encrypted disks.</li>.
<li>false: snapshot created for non-encrypted disk.</li>.
</ul> 
     * @return Encrypt Indicates whether the snapshot is created for an encrypted disk. valid values:.
<ul>
<li>true: specifies the snapshot is created by encrypted disks.</li>.
<li>false: snapshot created for non-encrypted disk.</li>.
</ul>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Indicates whether the snapshot is created for an encrypted disk. valid values:.
<ul>
<li>true: specifies the snapshot is created by encrypted disks.</li>.
<li>false: snapshot created for non-encrypted disk.</li>.
</ul>
     * @param Encrypt Indicates whether the snapshot is created for an encrypted disk. valid values:.
<ul>
<li>true: specifies the snapshot is created by encrypted disks.</li>.
<li>false: snapshot created for non-encrypted disk.</li>.
</ul>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Creation time of the snapshot. 
     * @return CreateTime Creation time of the snapshot.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the snapshot.
     * @param CreateTime Creation time of the snapshot.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of images associated with snapshot. 
     * @return ImageCount Number of images associated with snapshot.
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set Number of images associated with snapshot.
     * @param ImageCount Number of images associated with snapshot.
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get Specifies the cloud disk type of the CBS for creating this snapshot. valid values:.
<ul>
<Li>SYSTEM_DISK: system disk</li>.
<Li>DATA_DISK: specifies the data disk.</li>.
</ul>
 
     * @return DiskUsage Specifies the cloud disk type of the CBS for creating this snapshot. valid values:.
<ul>
<Li>SYSTEM_DISK: system disk</li>.
<Li>DATA_DISK: specifies the data disk.</li>.
</ul>

     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Specifies the cloud disk type of the CBS for creating this snapshot. valid values:.
<ul>
<Li>SYSTEM_DISK: system disk</li>.
<Li>DATA_DISK: specifies the data disk.</li>.
</ul>

     * @param DiskUsage Specifies the cloud disk type of the CBS for creating this snapshot. valid values:.
<ul>
<Li>SYSTEM_DISK: system disk</li>.
<Li>DATA_DISK: specifies the data disk.</li>.
</ul>

     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Snapshot ID. 
     * @return SnapshotId Snapshot ID.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID.
     * @param SnapshotId Snapshot ID.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get The time when the snapshot sharing starts 
     * @return TimeStartShare The time when the snapshot sharing starts
     */
    public String getTimeStartShare() {
        return this.TimeStartShare;
    }

    /**
     * Set The time when the snapshot sharing starts
     * @param TimeStartShare The time when the snapshot sharing starts
     */
    public void setTimeStartShare(String TimeStartShare) {
        this.TimeStartShare = TimeStartShare;
    }

    /**
     * Get List of tags associated with the snapshot. 
     * @return Tags List of tags associated with the snapshot.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags associated with the snapshot.
     * @param Tags List of tags associated with the snapshot.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public Snapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Snapshot(Snapshot source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.CopyFromRemote != null) {
            this.CopyFromRemote = new Boolean(source.CopyFromRemote);
        }
        if (source.SnapshotState != null) {
            this.SnapshotState = new String(source.SnapshotState);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Images != null) {
            this.Images = new Image[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new Image(source.Images[i]);
            }
        }
        if (source.ShareReference != null) {
            this.ShareReference = new Long(source.ShareReference);
        }
        if (source.SnapshotType != null) {
            this.SnapshotType = new String(source.SnapshotType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.CopyingToRegions != null) {
            this.CopyingToRegions = new String[source.CopyingToRegions.length];
            for (int i = 0; i < source.CopyingToRegions.length; i++) {
                this.CopyingToRegions[i] = new String(source.CopyingToRegions[i]);
            }
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.TimeStartShare != null) {
            this.TimeStartShare = new String(source.TimeStartShare);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CopyFromRemote", this.CopyFromRemote);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ShareReference", this.ShareReference);
        this.setParamSimple(map, prefix + "SnapshotType", this.SnapshotType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamArraySimple(map, prefix + "CopyingToRegions.", this.CopyingToRegions);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "TimeStartShare", this.TimeStartShare);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

