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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictHandleOption extends AbstractModel {

    /**
    * Columns for conditional overwrite.
    */
    @SerializedName("ConditionColumn")
    @Expose
    private String ConditionColumn;

    /**
    * Condition coverage operation. Currently, only > is supported.
    */
    @SerializedName("ConditionOperator")
    @Expose
    private String ConditionOperator;

    /**
    * Condition coverage priority processing. Supported types are >, <, and =.
    */
    @SerializedName("ConditionOrderInSrcAndDst")
    @Expose
    private String ConditionOrderInSrcAndDst;

    /**
     * Get Columns for conditional overwrite. 
     * @return ConditionColumn Columns for conditional overwrite.
     */
    public String getConditionColumn() {
        return this.ConditionColumn;
    }

    /**
     * Set Columns for conditional overwrite.
     * @param ConditionColumn Columns for conditional overwrite.
     */
    public void setConditionColumn(String ConditionColumn) {
        this.ConditionColumn = ConditionColumn;
    }

    /**
     * Get Condition coverage operation. Currently, only > is supported. 
     * @return ConditionOperator Condition coverage operation. Currently, only > is supported.
     */
    public String getConditionOperator() {
        return this.ConditionOperator;
    }

    /**
     * Set Condition coverage operation. Currently, only > is supported.
     * @param ConditionOperator Condition coverage operation. Currently, only > is supported.
     */
    public void setConditionOperator(String ConditionOperator) {
        this.ConditionOperator = ConditionOperator;
    }

    /**
     * Get Condition coverage priority processing. Supported types are >, <, and =. 
     * @return ConditionOrderInSrcAndDst Condition coverage priority processing. Supported types are >, <, and =.
     */
    public String getConditionOrderInSrcAndDst() {
        return this.ConditionOrderInSrcAndDst;
    }

    /**
     * Set Condition coverage priority processing. Supported types are >, <, and =.
     * @param ConditionOrderInSrcAndDst Condition coverage priority processing. Supported types are >, <, and =.
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

