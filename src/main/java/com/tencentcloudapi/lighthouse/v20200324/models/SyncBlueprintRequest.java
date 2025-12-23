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

public class SyncBlueprintRequest extends AbstractModel {

    /**
    * Image ID.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * List of target regions for image synchronization.
    */
    @SerializedName("DestinationRegions")
    @Expose
    private String [] DestinationRegions;

    /**
     * Get Image ID. 
     * @return BlueprintId Image ID.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Image ID.
     * @param BlueprintId Image ID.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get List of target regions for image synchronization. 
     * @return DestinationRegions List of target regions for image synchronization.
     */
    public String [] getDestinationRegions() {
        return this.DestinationRegions;
    }

    /**
     * Set List of target regions for image synchronization.
     * @param DestinationRegions List of target regions for image synchronization.
     */
    public void setDestinationRegions(String [] DestinationRegions) {
        this.DestinationRegions = DestinationRegions;
    }

    public SyncBlueprintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncBlueprintRequest(SyncBlueprintRequest source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.DestinationRegions != null) {
            this.DestinationRegions = new String[source.DestinationRegions.length];
            for (int i = 0; i < source.DestinationRegions.length; i++) {
                this.DestinationRegions[i] = new String(source.DestinationRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamArraySimple(map, prefix + "DestinationRegions.", this.DestinationRegions);

    }
}

