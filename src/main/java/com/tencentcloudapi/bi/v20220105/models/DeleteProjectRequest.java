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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteProjectRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Random number.
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * Default dashboard.
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
     * Get Project ID. 
     * @return Id Project ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Project ID.
     * @param Id Project ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Random number. 
     * @return Seed Random number.
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set Random number.
     * @param Seed Random number.
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get Default dashboard. 
     * @return DefaultPanelType Default dashboard.
     */
    public Long getDefaultPanelType() {
        return this.DefaultPanelType;
    }

    /**
     * Set Default dashboard.
     * @param DefaultPanelType Default dashboard.
     */
    public void setDefaultPanelType(Long DefaultPanelType) {
        this.DefaultPanelType = DefaultPanelType;
    }

    public DeleteProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProjectRequest(DeleteProjectRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.DefaultPanelType != null) {
            this.DefaultPanelType = new Long(source.DefaultPanelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);

    }
}

