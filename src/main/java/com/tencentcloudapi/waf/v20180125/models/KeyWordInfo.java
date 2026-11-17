/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyWordInfo extends AbstractModel {

    /**
    * id of the hit word library
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name of the hit word library
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get id of the hit word library 
     * @return Id id of the hit word library
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id of the hit word library
     * @param Id id of the hit word library
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Name of the hit word library 
     * @return Name Name of the hit word library
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the hit word library
     * @param Name Name of the hit word library
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public KeyWordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyWordInfo(KeyWordInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

