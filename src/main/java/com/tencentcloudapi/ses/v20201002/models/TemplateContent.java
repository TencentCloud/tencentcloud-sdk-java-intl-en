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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateContent extends AbstractModel {

    /**
    * HTML code after base64 encoding.
    */
    @SerializedName("Html")
    @Expose
    private String Html;

    /**
    * Text content after base64 encoding.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get HTML code after base64 encoding. 
     * @return Html HTML code after base64 encoding.
     */
    public String getHtml() {
        return this.Html;
    }

    /**
     * Set HTML code after base64 encoding.
     * @param Html HTML code after base64 encoding.
     */
    public void setHtml(String Html) {
        this.Html = Html;
    }

    /**
     * Get Text content after base64 encoding. 
     * @return Text Text content after base64 encoding.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Text content after base64 encoding.
     * @param Text Text content after base64 encoding.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public TemplateContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateContent(TemplateContent source) {
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

