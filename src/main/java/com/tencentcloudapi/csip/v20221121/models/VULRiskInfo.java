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

public class VULRiskInfo extends AbstractModel {

    /**
    * Fixing suggestion
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Technology reference/reference link.
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * Vulnerability description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Affected component.
    */
    @SerializedName("ImpactComponent")
    @Expose
    private VulImpactComponentInfo [] ImpactComponent;

    /**
     * Get Fixing suggestion 
     * @return Fix Fixing suggestion
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing suggestion
     * @param Fix Fixing suggestion
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Technology reference/reference link. 
     * @return References Technology reference/reference link.
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set Technology reference/reference link.
     * @param References Technology reference/reference link.
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get Vulnerability description 
     * @return Describe Vulnerability description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Vulnerability description
     * @param Describe Vulnerability description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Affected component. 
     * @return ImpactComponent Affected component.
     */
    public VulImpactComponentInfo [] getImpactComponent() {
        return this.ImpactComponent;
    }

    /**
     * Set Affected component.
     * @param ImpactComponent Affected component.
     */
    public void setImpactComponent(VulImpactComponentInfo [] ImpactComponent) {
        this.ImpactComponent = ImpactComponent;
    }

    public VULRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULRiskInfo(VULRiskInfo source) {
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.ImpactComponent != null) {
            this.ImpactComponent = new VulImpactComponentInfo[source.ImpactComponent.length];
            for (int i = 0; i < source.ImpactComponent.length; i++) {
                this.ImpactComponent[i] = new VulImpactComponentInfo(source.ImpactComponent[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArrayObj(map, prefix + "ImpactComponent.", this.ImpactComponent);

    }
}

