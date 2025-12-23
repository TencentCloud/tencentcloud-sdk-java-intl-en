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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationRegionBlueprint extends AbstractModel {

    /**
    * Target region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Target region image ID.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
     * Get Target region. 
     * @return Region Target region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Target region.
     * @param Region Target region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Target region image ID. 
     * @return BlueprintId Target region image ID.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Target region image ID.
     * @param BlueprintId Target region image ID.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    public DestinationRegionBlueprint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestinationRegionBlueprint(DestinationRegionBlueprint source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);

    }
}

