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

public class ModifyQAAttrRangeRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Q&A ID.
    */
    @SerializedName("QaBizIds")
    @Expose
    private String [] QaBizIds;

    /**
    * Applicable scope of attribute label: 1: all, 2: by conditions.
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
     * Get Q&A ID. 
     * @return QaBizIds Q&A ID.
     */
    public String [] getQaBizIds() {
        return this.QaBizIds;
    }

    /**
     * Set Q&A ID.
     * @param QaBizIds Q&A ID.
     */
    public void setQaBizIds(String [] QaBizIds) {
        this.QaBizIds = QaBizIds;
    }

    /**
     * Get Applicable scope of attribute label: 1: all, 2: by conditions. 
     * @return AttrRange Applicable scope of attribute label: 1: all, 2: by conditions.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Applicable scope of attribute label: 1: all, 2: by conditions.
     * @param AttrRange Applicable scope of attribute label: 1: all, 2: by conditions.
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

    public ModifyQAAttrRangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQAAttrRangeRequest(ModifyQAAttrRangeRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.QaBizIds != null) {
            this.QaBizIds = new String[source.QaBizIds.length];
            for (int i = 0; i < source.QaBizIds.length; i++) {
                this.QaBizIds[i] = new String(source.QaBizIds[i]);
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
        this.setParamArraySimple(map, prefix + "QaBizIds.", this.QaBizIds);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);

    }
}

