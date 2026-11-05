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

public class ModifyKBRequest extends AbstractModel {

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Writable attribute (use together with update_mask)</p>
    */
    @SerializedName("Spec")
    @Expose
    private KBSpec Spec;

    /**
    * <p>Field mask: specify the field to be modified (snake-shaped field name). Unlisted fields are ignored</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
    * <p>Scaling operation (for hosting special operations that cannot be categorized into regular field modification, such as triggering over-limit recovery. It is effective only when 'extend_fields' is also input in update_mask. For the value, refer to KBExtendedAction: 1=trigger over-limit recovery)</p>
    */
    @SerializedName("ExtendFields")
    @Expose
    private KBModifyExtendFields ExtendFields;

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Writable attribute (use together with update_mask)</p> 
     * @return Spec <p>Writable attribute (use together with update_mask)</p>
     */
    public KBSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>Writable attribute (use together with update_mask)</p>
     * @param Spec <p>Writable attribute (use together with update_mask)</p>
     */
    public void setSpec(KBSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>Field mask: specify the field to be modified (snake-shaped field name). Unlisted fields are ignored</p> 
     * @return UpdateMask <p>Field mask: specify the field to be modified (snake-shaped field name). Unlisted fields are ignored</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Field mask: specify the field to be modified (snake-shaped field name). Unlisted fields are ignored</p>
     * @param UpdateMask <p>Field mask: specify the field to be modified (snake-shaped field name). Unlisted fields are ignored</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    /**
     * Get <p>Scaling operation (for hosting special operations that cannot be categorized into regular field modification, such as triggering over-limit recovery. It is effective only when 'extend_fields' is also input in update_mask. For the value, refer to KBExtendedAction: 1=trigger over-limit recovery)</p> 
     * @return ExtendFields <p>Scaling operation (for hosting special operations that cannot be categorized into regular field modification, such as triggering over-limit recovery. It is effective only when 'extend_fields' is also input in update_mask. For the value, refer to KBExtendedAction: 1=trigger over-limit recovery)</p>
     */
    public KBModifyExtendFields getExtendFields() {
        return this.ExtendFields;
    }

    /**
     * Set <p>Scaling operation (for hosting special operations that cannot be categorized into regular field modification, such as triggering over-limit recovery. It is effective only when 'extend_fields' is also input in update_mask. For the value, refer to KBExtendedAction: 1=trigger over-limit recovery)</p>
     * @param ExtendFields <p>Scaling operation (for hosting special operations that cannot be categorized into regular field modification, such as triggering over-limit recovery. It is effective only when 'extend_fields' is also input in update_mask. For the value, refer to KBExtendedAction: 1=trigger over-limit recovery)</p>
     */
    public void setExtendFields(KBModifyExtendFields ExtendFields) {
        this.ExtendFields = ExtendFields;
    }

    public ModifyKBRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKBRequest(ModifyKBRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.Spec != null) {
            this.Spec = new KBSpec(source.Spec);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
        if (source.ExtendFields != null) {
            this.ExtendFields = new KBModifyExtendFields(source.ExtendFields);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);
        this.setParamObj(map, prefix + "ExtendFields.", this.ExtendFields);

    }
}

