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

public class AddDspmAssetManagerRequest extends AbstractModel {

    /**
    * Administrator UIN
    */
    @SerializedName("IdentifyIds")
    @Expose
    private String [] IdentifyIds;

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String [] AssetId;

    /**
     * Get Administrator UIN 
     * @return IdentifyIds Administrator UIN
     */
    public String [] getIdentifyIds() {
        return this.IdentifyIds;
    }

    /**
     * Set Administrator UIN
     * @param IdentifyIds Administrator UIN
     */
    public void setIdentifyIds(String [] IdentifyIds) {
        this.IdentifyIds = IdentifyIds;
    }

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String [] getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String [] AssetId) {
        this.AssetId = AssetId;
    }

    public AddDspmAssetManagerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDspmAssetManagerRequest(AddDspmAssetManagerRequest source) {
        if (source.IdentifyIds != null) {
            this.IdentifyIds = new String[source.IdentifyIds.length];
            for (int i = 0; i < source.IdentifyIds.length; i++) {
                this.IdentifyIds[i] = new String(source.IdentifyIds[i]);
            }
        }
        if (source.AssetId != null) {
            this.AssetId = new String[source.AssetId.length];
            for (int i = 0; i < source.AssetId.length; i++) {
                this.AssetId[i] = new String(source.AssetId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdentifyIds.", this.IdentifyIds);
        this.setParamArraySimple(map, prefix + "AssetId.", this.AssetId);

    }
}

