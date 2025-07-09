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

public class CommonNamespaceNew extends AbstractModel {

    /**
    * Namespace ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Namespace name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Monitoring type
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Dimension information
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionNew [] Dimensions;

    /**
     * Get Namespace ID 
     * @return Id Namespace ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Namespace ID
     * @param Id Namespace ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Namespace name 
     * @return Name Namespace name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Namespace name
     * @param Name Namespace name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Monitoring type 
     * @return MonitorType Monitoring type
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitoring type
     * @param MonitorType Monitoring type
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Dimension information 
     * @return Dimensions Dimension information
     */
    public DimensionNew [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimension information
     * @param Dimensions Dimension information
     */
    public void setDimensions(DimensionNew [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public CommonNamespaceNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonNamespaceNew(CommonNamespaceNew source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DimensionNew[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DimensionNew(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

