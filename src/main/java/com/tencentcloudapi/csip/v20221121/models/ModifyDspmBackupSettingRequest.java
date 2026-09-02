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

public class ModifyDspmBackupSettingRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Backup log retention duration</p>
    */
    @SerializedName("BackupLogSaveTime")
    @Expose
    private Long BackupLogSaveTime;

    /**
    * <p>Recovery log retention duration</p>
    */
    @SerializedName("RestoreLogSaveTime")
    @Expose
    private Long RestoreLogSaveTime;

    /**
    * <p>Maximum lifecycle limit for logs</p>
    */
    @SerializedName("LogMaxSaveTime")
    @Expose
    private Long LogMaxSaveTime;

    /**
    * <p>Maximum days limit for online logs</p>
    */
    @SerializedName("OnlineLogMaxSaveTime")
    @Expose
    private Long OnlineLogMaxSaveTime;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Backup log retention duration</p> 
     * @return BackupLogSaveTime <p>Backup log retention duration</p>
     */
    public Long getBackupLogSaveTime() {
        return this.BackupLogSaveTime;
    }

    /**
     * Set <p>Backup log retention duration</p>
     * @param BackupLogSaveTime <p>Backup log retention duration</p>
     */
    public void setBackupLogSaveTime(Long BackupLogSaveTime) {
        this.BackupLogSaveTime = BackupLogSaveTime;
    }

    /**
     * Get <p>Recovery log retention duration</p> 
     * @return RestoreLogSaveTime <p>Recovery log retention duration</p>
     */
    public Long getRestoreLogSaveTime() {
        return this.RestoreLogSaveTime;
    }

    /**
     * Set <p>Recovery log retention duration</p>
     * @param RestoreLogSaveTime <p>Recovery log retention duration</p>
     */
    public void setRestoreLogSaveTime(Long RestoreLogSaveTime) {
        this.RestoreLogSaveTime = RestoreLogSaveTime;
    }

    /**
     * Get <p>Maximum lifecycle limit for logs</p> 
     * @return LogMaxSaveTime <p>Maximum lifecycle limit for logs</p>
     */
    public Long getLogMaxSaveTime() {
        return this.LogMaxSaveTime;
    }

    /**
     * Set <p>Maximum lifecycle limit for logs</p>
     * @param LogMaxSaveTime <p>Maximum lifecycle limit for logs</p>
     */
    public void setLogMaxSaveTime(Long LogMaxSaveTime) {
        this.LogMaxSaveTime = LogMaxSaveTime;
    }

    /**
     * Get <p>Maximum days limit for online logs</p> 
     * @return OnlineLogMaxSaveTime <p>Maximum days limit for online logs</p>
     */
    public Long getOnlineLogMaxSaveTime() {
        return this.OnlineLogMaxSaveTime;
    }

    /**
     * Set <p>Maximum days limit for online logs</p>
     * @param OnlineLogMaxSaveTime <p>Maximum days limit for online logs</p>
     */
    public void setOnlineLogMaxSaveTime(Long OnlineLogMaxSaveTime) {
        this.OnlineLogMaxSaveTime = OnlineLogMaxSaveTime;
    }

    public ModifyDspmBackupSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmBackupSettingRequest(ModifyDspmBackupSettingRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.BackupLogSaveTime != null) {
            this.BackupLogSaveTime = new Long(source.BackupLogSaveTime);
        }
        if (source.RestoreLogSaveTime != null) {
            this.RestoreLogSaveTime = new Long(source.RestoreLogSaveTime);
        }
        if (source.LogMaxSaveTime != null) {
            this.LogMaxSaveTime = new Long(source.LogMaxSaveTime);
        }
        if (source.OnlineLogMaxSaveTime != null) {
            this.OnlineLogMaxSaveTime = new Long(source.OnlineLogMaxSaveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "BackupLogSaveTime", this.BackupLogSaveTime);
        this.setParamSimple(map, prefix + "RestoreLogSaveTime", this.RestoreLogSaveTime);
        this.setParamSimple(map, prefix + "LogMaxSaveTime", this.LogMaxSaveTime);
        this.setParamSimple(map, prefix + "OnlineLogMaxSaveTime", this.OnlineLogMaxSaveTime);

    }
}

