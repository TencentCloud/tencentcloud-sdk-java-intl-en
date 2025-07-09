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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttrLabelRefer extends AbstractModel {

    /**
    * Label source, 1: label.
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Label ID.
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * Label value ID.
    */
    @SerializedName("LabelBizIds")
    @Expose
    private String [] LabelBizIds;

    /**
     * Get Label source, 1: label. 
     * @return Source Label source, 1: label.
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Label source, 1: label.
     * @param Source Label source, 1: label.
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Label ID. 
     * @return AttributeBizId Label ID.
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set Label ID.
     * @param AttributeBizId Label ID.
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get Label value ID. 
     * @return LabelBizIds Label value ID.
     */
    public String [] getLabelBizIds() {
        return this.LabelBizIds;
    }

    /**
     * Set Label value ID.
     * @param LabelBizIds Label value ID.
     */
    public void setLabelBizIds(String [] LabelBizIds) {
        this.LabelBizIds = LabelBizIds;
    }

    public AttrLabelRefer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttrLabelRefer(AttrLabelRefer source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.LabelBizIds != null) {
            this.LabelBizIds = new String[source.LabelBizIds.length];
            for (int i = 0; i < source.LabelBizIds.length; i++) {
                this.LabelBizIds[i] = new String(source.LabelBizIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamArraySimple(map, prefix + "LabelBizIds.", this.LabelBizIds);

    }
}

