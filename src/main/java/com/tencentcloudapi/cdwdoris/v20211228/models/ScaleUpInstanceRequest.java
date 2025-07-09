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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpInstanceRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node specifications
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Role (MATER/CORE). MASTER corresponds to FE, and CORE corresponds to BE.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node specifications 
     * @return SpecName Node specifications
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Node specifications
     * @param SpecName Node specifications
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Role (MATER/CORE). MASTER corresponds to FE, and CORE corresponds to BE. 
     * @return Type Role (MATER/CORE). MASTER corresponds to FE, and CORE corresponds to BE.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Role (MATER/CORE). MASTER corresponds to FE, and CORE corresponds to BE.
     * @param Type Role (MATER/CORE). MASTER corresponds to FE, and CORE corresponds to BE.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ScaleUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpInstanceRequest(ScaleUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

