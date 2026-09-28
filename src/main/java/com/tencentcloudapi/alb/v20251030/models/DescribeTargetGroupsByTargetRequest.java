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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupsByTargetRequest extends AbstractModel {

    /**
    * Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetId")
    @Expose
    private String [] TargetId;

    /**
     * Get Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters. 
     * @return TargetId Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     */
    public String [] getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     * @param TargetId Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     */
    public void setTargetId(String [] TargetId) {
        this.TargetId = TargetId;
    }

    public DescribeTargetGroupsByTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupsByTargetRequest(DescribeTargetGroupsByTargetRequest source) {
        if (source.TargetId != null) {
            this.TargetId = new String[source.TargetId.length];
            for (int i = 0; i < source.TargetId.length; i++) {
                this.TargetId[i] = new String(source.TargetId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetId.", this.TargetId);

    }
}

