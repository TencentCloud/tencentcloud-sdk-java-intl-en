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

public class AttrLabel extends AbstractModel {

    /**
    * Label source.
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Label ID.
    */
    @SerializedName("AttrBizId")
    @Expose
    private String AttrBizId;

    /**
    * Label identification.
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * Label name.
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * Label value.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
     * Get Label source. 
     * @return Source Label source.
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Label source.
     * @param Source Label source.
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Label ID. 
     * @return AttrBizId Label ID.
     */
    public String getAttrBizId() {
        return this.AttrBizId;
    }

    /**
     * Set Label ID.
     * @param AttrBizId Label ID.
     */
    public void setAttrBizId(String AttrBizId) {
        this.AttrBizId = AttrBizId;
    }

    /**
     * Get Label identification. 
     * @return AttrKey Label identification.
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set Label identification.
     * @param AttrKey Label identification.
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get Label name. 
     * @return AttrName Label name.
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set Label name.
     * @param AttrName Label name.
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get Label value. 
     * @return Labels Label value.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Label value.
     * @param Labels Label value.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    public AttrLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttrLabel(AttrLabel source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.AttrBizId != null) {
            this.AttrBizId = new String(source.AttrBizId);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AttrBizId", this.AttrBizId);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

