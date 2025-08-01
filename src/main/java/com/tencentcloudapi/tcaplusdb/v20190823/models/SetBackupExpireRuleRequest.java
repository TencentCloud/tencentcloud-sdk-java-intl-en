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

public class SetBackupExpireRuleRequest extends AbstractModel {

    /**
    * The ID of the cluster where the tables reside
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Array of retention policies
    */
    @SerializedName("BackupExpireRules")
    @Expose
    private BackupExpireRuleInfo [] BackupExpireRules;

    /**
     * Get The ID of the cluster where the tables reside 
     * @return ClusterId The ID of the cluster where the tables reside
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where the tables reside
     * @param ClusterId The ID of the cluster where the tables reside
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Array of retention policies 
     * @return BackupExpireRules Array of retention policies
     */
    public BackupExpireRuleInfo [] getBackupExpireRules() {
        return this.BackupExpireRules;
    }

    /**
     * Set Array of retention policies
     * @param BackupExpireRules Array of retention policies
     */
    public void setBackupExpireRules(BackupExpireRuleInfo [] BackupExpireRules) {
        this.BackupExpireRules = BackupExpireRules;
    }

    public SetBackupExpireRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetBackupExpireRuleRequest(SetBackupExpireRuleRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupExpireRules != null) {
            this.BackupExpireRules = new BackupExpireRuleInfo[source.BackupExpireRules.length];
            for (int i = 0; i < source.BackupExpireRules.length; i++) {
                this.BackupExpireRules[i] = new BackupExpireRuleInfo(source.BackupExpireRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "BackupExpireRules.", this.BackupExpireRules);

    }
}

