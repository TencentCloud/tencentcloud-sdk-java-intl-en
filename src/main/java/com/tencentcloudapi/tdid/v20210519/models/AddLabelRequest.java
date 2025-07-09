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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddLabelRequest extends AbstractModel {

    /**
    * The label ID.
    */
    @SerializedName("LabelId")
    @Expose
    private Long LabelId;

    /**
    * 
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
     * Get The label ID. 
     * @return LabelId The label ID.
     */
    public Long getLabelId() {
        return this.LabelId;
    }

    /**
     * Set The label ID.
     * @param LabelId The label ID.
     */
    public void setLabelId(Long LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get  
     * @return Did 
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set 
     * @param Did 
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    public AddLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLabelRequest(AddLabelRequest source) {
        if (source.LabelId != null) {
            this.LabelId = new Long(source.LabelId);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "Did", this.Did);

    }
}

