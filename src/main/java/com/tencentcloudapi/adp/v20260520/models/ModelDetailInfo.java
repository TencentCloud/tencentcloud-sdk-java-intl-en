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

public class ModelDetailInfo extends AbstractModel {

    /**
    * Model alias.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Limit on number of historical conversations
    */
    @SerializedName("HistoryLimit")
    @Expose
    private Long HistoryLimit;

    /**
    * Unique model ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Model parameters
    */
    @SerializedName("ModelParams")
    @Expose
    private ModelParams ModelParams;

    /**
     * Get Model alias. 
     * @return Alias Model alias.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Model alias.
     * @param Alias Model alias.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Limit on number of historical conversations 
     * @return HistoryLimit Limit on number of historical conversations
     */
    public Long getHistoryLimit() {
        return this.HistoryLimit;
    }

    /**
     * Set Limit on number of historical conversations
     * @param HistoryLimit Limit on number of historical conversations
     */
    public void setHistoryLimit(Long HistoryLimit) {
        this.HistoryLimit = HistoryLimit;
    }

    /**
     * Get Unique model ID 
     * @return ModelId Unique model ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set Unique model ID
     * @param ModelId Unique model ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Model parameters 
     * @return ModelParams Model parameters
     */
    public ModelParams getModelParams() {
        return this.ModelParams;
    }

    /**
     * Set Model parameters
     * @param ModelParams Model parameters
     */
    public void setModelParams(ModelParams ModelParams) {
        this.ModelParams = ModelParams;
    }

    public ModelDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelDetailInfo(ModelDetailInfo source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HistoryLimit != null) {
            this.HistoryLimit = new Long(source.HistoryLimit);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelParams != null) {
            this.ModelParams = new ModelParams(source.ModelParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HistoryLimit", this.HistoryLimit);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamObj(map, prefix + "ModelParams.", this.ModelParams);

    }
}

