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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupStatisticsInfo extends AbstractModel{

    /**
    * Connection group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Connection group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * List of connections of a connection group
    */
    @SerializedName("ProxySet")
    @Expose
    private ProxySimpleInfo [] ProxySet;

    /**
     * Get Connection group ID 
     * @return GroupId Connection group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID
     * @param GroupId Connection group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Connection group name 
     * @return GroupName Connection group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Connection group name
     * @param GroupName Connection group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get List of connections of a connection group 
     * @return ProxySet List of connections of a connection group
     */
    public ProxySimpleInfo [] getProxySet() {
        return this.ProxySet;
    }

    /**
     * Set List of connections of a connection group
     * @param ProxySet List of connections of a connection group
     */
    public void setProxySet(ProxySimpleInfo [] ProxySet) {
        this.ProxySet = ProxySet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "ProxySet.", this.ProxySet);

    }
}

