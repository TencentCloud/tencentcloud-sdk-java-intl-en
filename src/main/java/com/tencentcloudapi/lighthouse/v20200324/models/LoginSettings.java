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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel {

    /**
    * Key ID list. After a key is associated, you can use it to access the instance. Note: this field may return [], indicating that no valid values can be obtained.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
     * Get Key ID list. After a key is associated, you can use it to access the instance. Note: this field may return [], indicating that no valid values can be obtained. 
     * @return KeyIds Key ID list. After a key is associated, you can use it to access the instance. Note: this field may return [], indicating that no valid values can be obtained.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set Key ID list. After a key is associated, you can use it to access the instance. Note: this field may return [], indicating that no valid values can be obtained.
     * @param KeyIds Key ID list. After a key is associated, you can use it to access the instance. Note: this field may return [], indicating that no valid values can be obtained.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    public LoginSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginSettings(LoginSettings source) {
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);

    }
}

