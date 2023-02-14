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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeployListRequest extends AbstractModel{

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The start.
    */
    @SerializedName("DisplayStart")
    @Expose
    private Long DisplayStart;

    /**
    * The maximum number of records to return.
    */
    @SerializedName("DisplayLength")
    @Expose
    private Long DisplayLength;

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The start. 
     * @return DisplayStart The start.
     */
    public Long getDisplayStart() {
        return this.DisplayStart;
    }

    /**
     * Set The start.
     * @param DisplayStart The start.
     */
    public void setDisplayStart(Long DisplayStart) {
        this.DisplayStart = DisplayStart;
    }

    /**
     * Get The maximum number of records to return. 
     * @return DisplayLength The maximum number of records to return.
     */
    public Long getDisplayLength() {
        return this.DisplayLength;
    }

    /**
     * Set The maximum number of records to return.
     * @param DisplayLength The maximum number of records to return.
     */
    public void setDisplayLength(Long DisplayLength) {
        this.DisplayLength = DisplayLength;
    }

    public GetDeployListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeployListRequest(GetDeployListRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.DisplayStart != null) {
            this.DisplayStart = new Long(source.DisplayStart);
        }
        if (source.DisplayLength != null) {
            this.DisplayLength = new Long(source.DisplayLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DisplayStart", this.DisplayStart);
        this.setParamSimple(map, prefix + "DisplayLength", this.DisplayLength);

    }
}

