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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetBrief extends AbstractModel {

    /**
    * Target ID
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Target type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Target ID 
     * @return TargetId Target ID
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Target ID
     * @param TargetId Target ID
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Target type 
     * @return Type Target type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Target type
     * @param Type Target type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public TargetBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetBrief(TargetBrief source) {
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

