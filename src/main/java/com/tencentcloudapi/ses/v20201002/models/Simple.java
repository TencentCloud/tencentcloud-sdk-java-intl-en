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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Simple extends AbstractModel{

    /**
    * HTML code after base64 encoding. To ensure correct display, this parameter should include all code information and cannot contain external CSS.
    */
    @SerializedName("Html")
    @Expose
    private String Html;

    /**
    * Plain text content after base64 encoding. If HTML is not involved, the plain text will be displayed in the email. Otherwise, this parameter represents the plain text style of the email.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get HTML code after base64 encoding. To ensure correct display, this parameter should include all code information and cannot contain external CSS. 
     * @return Html HTML code after base64 encoding. To ensure correct display, this parameter should include all code information and cannot contain external CSS.
     */
    public String getHtml() {
        return this.Html;
    }

    /**
     * Set HTML code after base64 encoding. To ensure correct display, this parameter should include all code information and cannot contain external CSS.
     * @param Html HTML code after base64 encoding. To ensure correct display, this parameter should include all code information and cannot contain external CSS.
     */
    public void setHtml(String Html) {
        this.Html = Html;
    }

    /**
     * Get Plain text content after base64 encoding. If HTML is not involved, the plain text will be displayed in the email. Otherwise, this parameter represents the plain text style of the email. 
     * @return Text Plain text content after base64 encoding. If HTML is not involved, the plain text will be displayed in the email. Otherwise, this parameter represents the plain text style of the email.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Plain text content after base64 encoding. If HTML is not involved, the plain text will be displayed in the email. Otherwise, this parameter represents the plain text style of the email.
     * @param Text Plain text content after base64 encoding. If HTML is not involved, the plain text will be displayed in the email. Otherwise, this parameter represents the plain text style of the email.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public Simple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Simple(Simple source) {
        if (source.Html != null) {
            this.Html = new String(source.Html);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Html", this.Html);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

