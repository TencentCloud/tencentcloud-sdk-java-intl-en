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

public class DescribeSgSnapshotFileContentResponse extends AbstractModel {

    /**
    * Security group ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Snapshot policy IDs
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

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
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Original data
    */
    @SerializedName("OriginalData")
    @Expose
    private SecurityGroupPolicy [] OriginalData;

    /**
    * Backup data
    */
    @SerializedName("BackupData")
    @Expose
    private SecurityGroupPolicy [] BackupData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Security group ID 
     * @return InstanceId Security group ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Security group ID
     * @param InstanceId Security group ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Snapshot policy IDs 
     * @return SnapshotPolicyId Snapshot policy IDs
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set Snapshot policy IDs
     * @param SnapshotPolicyId Snapshot policy IDs
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
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
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Original data 
     * @return OriginalData Original data
     */
    public SecurityGroupPolicy [] getOriginalData() {
        return this.OriginalData;
    }

    /**
     * Set Original data
     * @param OriginalData Original data
     */
    public void setOriginalData(SecurityGroupPolicy [] OriginalData) {
        this.OriginalData = OriginalData;
    }

    /**
     * Get Backup data 
     * @return BackupData Backup data
     */
    public SecurityGroupPolicy [] getBackupData() {
        return this.BackupData;
    }

    /**
     * Set Backup data
     * @param BackupData Backup data
     */
    public void setBackupData(SecurityGroupPolicy [] BackupData) {
        this.BackupData = BackupData;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSgSnapshotFileContentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSgSnapshotFileContentResponse(DescribeSgSnapshotFileContentResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
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
        if (source.OriginalData != null) {
            this.OriginalData = new SecurityGroupPolicy[source.OriginalData.length];
            for (int i = 0; i < source.OriginalData.length; i++) {
                this.OriginalData[i] = new SecurityGroupPolicy(source.OriginalData[i]);
            }
        }
        if (source.BackupData != null) {
            this.BackupData = new SecurityGroupPolicy[source.BackupData.length];
            for (int i = 0; i < source.BackupData.length; i++) {
                this.BackupData[i] = new SecurityGroupPolicy(source.BackupData[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "SnapshotFileId", this.SnapshotFileId);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArrayObj(map, prefix + "OriginalData.", this.OriginalData);
        this.setParamArrayObj(map, prefix + "BackupData.", this.BackupData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

