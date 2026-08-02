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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupVolumeInfo extends AbstractModel {

    /**
    * Backup usage
    */
    @SerializedName("BackupVolume")
    @Expose
    private Float BackupVolume;

    /**
    * Backup type
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Backup method
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
     * Get Backup usage 
     * @return BackupVolume Backup usage
     */
    public Float getBackupVolume() {
        return this.BackupVolume;
    }

    /**
     * Set Backup usage
     * @param BackupVolume Backup usage
     */
    public void setBackupVolume(Float BackupVolume) {
        this.BackupVolume = BackupVolume;
    }

    /**
     * Get Backup type 
     * @return BackupType Backup type
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type
     * @param BackupType Backup type
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup method 
     * @return BackupMethod Backup method
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Backup method
     * @param BackupMethod Backup method
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    public BackupVolumeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupVolumeInfo(BackupVolumeInfo source) {
        if (source.BackupVolume != null) {
            this.BackupVolume = new Float(source.BackupVolume);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupVolume", this.BackupVolume);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);

    }
}

