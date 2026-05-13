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

public class ModifySnapshotAttributeRequest extends AbstractModel {

    /**
    * Snapshot ID. can be queried via DescribeSnapshots (https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1).
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Snapshot retention mode. Valid values: `FALSE`: non-permanent retention; `TRUE`: permanent retention.
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * Name of new snapshot. Maximum length is 60 bytes.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Specifies the snapshot expiration time. the snapshot will be simultaneously set to the non-permanent retention method. snapshots exceeding the expiry time will be automatically deleted. note: this parameter is valid only when IsPermanent is False.
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * Get Snapshot ID. can be queried via DescribeSnapshots (https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1). 
     * @return SnapshotId Snapshot ID. can be queried via DescribeSnapshots (https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1).
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID. can be queried via DescribeSnapshots (https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1).
     * @param SnapshotId Snapshot ID. can be queried via DescribeSnapshots (https://www.tencentcloud.com/document/api/362/15647?from_cn_redirect=1).
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
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
     * Get Specifies the snapshot expiration time. the snapshot will be simultaneously set to the non-permanent retention method. snapshots exceeding the expiry time will be automatically deleted. note: this parameter is valid only when IsPermanent is False. 
     * @return Deadline Specifies the snapshot expiration time. the snapshot will be simultaneously set to the non-permanent retention method. snapshots exceeding the expiry time will be automatically deleted. note: this parameter is valid only when IsPermanent is False.
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Specifies the snapshot expiration time. the snapshot will be simultaneously set to the non-permanent retention method. snapshots exceeding the expiry time will be automatically deleted. note: this parameter is valid only when IsPermanent is False.
     * @param Deadline Specifies the snapshot expiration time. the snapshot will be simultaneously set to the non-permanent retention method. snapshots exceeding the expiry time will be automatically deleted. note: this parameter is valid only when IsPermanent is False.
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
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
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
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

