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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupHealthStatus extends AbstractModel {

    /**
    * Origin server group ID.
    */
    @SerializedName("OriginGroupID")
    @Expose
    private String OriginGroupID;

    /**
    * Origin server group name.
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * Origin server group type. Valid values:
<li>HTTP: HTTP-specific.</li>
<li>GENERAL: general.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Priority.
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * Health status of each origin server in an origin server group.
    */
    @SerializedName("OriginHealthStatus")
    @Expose
    private OriginHealthStatus [] OriginHealthStatus;

    /**
     * Get Origin server group ID. 
     * @return OriginGroupID Origin server group ID.
     */
    public String getOriginGroupID() {
        return this.OriginGroupID;
    }

    /**
     * Set Origin server group ID.
     * @param OriginGroupID Origin server group ID.
     */
    public void setOriginGroupID(String OriginGroupID) {
        this.OriginGroupID = OriginGroupID;
    }

    /**
     * Get Origin server group name. 
     * @return OriginGroupName Origin server group name.
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set Origin server group name.
     * @param OriginGroupName Origin server group name.
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get Origin server group type. Valid values:
<li>HTTP: HTTP-specific.</li>
<li>GENERAL: general.</li> 
     * @return OriginType Origin server group type. Valid values:
<li>HTTP: HTTP-specific.</li>
<li>GENERAL: general.</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server group type. Valid values:
<li>HTTP: HTTP-specific.</li>
<li>GENERAL: general.</li>
     * @param OriginType Origin server group type. Valid values:
<li>HTTP: HTTP-specific.</li>
<li>GENERAL: general.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Priority. 
     * @return Priority Priority.
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority.
     * @param Priority Priority.
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Health status of each origin server in an origin server group. 
     * @return OriginHealthStatus Health status of each origin server in an origin server group.
     */
    public OriginHealthStatus [] getOriginHealthStatus() {
        return this.OriginHealthStatus;
    }

    /**
     * Set Health status of each origin server in an origin server group.
     * @param OriginHealthStatus Health status of each origin server in an origin server group.
     */
    public void setOriginHealthStatus(OriginHealthStatus [] OriginHealthStatus) {
        this.OriginHealthStatus = OriginHealthStatus;
    }

    public OriginGroupHealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupHealthStatus(OriginGroupHealthStatus source) {
        if (source.OriginGroupID != null) {
            this.OriginGroupID = new String(source.OriginGroupID);
        }
        if (source.OriginGroupName != null) {
            this.OriginGroupName = new String(source.OriginGroupName);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.OriginHealthStatus != null) {
            this.OriginHealthStatus = new OriginHealthStatus[source.OriginHealthStatus.length];
            for (int i = 0; i < source.OriginHealthStatus.length; i++) {
                this.OriginHealthStatus[i] = new OriginHealthStatus(source.OriginHealthStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginGroupID", this.OriginGroupID);
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "OriginHealthStatus.", this.OriginHealthStatus);

    }
}

