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

public class ModifyDocRequest extends AbstractModel {

    /**
    * <p>Document ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>Modify field contents (required, used together with update_mask)</p>
    */
    @SerializedName("Fields")
    @Expose
    private DocModifyFields Fields;

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Field mask: specifies the fields to be modified (supported Paths: Name, CategoryId, EffectiveDomain, LabelRefList, ExternalLink, ExpirationPolicy, UpdatePeriod, Switch, ParseConfig, UserAccessConfig)</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>Document ID</p> 
     * @return DocId <p>Document ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>Document ID</p>
     * @param DocId <p>Document ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>Modify field contents (required, used together with update_mask)</p> 
     * @return Fields <p>Modify field contents (required, used together with update_mask)</p>
     */
    public DocModifyFields getFields() {
        return this.Fields;
    }

    /**
     * Set <p>Modify field contents (required, used together with update_mask)</p>
     * @param Fields <p>Modify field contents (required, used together with update_mask)</p>
     */
    public void setFields(DocModifyFields Fields) {
        this.Fields = Fields;
    }

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
     * Get <p>Field mask: specifies the fields to be modified (supported Paths: Name, CategoryId, EffectiveDomain, LabelRefList, ExternalLink, ExpirationPolicy, UpdatePeriod, Switch, ParseConfig, UserAccessConfig)</p> 
     * @return UpdateMask <p>Field mask: specifies the fields to be modified (supported Paths: Name, CategoryId, EffectiveDomain, LabelRefList, ExternalLink, ExpirationPolicy, UpdatePeriod, Switch, ParseConfig, UserAccessConfig)</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Field mask: specifies the fields to be modified (supported Paths: Name, CategoryId, EffectiveDomain, LabelRefList, ExternalLink, ExpirationPolicy, UpdatePeriod, Switch, ParseConfig, UserAccessConfig)</p>
     * @param UpdateMask <p>Field mask: specifies the fields to be modified (supported Paths: Name, CategoryId, EffectiveDomain, LabelRefList, ExternalLink, ExpirationPolicy, UpdatePeriod, Switch, ParseConfig, UserAccessConfig)</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocRequest(ModifyDocRequest source) {
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.Fields != null) {
            this.Fields = new DocModifyFields(source.Fields);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

