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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDashboardRequest extends AbstractModel {

    /**
    * dashboard name
    */
    @SerializedName("DashboardName")
    @Expose
    private String DashboardName;

    /**
    * Dashboard configuration data
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * List of tag descriptions. When you specify this parameter, tags can be bound to the corresponding log topic at the same time. It supports up to 10 tag key-value pairs, and one resource can only be bound to one tag key.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get dashboard name 
     * @return DashboardName dashboard name
     */
    public String getDashboardName() {
        return this.DashboardName;
    }

    /**
     * Set dashboard name
     * @param DashboardName dashboard name
     */
    public void setDashboardName(String DashboardName) {
        this.DashboardName = DashboardName;
    }

    /**
     * Get Dashboard configuration data 
     * @return Data Dashboard configuration data
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Dashboard configuration data
     * @param Data Dashboard configuration data
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get List of tag descriptions. When you specify this parameter, tags can be bound to the corresponding log topic at the same time. It supports up to 10 tag key-value pairs, and one resource can only be bound to one tag key. 
     * @return Tags List of tag descriptions. When you specify this parameter, tags can be bound to the corresponding log topic at the same time. It supports up to 10 tag key-value pairs, and one resource can only be bound to one tag key.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tag descriptions. When you specify this parameter, tags can be bound to the corresponding log topic at the same time. It supports up to 10 tag key-value pairs, and one resource can only be bound to one tag key.
     * @param Tags List of tag descriptions. When you specify this parameter, tags can be bound to the corresponding log topic at the same time. It supports up to 10 tag key-value pairs, and one resource can only be bound to one tag key.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDashboardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDashboardRequest(CreateDashboardRequest source) {
        if (source.DashboardName != null) {
            this.DashboardName = new String(source.DashboardName);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DashboardName", this.DashboardName);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

