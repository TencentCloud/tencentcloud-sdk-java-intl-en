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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckItem extends AbstractModel {

    /**
    * Check item name
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * Verification result of this item
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Details of validation failed and modification suggestions
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Detailed explanation of validation failure and modification suggestions
    */
    @SerializedName("ExpectedValue")
    @Expose
    private String ExpectedValue;

    /**
     * Get Check item name 
     * @return Item Check item name
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set Check item name
     * @param Item Check item name
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get Verification result of this item 
     * @return Result Verification result of this item
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Verification result of this item
     * @param Result Verification result of this item
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Details of validation failed and modification suggestions 
     * @return CurrentValue Details of validation failed and modification suggestions
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Details of validation failed and modification suggestions
     * @param CurrentValue Details of validation failed and modification suggestions
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Detailed explanation of validation failure and modification suggestions 
     * @return ExpectedValue Detailed explanation of validation failure and modification suggestions
     */
    public String getExpectedValue() {
        return this.ExpectedValue;
    }

    /**
     * Set Detailed explanation of validation failure and modification suggestions
     * @param ExpectedValue Detailed explanation of validation failure and modification suggestions
     */
    public void setExpectedValue(String ExpectedValue) {
        this.ExpectedValue = ExpectedValue;
    }

    public CheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckItem(CheckItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.ExpectedValue != null) {
            this.ExpectedValue = new String(source.ExpectedValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "ExpectedValue", this.ExpectedValue);

    }
}

