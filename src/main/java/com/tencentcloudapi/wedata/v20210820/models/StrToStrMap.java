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

public class StrToStrMap extends AbstractModel {

    /**
    * k
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("K")
    @Expose
    private String K;

    /**
    * v
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("V")
    @Expose
    private String V;

    /**
     * Get k
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return K k
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getK() {
        return this.K;
    }

    /**
     * Set k
Note: This field may return null, indicating that no valid value can be obtained.
     * @param K k
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setK(String K) {
        this.K = K;
    }

    /**
     * Get v
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return V v
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getV() {
        return this.V;
    }

    /**
     * Set v
Note: This field may return null, indicating that no valid value can be obtained.
     * @param V v
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setV(String V) {
        this.V = V;
    }

    public StrToStrMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrToStrMap(StrToStrMap source) {
        if (source.K != null) {
            this.K = new String(source.K);
        }
        if (source.V != null) {
            this.V = new String(source.V);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "K", this.K);
        this.setParamSimple(map, prefix + "V", this.V);

    }
}

