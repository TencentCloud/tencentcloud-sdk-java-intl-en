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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateBindResourceTaskDetailRequest extends AbstractModel{

    /**
    * The task ID, which is required to query the result of associated cloud resources.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The number of cloud resources displayed on each page. The default value is 10, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * The current offset.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * The types of the resources to be queried. If no value is passed in, all types of resources will be queried.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * The regions of the resources to be queried. Only CLB, TKE, WAF, APIGATEWAY, and TCB resources support the query by region.
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get The task ID, which is required to query the result of associated cloud resources. 
     * @return TaskId The task ID, which is required to query the result of associated cloud resources.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID, which is required to query the result of associated cloud resources.
     * @param TaskId The task ID, which is required to query the result of associated cloud resources.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The number of cloud resources displayed on each page. The default value is 10, and the maximum value is 100. 
     * @return Limit The number of cloud resources displayed on each page. The default value is 10, and the maximum value is 100.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of cloud resources displayed on each page. The default value is 10, and the maximum value is 100.
     * @param Limit The number of cloud resources displayed on each page. The default value is 10, and the maximum value is 100.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The current offset. 
     * @return Offset The current offset.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set The current offset.
     * @param Offset The current offset.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The types of the resources to be queried. If no value is passed in, all types of resources will be queried. 
     * @return ResourceTypes The types of the resources to be queried. If no value is passed in, all types of resources will be queried.
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set The types of the resources to be queried. If no value is passed in, all types of resources will be queried.
     * @param ResourceTypes The types of the resources to be queried. If no value is passed in, all types of resources will be queried.
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get The regions of the resources to be queried. Only CLB, TKE, WAF, APIGATEWAY, and TCB resources support the query by region. 
     * @return Regions The regions of the resources to be queried. Only CLB, TKE, WAF, APIGATEWAY, and TCB resources support the query by region.
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set The regions of the resources to be queried. Only CLB, TKE, WAF, APIGATEWAY, and TCB resources support the query by region.
     * @param Regions The regions of the resources to be queried. Only CLB, TKE, WAF, APIGATEWAY, and TCB resources support the query by region.
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public DescribeCertificateBindResourceTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateBindResourceTaskDetailRequest(DescribeCertificateBindResourceTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

