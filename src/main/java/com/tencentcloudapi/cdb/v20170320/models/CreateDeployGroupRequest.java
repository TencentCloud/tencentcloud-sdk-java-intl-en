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

public class CreateDeployGroupRequest extends AbstractModel{

    /**
    * Name of a placement group, which can contain up to 60 characters.
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * Description of a placement group, which can contain up to 200 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Affinity policy of placement group. Currently, the value of this parameter can only be 1. Policy 1 indicates the upper limit of instances on one physical machine.
    */
    @SerializedName("Affinity")
    @Expose
    private Long [] Affinity;

    /**
    * Upper limit of instances on one physical machine as defined in affinity policy 1 of placement group.
    */
    @SerializedName("LimitNum")
    @Expose
    private Long LimitNum;

    /**
    * Model attribute of placement group. Valid values: SH12+SH02, TS85.
    */
    @SerializedName("DevClass")
    @Expose
    private String [] DevClass;

    /**
     * Get Name of a placement group, which can contain up to 60 characters. 
     * @return DeployGroupName Name of a placement group, which can contain up to 60 characters.
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set Name of a placement group, which can contain up to 60 characters.
     * @param DeployGroupName Name of a placement group, which can contain up to 60 characters.
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get Description of a placement group, which can contain up to 200 characters. 
     * @return Description Description of a placement group, which can contain up to 200 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of a placement group, which can contain up to 200 characters.
     * @param Description Description of a placement group, which can contain up to 200 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Affinity policy of placement group. Currently, the value of this parameter can only be 1. Policy 1 indicates the upper limit of instances on one physical machine. 
     * @return Affinity Affinity policy of placement group. Currently, the value of this parameter can only be 1. Policy 1 indicates the upper limit of instances on one physical machine.
     */
    public Long [] getAffinity() {
        return this.Affinity;
    }

    /**
     * Set Affinity policy of placement group. Currently, the value of this parameter can only be 1. Policy 1 indicates the upper limit of instances on one physical machine.
     * @param Affinity Affinity policy of placement group. Currently, the value of this parameter can only be 1. Policy 1 indicates the upper limit of instances on one physical machine.
     */
    public void setAffinity(Long [] Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get Upper limit of instances on one physical machine as defined in affinity policy 1 of placement group. 
     * @return LimitNum Upper limit of instances on one physical machine as defined in affinity policy 1 of placement group.
     */
    public Long getLimitNum() {
        return this.LimitNum;
    }

    /**
     * Set Upper limit of instances on one physical machine as defined in affinity policy 1 of placement group.
     * @param LimitNum Upper limit of instances on one physical machine as defined in affinity policy 1 of placement group.
     */
    public void setLimitNum(Long LimitNum) {
        this.LimitNum = LimitNum;
    }

    /**
     * Get Model attribute of placement group. Valid values: SH12+SH02, TS85. 
     * @return DevClass Model attribute of placement group. Valid values: SH12+SH02, TS85.
     */
    public String [] getDevClass() {
        return this.DevClass;
    }

    /**
     * Set Model attribute of placement group. Valid values: SH12+SH02, TS85.
     * @param DevClass Model attribute of placement group. Valid values: SH12+SH02, TS85.
     */
    public void setDevClass(String [] DevClass) {
        this.DevClass = DevClass;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Affinity.", this.Affinity);
        this.setParamSimple(map, prefix + "LimitNum", this.LimitNum);
        this.setParamArraySimple(map, prefix + "DevClass.", this.DevClass);

    }
}

