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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareRule extends AbstractModel {

    /**
    * Comparison Criteria List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private CompareRuleItem [] Items;

    /**
    * Default cycle of the periodic template, Unit: seconds
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * o represents OR, a represents AND, numbers represent items' indices
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ComputeExpression")
    @Expose
    private String ComputeExpression;

    /**
     * Get Comparison Criteria List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Items Comparison Criteria List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CompareRuleItem [] getItems() {
        return this.Items;
    }

    /**
     * Set Comparison Criteria List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Items Comparison Criteria List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItems(CompareRuleItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get Default cycle of the periodic template, Unit: seconds
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleStep Default cycle of the periodic template, Unit: seconds
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Default cycle of the periodic template, Unit: seconds
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleStep Default cycle of the periodic template, Unit: seconds
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get o represents OR, a represents AND, numbers represent items' indices
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ComputeExpression o represents OR, a represents AND, numbers represent items' indices
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getComputeExpression() {
        return this.ComputeExpression;
    }

    /**
     * Set o represents OR, a represents AND, numbers represent items' indices
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ComputeExpression o represents OR, a represents AND, numbers represent items' indices
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComputeExpression(String ComputeExpression) {
        this.ComputeExpression = ComputeExpression;
    }

    public CompareRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareRule(CompareRule source) {
        if (source.Items != null) {
            this.Items = new CompareRuleItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CompareRuleItem(source.Items[i]);
            }
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.ComputeExpression != null) {
            this.ComputeExpression = new String(source.ComputeExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "ComputeExpression", this.ComputeExpression);

    }
}

