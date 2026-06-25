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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoBackUpStrategyRequest extends AbstractModel {

    /**
    * Instance name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Current policy name.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Policy information.
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
     * Get Instance name. 
     * @return InstanceId Instance name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name.
     * @param InstanceId Instance name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Current policy name. 
     * @return StrategyName Current policy name.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Current policy name.
     * @param StrategyName Current policy name.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Policy information. 
     * @return CosBackup Policy information.
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set Policy information.
     * @param CosBackup Policy information.
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    public ModifyAutoBackUpStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoBackUpStrategyRequest(ModifyAutoBackUpStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new CosBackup(source.CosBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamObj(map, prefix + "CosBackup.", this.CosBackup);

    }
}

