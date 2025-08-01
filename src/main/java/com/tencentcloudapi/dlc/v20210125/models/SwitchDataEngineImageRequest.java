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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDataEngineImageRequest extends AbstractModel {

    /**
    * Engine ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * New image version ID
    */
    @SerializedName("NewImageVersionId")
    @Expose
    private String NewImageVersionId;

    /**
     * Get Engine ID 
     * @return DataEngineId Engine ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Engine ID
     * @param DataEngineId Engine ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get New image version ID 
     * @return NewImageVersionId New image version ID
     */
    public String getNewImageVersionId() {
        return this.NewImageVersionId;
    }

    /**
     * Set New image version ID
     * @param NewImageVersionId New image version ID
     */
    public void setNewImageVersionId(String NewImageVersionId) {
        this.NewImageVersionId = NewImageVersionId;
    }

    public SwitchDataEngineImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDataEngineImageRequest(SwitchDataEngineImageRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.NewImageVersionId != null) {
            this.NewImageVersionId = new String(source.NewImageVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "NewImageVersionId", this.NewImageVersionId);

    }
}

