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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteRequest extends AbstractModel {

    /**
    * <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Route Id</p>
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * <p>Whether to display the primary route. If true, the primary route information during instance creation will additionally be displayed on the basis of the original routing list (and will not be affected by parameter filtering such as InternalFlag or UsedFor).</p>
    */
    @SerializedName("MainRouteFlag")
    @Expose
    private Boolean MainRouteFlag;

    /**
     * Get <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Route Id</p> 
     * @return RouteId <p>Route Id</p>
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>Route Id</p>
     * @param RouteId <p>Route Id</p>
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>Whether to display the primary route. If true, the primary route information during instance creation will additionally be displayed on the basis of the original routing list (and will not be affected by parameter filtering such as InternalFlag or UsedFor).</p> 
     * @return MainRouteFlag <p>Whether to display the primary route. If true, the primary route information during instance creation will additionally be displayed on the basis of the original routing list (and will not be affected by parameter filtering such as InternalFlag or UsedFor).</p>
     */
    public Boolean getMainRouteFlag() {
        return this.MainRouteFlag;
    }

    /**
     * Set <p>Whether to display the primary route. If true, the primary route information during instance creation will additionally be displayed on the basis of the original routing list (and will not be affected by parameter filtering such as InternalFlag or UsedFor).</p>
     * @param MainRouteFlag <p>Whether to display the primary route. If true, the primary route information during instance creation will additionally be displayed on the basis of the original routing list (and will not be affected by parameter filtering such as InternalFlag or UsedFor).</p>
     */
    public void setMainRouteFlag(Boolean MainRouteFlag) {
        this.MainRouteFlag = MainRouteFlag;
    }

    public DescribeRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteRequest(DescribeRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.MainRouteFlag != null) {
            this.MainRouteFlag = new Boolean(source.MainRouteFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "MainRouteFlag", this.MainRouteFlag);

    }
}

