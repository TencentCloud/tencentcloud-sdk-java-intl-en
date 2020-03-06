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

public class TaskOutputStorage extends AbstractModel{

    /**
    * Storage location type of a video processing output object. Only COS is supported currently.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter is valid and required when `Type` is COS, indicating the location of an output COS object after video processing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosOutputStorage")
    @Expose
    private CosOutputStorage CosOutputStorage;

    /**
     * Get Storage location type of a video processing output object. Only COS is supported currently. 
     * @return Type Storage location type of a video processing output object. Only COS is supported currently.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Storage location type of a video processing output object. Only COS is supported currently.
     * @param Type Storage location type of a video processing output object. Only COS is supported currently.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter is valid and required when `Type` is COS, indicating the location of an output COS object after video processing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosOutputStorage This parameter is valid and required when `Type` is COS, indicating the location of an output COS object after video processing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CosOutputStorage getCosOutputStorage() {
        return this.CosOutputStorage;
    }

    /**
     * Set This parameter is valid and required when `Type` is COS, indicating the location of an output COS object after video processing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosOutputStorage This parameter is valid and required when `Type` is COS, indicating the location of an output COS object after video processing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosOutputStorage(CosOutputStorage CosOutputStorage) {
        this.CosOutputStorage = CosOutputStorage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosOutputStorage.", this.CosOutputStorage);

    }
}

