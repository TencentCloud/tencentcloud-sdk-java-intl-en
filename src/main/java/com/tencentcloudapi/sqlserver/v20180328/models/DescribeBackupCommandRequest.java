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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupCommandRequest extends AbstractModel {

    /**
    * Backup file type. Full: full backup. FULL_LOG: full backup which needs log increments. FULL_DIFF: full backup which needs differential increments. LOG: log backup. DIFF: differential backup.
    */
    @SerializedName("BackupFileType")
    @Expose
    private String BackupFileType;

    /**
    * Database name
    */
    @SerializedName("DataBaseName")
    @Expose
    private String DataBaseName;

    /**
    * Whether restoration is required. No: not required. Yes: required.
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

    /**
    * Storage path of backup files. If this parameter is left empty, the default storage path will be D:\\.
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
     * Get Backup file type. Full: full backup. FULL_LOG: full backup which needs log increments. FULL_DIFF: full backup which needs differential increments. LOG: log backup. DIFF: differential backup. 
     * @return BackupFileType Backup file type. Full: full backup. FULL_LOG: full backup which needs log increments. FULL_DIFF: full backup which needs differential increments. LOG: log backup. DIFF: differential backup.
     */
    public String getBackupFileType() {
        return this.BackupFileType;
    }

    /**
     * Set Backup file type. Full: full backup. FULL_LOG: full backup which needs log increments. FULL_DIFF: full backup which needs differential increments. LOG: log backup. DIFF: differential backup.
     * @param BackupFileType Backup file type. Full: full backup. FULL_LOG: full backup which needs log increments. FULL_DIFF: full backup which needs differential increments. LOG: log backup. DIFF: differential backup.
     */
    public void setBackupFileType(String BackupFileType) {
        this.BackupFileType = BackupFileType;
    }

    /**
     * Get Database name 
     * @return DataBaseName Database name
     */
    public String getDataBaseName() {
        return this.DataBaseName;
    }

    /**
     * Set Database name
     * @param DataBaseName Database name
     */
    public void setDataBaseName(String DataBaseName) {
        this.DataBaseName = DataBaseName;
    }

    /**
     * Get Whether restoration is required. No: not required. Yes: required. 
     * @return IsRecovery Whether restoration is required. No: not required. Yes: required.
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set Whether restoration is required. No: not required. Yes: required.
     * @param IsRecovery Whether restoration is required. No: not required. Yes: required.
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
    }

    /**
     * Get Storage path of backup files. If this parameter is left empty, the default storage path will be D:\\. 
     * @return LocalPath Storage path of backup files. If this parameter is left empty, the default storage path will be D:\\.
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Storage path of backup files. If this parameter is left empty, the default storage path will be D:\\.
     * @param LocalPath Storage path of backup files. If this parameter is left empty, the default storage path will be D:\\.
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    public DescribeBackupCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupCommandRequest(DescribeBackupCommandRequest source) {
        if (source.BackupFileType != null) {
            this.BackupFileType = new String(source.BackupFileType);
        }
        if (source.DataBaseName != null) {
            this.DataBaseName = new String(source.DataBaseName);
        }
        if (source.IsRecovery != null) {
            this.IsRecovery = new String(source.IsRecovery);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupFileType", this.BackupFileType);
        this.setParamSimple(map, prefix + "DataBaseName", this.DataBaseName);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);

    }
}

