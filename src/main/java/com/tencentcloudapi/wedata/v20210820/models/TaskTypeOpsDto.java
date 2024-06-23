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

public class TaskTypeOpsDto extends AbstractModel {

    /**
    * Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeDesc")
    @Expose
    private String TypeDesc;

    /**
    * Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Task Type Categorization
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeSort")
    @Expose
    private String TypeSort;

    /**
     * Get Task Type Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TypeDesc Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTypeDesc() {
        return this.TypeDesc;
    }

    /**
     * Set Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TypeDesc Task Type Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTypeDesc(String TypeDesc) {
        this.TypeDesc = TypeDesc;
    }

    /**
     * Get Task Type ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TypeId Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TypeId Task Type ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Task Type Categorization
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TypeSort Task Type Categorization
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTypeSort() {
        return this.TypeSort;
    }

    /**
     * Set Task Type Categorization
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TypeSort Task Type Categorization
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTypeSort(String TypeSort) {
        this.TypeSort = TypeSort;
    }

    public TaskTypeOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeOpsDto(TaskTypeOpsDto source) {
        if (source.TypeDesc != null) {
            this.TypeDesc = new String(source.TypeDesc);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TypeSort != null) {
            this.TypeSort = new String(source.TypeSort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeDesc", this.TypeDesc);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeSort", this.TypeSort);

    }
}

