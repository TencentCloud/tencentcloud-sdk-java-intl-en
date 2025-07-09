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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeActionFieldConfigListRequest extends AbstractModel {

    /**
    * Action ID list
    */
    @SerializedName("ActionIds")
    @Expose
    private Long [] ActionIds;

    /**
    * Object type ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
     * Get Action ID list 
     * @return ActionIds Action ID list
     */
    public Long [] getActionIds() {
        return this.ActionIds;
    }

    /**
     * Set Action ID list
     * @param ActionIds Action ID list
     */
    public void setActionIds(Long [] ActionIds) {
        this.ActionIds = ActionIds;
    }

    /**
     * Get Object type ID 
     * @return ObjectTypeId Object type ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set Object type ID
     * @param ObjectTypeId Object type ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    public DescribeActionFieldConfigListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActionFieldConfigListRequest(DescribeActionFieldConfigListRequest source) {
        if (source.ActionIds != null) {
            this.ActionIds = new Long[source.ActionIds.length];
            for (int i = 0; i < source.ActionIds.length; i++) {
                this.ActionIds[i] = new Long(source.ActionIds[i]);
            }
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActionIds.", this.ActionIds);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);

    }
}

