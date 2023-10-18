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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictHandleOption extends AbstractModel {

    /**
    * Conditionally overwritten column
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionColumn")
    @Expose
    private String ConditionColumn;

    /**
    * Conditional overwrite operation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionOperator")
    @Expose
    private String ConditionOperator;

    /**
    * Conditional overwrite priority configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConditionOrderInSrcAndDst")
    @Expose
    private String ConditionOrderInSrcAndDst;

    /**
     * Get Conditionally overwritten column
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConditionColumn Conditionally overwritten column
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConditionColumn() {
        return this.ConditionColumn;
    }

    /**
     * Set Conditionally overwritten column
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConditionColumn Conditionally overwritten column
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionColumn(String ConditionColumn) {
        this.ConditionColumn = ConditionColumn;
    }

    /**
     * Get Conditional overwrite operation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConditionOperator Conditional overwrite operation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConditionOperator() {
        return this.ConditionOperator;
    }

    /**
     * Set Conditional overwrite operation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConditionOperator Conditional overwrite operation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionOperator(String ConditionOperator) {
        this.ConditionOperator = ConditionOperator;
    }

    /**
     * Get Conditional overwrite priority configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConditionOrderInSrcAndDst Conditional overwrite priority configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConditionOrderInSrcAndDst() {
        return this.ConditionOrderInSrcAndDst;
    }

    /**
     * Set Conditional overwrite priority configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConditionOrderInSrcAndDst Conditional overwrite priority configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditionOrderInSrcAndDst(String ConditionOrderInSrcAndDst) {
        this.ConditionOrderInSrcAndDst = ConditionOrderInSrcAndDst;
    }

    public ConflictHandleOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictHandleOption(ConflictHandleOption source) {
        if (source.ConditionColumn != null) {
            this.ConditionColumn = new String(source.ConditionColumn);
        }
        if (source.ConditionOperator != null) {
            this.ConditionOperator = new String(source.ConditionOperator);
        }
        if (source.ConditionOrderInSrcAndDst != null) {
            this.ConditionOrderInSrcAndDst = new String(source.ConditionOrderInSrcAndDst);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConditionColumn", this.ConditionColumn);
        this.setParamSimple(map, prefix + "ConditionOperator", this.ConditionOperator);
        this.setParamSimple(map, prefix + "ConditionOrderInSrcAndDst", this.ConditionOrderInSrcAndDst);

    }
}

