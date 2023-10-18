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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindingPolicyObjectRequest extends AbstractModel {

    /**
    * Required. The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy group ID, such as `4739573`. This parameter will be disused soon. Another parameter `PolicyId` is recommended.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Alarm policy ID, such as `policy-gh892hg0`. At least one of the two parameters, `PolicyId` and `GroupId`, must be specified; otherwise, an error will be reported. `PolicyId` is preferred over `GroupId` when both of them are specified.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Instance group ID.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Dimensions of an object to be bound.
    */
    @SerializedName("Dimensions")
    @Expose
    private BindingPolicyObjectDimension [] Dimensions;

    /**
    * The alert configured for an event
    */
    @SerializedName("EbSubject")
    @Expose
    private String EbSubject;

    /**
    * Whether the event alert has been configured
    */
    @SerializedName("EbEventFlag")
    @Expose
    private Long EbEventFlag;

    /**
     * Get Required. The value is fixed to monitor. 
     * @return Module Required. The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Required. The value is fixed to monitor.
     * @param Module Required. The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Policy group ID, such as `4739573`. This parameter will be disused soon. Another parameter `PolicyId` is recommended. 
     * @return GroupId Policy group ID, such as `4739573`. This parameter will be disused soon. Another parameter `PolicyId` is recommended.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID, such as `4739573`. This parameter will be disused soon. Another parameter `PolicyId` is recommended.
     * @param GroupId Policy group ID, such as `4739573`. This parameter will be disused soon. Another parameter `PolicyId` is recommended.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Alarm policy ID, such as `policy-gh892hg0`. At least one of the two parameters, `PolicyId` and `GroupId`, must be specified; otherwise, an error will be reported. `PolicyId` is preferred over `GroupId` when both of them are specified. 
     * @return PolicyId Alarm policy ID, such as `policy-gh892hg0`. At least one of the two parameters, `PolicyId` and `GroupId`, must be specified; otherwise, an error will be reported. `PolicyId` is preferred over `GroupId` when both of them are specified.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID, such as `policy-gh892hg0`. At least one of the two parameters, `PolicyId` and `GroupId`, must be specified; otherwise, an error will be reported. `PolicyId` is preferred over `GroupId` when both of them are specified.
     * @param PolicyId Alarm policy ID, such as `policy-gh892hg0`. At least one of the two parameters, `PolicyId` and `GroupId`, must be specified; otherwise, an error will be reported. `PolicyId` is preferred over `GroupId` when both of them are specified.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Instance group ID. 
     * @return InstanceGroupId Instance group ID.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID.
     * @param InstanceGroupId Instance group ID.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Dimensions of an object to be bound. 
     * @return Dimensions Dimensions of an object to be bound.
     */
    public BindingPolicyObjectDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimensions of an object to be bound.
     * @param Dimensions Dimensions of an object to be bound.
     */
    public void setDimensions(BindingPolicyObjectDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get The alert configured for an event 
     * @return EbSubject The alert configured for an event
     */
    public String getEbSubject() {
        return this.EbSubject;
    }

    /**
     * Set The alert configured for an event
     * @param EbSubject The alert configured for an event
     */
    public void setEbSubject(String EbSubject) {
        this.EbSubject = EbSubject;
    }

    /**
     * Get Whether the event alert has been configured 
     * @return EbEventFlag Whether the event alert has been configured
     */
    public Long getEbEventFlag() {
        return this.EbEventFlag;
    }

    /**
     * Set Whether the event alert has been configured
     * @param EbEventFlag Whether the event alert has been configured
     */
    public void setEbEventFlag(Long EbEventFlag) {
        this.EbEventFlag = EbEventFlag;
    }

    public BindingPolicyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingPolicyObjectRequest(BindingPolicyObjectRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new BindingPolicyObjectDimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new BindingPolicyObjectDimension(source.Dimensions[i]);
            }
        }
        if (source.EbSubject != null) {
            this.EbSubject = new String(source.EbSubject);
        }
        if (source.EbEventFlag != null) {
            this.EbEventFlag = new Long(source.EbEventFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "EbSubject", this.EbSubject);
        this.setParamSimple(map, prefix + "EbEventFlag", this.EbEventFlag);

    }
}

