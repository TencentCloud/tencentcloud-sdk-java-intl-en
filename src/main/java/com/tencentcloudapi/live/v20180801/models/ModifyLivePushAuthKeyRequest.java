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

public class ModifyLivePushAuthKeyRequest extends AbstractModel{

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Master authentication key.
If this parameter is left empty, the current value will not be modified.
    */
    @SerializedName("MasterAuthKey")
    @Expose
    private String MasterAuthKey;

    /**
    * Backup authentication key.
If this parameter is left empty, the current value will not be modified.
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
     * Get Push domain name. 
     * @return DomainName Push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Push domain name.
     * @param DomainName Push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified. 
     * @return Enable Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
     * @param Enable Whether to enable. 0: disabled; 1: enabled.
If this parameter is left empty, the current value will not be modified.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Master authentication key.
If this parameter is left empty, the current value will not be modified. 
     * @return MasterAuthKey Master authentication key.
If this parameter is left empty, the current value will not be modified.
     */
    public String getMasterAuthKey() {
        return this.MasterAuthKey;
    }

    /**
     * Set Master authentication key.
If this parameter is left empty, the current value will not be modified.
     * @param MasterAuthKey Master authentication key.
If this parameter is left empty, the current value will not be modified.
     */
    public void setMasterAuthKey(String MasterAuthKey) {
        this.MasterAuthKey = MasterAuthKey;
    }

    /**
     * Get Backup authentication key.
If this parameter is left empty, the current value will not be modified. 
     * @return BackupAuthKey Backup authentication key.
If this parameter is left empty, the current value will not be modified.
     */
    public String getBackupAuthKey() {
        return this.BackupAuthKey;
    }

    /**
     * Set Backup authentication key.
If this parameter is left empty, the current value will not be modified.
     * @param BackupAuthKey Backup authentication key.
If this parameter is left empty, the current value will not be modified.
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

    public ModifyLivePushAuthKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLivePushAuthKeyRequest(ModifyLivePushAuthKeyRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.MasterAuthKey != null) {
            this.MasterAuthKey = new String(source.MasterAuthKey);
        }
        if (source.BackupAuthKey != null) {
            this.BackupAuthKey = new String(source.BackupAuthKey);
        }
        if (source.AuthDelta != null) {
            this.AuthDelta = new Long(source.AuthDelta);
        }
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

