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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceBackupModeRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup mode:
- SecondLevelBackup: second-level backup.
- NormalLevelBackup: ordinary backup.
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup mode:
- SecondLevelBackup: second-level backup.
- NormalLevelBackup: ordinary backup. 
     * @return BackupMode Backup mode:
- SecondLevelBackup: second-level backup.
- NormalLevelBackup: ordinary backup.
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set Backup mode:
- SecondLevelBackup: second-level backup.
- NormalLevelBackup: ordinary backup.
     * @param BackupMode Backup mode:
- SecondLevelBackup: second-level backup.
- NormalLevelBackup: ordinary backup.
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    public ModifyInstanceBackupModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceBackupModeRequest(ModifyInstanceBackupModeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMode != null) {
            this.BackupMode = new String(source.BackupMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMode", this.BackupMode);

    }
}

