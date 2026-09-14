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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccelerateAreasRequest extends AbstractModel {

    /**
    * Global acceleration instance ID.
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * Acceleration region ID.
    */
    @SerializedName("AcceleratorAreaIds")
    @Expose
    private String [] AcceleratorAreaIds;

    /**
     * Get Global acceleration instance ID. 
     * @return GlobalAcceleratorId Global acceleration instance ID.
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set Global acceleration instance ID.
     * @param GlobalAcceleratorId Global acceleration instance ID.
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get Acceleration region ID. 
     * @return AcceleratorAreaIds Acceleration region ID.
     */
    public String [] getAcceleratorAreaIds() {
        return this.AcceleratorAreaIds;
    }

    /**
     * Set Acceleration region ID.
     * @param AcceleratorAreaIds Acceleration region ID.
     */
    public void setAcceleratorAreaIds(String [] AcceleratorAreaIds) {
        this.AcceleratorAreaIds = AcceleratorAreaIds;
    }

    public DeleteAccelerateAreasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccelerateAreasRequest(DeleteAccelerateAreasRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.AcceleratorAreaIds != null) {
            this.AcceleratorAreaIds = new String[source.AcceleratorAreaIds.length];
            for (int i = 0; i < source.AcceleratorAreaIds.length; i++) {
                this.AcceleratorAreaIds[i] = new String(source.AcceleratorAreaIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamArraySimple(map, prefix + "AcceleratorAreaIds.", this.AcceleratorAreaIds);

    }
}

