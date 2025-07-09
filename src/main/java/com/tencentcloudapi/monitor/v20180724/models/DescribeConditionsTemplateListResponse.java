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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConditionsTemplateListResponse extends AbstractModel {

    /**
    * Total number of templates.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Template list.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateGroupList")
    @Expose
    private TemplateGroup [] TemplateGroupList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of templates. 
     * @return Total Total number of templates.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of templates.
     * @param Total Total number of templates.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Template list.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TemplateGroupList Template list.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TemplateGroup [] getTemplateGroupList() {
        return this.TemplateGroupList;
    }

    /**
     * Set Template list.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TemplateGroupList Template list.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTemplateGroupList(TemplateGroup [] TemplateGroupList) {
        this.TemplateGroupList = TemplateGroupList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConditionsTemplateListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConditionsTemplateListResponse(DescribeConditionsTemplateListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TemplateGroupList != null) {
            this.TemplateGroupList = new TemplateGroup[source.TemplateGroupList.length];
            for (int i = 0; i < source.TemplateGroupList.length; i++) {
                this.TemplateGroupList[i] = new TemplateGroup(source.TemplateGroupList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "TemplateGroupList.", this.TemplateGroupList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

