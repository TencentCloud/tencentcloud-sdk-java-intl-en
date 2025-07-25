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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instrument extends AbstractModel {

    /**
    * Component name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Component switch.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get Component name. 
     * @return Name Component name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Component name.
     * @param Name Component name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Component switch. 
     * @return Enable Component switch.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Component switch.
     * @param Enable Component switch.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Instrument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instrument(Instrument source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

