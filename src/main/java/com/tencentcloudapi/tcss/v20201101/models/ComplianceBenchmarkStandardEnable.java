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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceBenchmarkStandardEnable extends AbstractModel{

    /**
    * Compliance standard ID
    */
    @SerializedName("StandardId")
    @Expose
    private Long StandardId;

    /**
    * Whether to enable the compliance standard
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get Compliance standard ID 
     * @return StandardId Compliance standard ID
     */
    public Long getStandardId() {
        return this.StandardId;
    }

    /**
     * Set Compliance standard ID
     * @param StandardId Compliance standard ID
     */
    public void setStandardId(Long StandardId) {
        this.StandardId = StandardId;
    }

    /**
     * Get Whether to enable the compliance standard 
     * @return Enable Whether to enable the compliance standard
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the compliance standard
     * @param Enable Whether to enable the compliance standard
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public ComplianceBenchmarkStandardEnable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceBenchmarkStandardEnable(ComplianceBenchmarkStandardEnable source) {
        if (source.StandardId != null) {
            this.StandardId = new Long(source.StandardId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StandardId", this.StandardId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

