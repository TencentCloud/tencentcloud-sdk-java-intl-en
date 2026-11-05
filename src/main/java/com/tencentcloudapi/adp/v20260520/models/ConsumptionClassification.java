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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionClassification extends AbstractModel {

    /**
    * <p>Consumption scenario (such as reasoning/training/evaluation)</p>
    */
    @SerializedName("ConsumptionScene")
    @Expose
    private String ConsumptionScene;

    /**
    * <p>Consumption target (for example, specific model name/plug-in name/platform feature name)</p>
    */
    @SerializedName("ConsumptionTarget")
    @Expose
    private String ConsumptionTarget;

    /**
    * <p>Consumption type. The set of values is defined by the business side (for example, model/plugin/platform)</p>
    */
    @SerializedName("ConsumptionType")
    @Expose
    private String ConsumptionType;

    /**
    * <p>Package name</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get <p>Consumption scenario (such as reasoning/training/evaluation)</p> 
     * @return ConsumptionScene <p>Consumption scenario (such as reasoning/training/evaluation)</p>
     */
    public String getConsumptionScene() {
        return this.ConsumptionScene;
    }

    /**
     * Set <p>Consumption scenario (such as reasoning/training/evaluation)</p>
     * @param ConsumptionScene <p>Consumption scenario (such as reasoning/training/evaluation)</p>
     */
    public void setConsumptionScene(String ConsumptionScene) {
        this.ConsumptionScene = ConsumptionScene;
    }

    /**
     * Get <p>Consumption target (for example, specific model name/plug-in name/platform feature name)</p> 
     * @return ConsumptionTarget <p>Consumption target (for example, specific model name/plug-in name/platform feature name)</p>
     */
    public String getConsumptionTarget() {
        return this.ConsumptionTarget;
    }

    /**
     * Set <p>Consumption target (for example, specific model name/plug-in name/platform feature name)</p>
     * @param ConsumptionTarget <p>Consumption target (for example, specific model name/plug-in name/platform feature name)</p>
     */
    public void setConsumptionTarget(String ConsumptionTarget) {
        this.ConsumptionTarget = ConsumptionTarget;
    }

    /**
     * Get <p>Consumption type. The set of values is defined by the business side (for example, model/plugin/platform)</p> 
     * @return ConsumptionType <p>Consumption type. The set of values is defined by the business side (for example, model/plugin/platform)</p>
     */
    public String getConsumptionType() {
        return this.ConsumptionType;
    }

    /**
     * Set <p>Consumption type. The set of values is defined by the business side (for example, model/plugin/platform)</p>
     * @param ConsumptionType <p>Consumption type. The set of values is defined by the business side (for example, model/plugin/platform)</p>
     */
    public void setConsumptionType(String ConsumptionType) {
        this.ConsumptionType = ConsumptionType;
    }

    /**
     * Get <p>Package name</p> 
     * @return PackageName <p>Package name</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>Package name</p>
     * @param PackageName <p>Package name</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public ConsumptionClassification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionClassification(ConsumptionClassification source) {
        if (source.ConsumptionScene != null) {
            this.ConsumptionScene = new String(source.ConsumptionScene);
        }
        if (source.ConsumptionTarget != null) {
            this.ConsumptionTarget = new String(source.ConsumptionTarget);
        }
        if (source.ConsumptionType != null) {
            this.ConsumptionType = new String(source.ConsumptionType);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumptionScene", this.ConsumptionScene);
        this.setParamSimple(map, prefix + "ConsumptionTarget", this.ConsumptionTarget);
        this.setParamSimple(map, prefix + "ConsumptionType", this.ConsumptionType);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

