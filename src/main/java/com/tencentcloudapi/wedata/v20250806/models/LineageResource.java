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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageResource extends AbstractModel {

    /**
    * Original unique ID of the entity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceUniqueId")
    @Expose
    private String ResourceUniqueId;

    /**
    * Service name: database name.table name | metric name | model name | field name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Entity type.
TABLE|METRIC|MODEL|SERVICE|COLUMN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Unique identifier of the node lineage symbol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineageNodeId")
    @Expose
    private String LineageNodeId;

    /**
    * Description: table type | metric description | model description | field description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Source: WEDATA|THIRD.
Default wedata.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * resource additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceProperties")
    @Expose
    private LineageProperty [] ResourceProperties;

    /**
     * Get Original unique ID of the entity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceUniqueId Original unique ID of the entity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceUniqueId() {
        return this.ResourceUniqueId;
    }

    /**
     * Set Original unique ID of the entity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceUniqueId Original unique ID of the entity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceUniqueId(String ResourceUniqueId) {
        this.ResourceUniqueId = ResourceUniqueId;
    }

    /**
     * Get Service name: database name.table name | metric name | model name | field name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceName Service name: database name.table name | metric name | model name | field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Service name: database name.table name | metric name | model name | field name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceName Service name: database name.table name | metric name | model name | field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Entity type.
TABLE|METRIC|MODEL|SERVICE|COLUMN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Entity type.
TABLE|METRIC|MODEL|SERVICE|COLUMN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Entity type.
TABLE|METRIC|MODEL|SERVICE|COLUMN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Entity type.
TABLE|METRIC|MODEL|SERVICE|COLUMN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Unique identifier of the node lineage symbol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineageNodeId Unique identifier of the node lineage symbol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineageNodeId() {
        return this.LineageNodeId;
    }

    /**
     * Set Unique identifier of the node lineage symbol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineageNodeId Unique identifier of the node lineage symbol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineageNodeId(String LineageNodeId) {
        this.LineageNodeId = LineageNodeId;
    }

    /**
     * Get Description: table type | metric description | model description | field description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description: table type | metric description | model description | field description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description: table type | metric description | model description | field description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description: table type | metric description | model description | field description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Source: WEDATA|THIRD.
Default wedata.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Platform Source: WEDATA|THIRD.
Default wedata.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Source: WEDATA|THIRD.
Default wedata.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Platform Source: WEDATA|THIRD.
Default wedata.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Creation time.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get resource additional parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceProperties resource additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LineageProperty [] getResourceProperties() {
        return this.ResourceProperties;
    }

    /**
     * Set resource additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceProperties resource additional parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceProperties(LineageProperty [] ResourceProperties) {
        this.ResourceProperties = ResourceProperties;
    }

    public LineageResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageResource(LineageResource source) {
        if (source.ResourceUniqueId != null) {
            this.ResourceUniqueId = new String(source.ResourceUniqueId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.LineageNodeId != null) {
            this.LineageNodeId = new String(source.LineageNodeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ResourceProperties != null) {
            this.ResourceProperties = new LineageProperty[source.ResourceProperties.length];
            for (int i = 0; i < source.ResourceProperties.length; i++) {
                this.ResourceProperties[i] = new LineageProperty(source.ResourceProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceUniqueId", this.ResourceUniqueId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "LineageNodeId", this.LineageNodeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ResourceProperties.", this.ResourceProperties);

    }
}

