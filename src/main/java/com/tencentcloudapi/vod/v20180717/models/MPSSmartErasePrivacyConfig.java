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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSSmartErasePrivacyConfig extends AbstractModel {

    /**
    * <p>Privacy protection removal method.</p><p>Enumeration value:</p><ul><li>blur: Blurry</li><li>mosaic: Mosaic</li></ul>
    */
    @SerializedName("PrivacyModel")
    @Expose
    private String PrivacyModel;

    /**
    * <p>Privacy protection objective (no need to input an array when in use on API Explorer, just add the corresponding item and fill in the value).</p><p>Enumeration value:</p><ul><li>face: human face</li><li>plate: license plate</li></ul>
    */
    @SerializedName("PrivacyTargets")
    @Expose
    private String [] PrivacyTargets;

    /**
     * Get <p>Privacy protection removal method.</p><p>Enumeration value:</p><ul><li>blur: Blurry</li><li>mosaic: Mosaic</li></ul> 
     * @return PrivacyModel <p>Privacy protection removal method.</p><p>Enumeration value:</p><ul><li>blur: Blurry</li><li>mosaic: Mosaic</li></ul>
     */
    public String getPrivacyModel() {
        return this.PrivacyModel;
    }

    /**
     * Set <p>Privacy protection removal method.</p><p>Enumeration value:</p><ul><li>blur: Blurry</li><li>mosaic: Mosaic</li></ul>
     * @param PrivacyModel <p>Privacy protection removal method.</p><p>Enumeration value:</p><ul><li>blur: Blurry</li><li>mosaic: Mosaic</li></ul>
     */
    public void setPrivacyModel(String PrivacyModel) {
        this.PrivacyModel = PrivacyModel;
    }

    /**
     * Get <p>Privacy protection objective (no need to input an array when in use on API Explorer, just add the corresponding item and fill in the value).</p><p>Enumeration value:</p><ul><li>face: human face</li><li>plate: license plate</li></ul> 
     * @return PrivacyTargets <p>Privacy protection objective (no need to input an array when in use on API Explorer, just add the corresponding item and fill in the value).</p><p>Enumeration value:</p><ul><li>face: human face</li><li>plate: license plate</li></ul>
     */
    public String [] getPrivacyTargets() {
        return this.PrivacyTargets;
    }

    /**
     * Set <p>Privacy protection objective (no need to input an array when in use on API Explorer, just add the corresponding item and fill in the value).</p><p>Enumeration value:</p><ul><li>face: human face</li><li>plate: license plate</li></ul>
     * @param PrivacyTargets <p>Privacy protection objective (no need to input an array when in use on API Explorer, just add the corresponding item and fill in the value).</p><p>Enumeration value:</p><ul><li>face: human face</li><li>plate: license plate</li></ul>
     */
    public void setPrivacyTargets(String [] PrivacyTargets) {
        this.PrivacyTargets = PrivacyTargets;
    }

    public MPSSmartErasePrivacyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSmartErasePrivacyConfig(MPSSmartErasePrivacyConfig source) {
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

