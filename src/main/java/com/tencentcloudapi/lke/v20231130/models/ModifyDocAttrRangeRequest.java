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

public class ModifyDocAttrRangeRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Document ID.
    */
    @SerializedName("DocBizIds")
    @Expose
    private String [] DocBizIds;

    /**
    * Attribute label applicable scope: 1: all, 2: by conditions.
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * Attribute label reference.
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Document ID. 
     * @return DocBizIds Document ID.
     */
    public String [] getDocBizIds() {
        return this.DocBizIds;
    }

    /**
     * Set Document ID.
     * @param DocBizIds Document ID.
     */
    public void setDocBizIds(String [] DocBizIds) {
        this.DocBizIds = DocBizIds;
    }

    /**
     * Get Attribute label applicable scope: 1: all, 2: by conditions. 
     * @return AttrRange Attribute label applicable scope: 1: all, 2: by conditions.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Attribute label applicable scope: 1: all, 2: by conditions.
     * @param AttrRange Attribute label applicable scope: 1: all, 2: by conditions.
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get Attribute label reference. 
     * @return AttrLabels Attribute label reference.
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set Attribute label reference.
     * @param AttrLabels Attribute label reference.
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    public ModifyDocAttrRangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocAttrRangeRequest(ModifyDocAttrRangeRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.DocBizIds != null) {
            this.DocBizIds = new String[source.DocBizIds.length];
            for (int i = 0; i < source.DocBizIds.length; i++) {
                this.DocBizIds[i] = new String(source.DocBizIds[i]);
            }
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabelRefer[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabelRefer(source.AttrLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "DocBizIds.", this.DocBizIds);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);

    }
}

