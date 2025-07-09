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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenNameValue extends AbstractModel {

    /**
    * Statistics type: Different APIs correspond to different content
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Statistics quantity
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Statistics type: Different APIs correspond to different content 
     * @return Name Statistics type: Different APIs correspond to different content
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Statistics type: Different APIs correspond to different content
     * @param Name Statistics type: Different APIs correspond to different content
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Statistics quantity 
     * @return Value Statistics quantity
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Statistics quantity
     * @param Value Statistics quantity
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public ScreenNameValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenNameValue(ScreenNameValue source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

