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

public class SnapshotGroup extends AbstractModel {

    /**
    * Specifies the snapshot group ID.
    */
    @SerializedName("SnapshotGroupId")
    @Expose
    private String SnapshotGroupId;

    /**
    * Snapshot group type. NORMAL: common snapshot group, non-consistent snapshot.
    */
    @SerializedName("SnapshotGroupType")
    @Expose
    private String SnapshotGroupType;

    /**
    * Specifies whether the snapshot group contains a system disk snapshot.
    */
    @SerializedName("ContainRootSnapshot")
    @Expose
    private Boolean ContainRootSnapshot;

    /**
    * Specifies the snapshot ID list included in the snapshot group.
    */
    @SerializedName("SnapshotIdSet")
    @Expose
    private String [] SnapshotIdSet;

    /**
    * <ul>
<Li>NORMAL: specifies the scaling group is in normal state.</li>.
<Li>CREATING: creating.</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
</ul>
    */
    @SerializedName("SnapshotGroupState")
    @Expose
    private String SnapshotGroupState;

    /**
    * Specifies the snapshot group creation progress.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Specifies the snapshot group creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest modification time of the snapshot group.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Specifies the image list associated with the snapshot group.
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * Specifies the snapshot group name.
    */
    @SerializedName("SnapshotGroupName")
    @Expose
    private String SnapshotGroupName;

    /**
    * Number of images associated with the snapshot group.
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * Specifies whether the snapshot group has permanent retention.
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * Specifies the snapshot group expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Source automatic snapshot policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
     * Get Specifies the snapshot group ID. 
     * @return SnapshotGroupId Specifies the snapshot group ID.
     */
    public String getSnapshotGroupId() {
        return this.SnapshotGroupId;
    }

    /**
     * Set Specifies the snapshot group ID.
     * @param SnapshotGroupId Specifies the snapshot group ID.
     */
    public void setSnapshotGroupId(String SnapshotGroupId) {
        this.SnapshotGroupId = SnapshotGroupId;
    }

    /**
     * Get Snapshot group type. NORMAL: common snapshot group, non-consistent snapshot. 
     * @return SnapshotGroupType Snapshot group type. NORMAL: common snapshot group, non-consistent snapshot.
     */
    public String getSnapshotGroupType() {
        return this.SnapshotGroupType;
    }

    /**
     * Set Snapshot group type. NORMAL: common snapshot group, non-consistent snapshot.
     * @param SnapshotGroupType Snapshot group type. NORMAL: common snapshot group, non-consistent snapshot.
     */
    public void setSnapshotGroupType(String SnapshotGroupType) {
        this.SnapshotGroupType = SnapshotGroupType;
    }

    /**
     * Get Specifies whether the snapshot group contains a system disk snapshot. 
     * @return ContainRootSnapshot Specifies whether the snapshot group contains a system disk snapshot.
     */
    public Boolean getContainRootSnapshot() {
        return this.ContainRootSnapshot;
    }

    /**
     * Set Specifies whether the snapshot group contains a system disk snapshot.
     * @param ContainRootSnapshot Specifies whether the snapshot group contains a system disk snapshot.
     */
    public void setContainRootSnapshot(Boolean ContainRootSnapshot) {
        this.ContainRootSnapshot = ContainRootSnapshot;
    }

    /**
     * Get Specifies the snapshot ID list included in the snapshot group. 
     * @return SnapshotIdSet Specifies the snapshot ID list included in the snapshot group.
     */
    public String [] getSnapshotIdSet() {
        return this.SnapshotIdSet;
    }

    /**
     * Set Specifies the snapshot ID list included in the snapshot group.
     * @param SnapshotIdSet Specifies the snapshot ID list included in the snapshot group.
     */
    public void setSnapshotIdSet(String [] SnapshotIdSet) {
        this.SnapshotIdSet = SnapshotIdSet;
    }

    /**
     * Get <ul>
<Li>NORMAL: specifies the scaling group is in normal state.</li>.
<Li>CREATING: creating.</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
</ul> 
     * @return SnapshotGroupState <ul>
<Li>NORMAL: specifies the scaling group is in normal state.</li>.
<Li>CREATING: creating.</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
</ul>
     */
    public String getSnapshotGroupState() {
        return this.SnapshotGroupState;
    }

