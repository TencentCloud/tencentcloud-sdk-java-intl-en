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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForceQNRequest extends AbstractModel {

    /**
    * Sub-account UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * 0: Normal  2: Forced service suspension
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Sub-account UIN 
     * @return ClientUin Sub-account UIN
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Sub-account UIN
     * @param ClientUin Sub-account UIN
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 0: Normal  2: Forced service suspension 
     * @return Type 0: Normal  2: Forced service suspension
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: Normal  2: Forced service suspension
     * @param Type 0: Normal  2: Forced service suspension
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ForceQNRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForceQNRequest(ForceQNRequest source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

