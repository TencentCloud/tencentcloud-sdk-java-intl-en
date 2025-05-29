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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeLabel extends AbstractModel {

    /**
    * Standard word ID.
    */
    @SerializedName("LabelBizId")
    @Expose
    private String LabelBizId;

    /**
    * Standard word name.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Synonym name.
    */
    @SerializedName("SimilarLabels")
    @Expose
    private String [] SimilarLabels;

    /**
     * Get Standard word ID. 
     * @return LabelBizId Standard word ID.
     */
    public String getLabelBizId() {
        return this.LabelBizId;
    }

    /**
     * Set Standard word ID.
     * @param LabelBizId Standard word ID.
     */
    public void setLabelBizId(String LabelBizId) {
        this.LabelBizId = LabelBizId;
    }

    /**
     * Get Standard word name. 
     * @return LabelName Standard word name.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Standard word name.
     * @param LabelName Standard word name.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get Synonym name. 
     * @return SimilarLabels Synonym name.
     */
    public String [] getSimilarLabels() {
        return this.SimilarLabels;
    }

    /**
     * Set Synonym name.
     * @param SimilarLabels Synonym name.
     */
    public void setSimilarLabels(String [] SimilarLabels) {
        this.SimilarLabels = SimilarLabels;
    }

    public AttributeLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeLabel(AttributeLabel source) {
        if (source.LabelBizId != null) {
            this.LabelBizId = new String(source.LabelBizId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.SimilarLabels != null) {
            this.SimilarLabels = new String[source.SimilarLabels.length];
            for (int i = 0; i < source.SimilarLabels.length; i++) {
                this.SimilarLabels[i] = new String(source.SimilarLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelBizId", this.LabelBizId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamArraySimple(map, prefix + "SimilarLabels.", this.SimilarLabels);

    }
}

