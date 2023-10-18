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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishLayerVersionRequest extends AbstractModel {

    /**
    * Layer name, which can contain 1-64 English letters, digits, hyphens, and underscores, must begin with a letter, and cannot end with a hyphen or underscore
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * Runtimes compatible with layer. Multiple choices are allowed. The valid values of this parameter correspond to the valid values of the `Runtime` of the function.
    */
    @SerializedName("CompatibleRuntimes")
    @Expose
    private String [] CompatibleRuntimes;

    /**
    * Layer file source or content
    */
    @SerializedName("Content")
    @Expose
    private Code Content;

    /**
    * Layer version description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Software license of layer
    */
    @SerializedName("LicenseInfo")
    @Expose
    private String LicenseInfo;

    /**
     * Get Layer name, which can contain 1-64 English letters, digits, hyphens, and underscores, must begin with a letter, and cannot end with a hyphen or underscore 
     * @return LayerName Layer name, which can contain 1-64 English letters, digits, hyphens, and underscores, must begin with a letter, and cannot end with a hyphen or underscore
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set Layer name, which can contain 1-64 English letters, digits, hyphens, and underscores, must begin with a letter, and cannot end with a hyphen or underscore
     * @param LayerName Layer name, which can contain 1-64 English letters, digits, hyphens, and underscores, must begin with a letter, and cannot end with a hyphen or underscore
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get Runtimes compatible with layer. Multiple choices are allowed. The valid values of this parameter correspond to the valid values of the `Runtime` of the function. 
     * @return CompatibleRuntimes Runtimes compatible with layer. Multiple choices are allowed. The valid values of this parameter correspond to the valid values of the `Runtime` of the function.
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set Runtimes compatible with layer. Multiple choices are allowed. The valid values of this parameter correspond to the valid values of the `Runtime` of the function.
     * @param CompatibleRuntimes Runtimes compatible with layer. Multiple choices are allowed. The valid values of this parameter correspond to the valid values of the `Runtime` of the function.
     */
    public void setCompatibleRuntimes(String [] CompatibleRuntimes) {
        this.CompatibleRuntimes = CompatibleRuntimes;
    }

    /**
     * Get Layer file source or content 
     * @return Content Layer file source or content
     */
    public Code getContent() {
        return this.Content;
    }

    /**
     * Set Layer file source or content
     * @param Content Layer file source or content
     */
    public void setContent(Code Content) {
        this.Content = Content;
    }

    /**
     * Get Layer version description 
     * @return Description Layer version description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Layer version description
     * @param Description Layer version description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Software license of layer 
     * @return LicenseInfo Software license of layer
     */
    public String getLicenseInfo() {
        return this.LicenseInfo;
    }

    /**
     * Set Software license of layer
     * @param LicenseInfo Software license of layer
     */
    public void setLicenseInfo(String LicenseInfo) {
        this.LicenseInfo = LicenseInfo;
    }

    public PublishLayerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishLayerVersionRequest(PublishLayerVersionRequest source) {
        if (source.LayerName != null) {
            this.LayerName = new String(source.LayerName);
        }
        if (source.CompatibleRuntimes != null) {
            this.CompatibleRuntimes = new String[source.CompatibleRuntimes.length];
            for (int i = 0; i < source.CompatibleRuntimes.length; i++) {
                this.CompatibleRuntimes[i] = new String(source.CompatibleRuntimes[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new Code(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LicenseInfo != null) {
            this.LicenseInfo = new String(source.LicenseInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamArraySimple(map, prefix + "CompatibleRuntimes.", this.CompatibleRuntimes);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LicenseInfo", this.LicenseInfo);

    }
}

