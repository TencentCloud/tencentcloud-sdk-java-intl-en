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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DictInfo extends AbstractModel {

    /**
    * Dictionary key value
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Dictionary name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Dictionary size in B
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Dictionary key value 
     * @return Key Dictionary key value
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Dictionary key value
     * @param Key Dictionary key value
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Dictionary name 
     * @return Name Dictionary name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dictionary name
     * @param Name Dictionary name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Dictionary size in B 
     * @return Size Dictionary size in B
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Dictionary size in B
     * @param Size Dictionary size in B
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public DictInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DictInfo(DictInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

