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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueLevel extends AbstractModel {

    /**
    * Tags, such as politics.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Sensitivity
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get Tags, such as politics. 
     * @return Label Tags, such as politics.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tags, such as politics.
     * @param Label Tags, such as politics.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Sensitivity 
     * @return Level Sensitivity
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Sensitivity
     * @param Level Sensitivity
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public ValueLevel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueLevel(ValueLevel source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

