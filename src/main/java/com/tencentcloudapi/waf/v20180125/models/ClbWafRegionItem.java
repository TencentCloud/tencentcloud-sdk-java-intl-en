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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbWafRegionItem extends AbstractModel {

    /**
    * Region ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Regional Chinese Description

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Full English Name of the Region

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Region encoding

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get Region ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Regional Chinese Description

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text Regional Chinese Description

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Regional Chinese Description

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text Regional Chinese Description

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Full English Name of the Region

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Full English Name of the Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Full English Name of the Region

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Full English Name of the Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Region encoding

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Code Region encoding

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Region encoding

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Code Region encoding

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public ClbWafRegionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbWafRegionItem(ClbWafRegionItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

