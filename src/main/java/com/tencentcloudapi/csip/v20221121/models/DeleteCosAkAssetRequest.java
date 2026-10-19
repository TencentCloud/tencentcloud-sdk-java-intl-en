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

public class DeleteCosAkAssetRequest extends AbstractModel {

    /**
    * Collection of cos AKs to delete
    */
    @SerializedName("CosAkSet")
    @Expose
    private CosAkSet [] CosAkSet;

    /**
     * Get Collection of cos AKs to delete 
     * @return CosAkSet Collection of cos AKs to delete
     */
    public CosAkSet [] getCosAkSet() {
        return this.CosAkSet;
    }

    /**
     * Set Collection of cos AKs to delete
     * @param CosAkSet Collection of cos AKs to delete
     */
    public void setCosAkSet(CosAkSet [] CosAkSet) {
        this.CosAkSet = CosAkSet;
    }

    public DeleteCosAkAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCosAkAssetRequest(DeleteCosAkAssetRequest source) {
        if (source.CosAkSet != null) {
            this.CosAkSet = new CosAkSet[source.CosAkSet.length];
            for (int i = 0; i < source.CosAkSet.length; i++) {
                this.CosAkSet[i] = new CosAkSet(source.CosAkSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CosAkSet.", this.CosAkSet);

    }
}

