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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentStrategy extends AbstractModel {

    /**
    * Environment name
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Throttling value
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get Environment name 
     * @return EnvironmentName Environment name
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
     * @param EnvironmentName Environment name
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Throttling value 
     * @return Quota Throttling value
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set Throttling value
     * @param Quota Throttling value
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public EnvironmentStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentStrategy(EnvironmentStrategy source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

