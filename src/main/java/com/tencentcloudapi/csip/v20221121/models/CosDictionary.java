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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosDictionary extends AbstractModel {

    /**
    * <p>Dictionary id.</p>
    */
    @SerializedName("DictId")
    @Expose
    private Long DictId;

    /**
    * <p>Dictionary name</p>
    */
    @SerializedName("DictName")
    @Expose
    private String DictName;

    /**
     * Get <p>Dictionary id.</p> 
     * @return DictId <p>Dictionary id.</p>
     */
    public Long getDictId() {
        return this.DictId;
    }

    /**
     * Set <p>Dictionary id.</p>
     * @param DictId <p>Dictionary id.</p>
     */
    public void setDictId(Long DictId) {
        this.DictId = DictId;
    }

    /**
     * Get <p>Dictionary name</p> 
     * @return DictName <p>Dictionary name</p>
     */
    public String getDictName() {
        return this.DictName;
    }

    /**
     * Set <p>Dictionary name</p>
     * @param DictName <p>Dictionary name</p>
     */
    public void setDictName(String DictName) {
        this.DictName = DictName;
    }

    public CosDictionary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosDictionary(CosDictionary source) {
        if (source.DictId != null) {
            this.DictId = new Long(source.DictId);
        }
        if (source.DictName != null) {
            this.DictName = new String(source.DictName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DictId", this.DictId);
        this.setParamSimple(map, prefix + "DictName", this.DictName);

    }
}

