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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowPackagesRequest extends AbstractModel {

    /**
    * Page number, starting from 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of Entry Per Page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Unique resource ID of the data transfer plan
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Device ID bound to the data transfer plan
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Traffic packet status. 0: Not in effect, 1: Within the validity period, 2: Expired.

    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Page number, starting from 1. 
     * @return PageNumber Page number, starting from 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, starting from 1.
     * @param PageNumber Page number, starting from 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of Entry Per Page 
     * @return PageSize Number of Entry Per Page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of Entry Per Page
     * @param PageSize Number of Entry Per Page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Unique resource ID of the data transfer plan 
     * @return ResourceId Unique resource ID of the data transfer plan
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Unique resource ID of the data transfer plan
     * @param ResourceId Unique resource ID of the data transfer plan
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Device ID bound to the data transfer plan 
     * @return DeviceId Device ID bound to the data transfer plan
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID bound to the data transfer plan
     * @param DeviceId Device ID bound to the data transfer plan
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Traffic packet status. 0: Not in effect, 1: Within the validity period, 2: Expired.
 
     * @return Status Traffic packet status. 0: Not in effect, 1: Within the validity period, 2: Expired.

     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Traffic packet status. 0: Not in effect, 1: Within the validity period, 2: Expired.

     * @param Status Traffic packet status. 0: Not in effect, 1: Within the validity period, 2: Expired.

     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetFlowPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowPackagesRequest(GetFlowPackagesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

