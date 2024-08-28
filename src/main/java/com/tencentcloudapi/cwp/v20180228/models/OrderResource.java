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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderResource extends AbstractModel {

    /**
    * Resource primary key ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Start time
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Expiration time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Authorization type
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
     * Get Resource primary key ID 
     * @return Id Resource primary key ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Resource primary key ID
     * @param Id Resource primary key ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    /**
     * Get Start time 
     * @return BeginTime Start time
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time
     * @param BeginTime Start time
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Expiration time 
     * @return EndTime Expiration time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Expiration time
     * @param EndTime Expiration time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    public OrderResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderResource(OrderResource source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

