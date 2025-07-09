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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneStatusRequest extends AbstractModel {

    /**
    * Site ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Site status.
- `false`: Enable the site.
- `true`: Disable the site.
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
     * Get Site ID 
     * @return Id Site ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Site ID
     * @param Id Site ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Site status.
- `false`: Enable the site.
- `true`: Disable the site. 
     * @return Paused Site status.
- `false`: Enable the site.
- `true`: Disable the site.
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Site status.
- `false`: Enable the site.
- `true`: Disable the site.
     * @param Paused Site status.
- `false`: Enable the site.
- `true`: Disable the site.
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    public ModifyZoneStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneStatusRequest(ModifyZoneStatusRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Paused", this.Paused);

    }
}

