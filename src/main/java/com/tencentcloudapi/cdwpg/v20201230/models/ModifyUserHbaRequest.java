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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserHbaRequest extends AbstractModel {

    /**
    * InstanceId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Hba array.
    */
    @SerializedName("HbaConfigs")
    @Expose
    private HbaConfig [] HbaConfigs;

    /**
     * Get InstanceId. 
     * @return InstanceId InstanceId.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId.
     * @param InstanceId InstanceId.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Hba array. 
     * @return HbaConfigs Hba array.
     */
    public HbaConfig [] getHbaConfigs() {
        return this.HbaConfigs;
    }

    /**
     * Set Hba array.
     * @param HbaConfigs Hba array.
     */
    public void setHbaConfigs(HbaConfig [] HbaConfigs) {
        this.HbaConfigs = HbaConfigs;
    }

    public ModifyUserHbaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserHbaRequest(ModifyUserHbaRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HbaConfigs != null) {
            this.HbaConfigs = new HbaConfig[source.HbaConfigs.length];
            for (int i = 0; i < source.HbaConfigs.length; i++) {
                this.HbaConfigs[i] = new HbaConfig(source.HbaConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "HbaConfigs.", this.HbaConfigs);

    }
}

