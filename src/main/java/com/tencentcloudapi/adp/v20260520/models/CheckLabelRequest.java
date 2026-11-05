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

public class CheckLabelRequest extends AbstractModel {

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>List of standard words to be checked (quantity: 1–100)</p>
    */
    @SerializedName("TermList")
    @Expose
    private String [] TermList;

    /**
    * <p>Tag ID (validates the uniqueness of standard terms under the specified tag)</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
     * Get <p>ID of the knowledge base it belongs to</p> 
     * @return KbId <p>ID of the knowledge base it belongs to</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>ID of the knowledge base it belongs to</p>
     * @param KbId <p>ID of the knowledge base it belongs to</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>List of standard words to be checked (quantity: 1–100)</p> 
     * @return TermList <p>List of standard words to be checked (quantity: 1–100)</p>
     */
    public String [] getTermList() {
        return this.TermList;
    }

    /**
     * Set <p>List of standard words to be checked (quantity: 1–100)</p>
     * @param TermList <p>List of standard words to be checked (quantity: 1–100)</p>
     */
    public void setTermList(String [] TermList) {
        this.TermList = TermList;
    }

    /**
     * Get <p>Tag ID (validates the uniqueness of standard terms under the specified tag)</p> 
     * @return LabelId <p>Tag ID (validates the uniqueness of standard terms under the specified tag)</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>Tag ID (validates the uniqueness of standard terms under the specified tag)</p>
     * @param LabelId <p>Tag ID (validates the uniqueness of standard terms under the specified tag)</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    public CheckLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckLabelRequest(CheckLabelRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.TermList != null) {
            this.TermList = new String[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new String(source.TermList[i]);
            }
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArraySimple(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);

    }
}

