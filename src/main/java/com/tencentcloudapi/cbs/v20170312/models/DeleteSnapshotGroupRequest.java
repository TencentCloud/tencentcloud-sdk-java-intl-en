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

public class DeleteSnapshotGroupRequest extends AbstractModel {

    /**
    * Specifies the snapshot group ID.
    */
    @SerializedName("SnapshotGroupId")
    @Expose
    private String SnapshotGroupId;

    /**
    * List of snapshot group ids. this parameter and the snapshot group ID must provide at least one. if both are provided, they will be merged with the snapshot group ID.
    */
    @SerializedName("SnapshotGroupIds")
    @Expose
    private String [] SnapshotGroupIds;

    /**
    * Specifies whether to delete the image associated with the snapshot group at the same time. valid values: set to false (not delete the image bound to the snapshot group; at this point, if the snapshot group has bound images, deletion will fail) or set to true (delete the image bound to the snapshot group simultaneously). default value is false.
    */
    @SerializedName("DeleteBindImages")
    @Expose
    private Boolean DeleteBindImages;

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
     * Get List of snapshot group ids. this parameter and the snapshot group ID must provide at least one. if both are provided, they will be merged with the snapshot group ID. 
     * @return SnapshotGroupIds List of snapshot group ids. this parameter and the snapshot group ID must provide at least one. if both are provided, they will be merged with the snapshot group ID.
     */
    public String [] getSnapshotGroupIds() {
        return this.SnapshotGroupIds;
    }

    /**
     * Set List of snapshot group ids. this parameter and the snapshot group ID must provide at least one. if both are provided, they will be merged with the snapshot group ID.
     * @param SnapshotGroupIds List of snapshot group ids. this parameter and the snapshot group ID must provide at least one. if both are provided, they will be merged with the snapshot group ID.
     */
    public void setSnapshotGroupIds(String [] SnapshotGroupIds) {
        this.SnapshotGroupIds = SnapshotGroupIds;
    }

    /**
     * Get Specifies whether to delete the image associated with the snapshot group at the same time. valid values: set to false (not delete the image bound to the snapshot group; at this point, if the snapshot group has bound images, deletion will fail) or set to true (delete the image bound to the snapshot group simultaneously). default value is false. 
     * @return DeleteBindImages Specifies whether to delete the image associated with the snapshot group at the same time. valid values: set to false (not delete the image bound to the snapshot group; at this point, if the snapshot group has bound images, deletion will fail) or set to true (delete the image bound to the snapshot group simultaneously). default value is false.
     */
    public Boolean getDeleteBindImages() {
        return this.DeleteBindImages;
    }

    /**
     * Set Specifies whether to delete the image associated with the snapshot group at the same time. valid values: set to false (not delete the image bound to the snapshot group; at this point, if the snapshot group has bound images, deletion will fail) or set to true (delete the image bound to the snapshot group simultaneously). default value is false.
     * @param DeleteBindImages Specifies whether to delete the image associated with the snapshot group at the same time. valid values: set to false (not delete the image bound to the snapshot group; at this point, if the snapshot group has bound images, deletion will fail) or set to true (delete the image bound to the snapshot group simultaneously). default value is false.
     */
    public void setDeleteBindImages(Boolean DeleteBindImages) {
        this.DeleteBindImages = DeleteBindImages;
    }

    public DeleteSnapshotGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSnapshotGroupRequest(DeleteSnapshotGroupRequest source) {
        if (source.SnapshotGroupId != null) {
            this.SnapshotGroupId = new String(source.SnapshotGroupId);
        }
        if (source.SnapshotGroupIds != null) {
            this.SnapshotGroupIds = new String[source.SnapshotGroupIds.length];
            for (int i = 0; i < source.SnapshotGroupIds.length; i++) {
                this.SnapshotGroupIds[i] = new String(source.SnapshotGroupIds[i]);
            }
        }
        if (source.DeleteBindImages != null) {
            this.DeleteBindImages = new Boolean(source.DeleteBindImages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotGroupId", this.SnapshotGroupId);
        this.setParamArraySimple(map, prefix + "SnapshotGroupIds.", this.SnapshotGroupIds);
        this.setParamSimple(map, prefix + "DeleteBindImages", this.DeleteBindImages);

    }
}

