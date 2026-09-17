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

public class ContentReviewResult extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("PornImageResult")
    @Expose
    private PornImageResult PornImageResult;

    /**
    * 
    */
    @SerializedName("TerrorismImageResult")
    @Expose
    private TerrorismImageResult TerrorismImageResult;

    /**
    * 
    */
    @SerializedName("PoliticalImageResult")
    @Expose
    private PoliticalImageResult PoliticalImageResult;

    /**
    * 
    */
    @SerializedName("PornOcrResult")
    @Expose
    private ContentReviewOcrResult PornOcrResult;

    /**
    * 
    */
    @SerializedName("TerrorismOcrResult")
    @Expose
    private ContentReviewOcrResult TerrorismOcrResult;

    /**
    * 
    */
    @SerializedName("PoliticalOcrResult")
    @Expose
    private ContentReviewOcrResult PoliticalOcrResult;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return PornImageResult 
     */
    public PornImageResult getPornImageResult() {
        return this.PornImageResult;
    }

    /**
     * Set 
     * @param PornImageResult 
     */
    public void setPornImageResult(PornImageResult PornImageResult) {
        this.PornImageResult = PornImageResult;
    }

    /**
     * Get  
     * @return TerrorismImageResult 
     */
    public TerrorismImageResult getTerrorismImageResult() {
        return this.TerrorismImageResult;
    }

    /**
     * Set 
     * @param TerrorismImageResult 
     */
    public void setTerrorismImageResult(TerrorismImageResult TerrorismImageResult) {
        this.TerrorismImageResult = TerrorismImageResult;
    }

    /**
     * Get  
     * @return PoliticalImageResult 
     */
    public PoliticalImageResult getPoliticalImageResult() {
        return this.PoliticalImageResult;
    }

    /**
     * Set 
     * @param PoliticalImageResult 
     */
    public void setPoliticalImageResult(PoliticalImageResult PoliticalImageResult) {
        this.PoliticalImageResult = PoliticalImageResult;
    }

    /**
     * Get  
     * @return PornOcrResult 
     */
    public ContentReviewOcrResult getPornOcrResult() {
        return this.PornOcrResult;
    }

    /**
     * Set 
     * @param PornOcrResult 
     */
    public void setPornOcrResult(ContentReviewOcrResult PornOcrResult) {
        this.PornOcrResult = PornOcrResult;
    }

    /**
     * Get  
     * @return TerrorismOcrResult 
     */
    public ContentReviewOcrResult getTerrorismOcrResult() {
        return this.TerrorismOcrResult;
    }

    /**
     * Set 
     * @param TerrorismOcrResult 
     */
    public void setTerrorismOcrResult(ContentReviewOcrResult TerrorismOcrResult) {
        this.TerrorismOcrResult = TerrorismOcrResult;
    }

    /**
     * Get  
     * @return PoliticalOcrResult 
     */
    public ContentReviewOcrResult getPoliticalOcrResult() {
        return this.PoliticalOcrResult;
    }

    /**
     * Set 
     * @param PoliticalOcrResult 
     */
    public void setPoliticalOcrResult(ContentReviewOcrResult PoliticalOcrResult) {
        this.PoliticalOcrResult = PoliticalOcrResult;
    }

    public ContentReviewResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewResult(ContentReviewResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PornImageResult != null) {
            this.PornImageResult = new PornImageResult(source.PornImageResult);
        }
        if (source.TerrorismImageResult != null) {
            this.TerrorismImageResult = new TerrorismImageResult(source.TerrorismImageResult);
        }
        if (source.PoliticalImageResult != null) {
            this.PoliticalImageResult = new PoliticalImageResult(source.PoliticalImageResult);
        }
        if (source.PornOcrResult != null) {
            this.PornOcrResult = new ContentReviewOcrResult(source.PornOcrResult);
        }
        if (source.TerrorismOcrResult != null) {
            this.TerrorismOcrResult = new ContentReviewOcrResult(source.TerrorismOcrResult);
        }
        if (source.PoliticalOcrResult != null) {
            this.PoliticalOcrResult = new ContentReviewOcrResult(source.PoliticalOcrResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PornImageResult.", this.PornImageResult);
        this.setParamObj(map, prefix + "TerrorismImageResult.", this.TerrorismImageResult);
        this.setParamObj(map, prefix + "PoliticalImageResult.", this.PoliticalImageResult);
        this.setParamObj(map, prefix + "PornOcrResult.", this.PornOcrResult);
        this.setParamObj(map, prefix + "TerrorismOcrResult.", this.TerrorismOcrResult);
        this.setParamObj(map, prefix + "PoliticalOcrResult.", this.PoliticalOcrResult);

    }
}

