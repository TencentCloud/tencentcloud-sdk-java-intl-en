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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcFailHandle extends AbstractModel {

    /**
    * <p>Whether to store in DLC</p><p>Default value: false</p><p>Controls whether to enable storing delivery failure logs in DLC tables</p>
    */
    @SerializedName("StoreToDlc")
    @Expose
    private Boolean StoreToDlc;

    /**
    * <p>DLC table information</p>
    */
    @SerializedName("DlcFailTableInfo")
    @Expose
    private DlcFailTableInfo DlcFailTableInfo;

    /**
     * Get <p>Whether to store in DLC</p><p>Default value: false</p><p>Controls whether to enable storing delivery failure logs in DLC tables</p> 
     * @return StoreToDlc <p>Whether to store in DLC</p><p>Default value: false</p><p>Controls whether to enable storing delivery failure logs in DLC tables</p>
     */
    public Boolean getStoreToDlc() {
        return this.StoreToDlc;
    }

    /**
     * Set <p>Whether to store in DLC</p><p>Default value: false</p><p>Controls whether to enable storing delivery failure logs in DLC tables</p>
     * @param StoreToDlc <p>Whether to store in DLC</p><p>Default value: false</p><p>Controls whether to enable storing delivery failure logs in DLC tables</p>
     */
    public void setStoreToDlc(Boolean StoreToDlc) {
        this.StoreToDlc = StoreToDlc;
    }

    /**
     * Get <p>DLC table information</p> 
     * @return DlcFailTableInfo <p>DLC table information</p>
     */
    public DlcFailTableInfo getDlcFailTableInfo() {
        return this.DlcFailTableInfo;
    }

    /**
     * Set <p>DLC table information</p>
     * @param DlcFailTableInfo <p>DLC table information</p>
     */
    public void setDlcFailTableInfo(DlcFailTableInfo DlcFailTableInfo) {
        this.DlcFailTableInfo = DlcFailTableInfo;
    }

    public DlcFailHandle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcFailHandle(DlcFailHandle source) {
        if (source.StoreToDlc != null) {
            this.StoreToDlc = new Boolean(source.StoreToDlc);
        }
        if (source.DlcFailTableInfo != null) {
            this.DlcFailTableInfo = new DlcFailTableInfo(source.DlcFailTableInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreToDlc", this.StoreToDlc);
        this.setParamObj(map, prefix + "DlcFailTableInfo.", this.DlcFailTableInfo);

    }
}

