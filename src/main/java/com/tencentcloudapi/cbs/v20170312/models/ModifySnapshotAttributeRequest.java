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

public class ModifySnapshotAttributeRequest extends AbstractModel {

    /**
    * Snapshot ID, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Name of new snapshot. Maximum length is 60 bytes.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Snapshot retention mode. Valid values: `FALSE`: non-permanent retention; `TRUE`: permanent retention.
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * Expiration time of the snapshot. Setting this parameter will set the snapshot retention mode to `FALSE` (non-permanent retention) and the snapshot will be automatically deleted upon expiration.
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * Get Snapshot ID, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1). 
     * @return SnapshotId Snapshot ID, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
     * @param SnapshotId Snapshot ID, which can be queried via [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Name of new snapshot. Maximum length is 60 bytes. 
     * @return SnapshotName Name of new snapshot. Maximum length is 60 bytes.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Name of new snapshot. Maximum length is 60 bytes.
     * @param SnapshotName Name of new snapshot. Maximum length is 60 bytes.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Snapshot retention mode. Valid values: `FALSE`: non-permanent retention; `TRUE`: permanent retention. 
     * @return IsPermanent Snapshot retention mode. Valid values: `FALSE`: non-permanent retention; `TRUE`: permanent retention.
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Snapshot retention mode. Valid values: `FALSE`: non-permanent retention; `TRUE`: permanent retention.
     * @param IsPermanent Snapshot retention mode. Valid values: `FALSE`: non-permanent retention; `TRUE`: permanent retention.
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get Expiration time of the snapshot. Setting this parameter will set the snapshot retention mode to `FALSE` (non-permanent retention) and the snapshot will be automatically deleted upon expiration. 
     * @return Deadline Expiration time of the snapshot. Setting this parameter will set the snapshot retention mode to `FALSE` (non-permanent retention) and the snapshot will be automatically deleted upon expiration.
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Expiration time of the snapshot. Setting this parameter will set the snapshot retention mode to `FALSE` (non-permanent retention) and the snapshot will be automatically deleted upon expiration.
     * @param Deadline Expiration time of the snapshot. Setting this parameter will set the snapshot retention mode to `FALSE` (non-permanent retention) and the snapshot will be automatically deleted upon expiration.
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    public ModifySnapshotAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotAttributeRequest(ModifySnapshotAttributeRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