    /**
     * Set <ul>
<Li>NORMAL: specifies the scaling group is in normal state.</li>.
<Li>CREATING: creating.</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
</ul>
     * @param SnapshotGroupState <ul>
<Li>NORMAL: specifies the scaling group is in normal state.</li>.
<Li>CREATING: creating.</li>.
<Li>ROLLBACKING: indicates the rollback is in progress.</li>.
</ul>
     */
    public void setSnapshotGroupState(String SnapshotGroupState) {
        this.SnapshotGroupState = SnapshotGroupState;
    }

    /**
     * Get Specifies the snapshot group creation progress. 
     * @return Percent Specifies the snapshot group creation progress.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Specifies the snapshot group creation progress.
     * @param Percent Specifies the snapshot group creation progress.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Specifies the snapshot group creation time. 
     * @return CreateTime Specifies the snapshot group creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Specifies the snapshot group creation time.
     * @param CreateTime Specifies the snapshot group creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest modification time of the snapshot group. 
     * @return ModifyTime Latest modification time of the snapshot group.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Latest modification time of the snapshot group.
     * @param ModifyTime Latest modification time of the snapshot group.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Specifies the image list associated with the snapshot group. 
     * @return Images Specifies the image list associated with the snapshot group.
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * Set Specifies the image list associated with the snapshot group.
     * @param Images Specifies the image list associated with the snapshot group.
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * Get Specifies the snapshot group name. 
     * @return SnapshotGroupName Specifies the snapshot group name.
     */
    public String getSnapshotGroupName() {
        return this.SnapshotGroupName;
    }

    /**
     * Set Specifies the snapshot group name.
     * @param SnapshotGroupName Specifies the snapshot group name.
     */
    public void setSnapshotGroupName(String SnapshotGroupName) {
        this.SnapshotGroupName = SnapshotGroupName;
    }

    /**
     * Get Number of images associated with the snapshot group. 
     * @return ImageCount Number of images associated with the snapshot group.
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set Number of images associated with the snapshot group.
     * @param ImageCount Number of images associated with the snapshot group.
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get Specifies whether the snapshot group has permanent retention. 
     * @return IsPermanent Specifies whether the snapshot group has permanent retention.
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Specifies whether the snapshot group has permanent retention.
     * @param IsPermanent Specifies whether the snapshot group has permanent retention.
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get Specifies the snapshot group expiration time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeadlineTime Specifies the snapshot group expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Specifies the snapshot group expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeadlineTime Specifies the snapshot group expiration time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Source automatic snapshot policy ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoSnapshotPolicyId Source automatic snapshot policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Source automatic snapshot policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoSnapshotPolicyId Source automatic snapshot policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    public SnapshotGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotGroup(SnapshotGroup source) {
        if (source.SnapshotGroupId != null) {
            this.SnapshotGroupId = new String(source.SnapshotGroupId);
        }
        if (source.SnapshotGroupType != null) {
            this.SnapshotGroupType = new String(source.SnapshotGroupType);
        }
        if (source.ContainRootSnapshot != null) {
            this.ContainRootSnapshot = new Boolean(source.ContainRootSnapshot);
        }
        if (source.SnapshotIdSet != null) {
            this.SnapshotIdSet = new String[source.SnapshotIdSet.length];
            for (int i = 0; i < source.SnapshotIdSet.length; i++) {
                this.SnapshotIdSet[i] = new String(source.SnapshotIdSet[i]);
            }
        }
        if (source.SnapshotGroupState != null) {
            this.SnapshotGroupState = new String(source.SnapshotGroupState);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Images != null) {
            this.Images = new Image[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new Image(source.Images[i]);
            }
        }
        if (source.SnapshotGroupName != null) {
            this.SnapshotGroupName = new String(source.SnapshotGroupName);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotGroupId", this.SnapshotGroupId);
        this.setParamSimple(map, prefix + "SnapshotGroupType", this.SnapshotGroupType);
        this.setParamSimple(map, prefix + "ContainRootSnapshot", this.ContainRootSnapshot);
        this.setParamArraySimple(map, prefix + "SnapshotIdSet.", this.SnapshotIdSet);
        this.setParamSimple(map, prefix + "SnapshotGroupState", this.SnapshotGroupState);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "SnapshotGroupName", this.SnapshotGroupName);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);

    }
}

