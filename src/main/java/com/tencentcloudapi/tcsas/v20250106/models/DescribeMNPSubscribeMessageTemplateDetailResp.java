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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPSubscribeMessageTemplateDetailResp extends AbstractModel {

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Scenario description.</p>
    */
    @SerializedName("ScenarioDescription")
    @Expose
    private String ScenarioDescription;

    /**
    * <p>Subscription message template information.</p>
    */
    @SerializedName("TemplateInfo")
    @Expose
    private MNPSubscribeMessageTemplateDetailResp TemplateInfo;

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Scenario description.</p> 
     * @return ScenarioDescription <p>Scenario description.</p>
     */
    public String getScenarioDescription() {
        return this.ScenarioDescription;
    }

    /**
     * Set <p>Scenario description.</p>
     * @param ScenarioDescription <p>Scenario description.</p>
     */
    public void setScenarioDescription(String ScenarioDescription) {
        this.ScenarioDescription = ScenarioDescription;
    }

    /**
     * Get <p>Subscription message template information.</p> 
     * @return TemplateInfo <p>Subscription message template information.</p>
     */
    public MNPSubscribeMessageTemplateDetailResp getTemplateInfo() {
        return this.TemplateInfo;
    }

    /**
     * Set <p>Subscription message template information.</p>
     * @param TemplateInfo <p>Subscription message template information.</p>
     */
    public void setTemplateInfo(MNPSubscribeMessageTemplateDetailResp TemplateInfo) {
        this.TemplateInfo = TemplateInfo;
    }

    public DescribeMNPSubscribeMessageTemplateDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPSubscribeMessageTemplateDetailResp(DescribeMNPSubscribeMessageTemplateDetailResp source) {
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScenarioDescription != null) {
            this.ScenarioDescription = new String(source.ScenarioDescription);
        }
        if (source.TemplateInfo != null) {
            this.TemplateInfo = new MNPSubscribeMessageTemplateDetailResp(source.TemplateInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScenarioDescription", this.ScenarioDescription);
        this.setParamObj(map, prefix + "TemplateInfo.", this.TemplateInfo);

    }
}

