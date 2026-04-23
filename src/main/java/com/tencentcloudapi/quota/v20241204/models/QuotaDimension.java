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
package com.tencentcloudapi.quota.v20241204.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaDimension extends AbstractModel {

    /**
    * Quota dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
    * Dimension value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrimaryValue")
    @Expose
    private String PrimaryValue;

    /**
     * Get Quota dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DimensionName Quota dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set Quota dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DimensionName Quota dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    /**
     * Get Dimension value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrimaryValue Dimension value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrimaryValue() {
        return this.PrimaryValue;
    }

    /**
     * Set Dimension value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrimaryValue Dimension value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrimaryValue(String PrimaryValue) {
        this.PrimaryValue = PrimaryValue;
    }

    public QuotaDimension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaDimension(QuotaDimension source) {
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
        if (source.PrimaryValue != null) {
            this.PrimaryValue = new String(source.PrimaryValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);
        this.setParamSimple(map, prefix + "PrimaryValue", this.PrimaryValue);

    }
}

