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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultParameterConf extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * Default parameter value.
    */
    @SerializedName("ParameterValue")
    @Expose
    private String ParameterValue;

    /**
    * Parameter description.
    */
    @SerializedName("ParameterDescription")
    @Expose
    private String ParameterDescription;

    /**
     * Get Parameter name. 
     * @return ParameterName Parameter name.
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set Parameter name.
     * @param ParameterName Parameter name.
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get Default parameter value. 
     * @return ParameterValue Default parameter value.
     */
    public String getParameterValue() {
        return this.ParameterValue;
    }

    /**
     * Set Default parameter value.
     * @param ParameterValue Default parameter value.
     */
    public void setParameterValue(String ParameterValue) {
        this.ParameterValue = ParameterValue;
    }

    /**
     * Get Parameter description. 
     * @return ParameterDescription Parameter description.
     */
    public String getParameterDescription() {
        return this.ParameterDescription;
    }

    /**
     * Set Parameter description.
     * @param ParameterDescription Parameter description.
     */
    public void setParameterDescription(String ParameterDescription) {
        this.ParameterDescription = ParameterDescription;
    }

    public DefaultParameterConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultParameterConf(DefaultParameterConf source) {
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.ParameterValue != null) {
            this.ParameterValue = new String(source.ParameterValue);
        }
        if (source.ParameterDescription != null) {
            this.ParameterDescription = new String(source.ParameterDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "ParameterValue", this.ParameterValue);
        this.setParamSimple(map, prefix + "ParameterDescription", this.ParameterDescription);

    }
}

