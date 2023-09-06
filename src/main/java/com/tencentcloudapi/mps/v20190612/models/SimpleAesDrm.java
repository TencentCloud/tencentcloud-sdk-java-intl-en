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

public class SimpleAesDrm extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
     * Get  
     * @return Uri 
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 
     * @param Uri 
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get  
     * @return Key 
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 
     * @param Key 
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get  
     * @return Vector 
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set 
     * @param Vector 
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    public SimpleAesDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleAesDrm(SimpleAesDrm source) {
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Vector != null) {
            this.Vector = new String(source.Vector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Vector", this.Vector);

    }
}

