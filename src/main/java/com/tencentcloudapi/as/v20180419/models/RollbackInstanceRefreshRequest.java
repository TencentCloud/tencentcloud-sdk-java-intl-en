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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackInstanceRefreshRequest extends AbstractModel {

    /**
    * Scaling group ID. you can obtain available scaling group ids in the following ways. 
<li>Query the scaling group ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Refresh settings.
    */
    @SerializedName("RefreshSettings")
    @Expose
    private RefreshSettings RefreshSettings;

    /**
    * The original refresh activity ID. you can obtain the original refresh activity ID by calling the api [DescribeRefreshActivities](https://intl.cloud.tencent.com/document/api/377/99175?from_cn_redirect=1) and retrieving the OriginRefreshActivityId from the returned information.
    */
    @SerializedName("OriginRefreshActivityId")
    @Expose
    private String OriginRefreshActivityId;

    /**
    * Refresh mode, currently, only rolling updates are supported, with the default value being ROLLING_UPDATE_RESET.
    */
    @SerializedName("RefreshMode")
    @Expose
    private String RefreshMode;

    /**
     * Get Scaling group ID. you can obtain available scaling group ids in the following ways. 
<li>Query the scaling group ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>. 
     * @return AutoScalingGroupId Scaling group ID. you can obtain available scaling group ids in the following ways. 
<li>Query the scaling group ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID. you can obtain available scaling group ids in the following ways. 
<li>Query the scaling group ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
     * @param AutoScalingGroupId Scaling group ID. you can obtain available scaling group ids in the following ways. 
<li>Query the scaling group ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Refresh settings. 
     * @return RefreshSettings Refresh settings.
     */
    public RefreshSettings getRefreshSettings() {
        return this.RefreshSettings;
    }

    /**
     * Set Refresh settings.
     * @param RefreshSettings Refresh settings.
     */
    public void setRefreshSettings(RefreshSettings RefreshSettings) {
        this.RefreshSettings = RefreshSettings;
    }

    /**
     * Get The original refresh activity ID. you can obtain the original refresh activity ID by calling the api [DescribeRefreshActivities](https://intl.cloud.tencent.com/document/api/377/99175?from_cn_redirect=1) and retrieving the OriginRefreshActivityId from the returned information. 
     * @return OriginRefreshActivityId The original refresh activity ID. you can obtain the original refresh activity ID by calling the api [DescribeRefreshActivities](https://intl.cloud.tencent.com/document/api/377/99175?from_cn_redirect=1) and retrieving the OriginRefreshActivityId from the returned information.
     */
    public String getOriginRefreshActivityId() {
        return this.OriginRefreshActivityId;
    }

    /**
     * Set The original refresh activity ID. you can obtain the original refresh activity ID by calling the api [DescribeRefreshActivities](https://intl.cloud.tencent.com/document/api/377/99175?from_cn_redirect=1) and retrieving the OriginRefreshActivityId from the returned information.
     * @param OriginRefreshActivityId The original refresh activity ID. you can obtain the original refresh activity ID by calling the api [DescribeRefreshActivities](https://intl.cloud.tencent.com/document/api/377/99175?from_cn_redirect=1) and retrieving the OriginRefreshActivityId from the returned information.
     */
    public void setOriginRefreshActivityId(String OriginRefreshActivityId) {
        this.OriginRefreshActivityId = OriginRefreshActivityId;
    }

    /**
     * Get Refresh mode, currently, only rolling updates are supported, with the default value being ROLLING_UPDATE_RESET. 
     * @return RefreshMode Refresh mode, currently, only rolling updates are supported, with the default value being ROLLING_UPDATE_RESET.
     */
    public String getRefreshMode() {
        return this.RefreshMode;
    }

    /**
     * Set Refresh mode, currently, only rolling updates are supported, with the default value being ROLLING_UPDATE_RESET.
     * @param RefreshMode Refresh mode, currently, only rolling updates are supported, with the default value being ROLLING_UPDATE_RESET.
     */
    public void setRefreshMode(String RefreshMode) {
        this.RefreshMode = RefreshMode;
    }

    public RollbackInstanceRefreshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackInstanceRefreshRequest(RollbackInstanceRefreshRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.RefreshSettings != null) {
            this.RefreshSettings = new RefreshSettings(source.RefreshSettings);
        }
        if (source.OriginRefreshActivityId != null) {
            this.OriginRefreshActivityId = new String(source.OriginRefreshActivityId);
        }
        if (source.RefreshMode != null) {
            this.RefreshMode = new String(source.RefreshMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamObj(map, prefix + "RefreshSettings.", this.RefreshSettings);
        this.setParamSimple(map, prefix + "OriginRefreshActivityId", this.OriginRefreshActivityId);
        this.setParamSimple(map, prefix + "RefreshMode", this.RefreshMode);

    }
}

