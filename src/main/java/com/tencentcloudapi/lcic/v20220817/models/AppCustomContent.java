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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppCustomContent extends AbstractModel {

    /**
    * Multiple scenarios can be set for an application.
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * Logo URL
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * Homepage URL, which can be used for redirection
    */
    @SerializedName("HomeUrl")
    @Expose
    private String HomeUrl;

    /**
    * Custom JS URL
    */
    @SerializedName("JsUrl")
    @Expose
    private String JsUrl;

    /**
    * Custom CSS URL
    */
    @SerializedName("CssUrl")
    @Expose
    private String CssUrl;

    /**
     * Get Multiple scenarios can be set for an application. 
     * @return Scene Multiple scenarios can be set for an application.
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Multiple scenarios can be set for an application.
     * @param Scene Multiple scenarios can be set for an application.
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get Logo URL 
     * @return LogoUrl Logo URL
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set Logo URL
     * @param LogoUrl Logo URL
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get Homepage URL, which can be used for redirection 
     * @return HomeUrl Homepage URL, which can be used for redirection
     */
    public String getHomeUrl() {
        return this.HomeUrl;
    }

    /**
     * Set Homepage URL, which can be used for redirection
     * @param HomeUrl Homepage URL, which can be used for redirection
     */
    public void setHomeUrl(String HomeUrl) {
        this.HomeUrl = HomeUrl;
    }

    /**
     * Get Custom JS URL 
     * @return JsUrl Custom JS URL
     */
    public String getJsUrl() {
        return this.JsUrl;
    }

    /**
     * Set Custom JS URL
     * @param JsUrl Custom JS URL
     */
    public void setJsUrl(String JsUrl) {
        this.JsUrl = JsUrl;
    }

    /**
     * Get Custom CSS URL 
     * @return CssUrl Custom CSS URL
     */
    public String getCssUrl() {
        return this.CssUrl;
    }

    /**
     * Set Custom CSS URL
     * @param CssUrl Custom CSS URL
     */
    public void setCssUrl(String CssUrl) {
        this.CssUrl = CssUrl;
    }

    public AppCustomContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppCustomContent(AppCustomContent source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.LogoUrl != null) {
            this.LogoUrl = new String(source.LogoUrl);
        }
        if (source.HomeUrl != null) {
            this.HomeUrl = new String(source.HomeUrl);
        }
        if (source.JsUrl != null) {
            this.JsUrl = new String(source.JsUrl);
        }
        if (source.CssUrl != null) {
            this.CssUrl = new String(source.CssUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "LogoUrl", this.LogoUrl);
        this.setParamSimple(map, prefix + "HomeUrl", this.HomeUrl);
        this.setParamSimple(map, prefix + "JsUrl", this.JsUrl);
        this.setParamSimple(map, prefix + "CssUrl", this.CssUrl);

    }
}

