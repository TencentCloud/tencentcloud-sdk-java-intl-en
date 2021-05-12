/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManualCalcValue extends AbstractModel{

    /**
    * Default value.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Fixed value.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Fixed")
    @Expose
    private String Fixed;

    /**
    * Maximum value.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Required or not.
    */
    @SerializedName("Need")
    @Expose
    private Boolean Need;

    /**
     * Get Default value.
Note: This field may return null, indicating that no valid value was found. 
     * @return Default Default value.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Default value.
Note: This field may return null, indicating that no valid value was found.
     * @param Default Default value.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Fixed value.
Note: This field may return null, indicating that no valid value was found. 
     * @return Fixed Fixed value.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getFixed() {
        return this.Fixed;
    }

    /**
     * Set Fixed value.
Note: This field may return null, indicating that no valid value was found.
     * @param Fixed Fixed value.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setFixed(String Fixed) {
        this.Fixed = Fixed;
    }

    /**
     * Get Maximum value.
Note: This field may return null, indicating that no valid value was found. 
     * @return Max Maximum value.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value.
Note: This field may return null, indicating that no valid value was found.
     * @param Max Maximum value.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value.
Note: This field may return null, indicating that no valid value was found. 
     * @return Min Minimum value.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value.
Note: This field may return null, indicating that no valid value was found.
     * @param Min Minimum value.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Required or not. 
     * @return Need Required or not.
     */
    public Boolean getNeed() {
        return this.Need;
    }

    /**
     * Set Required or not.
     * @param Need Required or not.
     */
    public void setNeed(Boolean Need) {
        this.Need = Need;
    }

    public DescribePolicyConditionListConfigManualCalcValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListConfigManualCalcValue(DescribePolicyConditionListConfigManualCalcValue source) {
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Fixed != null) {
            this.Fixed = new String(source.Fixed);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.Need != null) {
            this.Need = new Boolean(source.Need);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Fixed", this.Fixed);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Need", this.Need);

    }
}

