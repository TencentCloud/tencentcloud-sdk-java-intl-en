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

public class SnapshotPolicy extends AbstractModel {

    /**
    * Snapshot policy name
    */
    @SerializedName("SnapshotPolicyName")
    @Expose
    private String SnapshotPolicyName;

    /**
    * Backup policy type. Values: `operate` (Manual backup); `time` (Scheduled backup)
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Snapshot retention period in days. Range: 1 to 365.
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * Whether to create a new COS bucket. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateNewCos")
    @Expose
    private Boolean CreateNewCos;

    /**
    * Region of the COS bucket
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * COS bucket
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * Snapshot policy ID
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * Scheduled backup policies
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupPolicies")
    @Expose
    private BackupPolicy [] BackupPolicies;

    /**
    * Whether to enable the policy. Values: `True` (default), `False`
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Snapshot policy name 
     * @return SnapshotPolicyName Snapshot policy name
     */
    public String getSnapshotPolicyName() {
        return this.SnapshotPolicyName;
    }

    /**
     * Set Snapshot policy name
     * @param SnapshotPolicyName Snapshot policy name
     */
    public void setSnapshotPolicyName(String SnapshotPolicyName) {
        this.SnapshotPolicyName = SnapshotPolicyName;
    }

    /**
     * Get Backup policy type. Values: `operate` (Manual backup); `time` (Scheduled backup) 
     * @return BackupType Backup policy type. Values: `operate` (Manual backup); `time` (Scheduled backup)
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup policy type. Values: `operate` (Manual backup); `time` (Scheduled backup)
     * @param BackupType Backup policy type. Values: `operate` (Manual backup); `time` (Scheduled backup)
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Snapshot retention period in days. Range: 1 to 365. 
     * @return KeepTime Snapshot retention period in days. Range: 1 to 365.
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set Snapshot retention period in days. Range: 1 to 365.
     * @param KeepTime Snapshot retention period in days. Range: 1 to 365.
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get Whether to create a new COS bucket. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateNewCos Whether to create a new COS bucket. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getCreateNewCos() {
        return this.CreateNewCos;
    }

    /**
     * Set Whether to create a new COS bucket. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateNewCos Whether to create a new COS bucket. It defaults to `False`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateNewCos(Boolean CreateNewCos) {
        this.CreateNewCos = CreateNewCos;
    }

    /**
     * Get Region of the COS bucket 
     * @return CosRegion Region of the COS bucket
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set Region of the COS bucket
     * @param CosRegion Region of the COS bucket
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get COS bucket 
     * @return CosBucket COS bucket
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS bucket
     * @param CosBucket COS bucket
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

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
     * Get Scheduled backup policies
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BackupPolicies Scheduled backup policies
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public BackupPolicy [] getBackupPolicies() {
        return this.BackupPolicies;
    }

    /**
     * Set Scheduled backup policies
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BackupPolicies Scheduled backup policies
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBackupPolicies(BackupPolicy [] BackupPolicies) {
        this.BackupPolicies = BackupPolicies;
    }

    /**
     * Get Whether to enable the policy. Values: `True` (default), `False` 
     * @return Enable Whether to enable the policy. Values: `True` (default), `False`
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the policy. Values: `True` (default), `False`
     * @param Enable Whether to enable the policy. Values: `True` (default), `False`
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public SnapshotPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotPolicy(SnapshotPolicy source) {
        if (source.SnapshotPolicyName != null) {
            this.SnapshotPolicyName = new String(source.SnapshotPolicyName);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.CreateNewCos != null) {
            this.CreateNewCos = new Boolean(source.CreateNewCos);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.BackupPolicies != null) {
            this.BackupPolicies = new BackupPolicy[source.BackupPolicies.length];
            for (int i = 0; i < source.BackupPolicies.length; i++) {
                this.BackupPolicies[i] = new BackupPolicy(source.BackupPolicies[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotPolicyName", this.SnapshotPolicyName);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamSimple(map, prefix + "CreateNewCos", this.CreateNewCos);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamArrayObj(map, prefix + "BackupPolicies.", this.BackupPolicies);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

