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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpsTaskLinkInfoDto extends AbstractModel {

    /**
    * Downstream task ID
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * Upstream task ID
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * Dependency Edge Type 1,"real_real" indicates task->task; 2, "virtual_real" crossed workflow task->task
    */
    @SerializedName("LinkType")
    @Expose
    private String LinkType;

    /**
    * Dependency Edge ID
    */
    @SerializedName("LinkId")
    @Expose
    private String LinkId;

    /**
    * To distinguish newly added cyclic dependency. Default is normal, for cyclic dependency it is circulate
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LinkStyle")
    @Expose
    private String LinkStyle;

    /**
     * Get Downstream task ID 
     * @return TaskTo Downstream task ID
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set Downstream task ID
     * @param TaskTo Downstream task ID
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get Upstream task ID 
     * @return TaskFrom Upstream task ID
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set Upstream task ID
     * @param TaskFrom Upstream task ID
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get Dependency Edge Type 1,"real_real" indicates task->task; 2, "virtual_real" crossed workflow task->task 
     * @return LinkType Dependency Edge Type 1,"real_real" indicates task->task; 2, "virtual_real" crossed workflow task->task
     */
    public String getLinkType() {
        return this.LinkType;
    }

    /**
     * Set Dependency Edge Type 1,"real_real" indicates task->task; 2, "virtual_real" crossed workflow task->task
     * @param LinkType Dependency Edge Type 1,"real_real" indicates task->task; 2, "virtual_real" crossed workflow task->task
     */
    public void setLinkType(String LinkType) {
        this.LinkType = LinkType;
    }

    /**
     * Get Dependency Edge ID 
     * @return LinkId Dependency Edge ID
     */
    public String getLinkId() {
        return this.LinkId;
    }

    /**
     * Set Dependency Edge ID
     * @param LinkId Dependency Edge ID
     */
    public void setLinkId(String LinkId) {
        this.LinkId = LinkId;
    }

    /**
     * Get To distinguish newly added cyclic dependency. Default is normal, for cyclic dependency it is circulate
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LinkStyle To distinguish newly added cyclic dependency. Default is normal, for cyclic dependency it is circulate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLinkStyle() {
        return this.LinkStyle;
    }

    /**
     * Set To distinguish newly added cyclic dependency. Default is normal, for cyclic dependency it is circulate
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LinkStyle To distinguish newly added cyclic dependency. Default is normal, for cyclic dependency it is circulate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLinkStyle(String LinkStyle) {
        this.LinkStyle = LinkStyle;
    }

    public OpsTaskLinkInfoDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsTaskLinkInfoDto(OpsTaskLinkInfoDto source) {
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.LinkType != null) {
            this.LinkType = new String(source.LinkType);
        }
        if (source.LinkId != null) {
            this.LinkId = new String(source.LinkId);
        }
        if (source.LinkStyle != null) {
            this.LinkStyle = new String(source.LinkStyle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "LinkType", this.LinkType);
        this.setParamSimple(map, prefix + "LinkId", this.LinkId);
        this.setParamSimple(map, prefix + "LinkStyle", this.LinkStyle);

    }
}

