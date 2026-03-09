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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePermissionsResultItem extends AbstractModel {

    /**
    * Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * Whether the operation is successful for the resource permission.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Specify the reason for the failure in the case of creation failure.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Resource ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Item Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Item Resource ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get Whether the operation is successful for the resource permission.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Result Whether the operation is successful for the resource permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Whether the operation is successful for the resource permission.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Result Whether the operation is successful for the resource permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Specify the reason for the failure in the case of creation failure.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason Specify the reason for the failure in the case of creation failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Specify the reason for the failure in the case of creation failure.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason Specify the reason for the failure in the case of creation failure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public CodePermissionsResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodePermissionsResultItem(CodePermissionsResultItem source) {
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

