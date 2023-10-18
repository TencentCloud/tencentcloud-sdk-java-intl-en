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

public class UnBindingPolicyObjectRequest extends AbstractModel {

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Policy group ID. If `PolicyId` is used, this parameter will be ignored, and any value, e.g., `0`, can be passed in.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * List of unique IDs of the object instances to be deleted. `UniqueId` can be obtained from the output parameter `List` of the [DescribeBindingPolicyObjectList](https://intl.cloud.tencent.com/document/api/248/40570?from_cn_redirect=1) API
    */
    @SerializedName("UniqueId")
    @Expose
    private String [] UniqueId;

    /**
    * Instance group ID. The `UniqueId` parameter is invalid if object instances are deleted by instance group.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Alarm policy ID. If this parameter is used, `GroupId` will be ignored.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

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
     * Get The value is fixed to monitor. 
     * @return Module The value is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The value is fixed to monitor.
     * @param Module The value is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Policy group ID. If `PolicyId` is used, this parameter will be ignored, and any value, e.g., `0`, can be passed in. 
     * @return GroupId Policy group ID. If `PolicyId` is used, this parameter will be ignored, and any value, e.g., `0`, can be passed in.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID. If `PolicyId` is used, this parameter will be ignored, and any value, e.g., `0`, can be passed in.
     * @param GroupId Policy group ID. If `PolicyId` is used, this parameter will be ignored, and any value, e.g., `0`, can be passed in.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get List of unique IDs of the object instances to be deleted. `UniqueId` can be obtained from the output parameter `List` of the [DescribeBindingPolicyObjectList](https://intl.cloud.tencent.com/document/api/248/40570?from_cn_redirect=1) API 
     * @return UniqueId List of unique IDs of the object instances to be deleted. `UniqueId` can be obtained from the output parameter `List` of the [DescribeBindingPolicyObjectList](https://intl.cloud.tencent.com/document/api/248/40570?from_cn_redirect=1) API
     */
    public String [] getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set List of unique IDs of the object instances to be deleted. `UniqueId` can be obtained from the output parameter `List` of the [DescribeBindingPolicyObjectList](https://intl.cloud.tencent.com/document/api/248/40570?from_cn_redirect=1) API
     * @param UniqueId List of unique IDs of the object instances to be deleted. `UniqueId` can be obtained from the output parameter `List` of the [DescribeBindingPolicyObjectList](https://intl.cloud.tencent.com/document/api/248/40570?from_cn_redirect=1) API
     */
    public void setUniqueId(String [] UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get Instance group ID. The `UniqueId` parameter is invalid if object instances are deleted by instance group. 
     * @return InstanceGroupId Instance group ID. The `UniqueId` parameter is invalid if object instances are deleted by instance group.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID. The `UniqueId` parameter is invalid if object instances are deleted by instance group.
     * @param InstanceGroupId Instance group ID. The `UniqueId` parameter is invalid if object instances are deleted by instance group.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Alarm policy ID. If this parameter is used, `GroupId` will be ignored. 
     * @return PolicyId Alarm policy ID. If this parameter is used, `GroupId` will be ignored.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID. If this parameter is used, `GroupId` will be ignored.
     * @param PolicyId Alarm policy ID. If this parameter is used, `GroupId` will be ignored.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
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

    public UnBindingPolicyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindingPolicyObjectRequest(UnBindingPolicyObjectRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String[source.UniqueId.length];
            for (int i = 0; i < source.UniqueId.length; i++) {
                this.UniqueId[i] = new String(source.UniqueId[i]);
            }
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
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
        this.setParamArraySimple(map, prefix + "UniqueId.", this.UniqueId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "EbSubject", this.EbSubject);
        this.setParamSimple(map, prefix + "EbEventFlag", this.EbEventFlag);

    }
}

