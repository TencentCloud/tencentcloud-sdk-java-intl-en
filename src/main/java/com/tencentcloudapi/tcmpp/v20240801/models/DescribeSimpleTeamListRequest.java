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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSimpleTeamListRequest extends AbstractModel {

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Team permission type 1. Mini program management 2 Application management
    */
    @SerializedName("TeamRoleTypeList")
    @Expose
    private Long [] TeamRoleTypeList;

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Team permission type 1. Mini program management 2 Application management 
     * @return TeamRoleTypeList Team permission type 1. Mini program management 2 Application management
     */
    public Long [] getTeamRoleTypeList() {
        return this.TeamRoleTypeList;
    }

    /**
     * Set Team permission type 1. Mini program management 2 Application management
     * @param TeamRoleTypeList Team permission type 1. Mini program management 2 Application management
     */
    public void setTeamRoleTypeList(Long [] TeamRoleTypeList) {
        this.TeamRoleTypeList = TeamRoleTypeList;
    }

    public DescribeSimpleTeamListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSimpleTeamListRequest(DescribeSimpleTeamListRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.TeamRoleTypeList != null) {
            this.TeamRoleTypeList = new Long[source.TeamRoleTypeList.length];
            for (int i = 0; i < source.TeamRoleTypeList.length; i++) {
                this.TeamRoleTypeList[i] = new Long(source.TeamRoleTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamArraySimple(map, prefix + "TeamRoleTypeList.", this.TeamRoleTypeList);

    }
}

