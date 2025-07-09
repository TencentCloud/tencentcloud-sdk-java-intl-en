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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseOrder extends AbstractModel {

    /**
    * Authorization ID
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * Authorization type
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Authorization Order Resource Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Order type
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Authorization ID 
     * @return LicenseId Authorization ID
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set Authorization ID
     * @param LicenseId Authorization ID
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get Authorization type 
     * @return LicenseType Authorization type
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type
     * @param LicenseType Authorization type
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Authorization Order Resource Status 
     * @return Status Authorization Order Resource Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Authorization Order Resource Status
     * @param Status Authorization Order Resource Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Order type 
     * @return SourceType Order type
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Order type
     * @param SourceType Order type
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public LicenseOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseOrder(LicenseOrder source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

