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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotRequest extends AbstractModel{

    /**
    * ID of the cloud disk for which to create a snapshot, which can be queried through the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Snapshot name. If it is not specified, "Unnamed" will be used by default.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Expiration time of the snapshot. It must be in UTC ISO-8601 format, eg. 2022-01-08T09:47:55+00:00. The snapshot will be automatically deleted when it expires.
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * ID of the cloud disk backup point. When this parameter is specified, the snapshot will be created from the backup point.
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * Tags bound to the snapshot.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get ID of the cloud disk for which to create a snapshot, which can be queried through the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API. 
     * @return DiskId ID of the cloud disk for which to create a snapshot, which can be queried through the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the cloud disk for which to create a snapshot, which can be queried through the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API.
     * @param DiskId ID of the cloud disk for which to create a snapshot, which can be queried through the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Snapshot name. If it is not specified, "Unnamed" will be used by default. 
     * @return SnapshotName Snapshot name. If it is not specified, "Unnamed" will be used by default.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name. If it is not specified, "Unnamed" will be used by default.
     * @param SnapshotName Snapshot name. If it is not specified, "Unnamed" will be used by default.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Expiration time of the snapshot. It must be in UTC ISO-8601 format, eg. 2022-01-08T09:47:55+00:00. The snapshot will be automatically deleted when it expires. 
     * @return Deadline Expiration time of the snapshot. It must be in UTC ISO-8601 format, eg. 2022-01-08T09:47:55+00:00. The snapshot will be automatically deleted when it expires.
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Expiration time of the snapshot. It must be in UTC ISO-8601 format, eg. 2022-01-08T09:47:55+00:00. The snapshot will be automatically deleted when it expires.
     * @param Deadline Expiration time of the snapshot. It must be in UTC ISO-8601 format, eg. 2022-01-08T09:47:55+00:00. The snapshot will be automatically deleted when it expires.
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get ID of the cloud disk backup point. When this parameter is specified, the snapshot will be created from the backup point. 
     * @return DiskBackupId ID of the cloud disk backup point. When this parameter is specified, the snapshot will be created from the backup point.
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set ID of the cloud disk backup point. When this parameter is specified, the snapshot will be created from the backup point.
     * @param DiskBackupId ID of the cloud disk backup point. When this parameter is specified, the snapshot will be created from the backup point.
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get Tags bound to the snapshot. 
     * @return Tags Tags bound to the snapshot.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags bound to the snapshot.
     * @param Tags Tags bound to the snapshot.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotRequest(CreateSnapshotRequest source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
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
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

