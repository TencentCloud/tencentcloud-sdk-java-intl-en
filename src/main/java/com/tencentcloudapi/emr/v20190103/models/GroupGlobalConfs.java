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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupGlobalConfs extends AbstractModel {

    /**
    * Scaling group information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupGlobalConf")
    @Expose
    private AutoScaleResourceConf GroupGlobalConf;

    /**
    * Number of nodes scaled out in the current scaling group.
    */
    @SerializedName("CurrentNodes")
    @Expose
    private Long CurrentNodes;

    /**
    * Number of postpaid nodes scaled out in the current scaling group.
    */
    @SerializedName("CurrentPostPaidNodes")
    @Expose
    private Long CurrentPostPaidNodes;

    /**
    * Number of spot instance nodes scaled out in the current scaling group.
    */
    @SerializedName("CurrentSpotPaidNodes")
    @Expose
    private Long CurrentSpotPaidNodes;

    /**
     * Get Scaling group information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupGlobalConf Scaling group information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AutoScaleResourceConf getGroupGlobalConf() {
        return this.GroupGlobalConf;
    }

    /**
     * Set Scaling group information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupGlobalConf Scaling group information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupGlobalConf(AutoScaleResourceConf GroupGlobalConf) {
        this.GroupGlobalConf = GroupGlobalConf;
    }

    /**
     * Get Number of nodes scaled out in the current scaling group. 
     * @return CurrentNodes Number of nodes scaled out in the current scaling group.
     */
    public Long getCurrentNodes() {
        return this.CurrentNodes;
    }

    /**
     * Set Number of nodes scaled out in the current scaling group.
     * @param CurrentNodes Number of nodes scaled out in the current scaling group.
     */
    public void setCurrentNodes(Long CurrentNodes) {
        this.CurrentNodes = CurrentNodes;
    }

    /**
     * Get Number of postpaid nodes scaled out in the current scaling group. 
     * @return CurrentPostPaidNodes Number of postpaid nodes scaled out in the current scaling group.
     */
    public Long getCurrentPostPaidNodes() {
        return this.CurrentPostPaidNodes;
    }

    /**
     * Set Number of postpaid nodes scaled out in the current scaling group.
     * @param CurrentPostPaidNodes Number of postpaid nodes scaled out in the current scaling group.
     */
    public void setCurrentPostPaidNodes(Long CurrentPostPaidNodes) {
        this.CurrentPostPaidNodes = CurrentPostPaidNodes;
    }

    /**
     * Get Number of spot instance nodes scaled out in the current scaling group. 
     * @return CurrentSpotPaidNodes Number of spot instance nodes scaled out in the current scaling group.
     */
    public Long getCurrentSpotPaidNodes() {
        return this.CurrentSpotPaidNodes;
    }

    /**
     * Set Number of spot instance nodes scaled out in the current scaling group.
     * @param CurrentSpotPaidNodes Number of spot instance nodes scaled out in the current scaling group.
     */
    public void setCurrentSpotPaidNodes(Long CurrentSpotPaidNodes) {
        this.CurrentSpotPaidNodes = CurrentSpotPaidNodes;
    }

    public GroupGlobalConfs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupGlobalConfs(GroupGlobalConfs source) {
        if (source.GroupGlobalConf != null) {
            this.GroupGlobalConf = new AutoScaleResourceConf(source.GroupGlobalConf);
        }
        if (source.CurrentNodes != null) {
            this.CurrentNodes = new Long(source.CurrentNodes);
        }
        if (source.CurrentPostPaidNodes != null) {
            this.CurrentPostPaidNodes = new Long(source.CurrentPostPaidNodes);
        }
        if (source.CurrentSpotPaidNodes != null) {
            this.CurrentSpotPaidNodes = new Long(source.CurrentSpotPaidNodes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "GroupGlobalConf.", this.GroupGlobalConf);
        this.setParamSimple(map, prefix + "CurrentNodes", this.CurrentNodes);
        this.setParamSimple(map, prefix + "CurrentPostPaidNodes", this.CurrentPostPaidNodes);
        this.setParamSimple(map, prefix + "CurrentSpotPaidNodes", this.CurrentSpotPaidNodes);

    }
}

