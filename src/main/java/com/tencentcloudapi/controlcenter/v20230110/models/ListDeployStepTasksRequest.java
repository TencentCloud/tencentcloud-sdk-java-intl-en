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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDeployStepTasksRequest extends AbstractModel {

    /**
    * Specifies the unique identifier for the feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Maximum number of returned records. value ranges from 0 to 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. valid values are equal to or greater than 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Specifies the unique identifier for the feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters. 
     * @return Identifier Specifies the unique identifier for the feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Specifies the unique identifier for the feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     * @param Identifier Specifies the unique identifier for the feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Maximum number of returned records. value ranges from 0 to 200. 
     * @return Limit Maximum number of returned records. value ranges from 0 to 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of returned records. value ranges from 0 to 200.
     * @param Limit Maximum number of returned records. value ranges from 0 to 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. valid values are equal to or greater than 0. 
     * @return Offset Offset. valid values are equal to or greater than 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. valid values are equal to or greater than 0.
     * @param Offset Offset. valid values are equal to or greater than 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListDeployStepTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDeployStepTasksRequest(ListDeployStepTasksRequest source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

