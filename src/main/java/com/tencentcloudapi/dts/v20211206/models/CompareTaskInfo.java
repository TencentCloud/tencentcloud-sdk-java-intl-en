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

public class CompareTaskInfo extends AbstractModel {

    /**
    * Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * Data consistency check result. Valid values: `unstart` (the task is not started); `running` (the task is running); `canceled` (the task is stopped); `failed` (the task failed); `inconsistent` (the data is inconsistent); `consistent` (the data is consistent); `notexist` (the task does not exist).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareTaskId Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareTaskId Data consistency check task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get Data consistency check result. Valid values: `unstart` (the task is not started); `running` (the task is running); `canceled` (the task is stopped); `failed` (the task failed); `inconsistent` (the data is inconsistent); `consistent` (the data is consistent); `notexist` (the task does not exist).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Data consistency check result. Valid values: `unstart` (the task is not started); `running` (the task is running); `canceled` (the task is stopped); `failed` (the task failed); `inconsistent` (the data is inconsistent); `consistent` (the data is consistent); `notexist` (the task does not exist).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Data consistency check result. Valid values: `unstart` (the task is not started); `running` (the task is running); `canceled` (the task is stopped); `failed` (the task failed); `inconsistent` (the data is inconsistent); `consistent` (the data is consistent); `notexist` (the task does not exist).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Data consistency check result. Valid values: `unstart` (the task is not started); `running` (the task is running); `canceled` (the task is stopped); `failed` (the task failed); `inconsistent` (the data is inconsistent); `consistent` (the data is consistent); `notexist` (the task does not exist).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CompareTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTaskInfo(CompareTaskInfo source) {
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

