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

public class CreateSnapshotGroupRequest extends AbstractModel {

    /**
    * Specifies the cloud disk ID list for creating snapshot groups. disks mounted on the same instance must be selected.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Snapshot group name. snapshots associated with the snapshot group inherit the snapshot group name. example: if the snapshot group name is testSnapshotGroup and the snapshot group is associated with two snapshots, the snapshot names are testSnapshotGroup_0 and testSnapshotGroup_1 respectively.
    */
    @SerializedName("SnapshotGroupName")
    @Expose
    private String SnapshotGroupName;

    /**
    * Specifies the Tag list that should be bound to the snapshot group.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Specifies the cloud disk ID list for creating snapshot groups. disks mounted on the same instance must be selected. 
     * @return DiskIds Specifies the cloud disk ID list for creating snapshot groups. disks mounted on the same instance must be selected.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set Specifies the cloud disk ID list for creating snapshot groups. disks mounted on the same instance must be selected.
     * @param DiskIds Specifies the cloud disk ID list for creating snapshot groups. disks mounted on the same instance must be selected.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Snapshot group name. snapshots associated with the snapshot group inherit the snapshot group name. example: if the snapshot group name is testSnapshotGroup and the snapshot group is associated with two snapshots, the snapshot names are testSnapshotGroup_0 and testSnapshotGroup_1 respectively. 
     * @return SnapshotGroupName Snapshot group name. snapshots associated with the snapshot group inherit the snapshot group name. example: if the snapshot group name is testSnapshotGroup and the snapshot group is associated with two snapshots, the snapshot names are testSnapshotGroup_0 and testSnapshotGroup_1 respectively.
     */
    public String getSnapshotGroupName() {
        return this.SnapshotGroupName;
    }

    /**
     * Set Snapshot group name. snapshots associated with the snapshot group inherit the snapshot group name. example: if the snapshot group name is testSnapshotGroup and the snapshot group is associated with two snapshots, the snapshot names are testSnapshotGroup_0 and testSnapshotGroup_1 respectively.
     * @param SnapshotGroupName Snapshot group name. snapshots associated with the snapshot group inherit the snapshot group name. example: if the snapshot group name is testSnapshotGroup and the snapshot group is associated with two snapshots, the snapshot names are testSnapshotGroup_0 and testSnapshotGroup_1 respectively.
     */
    public void setSnapshotGroupName(String SnapshotGroupName) {
        this.SnapshotGroupName = SnapshotGroupName;
    }

    /**
     * Get Specifies the Tag list that should be bound to the snapshot group. 
     * @return Tags Specifies the Tag list that should be bound to the snapshot group.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Specifies the Tag list that should be bound to the snapshot group.
     * @param Tags Specifies the Tag list that should be bound to the snapshot group.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSnapshotGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotGroupRequest(CreateSnapshotGroupRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.SnapshotGroupName != null) {
            this.SnapshotGroupName = new String(source.SnapshotGroupName);
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
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "SnapshotGroupName", this.SnapshotGroupName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

