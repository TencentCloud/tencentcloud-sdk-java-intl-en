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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HotKeyInfo extends AbstractModel {

    /**
    * The name of the hot key.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Key type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of accesses for the hot key in a specified time period.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get The name of the hot key. 
     * @return Key The name of the hot key.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set The name of the hot key.
     * @param Key The name of the hot key.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Key type. 
     * @return Type Key type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Key type.
     * @param Type Key type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of accesses for the hot key in a specified time period. 
     * @return Count Number of accesses for the hot key in a specified time period.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of accesses for the hot key in a specified time period.
     * @param Count Number of accesses for the hot key in a specified time period.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public HotKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HotKeyInfo(HotKeyInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

