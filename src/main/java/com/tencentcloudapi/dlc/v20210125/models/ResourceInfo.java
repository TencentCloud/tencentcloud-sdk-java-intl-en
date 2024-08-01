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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInfo extends AbstractModel {

    /**
    * Affiliated type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttributionType")
    @Expose
    private String AttributionType;

    /**
    * Resource type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Engine name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * If the resource type is spark-sql, the value is Name; if the resource type is spark-batch, the value is session app_name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Affinity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Favor")
    @Expose
    private FavorInfo [] Favor;

    /**
    * Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Affiliated type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttributionType Affiliated type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttributionType() {
        return this.AttributionType;
    }

    /**
     * Set Affiliated type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttributionType Affiliated type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttributionType(String AttributionType) {
        this.AttributionType = AttributionType;
    }

    /**
     * Get Resource type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Resource type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Engine name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Engine name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Engine name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Engine name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get If the resource type is spark-sql, the value is Name; if the resource type is spark-batch, the value is session app_name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Instance If the resource type is spark-sql, the value is Name; if the resource type is spark-batch, the value is session app_name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set If the resource type is spark-sql, the value is Name; if the resource type is spark-batch, the value is session app_name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Instance If the resource type is spark-sql, the value is Name; if the resource type is spark-batch, the value is session app_name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Affinity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Favor Affinity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FavorInfo [] getFavor() {
        return this.Favor;
    }

    /**
     * Set Affinity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Favor Affinity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFavor(FavorInfo [] Favor) {
        this.Favor = Favor;
    }

    /**
     * Get Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.AttributionType != null) {
            this.AttributionType = new String(source.AttributionType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Favor != null) {
            this.Favor = new FavorInfo[source.Favor.length];
            for (int i = 0; i < source.Favor.length; i++) {
                this.Favor[i] = new FavorInfo(source.Favor[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributionType", this.AttributionType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamArrayObj(map, prefix + "Favor.", this.Favor);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

