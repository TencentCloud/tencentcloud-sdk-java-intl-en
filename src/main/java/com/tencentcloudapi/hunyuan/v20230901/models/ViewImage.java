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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewImage extends AbstractModel {

    /**
    * Specifies the viewing angle type.
Valid values: back, left, right.
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * Image Url.
    */
    @SerializedName("ViewImageUrl")
    @Expose
    private String ViewImageUrl;

    /**
    * base64 address of the image.
    */
    @SerializedName("ViewImageBase64")
    @Expose
    private String ViewImageBase64;

    /**
     * Get Specifies the viewing angle type.
Valid values: back, left, right. 
     * @return ViewType Specifies the viewing angle type.
Valid values: back, left, right.
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set Specifies the viewing angle type.
Valid values: back, left, right.
     * @param ViewType Specifies the viewing angle type.
Valid values: back, left, right.
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get Image Url. 
     * @return ViewImageUrl Image Url.
     */
    public String getViewImageUrl() {
        return this.ViewImageUrl;
    }

    /**
     * Set Image Url.
     * @param ViewImageUrl Image Url.
     */
    public void setViewImageUrl(String ViewImageUrl) {
        this.ViewImageUrl = ViewImageUrl;
    }

    /**
     * Get base64 address of the image. 
     * @return ViewImageBase64 base64 address of the image.
     */
    public String getViewImageBase64() {
        return this.ViewImageBase64;
    }

    /**
     * Set base64 address of the image.
     * @param ViewImageBase64 base64 address of the image.
     */
    public void setViewImageBase64(String ViewImageBase64) {
        this.ViewImageBase64 = ViewImageBase64;
    }

    public ViewImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewImage(ViewImage source) {
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.ViewImageUrl != null) {
            this.ViewImageUrl = new String(source.ViewImageUrl);
        }
        if (source.ViewImageBase64 != null) {
            this.ViewImageBase64 = new String(source.ViewImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "ViewImageUrl", this.ViewImageUrl);
        this.setParamSimple(map, prefix + "ViewImageBase64", this.ViewImageBase64);

    }
}

