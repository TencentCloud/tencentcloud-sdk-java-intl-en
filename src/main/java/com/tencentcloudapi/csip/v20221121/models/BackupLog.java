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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupLog extends AbstractModel {

    /**
    * Index.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Index start time.
    */
    @SerializedName("IndexStartTime")
    @Expose
    private Long IndexStartTime;

    /**
    * Index end time.
    */
    @SerializedName("IndexEndTime")
    @Expose
    private Long IndexEndTime;

    /**
    * Compressed size after backup, in MB.
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * Log status. 0: backup incomplete; 1: backup file; 2: restoration in progress; 3: restored; 4: deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Remaining restore time in minutes. Minutes must be converted by the frontend.
    */
    @SerializedName("RestoreProcessRemindTime")
    @Expose
    private Long RestoreProcessRemindTime;

    /**
    * Time until which restored logs are retained.
    */
    @SerializedName("RestoreRemindTime")
    @Expose
    private Long RestoreRemindTime;

    /**
    * Restoration index size.
    */
    @SerializedName("RestoreIndexSize")
    @Expose
    private Long RestoreIndexSize;

    /**
    * End time of the recovery log execution.
    */
    @SerializedName("RestoreEndTime")
    @Expose
    private Long RestoreEndTime;

    /**
    * appId to which the backup belongs
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Asset ID to which the backup belongs
    */
    @SerializedName("AssetId")
    @Expose
    private Long AssetId;

    /**
    * Account nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * uin of the account to which the asset belongs
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get Index. 
     * @return Id Index.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Index.
     * @param Id Index.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Index start time. 
     * @return IndexStartTime Index start time.
     */
    public Long getIndexStartTime() {
        return this.IndexStartTime;
    }

    /**
     * Set Index start time.
     * @param IndexStartTime Index start time.
     */
    public void setIndexStartTime(Long IndexStartTime) {
        this.IndexStartTime = IndexStartTime;
    }

    /**
     * Get Index end time. 
     * @return IndexEndTime Index end time.
     */
    public Long getIndexEndTime() {
        return this.IndexEndTime;
    }

    /**
     * Set Index end time.
     * @param IndexEndTime Index end time.
     */
    public void setIndexEndTime(Long IndexEndTime) {
        this.IndexEndTime = IndexEndTime;
    }

    /**
     * Get Compressed size after backup, in MB. 
     * @return BackupSize Compressed size after backup, in MB.
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set Compressed size after backup, in MB.
     * @param BackupSize Compressed size after backup, in MB.
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get Log status. 0: backup incomplete; 1: backup file; 2: restoration in progress; 3: restored; 4: deleted. 
     * @return Status Log status. 0: backup incomplete; 1: backup file; 2: restoration in progress; 3: restored; 4: deleted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Log status. 0: backup incomplete; 1: backup file; 2: restoration in progress; 3: restored; 4: deleted.
     * @param Status Log status. 0: backup incomplete; 1: backup file; 2: restoration in progress; 3: restored; 4: deleted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Remaining restore time in minutes. Minutes must be converted by the frontend. 
     * @return RestoreProcessRemindTime Remaining restore time in minutes. Minutes must be converted by the frontend.
     */
    public Long getRestoreProcessRemindTime() {
        return this.RestoreProcessRemindTime;
    }

    /**
     * Set Remaining restore time in minutes. Minutes must be converted by the frontend.
     * @param RestoreProcessRemindTime Remaining restore time in minutes. Minutes must be converted by the frontend.
     */
    public void setRestoreProcessRemindTime(Long RestoreProcessRemindTime) {
        this.RestoreProcessRemindTime = RestoreProcessRemindTime;
    }

    /**
     * Get Time until which restored logs are retained. 
     * @return RestoreRemindTime Time until which restored logs are retained.
     */
    public Long getRestoreRemindTime() {
        return this.RestoreRemindTime;
    }

    /**
     * Set Time until which restored logs are retained.
     * @param RestoreRemindTime Time until which restored logs are retained.
     */
    public void setRestoreRemindTime(Long RestoreRemindTime) {
        this.RestoreRemindTime = RestoreRemindTime;
    }

    /**
     * Get Restoration index size. 
     * @return RestoreIndexSize Restoration index size.
     */
    public Long getRestoreIndexSize() {
        return this.RestoreIndexSize;
    }

    /**
     * Set Restoration index size.
     * @param RestoreIndexSize Restoration index size.
     */
    public void setRestoreIndexSize(Long RestoreIndexSize) {
        this.RestoreIndexSize = RestoreIndexSize;
    }

    /**
     * Get End time of the recovery log execution. 
     * @return RestoreEndTime End time of the recovery log execution.
     */
    public Long getRestoreEndTime() {
        return this.RestoreEndTime;
    }

    /**
     * Set End time of the recovery log execution.
     * @param RestoreEndTime End time of the recovery log execution.
     */
    public void setRestoreEndTime(Long RestoreEndTime) {
        this.RestoreEndTime = RestoreEndTime;
    }

    /**
     * Get appId to which the backup belongs 
     * @return AppId appId to which the backup belongs
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appId to which the backup belongs
     * @param AppId appId to which the backup belongs
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Asset ID to which the backup belongs 
     * @return AssetId Asset ID to which the backup belongs
     */
    public Long getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID to which the backup belongs
     * @param AssetId Asset ID to which the backup belongs
     */
    public void setAssetId(Long AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Account nickname 
     * @return NickName Account nickname
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account nickname
     * @param NickName Account nickname
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get uin of the account to which the asset belongs 
     * @return Uin uin of the account to which the asset belongs
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set uin of the account to which the asset belongs
     * @param Uin uin of the account to which the asset belongs
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public BackupLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupLog(BackupLog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IndexStartTime != null) {
            this.IndexStartTime = new Long(source.IndexStartTime);
        }
        if (source.IndexEndTime != null) {
            this.IndexEndTime = new Long(source.IndexEndTime);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RestoreProcessRemindTime != null) {
            this.RestoreProcessRemindTime = new Long(source.RestoreProcessRemindTime);
        }
        if (source.RestoreRemindTime != null) {
            this.RestoreRemindTime = new Long(source.RestoreRemindTime);
        }
        if (source.RestoreIndexSize != null) {
            this.RestoreIndexSize = new Long(source.RestoreIndexSize);
        }
        if (source.RestoreEndTime != null) {
            this.RestoreEndTime = new Long(source.RestoreEndTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetId != null) {
            this.AssetId = new Long(source.AssetId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IndexStartTime", this.IndexStartTime);
        this.setParamSimple(map, prefix + "IndexEndTime", this.IndexEndTime);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RestoreProcessRemindTime", this.RestoreProcessRemindTime);
        this.setParamSimple(map, prefix + "RestoreRemindTime", this.RestoreRemindTime);
        this.setParamSimple(map, prefix + "RestoreIndexSize", this.RestoreIndexSize);
        this.setParamSimple(map, prefix + "RestoreEndTime", this.RestoreEndTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

