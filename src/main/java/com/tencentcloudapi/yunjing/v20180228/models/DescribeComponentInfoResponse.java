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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComponentInfoResponse extends AbstractModel {

    /**
    * Component ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Component name.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * Component's official website.
    */
    @SerializedName("Homepage")
    @Expose
    private String Homepage;

    /**
    * Component description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Component ID. 
     * @return Id Component ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Component ID.
     * @param Id Component ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Component name. 
     * @return ComponentName Component name.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name.
     * @param ComponentName Component name.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li> 
     * @return ComponentType Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
     * @param ComponentType Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get Component's official website. 
     * @return Homepage Component's official website.
     */
    public String getHomepage() {
        return this.Homepage;
    }

    /**
     * Set Component's official website.
     * @param Homepage Component's official website.
     */
    public void setHomepage(String Homepage) {
        this.Homepage = Homepage;
    }

    /**
     * Get Component description. 
     * @return Description Component description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Component description.
     * @param Description Component description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public DescribeComponentInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComponentInfoResponse(DescribeComponentInfoResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
        }
        if (source.Homepage != null) {
            this.Homepage = new String(source.Homepage);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "Homepage", this.Homepage);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

