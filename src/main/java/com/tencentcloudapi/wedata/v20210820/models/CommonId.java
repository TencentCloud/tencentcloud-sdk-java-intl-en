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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonId extends AbstractModel {

    /**
    * ID Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get ID Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id ID Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id ID Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public CommonId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonId(CommonId source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

