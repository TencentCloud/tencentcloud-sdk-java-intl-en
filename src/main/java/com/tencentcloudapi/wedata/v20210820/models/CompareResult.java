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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareResult extends AbstractModel {

    /**
    * Comparison Result Item List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private CompareResultItem [] Items;

    /**
    * Total Number of Rows Detected
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalRows")
    @Expose
    private Long TotalRows;

    /**
    * Number of Rows Passed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PassRows")
    @Expose
    private Long PassRows;

    /**
    * Number of Rows Failed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerRows")
    @Expose
    private Long TriggerRows;

    /**
     * Get Comparison Result Item List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Items Comparison Result Item List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CompareResultItem [] getItems() {
        return this.Items;
    }

    /**
     * Set Comparison Result Item List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Items Comparison Result Item List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItems(CompareResultItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total Number of Rows Detected
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalRows Total Number of Rows Detected
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalRows() {
        return this.TotalRows;
    }

    /**
     * Set Total Number of Rows Detected
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalRows Total Number of Rows Detected
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalRows(Long TotalRows) {
        this.TotalRows = TotalRows;
    }

    /**
     * Get Number of Rows Passed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PassRows Number of Rows Passed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPassRows() {
        return this.PassRows;
    }

    /**
     * Set Number of Rows Passed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PassRows Number of Rows Passed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPassRows(Long PassRows) {
        this.PassRows = PassRows;
    }

    /**
     * Get Number of Rows Failed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerRows Number of Rows Failed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTriggerRows() {
        return this.TriggerRows;
    }

    /**
     * Set Number of Rows Failed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerRows Number of Rows Failed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerRows(Long TriggerRows) {
        this.TriggerRows = TriggerRows;
    }

    public CompareResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareResult(CompareResult source) {
        if (source.Items != null) {
            this.Items = new CompareResultItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CompareResultItem(source.Items[i]);
            }
        }
        if (source.TotalRows != null) {
            this.TotalRows = new Long(source.TotalRows);
        }
        if (source.PassRows != null) {
            this.PassRows = new Long(source.PassRows);
        }
        if (source.TriggerRows != null) {
            this.TriggerRows = new Long(source.TriggerRows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalRows", this.TotalRows);
        this.setParamSimple(map, prefix + "PassRows", this.PassRows);
        this.setParamSimple(map, prefix + "TriggerRows", this.TriggerRows);

    }
}

