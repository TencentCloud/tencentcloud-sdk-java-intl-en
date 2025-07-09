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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskParams extends AbstractModel {

    /**
    * Download address. Download through the COS bucket temporary key.
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
     * Get Download address. Download through the COS bucket temporary key. 
     * @return CosPath Download address. Download through the COS bucket temporary key.
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set Download address. Download through the COS bucket temporary key.
     * @param CosPath Download address. Download through the COS bucket temporary key.
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    public TaskParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskParams(TaskParams source) {
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);

    }
}

