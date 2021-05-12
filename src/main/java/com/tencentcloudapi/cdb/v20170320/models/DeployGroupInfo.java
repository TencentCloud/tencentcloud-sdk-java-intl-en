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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployGroupInfo extends AbstractModel{

    /**
    * ID of a placement group.
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * Name of a placement group.
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance quota of placement group, indicating the maximum number of instances that can be placed in one placement group.
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * Affinity policy of placement group. Currently, only policy 1 is supported, indicating to distribute instances across physical machines.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Affinity")
    @Expose
    private String Affinity;

    /**
    * Upper limit of instances in one placement group on one physical machine as defined in affinity policy 1 of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LimitNum")
    @Expose
    private Long LimitNum;

    /**
    * Placement group details.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Physical model attribute of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DevClass")
    @Expose
    private String DevClass;

    /**
     * Get ID of a placement group. 
     * @return DeployGroupId ID of a placement group.
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set ID of a placement group.
     * @param DeployGroupId ID of a placement group.
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get Name of a placement group. 
     * @return DeployGroupName Name of a placement group.
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set Name of a placement group.
     * @param DeployGroupName Name of a placement group.
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance quota of placement group, indicating the maximum number of instances that can be placed in one placement group. 
     * @return Quota Instance quota of placement group, indicating the maximum number of instances that can be placed in one placement group.
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set Instance quota of placement group, indicating the maximum number of instances that can be placed in one placement group.
     * @param Quota Instance quota of placement group, indicating the maximum number of instances that can be placed in one placement group.
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Get Affinity policy of placement group. Currently, only policy 1 is supported, indicating to distribute instances across physical machines.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Affinity Affinity policy of placement group. Currently, only policy 1 is supported, indicating to distribute instances across physical machines.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAffinity() {
        return this.Affinity;
    }

    /**
     * Set Affinity policy of placement group. Currently, only policy 1 is supported, indicating to distribute instances across physical machines.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Affinity Affinity policy of placement group. Currently, only policy 1 is supported, indicating to distribute instances across physical machines.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAffinity(String Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get Upper limit of instances in one placement group on one physical machine as defined in affinity policy 1 of placement group.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LimitNum Upper limit of instances in one placement group on one physical machine as defined in affinity policy 1 of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLimitNum() {
        return this.LimitNum;
    }

    /**
     * Set Upper limit of instances in one placement group on one physical machine as defined in affinity policy 1 of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LimitNum Upper limit of instances in one placement group on one physical machine as defined in affinity policy 1 of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLimitNum(Long LimitNum) {
        this.LimitNum = LimitNum;
    }

    /**
     * Get Placement group details. 
     * @return Description Placement group details.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Placement group details.
     * @param Description Placement group details.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Physical model attribute of placement group.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DevClass Physical model attribute of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDevClass() {
        return this.DevClass;
    }

    /**
     * Set Physical model attribute of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DevClass Physical model attribute of placement group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDevClass(String DevClass) {
        this.DevClass = DevClass;
    }

    public DeployGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployGroupInfo(DeployGroupInfo source) {
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.DeployGroupName != null) {
            this.DeployGroupName = new String(source.DeployGroupName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.Affinity != null) {
            this.Affinity = new String(source.Affinity);
        }
        if (source.LimitNum != null) {
            this.LimitNum = new Long(source.LimitNum);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DevClass != null) {
            this.DevClass = new String(source.DevClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);
        this.setParamSimple(map, prefix + "LimitNum", this.LimitNum);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DevClass", this.DevClass);

    }
}

