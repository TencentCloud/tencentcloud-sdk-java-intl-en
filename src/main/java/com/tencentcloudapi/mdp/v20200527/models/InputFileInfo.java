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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputFileInfo extends AbstractModel {

    /**
    * Input file Type. The input types include COS and URL.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * cos input informations. 
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * input file url.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Input file Type. The input types include COS and URL. 
     * @return Type Input file Type. The input types include COS and URL.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input file Type. The input types include COS and URL.
     * @param Type Input file Type. The input types include COS and URL.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get cos input informations.  
     * @return CosInputInfo cos input informations. 
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set cos input informations. 
     * @param CosInputInfo cos input informations. 
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get input file url. 
     * @return Url input file url.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set input file url.
     * @param Url input file url.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public InputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputFileInfo(InputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosInputInfo != null) {
            this.CosInputInfo = new CosInputInfo(source.CosInputInfo);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

