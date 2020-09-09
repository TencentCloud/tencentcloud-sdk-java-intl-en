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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLayerVersionRequest extends AbstractModel{

    /**
    * Layer name
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * Version number
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
     * Get Layer name 
     * @return LayerName Layer name
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set Layer name
     * @param LayerName Layer name
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get Version number 
     * @return LayerVersion Version number
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set Version number
     * @param LayerVersion Version number
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);

    }
}
