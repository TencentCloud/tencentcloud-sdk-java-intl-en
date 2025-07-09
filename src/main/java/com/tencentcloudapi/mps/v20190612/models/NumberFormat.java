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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NumberFormat extends AbstractModel {

    /**
    * Start value of the `{number}` variable. Default value: 0.
    */
    @SerializedName("InitialValue")
    @Expose
    private Long InitialValue;

    /**
    * Increment of the `{number}` variable. Default value: 1.
    */
    @SerializedName("Increment")
    @Expose
    private Long Increment;

    /**
    * Minimum length of the `{number}` variable. A placeholder will be used if the variable length is below the minimum requirement. Default value: 1.
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * Placeholder used when the `{number}` variable length is below the minimum requirement. Default value: 0.
    */
    @SerializedName("PlaceHolder")
    @Expose
    private String PlaceHolder;

    /**
     * Get Start value of the `{number}` variable. Default value: 0. 
     * @return InitialValue Start value of the `{number}` variable. Default value: 0.
     */
    public Long getInitialValue() {
        return this.InitialValue;
    }

    /**
     * Set Start value of the `{number}` variable. Default value: 0.
     * @param InitialValue Start value of the `{number}` variable. Default value: 0.
     */
    public void setInitialValue(Long InitialValue) {
        this.InitialValue = InitialValue;
    }

    /**
     * Get Increment of the `{number}` variable. Default value: 1. 
     * @return Increment Increment of the `{number}` variable. Default value: 1.
     */
    public Long getIncrement() {
        return this.Increment;
    }

    /**
     * Set Increment of the `{number}` variable. Default value: 1.
     * @param Increment Increment of the `{number}` variable. Default value: 1.
     */
    public void setIncrement(Long Increment) {
        this.Increment = Increment;
    }

    /**
     * Get Minimum length of the `{number}` variable. A placeholder will be used if the variable length is below the minimum requirement. Default value: 1. 
     * @return MinLength Minimum length of the `{number}` variable. A placeholder will be used if the variable length is below the minimum requirement. Default value: 1.
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set Minimum length of the `{number}` variable. A placeholder will be used if the variable length is below the minimum requirement. Default value: 1.
     * @param MinLength Minimum length of the `{number}` variable. A placeholder will be used if the variable length is below the minimum requirement. Default value: 1.
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get Placeholder used when the `{number}` variable length is below the minimum requirement. Default value: 0. 
     * @return PlaceHolder Placeholder used when the `{number}` variable length is below the minimum requirement. Default value: 0.
     */
    public String getPlaceHolder() {
        return this.PlaceHolder;
    }

    /**
     * Set Placeholder used when the `{number}` variable length is below the minimum requirement. Default value: 0.
     * @param PlaceHolder Placeholder used when the `{number}` variable length is below the minimum requirement. Default value: 0.
     */
    public void setPlaceHolder(String PlaceHolder) {
        this.PlaceHolder = PlaceHolder;
    }

    public NumberFormat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NumberFormat(NumberFormat source) {
        if (source.InitialValue != null) {
            this.InitialValue = new Long(source.InitialValue);
        }
        if (source.Increment != null) {
            this.Increment = new Long(source.Increment);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
        if (source.PlaceHolder != null) {
            this.PlaceHolder = new String(source.PlaceHolder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitialValue", this.InitialValue);
        this.setParamSimple(map, prefix + "Increment", this.Increment);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "PlaceHolder", this.PlaceHolder);

    }
}

