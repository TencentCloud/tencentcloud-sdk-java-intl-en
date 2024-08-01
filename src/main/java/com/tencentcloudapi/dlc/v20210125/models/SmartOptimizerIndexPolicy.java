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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartOptimizerIndexPolicy extends AbstractModel {

    /**
    * Enable index.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexEnable")
    @Expose
    private String IndexEnable;

    /**
     * Get Enable index.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndexEnable Enable index.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexEnable() {
        return this.IndexEnable;
    }

    /**
     * Set Enable index.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndexEnable Enable index.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexEnable(String IndexEnable) {
        this.IndexEnable = IndexEnable;
    }

    public SmartOptimizerIndexPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartOptimizerIndexPolicy(SmartOptimizerIndexPolicy source) {
        if (source.IndexEnable != null) {
            this.IndexEnable = new String(source.IndexEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexEnable", this.IndexEnable);

    }
}

