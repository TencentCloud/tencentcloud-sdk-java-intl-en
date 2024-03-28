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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffStatusExtra extends AbstractModel {

    /**
    * IM - Text | TEL - Cell phone | ALL - Full media.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * IN - Inbound | OUT - Outbound.
    */
    @SerializedName("Direct")
    @Expose
    private String Direct;

    /**
     * Get IM - Text | TEL - Cell phone | ALL - Full media. 
     * @return Type IM - Text | TEL - Cell phone | ALL - Full media.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IM - Text | TEL - Cell phone | ALL - Full media.
     * @param Type IM - Text | TEL - Cell phone | ALL - Full media.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get IN - Inbound | OUT - Outbound. 
     * @return Direct IN - Inbound | OUT - Outbound.
     */
    public String getDirect() {
        return this.Direct;
    }

    /**
     * Set IN - Inbound | OUT - Outbound.
     * @param Direct IN - Inbound | OUT - Outbound.
     */
    public void setDirect(String Direct) {
        this.Direct = Direct;
    }

    public StaffStatusExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffStatusExtra(StaffStatusExtra source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Direct != null) {
            this.Direct = new String(source.Direct);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Direct", this.Direct);

    }
}

