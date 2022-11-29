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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedOriginGroup extends AbstractModel{

    /**
    * Matching condition. The "Target" field must be unique.
    */
    @SerializedName("OriginGroupConditions")
    @Expose
    private OriginGroupCondition [] OriginGroupConditions;

    /**
    * ID of the primary origin server.
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * ID of the secondary origin server.
    */
    @SerializedName("BackupOriginGroupId")
    @Expose
    private String BackupOriginGroupId;

    /**
     * Get Matching condition. The "Target" field must be unique. 
     * @return OriginGroupConditions Matching condition. The "Target" field must be unique.
     */
    public OriginGroupCondition [] getOriginGroupConditions() {
        return this.OriginGroupConditions;
    }

    /**
     * Set Matching condition. The "Target" field must be unique.
     * @param OriginGroupConditions Matching condition. The "Target" field must be unique.
     */
    public void setOriginGroupConditions(OriginGroupCondition [] OriginGroupConditions) {
        this.OriginGroupConditions = OriginGroupConditions;
    }

    /**
     * Get ID of the primary origin server. 
     * @return OriginGroupId ID of the primary origin server.
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set ID of the primary origin server.
     * @param OriginGroupId ID of the primary origin server.
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get ID of the secondary origin server. 
     * @return BackupOriginGroupId ID of the secondary origin server.
     */
    public String getBackupOriginGroupId() {
        return this.BackupOriginGroupId;
    }

    /**
     * Set ID of the secondary origin server.
     * @param BackupOriginGroupId ID of the secondary origin server.
     */
    public void setBackupOriginGroupId(String BackupOriginGroupId) {
        this.BackupOriginGroupId = BackupOriginGroupId;
    }

    public AdvancedOriginGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedOriginGroup(AdvancedOriginGroup source) {
        if (source.OriginGroupConditions != null) {
            this.OriginGroupConditions = new OriginGroupCondition[source.OriginGroupConditions.length];
            for (int i = 0; i < source.OriginGroupConditions.length; i++) {
                this.OriginGroupConditions[i] = new OriginGroupCondition(source.OriginGroupConditions[i]);
            }
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.BackupOriginGroupId != null) {
            this.BackupOriginGroupId = new String(source.BackupOriginGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OriginGroupConditions.", this.OriginGroupConditions);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "BackupOriginGroupId", this.BackupOriginGroupId);

    }
}

