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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigData extends AbstractModel {

    /**
    * Configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * List of associated applications
    */
    @SerializedName("RelatedApplications")
    @Expose
    private TemService [] RelatedApplications;

    /**
    * Configuration item
    */
    @SerializedName("Data")
    @Expose
    private Pair [] Data;

    /**
     * Get Configuration name 
     * @return Name Configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Configuration name
     * @param Name Configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get List of associated applications 
     * @return RelatedApplications List of associated applications
     */
    public TemService [] getRelatedApplications() {
        return this.RelatedApplications;
    }

    /**
     * Set List of associated applications
     * @param RelatedApplications List of associated applications
     */
    public void setRelatedApplications(TemService [] RelatedApplications) {
        this.RelatedApplications = RelatedApplications;
    }

    /**
     * Get Configuration item 
     * @return Data Configuration item
     */
    public Pair [] getData() {
        return this.Data;
    }

    /**
     * Set Configuration item
     * @param Data Configuration item
     */
    public void setData(Pair [] Data) {
        this.Data = Data;
    }

    public ConfigData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigData(ConfigData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RelatedApplications != null) {
            this.RelatedApplications = new TemService[source.RelatedApplications.length];
            for (int i = 0; i < source.RelatedApplications.length; i++) {
                this.RelatedApplications[i] = new TemService(source.RelatedApplications[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new Pair[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Pair(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "RelatedApplications.", this.RelatedApplications);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

