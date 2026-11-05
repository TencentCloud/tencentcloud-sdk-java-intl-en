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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocLink extends AbstractModel {

    /**
    * <p>COS link address, which can be used for preview and download</p>
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * <p>External link</p>
    */
    @SerializedName("ExternalLink")
    @Expose
    private DocExternalLink ExternalLink;

    /**
     * Get <p>COS link address, which can be used for preview and download</p> 
     * @return CosUrl <p>COS link address, which can be used for preview and download</p>
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set <p>COS link address, which can be used for preview and download</p>
     * @param CosUrl <p>COS link address, which can be used for preview and download</p>
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get <p>External link</p> 
     * @return ExternalLink <p>External link</p>
     */
    public DocExternalLink getExternalLink() {
        return this.ExternalLink;
    }

    /**
     * Set <p>External link</p>
     * @param ExternalLink <p>External link</p>
     */
    public void setExternalLink(DocExternalLink ExternalLink) {
        this.ExternalLink = ExternalLink;
    }

    public DocLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocLink(DocLink source) {
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.ExternalLink != null) {
            this.ExternalLink = new DocExternalLink(source.ExternalLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamObj(map, prefix + "ExternalLink.", this.ExternalLink);

    }
}

