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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceFamilyConfig extends AbstractModel{

    /**
    * Full name of the model family.
    */
    @SerializedName("InstanceFamilyName")
    @Expose
    private String InstanceFamilyName;

    /**
    * Acronym of the model family.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
     * Get Full name of the model family. 
     * @return InstanceFamilyName Full name of the model family.
     */
    public String getInstanceFamilyName() {
        return this.InstanceFamilyName;
    }

    /**
     * Set Full name of the model family.
     * @param InstanceFamilyName Full name of the model family.
     */
    public void setInstanceFamilyName(String InstanceFamilyName) {
        this.InstanceFamilyName = InstanceFamilyName;
    }

    /**
     * Get Acronym of the model family. 
     * @return InstanceFamily Acronym of the model family.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Acronym of the model family.
     * @param InstanceFamily Acronym of the model family.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamilyName", this.InstanceFamilyName);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}

