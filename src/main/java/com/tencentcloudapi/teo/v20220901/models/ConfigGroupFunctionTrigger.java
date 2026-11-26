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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigGroupFunctionTrigger extends AbstractModel {

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d">Match condition.</a></p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>Function selection configuration type:</p><p>Enumeration values:</p><ul><li>direct: directly specify the execution function</li><li>weight: select a function based on weight ratio</li><li>region: select a function based on the client IP country/region</li></ul>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>Function selection configuration based on client IP country/region.</p>
    */
    @SerializedName("RegionMappingSelections")
    @Expose
    private ConfigGroupFunctionRegionSelection [] RegionMappingSelections;

    /**
    * <p>Weight-based function selection configuration.</p>
    */
    @SerializedName("WeightedSelections")
    @Expose
    private ConfigGroupFunctionWeightedSelection [] WeightedSelections;

    /**
    * <p>Rule description.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d">Match condition.</a></p> 
     * @return Condition <p><a href="https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d">Match condition.</a></p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d">Match condition.</a></p>
     * @param Condition <p><a href="https://www.tencentcloud.com/document/product/1552/90438?from_cn_redirect=1#33f65828-c6c6-4b66-a011-25a20b548d5d">Match condition.</a></p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>Function selection configuration type:</p><p>Enumeration values:</p><ul><li>direct: directly specify the execution function</li><li>weight: select a function based on weight ratio</li><li>region: select a function based on the client IP country/region</li></ul> 
     * @return TriggerType <p>Function selection configuration type:</p><p>Enumeration values:</p><ul><li>direct: directly specify the execution function</li><li>weight: select a function based on weight ratio</li><li>region: select a function based on the client IP country/region</li></ul>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Function selection configuration type:</p><p>Enumeration values:</p><ul><li>direct: directly specify the execution function</li><li>weight: select a function based on weight ratio</li><li>region: select a function based on the client IP country/region</li></ul>
     * @param TriggerType <p>Function selection configuration type:</p><p>Enumeration values:</p><ul><li>direct: directly specify the execution function</li><li>weight: select a function based on weight ratio</li><li>region: select a function based on the client IP country/region</li></ul>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p> 
     * @return Function <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
     * @param Function <p>Specify the function executed. The value is the unique identifier of the function in the site. This parameter is valid only when TriggerType is direct.</p>
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>Function selection configuration based on client IP country/region.</p> 
     * @return RegionMappingSelections <p>Function selection configuration based on client IP country/region.</p>
     */
    public ConfigGroupFunctionRegionSelection [] getRegionMappingSelections() {
        return this.RegionMappingSelections;
    }

    /**
     * Set <p>Function selection configuration based on client IP country/region.</p>
     * @param RegionMappingSelections <p>Function selection configuration based on client IP country/region.</p>
     */
    public void setRegionMappingSelections(ConfigGroupFunctionRegionSelection [] RegionMappingSelections) {
        this.RegionMappingSelections = RegionMappingSelections;
    }

    /**
     * Get <p>Weight-based function selection configuration.</p> 
     * @return WeightedSelections <p>Weight-based function selection configuration.</p>
     */
    public ConfigGroupFunctionWeightedSelection [] getWeightedSelections() {
        return this.WeightedSelections;
    }

    /**
     * Set <p>Weight-based function selection configuration.</p>
     * @param WeightedSelections <p>Weight-based function selection configuration.</p>
     */
    public void setWeightedSelections(ConfigGroupFunctionWeightedSelection [] WeightedSelections) {
        this.WeightedSelections = WeightedSelections;
    }

    /**
     * Get <p>Rule description.</p> 
     * @return Remark <p>Rule description.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Rule description.</p>
     * @param Remark <p>Rule description.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ConfigGroupFunctionTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupFunctionTrigger(ConfigGroupFunctionTrigger source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.RegionMappingSelections != null) {
            this.RegionMappingSelections = new ConfigGroupFunctionRegionSelection[source.RegionMappingSelections.length];
            for (int i = 0; i < source.RegionMappingSelections.length; i++) {
                this.RegionMappingSelections[i] = new ConfigGroupFunctionRegionSelection(source.RegionMappingSelections[i]);
            }
        }
        if (source.WeightedSelections != null) {
            this.WeightedSelections = new ConfigGroupFunctionWeightedSelection[source.WeightedSelections.length];
            for (int i = 0; i < source.WeightedSelections.length; i++) {
                this.WeightedSelections[i] = new ConfigGroupFunctionWeightedSelection(source.WeightedSelections[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamArrayObj(map, prefix + "RegionMappingSelections.", this.RegionMappingSelections);
        this.setParamArrayObj(map, prefix + "WeightedSelections.", this.WeightedSelections);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

