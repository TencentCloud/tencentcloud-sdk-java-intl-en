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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPackageRenewFlagRequest extends AbstractModel {

    /**
    * Unique resource ID of the data transfer plan
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
     * Get Unique resource ID of the data transfer plan 
     * @return ResourceId Unique resource ID of the data transfer plan
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Unique resource ID of the data transfer plan
     * @param ResourceId Unique resource ID of the data transfer plan
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal. 
     * @return RenewFlag Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
     * @param RenewFlag Auto-renewal flag. true represents auto-renewal, false represents no auto-renewal.
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ModifyPackageRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPackageRenewFlagRequest(ModifyPackageRenewFlagRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

