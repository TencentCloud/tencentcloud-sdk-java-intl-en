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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceConfGroupInfosRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Component name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Configuration group name.
    */
    @SerializedName("ConfGroupName")
    @Expose
    private String ConfGroupName;

    /**
    * Page number, starting from 1.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Page size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Component name. 
     * @return ServiceName Component name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Component name.
     * @param ServiceName Component name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Configuration group name. 
     * @return ConfGroupName Configuration group name.
     */
    public String getConfGroupName() {
        return this.ConfGroupName;
    }

    /**
     * Set Configuration group name.
     * @param ConfGroupName Configuration group name.
     */
    public void setConfGroupName(String ConfGroupName) {
        this.ConfGroupName = ConfGroupName;
    }

    /**
     * Get Page number, starting from 1. 
     * @return PageNo Page number, starting from 1.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number, starting from 1.
     * @param PageNo Page number, starting from 1.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Page size. 
     * @return PageSize Page size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size.
     * @param PageSize Page size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeServiceConfGroupInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceConfGroupInfosRequest(DescribeServiceConfGroupInfosRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ConfGroupName != null) {
            this.ConfGroupName = new String(source.ConfGroupName);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ConfGroupName", this.ConfGroupName);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

