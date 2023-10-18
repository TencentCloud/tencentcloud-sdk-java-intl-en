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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstanceNameRequest extends AbstractModel {

    /**
    * Name of the instance to be created
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
     * Get Name of the instance to be created 
     * @return RegistryName Name of the instance to be created
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set Name of the instance to be created
     * @param RegistryName Name of the instance to be created
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    public CheckInstanceNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstanceNameRequest(CheckInstanceNameRequest source) {
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);

    }
}

