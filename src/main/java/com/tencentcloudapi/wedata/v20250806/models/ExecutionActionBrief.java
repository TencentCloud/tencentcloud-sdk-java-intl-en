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

public class ExecutionActionBrief extends AbstractModel {

    /**
    * Operate entity ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * Operate the entity name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Operation ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionActionId")
    @Expose
    private String ExecutionActionId;

    /**
    * Failure information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Operation status. true: successful, false: unsuccessful.
    */
    @SerializedName("OpStatus")
    @Expose
    private Boolean OpStatus;

    /**
     * Get Operate entity ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemId Operate entity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Operate entity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemId Operate entity ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Operate the entity name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemName Operate the entity name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Operate the entity name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemName Operate the entity name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Operation ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionActionId Operation ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionActionId() {
        return this.ExecutionActionId;
    }

    /**
     * Set Operation ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionActionId Operation ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionActionId(String ExecutionActionId) {
        this.ExecutionActionId = ExecutionActionId;
    }

    /**
     * Get Failure information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Failure information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Failure information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Failure information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Operation status. true: successful, false: unsuccessful. 
     * @return OpStatus Operation status. true: successful, false: unsuccessful.
     */
    public Boolean getOpStatus() {
        return this.OpStatus;
    }

    /**
     * Set Operation status. true: successful, false: unsuccessful.
     * @param OpStatus Operation status. true: successful, false: unsuccessful.
     */
    public void setOpStatus(Boolean OpStatus) {
        this.OpStatus = OpStatus;
    }

    public ExecutionActionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionActionBrief(ExecutionActionBrief source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.ExecutionActionId != null) {
            this.ExecutionActionId = new String(source.ExecutionActionId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.OpStatus != null) {
            this.OpStatus = new Boolean(source.OpStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "ExecutionActionId", this.ExecutionActionId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "OpStatus", this.OpStatus);

    }
}

