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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAppCategoryRspOption extends AbstractModel {

    /**
    * Type name.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Type value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Type log.
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
     * Get Type name. 
     * @return Text Type name.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Type name.
     * @param Text Type name.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Type value. 
     * @return Value Type value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Type value.
     * @param Value Type value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Type log. 
     * @return Logo Type log.
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Type log.
     * @param Logo Type log.
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public ListAppCategoryRspOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAppCategoryRspOption(ListAppCategoryRspOption source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Logo", this.Logo);

    }
}

