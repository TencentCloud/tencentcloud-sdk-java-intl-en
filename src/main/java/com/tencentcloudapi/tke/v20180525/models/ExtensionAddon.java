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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtensionAddon extends AbstractModel{

    /**
    * Add-on name
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * Add-on information (description of the add-on resource object in JSON string format)
    */
    @SerializedName("AddonParam")
    @Expose
    private String AddonParam;

    /**
     * Get Add-on name 
     * @return AddonName Add-on name
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set Add-on name
     * @param AddonName Add-on name
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get Add-on information (description of the add-on resource object in JSON string format) 
     * @return AddonParam Add-on information (description of the add-on resource object in JSON string format)
     */
    public String getAddonParam() {
        return this.AddonParam;
    }

    /**
     * Set Add-on information (description of the add-on resource object in JSON string format)
     * @param AddonParam Add-on information (description of the add-on resource object in JSON string format)
     */
    public void setAddonParam(String AddonParam) {
        this.AddonParam = AddonParam;
    }

    public ExtensionAddon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtensionAddon(ExtensionAddon source) {
        if (source.AddonName != null) {
            this.AddonName = new String(source.AddonName);
        }
        if (source.AddonParam != null) {
            this.AddonParam = new String(source.AddonParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonParam", this.AddonParam);

    }
}

