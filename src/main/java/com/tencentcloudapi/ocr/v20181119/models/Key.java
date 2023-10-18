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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Key extends AbstractModel {

    /**
    * The name of the recognized field.
    */
    @SerializedName("AutoName")
    @Expose
    private String AutoName;

    /**
    * The name of a defined field (the key passed in).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
     * Get The name of the recognized field. 
     * @return AutoName The name of the recognized field.
     */
    public String getAutoName() {
        return this.AutoName;
    }

    /**
     * Set The name of the recognized field.
     * @param AutoName The name of the recognized field.
     */
    public void setAutoName(String AutoName) {
        this.AutoName = AutoName;
    }

    /**
     * Get The name of a defined field (the key passed in).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigName The name of a defined field (the key passed in).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set The name of a defined field (the key passed in).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigName The name of a defined field (the key passed in).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    public Key() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Key(Key source) {
        if (source.AutoName != null) {
            this.AutoName = new String(source.AutoName);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoName", this.AutoName);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);

    }
}

