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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCustomParameters extends AbstractModel {

    /**
    * Parameter name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter value
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Parameter name 
     * @return Name Parameter name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name
     * @param Name Parameter name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter value 
     * @return Values Parameter value
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Parameter value
     * @param Values Parameter value
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public ClusterCustomParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCustomParameters(ClusterCustomParameters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

