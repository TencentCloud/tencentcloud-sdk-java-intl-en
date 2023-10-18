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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * ID of the instance to be modified
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * New instance name (up to 255 characters)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * New instance description (up to 1,024 characters)
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
     * Get ID of the instance to be modified 
     * @return InstanceId ID of the instance to be modified
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be modified
     * @param InstanceId ID of the instance to be modified
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get New instance name (up to 255 characters) 
     * @return InstanceName New instance name (up to 255 characters)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set New instance name (up to 255 characters)
     * @param InstanceName New instance name (up to 255 characters)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get New instance description (up to 1,024 characters) 
     * @return InstanceDesc New instance description (up to 1,024 characters)
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set New instance description (up to 1,024 characters)
     * @param InstanceDesc New instance description (up to 1,024 characters)
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);

    }
}

