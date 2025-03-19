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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamPackageSSAIChannelRequest extends AbstractModel {

    /**
    * Ad insertion configuration name, globally unique, cannot be repeated.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Content source prefix.
    */
    @SerializedName("ContentSource")
    @Expose
    private String ContentSource;

    /**
    * Ad insertion configuration information
    */
    @SerializedName("SSAIInfo")
    @Expose
    private SSAIConf SSAIInfo;

    /**
    * Ad insertion configuration ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get Ad insertion configuration name, globally unique, cannot be repeated. 
     * @return Name Ad insertion configuration name, globally unique, cannot be repeated.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Ad insertion configuration name, globally unique, cannot be repeated.
     * @param Name Ad insertion configuration name, globally unique, cannot be repeated.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Content source prefix. 
     * @return ContentSource Content source prefix.
     */
    public String getContentSource() {
        return this.ContentSource;
    }

    /**
     * Set Content source prefix.
     * @param ContentSource Content source prefix.
     */
    public void setContentSource(String ContentSource) {
        this.ContentSource = ContentSource;
    }

    /**
     * Get Ad insertion configuration information 
     * @return SSAIInfo Ad insertion configuration information
     */
    public SSAIConf getSSAIInfo() {
        return this.SSAIInfo;
    }

    /**
     * Set Ad insertion configuration information
     * @param SSAIInfo Ad insertion configuration information
     */
    public void setSSAIInfo(SSAIConf SSAIInfo) {
        this.SSAIInfo = SSAIInfo;
    }

    /**
     * Get Ad insertion configuration ID 
     * @return ID Ad insertion configuration ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Ad insertion configuration ID
     * @param ID Ad insertion configuration ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public ModifyStreamPackageSSAIChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageSSAIChannelRequest(ModifyStreamPackageSSAIChannelRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentSource != null) {
            this.ContentSource = new String(source.ContentSource);
        }
        if (source.SSAIInfo != null) {
            this.SSAIInfo = new SSAIConf(source.SSAIInfo);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentSource", this.ContentSource);
        this.setParamObj(map, prefix + "SSAIInfo.", this.SSAIInfo);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

