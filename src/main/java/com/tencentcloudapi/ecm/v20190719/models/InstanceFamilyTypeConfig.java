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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceFamilyTypeConfig extends AbstractModel {

    /**
    * Instance model family type ID
    */
    @SerializedName("InstanceFamilyType")
    @Expose
    private String InstanceFamilyType;

    /**
    * Instance model family type name
    */
    @SerializedName("InstanceFamilyTypeName")
    @Expose
    private String InstanceFamilyTypeName;

    /**
     * Get Instance model family type ID 
     * @return InstanceFamilyType Instance model family type ID
     */
    public String getInstanceFamilyType() {
        return this.InstanceFamilyType;
    }

    /**
     * Set Instance model family type ID
     * @param InstanceFamilyType Instance model family type ID
     */
    public void setInstanceFamilyType(String InstanceFamilyType) {
        this.InstanceFamilyType = InstanceFamilyType;
    }

    /**
     * Get Instance model family type name 
     * @return InstanceFamilyTypeName Instance model family type name
     */
    public String getInstanceFamilyTypeName() {
        return this.InstanceFamilyTypeName;
    }

    /**
     * Set Instance model family type name
     * @param InstanceFamilyTypeName Instance model family type name
     */
    public void setInstanceFamilyTypeName(String InstanceFamilyTypeName) {
        this.InstanceFamilyTypeName = InstanceFamilyTypeName;
    }

    public InstanceFamilyTypeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceFamilyTypeConfig(InstanceFamilyTypeConfig source) {
        if (source.InstanceFamilyType != null) {
            this.InstanceFamilyType = new String(source.InstanceFamilyType);
        }
        if (source.InstanceFamilyTypeName != null) {
            this.InstanceFamilyTypeName = new String(source.InstanceFamilyTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamilyType", this.InstanceFamilyType);
        this.setParamSimple(map, prefix + "InstanceFamilyTypeName", this.InstanceFamilyTypeName);

    }
}

