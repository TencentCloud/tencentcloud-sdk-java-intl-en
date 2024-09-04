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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetKeyVal extends AbstractModel {

    /**
    * Tag
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Quantity
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Number of additions today
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewCount")
    @Expose
    private Long NewCount;

    /**
     * Get Tag 
     * @return Key Tag
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Tag
     * @param Key Tag
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Quantity 
     * @return Value Quantity
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Quantity
     * @param Value Quantity
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Desc Description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Desc Description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Number of additions today
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewCount Number of additions today
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNewCount() {
        return this.NewCount;
    }

    /**
     * Set Number of additions today
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewCount Number of additions today
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewCount(Long NewCount) {
        this.NewCount = NewCount;
    }

    public AssetKeyVal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetKeyVal(AssetKeyVal source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.NewCount != null) {
            this.NewCount = new Long(source.NewCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "NewCount", this.NewCount);

    }
}
