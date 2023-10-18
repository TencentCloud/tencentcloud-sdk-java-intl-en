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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Area extends AbstractModel {

    /**
    * Region ID
    */
    @SerializedName("AreaId")
    @Expose
    private String AreaId;

    /**
    * Region name
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
     * Get Region ID 
     * @return AreaId Region ID
     */
    public String getAreaId() {
        return this.AreaId;
    }

    /**
     * Set Region ID
     * @param AreaId Region ID
     */
    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get Region name 
     * @return AreaName Region name
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set Region name
     * @param AreaName Region name
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public Area() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Area(Area source) {
        if (source.AreaId != null) {
            this.AreaId = new String(source.AreaId);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);

    }
}

