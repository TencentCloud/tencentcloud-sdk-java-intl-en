/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptionSelector extends AbstractModel {

    /**
    * Caption selector name, which can contain 1-32 letters, digits, and underscores.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Caption source type, only support `SCTE-128`.
    */
    @SerializedName("CaptionSourceType")
    @Expose
    private String CaptionSourceType;

    /**
     * Get Caption selector name, which can contain 1-32 letters, digits, and underscores. 
     * @return Name Caption selector name, which can contain 1-32 letters, digits, and underscores.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Caption selector name, which can contain 1-32 letters, digits, and underscores.
     * @param Name Caption selector name, which can contain 1-32 letters, digits, and underscores.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Caption source type, only support `SCTE-128`. 
     * @return CaptionSourceType Caption source type, only support `SCTE-128`.
     */
    public String getCaptionSourceType() {
        return this.CaptionSourceType;
    }

    /**
     * Set Caption source type, only support `SCTE-128`.
     * @param CaptionSourceType Caption source type, only support `SCTE-128`.
     */
    public void setCaptionSourceType(String CaptionSourceType) {
        this.CaptionSourceType = CaptionSourceType;
    }

    public CaptionSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CaptionSelector(CaptionSelector source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CaptionSourceType != null) {
            this.CaptionSourceType = new String(source.CaptionSourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CaptionSourceType", this.CaptionSourceType);

    }
}

