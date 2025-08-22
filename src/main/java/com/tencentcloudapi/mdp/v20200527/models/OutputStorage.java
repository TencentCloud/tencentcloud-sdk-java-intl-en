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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputStorage extends AbstractModel {

    /**
    * VOD remux task output storage type. Only support COS type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * cos output storage information.
    */
    @SerializedName("CosOutputStorage")
    @Expose
    private CosOutputStorage CosOutputStorage;

    /**
     * Get VOD remux task output storage type. Only support COS type. 
     * @return Type VOD remux task output storage type. Only support COS type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set VOD remux task output storage type. Only support COS type.
     * @param Type VOD remux task output storage type. Only support COS type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get cos output storage information. 
     * @return CosOutputStorage cos output storage information.
     */
    public CosOutputStorage getCosOutputStorage() {
        return this.CosOutputStorage;
    }

    /**
     * Set cos output storage information.
     * @param CosOutputStorage cos output storage information.
     */
    public void setCosOutputStorage(CosOutputStorage CosOutputStorage) {
        this.CosOutputStorage = CosOutputStorage;
    }

    public OutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputStorage(OutputStorage source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosOutputStorage != null) {
            this.CosOutputStorage = new CosOutputStorage(source.CosOutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosOutputStorage.", this.CosOutputStorage);

    }
}

