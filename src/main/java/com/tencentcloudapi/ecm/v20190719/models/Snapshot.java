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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot extends AbstractModel {

    /**
    * Snapshot location.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Whether the snapshot is replicated across regions. Valid values:<br><li>true: yes;<br><li>false: no.
    */
    @SerializedName("CopyFromRemote")
    @Expose
    private Boolean CopyFromRemote;

    /**
    * Whether the snapshot is a permanent snapshot. Valid values:<br><li>true: yes<br><li>false: no.
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * Snapshot name, i.e., the user-defined snapshot alias. You can call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Snapshot creation progress in percentage. This field will always be `100` once the snapshot is created successfully.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * List of images associated with the snapshot.
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * Number of snapshots currently shared.
    */
    @SerializedName("ShareReference")
    @Expose
    private Long ShareReference;

    /**
    * Snapshot type. Valid values: PRIVATE_SNAPSHOT, SHARED_SNAPSHOT
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * Size in GB of the cloud disk for which the snapshot is created.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * ID of the cloud disk for which the snapshot is created.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Destination region to which the snapshot is being replicated. Default value: [].
    */
    @SerializedName("CopyingToRegions")
    @Expose
    private String [] CopyingToRegions;

    /**
    * Snapshot ID.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Type of the cloud disk for which the snapshot is created. Valid values:<br><li>SYSTEM_DISK: system disk<br><li>DATA_DISK: data disk.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Whether the snapshot is created from an encrypted disk. Valid values:<br><li>true: yes<br><li>false: no.
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * Snapshot creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of images associated with the snapshot.
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * Snapshot status. Valid values:<br><li>NORMAL: normal<br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<br><li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * Snapshot expiration time.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Time when snapshot sharing starts.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeStartShare")
    @Expose
    private String TimeStartShare;

    /**
     * Get Snapshot location. 
     * @return Placement Snapshot location.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Snapshot location.
     * @param Placement Snapshot location.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Whether the snapshot is replicated across regions. Valid values:<br><li>true: yes;<br><li>false: no. 
     * @return CopyFromRemote Whether the snapshot is replicated across regions. Valid values:<br><li>true: yes;<br><li>false: no.
     */
    public Boolean getCopyFromRemote() {
        return this.CopyFromRemote;
    }

    /**
     * Set Whether the snapshot is replicated across regions. Valid values:<br><li>true: yes;<br><li>false: no.
     * @param CopyFromRemote Whether the snapshot is replicated across regions. Valid values:<br><li>true: yes;<br><li>false: no.
     */
    public void setCopyFromRemote(Boolean CopyFromRemote) {
        this.CopyFromRemote = CopyFromRemote;
    }

    /**
     * Get Whether the snapshot is a permanent snapshot. Valid values:<br><li>true: yes<br><li>false: no. 
     * @return IsPermanent Whether the snapshot is a permanent snapshot. Valid values:<br><li>true: yes<br><li>false: no.
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Whether the snapshot is a permanent snapshot. Valid values:<br><li>true: yes<br><li>false: no.
     * @param IsPermanent Whether the snapshot is a permanent snapshot. Valid values:<br><li>true: yes<br><li>false: no.
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get Snapshot name, i.e., the user-defined snapshot alias. You can call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field. 
     * @return SnapshotName Snapshot name, i.e., the user-defined snapshot alias. You can call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name, i.e., the user-defined snapshot alias. You can call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
     * @param SnapshotName Snapshot name, i.e., the user-defined snapshot alias. You can call [ModifySnapshotAttribute](https://intl.cloud.tencent.com/document/product/362/15650?from_cn_redirect=1) to modify this field.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Snapshot creation progress in percentage. This field will always be `100` once the snapshot is created successfully. 
     * @return Percent Snapshot creation progress in percentage. This field will always be `100` once the snapshot is created successfully.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Snapshot creation progress in percentage. This field will always be `100` once the snapshot is created successfully.
     * @param Percent Snapshot creation progress in percentage. This field will always be `100` once the snapshot is created successfully.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get List of images associated with the snapshot. 
     * @return Images List of images associated with the snapshot.
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set List of images associated with the snapshot.
     * @param Images List of images associated with the snapshot.
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get Number of snapshots currently shared. 
     * @return ShareReference Number of snapshots currently shared.
     */
    public Long getShareReference() {
        return this.ShareReference;
    }

    /**
     * Set Number of snapshots currently shared.
     * @param ShareReference Number of snapshots currently shared.
     */
    public void setShareReference(Long ShareReference) {
        this.ShareReference = ShareReference;
    }

    /**
     * Get Snapshot type. Valid values: PRIVATE_SNAPSHOT, SHARED_SNAPSHOT 
     * @return SnapshotType Snapshot type. Valid values: PRIVATE_SNAPSHOT, SHARED_SNAPSHOT
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * Set Snapshot type. Valid values: PRIVATE_SNAPSHOT, SHARED_SNAPSHOT
     * @param SnapshotType Snapshot type. Valid values: PRIVATE_SNAPSHOT, SHARED_SNAPSHOT
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * Get Size in GB of the cloud disk for which the snapshot is created. 
     * @return DiskSize Size in GB of the cloud disk for which the snapshot is created.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Size in GB of the cloud disk for which the snapshot is created.
     * @param DiskSize Size in GB of the cloud disk for which the snapshot is created.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get ID of the cloud disk for which the snapshot is created. 
     * @return DiskId ID of the cloud disk for which the snapshot is created.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the cloud disk for which the snapshot is created.
     * @param DiskId ID of the cloud disk for which the snapshot is created.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Destination region to which the snapshot is being replicated. Default value: []. 
     * @return CopyingToRegions Destination region to which the snapshot is being replicated. Default value: [].
     */
    public String [] getCopyingToRegions() {
        return this.CopyingToRegions;
    }

    /**
     * Set Destination region to which the snapshot is being replicated. Default value: [].
     * @param CopyingToRegions Destination region to which the snapshot is being replicated. Default value: [].
     */
    public void setCopyingToRegions(String [] CopyingToRegions) {
        this.CopyingToRegions = CopyingToRegions;
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
     * Get Type of the cloud disk for which the snapshot is created. Valid values:<br><li>SYSTEM_DISK: system disk<br><li>DATA_DISK: data disk. 
     * @return DiskUsage Type of the cloud disk for which the snapshot is created. Valid values:<br><li>SYSTEM_DISK: system disk<br><li>DATA_DISK: data disk.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Type of the cloud disk for which the snapshot is created. Valid values:<br><li>SYSTEM_DISK: system disk<br><li>DATA_DISK: data disk.
     * @param DiskUsage Type of the cloud disk for which the snapshot is created. Valid values:<br><li>SYSTEM_DISK: system disk<br><li>DATA_DISK: data disk.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Whether the snapshot is created from an encrypted disk. Valid values:<br><li>true: yes<br><li>false: no. 
     * @return Encrypt Whether the snapshot is created from an encrypted disk. Valid values:<br><li>true: yes<br><li>false: no.
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Whether the snapshot is created from an encrypted disk. Valid values:<br><li>true: yes<br><li>false: no.
     * @param Encrypt Whether the snapshot is created from an encrypted disk. Valid values:<br><li>true: yes<br><li>false: no.
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Snapshot creation time. 
     * @return CreateTime Snapshot creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Snapshot creation time.
     * @param CreateTime Snapshot creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of images associated with the snapshot. 
     * @return ImageCount Number of images associated with the snapshot.
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set Number of images associated with the snapshot.
     * @param ImageCount Number of images associated with the snapshot.
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get Snapshot status. Valid values:<br><li>NORMAL: normal<br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<br><li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed. 
     * @return SnapshotState Snapshot status. Valid values:<br><li>NORMAL: normal<br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<br><li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set Snapshot status. Valid values:<br><li>NORMAL: normal<br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<br><li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
     * @param SnapshotState Snapshot status. Valid values:<br><li>NORMAL: normal<br><li>CREATING: creating<br><li>ROLLBACKING: rolling back<br><li>COPYING_FROM_REMOTE: cross-region replicating<br><li>CHECKING_COPIED: verifying the cross-region replicated data<br><li>TORECYCLE: to be repossessed.
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get Snapshot expiration time. 
     * @return DeadlineTime Snapshot expiration time.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Snapshot expiration time.
     * @param DeadlineTime Snapshot expiration time.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Time when snapshot sharing starts.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TimeStartShare Time when snapshot sharing starts.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeStartShare() {
        return this.TimeStartShare;
    }

    /**
     * Set Time when snapshot sharing starts.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TimeStartShare Time when snapshot sharing starts.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeStartShare(String TimeStartShare) {
        this.TimeStartShare = TimeStartShare;
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
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
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
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
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
        if (source.SnapshotState != null) {
            this.SnapshotState = new String(source.SnapshotState);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.TimeStartShare != null) {
            this.TimeStartShare = new String(source.TimeStartShare);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CopyFromRemote", this.CopyFromRemote);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ShareReference", this.ShareReference);
        this.setParamSimple(map, prefix + "SnapshotType", this.SnapshotType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamArraySimple(map, prefix + "CopyingToRegions.", this.CopyingToRegions);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "TimeStartShare", this.TimeStartShare);

    }
}

