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

public class DescribeCertificateBindResourceTaskDetailRequest extends AbstractModel {

    /**
    * Task id, which can be used to query the result of binding cloud resources according to the task id obtained from createcertificatebindresourcesynctask.
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
    * Current offset, default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Result detail of queried resource type. if not provided, all will be queried. valid values include:.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * Data of querying region list. clb, tke, waf, api gateway, tcb, cos, and tse support region query, while other resource types do not support.
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get Task id, which can be used to query the result of binding cloud resources according to the task id obtained from createcertificatebindresourcesynctask. 
     * @return TaskId Task id, which can be used to query the result of binding cloud resources according to the task id obtained from createcertificatebindresourcesynctask.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task id, which can be used to query the result of binding cloud resources according to the task id obtained from createcertificatebindresourcesynctask.
     * @param TaskId Task id, which can be used to query the result of binding cloud resources according to the task id obtained from createcertificatebindresourcesynctask.
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
     * Get Current offset, default is 0. 
     * @return Offset Current offset, default is 0.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Current offset, default is 0.
     * @param Offset Current offset, default is 0.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Result detail of queried resource type. if not provided, all will be queried. valid values include:.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb. 
     * @return ResourceTypes Result detail of queried resource type. if not provided, all will be queried. valid values include:.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set Result detail of queried resource type. if not provided, all will be queried. valid values include:.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
     * @param ResourceTypes Result detail of queried resource type. if not provided, all will be queried. valid values include:.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get Data of querying region list. clb, tke, waf, api gateway, tcb, cos, and tse support region query, while other resource types do not support. 
     * @return Regions Data of querying region list. clb, tke, waf, api gateway, tcb, cos, and tse support region query, while other resource types do not support.
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set Data of querying region list. clb, tke, waf, api gateway, tcb, cos, and tse support region query, while other resource types do not support.
     * @param Regions Data of querying region list. clb, tke, waf, api gateway, tcb, cos, and tse support region query, while other resource types do not support.
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

