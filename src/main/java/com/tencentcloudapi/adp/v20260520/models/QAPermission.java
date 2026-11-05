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

public class QAPermission extends AbstractModel {

    /**
    * <p>Whether verification is supported (adoption/non-adoption).</p>
    */
    @SerializedName("CanAccept")
    @Expose
    private Boolean CanAccept;

    /**
    * <p>Whether it is deletable.</p>
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * <p>Whether it is editable</p>
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
     * Get <p>Whether verification is supported (adoption/non-adoption).</p> 
     * @return CanAccept <p>Whether verification is supported (adoption/non-adoption).</p>
     */
    public Boolean getCanAccept() {
        return this.CanAccept;
    }

    /**
     * Set <p>Whether verification is supported (adoption/non-adoption).</p>
     * @param CanAccept <p>Whether verification is supported (adoption/non-adoption).</p>
     */
    public void setCanAccept(Boolean CanAccept) {
        this.CanAccept = CanAccept;
    }

    /**
     * Get <p>Whether it is deletable.</p> 
     * @return CanDelete <p>Whether it is deletable.</p>
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set <p>Whether it is deletable.</p>
     * @param CanDelete <p>Whether it is deletable.</p>
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get <p>Whether it is editable</p> 
     * @return CanEdit <p>Whether it is editable</p>
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set <p>Whether it is editable</p>
     * @param CanEdit <p>Whether it is editable</p>
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    public QAPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAPermission(QAPermission source) {
        if (source.CanAccept != null) {
            this.CanAccept = new Boolean(source.CanAccept);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanAccept", this.CanAccept);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);

    }
}

