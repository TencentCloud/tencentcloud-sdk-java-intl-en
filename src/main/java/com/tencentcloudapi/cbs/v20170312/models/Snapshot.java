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
    * Whether the snapshot is replicated across regions. Value range: <br><li>true: Indicates that the snapshot is replicated across regions. <br><li>false: Indicates that the snapshot belongs to the local region.
    */
    @SerializedName("CopyFromRemote")
    @Expose
    private Boolean CopyFromRemote;

    /**
    * Snapshot status. Valid values: <br><li>NORMAL: normal <br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * Whether it is a permanent snapshot. Value range: <br><li>true: Permanent snapshot <br><li>false: Non-permanent snapshot.
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
    * Snapshot type. This value can currently be either PRIVATE_SNAPSHOT or SHARED_SNAPSHOT.
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * Size of the cloud disk used to create this snapshot (in GB).
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
    * The destination region to which the snapshot is being replicated. Default value is [ ].
    */
    @SerializedName("CopyingToRegions")
    @Expose
    private String [] CopyingToRegions;

    /**
    * Whether the snapshot is created from an encrypted disk. Value range: <br><li>true: Yes <br><li>false: No.
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
    * The type of the cloud disk used to create the snapshot. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
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
     * Get Whether the snapshot is replicated across regions. Value range: <br><li>true: Indicates that the snapshot is replicated across regions. <br><li>false: Indicates that the snapshot belongs to the local region. 
     * @return CopyFromRemote Whether the snapshot is replicated across regions. Value range: <br><li>true: Indicates that the snapshot is replicated across regions. <br><li>false: Indicates that the snapshot belongs to the local region.
     */
    public Boolean getCopyFromRemote() {
        return this.CopyFromRemote;
    }

    /**
     * Set Whether the snapshot is replicated across regions. Value range: <br><li>true: Indicates that the snapshot is replicated across regions. <br><li>false: Indicates that the snapshot belongs to the local region.
     * @param CopyFromRemote Whether the snapshot is replicated across regions. Value range: <br><li>true: Indicates that the snapshot is replicated across regions. <br><li>false: Indicates that the snapshot belongs to the local region.
     */
    public void setCopyFromRemote(Boolean CopyFromRemote) {
        this.CopyFromRemote = CopyFromRemote;
    }

    /**
     * Get Snapshot status. Valid values: <br><li>NORMAL: normal <br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed. 
     * @return SnapshotState Snapshot status. Valid values: <br><li>NORMAL: normal <br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set Snapshot status. Valid values: <br><li>NORMAL: normal <br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
     * @param SnapshotState Snapshot status. Valid values: <br><li>NORMAL: normal <br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get Whether it is a permanent snapshot. Value range: <br><li>true: Permanent snapshot <br><li>false: Non-permanent snapshot. 
     * @return IsPermanent Whether it is a permanent snapshot. Value range: <br><li>true: Permanent snapshot <br><li>false: Non-permanent snapshot.
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Whether it is a permanent snapshot. Value range: <br><li>true: Permanent snapshot <br><li>false: Non-permanent snapshot.
     * @param IsPermanent Whether it is a permanent snapshot. Value range: <br><li>true: Permanent snapshot <br><li>false: Non-permanent snapshot.
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
     * Get Snapshot type. This value can currently be either PRIVATE_SNAPSHOT or SHARED_SNAPSHOT. 
     * @return SnapshotType Snapshot type. This value can currently be either PRIVATE_SNAPSHOT or SHARED_SNAPSHOT.
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set Snapshot type. This value can currently be either PRIVATE_SNAPSHOT or SHARED_SNAPSHOT.
     * @param SnapshotType Snapshot type. This value can currently be either PRIVATE_SNAPSHOT or SHARED_SNAPSHOT.
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get Size of the cloud disk used to create this snapshot (in GB). 
     * @return DiskSize Size of the cloud disk used to create this snapshot (in GB).
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Size of the cloud disk used to create this snapshot (in GB).
     * @param DiskSize Size of the cloud disk used to create this snapshot (in GB).
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
     * Get The destination region to which the snapshot is being replicated. Default value is [ ]. 
     * @return CopyingToRegions The destination region to which the snapshot is being replicated. Default value is [ ].
     */
    public String [] getCopyingToRegions() {
        return this.CopyingToRegions;
    }

    /**
     * Set The destination region to which the snapshot is being replicated. Default value is [ ].
     * @param CopyingToRegions The destination region to which the snapshot is being replicated. Default value is [ ].
     */
    public void setCopyingToRegions(String [] CopyingToRegions) {
        this.CopyingToRegions = CopyingToRegions;
    }

    /**
     * Get Whether the snapshot is created from an encrypted disk. Value range: <br><li>true: Yes <br><li>false: No. 
     * @return Encrypt Whether the snapshot is created from an encrypted disk. Value range: <br><li>true: Yes <br><li>false: No.
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Whether the snapshot is created from an encrypted disk. Value range: <br><li>true: Yes <br><li>false: No.
     * @param Encrypt Whether the snapshot is created from an encrypted disk. Value range: <br><li>true: Yes <br><li>false: No.
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
     * Get The type of the cloud disk used to create the snapshot. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk. 
     * @return DiskUsage The type of the cloud disk used to create the snapshot. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set The type of the cloud disk used to create the snapshot. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
     * @param DiskUsage The type of the cloud disk used to create the snapshot. Value range: <br><li>SYSTEM_DISK: System disk <br><li>DATA_DISK: Data disk.
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

