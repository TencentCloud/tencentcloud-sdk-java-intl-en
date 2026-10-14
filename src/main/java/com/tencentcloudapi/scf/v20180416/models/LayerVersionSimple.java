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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayerVersionSimple extends AbstractModel {

    /**
    * Name of the bound layer. Pass an empty string to unbind the layer.
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * Bind or unbind a layer version. To unbind the last layer version associated with a function version, set LayerVersion to 0.
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
     * Get Name of the bound layer. Pass an empty string to unbind the layer. 
     * @return LayerName Name of the bound layer. Pass an empty string to unbind the layer.
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set Name of the bound layer. Pass an empty string to unbind the layer.
     * @param LayerName Name of the bound layer. Pass an empty string to unbind the layer.
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get Bind or unbind a layer version. To unbind the last layer version associated with a function version, set LayerVersion to 0. 
     * @return LayerVersion Bind or unbind a layer version. To unbind the last layer version associated with a function version, set LayerVersion to 0.
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set Bind or unbind a layer version. To unbind the last layer version associated with a function version, set LayerVersion to 0.
     * @param LayerVersion Bind or unbind a layer version. To unbind the last layer version associated with a function version, set LayerVersion to 0.
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    public LayerVersionSimple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LayerVersionSimple(LayerVersionSimple source) {
        if (source.LayerName != null) {
            this.LayerName = new String(source.LayerName);
        }
        if (source.LayerVersion != null) {
            this.LayerVersion = new Long(source.LayerVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);

    }
}

