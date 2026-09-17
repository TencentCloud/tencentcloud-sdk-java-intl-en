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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWordSampleRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * 
    */
    @SerializedName("TagOperationInfo")
    @Expose
    private AiSampleTagOperation TagOperationInfo;

    /**
     * Get  
     * @return Keyword 
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 
     * @param Keyword 
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Usages 
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set 
     * @param Usages 
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get  
     * @return TagOperationInfo 
     */
    public AiSampleTagOperation getTagOperationInfo() {
        return this.TagOperationInfo;
    }

    /**
     * Set 
     * @param TagOperationInfo 
     */
    public void setTagOperationInfo(AiSampleTagOperation TagOperationInfo) {
        this.TagOperationInfo = TagOperationInfo;
    }

    public ModifyWordSampleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWordSampleRequest(ModifyWordSampleRequest source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Usages != null) {
            this.Usages = new String[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new String(source.Usages[i]);
            }
        }
        if (source.TagOperationInfo != null) {
            this.TagOperationInfo = new AiSampleTagOperation(source.TagOperationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamObj(map, prefix + "TagOperationInfo.", this.TagOperationInfo);

    }
}

