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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockTopRequest extends AbstractModel {

    /**
    * Record ID
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * Operation type. 1: pin to top; 0: unpin
    */
    @SerializedName("OpeType")
    @Expose
    private String OpeType;

    /**
     * Get Record ID 
     * @return UniqueId Record ID
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set Record ID
     * @param UniqueId Record ID
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get Operation type. 1: pin to top; 0: unpin 
     * @return OpeType Operation type. 1: pin to top; 0: unpin
     */
    public String getOpeType() {
        return this.OpeType;
    }

    /**
     * Set Operation type. 1: pin to top; 0: unpin
     * @param OpeType Operation type. 1: pin to top; 0: unpin
     */
    public void setOpeType(String OpeType) {
        this.OpeType = OpeType;
    }

    public ModifyBlockTopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockTopRequest(ModifyBlockTopRequest source) {
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
        if (source.OpeType != null) {
            this.OpeType = new String(source.OpeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "OpeType", this.OpeType);

    }
}

