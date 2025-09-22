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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartErasePrivacyConfig extends AbstractModel {

    /**
    * Specifies the privacy protection removal method.
-Blur: specifies the blur detection.
-Specifies the mosaic.
    */
    @SerializedName("PrivacyModel")
    @Expose
    private String PrivacyModel;

    /**
    * Privacy protection objective. no need to import an array when in use on API Explorer. just add the corresponding item and fill in the value.
-Human face.
-License plate.
    */
    @SerializedName("PrivacyTargets")
    @Expose
    private String [] PrivacyTargets;

    /**
     * Get Specifies the privacy protection removal method.
-Blur: specifies the blur detection.
-Specifies the mosaic. 
     * @return PrivacyModel Specifies the privacy protection removal method.
-Blur: specifies the blur detection.
-Specifies the mosaic.
     */
    public String getPrivacyModel() {
        return this.PrivacyModel;
    }

    /**
     * Set Specifies the privacy protection removal method.
-Blur: specifies the blur detection.
-Specifies the mosaic.
     * @param PrivacyModel Specifies the privacy protection removal method.
-Blur: specifies the blur detection.
-Specifies the mosaic.
     */
    public void setPrivacyModel(String PrivacyModel) {
        this.PrivacyModel = PrivacyModel;
    }

    /**
     * Get Privacy protection objective. no need to import an array when in use on API Explorer. just add the corresponding item and fill in the value.
-Human face.
-License plate. 
     * @return PrivacyTargets Privacy protection objective. no need to import an array when in use on API Explorer. just add the corresponding item and fill in the value.
-Human face.
-License plate.
     */
    public String [] getPrivacyTargets() {
        return this.PrivacyTargets;
    }

    /**
     * Set Privacy protection objective. no need to import an array when in use on API Explorer. just add the corresponding item and fill in the value.
-Human face.
-License plate.
     * @param PrivacyTargets Privacy protection objective. no need to import an array when in use on API Explorer. just add the corresponding item and fill in the value.
-Human face.
-License plate.
     */
    public void setPrivacyTargets(String [] PrivacyTargets) {
        this.PrivacyTargets = PrivacyTargets;
    }

    public SmartErasePrivacyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartErasePrivacyConfig(SmartErasePrivacyConfig source) {
        if (source.PrivacyModel != null) {
            this.PrivacyModel = new String(source.PrivacyModel);
        }
        if (source.PrivacyTargets != null) {
            this.PrivacyTargets = new String[source.PrivacyTargets.length];
            for (int i = 0; i < source.PrivacyTargets.length; i++) {
                this.PrivacyTargets[i] = new String(source.PrivacyTargets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivacyModel", this.PrivacyModel);
        this.setParamArraySimple(map, prefix + "PrivacyTargets.", this.PrivacyTargets);

    }
}

