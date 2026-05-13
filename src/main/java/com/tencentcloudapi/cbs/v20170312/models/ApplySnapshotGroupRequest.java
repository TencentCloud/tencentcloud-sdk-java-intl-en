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

public class ApplySnapshotGroupRequest extends AbstractModel {

    /**
    * Specifies the snapshot group ID rolled back.
    */
    @SerializedName("SnapshotGroupId")
    @Expose
    private String SnapshotGroupId;

    /**
    * Specifies the snapshot ID associated with the rollback snapshot group and the original cloud disk ID list of the corresponding snapshot.
    */
    @SerializedName("ApplyDisks")
    @Expose
    private ApplyDisk [] ApplyDisks;

    /**
    * Specifies whether to perform automatic shutdown before rollback.
    */
    @SerializedName("AutoStopInstance")
    @Expose
    private Boolean AutoStopInstance;

    /**
    * Specifies whether to automatically start after completion.
    */
    @SerializedName("AutoStartInstance")
    @Expose
    private Boolean AutoStartInstance;

    /**
     * Get Specifies the snapshot group ID rolled back. 
     * @return SnapshotGroupId Specifies the snapshot group ID rolled back.
     */
    public String getSnapshotGroupId() {
        return this.SnapshotGroupId;
    }

    /**
     * Set Specifies the snapshot group ID rolled back.
     * @param SnapshotGroupId Specifies the snapshot group ID rolled back.
     */
    public void setSnapshotGroupId(String SnapshotGroupId) {
        this.SnapshotGroupId = SnapshotGroupId;
    }

    /**
     * Get Specifies the snapshot ID associated with the rollback snapshot group and the original cloud disk ID list of the corresponding snapshot. 
     * @return ApplyDisks Specifies the snapshot ID associated with the rollback snapshot group and the original cloud disk ID list of the corresponding snapshot.
     */
    public ApplyDisk [] getApplyDisks() {
        return this.ApplyDisks;
    }

    /**
     * Set Specifies the snapshot ID associated with the rollback snapshot group and the original cloud disk ID list of the corresponding snapshot.
     * @param ApplyDisks Specifies the snapshot ID associated with the rollback snapshot group and the original cloud disk ID list of the corresponding snapshot.
     */
    public void setApplyDisks(ApplyDisk [] ApplyDisks) {
        this.ApplyDisks = ApplyDisks;
    }

    /**
     * Get Specifies whether to perform automatic shutdown before rollback. 
     * @return AutoStopInstance Specifies whether to perform automatic shutdown before rollback.
     */
    public Boolean getAutoStopInstance() {
        return this.AutoStopInstance;
    }

    /**
     * Set Specifies whether to perform automatic shutdown before rollback.
     * @param AutoStopInstance Specifies whether to perform automatic shutdown before rollback.
     */
    public void setAutoStopInstance(Boolean AutoStopInstance) {
        this.AutoStopInstance = AutoStopInstance;
    }

    /**
     * Get Specifies whether to automatically start after completion. 
     * @return AutoStartInstance Specifies whether to automatically start after completion.
     */
    public Boolean getAutoStartInstance() {
        return this.AutoStartInstance;
    }

    /**
     * Set Specifies whether to automatically start after completion.
     * @param AutoStartInstance Specifies whether to automatically start after completion.
     */
    public void setAutoStartInstance(Boolean AutoStartInstance) {
        this.AutoStartInstance = AutoStartInstance;
    }

    public ApplySnapshotGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplySnapshotGroupRequest(ApplySnapshotGroupRequest source) {
        if (source.SnapshotGroupId != null) {
            this.SnapshotGroupId = new String(source.SnapshotGroupId);
        }
        if (source.ApplyDisks != null) {
            this.ApplyDisks = new ApplyDisk[source.ApplyDisks.length];
            for (int i = 0; i < source.ApplyDisks.length; i++) {
                this.ApplyDisks[i] = new ApplyDisk(source.ApplyDisks[i]);
            }
        }
        if (source.AutoStopInstance != null) {
            this.AutoStopInstance = new Boolean(source.AutoStopInstance);
        }
        if (source.AutoStartInstance != null) {
            this.AutoStartInstance = new Boolean(source.AutoStartInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotGroupId", this.SnapshotGroupId);
        this.setParamArrayObj(map, prefix + "ApplyDisks.", this.ApplyDisks);
        this.setParamSimple(map, prefix + "AutoStopInstance", this.AutoStopInstance);
        this.setParamSimple(map, prefix + "AutoStartInstance", this.AutoStartInstance);

    }
}

