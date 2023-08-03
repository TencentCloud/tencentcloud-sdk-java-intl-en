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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPGroup extends AbstractModel{

    /**
    * Group ID. Enter `0`.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IP group information, including IP and IP mask.
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
     * Get Group ID. Enter `0`. 
     * @return GroupId Group ID. Enter `0`.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID. Enter `0`.
     * @param GroupId Group ID. Enter `0`.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name. 
     * @return Name Group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Group name.
     * @param Name Group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IP group information, including IP and IP mask. 
     * @return Content IP group information, including IP and IP mask.
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set IP group information, including IP and IP mask.
     * @param Content IP group information, including IP and IP mask.
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    public IPGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPGroup(IPGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);

    }
}

