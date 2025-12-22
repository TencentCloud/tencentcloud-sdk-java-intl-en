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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbWatermarkInputInfo extends AbstractModel {

    /**
    * Input type, optional URL/COS, currently only supports URL

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * URL input information
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private UrlInputInfo UrlInputInfo;

    /**
     * Get Input type, optional URL/COS, currently only supports URL
 
     * @return Type Input type, optional URL/COS, currently only supports URL

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input type, optional URL/COS, currently only supports URL

     * @param Type Input type, optional URL/COS, currently only supports URL

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get URL input information 
     * @return UrlInputInfo URL input information
     */
    public UrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set URL input information
     * @param UrlInputInfo URL input information
     */
    public void setUrlInputInfo(UrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    public AbWatermarkInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbWatermarkInputInfo(AbWatermarkInputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UrlInputInfo != null) {
            this.UrlInputInfo = new UrlInputInfo(source.UrlInputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "UrlInputInfo.", this.UrlInputInfo);

    }
}

