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

public class SandboxContent extends AbstractModel {

    /**
    * URL address of the sandbox
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * URL address for opening the sandbox through a browser
    */
    @SerializedName("DisplayUrl")
    @Expose
    private String DisplayUrl;

    /**
    * Sandbox output content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get URL address of the sandbox 
     * @return Url URL address of the sandbox
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL address of the sandbox
     * @param Url URL address of the sandbox
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get URL address for opening the sandbox through a browser 
     * @return DisplayUrl URL address for opening the sandbox through a browser
     */
    public String getDisplayUrl() {
        return this.DisplayUrl;
    }

    /**
     * Set URL address for opening the sandbox through a browser
     * @param DisplayUrl URL address for opening the sandbox through a browser
     */
    public void setDisplayUrl(String DisplayUrl) {
        this.DisplayUrl = DisplayUrl;
    }

    /**
     * Get Sandbox output content 
     * @return Content Sandbox output content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Sandbox output content
     * @param Content Sandbox output content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public SandboxContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SandboxContent(SandboxContent source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.DisplayUrl != null) {
            this.DisplayUrl = new String(source.DisplayUrl);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "DisplayUrl", this.DisplayUrl);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

