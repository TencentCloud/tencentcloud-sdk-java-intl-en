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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateBindResourceTaskDetailRequest extends AbstractModel {

    /**
    * <p>Task ID. Query the result of binding cloud resources based on the task ID obtained from CreateCertificateBindResourceSyncTask.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Number of items per page, default 10, maximum value 100; total pages is the total number of instances in the resource region, that is, page 1 will pull the number of instances under each Tencent Cloud resource region up to the Limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * <p>Offset, defaults to 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * <p>Query result details of the resource type. Query all if not specified. Supported values: - clb- cdn- ddos- live- vod- waf- apigateway- teo- tke- cos- tse- tcb</p>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * <p>Query the data of region list. clb, tke, waf, API Gateway, tcb, cos, and tse support query region. Other resource types are unsupported.</p>
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get <p>Task ID. Query the result of binding cloud resources based on the task ID obtained from CreateCertificateBindResourceSyncTask.</p> 
     * @return TaskId <p>Task ID. Query the result of binding cloud resources based on the task ID obtained from CreateCertificateBindResourceSyncTask.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID. Query the result of binding cloud resources based on the task ID obtained from CreateCertificateBindResourceSyncTask.</p>
     * @param TaskId <p>Task ID. Query the result of binding cloud resources based on the task ID obtained from CreateCertificateBindResourceSyncTask.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Number of items per page, default 10, maximum value 100; total pages is the total number of instances in the resource region, that is, page 1 will pull the number of instances under each Tencent Cloud resource region up to the Limit</p> 
     * @return Limit <p>Number of items per page, default 10, maximum value 100; total pages is the total number of instances in the resource region, that is, page 1 will pull the number of instances under each Tencent Cloud resource region up to the Limit</p>
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page, default 10, maximum value 100; total pages is the total number of instances in the resource region, that is, page 1 will pull the number of instances under each Tencent Cloud resource region up to the Limit</p>
     * @param Limit <p>Number of items per page, default 10, maximum value 100; total pages is the total number of instances in the resource region, that is, page 1 will pull the number of instances under each Tencent Cloud resource region up to the Limit</p>
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset, defaults to 0</p> 
     * @return Offset <p>Offset, defaults to 0</p>
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset, defaults to 0</p>
     * @param Offset <p>Offset, defaults to 0</p>
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Query result details of the resource type. Query all if not specified. Supported values: - clb- cdn- ddos- live- vod- waf- apigateway- teo- tke- cos- tse- tcb</p> 
     * @return ResourceTypes <p>Query result details of the resource type. Query all if not specified. Supported values: - clb- cdn- ddos- live- vod- waf- apigateway- teo- tke- cos- tse- tcb</p>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>Query result details of the resource type. Query all if not specified. Supported values: - clb- cdn- ddos- live- vod- waf- apigateway- teo- tke- cos- tse- tcb</p>
     * @param ResourceTypes <p>Query result details of the resource type. Query all if not specified. Supported values: - clb- cdn- ddos- live- vod- waf- apigateway- teo- tke- cos- tse- tcb</p>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get <p>Query the data of region list. clb, tke, waf, API Gateway, tcb, cos, and tse support query region. Other resource types are unsupported.</p> 
     * @return Regions <p>Query the data of region list. clb, tke, waf, API Gateway, tcb, cos, and tse support query region. Other resource types are unsupported.</p>
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>Query the data of region list. clb, tke, waf, API Gateway, tcb, cos, and tse support query region. Other resource types are unsupported.</p>
     * @param Regions <p>Query the data of region list. clb, tke, waf, API Gateway, tcb, cos, and tse support query region. Other resource types are unsupported.</p>
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

