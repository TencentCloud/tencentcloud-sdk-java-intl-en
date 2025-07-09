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

public class CheckStep extends AbstractModel {

    /**
    * Step number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * Step ID such as `ConnectDBCheck`, `VersionCheck`, and `SrcPrivilegeCheck`. The specific check items are subject to source and target instances.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * Step name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * Result of this check step. Valid values: `pass`, `failed`, `notStarted`, `blocked`, `warning`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepStatus")
    @Expose
    private String StepStatus;

    /**
    * Error message in this check step
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
    * Specific check item in this check step
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetailCheckItems")
    @Expose
    private DetailCheckItem [] DetailCheckItems;

    /**
    * Whether this step was skipped
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasSkipped")
    @Expose
    private Boolean HasSkipped;

    /**
     * Get Step number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepNo Step number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set Step number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepNo Step number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get Step ID such as `ConnectDBCheck`, `VersionCheck`, and `SrcPrivilegeCheck`. The specific check items are subject to source and target instances.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepId Step ID such as `ConnectDBCheck`, `VersionCheck`, and `SrcPrivilegeCheck`. The specific check items are subject to source and target instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set Step ID such as `ConnectDBCheck`, `VersionCheck`, and `SrcPrivilegeCheck`. The specific check items are subject to source and target instances.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepId Step ID such as `ConnectDBCheck`, `VersionCheck`, and `SrcPrivilegeCheck`. The specific check items are subject to source and target instances.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get Step name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepName Step name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set Step name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepName Step name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get Result of this check step. Valid values: `pass`, `failed`, `notStarted`, `blocked`, `warning`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepStatus Result of this check step. Valid values: `pass`, `failed`, `notStarted`, `blocked`, `warning`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepStatus() {
        return this.StepStatus;
    }

    /**
     * Set Result of this check step. Valid values: `pass`, `failed`, `notStarted`, `blocked`, `warning`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepStatus Result of this check step. Valid values: `pass`, `failed`, `notStarted`, `blocked`, `warning`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepStatus(String StepStatus) {
        this.StepStatus = StepStatus;
    }

    /**
     * Get Error message in this check step
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StepMessage Error message in this check step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set Error message in this check step
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StepMessage Error message in this check step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * Get Specific check item in this check step
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetailCheckItems Specific check item in this check step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DetailCheckItem [] getDetailCheckItems() {
        return this.DetailCheckItems;
    }

    /**
     * Set Specific check item in this check step
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetailCheckItems Specific check item in this check step
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetailCheckItems(DetailCheckItem [] DetailCheckItems) {
        this.DetailCheckItems = DetailCheckItems;
    }

    /**
     * Get Whether this step was skipped
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasSkipped Whether this step was skipped
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHasSkipped() {
        return this.HasSkipped;
    }

    /**
     * Set Whether this step was skipped
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasSkipped Whether this step was skipped
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasSkipped(Boolean HasSkipped) {
        this.HasSkipped = HasSkipped;
    }

    public CheckStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckStep(CheckStep source) {
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepStatus != null) {
            this.StepStatus = new String(source.StepStatus);
        }
        if (source.StepMessage != null) {
            this.StepMessage = new String(source.StepMessage);
        }
        if (source.DetailCheckItems != null) {
            this.DetailCheckItems = new DetailCheckItem[source.DetailCheckItems.length];
            for (int i = 0; i < source.DetailCheckItems.length; i++) {
                this.DetailCheckItems[i] = new DetailCheckItem(source.DetailCheckItems[i]);
            }
        }
        if (source.HasSkipped != null) {
            this.HasSkipped = new Boolean(source.HasSkipped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepStatus", this.StepStatus);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);
        this.setParamArrayObj(map, prefix + "DetailCheckItems.", this.DetailCheckItems);
        this.setParamSimple(map, prefix + "HasSkipped", this.HasSkipped);

    }
}

