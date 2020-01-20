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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushAuthKeyInfo extends AbstractModel{

    /**
    * Domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable. 0: disabled; 1: enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Master authentication key.
    */
    @SerializedName("MasterAuthKey")
    @Expose
    private String MasterAuthKey;

    /**
    * Backup authentication key.
    */
    @SerializedName("BackupAuthKey")
    @Expose
    private String BackupAuthKey;

    /**
    * Validity period in seconds.
    */
    @SerializedName("AuthDelta")
    @Expose
    private Long AuthDelta;

    /**
     * Get Domain name. 
     * @return DomainName Domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name.
     * @param DomainName Domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to enable. 0: disabled; 1: enabled. 
     * @return Enable Whether to enable. 0: disabled; 1: enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. 0: disabled; 1: enabled.
     * @param Enable Whether to enable. 0: disabled; 1: enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Master authentication key. 
     * @return MasterAuthKey Master authentication key.
     */
    public String getMasterAuthKey() {
        return this.MasterAuthKey;
    }

    /**
     * Set Master authentication key.
     * @param MasterAuthKey Master authentication key.
     */
    public void setMasterAuthKey(String MasterAuthKey) {
        this.MasterAuthKey = MasterAuthKey;
    }

    /**
     * Get Backup authentication key. 
     * @return BackupAuthKey Backup authentication key.
     */
    public String getBackupAuthKey() {
        return this.BackupAuthKey;
    }

    /**
     * Set Backup authentication key.
     * @param BackupAuthKey Backup authentication key.
     */
    public void setBackupAuthKey(String BackupAuthKey) {
        this.BackupAuthKey = BackupAuthKey;
    }

    /**
     * Get Validity period in seconds. 
     * @return AuthDelta Validity period in seconds.
     */
    public Long getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * Set Validity period in seconds.
     * @param AuthDelta Validity period in seconds.
     */
    public void setAuthDelta(Long AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MasterAuthKey", this.MasterAuthKey);
        this.setParamSimple(map, prefix + "BackupAuthKey", this.BackupAuthKey);
        this.setParamSimple(map, prefix + "AuthDelta", this.AuthDelta);

    }
}

