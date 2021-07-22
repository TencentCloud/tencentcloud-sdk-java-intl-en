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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSSpeedLimitConfigRequest extends AbstractModel{

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Access rate limit configuration. The configuration ID cannot be empty when you set this parameter.
    */
    @SerializedName("DDoSSpeedLimitConfig")
    @Expose
    private DDoSSpeedLimitConfig DDoSSpeedLimitConfig;

    /**
     * Get Anti-DDoS instance ID 
     * @return InstanceId Anti-DDoS instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param InstanceId Anti-DDoS instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Access rate limit configuration. The configuration ID cannot be empty when you set this parameter. 
     * @return DDoSSpeedLimitConfig Access rate limit configuration. The configuration ID cannot be empty when you set this parameter.
     */
    public DDoSSpeedLimitConfig getDDoSSpeedLimitConfig() {
        return this.DDoSSpeedLimitConfig;
    }

    /**
     * Set Access rate limit configuration. The configuration ID cannot be empty when you set this parameter.
     * @param DDoSSpeedLimitConfig Access rate limit configuration. The configuration ID cannot be empty when you set this parameter.
     */
    public void setDDoSSpeedLimitConfig(DDoSSpeedLimitConfig DDoSSpeedLimitConfig) {
        this.DDoSSpeedLimitConfig = DDoSSpeedLimitConfig;
    }

    public ModifyDDoSSpeedLimitConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSSpeedLimitConfigRequest(ModifyDDoSSpeedLimitConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DDoSSpeedLimitConfig != null) {
            this.DDoSSpeedLimitConfig = new DDoSSpeedLimitConfig(source.DDoSSpeedLimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "DDoSSpeedLimitConfig.", this.DDoSSpeedLimitConfig);

    }
}

