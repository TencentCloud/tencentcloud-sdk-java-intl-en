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

public class DescribePolicyGroupListRequest extends AbstractModel {

    /**
    * The value is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Number of parameters that can be returned on each page. Value range: 1 - 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Parameter offset on each page. The value starts from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Search by policy name.
    */
    @SerializedName("Like")
    @Expose
    private String Like;

    /**
    * Instance group ID.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Sort by update time. Valid values: asc and desc.
    */
    @SerializedName("UpdateTimeOrder")
    @Expose
    private String UpdateTimeOrder;

    /**
    * Project ID list.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * List of alarm policy types.
    */
    @SerializedName("ViewNames")
    @Expose
    private String [] ViewNames;

    /**
    * Whether to filter policy groups without recipients. The value 1 indicates that policy groups without recipients will be filtered. The value 0 indicates that policy groups without recipients will not be filtered.
    */
    @SerializedName("FilterUnuseReceiver")
    @Expose
    private Long FilterUnuseReceiver;

    /**
    * Filter by recipient group.
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * Filter by recipient.
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private String [] ReceiverUserList;

    /**
    * Dimension set field (json string), for example, [[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]].
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * Template-based policy group IDs, which are separated by commas.
    */
    @SerializedName("ConditionTempGroupId")
    @Expose
    private String ConditionTempGroupId;

    /**
    * Filter by recipient or recipient group. The value 'user' indicates by recipient. The value 'group' indicates by recipient group.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Filter conditions. Whether the alarm policy has been enabled or disabled
    */
    @SerializedName("IsOpen")
    @Expose
    private Boolean IsOpen;

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
     * Get Number of parameters that can be returned on each page. Value range: 1 - 100. 
     * @return Limit Number of parameters that can be returned on each page. Value range: 1 - 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of parameters that can be returned on each page. Value range: 1 - 100.
     * @param Limit Number of parameters that can be returned on each page. Value range: 1 - 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Parameter offset on each page. The value starts from 0. 
     * @return Offset Parameter offset on each page. The value starts from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Parameter offset on each page. The value starts from 0.
     * @param Offset Parameter offset on each page. The value starts from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Search by policy name. 
     * @return Like Search by policy name.
     */
    public String getLike() {
        return this.Like;
    }

