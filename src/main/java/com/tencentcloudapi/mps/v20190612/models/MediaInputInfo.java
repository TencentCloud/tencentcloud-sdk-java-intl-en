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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInputInfo extends AbstractModel{

    /**
    * The type of video processing input object. COS and URL objects are supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter is required and valid when `Type` is `COS`, indicating the information of a COS object for video processing.
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * This parameter is required and valid when `Type` is `URL`, indicating the information of a URL object for video processing.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private UrlInputInfo UrlInputInfo;

    /**
     * Get The type of video processing input object. COS and URL objects are supported. 
     * @return Type The type of video processing input object. COS and URL objects are supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type of video processing input object. COS and URL objects are supported.
     * @param Type The type of video processing input object. COS and URL objects are supported.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter is required and valid when `Type` is `COS`, indicating the information of a COS object for video processing. 
     * @return CosInputInfo This parameter is required and valid when `Type` is `COS`, indicating the information of a COS object for video processing.
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set This parameter is required and valid when `Type` is `COS`, indicating the information of a COS object for video processing.
     * @param CosInputInfo This parameter is required and valid when `Type` is `COS`, indicating the information of a COS object for video processing.
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get This parameter is required and valid when `Type` is `URL`, indicating the information of a URL object for video processing.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return UrlInputInfo This parameter is required and valid when `Type` is `URL`, indicating the information of a URL object for video processing.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public UrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set This parameter is required and valid when `Type` is `URL`, indicating the information of a URL object for video processing.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param UrlInputInfo This parameter is required and valid when `Type` is `URL`, indicating the information of a URL object for video processing.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUrlInputInfo(UrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamObj(map, prefix + "UrlInputInfo.", this.UrlInputInfo);

    }
}

