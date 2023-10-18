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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotFileInfo extends AbstractModel {

    /**
    * Snapshot policy ID
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * ID of the instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Snapshot file ID
    */
    @SerializedName("SnapshotFileId")
    @Expose
    private String SnapshotFileId;

    /**
    * Backup time
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Operator UIN
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Snapshot policy ID 
     * @return SnapshotPolicyId Snapshot policy ID
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set Snapshot policy ID
     * @param SnapshotPolicyId Snapshot policy ID
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
    }

    /**
     * Get ID of the instance. 
     * @return InstanceId ID of the instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance.
     * @param InstanceId ID of the instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Snapshot file ID 
     * @return SnapshotFileId Snapshot file ID
     */
    public String getSnapshotFileId() {
        return this.SnapshotFileId;
    }

    /**
     * Set Snapshot file ID
     * @param SnapshotFileId Snapshot file ID
     */
    public void setSnapshotFileId(String SnapshotFileId) {
        this.SnapshotFileId = SnapshotFileId;
    }

    /**
     * Get Backup time 
     * @return BackupTime Backup time
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Backup time
     * @param BackupTime Backup time
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Operator UIN 
     * @return Operator Operator UIN
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator UIN
     * @param Operator Operator UIN
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public SnapshotFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotFileInfo(SnapshotFileInfo source) {
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotFileId != null) {
            this.SnapshotFileId = new String(source.SnapshotFileId);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotFileId", this.SnapshotFileId);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

