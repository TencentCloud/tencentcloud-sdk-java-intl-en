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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BooleanInfo extends AbstractModel {

    /**
    * Bool type response object
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
     * Get Bool type response object
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Result Bool type response object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Bool type response object
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Result Bool type response object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    public BooleanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BooleanInfo(BooleanInfo source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

