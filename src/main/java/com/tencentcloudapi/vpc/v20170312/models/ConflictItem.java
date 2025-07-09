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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictItem extends AbstractModel {

    /**
    * Conflict resource ID
    */
    @SerializedName("ConfilctId")
    @Expose
    private String ConfilctId;

    /**
    * Conflict destination resource
    */
    @SerializedName("DestinationItem")
    @Expose
    private String DestinationItem;

    /**
     * Get Conflict resource ID 
     * @return ConfilctId Conflict resource ID
     */
    public String getConfilctId() {
        return this.ConfilctId;
    }

    /**
     * Set Conflict resource ID
     * @param ConfilctId Conflict resource ID
     */
    public void setConfilctId(String ConfilctId) {
        this.ConfilctId = ConfilctId;
    }

    /**
     * Get Conflict destination resource 
     * @return DestinationItem Conflict destination resource
     */
    public String getDestinationItem() {
        return this.DestinationItem;
    }

    /**
     * Set Conflict destination resource
     * @param DestinationItem Conflict destination resource
     */
    public void setDestinationItem(String DestinationItem) {
        this.DestinationItem = DestinationItem;
    }

    public ConflictItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictItem(ConflictItem source) {
        if (source.ConfilctId != null) {
            this.ConfilctId = new String(source.ConfilctId);
        }
        if (source.DestinationItem != null) {
            this.DestinationItem = new String(source.DestinationItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfilctId", this.ConfilctId);
        this.setParamSimple(map, prefix + "DestinationItem", this.DestinationItem);

    }
}

