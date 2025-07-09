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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupRecords extends AbstractModel {

    /**
    * Table group ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Backup source
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * File tag: TCAPLUS_FULL or OSDATA
    */
    @SerializedName("FileTag")
    @Expose
    private String FileTag;

    /**
    * Number of shards
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * Backup batch date
    */
    @SerializedName("BackupBatchTime")
    @Expose
    private String BackupBatchTime;

    /**
    * Total size of backup files
    */
    @SerializedName("BackupFileSize")
    @Expose
    private Long BackupFileSize;

    /**
    * Backup success rate
    */
    @SerializedName("BackupSuccRate")
    @Expose
    private String BackupSuccRate;

    /**
    * Backup file expiration time
    */
    @SerializedName("BackupExpireTime")
    @Expose
    private String BackupExpireTime;

    /**
    * Business ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get Table group ID 
     * @return ZoneId Table group ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Table group ID
     * @param ZoneId Table group ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Backup source 
     * @return BackupType Backup source
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup source
     * @param BackupType Backup source
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get File tag: TCAPLUS_FULL or OSDATA 
     * @return FileTag File tag: TCAPLUS_FULL or OSDATA
     */
    public String getFileTag() {
        return this.FileTag;
    }

    /**
     * Set File tag: TCAPLUS_FULL or OSDATA
     * @param FileTag File tag: TCAPLUS_FULL or OSDATA
     */
    public void setFileTag(String FileTag) {
        this.FileTag = FileTag;
    }

    /**
     * Get Number of shards 
     * @return ShardCount Number of shards
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set Number of shards
     * @param ShardCount Number of shards
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get Backup batch date 
     * @return BackupBatchTime Backup batch date
     */
    public String getBackupBatchTime() {
        return this.BackupBatchTime;
    }

    /**
     * Set Backup batch date
     * @param BackupBatchTime Backup batch date
     */
    public void setBackupBatchTime(String BackupBatchTime) {
        this.BackupBatchTime = BackupBatchTime;
    }

    /**
     * Get Total size of backup files 
     * @return BackupFileSize Total size of backup files
     */
    public Long getBackupFileSize() {
        return this.BackupFileSize;
    }

    /**
     * Set Total size of backup files
     * @param BackupFileSize Total size of backup files
     */
    public void setBackupFileSize(Long BackupFileSize) {
        this.BackupFileSize = BackupFileSize;
    }

    /**
     * Get Backup success rate 
     * @return BackupSuccRate Backup success rate
     */
    public String getBackupSuccRate() {
        return this.BackupSuccRate;
    }

    /**
     * Set Backup success rate
     * @param BackupSuccRate Backup success rate
     */
    public void setBackupSuccRate(String BackupSuccRate) {
        this.BackupSuccRate = BackupSuccRate;
    }

    /**
     * Get Backup file expiration time 
     * @return BackupExpireTime Backup file expiration time
     */
    public String getBackupExpireTime() {
        return this.BackupExpireTime;
    }

    /**
     * Set Backup file expiration time
     * @param BackupExpireTime Backup file expiration time
     */
    public void setBackupExpireTime(String BackupExpireTime) {
        this.BackupExpireTime = BackupExpireTime;
    }

    /**
     * Get Business ID 
     * @return AppId Business ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Business ID
     * @param AppId Business ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public BackupRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupRecords(BackupRecords source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.FileTag != null) {
            this.FileTag = new String(source.FileTag);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.BackupBatchTime != null) {
            this.BackupBatchTime = new String(source.BackupBatchTime);
        }
        if (source.BackupFileSize != null) {
            this.BackupFileSize = new Long(source.BackupFileSize);
        }
        if (source.BackupSuccRate != null) {
            this.BackupSuccRate = new String(source.BackupSuccRate);
        }
        if (source.BackupExpireTime != null) {
            this.BackupExpireTime = new String(source.BackupExpireTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "FileTag", this.FileTag);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "BackupBatchTime", this.BackupBatchTime);
        this.setParamSimple(map, prefix + "BackupFileSize", this.BackupFileSize);
        this.setParamSimple(map, prefix + "BackupSuccRate", this.BackupSuccRate);
        this.setParamSimple(map, prefix + "BackupExpireTime", this.BackupExpireTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

