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

public class KBPermission extends AbstractModel {

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
    * <p>Whether or not it can be shared</p>
    */
    @SerializedName("CanShare")
    @Expose
    private Boolean CanShare;

    /**
    * <p>Whether it is viewable</p>
    */
    @SerializedName("CanView")
    @Expose
    private Boolean CanView;

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

    /**
     * Get <p>Whether or not it can be shared</p> 
     * @return CanShare <p>Whether or not it can be shared</p>
     */
    public Boolean getCanShare() {
        return this.CanShare;
    }

    /**
     * Set <p>Whether or not it can be shared</p>
     * @param CanShare <p>Whether or not it can be shared</p>
     */
    public void setCanShare(Boolean CanShare) {
        this.CanShare = CanShare;
    }

    /**
     * Get <p>Whether it is viewable</p> 
     * @return CanView <p>Whether it is viewable</p>
     */
    public Boolean getCanView() {
        return this.CanView;
    }

    /**
     * Set <p>Whether it is viewable</p>
     * @param CanView <p>Whether it is viewable</p>
     */
    public void setCanView(Boolean CanView) {
        this.CanView = CanView;
    }

    public KBPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBPermission(KBPermission source) {
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CanShare != null) {
            this.CanShare = new Boolean(source.CanShare);
        }
        if (source.CanView != null) {
            this.CanView = new Boolean(source.CanView);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CanShare", this.CanShare);
        this.setParamSimple(map, prefix + "CanView", this.CanView);

    }
}

