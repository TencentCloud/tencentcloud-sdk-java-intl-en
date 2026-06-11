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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRaspRulesRequest extends AbstractModel {

    /**
    * Array containing IDs of rules to be deleted (maximum value: 100).
    */
    @SerializedName("IDs")
    @Expose
    private Long [] IDs;

    /**
     * Get Array containing IDs of rules to be deleted (maximum value: 100). 
     * @return IDs Array containing IDs of rules to be deleted (maximum value: 100).
     */
    public Long [] getIDs() {
        return this.IDs;
    }

    /**
     * Set Array containing IDs of rules to be deleted (maximum value: 100).
     * @param IDs Array containing IDs of rules to be deleted (maximum value: 100).
     */
    public void setIDs(Long [] IDs) {
        this.IDs = IDs;
    }

    public DeleteRaspRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRaspRulesRequest(DeleteRaspRulesRequest source) {
        if (source.IDs != null) {
            this.IDs = new Long[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new Long(source.IDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);

    }
}

