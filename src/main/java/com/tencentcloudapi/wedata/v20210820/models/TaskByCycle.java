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

public class TaskByCycle extends AbstractModel {

    /**
    * num
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Project ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get num
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Number num
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set num
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Number num
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleUnit Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleUnit Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public TaskByCycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskByCycle(TaskByCycle source) {
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

