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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkflowRunRequest extends AbstractModel {

    /**
    * <p>Application ID. For how to obtain it, see <a href="https://www.tencentcloud.com/document/product/1759/109469?from_cn_redirect=1#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Execution environment. 1: Development domain, 2: Production domain</p>
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * <p>User input.</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>API parameter configuration</p>
    */
    @SerializedName("CustomVariableList")
    @Expose
    private CustomVariable [] CustomVariableList;

    /**
    * <p>uid</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>Application ID. For how to obtain it, see <a href="https://www.tencentcloud.com/document/product/1759/109469?from_cn_redirect=1#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p> 
     * @return AppId <p>Application ID. For how to obtain it, see <a href="https://www.tencentcloud.com/document/product/1759/109469?from_cn_redirect=1#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID. For how to obtain it, see <a href="https://www.tencentcloud.com/document/product/1759/109469?from_cn_redirect=1#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     * @param AppId <p>Application ID. For how to obtain it, see <a href="https://www.tencentcloud.com/document/product/1759/109469?from_cn_redirect=1#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">AppId</a></p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Execution environment. 1: Development domain, 2: Production domain</p> 
     * @return Domain <p>Execution environment. 1: Development domain, 2: Production domain</p>
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Execution environment. 1: Development domain, 2: Production domain</p>
     * @param Domain <p>Execution environment. 1: Development domain, 2: Production domain</p>
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>User input.</p> 
     * @return Query <p>User input.</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>User input.</p>
     * @param Query <p>User input.</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>API parameter configuration</p> 
     * @return CustomVariableList <p>API parameter configuration</p>
     */
    public CustomVariable [] getCustomVariableList() {
        return this.CustomVariableList;
    }

    /**
     * Set <p>API parameter configuration</p>
     * @param CustomVariableList <p>API parameter configuration</p>
     */
    public void setCustomVariableList(CustomVariable [] CustomVariableList) {
        this.CustomVariableList = CustomVariableList;
    }

    /**
     * Get <p>uid</p> 
     * @return UserId <p>uid</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>uid</p>
     * @param UserId <p>uid</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public CreateWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowRunRequest(CreateWorkflowRunRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Domain != null) {
            this.Domain = new Long(source.Domain);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.CustomVariableList != null) {
            this.CustomVariableList = new CustomVariable[source.CustomVariableList.length];
            for (int i = 0; i < source.CustomVariableList.length; i++) {
                this.CustomVariableList[i] = new CustomVariable(source.CustomVariableList[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "CustomVariableList.", this.CustomVariableList);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

