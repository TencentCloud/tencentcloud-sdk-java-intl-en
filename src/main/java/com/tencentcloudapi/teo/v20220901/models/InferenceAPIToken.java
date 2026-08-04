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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceAPIToken extends AbstractModel {

    /**
    * Reasoning API Token ID.
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * Reasoning API Token name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Reasoning API Token content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Reasoning API Token ID. 
     * @return TokenId Reasoning API Token ID.
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set Reasoning API Token ID.
     * @param TokenId Reasoning API Token ID.
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get Reasoning API Token name. 
     * @return Name Reasoning API Token name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Reasoning API Token name.
     * @param Name Reasoning API Token name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Reasoning API Token content. 
     * @return Content Reasoning API Token content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Reasoning API Token content.
     * @param Content Reasoning API Token content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public InferenceAPIToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceAPIToken(InferenceAPIToken source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

