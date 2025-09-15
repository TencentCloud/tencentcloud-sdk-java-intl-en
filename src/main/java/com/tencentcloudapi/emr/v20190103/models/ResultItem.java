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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultItem extends AbstractModel {

    /**
    * User group name.
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * Whether the user group is created successfully.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Specify the reason for the failure in the case of creation failure.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get User group name. 
     * @return Item User group name.
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set User group name.
     * @param Item User group name.
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get Whether the user group is created successfully. 
     * @return Result Whether the user group is created successfully.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Whether the user group is created successfully.
     * @param Result Whether the user group is created successfully.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Specify the reason for the failure in the case of creation failure. 
     * @return Reason Specify the reason for the failure in the case of creation failure.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Specify the reason for the failure in the case of creation failure.
     * @param Reason Specify the reason for the failure in the case of creation failure.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultItem(ResultItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

