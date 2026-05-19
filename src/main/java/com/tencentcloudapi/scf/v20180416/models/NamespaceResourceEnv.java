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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceResourceEnv extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TKE")
    @Expose
    private NamespaceResourceEnvTKE TKE;

    /**
    * 
    */
    @SerializedName("OFFLINE")
    @Expose
    private Boolean OFFLINE;

    /**
     * Get  
     * @return TKE 
     */
    public NamespaceResourceEnvTKE getTKE() {
        return this.TKE;
    }

    /**
     * Set 
     * @param TKE 
     */
    public void setTKE(NamespaceResourceEnvTKE TKE) {
        this.TKE = TKE;
    }

    /**
     * Get  
     * @return OFFLINE 
     */
    public Boolean getOFFLINE() {
        return this.OFFLINE;
    }

    /**
     * Set 
     * @param OFFLINE 
     */
    public void setOFFLINE(Boolean OFFLINE) {
        this.OFFLINE = OFFLINE;
    }

    public NamespaceResourceEnv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceResourceEnv(NamespaceResourceEnv source) {
        if (source.TKE != null) {
            this.TKE = new NamespaceResourceEnvTKE(source.TKE);
        }
        if (source.OFFLINE != null) {
            this.OFFLINE = new Boolean(source.OFFLINE);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TKE.", this.TKE);
        this.setParamSimple(map, prefix + "OFFLINE", this.OFFLINE);

    }
}

