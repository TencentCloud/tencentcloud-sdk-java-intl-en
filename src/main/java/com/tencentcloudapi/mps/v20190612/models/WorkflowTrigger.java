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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTrigger extends AbstractModel{

    /**
    * Trigger type. Only `CosFileUpload` is supported currently.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosFileUploadTrigger")
    @Expose
    private CosFileUploadTrigger CosFileUploadTrigger;

    /**
     * Get Trigger type. Only `CosFileUpload` is supported currently. 
     * @return Type Trigger type. Only `CosFileUpload` is supported currently.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger type. Only `CosFileUpload` is supported currently.
     * @param Type Trigger type. Only `CosFileUpload` is supported currently.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosFileUploadTrigger This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CosFileUploadTrigger getCosFileUploadTrigger() {
        return this.CosFileUploadTrigger;
    }

    /**
     * Set This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosFileUploadTrigger This parameter is required and valid when `Type` is `CosFileUpload`, indicating the COS trigger rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosFileUploadTrigger(CosFileUploadTrigger CosFileUploadTrigger) {
        this.CosFileUploadTrigger = CosFileUploadTrigger;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosFileUploadTrigger.", this.CosFileUploadTrigger);

    }
}

