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

public class ModifyLabelRequest extends AbstractModel {

    /**
    * <p>Modify field contents (required, use together with update_mask)</p>
    */
    @SerializedName("Fields")
    @Expose
    private LabelModifyFields Fields;

    /**
    * <p>Associated knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>ID of the tag to be modified</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>Field mask: specifies the fields to be modified (supported Paths: Name, TermModifyList)</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>Modify field contents (required, use together with update_mask)</p> 
     * @return Fields <p>Modify field contents (required, use together with update_mask)</p>
     */
    public LabelModifyFields getFields() {
        return this.Fields;
    }

    /**
     * Set <p>Modify field contents (required, use together with update_mask)</p>
     * @param Fields <p>Modify field contents (required, use together with update_mask)</p>
     */
    public void setFields(LabelModifyFields Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>Associated knowledge base ID</p> 
     * @return KbId <p>Associated knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Associated knowledge base ID</p>
     * @param KbId <p>Associated knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>ID of the tag to be modified</p> 
     * @return LabelId <p>ID of the tag to be modified</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>ID of the tag to be modified</p>
     * @param LabelId <p>ID of the tag to be modified</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>Field mask: specifies the fields to be modified (supported Paths: Name, TermModifyList)</p> 
     * @return UpdateMask <p>Field mask: specifies the fields to be modified (supported Paths: Name, TermModifyList)</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Field mask: specifies the fields to be modified (supported Paths: Name, TermModifyList)</p>
     * @param UpdateMask <p>Field mask: specifies the fields to be modified (supported Paths: Name, TermModifyList)</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLabelRequest(ModifyLabelRequest source) {
        if (source.Fields != null) {
            this.Fields = new LabelModifyFields(source.Fields);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

