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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LevelOption extends AbstractModel {

    /**
    * Alarm/risk type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Alarm severity (1: notification, 2: low risk, 3: medium risk, 4: high risk, 5: critical)
    */
    @SerializedName("Level")
    @Expose
    private Long [] Level;

    /**
     * Get Alarm/risk type 
     * @return Type Alarm/risk type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alarm/risk type
     * @param Type Alarm/risk type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm severity (1: notification, 2: low risk, 3: medium risk, 4: high risk, 5: critical) 
     * @return Level Alarm severity (1: notification, 2: low risk, 3: medium risk, 4: high risk, 5: critical)
     */
    public Long [] getLevel() {
        return this.Level;
    }

    /**
     * Set Alarm severity (1: notification, 2: low risk, 3: medium risk, 4: high risk, 5: critical)
     * @param Level Alarm severity (1: notification, 2: low risk, 3: medium risk, 4: high risk, 5: critical)
     */
    public void setLevel(Long [] Level) {
        this.Level = Level;
    }

    public LevelOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LevelOption(LevelOption source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Level != null) {
            this.Level = new Long[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new Long(source.Level[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);

    }
}