    /**
     * Set Search by policy name.
     * @param Like Search by policy name.
     */
    public void setLike(String Like) {
        this.Like = Like;
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
     * Get Sort by update time. Valid values: asc and desc. 
     * @return UpdateTimeOrder Sort by update time. Valid values: asc and desc.
     */
    public String getUpdateTimeOrder() {
        return this.UpdateTimeOrder;
    }

    /**
     * Set Sort by update time. Valid values: asc and desc.
     * @param UpdateTimeOrder Sort by update time. Valid values: asc and desc.
     */
    public void setUpdateTimeOrder(String UpdateTimeOrder) {
        this.UpdateTimeOrder = UpdateTimeOrder;
    }

    /**
     * Get Project ID list. 
     * @return ProjectIds Project ID list.
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID list.
     * @param ProjectIds Project ID list.
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get List of alarm policy types. 
     * @return ViewNames List of alarm policy types.
     */
    public String [] getViewNames() {
        return this.ViewNames;
    }

    /**
     * Set List of alarm policy types.
     * @param ViewNames List of alarm policy types.
     */
    public void setViewNames(String [] ViewNames) {
        this.ViewNames = ViewNames;
    }

    /**
     * Get Whether to filter policy groups without recipients. The value 1 indicates that policy groups without recipients will be filtered. The value 0 indicates that policy groups without recipients will not be filtered. 
     * @return FilterUnuseReceiver Whether to filter policy groups without recipients. The value 1 indicates that policy groups without recipients will be filtered. The value 0 indicates that policy groups without recipients will not be filtered.
     */
    public Long getFilterUnuseReceiver() {
        return this.FilterUnuseReceiver;
    }

    /**
     * Set Whether to filter policy groups without recipients. The value 1 indicates that policy groups without recipients will be filtered. The value 0 indicates that policy groups without recipients will not be filtered.
     * @param FilterUnuseReceiver Whether to filter policy groups without recipients. The value 1 indicates that policy groups without recipients will be filtered. The value 0 indicates that policy groups without recipients will not be filtered.
     */
    public void setFilterUnuseReceiver(Long FilterUnuseReceiver) {
        this.FilterUnuseReceiver = FilterUnuseReceiver;
    }

    /**
     * Get Filter by recipient group. 
     * @return Receivers Filter by recipient group.
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Filter by recipient group.
     * @param Receivers Filter by recipient group.
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Filter by recipient. 
     * @return ReceiverUserList Filter by recipient.
     */
    public String [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set Filter by recipient.
     * @param ReceiverUserList Filter by recipient.
     */
    public void setReceiverUserList(String [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get Dimension set field (json string), for example, [[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]]. 
     * @return Dimensions Dimension set field (json string), for example, [[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]].
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimension set field (json string), for example, [[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]].
     * @param Dimensions Dimension set field (json string), for example, [[{"name":"unInstanceId","value":"ins-6e4b2aaa"}]].
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Template-based policy group IDs, which are separated by commas. 
     * @return ConditionTempGroupId Template-based policy group IDs, which are separated by commas.
     */
    public String getConditionTempGroupId() {
        return this.ConditionTempGroupId;
    }

    /**
     * Set Template-based policy group IDs, which are separated by commas.
     * @param ConditionTempGroupId Template-based policy group IDs, which are separated by commas.
     */
    public void setConditionTempGroupId(String ConditionTempGroupId) {
        this.ConditionTempGroupId = ConditionTempGroupId;
    }

    /**
     * Get Filter by recipient or recipient group. The value 'user' indicates by recipient. The value 'group' indicates by recipient group. 
     * @return ReceiverType Filter by recipient or recipient group. The value 'user' indicates by recipient. The value 'group' indicates by recipient group.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Filter by recipient or recipient group. The value 'user' indicates by recipient. The value 'group' indicates by recipient group.
     * @param ReceiverType Filter by recipient or recipient group. The value 'user' indicates by recipient. The value 'group' indicates by recipient group.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Filter conditions. Whether the alarm policy has been enabled or disabled 
     * @return IsOpen Filter conditions. Whether the alarm policy has been enabled or disabled
     */
    public Boolean getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set Filter conditions. Whether the alarm policy has been enabled or disabled
     * @param IsOpen Filter conditions. Whether the alarm policy has been enabled or disabled
     */
    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    public DescribePolicyGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupListRequest(DescribePolicyGroupListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Like != null) {
            this.Like = new String(source.Like);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.UpdateTimeOrder != null) {
            this.UpdateTimeOrder = new String(source.UpdateTimeOrder);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.ViewNames != null) {
            this.ViewNames = new String[source.ViewNames.length];
            for (int i = 0; i < source.ViewNames.length; i++) {
                this.ViewNames[i] = new String(source.ViewNames[i]);
            }
        }
        if (source.FilterUnuseReceiver != null) {
            this.FilterUnuseReceiver = new Long(source.FilterUnuseReceiver);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.ReceiverUserList != null) {
            this.ReceiverUserList = new String[source.ReceiverUserList.length];
            for (int i = 0; i < source.ReceiverUserList.length; i++) {
                this.ReceiverUserList[i] = new String(source.ReceiverUserList[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.ConditionTempGroupId != null) {
            this.ConditionTempGroupId = new String(source.ConditionTempGroupId);
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Boolean(source.IsOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Like", this.Like);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "UpdateTimeOrder", this.UpdateTimeOrder);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ViewNames.", this.ViewNames);
        this.setParamSimple(map, prefix + "FilterUnuseReceiver", this.FilterUnuseReceiver);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "ConditionTempGroupId", this.ConditionTempGroupId);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);

    }
}

