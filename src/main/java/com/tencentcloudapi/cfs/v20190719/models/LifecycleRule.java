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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleRule extends AbstractModel {

    /**
    * <p>Storage type after data dumping. Valid values: InfrequentAccess: Infrequent Access storage. ColdStorage: Cold storage.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>File type for data dumping. Valid values: BIG_FILE: Very large files. STD_FILE: Standard files. SMALL_FILE: Small files. ALL: All files.</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>Data dumping behavior. Valid values: Archive: Archive. Noarchive: Do not archive.</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Trigger time for data dumping. It consists of "DEFAULT_ATIME_" and a number, in the unit of days. Leave this parameter empty when Action is Noarchive.</p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>Maximum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
    */
    @SerializedName("FileMaxSize")
    @Expose
    private String FileMaxSize;

    /**
    * <p>Minimum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
    */
    @SerializedName("FileMinSize")
    @Expose
    private String FileMinSize;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>Threshold range [10-90]</p>
    */
    @SerializedName("ExpireThreshold")
    @Expose
    private Long ExpireThreshold;

    /**
    * <p>Threshold range [10-90]</p>
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
    * <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).</p><p>If this parameter is left empty, the default value is false.</p>
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>Whether to sync new files to S3 in near real time. true: Near real-time sync (within 30 seconds). false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage.</p>
    */
    @SerializedName("IsCreateRealTimeSync")
    @Expose
    private Boolean IsCreateRealTimeSync;

    /**
    * <p>Whether to sync modified files to S3 in near real time. true: Near real-time sync (within 30 seconds) / false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage. It is independent of IsOverwrite.</p>
    */
    @SerializedName("IsModifyRealTimeSync")
    @Expose
    private Boolean IsModifyRealTimeSync;

    /**
    * <p>Whether to sync file deletion to S3. true: Sync deletion (within 30 seconds) / false: Do not sync deletion. The default value is false. If this parameter is set to true, versioning must be enabled for the destination COS Bucket. This parameter takes effect only when StorageType=ExternalStorage.</p>
    */
    @SerializedName("IsSyncDelete")
    @Expose
    private Boolean IsSyncDelete;

    /**
     * Get <p>Storage type after data dumping. Valid values: InfrequentAccess: Infrequent Access storage. ColdStorage: Cold storage.</p> 
     * @return StorageType <p>Storage type after data dumping. Valid values: InfrequentAccess: Infrequent Access storage. ColdStorage: Cold storage.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type after data dumping. Valid values: InfrequentAccess: Infrequent Access storage. ColdStorage: Cold storage.</p>
     * @param StorageType <p>Storage type after data dumping. Valid values: InfrequentAccess: Infrequent Access storage. ColdStorage: Cold storage.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>File type for data dumping. Valid values: BIG_FILE: Very large files. STD_FILE: Standard files. SMALL_FILE: Small files. ALL: All files.</p> 
     * @return FileType <p>File type for data dumping. Valid values: BIG_FILE: Very large files. STD_FILE: Standard files. SMALL_FILE: Small files. ALL: All files.</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type for data dumping. Valid values: BIG_FILE: Very large files. STD_FILE: Standard files. SMALL_FILE: Small files. ALL: All files.</p>
     * @param FileType <p>File type for data dumping. Valid values: BIG_FILE: Very large files. STD_FILE: Standard files. SMALL_FILE: Small files. ALL: All files.</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>Data dumping behavior. Valid values: Archive: Archive. Noarchive: Do not archive.</p> 
     * @return Action <p>Data dumping behavior. Valid values: Archive: Archive. Noarchive: Do not archive.</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Data dumping behavior. Valid values: Archive: Archive. Noarchive: Do not archive.</p>
     * @param Action <p>Data dumping behavior. Valid values: Archive: Archive. Noarchive: Do not archive.</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Trigger time for data dumping. It consists of "DEFAULT_ATIME_" and a number, in the unit of days. Leave this parameter empty when Action is Noarchive.</p> 
     * @return Interval <p>Trigger time for data dumping. It consists of "DEFAULT_ATIME_" and a number, in the unit of days. Leave this parameter empty when Action is Noarchive.</p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Trigger time for data dumping. It consists of "DEFAULT_ATIME_" and a number, in the unit of days. Leave this parameter empty when Action is Noarchive.</p>
     * @param Interval <p>Trigger time for data dumping. It consists of "DEFAULT_ATIME_" and a number, in the unit of days. Leave this parameter empty when Action is Noarchive.</p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Maximum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p> 
     * @return FileMaxSize <p>Maximum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
     */
    public String getFileMaxSize() {
        return this.FileMaxSize;
    }

    /**
     * Set <p>Maximum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
     * @param FileMaxSize <p>Maximum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
     */
    public void setFileMaxSize(String FileMaxSize) {
        this.FileMaxSize = FileMaxSize;
    }

    /**
     * Get <p>Minimum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p> 
     * @return FileMinSize <p>Minimum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
     */
    public String getFileMinSize() {
        return this.FileMinSize;
    }

    /**
     * Set <p>Minimum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
     * @param FileMinSize <p>Minimum size of a file for data dumping. The value must be in the format of "number + unit". Supported units: K (KiB), M (MiB), and G (GiB).</p>
     */
    public void setFileMinSize(String FileMinSize) {
        this.FileMinSize = FileMinSize;
    }

    /**
     * Get <p>Policy type</p> 
     * @return PolicyType <p>Policy type</p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>Policy type</p>
     * @param PolicyType <p>Policy type</p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>Threshold range [10-90]</p> 
     * @return ExpireThreshold <p>Threshold range [10-90]</p>
     */
    public Long getExpireThreshold() {
        return this.ExpireThreshold;
    }

    /**
     * Set <p>Threshold range [10-90]</p>
     * @param ExpireThreshold <p>Threshold range [10-90]</p>
     */
    public void setExpireThreshold(Long ExpireThreshold) {
        this.ExpireThreshold = ExpireThreshold;
    }

    /**
     * Get <p>Threshold range [10-90]</p> 
     * @return TargetThreshold <p>Threshold range [10-90]</p>
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set <p>Threshold range [10-90]</p>
     * @param TargetThreshold <p>Threshold range [10-90]</p>
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    /**
     * Get <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).</p><p>If this parameter is left empty, the default value is false.</p> 
     * @return IsOverwrite <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).</p><p>If this parameter is left empty, the default value is false.</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).</p><p>If this parameter is left empty, the default value is false.</p>
     * @param IsOverwrite <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage.</p><p>true: Overwrite.</p><p>false: Do not overwrite (and hot storage data will not be released).</p><p>If this parameter is left empty, the default value is false.</p>
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>Whether to sync new files to S3 in near real time. true: Near real-time sync (within 30 seconds). false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage.</p> 
     * @return IsCreateRealTimeSync <p>Whether to sync new files to S3 in near real time. true: Near real-time sync (within 30 seconds). false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage.</p>
     */
    public Boolean getIsCreateRealTimeSync() {
        return this.IsCreateRealTimeSync;
    }

    /**
     * Set <p>Whether to sync new files to S3 in near real time. true: Near real-time sync (within 30 seconds). false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage.</p>
     * @param IsCreateRealTimeSync <p>Whether to sync new files to S3 in near real time. true: Near real-time sync (within 30 seconds). false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage.</p>
     */
    public void setIsCreateRealTimeSync(Boolean IsCreateRealTimeSync) {
        this.IsCreateRealTimeSync = IsCreateRealTimeSync;
    }

    /**
     * Get <p>Whether to sync modified files to S3 in near real time. true: Near real-time sync (within 30 seconds) / false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage. It is independent of IsOverwrite.</p> 
     * @return IsModifyRealTimeSync <p>Whether to sync modified files to S3 in near real time. true: Near real-time sync (within 30 seconds) / false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage. It is independent of IsOverwrite.</p>
     */
    public Boolean getIsModifyRealTimeSync() {
        return this.IsModifyRealTimeSync;
    }

    /**
     * Set <p>Whether to sync modified files to S3 in near real time. true: Near real-time sync (within 30 seconds) / false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage. It is independent of IsOverwrite.</p>
     * @param IsModifyRealTimeSync <p>Whether to sync modified files to S3 in near real time. true: Near real-time sync (within 30 seconds) / false: Sync based on the time configured in the policy. The default value is false. This parameter takes effect only when StorageType=ExternalStorage. It is independent of IsOverwrite.</p>
     */
    public void setIsModifyRealTimeSync(Boolean IsModifyRealTimeSync) {
        this.IsModifyRealTimeSync = IsModifyRealTimeSync;
    }

    /**
     * Get <p>Whether to sync file deletion to S3. true: Sync deletion (within 30 seconds) / false: Do not sync deletion. The default value is false. If this parameter is set to true, versioning must be enabled for the destination COS Bucket. This parameter takes effect only when StorageType=ExternalStorage.</p> 
     * @return IsSyncDelete <p>Whether to sync file deletion to S3. true: Sync deletion (within 30 seconds) / false: Do not sync deletion. The default value is false. If this parameter is set to true, versioning must be enabled for the destination COS Bucket. This parameter takes effect only when StorageType=ExternalStorage.</p>
     */
    public Boolean getIsSyncDelete() {
        return this.IsSyncDelete;
    }

    /**
     * Set <p>Whether to sync file deletion to S3. true: Sync deletion (within 30 seconds) / false: Do not sync deletion. The default value is false. If this parameter is set to true, versioning must be enabled for the destination COS Bucket. This parameter takes effect only when StorageType=ExternalStorage.</p>
     * @param IsSyncDelete <p>Whether to sync file deletion to S3. true: Sync deletion (within 30 seconds) / false: Do not sync deletion. The default value is false. If this parameter is set to true, versioning must be enabled for the destination COS Bucket. This parameter takes effect only when StorageType=ExternalStorage.</p>
     */
    public void setIsSyncDelete(Boolean IsSyncDelete) {
        this.IsSyncDelete = IsSyncDelete;
    }

    public LifecycleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleRule(LifecycleRule source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.FileMaxSize != null) {
            this.FileMaxSize = new String(source.FileMaxSize);
        }
        if (source.FileMinSize != null) {
            this.FileMinSize = new String(source.FileMinSize);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.ExpireThreshold != null) {
            this.ExpireThreshold = new Long(source.ExpireThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
        if (source.IsCreateRealTimeSync != null) {
            this.IsCreateRealTimeSync = new Boolean(source.IsCreateRealTimeSync);
        }
        if (source.IsModifyRealTimeSync != null) {
            this.IsModifyRealTimeSync = new Boolean(source.IsModifyRealTimeSync);
        }
        if (source.IsSyncDelete != null) {
            this.IsSyncDelete = new Boolean(source.IsSyncDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "FileMaxSize", this.FileMaxSize);
        this.setParamSimple(map, prefix + "FileMinSize", this.FileMinSize);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "ExpireThreshold", this.ExpireThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamSimple(map, prefix + "IsCreateRealTimeSync", this.IsCreateRealTimeSync);
        this.setParamSimple(map, prefix + "IsModifyRealTimeSync", this.IsModifyRealTimeSync);
        this.setParamSimple(map, prefix + "IsSyncDelete", this.IsSyncDelete);

    }
}

