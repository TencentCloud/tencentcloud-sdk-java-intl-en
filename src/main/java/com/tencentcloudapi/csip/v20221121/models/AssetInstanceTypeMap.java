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

public class AssetInstanceTypeMap extends AbstractModel {

    /**
    * Asset type.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Asset type.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Mapping of asset type and instance type.
    */
    @SerializedName("InstanceTypeList")
    @Expose
    private FilterDataObject [] InstanceTypeList;

    /**
     * Get Asset type. 
     * @return Text Asset type.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Asset type.
     * @param Text Asset type.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Asset type. 
     * @return Value Asset type.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Asset type.
     * @param Value Asset type.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Mapping of asset type and instance type. 
     * @return InstanceTypeList Mapping of asset type and instance type.
     */
    public FilterDataObject [] getInstanceTypeList() {
        return this.InstanceTypeList;
    }

    /**
     * Set Mapping of asset type and instance type.
     * @param InstanceTypeList Mapping of asset type and instance type.
     */
    public void setInstanceTypeList(FilterDataObject [] InstanceTypeList) {
        this.InstanceTypeList = InstanceTypeList;
    }

    public AssetInstanceTypeMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetInstanceTypeMap(AssetInstanceTypeMap source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.InstanceTypeList != null) {
            this.InstanceTypeList = new FilterDataObject[source.InstanceTypeList.length];
            for (int i = 0; i < source.InstanceTypeList.length; i++) {
                this.InstanceTypeList[i] = new FilterDataObject(source.InstanceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "InstanceTypeList.", this.InstanceTypeList);

    }
}

