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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcesTagsRequest extends AbstractModel {

    /**
    * Tag type. Valid values: Cluster and Node
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * Tag information
    */
    @SerializedName("ModifyResourceTagsInfoList")
    @Expose
    private ModifyResourceTags [] ModifyResourceTagsInfoList;

    /**
     * Get Tag type. Valid values: Cluster and Node 
     * @return ModifyType Tag type. Valid values: Cluster and Node
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Tag type. Valid values: Cluster and Node
     * @param ModifyType Tag type. Valid values: Cluster and Node
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get Tag information 
     * @return ModifyResourceTagsInfoList Tag information
     */
    public ModifyResourceTags [] getModifyResourceTagsInfoList() {
        return this.ModifyResourceTagsInfoList;
    }

    /**
     * Set Tag information
     * @param ModifyResourceTagsInfoList Tag information
     */
    public void setModifyResourceTagsInfoList(ModifyResourceTags [] ModifyResourceTagsInfoList) {
        this.ModifyResourceTagsInfoList = ModifyResourceTagsInfoList;
    }

    public ModifyResourcesTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcesTagsRequest(ModifyResourcesTagsRequest source) {
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.ModifyResourceTagsInfoList != null) {
            this.ModifyResourceTagsInfoList = new ModifyResourceTags[source.ModifyResourceTagsInfoList.length];
            for (int i = 0; i < source.ModifyResourceTagsInfoList.length; i++) {
                this.ModifyResourceTagsInfoList[i] = new ModifyResourceTags(source.ModifyResourceTagsInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamArrayObj(map, prefix + "ModifyResourceTagsInfoList.", this.ModifyResourceTagsInfoList);

    }
}

