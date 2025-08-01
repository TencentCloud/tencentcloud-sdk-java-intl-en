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

public class ModifyCosRechargeRequest extends AbstractModel {

    /**
    * COS import configuration ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * ID of the log topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * COS import task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get COS import configuration ID. 
     * @return Id COS import configuration ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS import configuration ID.
     * @param Id COS import configuration ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get ID of the log topic. 
     * @return TopicId ID of the log topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic.
     * @param TopicId ID of the log topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get COS import task name. 
     * @return Name COS import task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS import task name.
     * @param Name COS import task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled 
     * @return Enable Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
     * @param Enable Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosRechargeRequest(ModifyCosRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

