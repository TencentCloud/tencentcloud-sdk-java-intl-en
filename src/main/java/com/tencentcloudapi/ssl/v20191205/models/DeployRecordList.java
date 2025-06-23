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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecordList extends AbstractModel {

    /**
    * Deployment resource type.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Deployment resource detail list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("List")
    @Expose
    private DeployRecordItem [] List;

    /**
    * Total count of deployment resources.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Deployment resource type. 
     * @return ResourceType Deployment resource type.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Deployment resource type.
     * @param ResourceType Deployment resource type.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Deployment resource detail list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return List Deployment resource detail list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DeployRecordItem [] getList() {
        return this.List;
    }

    /**
     * Set Deployment resource detail list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param List Deployment resource detail list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setList(DeployRecordItem [] List) {
        this.List = List;
    }

    /**
     * Get Total count of deployment resources. 
     * @return TotalCount Total count of deployment resources.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count of deployment resources.
     * @param TotalCount Total count of deployment resources.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DeployRecordList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecordList(DeployRecordList source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.List != null) {
            this.List = new DeployRecordItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new DeployRecordItem(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

