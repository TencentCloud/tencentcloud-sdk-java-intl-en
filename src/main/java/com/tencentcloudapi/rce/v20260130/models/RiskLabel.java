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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskLabel extends AbstractModel {

    /**
    * <p>The ID of the label</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>The reason of the label</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>The ID of the label</p> 
     * @return Id <p>The ID of the label</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>The ID of the label</p>
     * @param Id <p>The ID of the label</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>The reason of the label</p> 
     * @return Reason <p>The reason of the label</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>The reason of the label</p>
     * @param Reason <p>The reason of the label</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RiskLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskLabel(RiskLabel source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

