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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillCapabilityTag extends AbstractModel {

    /**
    * Capacity tag identification, suitable for program judgment, filtering or aggregation usage
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Capacity Tag Display Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Capacity tag identification, suitable for program judgment, filtering or aggregation usage 
     * @return ID Capacity tag identification, suitable for program judgment, filtering or aggregation usage
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Capacity tag identification, suitable for program judgment, filtering or aggregation usage
     * @param ID Capacity tag identification, suitable for program judgment, filtering or aggregation usage
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Capacity Tag Display Name 
     * @return Name Capacity Tag Display Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Capacity Tag Display Name
     * @param Name Capacity Tag Display Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SkillCapabilityTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillCapabilityTag(SkillCapabilityTag source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

